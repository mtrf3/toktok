package com.bytedance.realx.base;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes7.dex */
public class JniHelper {
    public static Object getStringClass() {
        return String.class;
    }

    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("utf-8 is unsupported");
        }
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
