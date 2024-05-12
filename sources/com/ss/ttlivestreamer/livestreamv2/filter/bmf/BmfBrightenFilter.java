package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.util.Log;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import defpackage.a1;
import defpackage.b1;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class BmfBrightenFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfBrightenFilter.class);
    public volatile int mCostMsAccum;
    public volatile int mCostMsCount;
    public volatile int mLastCode;
    public long mLastReportTime;
    public StringBuilder sb;
    public volatile boolean mEnable = true;
    public final String[] mSoNames = {"hmp", "bmf_module_sdk", "bmf_hydra"};

    /* loaded from: classes12.dex */
    public interface Listener {
        void onEvent(int i, int i2, String str, Throwable th);
    }

    public abstract int process(int i, int i2, int i3, int i4, long j);

    public abstract void release();

    public JSONObject getStatus() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_code", this.mLastCode);
            synchronized (this) {
                if (this.mCostMsCount > 0) {
                    i = Math.round((this.mCostMsAccum * 1.0f) / this.mCostMsCount);
                } else {
                    i = 0;
                }
                jSONObject.put("avg_cost_time", i);
                this.mCostMsAccum = 0;
                this.mCostMsCount = 0;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int loadBmfSos() {
        boolean loadLibrary;
        String LIZIZ;
        if (this.mLastCode != 0) {
            return this.mLastCode;
        }
        for (String str : this.mSoNames) {
            try {
                loadLibrary = LibraryLoader.loadLibrary(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("LibraryLoader.loadLibrary(");
                LIZ.append(str);
                LIZ.append("): ");
                LIZ.append(loadLibrary);
                LIZIZ = X1D.LIZIZ(LIZ);
                AVLog.ioi(TAG, LIZIZ);
            } catch (Throwable th) {
                String str2 = TAG;
                printErrorLog(str2, "", th);
                try {
                    C16880lQ.LLJJJIL(str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("System.loadLibrary(");
                    LIZ2.append(str);
                    LIZ2.append(") success");
                    AVLog.ioi(str2, X1D.LIZIZ(LIZ2));
                } catch (Throwable th2) {
                    onError(-1, TAG, a1.LJ("load library (", str, ") failed. "), th2);
                }
            }
            if (loadLibrary) {
                continue;
            } else {
                throw new Exception(LIZIZ);
                break;
            }
        }
        return this.mLastCode;
    }

    public boolean enable() {
        return this.mEnable;
    }

    public void enable(boolean z) {
        this.mEnable = z;
    }

    public static BmfBrightenFilter Create(Context context, JSONObject jSONObject, Listener listener) {
        if (context != null && jSONObject != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(BmfBrightenFilter.class.getPackage().getName());
                LIZ.append(".BmfDirectBrightenFilter");
                return (BmfBrightenFilter) Class.forName(X1D.LIZIZ(LIZ)).getDeclaredConstructor(Context.class, JSONObject.class, Listener.class).newInstance(context, jSONObject, listener);
            } catch (InvocationTargetException e) {
                printErrorLog(TAG, "create BmfDirectBrightenFilter failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                printErrorLog(TAG, "reflect BmfDirectBrightenFilter failed. ", th);
                return null;
            }
        }
        return null;
    }

    public static void printErrorLog(String str, String str2, Throwable th) {
        if (th != null) {
            if (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            }
            StringBuilder LIZJ = b1.LIZJ(str2, " stack: ");
            LIZJ.append(Log.getStackTraceString(th));
            str2 = X1D.LIZIZ(LIZJ);
        }
        AVLog.ioe(str, str2);
    }

    public void onError(int i, String str, String str2, Throwable th) {
        this.mLastCode = i;
        printErrorLog(str, str2, th);
    }
}
