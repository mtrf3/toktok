package X;

import java.util.concurrent.Executor;

/* renamed from: X.W7c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81764W7c implements InterfaceC81759W6x<W8X> {
    public final Executor LIZ;
    public final W84 LIZIZ;
    public final InterfaceC81759W6x<W8X> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC79240V8a LJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        this.LIZJ.LIZIZ(new C81789W8b(this, w7f, interfaceC81770W7i, this.LIZLLL, this.LJ), interfaceC81770W7i);
    }

    public C81764W7c(Executor executor, W84 w84, InterfaceC81759W6x<W8X> interfaceC81759W6x, boolean z, InterfaceC79240V8a interfaceC79240V8a) {
        executor.getClass();
        this.LIZ = executor;
        w84.getClass();
        this.LIZIZ = w84;
        this.LIZJ = interfaceC81759W6x;
        interfaceC79240V8a.getClass();
        this.LJ = interfaceC79240V8a;
        this.LIZLLL = z;
    }
}
