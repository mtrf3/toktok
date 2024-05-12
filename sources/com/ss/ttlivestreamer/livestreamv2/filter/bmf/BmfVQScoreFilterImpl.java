package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C0H1;
import X.C16880lQ;
import X.C65232Piu;
import X.X1D;
import Y.ARunnableS11S0301000_11;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS17S0101000_13;
import android.content.Context;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bmf_mods_api.VqscoreLiveAPI;
import com.bytedance.bmf_mods_api.e;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import defpackage.i0;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BmfVQScoreFilterImpl extends BmfVQScoreFilter implements e {
    public static final String TAG = C16880lQ.LJLLJ(BmfVQScoreFilterImpl.class);
    public int mByteNNForwardType;
    public long mFrameCountInTrigger;
    public long mFrameInterval;
    public long mFrameNum;
    public Handler mGLHandler;
    public long mLastTriggerTime;
    public String mProgramCache;
    public int mThreadNum;
    public long mTriggerInterval;
    public boolean mUseFp16;
    public VqscoreLiveAPI mVQScoreLive;

    public static /* synthetic */ void LIZ(BmfVQScoreFilterImpl bmfVQScoreFilterImpl) {
        bmfVQScoreFilterImpl.lambda$callback$2();
    }

    public static /* synthetic */ void LIZJ(BmfVQScoreFilterImpl bmfVQScoreFilterImpl, JSONObject jSONObject, Context context) {
        bmfVQScoreFilterImpl.lambda$new$0(jSONObject, context);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilter
    public synchronized void release() {
        VqscoreLiveAPI vqscoreLiveAPI = this.mVQScoreLive;
        if (vqscoreLiveAPI != null) {
            try {
                vqscoreLiveAPI.Free();
            } catch (Throwable th) {
                BmfVQScoreFilter.printErrorLog(TAG, "Call VideoBrightAPI.Free failed. ", th);
            }
            this.mVQScoreLive = null;
        }
    }

    public /* synthetic */ void lambda$callback$1() {
        VqscoreLiveAPI vqscoreLiveAPI = this.mVQScoreLive;
        if (vqscoreLiveAPI == null) {
            return;
        }
        try {
            int Init = vqscoreLiveAPI.Init(this.mThreadNum, this.mByteNNForwardType, this.mUseFp16, this.mProgramCache);
            if (Init != 0) {
                release();
                String str = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Call VqscoreLiveAPI.Init failed: threadNum ");
                LIZ.append(this.mThreadNum);
                LIZ.append(", byteNNForwardType ");
                LIZ.append(this.mByteNNForwardType);
                LIZ.append(", ret ");
                LIZ.append(Init);
                onError(Init - 200, str, X1D.LIZIZ(LIZ), null);
            } else {
                this.mLastCode = 0;
            }
        } catch (Throwable th) {
            release();
            String str2 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Call VqscoreLiveAPI.Init exception: threadNum ");
            LIZ2.append(this.mThreadNum);
            LIZ2.append(", byteNNForwardType ");
            LIZ2.append(this.mByteNNForwardType);
            onError(-6, str2, X1D.LIZIZ(LIZ2), th);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilter
    public JSONObject getStatus() {
        double d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_code", this.mLastCode);
            synchronized (this) {
                if (this.mVQScoreValueAvg >= 0.0f) {
                    if (this.mCostMsCount > 0) {
                        d = (this.mCostMsAccum * 1.0f) / this.mCostMsCount;
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    jSONObject.put("avg_cost_time", d);
                    jSONObject.put("vqscore_value", this.mVQScoreValueAvg);
                    this.mCostMsAccum = 0;
                    this.mCostMsCount = 0;
                    this.mVQScoreValueAvg = -1.0f;
                    if (this.mFrameCountInTrigger >= this.mFrameNum) {
                        this.mLastCode = -12;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public /* synthetic */ void lambda$callback$2() {
        release();
        onError(-9, TAG, "download model failed.", null);
    }

    @Override // X.InterfaceC58107MrH
    public void callback(int i) {
        if (i == 1) {
            this.mGLHandler.post(new ARunnableS17S0101000_13(5, this, 11));
        } else {
            this.mGLHandler.post(new ARunnableS15S0101000_11(3, this, 2));
        }
    }

    public /* synthetic */ void lambda$new$0(JSONObject jSONObject, Context context) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("accessKey", JSONObjectProtectorUtils.getString(jSONObject, "accessKey"));
            hashMap.put("appID", JSONObjectProtectorUtils.getString(jSONObject, "appID"));
            hashMap.put("appVersion", JSONObjectProtectorUtils.getString(jSONObject, "appVersion"));
            hashMap.put("platformSdkVersion", JSONObjectProtectorUtils.getString(jSONObject, "platformSdkVersion"));
            hashMap.put("deviceId", JSONObjectProtectorUtils.getString(jSONObject, "deviceId"));
            hashMap.put("host", JSONObjectProtectorUtils.getString(jSONObject, "host"));
            hashMap.put("sdkVersion", JSONObjectProtectorUtils.getString(jSONObject, "sdkVersion"));
            hashMap.put("status", JSONObjectProtectorUtils.getString(jSONObject, "status"));
            this.mVQScoreLive.DownloadModel(context, hashMap);
        } catch (Exception e) {
            release();
            onError(-3, TAG, "get params error", e);
        }
    }

    private String parseProgramCache(Context context, JSONObject jSONObject) {
        String optString = jSONObject.optString("programCache", "");
        if (context != null && optString.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLIIIL(context).getAbsolutePath());
            LIZ.append("/");
            LIZ.append(optString);
            String LIZIZ = X1D.LIZIZ(LIZ);
            try {
                File file = new File(LIZIZ);
                if (file.exists() && !file.isDirectory()) {
                    C16880lQ.LLLZZIL(file);
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                return LIZIZ;
            } catch (Exception unused) {
                return "";
            }
        }
        return optString;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilter
    public void process(int i, int i2, int i3) {
        if (!GlUtil.nativeIsOpenGlThread()) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("vqscore processing should be in a opengl thread.");
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(TAG);
            LIZ.append(".process");
            tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
            if (TTLSBuildConfig.canThrowException()) {
                throw androidRuntimeException;
            }
        }
        if (this.mVQScoreLive == null || this.mLastCode == -8) {
            return;
        }
        if (!this.mEnable) {
            this.mLastCode = -1;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mLastTriggerTime + this.mTriggerInterval;
        if (currentTimeMillis < j && this.mFrameCountInTrigger >= this.mFrameNum) {
            return;
        }
        if (currentTimeMillis >= j) {
            this.mLastTriggerTime = currentTimeMillis;
            this.mFrameCountInTrigger = 0L;
            this.mVQScoreValueAccum = 0.0f;
        }
        if (currentTimeMillis < (this.mFrameCountInTrigger * this.mFrameInterval) + this.mLastTriggerTime) {
            return;
        }
        if (this.sb == null) {
            this.sb = new StringBuilder();
        }
        this.sb.setLength(0);
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            float Process = this.mVQScoreLive.Process(i, i2, i3);
            if (Process < 0.0f) {
                this.mLastCode = Math.round(Process) - 100;
                return;
            }
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            synchronized (this) {
                this.mCostMsAccum = (int) (this.mCostMsAccum + currentTimeMillis3);
                this.mCostMsCount++;
                this.mFrameCountInTrigger++;
                this.mVQScoreValueAccum += Process;
                long j2 = this.mFrameCountInTrigger;
                if (j2 >= this.mFrameNum || (j2 > 0 && currentTimeMillis + this.mFrameInterval >= this.mLastTriggerTime + this.mTriggerInterval)) {
                    this.mVQScoreValueAvg = this.mVQScoreValueAccum / ((float) this.mFrameCountInTrigger);
                }
            }
            if (DebugLogUtils.isEnableDebugLog()) {
                StringBuilder sb = this.sb;
                sb.append("Call VqscoreLiveAPI.Process success: texId ");
                sb.append(i);
                sb.append(", width ");
                sb.append(i2);
                sb.append(", height ");
                sb.append(i3);
                sb.append(", vqscore value ");
                sb.append(Process);
                sb.append(", cost time ");
                sb.append(currentTimeMillis3);
                sb.append("ms.");
                AVLog.w(TAG, this.sb.toString());
            }
            this.mLastCode = 0;
        } catch (Throwable unused) {
            this.mLastCode = -11;
        }
    }

    public BmfVQScoreFilterImpl(Context context, JSONObject jSONObject, Handler handler, Handler handler2) {
        this.mUseFp16 = true;
        this.mProgramCache = "";
        if (context == null || jSONObject == null || handler == null || handler2 == null) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("context ");
            LIZ.append(context);
            LIZ.append(", initParams ");
            LIZ.append(jSONObject);
            LIZ.append(", download handler ");
            LIZ.append(handler);
            LIZ.append(", glHandler ");
            LIZ.append(handler2);
            onError(-3, str, X1D.LIZIZ(LIZ), null);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("modelDownloadParams");
        if (optJSONObject == null) {
            String str2 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Init params don't contain model downloading params: ");
            LIZ2.append(jSONObject);
            onError(-3, str2, X1D.LIZIZ(LIZ2), null);
            return;
        }
        String[] strArr = {"accessKey", "appID", "appVersion", "platformSdkVersion", "deviceId", "host", "sdkVersion", "status"};
        int i = 0;
        do {
            String str3 = strArr[i];
            if (optJSONObject.isNull(str3)) {
                onError(-3, TAG, i0.LJFF("lack of param: ", str3), null);
                return;
            }
            i++;
        } while (i < 8);
        this.mGLHandler = handler2;
        this.mThreadNum = jSONObject.optInt("threadNum");
        this.mTriggerInterval = jSONObject.optInt("triggerInterval");
        this.mFrameNum = jSONObject.optInt("frameNum");
        this.mFrameInterval = jSONObject.optInt("frameInterval");
        this.mByteNNForwardType = jSONObject.optInt("byteNNForwardType");
        this.mUseFp16 = jSONObject.optBoolean("useFp16", true);
        this.mProgramCache = parseProgramCache(context, jSONObject);
        int i2 = this.mThreadNum;
        if (i2 >= 1 && i2 <= 8) {
            long j = this.mTriggerInterval;
            if (j >= 1000) {
                long j2 = this.mFrameNum;
                if (j2 >= 1) {
                    long j3 = this.mFrameInterval;
                    if (j3 >= 5 && j > j2 * j3) {
                        try {
                            try {
                                Object newInstance = Class.forName("com.bytedance.bmf_mods.VqscoreLive").getConstructor(new Class[0]).newInstance(new Object[0]);
                                if (newInstance instanceof VqscoreLiveAPI) {
                                    VqscoreLiveAPI vqscoreLiveAPI = (VqscoreLiveAPI) newInstance;
                                    this.mVQScoreLive = vqscoreLiveAPI;
                                    vqscoreLiveAPI.SetCallback(this);
                                    this.mLastCode = -8;
                                    handler.post(new ARunnableS11S0301000_11(this, optJSONObject, context, 0));
                                    return;
                                }
                                String str4 = TAG;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("instance type error: ");
                                LIZ3.append(newInstance);
                                onError(-4, str4, X1D.LIZIZ(LIZ3), null);
                                return;
                            } catch (Throwable unused) {
                                String str5 = TAG;
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("create instance failed: ");
                                LIZ4.append(jSONObject);
                                onError(-5, str5, X1D.LIZIZ(LIZ4), null);
                                return;
                            }
                        } catch (Exception e) {
                            onError(-2, TAG, "reflect error. ", e);
                            return;
                        }
                    }
                }
            }
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Params for vqscore rate control are illegal. They should meet these limits: 1 <= threadNum <= 8 && triggerInterval >= 1000 && frameNum > 1 && frameInterval >= 5 && triggerInterval > frameNum * frameInterval. Now they are: threadNum ");
        LIZ5.append(this.mThreadNum);
        LIZ5.append(", ");
        LIZ5.append("triggerInterval");
        LIZ5.append(" ");
        C65232Piu.LIZLLL(LIZ5, this.mTriggerInterval, ", ", "frameNum");
        LIZ5.append(" ");
        C65232Piu.LIZLLL(LIZ5, this.mFrameNum, ", ", "frameInterval");
        LIZ5.append(" ");
        onError(-3, TAG, C0H1.LIZJ(LIZ5, this.mFrameInterval, ".", LIZ5), null);
    }
}
