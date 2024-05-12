package X;

import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YZl, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87597YZl extends AbstractC87598YZm {
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Runnable-Paused info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJI(Object obj) {
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87596YZk(interfaceC87606YZu));
        this.LIZ.LJ(obj, new AqS182S0100000_16(this, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87597YZl(InterfaceC87606YZu<AbstractC87590YZe> context, Object obj) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = obj;
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZ.LJFF(e, false, true, happenTime);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZ.LJIIIIZZ(obj, z, false, true, happenTime);
    }
}
