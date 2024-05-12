package com.byted.cast.common.auth.license;

import X.C16880lQ;

/* loaded from: classes29.dex */
public class VerifyUtil {
    public static native String generateAppServerReqContent(String str);

    public static native String generateAppServerReqSignature(String str);

    public static native String verifyLicense(String str, String str2, String str3);

    static {
        C16880lQ.LLJJJIL("castauth");
    }
}
