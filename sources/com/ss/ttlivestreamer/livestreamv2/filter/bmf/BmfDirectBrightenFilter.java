package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.C1EU;
import X.V1I;
import X.X1D;
import android.content.Context;
import com.bytedance.bmf_mods_api.VideoBrightAPI;
import com.bytedance.bmf_mods_api.d;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BmfDirectBrightenFilter extends BmfBrightenFilter implements d {
    public static final String TAG = C16880lQ.LJLLJ(BmfDirectBrightenFilter.class);
    public VideoBrightAPI mBright;
    public volatile boolean mLastBrightenState;
    public BmfBrightenFilter.Listener mListener;

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter
    public synchronized void release() {
        VideoBrightAPI videoBrightAPI = this.mBright;
        if (videoBrightAPI != null) {
            try {
                videoBrightAPI.Free();
            } catch (Throwable th) {
                BmfBrightenFilter.printErrorLog(TAG, "Call VideoBrightAPI.Free failed. ", th);
            }
            this.mBright = null;
        }
    }

    public BmfDirectBrightenFilter(Context context, JSONObject jSONObject, BmfBrightenFilter.Listener listener) {
        if (loadBmfSos() != 0) {
            return;
        }
        try {
            try {
                Object newInstance = Class.forName("com.bytedance.bmf_mods.VideoBright").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof VideoBrightAPI) {
                    VideoBrightAPI videoBrightAPI = (VideoBrightAPI) newInstance;
                    this.mBright = videoBrightAPI;
                    videoBrightAPI.SetCallback(this);
                    if (context != null && jSONObject != null) {
                        try {
                            try {
                                if (!this.mBright.Init(JSONObjectProtectorUtils.getInt(jSONObject, "init_fps"), JSONObjectProtectorUtils.getInt(jSONObject, "normal_fps"), JSONObjectProtectorUtils.getInt(jSONObject, "long_sw"), JSONObjectProtectorUtils.getInt(jSONObject, "lum_thre"))) {
                                    release();
                                    String str = TAG;
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("Call VideoBrightAPI.Init failed: ");
                                    LIZ.append(jSONObject);
                                    onError(-7, str, X1D.LIZIZ(LIZ), null);
                                    return;
                                }
                                this.mListener = listener;
                                return;
                            } catch (Throwable th) {
                                release();
                                String str2 = TAG;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Call VideoBrightAPI.Init exception: ");
                                LIZ2.append(jSONObject);
                                onError(-6, str2, X1D.LIZIZ(LIZ2), th);
                                return;
                            }
                        } catch (Throwable th2) {
                            release();
                            onError(-3, TAG, "Check initParams failed: " + jSONObject, th2);
                            return;
                        }
                    }
                    release();
                    String str3 = TAG;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Param error. context: ");
                    LIZ3.append(context);
                    LIZ3.append(", initParams: ");
                    LIZ3.append(jSONObject);
                    onError(-3, str3, X1D.LIZIZ(LIZ3), null);
                    return;
                }
                String str4 = TAG;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("instance type error: ");
                LIZ4.append(newInstance);
                onError(-4, str4, X1D.LIZIZ(LIZ4), null);
            } catch (Throwable unused) {
                String str5 = TAG;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("create instance failed: ");
                LIZ5.append(jSONObject);
                onError(-5, str5, X1D.LIZIZ(LIZ5), null);
            }
        } catch (Exception e) {
            onError(-2, TAG, "reflect error. ", e);
        }
    }

    @Override // com.bytedance.bmf_mods_api.d
    public void callback(int i, float f, float f2, float f3) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost_time", f);
            jSONObject.put("bright_before", f2);
            jSONObject.put("bright_after", f3);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        BmfBrightenFilter.Listener listener = this.mListener;
        if (listener != null) {
            if (i == 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            listener.onEvent(1, i2, jSONObject.toString(), null);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter
    public int process(int i, int i2, int i3, int i4, long j) {
        boolean z;
        int i5;
        if (this.mBright == null) {
            return this.mLastCode;
        }
        if (!this.mEnable) {
            this.mLastCode = -9;
            return this.mLastCode;
        }
        if (this.sb == null) {
            this.sb = new StringBuilder();
        }
        this.sb.setLength(0);
        long currentTimeMs = TimeUtils.currentTimeMs();
        try {
            int Process = this.mBright.Process(i, i2, i3, i4, j);
            long currentTimeMs2 = TimeUtils.currentTimeMs() - currentTimeMs;
            synchronized (this) {
                try {
                    try {
                        this.mCostMsAccum = (int) (this.mCostMsAccum + currentTimeMs2);
                        this.mCostMsCount++;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (currentTimeMs - this.mLastReportTime >= 30000) {
                        this.mLastReportTime = currentTimeMs;
                        this.sb.append("Call VideoBrightAPI.Process failed. ");
                        fillLog(i, i2, i3, i4, j, -1);
                        BmfBrightenFilter.printErrorLog(TAG, this.sb.toString(), th);
                    }
                    this.mLastCode = -11;
                    return this.mLastCode;
                }
            }
            if (Process == i2) {
                z = true;
            } else {
                z = false;
            }
            if (DebugLogUtils.isEnableDebugLog()) {
                this.sb.append("Call VideoBrightAPI.Process success. ");
                fillLog(i, i2, i3, i4, j, Process);
                StringBuilder sb = this.sb;
                sb.append("brighten: ");
                sb.append(z);
                sb.append(". cost ");
                sb.append(currentTimeMs2);
                sb.append("ms.");
                AVLog.d(TAG, this.sb.toString());
            }
            if (z != this.mLastBrightenState) {
                this.mLastBrightenState = z;
            }
            if (Process < 0) {
                i5 = Process - 100;
            } else {
                i5 = 0;
            }
            if (z) {
                i5 = 0;
            } else if (i5 == 0) {
                i5 = -8;
            }
            this.mLastCode = i5;
            return this.mLastCode;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void fillLog(int i, int i2, int i3, int i4, long j, int i5) {
        StringBuilder sb = this.sb;
        C1EU.LIZJ(sb, "input: {inTex ", i, ", outTex ", i2);
        C1EU.LIZJ(sb, ", width ", i3, ", height ", i4);
        sb.append(", timestamp ");
        sb.append(j);
        sb.append('}');
        V1I.LIZLLL(sb, ". output: {realOutTex: ", i5, "}. ");
    }
}
