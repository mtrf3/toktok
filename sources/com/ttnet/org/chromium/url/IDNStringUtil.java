package com.ttnet.org.chromium.url;

import java.net.IDN;

/* loaded from: classes12.dex */
public class IDNStringUtil {
    public static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
