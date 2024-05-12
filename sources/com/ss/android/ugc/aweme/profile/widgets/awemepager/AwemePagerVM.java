package com.ss.android.ugc.aweme.profile.widgets.awemepager;

import X.HG3;
import X.Y4J;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes16.dex */
public final class AwemePagerVM extends AssemViewModel<Y4J> {
    public String LJLIL = "slide";
    public final User LJLILLLLZI = HG3.LJIILL().getCurUser();
    public boolean LJLJI = true;
    public Integer LJLJJI;
    public Aweme LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final Y4J defaultState() {
        return new Y4J(0, 0);
    }
}
