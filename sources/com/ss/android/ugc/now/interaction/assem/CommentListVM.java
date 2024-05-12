package com.ss.android.ugc.now.interaction.assem;

import X.A2G;
import X.C2050482y;
import X.C33Q;
import X.C73A;
import X.C73U;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.model.CommentCursor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentListVM extends AssemListViewModel<C73U, CommentItem, CommentCursor> {
    public Aweme LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public CommentCursor LJLJJL;
    public boolean LJLJJLL;
    public NowFeedMobHierarchyData LJLJL;
    public final C73A LJLJLLL;
    public String LJLIL = CardStruct.IStatusCode.DEFAULT;
    public final Set<String> LJLJLJ = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C73U(0);
    }

    public CommentListVM() {
        C73A c73a = new C73A();
        c73a.LJIIIIZZ = new AqS169S0100000_3(this, 595);
        this.LJLJLLL = c73a;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<CommentItem> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 596));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<CommentCursor>> interfaceC67352kd) {
        return gv0(new CommentCursor(0L), this.LJLIL, this.LJLJJI, interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(CommentCursor commentCursor, InterfaceC67352kd<? super A2G<CommentCursor>> interfaceC67352kd) {
        return gv0(commentCursor, this.LJLIL, null, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x008d, code lost:
    
        if (r12 == com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState.ALL_CACHE) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0181 A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:11:0x0164, B:12:0x0167, B:14:0x016f, B:16:0x0177, B:17:0x017b, B:19:0x0181, B:22:0x0193, B:27:0x01ae, B:29:0x01b6, B:31:0x01ba, B:33:0x01c2, B:35:0x01c5, B:37:0x01d0, B:38:0x01df, B:40:0x01e5, B:45:0x01f5, B:46:0x01f9, B:48:0x01ff, B:51:0x020f, B:64:0x0212, B:66:0x0221, B:69:0x0236, B:76:0x0063, B:78:0x006b, B:80:0x006f, B:82:0x0075, B:83:0x0079, B:85:0x007d, B:87:0x0081, B:89:0x0087, B:90:0x008b, B:93:0x008f, B:95:0x0093, B:97:0x0099, B:99:0x009f, B:100:0x00ae, B:102:0x00b4, B:104:0x00d0, B:105:0x00d4, B:107:0x00da, B:109:0x00f3, B:111:0x00f7, B:113:0x00fd, B:115:0x0103, B:117:0x0115, B:119:0x011d, B:121:0x0123, B:122:0x0127, B:124:0x010b, B:126:0x00cb, B:128:0x012f, B:131:0x013f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6 A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:11:0x0164, B:12:0x0167, B:14:0x016f, B:16:0x0177, B:17:0x017b, B:19:0x0181, B:22:0x0193, B:27:0x01ae, B:29:0x01b6, B:31:0x01ba, B:33:0x01c2, B:35:0x01c5, B:37:0x01d0, B:38:0x01df, B:40:0x01e5, B:45:0x01f5, B:46:0x01f9, B:48:0x01ff, B:51:0x020f, B:64:0x0212, B:66:0x0221, B:69:0x0236, B:76:0x0063, B:78:0x006b, B:80:0x006f, B:82:0x0075, B:83:0x0079, B:85:0x007d, B:87:0x0081, B:89:0x0087, B:90:0x008b, B:93:0x008f, B:95:0x0093, B:97:0x0099, B:99:0x009f, B:100:0x00ae, B:102:0x00b4, B:104:0x00d0, B:105:0x00d4, B:107:0x00da, B:109:0x00f3, B:111:0x00f7, B:113:0x00fd, B:115:0x0103, B:117:0x0115, B:119:0x011d, B:121:0x0123, B:122:0x0127, B:124:0x010b, B:126:0x00cb, B:128:0x012f, B:131:0x013f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d0 A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:11:0x0164, B:12:0x0167, B:14:0x016f, B:16:0x0177, B:17:0x017b, B:19:0x0181, B:22:0x0193, B:27:0x01ae, B:29:0x01b6, B:31:0x01ba, B:33:0x01c2, B:35:0x01c5, B:37:0x01d0, B:38:0x01df, B:40:0x01e5, B:45:0x01f5, B:46:0x01f9, B:48:0x01ff, B:51:0x020f, B:64:0x0212, B:66:0x0221, B:69:0x0236, B:76:0x0063, B:78:0x006b, B:80:0x006f, B:82:0x0075, B:83:0x0079, B:85:0x007d, B:87:0x0081, B:89:0x0087, B:90:0x008b, B:93:0x008f, B:95:0x0093, B:97:0x0099, B:99:0x009f, B:100:0x00ae, B:102:0x00b4, B:104:0x00d0, B:105:0x00d4, B:107:0x00da, B:109:0x00f3, B:111:0x00f7, B:113:0x00fd, B:115:0x0103, B:117:0x0115, B:119:0x011d, B:121:0x0123, B:122:0x0127, B:124:0x010b, B:126:0x00cb, B:128:0x012f, B:131:0x013f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221 A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:11:0x0164, B:12:0x0167, B:14:0x016f, B:16:0x0177, B:17:0x017b, B:19:0x0181, B:22:0x0193, B:27:0x01ae, B:29:0x01b6, B:31:0x01ba, B:33:0x01c2, B:35:0x01c5, B:37:0x01d0, B:38:0x01df, B:40:0x01e5, B:45:0x01f5, B:46:0x01f9, B:48:0x01ff, B:51:0x020f, B:64:0x0212, B:66:0x0221, B:69:0x0236, B:76:0x0063, B:78:0x006b, B:80:0x006f, B:82:0x0075, B:83:0x0079, B:85:0x007d, B:87:0x0081, B:89:0x0087, B:90:0x008b, B:93:0x008f, B:95:0x0093, B:97:0x0099, B:99:0x009f, B:100:0x00ae, B:102:0x00b4, B:104:0x00d0, B:105:0x00d4, B:107:0x00da, B:109:0x00f3, B:111:0x00f7, B:113:0x00fd, B:115:0x0103, B:117:0x0115, B:119:0x011d, B:121:0x0123, B:122:0x0127, B:124:0x010b, B:126:0x00cb, B:128:0x012f, B:131:0x013f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236 A[Catch: Exception -> 0x0243, TryCatch #0 {Exception -> 0x0243, blocks: (B:11:0x0164, B:12:0x0167, B:14:0x016f, B:16:0x0177, B:17:0x017b, B:19:0x0181, B:22:0x0193, B:27:0x01ae, B:29:0x01b6, B:31:0x01ba, B:33:0x01c2, B:35:0x01c5, B:37:0x01d0, B:38:0x01df, B:40:0x01e5, B:45:0x01f5, B:46:0x01f9, B:48:0x01ff, B:51:0x020f, B:64:0x0212, B:66:0x0221, B:69:0x0236, B:76:0x0063, B:78:0x006b, B:80:0x006f, B:82:0x0075, B:83:0x0079, B:85:0x007d, B:87:0x0081, B:89:0x0087, B:90:0x008b, B:93:0x008f, B:95:0x0093, B:97:0x0099, B:99:0x009f, B:100:0x00ae, B:102:0x00b4, B:104:0x00d0, B:105:0x00d4, B:107:0x00da, B:109:0x00f3, B:111:0x00f7, B:113:0x00fd, B:115:0x0103, B:117:0x0115, B:119:0x011d, B:121:0x0123, B:122:0x0127, B:124:0x010b, B:126:0x00cb, B:128:0x012f, B:131:0x013f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(com.ss.android.ugc.now.interaction.model.CommentCursor r23, java.lang.String r24, java.lang.String r25, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.now.interaction.model.CommentCursor>> r26) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.CommentListVM.gv0(com.ss.android.ugc.now.interaction.model.CommentCursor, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
