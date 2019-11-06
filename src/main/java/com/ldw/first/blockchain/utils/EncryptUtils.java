package com.ldw.first.blockchain.utils;

import java.security.MessageDigest;

/**
 * @program: blockChain
 * @description:有很多加密算法可供选择，这里使用 SHA256 刚刚好。
 * @author: zxb
 * @create: 2019-11-06 01:41
 **/
public class EncryptUtils {
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
