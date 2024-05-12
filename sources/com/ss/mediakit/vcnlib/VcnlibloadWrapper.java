package com.ss.mediakit.vcnlib;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class VcnlibloadWrapper {
    public static boolean isVcnload;
    public static boolean isVcnverifyLiteload;
    public static boolean isVcnverifyload;

    public static boolean tryLoadVcnlib() {
        synchronized (VcnlibloadWrapper.class) {
            boolean z = true;
            if (isVcnload) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("vcn");
            } catch (UnsatisfiedLinkError unused) {
                z = false;
            }
            isVcnload = z;
            return z;
        }
    }

    public static boolean tryLoadVcnverifyLitelib() {
        synchronized (VcnlibloadWrapper.class) {
            boolean z = true;
            if (isVcnverifyLiteload) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("vcnverifylite");
                CustomVerify._init();
            } catch (UnsatisfiedLinkError unused) {
                z = false;
            }
            isVcnverifyLiteload = z;
            return z;
        }
    }

    public static boolean tryLoadVcnverifylib() {
        boolean z;
        synchronized (VcnlibloadWrapper.class) {
            boolean z2 = true;
            if (isVcnverifyload) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("vcnverify");
                z = true;
            } catch (UnsatisfiedLinkError unused) {
                z = false;
            }
            isVcnverifyload = z;
            if (!z && !tryLoadVcnverifyLitelib()) {
                z2 = false;
            }
            return z2;
        }
    }
}
