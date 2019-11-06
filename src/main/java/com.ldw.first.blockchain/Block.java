package com.ldw.first.blockchain;

import com.google.gson.GsonBuilder;
import com.ldw.first.blockchain.utils.EncryptUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: blockChain
 * @description: 　每个块不仅仅包含它之前的块信息，同时也包含自身。
 * 如果前面一块内容改变了，其 hash 值也会改变，将会导致其后面所有的块发生变化。
 * 通过计算和比较所得的 hash 值，我们可以判断区块链是否合法。
 * 换句话说，改变区块链中的任意内容，将会改变整个区块链的签名。
 * @author: ldw
 * @create: 2019-11-06 01:34
 **/
public class Block {
    public  String hash;
    private String preHash;
    private String data;
    private long timeStamp;

    public Block(String data, String preHash) {
        this.data = data;
        this.preHash = preHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedHash = EncryptUtils.applySha256(preHash + Long.toString(timeStamp) + data);
        return calculatedHash;
    }







}
