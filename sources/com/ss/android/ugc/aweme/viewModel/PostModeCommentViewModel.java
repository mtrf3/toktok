package com.ss.android.ugc.aweme.viewmodel;

import X.C185047Oa;
import X.C185077Od;
import X.C65352Pkq;
import X.C87O;
import X.InterfaceC74236TBo;
import X.TBV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public final class PostModeCommentViewModel extends AssemViewModel<C185047Oa> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public Aweme LJLIL;
    public final C87O LJLILLLLZI = new C87O(C185077Od.LJLIL);

    static {
        TBV tbv = new TBV(PostModeCommentViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C185047Oa defaultState() {
        return new C185047Oa(0);
    }

    public final void gv0(Long l) {
        AwemeStatistics statistics;
        if (l != null) {
            long longValue = l.longValue();
            Aweme aweme = this.LJLIL;
            if (aweme != null && (statistics = aweme.getStatistics()) != null) {
                statistics.setCommentCount(longValue);
            }
        }
        setState(new AqS169S0100000_3(this, 534));
    }
}
