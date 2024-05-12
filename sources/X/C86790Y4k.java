package X;

import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.Y4k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86790Y4k implements InterfaceC15840jk {
    public final /* synthetic */ C86789Y4j LIZ;

    @Override // X.InterfaceC15840jk
    public final void LIZJ() {
    }

    @Override // X.InterfaceC15840jk
    public final void onStart() {
    }

    @Override // X.InterfaceC15840jk
    public final void onStop() {
    }

    @Override // X.InterfaceC15840jk
    public final void LIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC15840jk
    public final void LJIIIZ() {
        InterfaceC86792Y4m cb = this.LIZ.getCb();
        if (cb != null) {
            cb.LJIIIZ();
        }
        C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this.LIZ, 900));
    }

    public C86790Y4k(C86789Y4j c86789Y4j) {
        this.LIZ = c86789Y4j;
    }

    @Override // X.InterfaceC15840jk
    public final void LIZIZ(int i, String str, boolean z) {
        if (z) {
            this.LIZ.LIZ(i);
        } else {
            this.LIZ.LIZIZ();
        }
    }
}
