package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.A2F;
import X.A2G;
import X.C2050482y;
import X.C33Q;
import X.C61878OQg;
import X.C7N8;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowDetailListViewModel extends AssemListViewModel<C7N8, InterfaceC57784Mm4, Long> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7N8(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 343));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r20) {
        /*
            r19 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C7N9
            r8 = r19
            if (r0 == 0) goto L28
            r7 = r3
            X.7N9 r7 = (X.C7N9) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L16:
            java.lang.Object r9 = r7.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r10 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 == r4) goto L36
            if (r0 != r5) goto L2e
            com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel r2 = r7.LJLIL
            goto L78
        L28:
            X.7N9 r7 = new X.7N9
            r7.<init>(r8, r3)
            goto L16
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.XKn r3 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel r2 = r7.LJLIL
            goto L68
        L3b:
            X.C141335gf.LIZJ(r9)
            X.2pa r1 = r8.getAssemVMScope()     // Catch: java.lang.Exception -> La5
            X.7NA r0 = new X.7NA     // Catch: java.lang.Exception -> La5
            r0.<init>(r8, r10)     // Catch: java.lang.Exception -> La5
            r2 = 3
            X.XKn r3 = X.XKX.LIZIZ(r1, r10, r10, r0, r2)     // Catch: java.lang.Exception -> La5
            X.2pa r1 = r8.getAssemVMScope()     // Catch: java.lang.Exception -> La5
            X.7NB r0 = new X.7NB     // Catch: java.lang.Exception -> La5
            r0.<init>(r10)     // Catch: java.lang.Exception -> La5
            X.XKn r0 = X.XKX.LIZIZ(r1, r10, r10, r0, r2)     // Catch: java.lang.Exception -> La5
            r7.LJLIL = r8     // Catch: java.lang.Exception -> La5
            r7.LJLILLLLZI = r3     // Catch: java.lang.Exception -> La5
            r7.LJLJJL = r4     // Catch: java.lang.Exception -> La5
            java.lang.Object r0 = r0.LJJIJ(r7)     // Catch: java.lang.Exception -> La5
            if (r0 != r6) goto L66
            return r6
        L66:
            r2 = r8
            goto L6b
        L68:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> La5
        L6b:
            r7.LJLIL = r2     // Catch: java.lang.Exception -> La5
            r7.LJLILLLLZI = r10     // Catch: java.lang.Exception -> La5
            r7.LJLJJL = r5     // Catch: java.lang.Exception -> La5
            java.lang.Object r9 = r3.LJI(r7)     // Catch: java.lang.Exception -> La5
            if (r9 != r6) goto L7b
            goto La4
        L78:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> La5
        L7b:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9     // Catch: java.lang.Exception -> La5
            kotlin.jvm.internal.AqS169S0100000_3 r1 = new kotlin.jvm.internal.AqS169S0100000_3     // Catch: java.lang.Exception -> La5
            r0 = 344(0x158, float:4.82E-43)
            r1.<init>(r9, r0)     // Catch: java.lang.Exception -> La5
            r2.setState(r1)     // Catch: java.lang.Exception -> La5
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> La5
            r12 = 3
            r14 = 0
            r18 = 2038(0x7f6, float:2.856E-42)
            r11 = r10
            r13 = r10
            r15 = r14
            r16 = r14
            r17 = r10
            X.7kI r0 = X.C78949Uyf.LJIILIIL(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> La5
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)     // Catch: java.lang.Exception -> La5
            r1.getClass()     // Catch: java.lang.Exception -> La5
            X.A2H r0 = X.A2F.LIZ(r0)     // Catch: java.lang.Exception -> La5
            return r0
        La4:
            return r6
        La5:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
