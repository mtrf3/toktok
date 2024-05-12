package com.ss.android.ugc.aweme.nows.archive.viewmodel;

import X.A2F;
import X.A2G;
import X.C182307Dm;
import X.C2050482y;
import X.C33Q;
import X.C47261Igj;
import X.C62552ct;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveCalendarListViewModel extends AssemListViewModel<C182307Dm, InterfaceC57784Mm4, Long> {
    public String LJLIL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182307Dm(0);
    }

    public static List gv0() {
        Calendar calendar = Calendar.getInstance();
        return C47261Igj.LJJIJIL(new C62552ct(new ArrayList(), calendar.get(1), calendar.get(2)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public static X.A2G hv0(boolean r6) {
        /*
            if (r6 == 0) goto L12
        L3:
            com.ss.android.ugc.aweme.models.NowArchiveRequest r0 = new com.ss.android.ugc.aweme.models.NowArchiveRequest     // Catch: java.lang.Exception -> L5a
            r1 = 0
            r3 = 30
            r5 = 2
            r0.<init>(r1, r3, r5)     // Catch: java.lang.Exception -> L5a
            com.ss.android.ugc.aweme.models.NowArchiveResponse r1 = X.C7X6.LIZ(r0)     // Catch: java.lang.Exception -> L5a
            goto L21
        L12:
            com.ss.android.ugc.aweme.models.NowArchiveRequest r0 = new com.ss.android.ugc.aweme.models.NowArchiveRequest     // Catch: java.lang.Exception -> L5a
            long r1 = X.C7GY.LIZ     // Catch: java.lang.Exception -> L5a
            r3 = 30
            r5 = 2
            r0.<init>(r1, r3, r5)     // Catch: java.lang.Exception -> L5a
            com.ss.android.ugc.aweme.models.NowArchiveResponse r1 = X.C7X6.LIZ(r0)     // Catch: java.lang.Exception -> L5a
        L21:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.data     // Catch: java.lang.Exception -> L5a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L37
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> L5a
            java.util.List r0 = gv0()     // Catch: java.lang.Exception -> L5a
            r1.getClass()     // Catch: java.lang.Exception -> L5a
            X.A2H r0 = X.A2F.LIZ(r0)     // Catch: java.lang.Exception -> L5a
            return r0
        L37:
            X.C7GW.LIZIZ(r1, r6)     // Catch: java.lang.Exception -> L5a
            boolean r0 = X.C7GY.LIZIZ     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L4e
            X.A2F r3 = X.A2G.LIZ     // Catch: java.lang.Exception -> L5a
            long r0 = X.C7GY.LIZ     // Catch: java.lang.Exception -> L5a
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L5a
            java.util.List<X.2ct> r1 = X.C7GZ.LIZLLL     // Catch: java.lang.Exception -> L5a
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r3, r2, r0, r1, r5)     // Catch: java.lang.Exception -> L5a
            goto L59
        L4e:
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> L5a
            java.util.List<X.2ct> r0 = X.C7GZ.LIZLLL     // Catch: java.lang.Exception -> L5a
            r1.getClass()     // Catch: java.lang.Exception -> L5a
            X.A2H r0 = X.A2F.LIZ(r0)     // Catch: java.lang.Exception -> L5a
        L59:
            return r0
        L5a:
            X.A2F r1 = X.A2G.LIZ
            java.util.List r0 = gv0()
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.archive.viewmodel.NowArchiveCalendarListViewModel.hv0(boolean):X.A2G");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 299));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return hv0(true);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return hv0(false);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return A2F.LIZIZ(A2G.LIZ);
    }
}
