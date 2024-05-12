package X;

import Y.ARunnableS12S0301000_12;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.LUh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54339LUh {
    public static volatile Handler LIZ;

    public static Handler LIZJ() {
        boolean z;
        if (LIZ == null) {
            synchronized (C54339LUh.class) {
                if (LIZ == null) {
                    if ((((Number) C52985Kqr.LIZ.getValue()).intValue() & 4) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HandlerThread handlerThread = new HandlerThread("ImageStopLossLanect");
                        handlerThread.start();
                        LIZ = new Handler(handlerThread.getLooper());
                    } else {
                        LIZ = new Handler(C16880lQ.LLJJJJ());
                    }
                }
            }
        }
        return LIZ;
    }

    public static void LIZ(Object obj) {
        Activity LIZIZ;
        if ((((Number) C52985Kqr.LIZ.getValue()).intValue() & 1) == 1) {
            return;
        }
        ImageView imageView = (ImageView) obj;
        if ((imageView instanceof C77919Ui3) || (imageView instanceof C73336SqK)) {
            return;
        }
        try {
            if (imageView.getDrawable() == null || (LIZIZ = LIZIZ(imageView.getContext())) == null || !LIZIZ.isDestroyed()) {
                return;
            }
            LIZJ().postDelayed(new ARunnableS12S0301000_12(2, new WeakReference(imageView), LIZIZ, imageView, 4), 2000L);
        } catch (Exception unused) {
        }
    }

    public static Activity LIZIZ(Context context) {
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            return LJIJJ;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
