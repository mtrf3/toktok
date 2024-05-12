package com.byted.cast.common.auth.license.crypto;

import com.byted.cast.common.StringUtil;

/* loaded from: classes29.dex */
public class CryptoUtil {
    public static String base64Decode(String str) {
        byte[] base64Decode = JavaCryptoUtil.base64Decode(str);
        if (base64Decode == null) {
            return "";
        }
        return new String(base64Decode);
    }

    public static String base64Encode(String str) {
        return StringUtil.getNonEmptyString(JavaCryptoUtil.base64Encode(str.getBytes()));
    }

    public static String sha256Encode(String str) {
        return StringUtil.getNonEmptyString(JavaCryptoUtil.sha256Encode(str));
    }

    public static String rsaDecryptWithPublicKey(String str, String str2) {
        return StringUtil.getNonEmptyString(JavaCryptoUtil.rsaDecryptWithPublicKey(str, str2));
    }

    public static String rsaEncryptWithPrivateKey(String str, String str2) {
        return StringUtil.getNonEmptyString(JavaCryptoUtil.rsaEncryptWithPrivateKey(str, str2));
    }
}
