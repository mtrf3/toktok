package com.tiktok.ttm;

import X.C16880lQ;
import X.C38995FSd;
import X.C66233Pz3;
import Y.ARunnableS1S2000000_11;

/* loaded from: classes12.dex */
public final class TTMCore {
    public static final TTMCore LIZJ = new TTMCore();
    public volatile boolean LIZ;
    public volatile C66233Pz3 LIZIZ;

    /* loaded from: classes12.dex */
    public static class JNIHelper {
        public static native String dumpInfo(long j);

        public static native void execute(byte[] bArr, TTMParamData tTMParamData, TTMOutput tTMOutput);

        public static native void execute(byte[] bArr, String str, TTMOutput tTMOutput);

        public static native void init(int i, int i2);

        public static native void prepareAsNeeded();

        static {
            C16880lQ.LLJJJIL("TTMachineCore");
        }

        public static void reportMetric(String str, String str2) {
            TTMCore tTMCore = TTMCore.LIZJ;
            if (!tTMCore.LIZ()) {
                return;
            }
            tTMCore.LIZIZ.getClass();
            try {
                if (tTMCore.LIZIZ.LJII == null) {
                    return;
                }
                tTMCore.LIZIZ.LJII.getClass();
                C38995FSd.LIZJ().execute(new ARunnableS1S2000000_11(str, str2, 2));
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean LIZ() {
        if (this.LIZ && this.LIZIZ != null && this.LIZIZ.LIZ) {
            return true;
        }
        return false;
    }
}
