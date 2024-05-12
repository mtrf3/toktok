package com.ss.android.ugc.aweme.profile.aigc;

import X.C43I;
import X.C56412MCa;
import X.C61878OQg;
import X.C780334l;
import X.ED9;
import X.EL9;
import X.InterfaceC88472Yns;
import X.OQY;
import X.ORZ;
import X.TBT;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import java.util.Set;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProfileAigcStyleViewModel extends AssemViewModel<EL9> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final EL9 defaultState() {
        return new EL9(new C43I(C61878OQg.INSTANCE), new C43I(OQY.INSTANCE));
    }

    public final boolean gv0() {
        if (getState().LJLILLLLZI.LIZ.size() < 5) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        XKX.LIZLLL(C780334l.LJLIL, null, null, new ED9(this, null), 3);
    }

    public final void iv0(AIGCStyle item, boolean z) {
        o.LJIIIZ(item, "item");
        Set LLJILLL = ORZ.LLJILLL(getState().LJLILLLLZI.LIZ);
        if (z) {
            LLJILLL.add(item);
        } else {
            LLJILLL.remove(item);
        }
        setState(new AqS172S0100000_6(LLJILLL, (Set<AIGCStyle>) 25));
    }

    public static void hv0(ProfileAigcStyleViewModel profileAigcStyleViewModel, TBT prop1, InterfaceC88472Yns interfaceC88472Yns) {
        profileAigcStyleViewModel.getClass();
        o.LJIIIZ(prop1, "prop1");
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZIZ(true);
        AssemViewModel.selectSubscribe$default(profileAigcStyleViewModel, prop1, c56412MCa, null, null, interfaceC88472Yns, 8, null);
    }
}
