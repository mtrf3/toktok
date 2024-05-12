package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class QRT {
    public static volatile QRT LIZIZ;
    public final Context LIZ;

    public final synchronized QS5 LIZIZ() {
        Class<?> cls;
        try {
            cls = Class.forName("com.a.b.AKeeperImpl");
        } catch (Throwable unused) {
            return null;
        }
        return (QS5) cls.getMethod("inst", new Class[0]).invoke(cls, new Object[0]);
    }

    public final void LIZ() {
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(this, 118);
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            RunnableC39007FSp.LIZIZ(aRunnableS47S0100000_11);
        } else {
            aRunnableS47S0100000_11.run();
        }
    }

    public QRT(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
        QP5.LIZ();
    }

    public static QRT LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (QRT.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QRT(context);
                }
            }
        }
        return LIZIZ;
    }
}
