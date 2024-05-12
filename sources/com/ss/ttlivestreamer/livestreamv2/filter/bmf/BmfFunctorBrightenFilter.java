package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.m;
import com.google.gson.o;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfSdkWrapper;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BmfFunctorBrightenFilter extends BmfBrightenFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfFunctorBrightenFilter.class);
    public volatile boolean mLastBrightenState;
    public BmfBrightenFilter.Listener mListener;
    public BmfSdkWrapper.ModuleFunctor mSrFunc;

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter
    public synchronized void release() {
        try {
            BmfSdkWrapper.ModuleFunctor moduleFunctor = this.mSrFunc;
            if (moduleFunctor != null) {
                moduleFunctor.free();
                this.mSrFunc = null;
            }
        } finally {
        }
    }

    public BmfFunctorBrightenFilter(Context context, JSONObject jSONObject, BmfBrightenFilter.Listener listener) {
        String str = TAG;
        AVLog.iow(str, "load bright module");
        if (loadBmfSos() != 0) {
            return;
        }
        if (context != null && jSONObject != null) {
            try {
                JSONObjectProtectorUtils.getInt(jSONObject, "init_fps");
                JSONObjectProtectorUtils.getInt(jSONObject, "normal_fps");
                JSONObjectProtectorUtils.getInt(jSONObject, "long_sw");
                JSONObjectProtectorUtils.getInt(jSONObject, "lum_thre");
                try {
                    BmfSdkWrapper.ModuleInfo newInstance = BmfSdkWrapper.ModuleInfo.newInstance("Brighten_Module", "c++", "libbmf_hydra.so", "");
                    try {
                        new o();
                        this.mSrFunc = BmfSdkWrapper.ModuleFunctor.newInstance(newInstance, (m) o.LIZ(jSONObject.toString()));
                        this.mListener = listener;
                        AVLog.iow(str, "load bright module success");
                        return;
                    } catch (Throwable th) {
                        BmfSdkWrapper.ModuleFunctor moduleFunctor = this.mSrFunc;
                        if (moduleFunctor != null) {
                            try {
                                moduleFunctor.free();
                            } catch (Throwable unused) {
                            }
                            this.mSrFunc = null;
                        }
                        onError(-5, TAG, "Create ModuleFunctor failed.", th);
                        return;
                    }
                } catch (Throwable th2) {
                    BmfBrightenFilter.printErrorLog(TAG, "Create ModuleInfo failed.", th2);
                    if (th2 == BmfSdkWrapper.bmfInvalidException) {
                        this.mLastCode = -2;
                        return;
                    } else {
                        this.mLastCode = -4;
                        return;
                    }
                }
            } catch (Throwable th3) {
                String str2 = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Check initParams failed: ");
                LIZ.append(jSONObject);
                onError(-3, str2, X1D.LIZIZ(LIZ), th3);
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Param error. context: ");
        LIZ2.append(context);
        LIZ2.append(", initParams: ");
        LIZ2.append(jSONObject);
        onError(-3, str, X1D.LIZIZ(LIZ2), null);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter
    public int process(int i, int i2, int i3, int i4, long j) {
        m mVar;
        boolean z;
        int i5;
        if (this.mSrFunc == null) {
            return this.mLastCode;
        }
        if (!this.mEnable) {
            this.mLastCode = -9;
            return this.mLastCode;
        }
        m mVar2 = new m();
        try {
            mVar2.LJJIIJ("input_texture", Integer.valueOf(i));
            mVar2.LJJIIJ("output_texture", Integer.valueOf(i2));
            mVar2.LJJIIJ("width", Integer.valueOf(i3));
            mVar2.LJJIIJ("height", Integer.valueOf(i4));
            mVar2.LJJIIJ("timestamp", Long.valueOf(j));
            if (this.sb == null) {
                this.sb = new StringBuilder();
            }
            int i6 = 0;
            this.sb.setLength(0);
            long currentTimeMs = TimeUtils.currentTimeMs();
            try {
                mVar = this.mSrFunc.call(mVar2);
            } catch (Throwable th) {
                th = th;
                mVar = null;
            }
            try {
                long currentTimeMs2 = TimeUtils.currentTimeMs() - currentTimeMs;
                synchronized (this) {
                    this.mCostMsAccum = (int) (this.mCostMsAccum + currentTimeMs2);
                    this.mCostMsCount++;
                }
                if (mVar != null && mVar.LJJIJLIJ("output_texture")) {
                    if (mVar.LJJIJL("output_texture").LJIILJJIL() == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (DebugLogUtils.isEnableDebugLog()) {
                        StringBuilder sb = this.sb;
                        sb.append("Call bright module success. input: ");
                        sb.append(mVar2);
                        sb.append(". output: ");
                        sb.append(mVar);
                        sb.append(". brighten: ");
                        sb.append(z);
                        sb.append(". cost ");
                        sb.append(currentTimeMs2);
                        sb.append("ms.");
                        AVLog.d(TAG, this.sb.toString());
                    }
                    if (z != this.mLastBrightenState) {
                        BmfBrightenFilter.Listener listener = this.mListener;
                        if (listener != null) {
                            if (z) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            listener.onEvent(1, i5, null, null);
                        }
                        this.mLastBrightenState = z;
                    }
                    if (!z) {
                        i6 = -8;
                    }
                    this.mLastCode = i6;
                    return this.mLastCode;
                }
                if (currentTimeMs - this.mLastReportTime >= 30000) {
                    this.mLastReportTime = currentTimeMs;
                    StringBuilder sb2 = this.sb;
                    sb2.append("output error: ");
                    sb2.append(mVar);
                    BmfBrightenFilter.printErrorLog(TAG, this.sb.toString(), null);
                }
                this.mLastCode = -100;
                return this.mLastCode;
            } catch (Throwable th2) {
                th = th2;
                if (currentTimeMs - this.mLastReportTime >= 30000) {
                    this.mLastReportTime = currentTimeMs;
                    StringBuilder sb3 = this.sb;
                    sb3.append("Call bright module failed. input: ");
                    sb3.append(mVar2);
                    sb3.append(". output: ");
                    sb3.append(mVar);
                    BmfBrightenFilter.printErrorLog(TAG, this.sb.toString(), th);
                }
                this.mLastCode = -11;
                return this.mLastCode;
            }
        } catch (Exception unused) {
            this.mLastCode = -10;
            return this.mLastCode;
        }
    }
}
