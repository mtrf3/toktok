package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes12.dex */
public final class QMP {
    public static volatile QMH LIZ;

    public static QMH LIZ(Context context) {
        HandlerThread LIZ2 = C06M.LIZ("wschannel");
        QGL qgl = new QGL();
        C66866QMc c66866QMc = new C66866QMc(context, qgl);
        QMH qmh = new QMH(context, LIZ2.getLooper(), new QMG(context), qgl, c66866QMc, new QMN(context, new WeakHandler(LIZ2.getLooper(), new QMQ())));
        c66866QMc.LJ = qmh;
        return qmh;
    }
}
