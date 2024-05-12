package com.byted.cast.dnssd;

import X.X1D;

/* loaded from: classes29.dex */
public class AppleService implements DNSSDService, Runnable {
    public BaseListener fListener;
    public long fNativeContext;

    public native int BlockForData();

    public native synchronized void HaltOperation();

    public native int ProcessResults();

    @Override // java.lang.Runnable
    public void run() {
        com_byted_cast_dnssd_AppleService_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void com_byted_cast_dnssd_AppleService__run$___twin___() {
        while (true) {
            int BlockForData = BlockForData();
            if (BlockForData != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("after BlockForData, result:");
                LIZ.append(BlockForData);
                Logger.d("DNSSD_AppleService", X1D.LIZIZ(LIZ));
            }
            synchronized (this) {
                if (this.fNativeContext != 0) {
                    if (BlockForData != 0) {
                        Logger.v("DNSSD_AppleService", "before ProcessResults");
                        int ProcessResults = ProcessResults();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("after ProcessResults, result:");
                        LIZ2.append(ProcessResults);
                        Logger.v("DNSSD_AppleService", X1D.LIZIZ(LIZ2));
                        if (this.fNativeContext != 0) {
                            if (ProcessResults != 0) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("will notify operationFailed, result:");
                                LIZ3.append(ProcessResults);
                                Logger.w("DNSSD_AppleService", X1D.LIZIZ(LIZ3));
                                this.fListener.operationFailed(this, ProcessResults);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.byted.cast.dnssd.DNSSDService
    public void stop() {
        HaltOperation();
    }

    public AppleService(BaseListener baseListener) {
        this.fListener = baseListener;
    }

    public static void com_byted_cast_dnssd_AppleService_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AppleService appleService) {
        boolean LIZ;
        try {
            appleService.com_byted_cast_dnssd_AppleService__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void ThrowOnErr(int i) {
        if (i == 0) {
        } else {
            throw new AppleDNSSDException(i);
        }
    }

    public void logger(int i, String str, String str2) {
        switch (i) {
            case 2:
            case 7:
                Logger.v(str, str2);
                return;
            case 3:
                Logger.d(str, str2);
                return;
            case 4:
                Logger.i(str, str2);
                return;
            case 5:
                Logger.w(str, str2);
                return;
            case 6:
                Logger.e(str, str2);
                return;
            default:
                return;
        }
    }
}
