package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.util.Log;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.b1;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class BmfVideoDenoiseFilter {
    public static final String TAG = C16880lQ.LJLLJ(BmfVideoDenoiseFilter.class);
    public volatile int mLastCode;
    public int mMask;

    /* loaded from: classes12.dex */
    public interface Callback {
        int getCameraFacing();

        int getCameraISO();

        int[] getPushStreamSize();

        void onBitrateRatioChange(float f);
    }

    public abstract JSONObject getStatus();

    public abstract boolean isInplaceProcess2D();

    public abstract int process(int i, boolean z, int i2, int i3, float[] fArr, int[] iArr);

    public abstract void release();

    public abstract void updateParams(JSONObject jSONObject);

    public boolean enable() {
        if (this.mMask == 0) {
            return true;
        }
        return false;
    }

    public void enable(boolean z, int i) {
        int i2;
        if (z) {
            i2 = this.mMask & (~i);
        } else {
            i2 = this.mMask | i;
        }
        this.mMask = i2;
    }

    public static BmfVideoDenoiseFilter Create(Context context, JSONObject jSONObject, Callback callback) {
        if (jSONObject != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(BmfVideoDenoiseFilter.class.getPackage().getName());
                LIZ.append(".BmfVideoDenoiseFilterImpl");
                return (BmfVideoDenoiseFilter) Class.forName(X1D.LIZIZ(LIZ)).getDeclaredConstructor(Context.class, JSONObject.class, Callback.class).newInstance(context, jSONObject, callback);
            } catch (InvocationTargetException e) {
                printErrorLog(TAG, "create BmfVideoDenoiseFilterImpl failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                printErrorLog(TAG, "reflect BmfVideoDenoiseFilterImpl failed. ", th);
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
