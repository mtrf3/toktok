package com.bytedance.pitaya.inner.impl;

import X.C93302aOg;
import X.C93316aOu;
import X.OSZ;
import X.X1D;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.inner.api.TaskResultCallback;
import com.bytedance.pitaya.inner.api.bean.TaskData;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class CoreDefaultImpl$runTask$callbackAdapter$1 implements TaskResultCallback {
    public final /* synthetic */ String $businessName;
    public final /* synthetic */ PTYTaskResultCallback $resultCallback;
    public final /* synthetic */ long $t1;
    public final /* synthetic */ CoreDefaultImpl this$0;

    public CoreDefaultImpl$runTask$callbackAdapter$1(CoreDefaultImpl coreDefaultImpl, String str, long j, PTYTaskResultCallback pTYTaskResultCallback) {
        this.this$0 = coreDefaultImpl;
        this.$businessName = str;
        this.$t1 = j;
        this.$resultCallback = pTYTaskResultCallback;
    }

    @Override // com.bytedance.pitaya.inner.api.TaskResultCallback
    public void onResult(boolean z, PTYError pTYError, TaskData taskData, PTYPackageInfo pTYPackageInfo) {
        String businessName = this.$businessName;
        long currentTimeMillis = System.currentTimeMillis() - this.$t1;
        o.LJIIJ(businessName, "businessName");
        ConcurrentHashMap<String, OSZ<Double, Integer>> concurrentHashMap = C93302aOg.LJFF;
        OSZ<Double, Integer> osz = concurrentHashMap.get(businessName);
        if (osz != null) {
            if (currentTimeMillis / 1000.0d > osz.getFirst().doubleValue()) {
                osz = osz.copy(osz.getFirst(), Integer.valueOf(osz.getSecond().intValue() + 1));
            } else if (osz.getSecond().intValue() < 2) {
                osz = osz.copy(osz.getFirst(), 0);
            }
            concurrentHashMap.put(businessName, osz);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.$businessName);
        LIZ.append(" run finished");
        PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
        if (C93302aOg.LIZIZ(this.$businessName)) {
            this.$resultCallback.onResult(false, this.this$0.resultDisabledError, null, null);
        } else {
            this.$resultCallback.onResult(z, pTYError, C93316aOu.LIZIZ(taskData), pTYPackageInfo);
        }
    }
}
