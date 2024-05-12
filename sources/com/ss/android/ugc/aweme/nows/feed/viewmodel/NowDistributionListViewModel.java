package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.A2F;
import X.A2G;
import X.AbstractC194637kR;
import X.C194657kT;
import X.C194737kb;
import X.C194847km;
import X.C196367nE;
import X.C2050482y;
import X.C33Q;
import X.C7ML;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowDistributionListViewModel extends BaseNowListViewModel<C194847km, InterfaceC57784Mm4, Long> {
    public Aweme LJLJLLL;

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.BaseNowListViewModel
    public final void hv0(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C194847km(0);
    }

    public final List<InterfaceC57784Mm4> lv0() {
        C194737kb LJJJIL;
        ArrayList arrayList = new ArrayList();
        if (this.LJLIL) {
            LJJJIL = this.LJLJLJ.LIZLLL.LJJJLL(20, this.LJLJI, null);
            if (LJJJIL != null) {
                NowFeedResponse nowFeedResponse = LJJJIL.LJLIL;
                this.LJLIL = nowFeedResponse.hasMore;
                this.LJLJI = nowFeedResponse.cursor;
            }
            return arrayList;
        }
        LJJJIL = this.LJLJLJ.LIZLLL.LJJJIL(20, this.LJLJJI);
        NowFeedResponse nowFeedResponse2 = LJJJIL.LJLIL;
        this.LJLILLLLZI = nowFeedResponse2.hasMore;
        this.LJLJJI = nowFeedResponse2.cursor;
        jv0(LJJJIL, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (r6 == (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.A2G<java.lang.Long> nv0() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel.nv0():X.A2G");
    }

    public final void kv0(String str) {
        if (str == null) {
            return;
        }
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listGetAll) {
                if (obj instanceof C7ML) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (o.LJ(((C7ML) next).getAweme().getAuthorUid(), str)) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it2.next();
                o.LJII(interfaceC57784Mm4, "null cannot be cast to non-null type ITEM of com.ss.android.ugc.aweme.nows.feed.viewmodel.BaseNowListViewModel.deleteAwemeByUid$lambda$10");
                listRemoveItem((NowDistributionListViewModel) interfaceC57784Mm4);
            }
        }
        C196367nE.LIZ.getClass();
        if (C196367nE.LJI(str)) {
            setState(new AqS169S0100000_3((AbstractC194637kR) C194657kT.LIZ, 35));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:11:0x0069, B:12:0x006c, B:14:0x0079, B:27:0x0032, B:29:0x003c, B:33:0x0045), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mv0(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C194867ko
            if (r0 == 0) goto L21
            r6 = r9
            X.7ko r6 = (X.C194867ko) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r2 = r6.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L27
            java.lang.Object r3 = r6.LJLIL
            goto L69
        L21:
            X.7ko r6 = new X.7ko
            r6.<init>(r8, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C141335gf.LIZJ(r2)
            X.33Q r0 = r8.getState()     // Catch: java.lang.Exception -> L84
            X.7km r0 = (X.C194847km) r0     // Catch: java.lang.Exception -> L84
            java.util.List<java.lang.String> r0 = r0.LJLILLLLZI     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L83
            java.lang.Object r3 = X.ORZ.LJLLLL(r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L84
            if (r3 != 0) goto L45
            goto L83
        L45:
            Y.ACallableS2S1000000_3 r1 = new Y.ACallableS2S1000000_3     // Catch: java.lang.Exception -> L84
            r0 = 2
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L84
            X.Stv r2 = X.AbstractC73672Svk.LJJIIJZLJL(r1)     // Catch: java.lang.Exception -> L84
            java.util.concurrent.ExecutorService r1 = X.C195817mL.LIZ()     // Catch: java.lang.Exception -> L84
            X.T0o r0 = new X.T0o     // Catch: java.lang.Exception -> L84
            r0.<init>(r1)     // Catch: java.lang.Exception -> L84
            X.Sro r0 = r2.LJJL(r0)     // Catch: java.lang.Exception -> L84
            r6.LJLIL = r3     // Catch: java.lang.Exception -> L84
            r6.LJLJJI = r4     // Catch: java.lang.Exception -> L84
            java.lang.Object r2 = X.C77318UWc.LIZIZ(r0, r6)     // Catch: java.lang.Exception -> L84
            if (r2 != r7) goto L6c
            goto L7e
        L69:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> L84
        L6c:
            r1 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = r1.getAuthorUid()     // Catch: java.lang.Exception -> L84
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r1.nowPostInfo     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L7f
            goto L80
        L7e:
            return r7
        L7f:
            r4 = 0
        L80:
            if (r4 == 0) goto L83
            r5 = r2
        L83:
            return r5
        L84:
            r2 = move-exception
            java.lang.String r1 = "NowDisListVM"
            java.lang.String r0 = "loadCachedNowPost"
            X.C7XD.LIZJ(r1, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel.mv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 345));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:11:0x007a, B:12:0x007d, B:14:0x0081, B:17:0x0086, B:22:0x0037, B:26:0x0060, B:30:0x004f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:11:0x007a, B:12:0x007d, B:14:0x0081, B:17:0x0086, B:22:0x0037, B:26:0x0060, B:30:0x004f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r12) {
        /*
            r11 = this;
            java.lang.String r10 = "now_feed_explore_enable"
            boolean r0 = r12 instanceof X.C194857kn
            if (r0 == 0) goto L26
            r2 = r12
            X.7kn r2 = (X.C194857kn) r2
            int r3 = r2.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L26
            int r3 = r3 - r1
            r2.LJLJJI = r3
        L14:
            java.lang.Object r9 = r2.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r2.LJLJJI
            r6 = 0
            r7 = 0
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L34
            if (r0 != r5) goto L2c
            com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel r8 = r2.LJLIL
            goto L7a
        L26:
            X.7kn r2 = new X.7kn
            r2.<init>(r11, r12)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r9)
            r11.LJLJJL = r7     // Catch: java.lang.Exception -> Lac
            r11.LJLJJLL = r7     // Catch: java.lang.Exception -> Lac
            r11.LJLJI = r3     // Catch: java.lang.Exception -> Lac
            r11.LJLIL = r5     // Catch: java.lang.Exception -> Lac
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Exception -> Lac
            r0.getClass()     // Catch: java.lang.Exception -> Lac
            r1 = 31744(0x7c00, float:4.4483E-41)
            int r0 = X.FFL.LJIIJ(r1, r5, r10, r5)     // Catch: java.lang.Exception -> Lac
            if (r0 != r5) goto L4f
            goto L5d
        L4f:
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Exception -> Lac
            r0.getClass()     // Catch: java.lang.Exception -> Lac
            int r1 = X.FFL.LJIIJ(r1, r5, r10, r5)     // Catch: java.lang.Exception -> Lac
            r0 = 2
            if (r1 != r0) goto L5f
        L5d:
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            r11.LJLILLLLZI = r0     // Catch: java.lang.Exception -> Lac
            r11.LJLJJI = r3     // Catch: java.lang.Exception -> Lac
            java.util.Set r0 = r11.iv0()     // Catch: java.lang.Exception -> Lac
            r0.clear()     // Catch: java.lang.Exception -> Lac
            r11.LJLJLLL = r6     // Catch: java.lang.Exception -> Lac
            r2.LJLIL = r11     // Catch: java.lang.Exception -> Lac
            r2.LJLJJI = r5     // Catch: java.lang.Exception -> Lac
            java.lang.Object r9 = r11.mv0(r2)     // Catch: java.lang.Exception -> Lac
            if (r9 != r8) goto L78
            return r8
        L78:
            r8 = r11
            goto L7d
        L7a:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> Lac
        L7d:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9     // Catch: java.lang.Exception -> Lac
            if (r9 != 0) goto L86
            X.A2G r0 = r8.nv0()     // Catch: java.lang.Exception -> Lac
            return r0
        L86:
            r8.LJLJLLL = r9     // Catch: java.lang.Exception -> Lac
            java.util.Set r2 = r8.iv0()     // Catch: java.lang.Exception -> Lac
            java.lang.String r1 = r9.getAid()     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "cacheAweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> Lac
            r2.add(r1)     // Catch: java.lang.Exception -> Lac
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lac
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Exception -> Lac
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lac
            X.Mm4 r0 = r8.gv0(r7, r9)     // Catch: java.lang.Exception -> Lac
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)     // Catch: java.lang.Exception -> Lac
            X.A2V r0 = X.A2F.LJ(r2, r6, r1, r0, r5)     // Catch: java.lang.Exception -> Lac
            return r0
        Lac:
            r2 = move-exception
            X.A2F r1 = X.A2G.LIZ
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        A2G<Long> nv0;
        long longValue = ((Number) obj).longValue();
        if (longValue == 0) {
            try {
                if (this.LJLIL) {
                    nv0 = nv0();
                    return nv0;
                }
            } catch (Exception e) {
                A2G.LIZ.getClass();
                return A2F.LIZJ(e);
            }
        }
        List<InterfaceC57784Mm4> lv0 = lv0();
        if (this.LJLIL || this.LJLILLLLZI) {
            A2F a2f = A2G.LIZ;
            Long l = new Long(longValue);
            Long l2 = new Long(longValue);
            a2f.getClass();
            nv0 = A2F.LIZLLL(l, l2, lv0);
        } else {
            A2G.LIZ.getClass();
            nv0 = A2F.LIZ(lv0);
        }
        return nv0;
    }
}
