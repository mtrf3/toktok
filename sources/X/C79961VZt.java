package X;

import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VZt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79961VZt implements InterfaceC80047VbH, InterfaceC80038Vb8 {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    @Override // X.InterfaceC80047VbH
    public final void LJIIJJI(long j) {
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIILIIL(V1L v1l) {
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIZILJ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepare() {
    }

    @Override // X.InterfaceC80047VbH
    public final void onPrepared() {
    }

    @Override // X.InterfaceC80047VbH
    public final void onCompletion() {
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJIILL(EnumC79958VZq.PLAYBACK_STATE_ENDED);
        }
    }

    public C79961VZt(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZ(EnumC48648J7k errorCode) {
        String str;
        o.LJIIJ(errorCode, "errorCode");
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.onError(errorCode.getCode(), errorCode.getMsg());
        }
        C79960VZs c79960VZs = (C79960VZs) this.LJLIL.l0;
        C79702VPu c79702VPu = c79960VZs.LJI;
        String desc = c79960VZs.LJFF.getDesc();
        C79960VZs c79960VZs2 = (C79960VZs) this.LJLIL.l0;
        boolean z = c79960VZs2.LJIILJJIL;
        V1L v1l = c79960VZs2.LJIIL;
        if (v1l != null) {
            str = v1l.toString();
        } else {
            str = null;
        }
        c79702VPu.LIZIZ(-1, -1, desc, "play error final", str, z);
    }

    @Override // X.InterfaceC80047VbH
    public final void LIZLLL(C73363Sql c73363Sql) {
        C80029Vaz c80029Vaz;
        C79960VZs c79960VZs = (C79960VZs) this.LJLIL.l0;
        InterfaceC79962VZu interfaceC79962VZu = c79960VZs.LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJIIJJI(c79960VZs.LJII());
        }
        C79960VZs c79960VZs2 = (C79960VZs) this.LJLIL.l0;
        if (c79960VZs2.LJIILJJIL && (c80029Vaz = c79960VZs2.LIZIZ) != null) {
            c80029Vaz.LJIIIZ(null);
        }
    }

    @Override // X.InterfaceC80047VbH
    public final void LJFF(EnumC48641J7d loadingState) {
        o.LJIIJ(loadingState, "loadingState");
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJFF(loadingState);
        }
    }

    @Override // X.InterfaceC80038Vb8
    public final void LJIIJ(InterfaceC79968Va0 interfaceC79968Va0) {
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILJJIL(EnumC79999VaV seekState) {
        C79960VZs c79960VZs;
        InterfaceC79962VZu interfaceC79962VZu;
        o.LJIIJ(seekState, "seekState");
        if (seekState == EnumC79999VaV.SEEK_SUCCESS && (interfaceC79962VZu = (c79960VZs = (C79960VZs) this.LJLIL.l0).LIZ) != null) {
            interfaceC79962VZu.LJIJ(c79960VZs.getCurrentPlaybackTime());
        }
    }

    @Override // X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        o.LJIIJ(currentState, "currentState");
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJIILL(C79960VZs.LIZIZ(currentState));
        }
    }

    @Override // X.InterfaceC80047VbH
    public final void onPlaybackTimeChanged(long j) {
        InterfaceC79962VZu interfaceC79962VZu = ((C79960VZs) this.LJLIL.l0).LIZ;
        if (interfaceC79962VZu != null) {
            interfaceC79962VZu.LJIJI((int) j);
        }
    }
}
