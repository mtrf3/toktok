package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZk, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87596YZk extends AbstractC87598YZm {
    public final String toString() {
        return "Runnable-Running";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87596YZk(InterfaceC87606YZu<AbstractC87590YZe> context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJII(Object obj) {
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87597YZl(interfaceC87606YZu, obj));
        this.LIZ.LJIIJ(obj);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87593YZh(interfaceC87606YZu, e));
        this.LIZ.LJFF(e, false, false, happenTime);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87595YZj(interfaceC87606YZu, obj));
        this.LIZ.LJIIIIZZ(obj, z, false, false, happenTime);
    }
}
