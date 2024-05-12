package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87591YZf extends AbstractC87600YZo {
    public final AbstractC42983Gtv LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Finish-Canceled cause:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LIZ(Object obj) {
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87592YZg(interfaceC87606YZu, obj));
        this.LIZ.LIZLLL(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87591YZf(InterfaceC87606YZu<AbstractC87590YZe> context, AbstractC42983Gtv cause) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cause, "cause");
        this.LIZJ = cause;
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87592YZg(interfaceC87606YZu, null));
        this.LIZ.LJFF(e, true, false, happenTime);
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87592YZg(interfaceC87606YZu, null));
        this.LIZ.LJIIIIZZ(obj, z, true, false, happenTime);
    }
}
