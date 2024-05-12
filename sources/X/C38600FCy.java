package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FCy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38600FCy {
    public static final C38600FCy LIZJ = new C38600FCy();
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C60665NrR LIZIZ = new C60665NrR();

    public final synchronized void LIZ() {
        AtomicBoolean atomicBoolean = LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        C39890Fl8 c39890Fl8 = C39890Fl8.LJ;
        if (!c39890Fl8.LIZIZ()) {
            atomicBoolean.set(false);
            return;
        }
        FD5.LIZIZ.add(C38601FCz.LIZ);
        c39890Fl8.LIZ();
        C39862Fkg.LIZ();
        atomicBoolean.compareAndSet(false, true);
    }
}
