package com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel;

import X.A2G;
import X.C118084kG;
import X.C118114kJ;
import X.C33Q;
import X.C76800UCe;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingBillboardViewModel extends AssemListViewModel<C118114kJ, C118084kG, C76800UCe> {
    public List<String> LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C118114kJ(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:11:0x0049, B:12:0x004c, B:14:0x0056, B:15:0x0065, B:17:0x006b, B:19:0x007c, B:23:0x007a, B:27:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:11:0x0049, B:12:0x004c, B:14:0x0056, B:15:0x0065, B:17:0x006b, B:19:0x007c, B:23:0x007a, B:27:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC67352kd r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C118124kK
            if (r0 == 0) goto L20
            r4 = r6
            X.4kK r4 = (X.C118124kK) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel r1 = r4.LJLIL
            goto L49
        L20:
            X.4kK r4 = new X.4kK
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            X.4kL r0 = com.ss.android.ugc.aweme.trending.ui.billboardpage.api.TrendingBillboardApi.LIZ     // Catch: java.lang.Exception -> L86
            r0.getClass()     // Catch: java.lang.Exception -> L86
            com.ss.android.ugc.aweme.trending.ui.billboardpage.api.TrendingBillboardApi r0 = X.C118134kL.LIZIZ     // Catch: java.lang.Exception -> L86
            X.Svk r0 = r0.getBillboardInfo()     // Catch: java.lang.Exception -> L86
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L86
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L86
            java.lang.Object r3 = X.C77318UWc.LIZIZ(r0, r4)     // Catch: java.lang.Exception -> L86
            if (r3 != r2) goto L47
            return r2
        L47:
            r1 = r5
            goto L4c
        L49:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L86
        L4c:
            com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardResp r3 = (com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardResp) r3     // Catch: java.lang.Exception -> L86
            java.util.List<java.lang.String> r0 = r3.bannerBackgroundUrlList     // Catch: java.lang.Exception -> L86
            r1.LJLIL = r0     // Catch: java.lang.Exception -> L86
            java.util.List<com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel> r1 = r3.billboard     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L86
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> L86
            r3.<init>(r0)     // Catch: java.lang.Exception -> L86
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L86
        L65:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L86
            com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel r1 = (com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel) r1     // Catch: java.lang.Exception -> L86
            X.4kG r0 = new X.4kG     // Catch: java.lang.Exception -> L86
            r0.<init>(r1)     // Catch: java.lang.Exception -> L86
            r3.add(r0)     // Catch: java.lang.Exception -> L86
            goto L65
        L7a:
            X.OQg r3 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> L86
        L7c:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> L86
            r0.getClass()     // Catch: java.lang.Exception -> L86
            X.A2H r0 = X.A2F.LIZ(r3)     // Catch: java.lang.Exception -> L86
            goto L90
        L86:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel.gv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C118084kG> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 202));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C76800UCe>> interfaceC67352kd) {
        return gv0(interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(C76800UCe c76800UCe, InterfaceC67352kd<? super A2G<C76800UCe>> interfaceC67352kd) {
        return gv0(interfaceC67352kd);
    }
}
