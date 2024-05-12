package com.ss.android.ugc.aweme.feed.landscape.viewmodels;

import X.A2G;
import X.C221108m2;
import X.C33Q;
import X.C47261Igj;
import X.C62822Ol8;
import X.C64982go;
import X.C88683dw;
import X.C88703dy;
import X.C88713dz;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LandscapeFeedViewModel extends BaseDetailShareVM<C88683dw, C88703dy, Long> {
    public long LJLILLLLZI;
    public final int LJLIL = 10;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C88713dz.LJLIL);

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 21000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C88683dw(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        Object obj;
        List<Aweme> list = C64982go.LIZIZ;
        if (((ArrayList) list).size() > 0 && (obj = ListProtector.get(list, 0)) != null) {
            return C47261Igj.LJJIJIL(obj);
        }
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        List<ITEM> listGetAll = listGetAll();
        int i = -1;
        if (listGetAll != 0) {
            Iterator it = listGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((C88703dy) it.next()).LJLIL.getAid(), aid)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(C88703dy c88703dy) {
        C88703dy item = c88703dy;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C88703dy> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 46));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[Catch: Exception -> 0x00bc, LOOP:0: B:14:0x008a->B:16:0x0090, LOOP_END, TryCatch #0 {Exception -> 0x00bc, blocks: (B:12:0x0074, B:13:0x0077, B:14:0x008a, B:16:0x0090, B:18:0x009f, B:20:0x00a3, B:23:0x00b1, B:28:0x0062, B:29:0x0065, B:34:0x003c), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:12:0x0074, B:13:0x0077, B:14:0x008a, B:16:0x0090, B:18:0x009f, B:20:0x00a3, B:23:0x00b1, B:28:0x0062, B:29:0x0065, B:34:0x003c), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:12:0x0074, B:13:0x0077, B:14:0x008a, B:16:0x0090, B:18:0x009f, B:20:0x00a3, B:23:0x00b1, B:28:0x0062, B:29:0x0065, B:34:0x003c), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r10, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C88693dx
            if (r0 == 0) goto L26
            r3 = r12
            X.3dx r3 = (X.C88693dx) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r7 = r3.LJLJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r6 = 0
            r5 = 1
            r2 = 2
            if (r0 == 0) goto L39
            if (r0 == r5) goto L34
            if (r0 != r2) goto L2c
            long r10 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel r4 = r3.LJLIL
            goto L74
        L26:
            X.3dx r3 = new X.3dx
            r3.<init>(r9, r12)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            long r10 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel r4 = r3.LJLIL
            goto L62
        L39:
            X.C141335gf.LIZJ(r7)
            int r0 = r9.LJLIL     // Catch: java.lang.Exception -> Lbc
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lbc
            long r10 = r10 + r0
            X.Ol8 r0 = r9.LJLJI     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lbc
            X.3e1 r0 = (X.C88733e1) r0     // Catch: java.lang.Exception -> Lbc
            r3.LJLIL = r9     // Catch: java.lang.Exception -> Lbc
            r3.LJLILLLLZI = r10     // Catch: java.lang.Exception -> Lbc
            r3.LJLJJL = r5     // Catch: java.lang.Exception -> Lbc
            X.3e0 r0 = r0.LIZ     // Catch: java.lang.Exception -> Lbc
            r0.getClass()     // Catch: java.lang.Exception -> Lbc
            X.2gn r0 = new X.2gn     // Catch: java.lang.Exception -> Lbc
            r0.<init>(r10, r6)     // Catch: java.lang.Exception -> Lbc
            X.3C3 r7 = new X.3C3     // Catch: java.lang.Exception -> Lbc
            r7.<init>(r0)     // Catch: java.lang.Exception -> Lbc
            if (r7 != r8) goto L60
            return r8
        L60:
            r4 = r9
            goto L65
        L62:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> Lbc
        L65:
            X.2ha r7 = (X.InterfaceC65462ha) r7     // Catch: java.lang.Exception -> Lbc
            r3.LJLIL = r4     // Catch: java.lang.Exception -> Lbc
            r3.LJLILLLLZI = r10     // Catch: java.lang.Exception -> Lbc
            r3.LJLJJL = r2     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r7 = X.V1M.LJIILIIL(r7, r3)     // Catch: java.lang.Exception -> Lbc
            if (r7 != r8) goto L77
            goto Lbb
        L74:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> Lbc
        L77:
            X.2gp r7 = (X.C64992gp) r7     // Catch: java.lang.Exception -> Lbc
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r7.LJLIL     // Catch: java.lang.Exception -> Lbc
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbc
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> Lbc
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lbc
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lbc
        L8a:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto L9f
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lbc
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lbc
            X.3dy r0 = new X.3dy     // Catch: java.lang.Exception -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lbc
            r3.add(r0)     // Catch: java.lang.Exception -> Lbc
            goto L8a
        L9f:
            boolean r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lb1
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lbc
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Lbc
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lbc
            X.A2V r0 = X.A2F.LJ(r1, r6, r0, r3, r5)     // Catch: java.lang.Exception -> Lbc
            r4.LJLILLLLZI = r10     // Catch: java.lang.Exception -> Lbc
            goto Lba
        Lb1:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lbc
            r0.getClass()     // Catch: java.lang.Exception -> Lbc
            X.A2H r0 = X.A2F.LIZ(r3)     // Catch: java.lang.Exception -> Lbc
        Lba:
            return r0
        Lbb:
            return r8
        Lbc:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLILLLLZI);
    }
}
