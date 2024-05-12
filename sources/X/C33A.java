package X;

import kotlin.jvm.internal.o;

/* renamed from: X.33A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33A {
    public final InterfaceC70422pa LIZ;
    public final C776933d LIZIZ;
    public final C776532z LIZJ;
    public final C88213dB LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public boolean LJII;
    public final C70342pS LJIIIIZZ;

    public final C98453th LIZ() {
        return (C98453th) this.LJ.getValue();
    }

    public final void LIZIZ(boolean z) {
        C98453th LIZ = LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("refresh page ");
        LIZ2.append(z);
        LIZ.LJFF(X1D.LIZIZ(LIZ2));
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            XKX.LIZLLL(this.LIZ, null, null, new AnonymousClass334(this, currentTimeMillis, null), 3);
        } else {
            XKX.LIZLLL(this.LIZ, null, null, new AnonymousClass339(this, null), 3);
        }
    }

    public C33A(InterfaceC70422pa coroutineScope, C776933d c776933d, C776532z c776532z, C88213dB c88213dB) {
        o.LJIIIZ(coroutineScope, "coroutineScope");
        this.LIZ = coroutineScope;
        this.LIZIZ = c776933d;
        this.LIZJ = c776532z;
        this.LIZLLL = c88213dB;
        this.LJ = C221108m2.LIZIZ(C33D.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C33G.LJLIL);
        this.LJFF = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C33H.LJLIL);
        this.LJI = LIZIZ2;
        this.LJII = true;
        this.LJIIIIZZ = new C70342pS((InterfaceC65462ha) LIZIZ.getValue(), (InterfaceC70352pT) LIZIZ2.getValue(), new C33F(this, null));
    }
}
