package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C190287dQ;
import X.InterfaceC224548ra;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public final class PoiCollectBottomBarViewModel extends AssemViewModel<C190287dQ> implements InterfaceC224548ra {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C190287dQ defaultState() {
        return new C190287dQ(null);
    }

    @Override // X.InterfaceC224548ra
    public final void R1(Aweme aweme) {
        setState(new AqS169S0100000_3(aweme, 374));
    }
}
