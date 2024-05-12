package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C33Q;
import X.C43I;
import X.C65352Pkq;
import X.C87O;
import X.C8PD;
import X.C8PE;
import X.C8PF;
import X.C8PI;
import X.InterfaceC74236TBo;
import X.TBV;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class VideoAntiAddictionVM extends FeedBaseViewModel<C8PE> {
    public static final C8PD LJLLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C87O LJLJLLL = new C87O(C8PI.LJLIL);
    public boolean LJLL;

    static {
        TBV tbv = new TBV(VideoAntiAddictionVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbv};
        LJLLI = new C8PD();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8PE(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C8PE iv0(C8PE c8pe, VideoItemParams item) {
        boolean z;
        C8PE state = c8pe;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        C43I<C8PF> c43i = state.LJLIL;
        if (c43i == null || c43i.LIZ == null) {
            new C8PF(false, false);
        }
        LJLLI.getClass();
        boolean LIZ = C8PD.LIZ(item);
        Boolean LIZ2 = a.LIZLLL().LIZ();
        if (LIZ2 != null) {
            z = LIZ2.booleanValue();
        } else {
            z = false;
        }
        C8PF c8pf = new C8PF(LIZ, z);
        if (c8pf.LJLILLLLZI) {
            this.LJLL = false;
        }
        return new C8PE(new C43I(c8pf));
    }
}
