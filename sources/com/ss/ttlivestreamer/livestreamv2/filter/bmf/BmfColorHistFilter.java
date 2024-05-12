package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import android.util.Log;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.b1;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class BmfColorHistFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfColorHistFilter.class);
    public boolean mEnable = true;
    public volatile int mLastCode;

    /* loaded from: classes12.dex */
    public interface ResultCallback {
        void onResult(JSONObject jSONObject, long j);
    }

    public abstract JSONObject getStatus();

    public abstract void process(int i, boolean z, int i2, int i3, float[] fArr, long j);

    public abstract void release();

    public boolean enable() {
        return this.mEnable;
    }

    public void enable(boolean z) {
        this.mEnable = z;
    }

    public static BmfColorHistFilter Create(JSONObject jSONObject, ResultCallback resultCallback) {
        if (jSONObject != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(BmfColorHistFilter.class.getPackage().getName());
                LIZ.append(".BmfColorHistFilterImpl");
                return (BmfColorHistFilter) Class.forName(X1D.LIZIZ(LIZ)).getDeclaredConstructor(JSONObject.class, ResultCallback.class).newInstance(jSONObject, resultCallback);
            } catch (InvocationTargetException e) {
                printErrorLog(TAG, "create BmfColorHistFilterImpl failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                printErrorLog(TAG, "reflect BmfColorHistFilterImpl failed. ", th);
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
