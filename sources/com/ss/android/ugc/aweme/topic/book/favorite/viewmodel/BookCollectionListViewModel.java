package com.ss.android.ugc.aweme.topic.book.favorite.viewmodel;

import X.A2G;
import X.C182327Do;
import X.C184817Nd;
import X.C2050482y;
import X.C214188as;
import X.C33Q;
import X.C78404Ups;
import X.C7I4;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookCollectionListViewModel extends AssemListViewModel<C182327Do, C184817Nd, Long> {
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C7I4.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182327Do(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C184817Nd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 486));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[Catch: Exception -> 0x00a7, LOOP:0: B:15:0x0060->B:17:0x0066, LOOP_END, TryCatch #0 {Exception -> 0x00a7, blocks: (B:13:0x004a, B:14:0x004d, B:15:0x0060, B:17:0x0066, B:19:0x008a, B:21:0x008e, B:23:0x009d, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:13:0x004a, B:14:0x004d, B:15:0x0060, B:17:0x0066, B:19:0x008a, B:21:0x008e, B:23:0x009d, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:13:0x004a, B:14:0x004d, B:15:0x0060, B:17:0x0066, B:19:0x008a, B:21:0x008e, B:23:0x009d, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r16, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r18) {
        /*
            r15 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C7I3
            if (r0 == 0) goto L20
            r4 = r3
            X.7I3 r4 = (X.C7I3) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJI = r2
        L14:
            java.lang.Object r7 = r4.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 != r6) goto L26
            goto L4a
        L20:
            X.7I3 r4 = new X.7I3
            r4.<init>(r15, r3)
            goto L14
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r7)
            X.8as r0 = r15.LJLIL     // Catch: java.lang.Exception -> La7
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La7
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Exception -> La7
            X.3e4 r0 = r0.getOperator()     // Catch: java.lang.Exception -> La7
            X.7I5 r0 = (X.C7I5) r0     // Catch: java.lang.Exception -> La7
            r4.LJLJI = r6     // Catch: java.lang.Exception -> La7
            r2 = r16
            java.lang.Object r7 = r0.LJJLIIIJILLIZJL(r2, r4)     // Catch: java.lang.Exception -> La7
            if (r7 != r1) goto L4d
            return r1
        L4a:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> La7
        L4d:
            com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListResponse r7 = (com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListResponse) r7     // Catch: java.lang.Exception -> La7
            java.util.List<com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo> r1 = r7.bookList     // Catch: java.lang.Exception -> La7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> La7
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> La7
            r5.<init>(r0)     // Catch: java.lang.Exception -> La7
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Exception -> La7
        L60:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L8a
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> La7
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r2 = (com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo) r2     // Catch: java.lang.Exception -> La7
            X.7Nd r8 = new X.7Nd     // Catch: java.lang.Exception -> La7
            X.7PR r0 = X.C7PR.BOOK     // Catch: java.lang.Exception -> La7
            int r1 = r0.getType()     // Catch: java.lang.Exception -> La7
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> La7
            r0.<init>(r1)     // Catch: java.lang.Exception -> La7
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r9 = com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo.LIZ(r2, r0)     // Catch: java.lang.Exception -> La7
            r10 = 0
            r14 = 30
            r11 = r10
            r12 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> La7
            r5.add(r8)     // Catch: java.lang.Exception -> La7
            goto L60
        L8a:
            boolean r0 = r7.hasMore     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L9d
            X.A2F r4 = X.A2G.LIZ     // Catch: java.lang.Exception -> La7
            long r2 = r7.cursor     // Catch: java.lang.Exception -> La7
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Exception -> La7
            r1.<init>(r2)     // Catch: java.lang.Exception -> La7
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r4, r0, r1, r5, r6)     // Catch: java.lang.Exception -> La7
            goto Lb1
        L9d:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> La7
            r0.getClass()     // Catch: java.lang.Exception -> La7
            X.A2H r0 = X.A2F.LIZ(r5)     // Catch: java.lang.Exception -> La7
            goto Lb1
        La7:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
