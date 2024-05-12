package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.C7MY;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bmf_mods_api.DenoiseAPI;
import com.google.android.gms.common.ConnectionResult;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter;
import java.io.File;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BmfVideoDenoiseFilterImpl extends BmfVideoDenoiseFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfVideoDenoiseFilterImpl.class);
    public int mAlgorithmType;
    public int mBackend;
    public float mBitrateRatioGE1080p;
    public float mBitrateRatioLT1080p;
    public BmfVideoDenoiseFilter.Callback mCallback;
    public DenoiseAPI mDenoise;
    public boolean mInplaceProcess2D;
    public int mPoolSize;
    public int mReservedParam;
    public float mCurrentBitrateRatio = -1.0f;
    public int[] mStreamSize = {0, 0};
    public final int[] mCalcISOBundle = new int[4];
    public int mCameraFacing = -1;
    public int mISO = -1;

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    public JSONObject getStatus() {
        int i;
        try {
            if (this.mDenoise == null) {
                if (this.mLastCode == 0) {
                    return null;
                }
                return new JSONObject().put("last_code", this.mLastCode);
            }
            if (this.mLastCode == 0 && ((i = this.mMask) == 0 || i == 1)) {
                int[] GetReport = this.mDenoise.GetReport();
                int i2 = this.mLastCode;
                if (GetReport == null || GetReport.length < 9) {
                    return null;
                }
                int i3 = GetReport[0];
                if (i3 == 0) {
                    enable(false, 1);
                    i2 = -6;
                } else {
                    enable(true, 1);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("last_code", i2);
                jSONObject.put("denoise_mask", this.mMask);
                jSONObject.put("state", i3);
                jSONObject.put("ab_strategy", GetReport[1]);
                jSONObject.put("strong_iso", GetReport[2]);
                jSONObject.put("medium_iso", GetReport[3]);
                jSONObject.put("weak_iso", GetReport[4]);
                jSONObject.put("blend_weight", GetReport[5]);
                jSONObject.put("iso_value", GetReport[6]);
                jSONObject.put("avg_cost_time", GetReport[8]);
                jSONObject.put("bitrate_ratio", this.mCurrentBitrateRatio);
                jSONObject.put("alg_type", this.mAlgorithmType);
                jSONObject.put("backend", this.mBackend);
                jSONObject.put("pool_size", this.mPoolSize);
                jSONObject.put("reserved_param", this.mReservedParam);
                return jSONObject;
            }
            return new JSONObject().put("last_code", this.mLastCode).put("denoise_mask", this.mMask);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    public synchronized void release() {
        this.mCallback = null;
        DenoiseAPI denoiseAPI = this.mDenoise;
        if (denoiseAPI != null) {
            denoiseAPI.Free();
            this.mDenoise = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    public boolean isInplaceProcess2D() {
        return this.mInplaceProcess2D;
    }

    private int calcISO(boolean z) {
        int i;
        int i2;
        if (z) {
            Arrays.fill(this.mCalcISOBundle, 0);
        }
        int[] iArr = this.mCalcISOBundle;
        int i3 = iArr[0];
        if (i3 <= 0) {
            i = 1;
        } else {
            i = 100;
        }
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = i4 + 1;
        iArr[1] = i7;
        if (i7 >= i) {
            iArr[1] = 0;
            BmfVideoDenoiseFilter.Callback callback = this.mCallback;
            if (callback != null) {
                i2 = callback.getCameraISO();
                if (i2 > 0) {
                    int[] iArr2 = this.mCalcISOBundle;
                    int i8 = i5 + 1;
                    iArr2[2] = i8;
                    int i9 = i6 + i2;
                    iArr2[3] = i9;
                    if (i8 >= 15) {
                        i3 = i9 / i8;
                        iArr2[0] = i3;
                        iArr2[2] = 0;
                        iArr2[3] = 0;
                    }
                }
            } else {
                i2 = -2;
            }
            this.mCalcISOBundle[0] = i2;
            return i2;
        }
        if (i3 == 0) {
            return 75;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void notifyBitrateRatioChange(boolean r8) {
        /*
            r7 = this;
            com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter$Callback r3 = r7.mCallback
            if (r3 != 0) goto L5
            return
        L5:
            int[] r6 = r3.getPushStreamSize()
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L27
            int r1 = r6.length
            r0 = 2
            if (r1 < r0) goto L27
            r1 = r6[r4]
            int[] r2 = r7.mStreamSize
            r0 = r2[r4]
            if (r1 != r0) goto L1f
            r1 = r6[r5]
            r0 = r2[r5]
            if (r1 == r0) goto L27
        L1f:
            r7.mStreamSize = r6
            r0 = 1
        L22:
            if (r8 != 0) goto L29
            if (r0 != 0) goto L29
            return
        L27:
            r0 = 0
            goto L22
        L29:
            boolean r0 = r7.enable()
            if (r0 == 0) goto L4a
            int[] r2 = r7.mStreamSize
            r0 = r2[r4]
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 < r1) goto L45
            r0 = r2[r5]
            if (r0 < r1) goto L45
            float r0 = r7.mBitrateRatioGE1080p
            r7.mCurrentBitrateRatio = r0
        L3f:
            float r0 = r7.mCurrentBitrateRatio
            r3.onBitrateRatioChange(r0)
            return
        L45:
            float r0 = r7.mBitrateRatioLT1080p
            r7.mCurrentBitrateRatio = r0
            goto L3f
        L4a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.mCurrentBitrateRatio = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl.notifyBitrateRatioChange(boolean):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    public void updateParams(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        boolean z2 = false;
        if (!jSONObject.isNull("enable")) {
            boolean enable = enable();
            if ((this.mMask & 8) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (jSONObject.optBoolean("enable", z)) {
                this.mMask &= -9;
            } else {
                this.mMask |= 8;
            }
            if (enable != enable()) {
                z2 = true;
            }
        }
        if (!jSONObject.isNull("bitrateRatios") && (optJSONObject = jSONObject.optJSONObject("bitrateRatios")) != null) {
            this.mBitrateRatioGE1080p = (float) optJSONObject.optDouble("ge1080p", this.mBitrateRatioGE1080p);
            this.mBitrateRatioLT1080p = (float) optJSONObject.optDouble("lt1080p", this.mBitrateRatioLT1080p);
        } else if (!z2) {
            return;
        }
        notifyBitrateRatioChange(true);
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

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    public void enable(boolean z, int i) {
        boolean z2;
        int i2 = this.mMask;
        boolean enable = enable();
        super.enable(z, i);
        if (i2 != i || enable != enable()) {
            String str = TAG;
            StringBuilder LJ = C7MY.LJ("video denoise mask changed from ", i2, " to ");
            LJ.append(this.mMask);
            AVLog.iow(str, X1D.LIZIZ(LJ));
        }
        if (enable != enable()) {
            z2 = true;
        } else {
            z2 = false;
        }
        notifyBitrateRatioChange(z2);
    }

    public BmfVideoDenoiseFilterImpl(Context context, JSONObject jSONObject, BmfVideoDenoiseFilter.Callback callback) {
        boolean z;
        int Init;
        this.mBitrateRatioGE1080p = -1.0f;
        this.mBitrateRatioLT1080p = -1.0f;
        this.mBackend = 2;
        this.mPoolSize = 3;
        this.mInplaceProcess2D = true;
        if (jSONObject == null) {
            onError(-3, TAG, "init params is null", null);
            return;
        }
        int optInt = jSONObject.optInt("maxWidth", LinkMicRtcMixBitrateSetting.DEFAULT);
        int optInt2 = jSONObject.optInt("maxHeight", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        int optInt3 = jSONObject.optInt("abStrategyV2", 0);
        if (optInt <= 0 || optInt2 <= 0 || optInt3 <= 0) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params for color hist are illegal: ");
            LIZ.append(jSONObject);
            onError(-3, str, X1D.LIZIZ(LIZ), null);
            return;
        }
        this.mInplaceProcess2D = jSONObject.optBoolean("inplaceProcess2D", true);
        if (!jSONObject.isNull("algorithmType")) {
            this.mAlgorithmType = jSONObject.optInt("algorithmType", 0);
            this.mBackend = jSONObject.optInt("backend", 2);
            this.mPoolSize = jSONObject.optInt("poolSize", 3);
            this.mReservedParam = jSONObject.optInt("reservedParam", !this.mInplaceProcess2D ? 1 : 0);
            z = true;
        } else {
            z = false;
        }
        int optInt4 = jSONObject.optInt("windowType", 1);
        boolean optBoolean = jSONObject.optBoolean("useFp16", true);
        int optInt5 = jSONObject.optInt("weakISO", 75);
        int optInt6 = jSONObject.optInt("mediumISO", 800);
        int optInt7 = jSONObject.optInt("strongISO", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        String parseProgramCache = parseProgramCache(context, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("bitrateRatios");
        if (optJSONObject != null) {
            this.mBitrateRatioGE1080p = (float) optJSONObject.optDouble("ge1080p", -1.0d);
            this.mBitrateRatioLT1080p = (float) optJSONObject.optDouble("lt1080p", -1.0d);
        }
        try {
            try {
                Object newInstance = Class.forName("com.bytedance.bmf_mods.Denoise").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof DenoiseAPI) {
                    DenoiseAPI denoiseAPI = (DenoiseAPI) newInstance;
                    this.mDenoise = denoiseAPI;
                    if (!z) {
                        Init = denoiseAPI.Init(optInt, optInt2, optInt4, optBoolean, parseProgramCache, optInt3, optInt7, optInt6, optInt5);
                    } else {
                        Init = denoiseAPI.Init(this.mAlgorithmType, this.mBackend, this.mPoolSize, optInt, optInt2, optInt4, optBoolean, parseProgramCache, optInt3, optInt7, optInt6, optInt5, this.mReservedParam);
                    }
                    if (Init != 0) {
                        String str2 = TAG;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Denoise.Init returns ");
                        LIZ2.append(Init);
                        onError(-7, str2, X1D.LIZIZ(LIZ2), null);
                        release();
                        return;
                    }
                    this.mLastCode = 0;
                    AVLog.iow(TAG, "Denoise.Init success.");
                    this.mCallback = callback;
                    notifyBitrateRatioChange(true);
                    return;
                }
                String str3 = TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("instance type error: ");
                LIZ3.append(newInstance);
                onError(-4, str3, X1D.LIZIZ(LIZ3), null);
            } catch (Throwable th) {
                String str4 = TAG;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("create instance failed: ");
                LIZ4.append(jSONObject);
                onError(-5, str4, X1D.LIZIZ(LIZ4), th);
                release();
            }
        } catch (Exception e) {
            onError(-2, TAG, "reflect error. ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
    
        if (r4 == r30[0]) goto L48;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int process(int r25, boolean r26, int r27, int r28, float[] r29, int[] r30) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl.process(int, boolean, int, int, float[], int[]):int");
    }
}
