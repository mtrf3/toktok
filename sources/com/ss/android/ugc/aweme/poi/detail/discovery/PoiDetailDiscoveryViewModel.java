package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C73969T1h;
import X.C84844XRo;
import X.C84848XRs;
import X.T16;
import X.VJ3;
import Y.AfS67S0100000_15;
import Y.AfS9S0100100_15;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes16.dex */
public final class PoiDetailDiscoveryViewModel extends AssemViewModel<C84848XRs> {
    public String LJLIL;
    public String LJLILLLLZI;
    public Fragment LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C84848XRs defaultState() {
        return new C84848XRs(null);
    }

    public final void gv0(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        PoiDiscoveryApi.LIZ.getClass();
        C84844XRo.LIZ().getPoiDiscoveryCardList(str, VJ3.REGION_POI_DETAIL.getValue(), null).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS9S0100100_15(this, currentTimeMillis, 1), new AfS67S0100000_15(this, 46));
    }
}
