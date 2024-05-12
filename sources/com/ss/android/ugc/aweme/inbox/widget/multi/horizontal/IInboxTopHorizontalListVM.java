package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.InterfaceC57784Mm4;
import X.LJW;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;

/* loaded from: classes10.dex */
public abstract class IInboxTopHorizontalListVM extends BaseDetailShareVM<InboxHorizontalListState, InterfaceC57784Mm4, Long> {
    public static final LJW Companion = new LJW();

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public /* bridge */ /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC51679KPz
    public /* bridge */ /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public abstract /* synthetic */ int getPageType(int i);

    public abstract void markItemClicked(InterfaceC57784Mm4 interfaceC57784Mm4);

    public abstract void markItemDeleted(InterfaceC57784Mm4 interfaceC57784Mm4);

    public abstract boolean shouldLogCellShow(InterfaceC57784Mm4 interfaceC57784Mm4);

    public abstract void tryLogStoryCreationShow();

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listAddItemAt(int i, Object obj) {
        listAddItemAt(i, (int) obj);
    }
}
