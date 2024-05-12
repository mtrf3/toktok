package com.ss.android.vesdk;

import X.P4Q;
import java.io.FileDescriptor;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class VECryptUtils {
    public static native String nativeQueryCryptJson(String str);

    public static String queryCryptJson(String str) {
        return nativeQueryCryptJson(str);
    }

    public static InputStream cryptGetInputStream(FileDescriptor fileDescriptor, String str) {
        try {
            return new TECryptStream(fileDescriptor, str);
        } catch (Throwable th) {
            P4Q.LIZJ("VECryptUtils", th.getLocalizedMessage());
            return null;
        }
    }

    public static InputStream cryptGetInputStream(String str, String str2) {
        try {
            return new TECryptStream(str, str2);
        } catch (Throwable th) {
            P4Q.LIZJ("VECryptUtils", th.getLocalizedMessage());
            return null;
        }
    }
}
