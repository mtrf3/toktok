package X;

import X.InterfaceC87609YZx;
import kotlin.jvm.internal.o;

/* renamed from: X.YZw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87608YZw<T extends InterfaceC87609YZx> implements InterfaceC87609YZx {
    public T LIZ;

    @Override // X.InterfaceC87609YZx
    public final void start() {
        T t = this.LIZ;
        if (t != null) {
            t.start();
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LIZ(Object obj) {
        T t = this.LIZ;
        if (t != null) {
            t.LIZ(obj);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LJI(Object obj) {
        T t = this.LIZ;
        if (t != null) {
            t.LJI(obj);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LJII(Object obj) {
        T t = this.LIZ;
        if (t != null) {
            t.LJII(obj);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LJIIL(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        T t = this.LIZ;
        if (t != null) {
            t.LJIIL(cause);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        T t = this.LIZ;
        if (t != null) {
            t.LJIIJJI(e, happenTime);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }

    @Override // X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        T t = this.LIZ;
        if (t != null) {
            t.LIZJ(obj, z, happenTime);
        } else {
            o.LJIJI("invoker");
            throw null;
        }
    }
}
