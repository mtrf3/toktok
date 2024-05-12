package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerThreadC66294Q0c extends HandlerThread {
    public HandlerThreadC66294Q0c() {
        super("BPEA_EVENT_CENTER");
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        boolean z = Q0O.LIZ;
        Q0Z.LIZLLL = new Handler(Q0Z.LIZJ.getLooper(), C66298Q0g.LJLIL);
        try {
            if (Q0O.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("send cache event,cache size = ");
                LIZ.append(Q0Z.LJ.size());
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIJ(msg, "msg");
            }
            if (Q0Z.LIZLLL != null) {
                Iterator<C66297Q0f> it = Q0Z.LJ.iterator();
                while (it.hasNext()) {
                    C66297Q0f event = it.next();
                    o.LJFF(event, "event");
                    Q0Z.LIZ(event);
                }
            }
            Q0Z.LJ.clear();
        } catch (Throwable unused) {
        }
    }
}
