package com.ss.android.ugc.now.interaction.assem;

import X.A2G;
import X.AnonymousClass773;
import X.C1805776v;
import X.C2050482y;
import X.C221108m2;
import X.C33Q;
import X.C62822Ol8;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ViewerListVM extends AssemListViewModel<C1805776v, ViewerItem, PaginationCursor> {
    public Aweme LJLILLLLZI;
    public NowFeedMobHierarchyData LJLJI;
    public String LJLIL = CardStruct.IStatusCode.DEFAULT;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(AnonymousClass773.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C1805776v(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<ViewerItem> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 602));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<PaginationCursor>> interfaceC67352kd) {
        ((Set) this.LJLJJI.getValue()).clear();
        return gv0(new PaginationCursor(0L, 0L), this.LJLIL, new LinkedHashMap(), interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(PaginationCursor paginationCursor, InterfaceC67352kd<? super A2G<PaginationCursor>> interfaceC67352kd) {
        return gv0(paginationCursor, this.LJLIL, new LinkedHashMap(), interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:11:0x0071, B:12:0x0074, B:14:0x007d, B:16:0x0085, B:17:0x0089, B:19:0x008f, B:21:0x009b, B:23:0x00a1, B:26:0x00a8, B:33:0x00b5, B:35:0x00e0, B:38:0x00f4, B:40:0x00fc, B:41:0x0106, B:46:0x0039), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:11:0x0071, B:12:0x0074, B:14:0x007d, B:16:0x0085, B:17:0x0089, B:19:0x008f, B:21:0x009b, B:23:0x00a1, B:26:0x00a8, B:33:0x00b5, B:35:0x00e0, B:38:0x00f4, B:40:0x00fc, B:41:0x0106, B:46:0x0039), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:11:0x0071, B:12:0x0074, B:14:0x007d, B:16:0x0085, B:17:0x0089, B:19:0x008f, B:21:0x009b, B:23:0x00a1, B:26:0x00a8, B:33:0x00b5, B:35:0x00e0, B:38:0x00f4, B:40:0x00fc, B:41:0x0106, B:46:0x0039), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.Integer> r19, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.ViewerListVM.gv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, java.lang.String, java.util.Map, X.2kd):java.lang.Object");
    }
}
