package com.ss.android.ugc.aweme.poi.collect;

import X.A2G;
import X.C182387Du;
import X.C187147Wc;
import X.C2050482y;
import X.C33Q;
import X.C7WZ;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectListViewModel extends AssemListViewModel<C182387Du, C7WZ, C187147Wc> {
    public Long LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182387Du(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C7WZ> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 369));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C187147Wc>> interfaceC67352kd) {
        return gv0(new C187147Wc(0), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:11:0x0073, B:12:0x0076, B:14:0x007c, B:16:0x0080, B:17:0x008f, B:19:0x0095, B:21:0x00ac, B:23:0x00d1, B:26:0x00df, B:28:0x00aa, B:29:0x00e9, B:34:0x0034, B:36:0x004e, B:37:0x0054), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:11:0x0073, B:12:0x0076, B:14:0x007c, B:16:0x0080, B:17:0x008f, B:19:0x0095, B:21:0x00ac, B:23:0x00d1, B:26:0x00df, B:28:0x00aa, B:29:0x00e9, B:34:0x0034, B:36:0x004e, B:37:0x0054), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.C187147Wc r13, X.InterfaceC67352kd<? super X.A2G<X.C187147Wc>> r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel.gv0(X.7Wc, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C187147Wc c187147Wc, InterfaceC67352kd<? super A2G<C187147Wc>> interfaceC67352kd) {
        return gv0(c187147Wc, interfaceC67352kd);
    }
}
