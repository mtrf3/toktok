package Y;

import X.C0NB;
import X.C0TV;
import X.C74740TUy;
import X.C74838TYs;
import X.C76800UCe;
import X.InterfaceC88472Yns;

/* loaded from: classes14.dex */
public class AObjectS33S0000000_13 implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS33S0000000_13(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS33S0000000_13 aObjectS33S0000000_13, Object obj) {
        C0TV c0tv = (C0TV) obj;
        C74740TUy.LIZLLL().LJI = c0tv.LIZ;
        C74740TUy.LIZLLL().LJII = c0tv.LIZIZ;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS33S0000000_13 aObjectS33S0000000_13, Object obj) {
        C0NB.LJIIIZ("LinkControlPresenter", "broadcast side switch anchor audioMute state");
        C74838TYs.LJ().LJJJI = ((Boolean) obj).booleanValue();
        return C76800UCe.LIZ;
    }
}
