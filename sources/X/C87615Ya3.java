package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.AqS198S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87615Ya3 implements InterfaceC87588YZc {
    public final /* synthetic */ C87614Ya2 LIZ;

    @Override // X.InterfaceC87588YZc
    public final void onStart() {
        C87614Ya2 c87614Ya2 = this.LIZ;
        c87614Ya2.LJII(new C41870Gby(c87614Ya2.LJII, new ERR(c87614Ya2.LJ), new C41875Gc3(0)));
        C87614Ya2 c87614Ya22 = this.LIZ;
        c87614Ya22.getClass();
        if (!new AqS165S0100000_15(c87614Ya22, 20).LIZ$0()) {
            C87621Ya9 c87621Ya9 = new C87621Ya9(new AqS166S0100000_16(new AqS198S0100000_16(c87614Ya22, 0), 0));
            C87612Ya0 c87612Ya0 = new C87612Ya0(c87621Ya9.LIZIZ, c87621Ya9.LIZJ);
            c87612Ya0.LIZIZ = c87621Ya9.LIZ;
            c87614Ya22.LJIIIZ(new AqS182S0100000_16(c87612Ya0, 5), true);
            for (C87612Ya0 c87612Ya02 : this.LIZ.LJIIIIZZ) {
                c87612Ya02.LIZLLL();
            }
            return;
        }
        throw new C41815Gb5("net has circle", String.valueOf(777003), null, 4, null);
    }

    public C87615Ya3(C87614Ya2 c87614Ya2) {
        this.LIZ = c87614Ya2;
    }

    @Override // X.InterfaceC87588YZc
    public final void LIZLLL(Object obj) {
        if (this.LIZ.LIZJ() instanceof YZS) {
            C87614Ya2 c87614Ya2 = this.LIZ;
            c87614Ya2.LJII(new C41867Gbv(new C41875Gc3(0), c87614Ya2.LJII, obj));
        } else {
            C87614Ya2 c87614Ya22 = this.LIZ;
            c87614Ya22.LJII(new C41868Gbw(new C41875Gc3(0), c87614Ya22.LJII, obj));
        }
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIZ(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        C87614Ya2 c87614Ya2 = this.LIZ;
        c87614Ya2.LJII(new C41853Gbh(c87614Ya2.LJII, new C41875Gc3(0), cause));
        C87622YaA.LIZ(this.LIZ, new AqS182S0100000_16(cause, 1));
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIJ(Object obj) {
        this.LIZ.getClass();
        this.LIZ.LJIIIZ(new AqS182S0100000_16(obj, 2), false);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJ(Object obj, InterfaceC88472Yns<? super AbstractC87605YZt, C76800UCe> hasResultOnPaused) {
        o.LJIIIZ(hasResultOnPaused, "hasResultOnPaused");
        this.LIZ.getClass();
        this.LIZ.LJIIIZ(new AqS182S0100000_16(obj, 3), false);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJFF(C42360Gjs e, boolean z, boolean z2, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        C87614Ya2 c87614Ya2 = this.LIZ;
        c87614Ya2.LJII(new C41851Gbf(c87614Ya2.LJII, e, happenTime));
        C87622YaA.LIZ(this.LIZ, new AqS182S0100000_16(e, 4));
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIIZZ(Object obj, boolean z, boolean z2, boolean z3, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        C87614Ya2 c87614Ya2 = this.LIZ;
        c87614Ya2.LJII(new C41852Gbg(c87614Ya2.LJII, obj, z, happenTime));
    }
}
