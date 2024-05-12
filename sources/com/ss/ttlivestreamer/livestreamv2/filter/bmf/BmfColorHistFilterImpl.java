package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bmf_mods_api.ColorHistAPI;
import com.google.gson.m;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BmfColorHistFilterImpl extends BmfColorHistFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfColorHistFilter.class);
    public BmfColorHistFilter.ResultCallback mCallback;
    public ColorHistAPI mColorHist;
    public int mGopCount;
    public int mGopMs;
    public volatile float mLastCostMs;
    public volatile String mLastResultStr;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mPresetMs;

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter
    public synchronized void release() {
        this.mCallback = null;
        ColorHistAPI colorHistAPI = this.mColorHist;
        if (colorHistAPI != null) {
            colorHistAPI.Free();
            this.mColorHist = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter
    public JSONObject getStatus() {
        if (this.mLastCode == -4) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_code", this.mLastCode);
            synchronized (this) {
                if (this.mLastResultStr != null) {
                    jSONObject.put("result", this.mLastResultStr);
                    this.mLastResultStr = null;
                    jSONObject.put("avg_cost_time", this.mLastCostMs);
                    this.mLastCostMs = 0.0f;
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public BmfColorHistFilterImpl(JSONObject jSONObject, BmfColorHistFilter.ResultCallback resultCallback) {
        int optInt;
        int optInt2;
        if (jSONObject == null) {
            onError(-4, TAG, "init params is null", null);
            return;
        }
        if (jSONObject.isNull("maxWidth")) {
            optInt = LinkMicRtcMixBitrateSetting.DEFAULT;
        } else {
            optInt = jSONObject.optInt("maxWidth");
        }
        this.mMaxWidth = optInt;
        if (jSONObject.isNull("maxHeight")) {
            optInt2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        } else {
            optInt2 = jSONObject.optInt("maxHeight");
        }
        this.mMaxHeight = optInt2;
        this.mGopMs = jSONObject.optInt("gopMs");
        this.mGopCount = jSONObject.optInt("gopCount");
        int optInt3 = jSONObject.optInt("preset");
        this.mPresetMs = optInt3;
        this.mCallback = resultCallback;
        if (this.mMaxWidth <= 0 || this.mMaxHeight <= 0) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init params disabled the algorithm: ");
            LIZ.append(jSONObject);
            onError(-4, str, X1D.LIZIZ(LIZ), null);
            return;
        }
        if (this.mGopMs <= 1000 || this.mGopCount <= 0 || optInt3 <= 0) {
            String str2 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init params illegal: ");
            LIZ2.append(jSONObject);
            onError(-3, str2, X1D.LIZIZ(LIZ2), null);
            return;
        }
        try {
            try {
                Object newInstance = Class.forName("com.bytedance.bmf_mods.ColorHist").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof ColorHistAPI) {
                    ColorHistAPI colorHistAPI = (ColorHistAPI) newInstance;
                    this.mColorHist = colorHistAPI;
                    int Init = colorHistAPI.Init(this.mMaxWidth, this.mMaxHeight, this.mGopMs, this.mGopCount, this.mPresetMs);
                    if (Init != 0) {
                        String str3 = TAG;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("ColorHist.Init returns ");
                        LIZ3.append(Init);
                        onError(Init - 100, str3, X1D.LIZIZ(LIZ3), null);
                        release();
                        return;
                    }
                    this.mLastCode = 0;
                    AVLog.iow(TAG, "ColorHist.Init success.");
                    return;
                }
                String str4 = TAG;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("instance type error: ");
                LIZ4.append(newInstance);
                onError(-5, str4, X1D.LIZIZ(LIZ4), null);
            } catch (Throwable th) {
                String str5 = TAG;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("create instance failed: ");
                LIZ5.append(jSONObject);
                onError(-6, str5, X1D.LIZIZ(LIZ5), th);
                release();
            }
        } catch (Exception e) {
            onError(-2, TAG, "reflect error. ", e);
        }
    }

    private void reportResult(String str, long j) {
        if (this.mCallback != null) {
            try {
                this.mCallback.onResult(new JSONObject(str), j);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter
    public void process(int i, boolean z, int i2, int i3, float[] fArr, long j) {
        int ProcessTexture;
        String str;
        if (this.mColorHist == null) {
            return;
        }
        int i4 = -1;
        if (!this.mEnable) {
            this.mLastCode = -1;
            return;
        }
        try {
            long nativeNanoTime = TimeUtils.nativeNanoTime();
            if (z) {
                ProcessTexture = this.mColorHist.ProcessOesTexture(i, i2, i3, fArr, j);
            } else {
                ProcessTexture = this.mColorHist.ProcessTexture(i, i2, i3, j);
            }
            if (ProcessTexture == 1) {
                m GetResult = this.mColorHist.GetResult();
                float nativeNanoTime2 = ((float) (TimeUtils.nativeNanoTime() - nativeNanoTime)) / 1000000.0f;
                if (GetResult != null) {
                    str = GetResult.toString();
                } else {
                    str = null;
                }
                if (LogUtil.logFilterSwitch()) {
                    String str2 = TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("color hist result: ");
                    LIZ.append(str);
                    AVLog.d(str2, X1D.LIZIZ(LIZ));
                }
                reportResult(str, j);
                this.mLastCode = 0;
                synchronized (this) {
                    this.mLastCostMs = nativeNanoTime2;
                    this.mLastResultStr = str;
                }
                return;
            }
            if (ProcessTexture == 0) {
                if (LogUtil.logFilterSwitch()) {
                    AVLog.d(TAG, "color hist no result");
                    return;
                }
                return;
            }
            if (LogUtil.logFilterSwitch()) {
                String str3 = TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("color hist result error: ");
                LIZ2.append(ProcessTexture);
                AVLog.d(str3, X1D.LIZIZ(LIZ2));
            }
            if (ProcessTexture < 0) {
                i4 = 1;
            }
            this.mLastCode = (i4 * (-200)) + ProcessTexture;
        } catch (Exception unused) {
            this.mLastCode = -9;
        }
    }
}
