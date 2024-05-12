package com.heytap.mcssdk.utils;

/* loaded from: classes28.dex */
public class a {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a() {
        return "file".equals(a("ro.crypto.type"));
    }
}
