package X;

import X.InterfaceC87609YZx;
import kotlin.jvm.internal.o;

/* renamed from: X.YZv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87607YZv<T extends InterfaceC87609YZx> implements InterfaceC87609YZx, InterfaceC87588YZc, InterfaceC87606YZu<T> {
    public final Object LIZ;
    public final InterfaceC87588YZc LIZIZ;
    public final C87608YZw<T> LIZJ;

    @Override // X.InterfaceC87609YZx
    public final void LIZ(Object obj) {
        this.LIZJ.LIZ(obj);
    }

    @Override // X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZJ.LIZJ(obj, z, happenTime);
    }

    @Override // X.InterfaceC87588YZc
    public final void LIZLLL(Object obj) {
        this.LIZIZ.LIZLLL(obj);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJ(Object obj, InterfaceC88472Yns<? super AbstractC87605YZt, C76800UCe> hasResultOnPaused) {
        o.LJIIIZ(hasResultOnPaused, "hasResultOnPaused");
        this.LIZIZ.LJ(obj, hasResultOnPaused);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJFF(C42360Gjs e, boolean z, boolean z2, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZIZ.LJFF(e, z, z2, happenTime);
    }

    @Override // X.InterfaceC87609YZx
    public final void LJI(Object obj) {
        this.LIZJ.LJI(obj);
    }

    @Override // X.InterfaceC87609YZx
    public final void LJII(Object obj) {
        this.LIZJ.LJII(obj);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIIZZ(Object obj, boolean z, boolean z2, boolean z3, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZIZ.LJIIIIZZ(obj, z, z2, z3, happenTime);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIZ(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        this.LIZIZ.LJIIIZ(cause);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIJ(Object obj) {
        this.LIZIZ.LJIIJ(obj);
    }

    @Override // X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZJ.LJIIJJI(e, happenTime);
    }

    @Override // X.InterfaceC87609YZx
    public final void LJIIL(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        this.LIZJ.LJIIL(cause);
    }

    @Override // X.InterfaceC87588YZc
    public final void onStart() {
        this.LIZIZ.onStart();
    }

    @Override // X.InterfaceC87609YZx
    public final void start() {
        this.LIZJ.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC87606YZu
    public final void LIZIZ(InterfaceC87609YZx interfaceC87609YZx) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Node:");
        LIZ.append(this.LIZ);
        LIZ.append(" ChangeState from:");
        T t = this.LIZJ.LIZ;
        if (t != null) {
            LIZ.append(t);
            LIZ.append(" to ");
            LIZ.append(interfaceC87609YZx);
            C41816Gb6.LIZ(X1D.LIZIZ(LIZ));
            C87608YZw<T> c87608YZw = this.LIZJ;
            c87608YZw.getClass();
            c87608YZw.LIZ = interfaceC87609YZx;
            return;
        }
        o.LJIJI("invoker");
        throw null;
    }

    public C87607YZv(Object tag, InterfaceC88472Yns initState, InterfaceC87588YZc interfaceC87588YZc) {
        C87608YZw<T> c87608YZw = new C87608YZw<>();
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(initState, "initState");
        this.LIZ = tag;
        this.LIZIZ = interfaceC87588YZc;
        this.LIZJ = c87608YZw;
        T invoker = (T) initState.invoke(this);
        o.LJIIIZ(invoker, "invoker");
        c87608YZw.LIZ = invoker;
    }
}
