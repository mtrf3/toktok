package X;

import android.content.Context;
import android.os.HandlerThread;

/* loaded from: classes12.dex */
public final class QMS {
    public static volatile QMH LIZ;

    public static QMH LIZ(Context context) {
        HandlerThread LIZ2 = C06M.LIZ("wschannel");
        QGL qgl = new QGL();
        C66867QMd c66867QMd = new C66867QMd(context, qgl);
        QMH qmh = new QMH(context, LIZ2.getLooper(), new QMT(), qgl, c66867QMd, new QMU());
        c66867QMd.LJ = qmh;
        return qmh;
    }

    public static QMH LIZIZ(Context context) {
        if (LIZ == null) {
            synchronized (QMH.class) {
                if (LIZ == null) {
                    LIZ = LIZ(context);
                }
            }
        }
        return LIZ;
    }
}
