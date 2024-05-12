package com.ss.android.ugc.now.interaction.assem;

import X.A2G;
import X.AnonymousClass770;
import X.C1805976x;
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
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeListVM extends AssemListViewModel<C1805976x, LikeItem, PaginationCursor> {
    public Aweme LJLILLLLZI;
    public NowFeedMobHierarchyData LJLJI;
    public String LJLIL = CardStruct.IStatusCode.DEFAULT;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(AnonymousClass770.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C1805976x(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<LikeItem> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 600));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<PaginationCursor>> interfaceC67352kd) {
        return gv0(new PaginationCursor(0L, 0L), this.LJLIL, new LinkedHashMap(), interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(PaginationCursor paginationCursor, InterfaceC67352kd<? super A2G<PaginationCursor>> interfaceC67352kd) {
        return gv0(paginationCursor, this.LJLIL, new LinkedHashMap(), interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0073, code lost:
    
        if (r10 == com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.ALL_CACHE) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bf A[Catch: Exception -> 0x022e, LOOP:0: B:17:0x01b9->B:19:0x01bf, LOOP_END, TryCatch #0 {Exception -> 0x022e, blocks: (B:11:0x01a2, B:12:0x01a5, B:14:0x01ad, B:16:0x01b5, B:17:0x01b9, B:19:0x01bf, B:21:0x01d2, B:23:0x01da, B:25:0x01e0, B:27:0x01e8, B:29:0x01ed, B:31:0x0210, B:34:0x0224, B:39:0x003f, B:41:0x0049, B:43:0x0051, B:45:0x0055, B:47:0x005b, B:48:0x005f, B:50:0x0063, B:52:0x0067, B:54:0x006d, B:55:0x0071, B:58:0x0075, B:60:0x0084, B:62:0x008a, B:64:0x0090, B:65:0x009f, B:67:0x00a3, B:69:0x00a9, B:75:0x00bb, B:77:0x00c1, B:79:0x00c7, B:81:0x00cd, B:82:0x00da, B:84:0x00e0, B:86:0x00f8, B:88:0x00f3, B:89:0x0100, B:91:0x0108, B:93:0x010e, B:94:0x0112, B:96:0x0116, B:98:0x011c, B:99:0x0120, B:101:0x0127, B:103:0x012d, B:105:0x0133, B:106:0x0140, B:108:0x0146, B:110:0x0161, B:112:0x015c, B:116:0x0166), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01da A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:11:0x01a2, B:12:0x01a5, B:14:0x01ad, B:16:0x01b5, B:17:0x01b9, B:19:0x01bf, B:21:0x01d2, B:23:0x01da, B:25:0x01e0, B:27:0x01e8, B:29:0x01ed, B:31:0x0210, B:34:0x0224, B:39:0x003f, B:41:0x0049, B:43:0x0051, B:45:0x0055, B:47:0x005b, B:48:0x005f, B:50:0x0063, B:52:0x0067, B:54:0x006d, B:55:0x0071, B:58:0x0075, B:60:0x0084, B:62:0x008a, B:64:0x0090, B:65:0x009f, B:67:0x00a3, B:69:0x00a9, B:75:0x00bb, B:77:0x00c1, B:79:0x00c7, B:81:0x00cd, B:82:0x00da, B:84:0x00e0, B:86:0x00f8, B:88:0x00f3, B:89:0x0100, B:91:0x0108, B:93:0x010e, B:94:0x0112, B:96:0x0116, B:98:0x011c, B:99:0x0120, B:101:0x0127, B:103:0x012d, B:105:0x0133, B:106:0x0140, B:108:0x0146, B:110:0x0161, B:112:0x015c, B:116:0x0166), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0210 A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:11:0x01a2, B:12:0x01a5, B:14:0x01ad, B:16:0x01b5, B:17:0x01b9, B:19:0x01bf, B:21:0x01d2, B:23:0x01da, B:25:0x01e0, B:27:0x01e8, B:29:0x01ed, B:31:0x0210, B:34:0x0224, B:39:0x003f, B:41:0x0049, B:43:0x0051, B:45:0x0055, B:47:0x005b, B:48:0x005f, B:50:0x0063, B:52:0x0067, B:54:0x006d, B:55:0x0071, B:58:0x0075, B:60:0x0084, B:62:0x008a, B:64:0x0090, B:65:0x009f, B:67:0x00a3, B:69:0x00a9, B:75:0x00bb, B:77:0x00c1, B:79:0x00c7, B:81:0x00cd, B:82:0x00da, B:84:0x00e0, B:86:0x00f8, B:88:0x00f3, B:89:0x0100, B:91:0x0108, B:93:0x010e, B:94:0x0112, B:96:0x0116, B:98:0x011c, B:99:0x0120, B:101:0x0127, B:103:0x012d, B:105:0x0133, B:106:0x0140, B:108:0x0146, B:110:0x0161, B:112:0x015c, B:116:0x0166), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0224 A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:11:0x01a2, B:12:0x01a5, B:14:0x01ad, B:16:0x01b5, B:17:0x01b9, B:19:0x01bf, B:21:0x01d2, B:23:0x01da, B:25:0x01e0, B:27:0x01e8, B:29:0x01ed, B:31:0x0210, B:34:0x0224, B:39:0x003f, B:41:0x0049, B:43:0x0051, B:45:0x0055, B:47:0x005b, B:48:0x005f, B:50:0x0063, B:52:0x0067, B:54:0x006d, B:55:0x0071, B:58:0x0075, B:60:0x0084, B:62:0x008a, B:64:0x0090, B:65:0x009f, B:67:0x00a3, B:69:0x00a9, B:75:0x00bb, B:77:0x00c1, B:79:0x00c7, B:81:0x00cd, B:82:0x00da, B:84:0x00e0, B:86:0x00f8, B:88:0x00f3, B:89:0x0100, B:91:0x0108, B:93:0x010e, B:94:0x0112, B:96:0x0116, B:98:0x011c, B:99:0x0120, B:101:0x0127, B:103:0x012d, B:105:0x0133, B:106:0x0140, B:108:0x0146, B:110:0x0161, B:112:0x015c, B:116:0x0166), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.Integer> r21, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r22) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.LikeListVM.gv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, java.lang.String, java.util.Map, X.2kd):java.lang.Object");
    }
}
