package com.bytedance.pitaya.jniwrapper;

import X.C93302aOg;
import X.C93316aOu;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYSocketStateCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.feature.DBCreator;
import com.bytedance.pitaya.feature.Hardware;
import com.bytedance.pitaya.feature.UserProfile;
import com.bytedance.pitaya.feature.uembedding.UEmbedding;
import com.bytedance.pitaya.inner.api.InnerMessageHandler;
import com.bytedance.pitaya.inner.api.TaskResultCallback;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.inner.api.bean.TaskData;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerApplogRunEventCallback$1;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerMessageHandler$1;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl$runTask$callbackAdapter$1;
import com.bytedance.pitaya.log.PitayaLogger;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class PitayaNativeInstance {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final native void nativeConnectSocket(String str, PTYSocketStateCallback pTYSocketStateCallback);

    private final native long nativeCreateNativeCore(boolean z, String str);

    private final native void nativeDownloadPackage(long j, String str, PTYPackageCallback pTYPackageCallback);

    public static final native String nativeGetABI();

    public static final native String nativeGetExecutorsCrashInfo();

    public static final native String nativeGetExecutorsFatalErrorMsg();

    public static final native String nativeGetExecutorsStack();

    public static final native String nativeGetRecentRunPackages();

    public static final native boolean nativeIsPackageValid(String str, String str2);

    private final native boolean nativeIsReady(long j);

    public static final native boolean nativeIsValidEvent(String str);

    public static final native void nativeMonitor(String str, String str2, String str3, String str4, String str5);

    public static final native void nativeOnEvent(String str, String str2, double d, int i);

    public static final native void nativeOnEventRapid(String str, long j);

    public static final native void nativePostNotification(int i);

    private final native void nativePreDownloadAllPackage(long j);

    private final native void nativeQueryPackage(long j, String str, PTYPackageCallback pTYPackageCallback);

    private final native void nativeRegisterAppLogCallback(long j, String str, TaskResultCallback taskResultCallback);

    private final native void nativeRegisterMessageHandler(long j, String str, InnerMessageHandler innerMessageHandler);

    public static final native void nativeReleaseAllEngines();

    public static final native void nativeReleaseEngine(String str);

    private final native void nativeRemoveAppLogCallback(long j, String str);

    private final native void nativeRequestUpdate(long j, String str, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback);

    private final native void nativeRequestUpdateAll(long j);

    private final native void nativeRunTask(long j, String str, PTYTaskConfig pTYTaskConfig, TaskData taskData, TaskResultCallback taskResultCallback, double d, double d2);

    private final native void nativeRunTaskWithoutInputConvert(long j, String str, PTYTaskConfig pTYTaskConfig, JSONObject jSONObject, TaskResultCallback taskResultCallback, double d, double d2);

    public static final native void nativeSetAdapter(IAdapter iAdapter, DBCreator dBCreator, Hardware hardware, UserProfile userProfile, UEmbedding uEmbedding, IFEMigrationAdapter iFEMigrationAdapter);

    public static final native void nativeSetNativeLogImplAndFunAddr(long j);

    private final native void nativeSetUp(long j, SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback);

    private final native void nativeShutDown(long j, PTYNormalCallback pTYNormalCallback);

    public static final native void nativeSocketLog(String str, String str2);

    private final native void nativeStopAllDownloadTask(long j);

    private final native void nativeUnregisterMessageHandler(long j, String str);

    public final boolean LIZIZ() {
        long j = this.LIZ;
        if (j != 0 && j != -1) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (LIZIZ()) {
            try {
                return nativeIsReady(this.LIZ);
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        return false;
    }

    public final void LIZLLL() {
        if (!LIZIZ()) {
            return;
        }
        try {
            nativePreDownloadAllPackage(this.LIZ);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJIIIZ() {
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeRequestUpdateAll(this.LIZ);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJIILIIL() {
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeStopAllDownloadTask(this.LIZ);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJII(String business) {
        o.LJIIJ(business, "business");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeRemoveAppLogCallback(this.LIZ, business);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJIIL(PTYNormalCallback pTYNormalCallback) {
        if (LIZIZ()) {
            try {
                nativeShutDown(this.LIZ, pTYNormalCallback);
                return;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        pTYNormalCallback.onResult(false, new PTYError(null, PTYErrorCode.INIT.getCode(), 0, "nativeShutDown JNI call failed!", null));
    }

    public final void LJIILJJIL(String business) {
        o.LJIIJ(business, "business");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeUnregisterMessageHandler(this.LIZ, business);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public PitayaNativeInstance(boolean z, String aid) {
        long j;
        o.LJIIJ(aid, "aid");
        try {
            j = nativeCreateNativeCore(z, aid);
        } catch (Throwable th) {
            PitayaLogger.LJ(th, null, 6);
            j = 0;
        }
        this.LIZ = j;
    }

    public final void LIZ(String businessName, PTYPackageCallback pTYPackageCallback) {
        o.LJIIJ(businessName, "businessName");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeDownloadPackage(this.LIZ, businessName, pTYPackageCallback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJ(String business, PTYPackageCallback callback) {
        o.LJIIJ(business, "business");
        o.LJIIJ(callback, "callback");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeQueryPackage(this.LIZ, business, callback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJFF(String business, CoreDefaultImpl$registerApplogRunEventCallback$1 coreDefaultImpl$registerApplogRunEventCallback$1) {
        o.LJIIJ(business, "business");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeRegisterAppLogCallback(this.LIZ, business, coreDefaultImpl$registerApplogRunEventCallback$1);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJI(String business, CoreDefaultImpl$registerMessageHandler$1 coreDefaultImpl$registerMessageHandler$1) {
        o.LJIIJ(business, "business");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeRegisterMessageHandler(this.LIZ, business, coreDefaultImpl$registerMessageHandler$1);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJIIJJI(SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback) {
        o.LJIIJ(setupInfo, "setupInfo");
        if (LIZIZ()) {
            try {
                nativeSetUp(this.LIZ, setupInfo, pTYSetupCallback);
                return;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        PTYErrorCode pTYErrorCode = PTYErrorCode.INIT;
        pTYSetupCallback.onResult(false, new PTYError("Core .so file load failed!", pTYErrorCode.getCode(), pTYErrorCode.getCode(), null, null));
    }

    public final void LJIIIIZZ(String business, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback) {
        o.LJIIJ(business, "business");
        if (!LIZIZ()) {
            return;
        }
        try {
            nativeRequestUpdate(this.LIZ, business, pTYRequestConfig, pTYPackageCallback);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public final void LJIIJ(String business, PTYTaskConfig configPTY, PTYTaskData pTYTaskData, CoreDefaultImpl$runTask$callbackAdapter$1 coreDefaultImpl$runTask$callbackAdapter$1, double d, double d2) {
        JSONObject jSONObject;
        o.LJIIJ(business, "business");
        o.LJIIJ(configPTY, "configPTY");
        if (LIZIZ()) {
            try {
                if (C93302aOg.LJIIJ) {
                    if (pTYTaskData != null) {
                        pTYTaskData.getDataFetcher();
                    }
                    long j = this.LIZ;
                    if (pTYTaskData != null) {
                        jSONObject = pTYTaskData.getParams();
                    } else {
                        jSONObject = null;
                    }
                    nativeRunTaskWithoutInputConvert(j, business, configPTY, jSONObject, coreDefaultImpl$runTask$callbackAdapter$1, d, d2);
                    return;
                }
                nativeRunTask(this.LIZ, business, configPTY, C93316aOu.LIZ(pTYTaskData), coreDefaultImpl$runTask$callbackAdapter$1, d, d2);
                return;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        if (coreDefaultImpl$runTask$callbackAdapter$1 != null) {
            PTYErrorCode pTYErrorCode = PTYErrorCode.INIT;
            coreDefaultImpl$runTask$callbackAdapter$1.onResult(false, new PTYError("Core .so file load failed!", pTYErrorCode.getCode(), pTYErrorCode.getCode(), null, null), null, null);
        }
    }
}
