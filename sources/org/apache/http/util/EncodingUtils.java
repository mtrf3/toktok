package org.apache.http.util;

import java.io.UnsupportedEncodingException;

/* loaded from: classes9.dex */
public final class EncodingUtils {
    public static String getString(byte[] bArr, String str) {
        if (bArr != null) {
            return getString(bArr, 0, bArr.length, str);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    public static String getString(byte[] bArr, int i, int i2, String str) {
        if (bArr != null) {
            if (str != null && str.length() != 0) {
                try {
                    return new String(bArr, i, i2, str);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr, i, i2);
                }
            }
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }
}
