package Y;

import X.C51645KOr;
import X.C52309Kfx;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.LB9;
import X.LOU;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;

/* loaded from: classes10.dex */
public class AObjectS138S0100000_9 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS138S0100000_9 aObjectS138S0100000_9) {
        ((DetailAwemeListFragment) aObjectS138S0100000_9.l0).LJIIJJI();
        return null;
    }

    public static final Object invoke$1(AObjectS138S0100000_9 aObjectS138S0100000_9) {
        DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) aObjectS138S0100000_9.l0;
        detailAwemeListFragment.LLIILII.get(detailAwemeListFragment.LJLILLLLZI).showLoadMoreError();
        return null;
    }

    public static final Object invoke$2(AObjectS138S0100000_9 aObjectS138S0100000_9) {
        LOU lou = (LOU) aObjectS138S0100000_9.l0;
        lou.getClass();
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        TuxIconView LJIIIIZZ = iMusicDspService.LJIIIIZZ(lou);
        if (LJIIIIZZ != null && iMusicDspService.LIZLLL() && !C52309Kfx.LIZ() && LJIIIIZZ.getWidth() != LB9.LIZLLL) {
            if (lou.LLIFFJFJJ.getEnableAnimation()) {
                lou.LJII(LJIIIIZZ).start();
            } else {
                LJIIIIZZ.setIconWidth((int) lou.LLIFFJFJJ.LJLZ);
                LJIIIIZZ.setAlpha(1.0f);
                lou.invalidate();
            }
        }
        return C76800UCe.LIZ;
    }

    public AObjectS138S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
