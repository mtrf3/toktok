package com.mammon.audiosdk;

import X.C16880lQ;
import android.content.Context;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreAbCallback;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class SAMICore {
    public static boolean isInitContext;
    public static Lock lock;
    public SAMICoreAbCallback abCallback;
    public SAMICoreIdentify identify;
    public SAMICoreCallBackListener listener;
    public long resourceHandle;
    public int[] retAarry;

    private native long Native_SAMICoreCreateHandleByIdentify(int i, Object obj, int[] iArr);

    private native int Native_SAMICoreDestroyHandle(long j);

    private native int Native_SAMICoreGetPropertyById(long j, int i, SAMICoreProperty sAMICoreProperty);

    public static native long Native_SAMICoreInitContext(int i, Object obj);

    private native int Native_SAMICoreProcess(long j, int i, SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2);

    private native int Native_SAMICoreProcessAsync(long j, int i, SAMICoreBlock sAMICoreBlock);

    public static native int Native_SAMICoreReleaseContext(int i);

    private native int Native_SAMICoreSetProperty(long j, int i, SAMICoreProperty sAMICoreProperty);

    static {
        C16880lQ.LLJJJIL("audioeffect");
        lock = new ReentrantLock();
        isInitContext = false;
    }

    public int SAMICoreDestroyHandle() {
        int Native_SAMICoreDestroyHandle = Native_SAMICoreDestroyHandle(this.resourceHandle);
        this.resourceHandle = 0L;
        return Native_SAMICoreDestroyHandle;
    }

    public SAMICore() {
        this.retAarry = r2;
        int[] iArr = {ImagePreloadExperiment.PRIORITY_DEFAULT};
    }

    public long getHandle() {
        return this.resourceHandle;
    }

    public int SAMICoreProcessAsync(SAMICoreBlock sAMICoreBlock) {
        return Native_SAMICoreProcessAsync(this.resourceHandle, this.identify.getValue(), sAMICoreBlock);
    }

    public void setListener(SAMICoreCallBackListener sAMICoreCallBackListener) {
        this.listener = sAMICoreCallBackListener;
    }

    public static void ReleaseContext(Context context, SAMICoreContextType sAMICoreContextType) {
        lock.lock();
        if (isInitContext) {
            Native_SAMICoreReleaseContext(sAMICoreContextType.getValue());
            isInitContext = false;
        }
        lock.unlock();
    }

    public int SAMICoreCreateHandleByIdentify(SAMICoreIdentify sAMICoreIdentify, Object obj) {
        this.identify = sAMICoreIdentify;
        this.retAarry[0] = 100000;
        this.resourceHandle = Native_SAMICoreCreateHandleByIdentify(sAMICoreIdentify.getValue(), obj, this.retAarry);
        return this.retAarry[0];
    }

    public int SAMICoreGetPropertyById(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        return Native_SAMICoreGetPropertyById(this.resourceHandle, sAMICorePropertyId.getValue(), sAMICoreProperty);
    }

    public int SAMICoreProcess(SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2) {
        return Native_SAMICoreProcess(this.resourceHandle, this.identify.getValue(), sAMICoreBlock, sAMICoreBlock2);
    }

    public int SAMICoreSetProperty(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        long j = this.resourceHandle;
        if (j != 0) {
            return Native_SAMICoreSetProperty(j, sAMICorePropertyId.getValue(), sAMICoreProperty);
        }
        return 100002;
    }

    public void onMessageReceived(int i, SAMICoreBlock sAMICoreBlock) {
        SAMICoreCallBackListener sAMICoreCallBackListener = this.listener;
        if (sAMICoreCallBackListener != null) {
            sAMICoreCallBackListener.onMessageReceived(SAMICoreCallBackEventType.fromInt(i), sAMICoreBlock);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r1 == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int InitContext(android.content.Context r2, java.lang.String r3, com.mammon.audiosdk.enums.SAMICoreContextType r4, java.lang.String r5) {
        /*
            java.util.concurrent.locks.Lock r0 = com.mammon.audiosdk.SAMICore.lock
            r0.lock()
            com.mammon.audiosdk.enums.SAMICoreContextType r0 = com.mammon.audiosdk.enums.SAMICoreContextType.SAMICoreContextType_AbConfig
            r2 = 0
            if (r4 == r0) goto L29
            com.mammon.audiosdk.structures.SAMICoreTokenVerifyOfflineParameter r1 = new com.mammon.audiosdk.structures.SAMICoreTokenVerifyOfflineParameter
            r1.<init>()
            r1.appKey = r3
            r1.token = r5
            r1.extra = r2
            int r0 = r4.getValue()
            long r2 = Native_SAMICoreInitContext(r0, r1)
        L1d:
            int r1 = (int) r2
            if (r1 != 0) goto L23
        L20:
            r0 = 1
            com.mammon.audiosdk.SAMICore.isInitContext = r0
        L23:
            java.util.concurrent.locks.Lock r0 = com.mammon.audiosdk.SAMICore.lock
            r0.unlock()
            return r1
        L29:
            if (r4 != r0) goto L34
            int r0 = r4.getValue()
            long r2 = Native_SAMICoreInitContext(r0, r2)
            goto L1d
        L34:
            r1 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mammon.audiosdk.SAMICore.InitContext(android.content.Context, java.lang.String, com.mammon.audiosdk.enums.SAMICoreContextType, java.lang.String):int");
    }
}
