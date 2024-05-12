package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66299Q0h {
    public static C66297Q0f LIZ(OHW certContext, String eventType) {
        C66297Q0f c66297Q0f;
        o.LJIIJ(certContext, "certContext");
        o.LJIIJ(eventType, "eventType");
        synchronized (C66297Q0f.LJIIIZ) {
            c66297Q0f = C66297Q0f.LJIIJ;
            if (c66297Q0f != null) {
                C66297Q0f.LJIIJ = c66297Q0f.LJIIIIZZ;
                c66297Q0f.LJIIIIZZ = null;
                C66297Q0f.LJIIJJI--;
            } else {
                c66297Q0f = new C66297Q0f();
            }
        }
        c66297Q0f.LIZ = certContext;
        c66297Q0f.LIZIZ = eventType;
        C66301Q0j c66301Q0j = c66297Q0f.LJ;
        if (!c66301Q0j.LIZLLL) {
            c66301Q0j.LIZLLL = true;
            c66301Q0j.LIZ.LIZ = System.currentTimeMillis();
            c66301Q0j.LIZIZ.LIZ = System.nanoTime();
            c66301Q0j.LIZJ.LIZ = SystemClock.currentThreadTimeMillis();
        }
        return c66297Q0f;
    }
}
