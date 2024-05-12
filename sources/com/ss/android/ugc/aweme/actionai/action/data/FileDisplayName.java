package com.ss.android.ugc.aweme.actionai.action.data;

/* loaded from: classes8.dex */
public class FileDisplayName {
    public static String get(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return str;
    }
}
