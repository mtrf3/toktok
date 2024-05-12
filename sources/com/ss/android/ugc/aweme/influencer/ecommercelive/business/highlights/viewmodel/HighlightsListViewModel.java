package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel;

import X.A2G;
import X.C242649fg;
import X.C33Q;
import X.C44008HOy;
import X.C88743e2;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCellItem;
import java.util.HashSet;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HighlightsListViewModel extends AssemListViewModel<C242649fg, InterfaceC57784Mm4, Integer> {
    public boolean LJLJJI;
    public Integer LJLJJL;
    public boolean LJLJLJ;
    public HighlightCellItem LJLJLLL;
    public long LJLL;
    public final C88743e2 LJLIL = new C88743e2();
    public String LJLILLLLZI = CardStruct.IStatusCode.DEFAULT;
    public String LJLJI = "";
    public final HashSet<String> LJLJJLL = new HashSet<>();
    public final HashSet<String> LJLJL = new HashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C242649fg(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 397));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.SQX
            if (r0 == 0) goto L73
            r4 = r8
            X.SQX r4 = (X.SQX) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r5 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 != r2) goto L79
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel r6 = r4.LJLIL
            X.C141335gf.LIZJ(r5)
        L22:
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = r6.LJLILLLLZI
            java.lang.String r3 = r6.LJLJI
            boolean r2 = r5.isEmpty()
            boolean r1 = r6.LJLJJI
            java.lang.String r0 = "roomId"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "authorId"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.util.Map r1 = X.C44008HOy.LIZIZ(r4, r3, r2, r1)
            java.lang.String r0 = "livesdk_tiktokec_enter_page"
            com.google.gson.internal.b.LJJIJIIJI(r0, r1)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 398(0x18e, float:5.58E-43)
            r1.<init>(r5, r0)
            r6.setState(r1)
            X.A2V r2 = new X.A2V
            int r0 = r5.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r0 = 0
            r2.<init>(r0, r1, r5)
            return r2
        L5b:
            X.C141335gf.LIZJ(r5)
            X.9fw r0 = X.C242809fw.LJLIL
            r7.setState(r0)
            java.lang.String r1 = r7.LJLJI
            r4.LJLIL = r7
            r4.LJLJJI = r2
            r0 = 0
            java.lang.Object r5 = r7.gv0(r1, r0, r4)
            if (r5 != r3) goto L71
            return r3
        L71:
            r6 = r7
            goto L22
        L73:
            X.SQX r4 = new X.SQX
            r4.<init>(r7, r8)
            goto L12
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(int r10, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.SQY
            if (r0 == 0) goto Lca
            r6 = r11
            X.SQY r6 = (X.SQY) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lca
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r8 = r6.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r5 = 1
            if (r0 == 0) goto L5a
            if (r0 != r5) goto Ld1
            java.lang.Object r4 = r6.LJLIL
            java.util.List r4 = (java.util.List) r4
            X.C141335gf.LIZJ(r8)
        L24:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            X.A2F r1 = X.A2G.LIZ
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
        L37:
            return r0
        L38:
            X.A2F r3 = X.A2G.LIZ
            int r0 = r4.size()
            int r0 = r0 - r5
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            int r0 = r4.size()
            int r1 = r8.size()
            int r1 = r1 + r0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3.getClass()
            X.A2V r0 = X.A2F.LIZLLL(r2, r0, r8)
            goto L37
        L5a:
            X.C141335gf.LIZJ(r8)
            java.util.List r4 = r9.listGetAll()
            if (r4 != 0) goto L65
            X.OQg r4 = X.C61878OQg.INSTANCE
        L65:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L77
            X.A2F r1 = X.A2G.LIZ
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        L77:
            int r0 = r4.size()
            java.util.ListIterator r3 = r4.listIterator(r0)
        L7f:
            boolean r0 = r3.hasPrevious()
            r2 = 0
            if (r0 == 0) goto L99
            java.lang.Object r2 = r3.previous()
            r1 = r2
            X.Mm4 r1 = (X.InterfaceC57784Mm4) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard) r1
            java.lang.Integer r0 = r1.getOffset()
            if (r0 == 0) goto L7f
        L99:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard r2 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard) r2
            if (r2 == 0) goto Lad
            java.lang.Integer r2 = r2.getOffset()
            if (r2 == 0) goto Lad
            int r0 = r2.intValue()
            if (r0 != 0) goto Lb9
        Lad:
            X.A2F r1 = X.A2G.LIZ
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        Lb9:
            java.lang.String r1 = r9.LJLJI
            int r0 = r2.intValue()
            r6.LJLIL = r4
            r6.LJLJJI = r5
            java.lang.Object r8 = r9.gv0(r1, r0, r6)
            if (r8 != r7) goto L24
            return r7
        Lca:
            X.SQY r6 = new X.SQY
            r6.<init>(r9, r11)
            goto L12
        Ld1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel.hv0(int, X.2kd):java.lang.Object");
    }

    public final void iv0(String str, boolean z) {
        if (z) {
            if (str != null && !this.LJLJL.contains(str)) {
                String roomId = this.LJLILLLLZI;
                String authorId = this.LJLJI;
                o.LJIIIZ(roomId, "roomId");
                o.LJIIIZ(authorId, "authorId");
                b.LJJIJIIJI("livesdk_live_highlight_show", C44008HOy.LIZ(roomId, authorId, true));
                return;
            }
            return;
        }
        if (str == null || this.LJLJJLL.contains(str)) {
            return;
        }
        String roomId2 = this.LJLILLLLZI;
        String authorId2 = this.LJLJI;
        o.LJIIIZ(roomId2, "roomId");
        o.LJIIIZ(authorId2, "authorId");
        b.LJJIJIIJI("livesdk_live_highlight_show", C44008HOy.LIZ(roomId2, authorId2, false));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return hv0(num.intValue(), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(java.lang.String r18, int r19, X.InterfaceC67352kd<? super java.util.List<? extends X.InterfaceC57784Mm4>> r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel.gv0(java.lang.String, int, X.2kd):java.lang.Object");
    }
}
