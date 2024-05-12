package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EfL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36983EfL implements InterfaceC36606EYg {
    @Override // X.InterfaceC36606EYg
    public final void LIZ(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        synchronized (C36982EfK.LJII) {
            Runnable runnable = C36982EfK.LJFF;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // X.InterfaceC36606EYg
    public final void LIZIZ(C36754Ebe c36754Ebe) {
        synchronized (C36982EfK.LJII) {
            OSJ<String, Long, ? extends C36754Ebe> osj = C36982EfK.LIZLLL;
            if (osj != null) {
                C36982EfK.LIZLLL = new OSJ<>(osj.getFirst(), osj.getSecond(), c36754Ebe);
            }
            Runnable runnable = C36982EfK.LJFF;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
