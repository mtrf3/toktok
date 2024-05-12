package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class QCX {
    public static final QCX LIZIZ = new QCX();
    public C67166QXq LIZ;

    public static C67166QXq LIZ(Context context) {
        C67166QXq c67166QXq;
        QCX qcx = LIZIZ;
        synchronized (qcx) {
            if (qcx.LIZ == null) {
                if (C16880lQ.LLLLL(context) != null) {
                    context = C16880lQ.LLLLL(context);
                }
                qcx.LIZ = new C67166QXq(context);
            }
            c67166QXq = qcx.LIZ;
        }
        return c67166QXq;
    }
}
