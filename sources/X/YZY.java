package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YZY extends YZX {
    public final String toString() {
        return "Runnable-Running";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZY(InterfaceC87606YZu<AbstractC87589YZd> context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LJII(Object obj) {
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZZ(interfaceC87606YZu, obj));
        this.LIZ.LJIIJ(obj);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZV(interfaceC87606YZu, e));
        this.LIZ.LJFF(e, false, false, happenTime);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZR(interfaceC87606YZu, obj));
        this.LIZ.LJIIIIZZ(obj, z, false, false, happenTime);
    }
}
