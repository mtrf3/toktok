package X;

import android.view.View;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.tux.icon.TuxIconView;

/* renamed from: X.25q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528625q extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ GameDualDeviceSourceFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528625q(GameDualDeviceSourceFragment gameDualDeviceSourceFragment, int i, int i2) {
        super(0);
        this.LJLIL = gameDualDeviceSourceFragment;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        GameDualDeviceSourceFragment gameDualDeviceSourceFragment = this.LJLIL;
        if (gameDualDeviceSourceFragment.LJZL >= 20) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("over max times: ");
            C1DD.LJFF(LIZ, this.LJLIL.LJZL, LIZ, "GameDualDeviceSource");
            C0JV.LIZLLL(1004, this.LJLILLLLZI, this.LJLIL.LL, "connect_result", String.valueOf(this.LJLJI), this.LJLIL.LLFII);
            GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = this.LJLIL;
            gameDualDeviceSourceFragment2.LLFFF = C0JC.DISCONNECTED;
            gameDualDeviceSourceFragment2.Gl(4);
        } else {
            C0JV.LIZLLL(1007, this.LJLILLLLZI, gameDualDeviceSourceFragment.LL, "connect_result", String.valueOf(this.LJLJI), this.LJLIL.LLFII);
            GameDualDeviceSourceFragment gameDualDeviceSourceFragment3 = this.LJLIL;
            if (gameDualDeviceSourceFragment3.LJZL == 0) {
                gameDualDeviceSourceFragment3.Gl(1);
                GameDualDeviceSourceFragment gameDualDeviceSourceFragment4 = this.LJLIL;
                gameDualDeviceSourceFragment4.LJLIL = true;
                TuxIconView tuxIconView = gameDualDeviceSourceFragment4.LJLJJL;
                if (tuxIconView != null) {
                    tuxIconView.removeCallbacks(gameDualDeviceSourceFragment4.LLIIIZ);
                }
                this.LJLIL.vl();
            }
            View view = this.LJLIL.getView();
            if (view != null) {
                view.removeCallbacks(this.LJLIL.LLIIIL);
            }
            View view2 = this.LJLIL.getView();
            if (view2 != null) {
                GameDualDeviceSourceFragment gameDualDeviceSourceFragment5 = this.LJLIL;
                view2.postDelayed(gameDualDeviceSourceFragment5.LLIIIL, ((Number) gameDualDeviceSourceFragment5.LLII.getValue()).longValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
