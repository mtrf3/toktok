package com.ss.android.ugc.tiktok.addyours.collection;

import X.A2G;
import X.C2050482y;
import X.C214188as;
import X.C219308j8;
import X.C219368jE;
import X.C219388jG;
import X.C33Q;
import X.C78404Ups;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursCollectionListVM extends AssemListViewModel<C219308j8, C219368jE, Long> {
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C219388jG.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C219308j8(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C219368jE> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 604));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0048, B:14:0x004b, B:16:0x0051, B:17:0x005e, B:19:0x0064, B:21:0x0075, B:23:0x0079, B:25:0x0088, B:27:0x0073, B:29:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0048, B:14:0x004b, B:16:0x0051, B:17:0x005e, B:19:0x0064, B:21:0x0075, B:23:0x0079, B:25:0x0088, B:27:0x0073, B:29:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0048, B:14:0x004b, B:16:0x0051, B:17:0x005e, B:19:0x0064, B:21:0x0075, B:23:0x0079, B:25:0x0088, B:27:0x0073, B:29:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0048, B:14:0x004b, B:16:0x0051, B:17:0x005e, B:19:0x0064, B:21:0x0075, B:23:0x0079, B:25:0x0088, B:27:0x0073, B:29:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r8, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C219338jB
            if (r0 == 0) goto L20
            r4 = r10
            X.8jB r4 = (X.C219338jB) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r6 = 1
            r2 = 10
            if (r0 == 0) goto L2e
            if (r0 != r6) goto L26
            goto L48
        L20:
            X.8jB r4 = new X.8jB
            r4.<init>(r7, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            X.8as r0 = r7.LJLIL     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L92
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Exception -> L92
            X.3e4 r0 = r0.getOperator()     // Catch: java.lang.Exception -> L92
            X.8jA r0 = (X.InterfaceC219328jA) r0     // Catch: java.lang.Exception -> L92
            r4.LJLJI = r6     // Catch: java.lang.Exception -> L92
            java.lang.Object r3 = r0.LJJJLZIJ(r8, r2, r4)     // Catch: java.lang.Exception -> L92
            if (r3 != r1) goto L4b
            return r1
        L48:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L92
        L4b:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp r3 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp) r3     // Catch: java.lang.Exception -> L92
            java.util.List<com.ss.android.ugc.aweme.addyours.model.AddYoursTopic> r1 = r3.topicList     // Catch: java.lang.Exception -> L92
            if (r1 == 0) goto L73
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L92
            int r0 = X.C32I.LJJL(r1, r2)     // Catch: java.lang.Exception -> L92
            r5.<init>(r0)     // Catch: java.lang.Exception -> L92
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L92
        L5e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L75
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L92
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r1 = (com.ss.android.ugc.aweme.addyours.model.AddYoursTopic) r1     // Catch: java.lang.Exception -> L92
            X.8jE r0 = new X.8jE     // Catch: java.lang.Exception -> L92
            r0.<init>(r1)     // Catch: java.lang.Exception -> L92
            r5.add(r0)     // Catch: java.lang.Exception -> L92
            goto L5e
        L73:
            X.OQg r5 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> L92
        L75:
            boolean r0 = r3.hasMore     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L88
            X.A2F r4 = X.A2G.LIZ     // Catch: java.lang.Exception -> L92
            long r2 = r3.cursor     // Catch: java.lang.Exception -> L92
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Exception -> L92
            r1.<init>(r2)     // Catch: java.lang.Exception -> L92
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r4, r0, r1, r5, r6)     // Catch: java.lang.Exception -> L92
            goto L9c
        L88:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> L92
            r0.getClass()     // Catch: java.lang.Exception -> L92
            X.A2H r0 = X.A2F.LIZ(r5)     // Catch: java.lang.Exception -> L92
            goto L9c
        L92:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
