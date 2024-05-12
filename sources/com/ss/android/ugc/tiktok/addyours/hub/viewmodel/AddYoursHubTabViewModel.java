package com.ss.android.ugc.tiktok.addyours.hub.viewmodel;

import X.A2F;
import X.A2G;
import X.C2050482y;
import X.C219988kE;
import X.C220168kW;
import X.C33Q;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursHubTabViewModel extends AssemListViewModel<C220168kW, C219988kE, Long> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C220168kW(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C219988kE> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 606));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return A2F.LJ(A2G.LIZ, null, null, null, 7);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return A2F.LJ(A2G.LIZ, null, null, null, 7);
    }
}
