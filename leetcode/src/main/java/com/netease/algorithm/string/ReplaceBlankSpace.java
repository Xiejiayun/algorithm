package com.netease.algorithm.string;

/**
 * Created by hzxiejiayun on 2018/3/14
 */
public class ReplaceBlankSpace {

    public String replaceBlankSpace(String s){
        if (s == null || s == "") {
            return s;
        }
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == ' ') {
                count++;
            }
        }
        char[] newChars = new char[chars.length+count*2];
        int index = 0;
        for (char c : chars) {
            if (c == ' ') {
                newChars[index++] = '%';
                newChars[index++] = '2';
                newChars[index++] = '0';
            } else {
                newChars[index++] = c;
            }
        }
        return new String(newChars);
    }
}
