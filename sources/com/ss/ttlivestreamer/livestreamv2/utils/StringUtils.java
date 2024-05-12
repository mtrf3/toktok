package com.ss.ttlivestreamer.livestreamv2.utils;

/* loaded from: classes12.dex */
public class StringUtils {
    public static boolean equalsIgnoreCase(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }
}
