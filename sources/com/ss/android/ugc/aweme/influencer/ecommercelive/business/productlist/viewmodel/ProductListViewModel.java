package com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel;

import X.A2F;
import X.A2G;
import X.C33Q;
import X.C71271Ry7;
import X.C71517S4z;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.S5B;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import java.util.HashSet;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductListViewModel extends AssemListViewModel<S5B, C71271Ry7, Integer> {
    public AqS178S0100000_12 LJLILLLLZI;
    public final C71517S4z LJLIL = new C71517S4z();
    public final HashSet<String> LJLJI = new HashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new S5B(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C71271Ry7> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 230));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return A2F.LJ(A2G.LIZ, null, null, null, 7);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        return A2F.LIZIZ(A2G.LIZ);
    }
}
