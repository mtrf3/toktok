package com.ss.android.ugc.aweme.story.feed.guidecard.filter;

import X.C215238cZ;
import X.HG3;
import X.OSZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class GuideCardFilterVM extends AssemViewModel<C215238cZ> {
    public final ConcurrentHashMap<String, HashSet<String>> LJLIL = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C215238cZ defaultState() {
        return new C215238cZ("", "", new OSZ(Boolean.FALSE, ""));
    }

    public final HashSet<String> gv0() {
        return this.LJLIL.get(HG3.LJIILL().getCurUserId());
    }
}
