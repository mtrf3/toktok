package com.ss.android.ugc.aweme.poi.detail.discovery.category;

import X.A2G;
import X.C242819fx;
import X.C33Q;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiDetailDiscoveryCategoryViewModel extends AssemListViewModel<C242819fx, PoiDiscoveryApi.PoiDiscoveryCard, Long> {
    public String LJLIL;
    public String LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C242819fx(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<PoiDiscoveryApi.PoiDiscoveryCard> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 545));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0101 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x00f3, B:12:0x00f6, B:14:0x0101, B:15:0x010b, B:17:0x0111, B:19:0x0124, B:32:0x0062, B:34:0x006a, B:36:0x007c, B:38:0x0099, B:40:0x00a1, B:41:0x00b0, B:43:0x00b6, B:45:0x00c9, B:47:0x00d3), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r8, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
