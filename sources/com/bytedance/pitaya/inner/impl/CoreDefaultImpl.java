package com.bytedance.pitaya.inner.impl;

import X.C16880lQ;
import X.C93265aO5;
import X.C93279aOJ;
import X.C93292aOW;
import X.C93302aOg;
import X.C93316aOu;
import X.C93318aOw;
import X.ExecutorC93235aNb;
import X.J9Q;
import X.RunnableC93280aOK;
import X.RunnableC93281aOL;
import X.RunnableC93282aOM;
import X.X1D;
import X.Y7H;
import android.content.Context;
import android.os.Looper;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.feature.FECore;
import com.bytedance.pitaya.inner.api.InnerMessageHandler;
import com.bytedance.pitaya.inner.api.TaskResultCallback;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.inner.api.bean.TaskData;
import com.bytedance.pitaya.jniwrapper.DefaultAdapter;
import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class CoreDefaultImpl implements IPitayaCore {
    public static DefaultAdapter defaultAdapter;
    public String aid;
    public final ConcurrentHashMap<String, PTYTaskResultCallback> appLogTaskCallback;
    public final PTYError emptyBusinessError;
    public volatile boolean init;
    public volatile boolean initOnce;
    public volatile boolean isSetup;
    public final ConcurrentHashMap<String, PTYMessageHandler> messageHandlers;
    public final PitayaNativeInstance nativeInstance;
    public final PTYError notReadyError;
    public final PTYError resultDisabledError;
    public AtomicInteger round;
    public final PTYError taskDisableError;
    public static final C93279aOJ Companion = new C93279aOJ();
    public static int workQueueReportSize = 10;

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public boolean isReady() {
        if (this.isSetup) {
            return true;
        }
        if (this.init) {
            this.isSetup = this.nativeInstance.LIZJ();
        }
        return this.isSetup;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void preDownloadAllPackage() {
        if (!isReady()) {
            return;
        }
        this.nativeInstance.LIZLLL();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseAllEngines() {
        if (!isReady()) {
            return;
        }
        try {
            PitayaNativeInstance.nativeReleaseAllEngines();
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdateAll() {
        if (!isReady()) {
            return;
        }
        this.nativeInstance.LJIIIZ();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void stopAllDownloadTask() {
        if (!isReady()) {
            return;
        }
        this.nativeInstance.LJIILIIL();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public String getAid() {
        return this.aid;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseEngine(String businessName) {
        o.LJIIJ(businessName, "businessName");
        if (!isReady()) {
            return;
        }
        try {
            PitayaNativeInstance.nativeReleaseEngine(businessName);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseNativeEngine(String businessName) {
        o.LJIIJ(businessName, "businessName");
        if (!isReady()) {
            return;
        }
        ExecutorC93235aNb.LJLJL.execute(new RunnableC93281aOL(businessName));
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeApplogRunEventCallback(String business) {
        o.LJIIJ(business, "business");
        if (!isReady()) {
            this.appLogTaskCallback.remove(business);
        } else {
            this.nativeInstance.LJII(business);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeMessageHandler(String business) {
        o.LJIIJ(business, "business");
        if (!isReady()) {
            this.messageHandlers.remove(business);
        } else {
            this.nativeInstance.LJIILJJIL(business);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setAid(String str) {
        o.LJIIJ(str, "<set-?>");
        this.aid = str;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogError(String content) {
        o.LJIIJ(content, "content");
        if (!isReady()) {
            return;
        }
        C93292aOW.LIZ("ERROR", content);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogInfo(String content) {
        o.LJIIJ(content, "content");
        if (!isReady()) {
            return;
        }
        C93292aOW.LIZ("INFO", content);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogWarn(String content) {
        o.LJIIJ(content, "content");
        if (!isReady()) {
            return;
        }
        C93292aOW.LIZ("WARN", content);
    }

    public CoreDefaultImpl(boolean z, String aid) {
        o.LJIIJ(aid, "aid");
        this.aid = aid;
        this.messageHandlers = new ConcurrentHashMap<>();
        this.appLogTaskCallback = new ConcurrentHashMap<>();
        this.round = new AtomicInteger(0);
        this.nativeInstance = new PitayaNativeInstance(z, getAid());
        PTYErrorCode pTYErrorCode = PTYErrorCode.INIT;
        this.notReadyError = new PTYError("PitayaCore", pTYErrorCode.getCode(), 0, "Invoked method before PitayaCore setup", null);
        this.taskDisableError = new PTYError("PitayaCore", pTYErrorCode.getCode(), 0, "This business has been baned by configuration, please contact with mabenteng", null);
        this.resultDisabledError = new PTYError("PitayaCore", pTYErrorCode.getCode(), 0, "This business has been baned by configuration, please contact with mabenteng", null);
        this.emptyBusinessError = new PTYError("PitayaCore", PTYErrorCode.INVALID_INPUT.getCode(), 0, "Input business name should not be empty", null);
    }

    public final void asyncSetup(SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            ExecutorC93235aNb.LJLJL.execute(new RunnableC93280aOK(this, setupInfo, pTYSetupCallback));
        } else {
            setupInternal$pitaya_i18nTocRelease(setupInfo, pTYSetupCallback);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void downloadPackage(String businessName, PTYPackageCallback packageCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(packageCallback, "packageCallback");
        if (!isReady()) {
            packageCallback.onResult(false, this.notReadyError, null);
        } else {
            this.nativeInstance.LIZ(businessName, packageCallback);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void queryPackage(String businessName, PTYPackageCallback packageCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(packageCallback, "packageCallback");
        if (!isReady()) {
            packageCallback.onResult(false, this.notReadyError, null);
        } else {
            this.nativeInstance.LJ(businessName, packageCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerApplogRunEventCallback$1] */
    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerApplogRunEventCallback(final String business, final PTYTaskResultCallback callback) {
        o.LJIIJ(business, "business");
        o.LJIIJ(callback, "callback");
        if (!isReady()) {
            this.appLogTaskCallback.put(business, callback);
        } else {
            this.nativeInstance.LJFF(business, new TaskResultCallback() { // from class: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerApplogRunEventCallback$1
                @Override // com.bytedance.pitaya.inner.api.TaskResultCallback
                public void onResult(boolean z, PTYError pTYError, TaskData taskData, PTYPackageInfo pTYPackageInfo) {
                    if (C93302aOg.LIZIZ(business)) {
                        callback.onResult(false, CoreDefaultImpl.this.resultDisabledError, null, null);
                    } else {
                        callback.onResult(z, pTYError, C93316aOu.LIZIZ(taskData), pTYPackageInfo);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerMessageHandler$1] */
    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerMessageHandler(final String businessName, final PTYMessageHandler handler) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(handler, "handler");
        if (!isReady()) {
            this.messageHandlers.put(businessName, handler);
        } else {
            this.nativeInstance.LJI(businessName, new InnerMessageHandler() { // from class: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$registerMessageHandler$1
                @Override // com.bytedance.pitaya.inner.api.InnerMessageHandler
                public TaskData onMessage(TaskData message) {
                    PTYTaskData LIZIZ;
                    JSONObject params;
                    JSONObject onMessage;
                    o.LJIIJ(message, "message");
                    if (C93302aOg.LIZIZ(businessName) || (LIZIZ = C93316aOu.LIZIZ(message)) == null || (params = LIZIZ.getParams()) == null || (onMessage = handler.onMessage(params)) == null) {
                        return null;
                    }
                    return C93316aOu.LIZ(new PTYTaskData(onMessage));
                }
            });
        }
    }

    public final void setupInternal$pitaya_i18nTocRelease(final SetupInfo setupInfo, final PTYSetupCallback pTYSetupCallback) {
        o.LJIIJ(setupInfo, "setupInfo");
        synchronized (Y7H.LIZJ) {
            if (Y7H.LIZIZ) {
                if (pTYSetupCallback != null) {
                    pTYSetupCallback.onResult(false, new PTYError("PitayaCore", PTYErrorCode.STORAGE_CLEAN.getCode(), 0, "Storage Error", null));
                }
            } else {
                Y7H.LIZ = true;
                this.nativeInstance.LJIIJJI(setupInfo, new PTYSetupCallback() { // from class: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$setupInternal$1
                    @Override // com.bytedance.pitaya.api.PTYSetupCallback
                    public void onResult(boolean z, PTYError pTYError) {
                        CoreDefaultImpl.this.init = true;
                        if (z) {
                            for (Map.Entry<String, PTYMessageHandler> entry : CoreDefaultImpl.this.messageHandlers.entrySet()) {
                                CoreDefaultImpl.this.registerMessageHandler(entry.getKey(), entry.getValue());
                            }
                            for (Map.Entry<String, PTYTaskResultCallback> entry2 : CoreDefaultImpl.this.appLogTaskCallback.entrySet()) {
                                CoreDefaultImpl.this.registerApplogRunEventCallback(entry2.getKey(), entry2.getValue());
                            }
                            CoreDefaultImpl.this.messageHandlers.clear();
                            CoreDefaultImpl.this.appLogTaskCallback.clear();
                        }
                        FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
                        synchronized (featureCoreFactory.getCores()) {
                            featureCoreFactory.getCores().put(setupInfo.getAid(), new FECore(setupInfo.getAid()));
                        }
                        PTYSetupCallback pTYSetupCallback2 = pTYSetupCallback;
                        if (pTYSetupCallback2 != null) {
                            pTYSetupCallback2.onResult(z, pTYError);
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void cleanStorage(final Context context, final List<String> reserveBusiness, final PTYNormalCallback callback) {
        o.LJIIJ(context, "context");
        o.LJIIJ(reserveBusiness, "reserveBusiness");
        o.LJIIJ(callback, "callback");
        PitayaLogger.LIZJ("CoreDefaultImpl", "cleanStorage");
        this.nativeInstance.LJIIL(new PTYNormalCallback() { // from class: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$cleanStorage$1
            @Override // com.bytedance.pitaya.api.PTYNormalCallback
            public void onResult(boolean z, PTYError pTYError) {
                if (z) {
                    PitayaLogger.LIZJ("CoreDefaultImpl", "cleanStorage:shut down success, now delete files");
                    J9Q.LIZJ(context, reserveBusiness, callback);
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cleanStorage:shut down failed, error is ");
                LIZ.append(pTYError);
                PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
                callback.onResult(false, pTYError);
            }
        });
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdate(String businessName, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback) {
        o.LJIIJ(businessName, "businessName");
        if (!isReady()) {
            if (pTYPackageCallback != null) {
                pTYPackageCallback.onResult(false, this.notReadyError, null);
            }
        } else {
            if (businessName.length() == 0) {
                if (pTYPackageCallback != null) {
                    pTYPackageCallback.onResult(false, this.emptyBusinessError, null);
                    return;
                }
                return;
            }
            this.nativeInstance.LJIIIIZZ(businessName, pTYRequestConfig, pTYPackageCallback);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setup(Context context, PTYSetupInfo ptySetupInfo, PTYSetupCallback pTYSetupCallback) {
        o.LJIIJ(context, "context");
        o.LJIIJ(ptySetupInfo, "ptySetupInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("custom setup ");
        LIZ.append(ptySetupInfo.getAid());
        PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
        if (ujb.o.LJJJJIZL(C93265aO5.LIZ.LIZIZ, ptySetupInfo.getAid(), false)) {
            PitayaLogger.LIZIZ("CoreDefaultImpl", "Can not setup host");
            if (pTYSetupCallback != null) {
                PTYErrorCode pTYErrorCode = PTYErrorCode.INIT;
                pTYSetupCallback.onResult(false, new PTYError("setup", pTYErrorCode.getCode(), pTYErrorCode.getCode(), "Can not setup host", null));
                return;
            }
            return;
        }
        asyncSetup(new SetupInfo(context, ptySetupInfo), pTYSetupCallback);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runNativeTask(final String businessName, final PTYNativeTaskData pTYNativeTaskData, final PTYNativeTaskConfig taskConfig, final PTYTaskResultCallback resultCallback) {
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(taskConfig, "taskConfig");
        o.LJIIJ(resultCallback, "resultCallback");
        if (!isReady()) {
            resultCallback.onResult(false, this.notReadyError, null, null);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start runNativeTask:");
        LIZ.append(businessName);
        PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
        ExecutorC93235aNb.LJLJL.execute(new Runnable(businessName, pTYNativeTaskData, taskConfig, resultCallback) { // from class: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$runNativeTask$1
            public final /* synthetic */ String LJLIL;
            public final /* synthetic */ PTYTaskResultCallback LJLILLLLZI;

            {
                this.LJLILLLLZI = resultCallback;
            }

            public final void LIZ() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Finish runNativeTask:");
                LIZ2.append(this.LJLIL);
                LIZ2.append(", ARTSOTER_IMPL_NOT_READY");
                PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ2));
                PTYTaskResultCallback pTYTaskResultCallback = this.LJLILLLLZI;
                PTYErrorCode pTYErrorCode = PTYErrorCode.ARTSOTER_IMPL_NOT_READY;
                pTYTaskResultCallback.onResult(false, new PTYError("ArtSoter", pTYErrorCode.getCode(), pTYErrorCode.getCode(), null, null), null, null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }

            /* renamed from: com.bytedance.pitaya.inner.impl.CoreDefaultImpl$runNativeTask$1$1, reason: invalid class name */
            /* loaded from: classes30.dex */
            public final class AnonymousClass1 implements PTYTaskResultCallback {
                public AnonymousClass1() {
                }

                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Finish runNativeTask:");
                    LIZ.append(CoreDefaultImpl$runNativeTask$1.this.LJLIL);
                    LIZ.append(", success:");
                    LIZ.append(z);
                    PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
                    CoreDefaultImpl$runNativeTask$1.this.LJLILLLLZI.onResult(z, pTYError, pTYTaskData, pTYPackageInfo);
                }
            }
        });
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runTask(String businessName, PTYTaskData pTYTaskData, PTYTaskConfig taskConfig, PTYTaskResultCallback resultCallback) {
        String str;
        String str2;
        String str3;
        int i;
        String pluginVersion;
        o.LJIIJ(businessName, "businessName");
        o.LJIIJ(taskConfig, "taskConfig");
        o.LJIIJ(resultCallback, "resultCallback");
        long currentTimeMillis = System.currentTimeMillis();
        if (!isReady()) {
            resultCallback.onResult(false, this.notReadyError, null, null);
            return;
        }
        if (C93302aOg.LIZ(businessName)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(businessName);
            LIZ.append(" baned by config");
            PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ));
            resultCallback.onResult(false, this.taskDisableError, null, null);
            return;
        }
        CoreDefaultImpl$runTask$callbackAdapter$1 coreDefaultImpl$runTask$callbackAdapter$1 = new CoreDefaultImpl$runTask$callbackAdapter$1(this, businessName, currentTimeMillis, resultCallback);
        double d = currentTimeMillis / 1000.0d;
        int LIZLLL = ExecutorC93235aNb.LJLIL.LIZLLL();
        if (LIZLLL >= workQueueReportSize) {
            JSONObject jSONObject = new JSONObject();
            SetupInfo setupInfo = C93318aOw.LIZ;
            String str4 = "";
            if (setupInfo == null || (str = setupInfo.getAid()) == null) {
                str = "";
            }
            jSONObject.put("aid", str);
            SetupInfo setupInfo2 = C93318aOw.LIZ;
            if (setupInfo2 == null || (str2 = setupInfo2.getSdkBuildVersion()) == null) {
                str2 = "";
            }
            jSONObject.put("sdk_build_ver", str2);
            SetupInfo setupInfo3 = C93318aOw.LIZ;
            if (setupInfo3 == null || (str3 = setupInfo3.getAppVersion()) == null) {
                str3 = "";
            }
            jSONObject.put("app_ver", str3);
            SetupInfo setupInfo4 = C93318aOw.LIZ;
            if (setupInfo4 != null) {
                i = setupInfo4.getSetupMode();
            } else {
                i = -1;
            }
            jSONObject.put("setup_mode", i);
            SetupInfo setupInfo5 = C93318aOw.LIZ;
            if (setupInfo5 != null && (pluginVersion = setupInfo5.getPluginVersion()) != null) {
                str4 = pluginVersion;
            }
            jSONObject.put("pl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("work_queue", LIZLLL);
            DefaultAdapter defaultAdapter2 = defaultAdapter;
            if (defaultAdapter2 != null) {
                defaultAdapter2.monitor("pitaya2_work_queue_of", jSONObject2.toString(), jSONObject.toString(), null);
            }
        }
        if (!taskConfig.getSync()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(businessName);
            LIZ2.append(" async run");
            PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ2));
            ExecutorC93235aNb.LIZIZ(new RunnableC93282aOM(this, businessName, taskConfig, pTYTaskData, coreDefaultImpl$runTask$callbackAdapter$1, d));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(businessName);
        LIZ3.append(" sync run");
        PitayaLogger.LIZJ("CoreDefaultImpl", X1D.LIZIZ(LIZ3));
        this.nativeInstance.LJIIJ(businessName, taskConfig, pTYTaskData, coreDefaultImpl$runTask$callbackAdapter$1, d, d);
    }
}
