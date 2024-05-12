package com.ss.android.ugc.aweme.pitaya;

import X.C16880lQ;
import X.C34K;
import X.C38421F6b;
import X.C93258aNy;
import X.C93265aO5;
import X.C93279aOJ;
import X.C93299aOd;
import X.C93317aOv;
import X.C93318aOw;
import X.C93323aP1;
import X.C93337aPF;
import X.EF7;
import X.ExecutorC93235aNb;
import X.RunnableC93264aO4;
import X.X1D;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYSocketStateCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.PitayaHostDefault$hostSetup$registeCallback$1;
import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.api.bean.PTYApplogEventType;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYSetupMode;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl;
import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pitaya.PitayaBundleImpl;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public class PitayaBundleImpl implements IPitayaBundle {
    public static final JSONObject LJ = new JSONObject();
    public C38421F6b LIZ;
    public boolean LIZIZ;
    public final JSONObject LIZJ = new JSONObject();
    public final PTYSetupCallback LIZLLL = new C93337aPF(this);

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void initPitayaProxy(Context context) {
    }

    public static PitayaBundleImpl createImplInst() {
        return C93299aOd.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean initPitaya(final C38421F6b c38421F6b) {
        int i;
        int parseInt;
        if (this.LIZIZ) {
            return true;
        }
        if (c38421F6b == null) {
            return false;
        }
        PitayaExperiment.LIZ.getClass();
        try {
            JSONObject jSONObject = new JSONObject(String.valueOf(PitayaExperiment.LIZIZ.content));
            LJ.put("content", jSONObject);
            i = jSONObject.optInt("py_concurrency", 1);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            i = 1;
        }
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            try {
                LIZLLL.loadLibrary("pythonA");
                LIZLLL.loadLibrary("bytedt");
                LIZLLL.loadLibrary("AndroidPitayaCore");
            } catch (Throwable unused) {
                return false;
            }
        }
        this.LIZ = c38421F6b;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LJIIIZ);
        LIZ.append("");
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EF7.LJFF());
        LIZ2.append("");
        PTYSetupInfo pTYSetupInfo = new PTYSetupInfo(LIZIZ, X1D.LIZIZ(LIZ2), EF7.LJIILIIL, new PTYDIDCallback() { // from class: X.aPG
            @Override // com.bytedance.pitaya.api.PTYDIDCallback
            public final String getDid() {
                C38421F6b.this.getClass();
                String serverDeviceId = AppLog.getServerDeviceId();
                o.LJIIIIZZ(serverDeviceId, "getServerDeviceId()");
                return serverDeviceId;
            }
        }, new PTYUIDCallback() { // from class: X.aPH
            @Override // com.bytedance.pitaya.api.PTYUIDCallback
            public final String getUid() {
                C38421F6b.this.getClass();
                String curUserId = HG3.LJIILL().getCurUserId();
                if (curUserId == null) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return curUserId;
            }
        }, null, new PTYSettingsCallback() { // from class: X.aPI
            @Override // com.bytedance.pitaya.api.PTYSettingsCallback
            public final JSONObject getSettings(String str) {
                try {
                    JSONObject jSONObject2 = PitayaBundleImpl.LJ;
                    PitayaExperiment.LIZ.getClass();
                    jSONObject2.put("content", PitayaExperiment.LIZJ);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                return PitayaBundleImpl.LJ;
            }
        }, 2, true, "221000", i, null, false, false, null);
        C93258aNy c93258aNy = C93265aO5.LIZ;
        Context LIZIZ2 = EF7.LIZIZ();
        PTYSetupCallback pTYSetupCallback = this.LIZLLL;
        c93258aNy.getClass();
        C34K c34k = new C34K();
        c34k.element = false;
        synchronized (c93258aNy) {
            if (pTYSetupInfo.getSetupMode().compareTo(c93258aNy.LJI) <= 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(pTYSetupInfo.getAid());
                LIZ3.append(" Initialization PitayaHostDefault multi-times");
                PitayaLogger.LIZJ("PitayaInstance", X1D.LIZIZ(LIZ3));
                if (pTYSetupCallback != null) {
                    PTYErrorCode pTYErrorCode = PTYErrorCode.INIT;
                    ((C93337aPF) pTYSetupCallback).onResult(false, new PTYError(null, pTYErrorCode.getCode(), pTYErrorCode.getCode(), "Initialization multi-times", null));
                }
            } else if (c93258aNy.LJ) {
                if (pTYSetupCallback != null) {
                    PTYErrorCode pTYErrorCode2 = PTYErrorCode.INIT;
                    ((C93337aPF) pTYSetupCallback).onResult(false, new PTYError(null, pTYErrorCode2.getCode(), pTYErrorCode2.getCode(), "Lite mode has setup failed", null));
                }
            } else {
                PTYSetupMode setupMode = pTYSetupInfo.getSetupMode();
                PTYSetupMode pTYSetupMode = PTYSetupMode.Lite;
                if (setupMode == pTYSetupMode && new File(C93258aNy.LIZJ(LIZIZ2)).exists()) {
                    PitayaLogger.LIZIZ("PitayaInstance", "Lite mode fuse");
                    if (pTYSetupCallback != null) {
                        PTYErrorCode pTYErrorCode3 = PTYErrorCode.INIT;
                        ((C93337aPF) pTYSetupCallback).onResult(false, new PTYError(null, pTYErrorCode3.getCode(), pTYErrorCode3.getCode(), "Lite mode fuse", null));
                    }
                } else {
                    if (pTYSetupInfo.getSetupMode() == pTYSetupMode) {
                        try {
                            new File(C93258aNy.LIZJ(LIZIZ2)).createNewFile();
                        } catch (Exception e2) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Create lite mode mark with exception. ");
                            LIZ4.append(e2.getMessage());
                            PitayaLogger.LIZIZ("PitayaInstance", X1D.LIZIZ(LIZ4));
                        }
                    }
                    c93258aNy.LJI = pTYSetupInfo.getSetupMode();
                    if (!c93258aNy.LIZ) {
                        c93258aNy.LIZ = true;
                        c34k.element = true;
                    }
                    if (C93317aOv.LIZ == null) {
                        C93317aOv.LIZ = new WeakReference<>(((ContextWrapper) LIZIZ2).getBaseContext());
                    }
                    SetupInfo setupInfo = new SetupInfo(LIZIZ2, pTYSetupInfo);
                    C93318aOw.LIZ = setupInfo;
                    if (c34k.element) {
                        ExecutorC93235aNb.LJLJI = new C93323aP1(setupInfo.getPyConcurrency() + 1, "twq");
                        C93279aOJ c93279aOJ = CoreDefaultImpl.Companion;
                        String settings = setupInfo.getSettings("pitaya_general_settings.content.pitaya_global.work_queue_report_size", 2);
                        if (settings != null) {
                            try {
                                String optString = new JSONObject(settings).optString("rst", "10");
                                o.LJFF(optString, "JSONObject(it).optString(\"rst\", \"10\")");
                                parseInt = CastIntegerProtector.parseInt(optString);
                            } catch (Throwable unused2) {
                            }
                            c93279aOJ.getClass();
                            CoreDefaultImpl.workQueueReportSize = parseInt;
                        }
                        parseInt = 10;
                        c93279aOJ.getClass();
                        CoreDefaultImpl.workQueueReportSize = parseInt;
                    }
                    ExecutorC93235aNb.LJLJL.execute(new RunnableC93264aO4(c93258aNy, pTYSetupInfo, LIZIZ2, setupInfo, new PitayaHostDefault$hostSetup$registeCallback$1(c93258aNy, setupInfo, pTYSetupCallback), c34k));
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean releaseArtSoterByName(String str) {
        this.LIZ.getClass();
        if (!TextUtils.equals("local_test", EF7.LJIILIIL)) {
            return false;
        }
        throw new RuntimeException("ArtSorter was no longer supported, to get more information please contract with mabenteng");
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final int setDebugWebSocketUrl(String socketURL) {
        C93258aNy c93258aNy = C93265aO5.LIZ;
        PTYSocketStateCallback pTYSocketStateCallback = new PTYSocketStateCallback() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaBundleImpl.1
            @Override // com.bytedance.pitaya.api.PTYSocketStateCallback
            public void onSocketStateChange(String str, String str2) {
            }
        };
        c93258aNy.getClass();
        o.LJIIJ(socketURL, "socketURL");
        if (c93258aNy.LJII) {
            try {
                PitayaNativeInstance.nativeConnectSocket(socketURL, pTYSocketStateCallback);
                return 0;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
                return 0;
            }
        }
        pTYSocketStateCallback.onSocketStateChange("error", "You can't connect socket before host setup!");
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void onAppLogEvent(String str, String str2) {
        if (str == null) {
            return;
        }
        C93258aNy c93258aNy = C93265aO5.LIZ;
        c93258aNy.getClass();
        c93258aNy.LIZIZ(new PTYApplogEvent(str, str2, PTYApplogEventType.NORMAL), false);
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void onCustomAppLog(String str, JSONObject jSONObject) {
        if (jSONObject == null || str == null) {
            return;
        }
        PitayaExperiment.LIZ.getClass();
        if (!PitayaExperiment.LIZJ.optBoolean("custom_applog_enable", false)) {
            return;
        }
        C93265aO5.LIZ.LJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean runArtSoterByName(String str, Bitmap bitmap, JSONObject jSONObject, PTYTaskResultCallback pTYTaskResultCallback) {
        this.LIZ.getClass();
        if (!TextUtils.equals("local_test", EF7.LJIILIIL)) {
            pTYTaskResultCallback.onResult(false, new PTYError(null, PTYErrorCode.UNSUPPORT_TASK_TYPE.getCode(), 0, "ArtSorter was no longer supported", null), new PTYTaskData(this.LIZJ), null);
            return false;
        }
        throw new RuntimeException("ArtSorter was no longer supported, to get more information please contract with mabenteng");
    }
}
