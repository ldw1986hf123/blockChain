package com.ldw.first.blockchain;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: blockChain
 * @description:
 * @author: zxb
 * @create: 2019-11-06 21:15
 **/
public class Main {
    static List<Block> blockChainList = new ArrayList();

    public static void main(String[] args) {
        blockChainList.add(new Block("Hi i am the first block", "0"));
        blockChainList.add(new Block("Hi i am the second block", blockChainList.get(blockChainList.size() - 1).hash));
        blockChainList.add(new Block("Hi i am the third block", blockChainList.get(blockChainList.size() - 1).hash));
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChainList);
        System.out.println(blockchainJson);
    }

    /*
     *功能描述
     * @author qqg
     * @date 编写一段 isChainValid() 方法。任何块的改变将会导致这个方法失效。
     * @param []
     * @return boolean
     */
    public boolean isValidChildNode() {

        for (int i = 1; i < blockChainList.size(); i++) {
            Block currentBlock=blockChainList.get(i);
            Block preBlock=blockChainList.get(i-1);
        }
    }

}
