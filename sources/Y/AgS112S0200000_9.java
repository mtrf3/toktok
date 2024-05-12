package Y;

import X.C10I;
import X.C10K;
import X.C17N;
import X.C1DH;
import X.C47261Igj;
import X.C53946LFe;
import X.C57350Mf4;
import X.C57351Mf5;
import X.C76800UCe;
import X.InterfaceC67352kd;
import X.InterfaceC84498XEg;
import X.LFW;
import X.LKF;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;

/* loaded from: classes10.dex */
public class AgS112S0200000_9 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS112S0200000_9 agS112S0200000_9, C10K c10k) {
        FriendsTabContainerFragment.wl((FriendsTabContainerFragment) agS112S0200000_9.l0, (LKF) agS112S0200000_9.l1);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS112S0200000_9 agS112S0200000_9, C10K c10k) {
        if (!c10k.LJIILJJIL() || !c10k.LJIIL()) {
            C1DH.LJJIJIIJI(new ARunnableS20S0300000_9((FriendsFeedEmptyPageCell) agS112S0200000_9.l0, c10k, (FriendsEmptyPageSharePackage) agS112S0200000_9.l1, 7));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS112S0200000_9 agS112S0200000_9, C10K c10k) {
        ((LFW) agS112S0200000_9.l0).LIZ(C17N.LJIILL(((Configuration) agS112S0200000_9.l1).screenWidthDp), C17N.LJIILL(((Configuration) agS112S0200000_9.l1).screenHeightDp), C53946LFe.LIZJ(((LFW) agS112S0200000_9.l0).LJLIL, null).LJFF);
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS112S0200000_9 agS112S0200000_9, C10K c10k) {
        ((InterfaceC84498XEg) c10k.LJIIJJI()).LJII("default", C47261Igj.LJJIJ(((C57350Mf4) agS112S0200000_9.l0).LJLILLLLZI), ((C57350Mf4) agS112S0200000_9.l0).LJLJI, new C57351Mf5((InterfaceC67352kd) agS112S0200000_9.l1));
        return null;
    }

    public AgS112S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
