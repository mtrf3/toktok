package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.b1;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class BmfVQScoreFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfVQScoreFilter.class);
    public volatile int mCostMsAccum;
    public volatile int mCostMsCount;
    public volatile int mLastCode;
    public volatile float mVQScoreValueAccum;
    public StringBuilder sb;
    public boolean mEnable = true;
    public volatile float mVQScoreValueAvg = -1.0f;

    public abstract JSONObject getStatus();

    public abstract void process(int i, int i2, int i3);

    public abstract void release();

    public boolean enable() {
        return this.mEnable;
    }

    public void enable(boolean z) {
        this.mEnable = z;
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

    public static BmfVQScoreFilter Create(Context context, JSONObject jSONObject, Handler handler, Handler handler2) {
        if (context != null && jSONObject != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(BmfVQScoreFilter.class.getPackage().getName());
                LIZ.append(".BmfVQScoreFilterImpl");
                return (BmfVQScoreFilter) Class.forName(X1D.LIZIZ(LIZ)).getDeclaredConstructor(Context.class, JSONObject.class, Handler.class, Handler.class).newInstance(context, jSONObject, handler, handler2);
            } catch (InvocationTargetException e) {
                printErrorLog(TAG, "create BmfVQScoreFilter failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                printErrorLog(TAG, "reflect BmfVQScoreFilter failed. ", th);
                return null;
            }
        }
        return null;
    }

    public void onError(int i, String str, String str2, Throwable th) {
        this.mLastCode = i;
        printErrorLog(str, str2, th);
    }
}
