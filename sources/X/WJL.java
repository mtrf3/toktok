package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJL implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ WID LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        int i;
        o.LJIIIZ(results, "results");
        C164906da c164906da = results[0];
        if (c164906da.LIZIZ == EnumC61598OFm.DENIED_PERMANENT && this.LIZ) {
            HVR.LJIIJJI(this.LIZIZ.LIZ());
            return;
        }
        if (c164906da.LIZ()) {
            this.LIZIZ.LJIIIIZZ().LJLJLLL = false;
            if (V16.LJJLIIIJILLIZJL(this.LIZIZ.LJIILIIL())) {
                if (this.LIZIZ.LJIILIIL().cameraComponentModel.isMuted) {
                    i = 2;
                } else {
                    i = 1;
                }
                C05L.LIZJ(i, this.LIZIZ.LIZJ());
            } else {
                InterfaceC82062WIo interfaceC82062WIo = (InterfaceC82062WIo) this.LIZIZ.LIZ.LJ(InterfaceC82062WIo.class, null);
                C81975WFf d7 = interfaceC82062WIo.d7(this.LIZIZ.LJIIIIZZ().LJLIL);
                if (d7 != null) {
                    interfaceC82062WIo.LLFF(d7);
                }
            }
            if (V16.LJJLIIIJJI(this.LIZIZ.LJIILIIL())) {
                ((InterfaceC82062WIo) this.LIZIZ.LIZ.LJ(InterfaceC82062WIo.class, null)).LJLLJ(this.LIZIZ.LJIILL());
            }
        }
    }

    public WJL(boolean z, WID wid) {
        this.LIZ = z;
        this.LIZIZ = wid;
    }
}
