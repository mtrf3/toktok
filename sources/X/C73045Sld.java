package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sld, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73045Sld implements InterfaceC73048Slg {
    public final /* synthetic */ C73044Slc LIZ;

    @Override // X.InterfaceC73048Slg
    public final void LIZ() {
        IPW ipw;
        IQ9 player = this.LIZ.getPlayer();
        if (player != null) {
            ipw = player.LJIILL;
        } else {
            ipw = null;
        }
        if (ipw == IPW.PLAYER_START) {
            IQ9 iq9 = this.LIZ.LJLJJL;
            if (iq9 != null) {
                iq9.pause();
                return;
            }
            return;
        }
        InterfaceC73050Sli playerLogListener = this.LIZ.getPlayerLogListener();
        if (playerLogListener != null) {
            playerLogListener.LIZ();
        }
        this.LIZ.LJIIIIZZ(0.0f);
    }

    @Override // X.InterfaceC73048Slg
    public final void LIZLLL() {
        ((C1AH) ((C73046Sle) this.LIZ.LJ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(8);
        IQ9 iq9 = this.LIZ.LJLJJL;
        if (iq9 != null) {
            iq9.resume();
        }
    }

    @Override // X.InterfaceC73048Slg
    public final void LJ() {
        ((C73046Sle) this.LIZ.LJ(R.id.hso)).LJ(1);
        this.LIZ.LJLIL = true;
    }

    @Override // X.InterfaceC73048Slg
    public final void LJFF() {
        IQ9 player = this.LIZ.getPlayer();
        if (player != null) {
            if (player.isMute()) {
                player.LJIIIZ();
            } else {
                player.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC73048Slg
    public final void LJI() {
        this.LIZ.getPlayer();
    }

    public C73045Sld(C73044Slc c73044Slc) {
        this.LIZ = c73044Slc;
    }

    @Override // X.InterfaceC73048Slg
    public final void LIZIZ(float f) {
        String LIZIZ = C73074Sm6.LIZIZ(f, this.LIZ.getVideoLength());
        ((TextView) this.LIZ.LJ(R.id.l7z).findViewById(R.id.c0t)).setText(LIZIZ);
        ((TextView) this.LIZ.LJ(R.id.hs6)).setText(LIZIZ);
    }

    @Override // X.InterfaceC73048Slg
    public final void LIZJ(float f) {
        C73046Sle c73046Sle = (C73046Sle) this.LIZ.LJ(R.id.hso);
        c73046Sle.LIZ(R.id.l7z).setVisibility(8);
        if (c73046Sle.LJLJI) {
            c73046Sle.LJ(2);
        } else if (c73046Sle.LJLJJL == EnumC63858P4k.FULL_SCREEN) {
            c73046Sle.LJ(0);
        }
        this.LIZ.LJIIIIZZ(f);
        this.LIZ.LJLIL = false;
    }
}
