/*
 * @projectName studty-web
 * @package com.cjq.springboot.bitcoin
 * @className com.cjq.springboot.bitcoin.SHA256
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.springboot.bitcoin;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA256
 * @description TODO
 * @author chenjunqi
 * @date 2022年01月23日 11:20 上午
 * @version 3.0.0
 */
public class SHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = "chenjunqi";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int i = 0;
        while(true){
            messageDigest.update((str + i).getBytes(StandardCharsets.UTF_8));
            String temp = byte2Hex(messageDigest.digest());

            messageDigest.update(temp.getBytes(StandardCharsets.UTF_8));
            String result = byte2Hex(messageDigest.digest());
            if(result.startsWith("00000")){
                System.out.println(i);
                System.out.println(result);
                break;
            }
            i++;
        }
    }

    private static String byte2Hex(byte[] bytes){
        StringBuilder stringBuffer = new StringBuilder();
        String temp;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
