package com.ss.android.ugc.aweme.story.avatar;

import X.A2F;
import X.A2G;
import X.C33Q;
import X.C59072Tn;
import X.C88773e5;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryAvatarEntrySharedVM extends BaseDetailShareVM<C88773e5, C59072Tn, Integer> {
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C88773e5(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(C59072Tn item) {
        o.LJIIIZ(item, "item");
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C59072Tn> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 197));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        IllegalStateException illegalStateException = new IllegalStateException("should never do refresh in AvatarEntrySharedVM");
        a2f.getClass();
        return A2F.LIZJ(illegalStateException);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((Number) obj).intValue();
        A2F a2f = A2G.LIZ;
        IllegalStateException illegalStateException = new IllegalStateException("should never load more in AvatarEntrySharedVM");
        a2f.getClass();
        return A2F.LIZJ(illegalStateException);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return 1;
    }
}
