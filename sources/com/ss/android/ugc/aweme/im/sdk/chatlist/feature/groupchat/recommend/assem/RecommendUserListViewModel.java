package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem;

import X.A2F;
import X.A2G;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C87053bJ;
import X.C87063bK;
import X.C87303bi;
import X.C87453bx;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendUserListViewModel extends AssemListViewModel<C87453bx, C87063bK, Long> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C87303bi.class, null), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C87053bJ.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87453bx(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C87063bK> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 158));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[LOOP:0: B:11:0x0035->B:13:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134 A[LOOP:2: B:31:0x012e->B:33:0x0134, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return A2F.LIZIZ(A2G.LIZ);
    }
}
