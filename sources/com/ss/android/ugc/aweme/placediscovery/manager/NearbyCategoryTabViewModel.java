package com.ss.android.ugc.aweme.placediscovery.manager;

import X.C00F;
import X.C54663Lcp;
import X.C79061V1d;
import X.InterfaceC789838c;
import X.T16;
import Y.AfS58S0200000_9;
import Y.AfS61S0100000_9;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.placediscovery.api.NearbyPoiCategoryApi;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyCategoryTabViewModel extends AssemViewModel<C54663Lcp> {
    public String LJLIL = "enter_tab";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C54663Lcp defaultState() {
        return new C54663Lcp(0);
    }

    public final void gv0(int i, RoamingLocationInfo roamingLocationInfo) {
        String str;
        String str2;
        Object obj = null;
        if (roamingLocationInfo != null && roamingLocationInfo.isManual()) {
            str = roamingLocationInfo.getManualRegion();
            str2 = roamingLocationInfo.getManualRegionName();
        } else {
            str = null;
            str2 = null;
        }
        int i2 = 1;
        if (C00F.LIZ(31744, 0, "nearby_place_discovery_phase", true) != 1 && C00F.LIZ(31744, 0, "nearby_place_discovery_phase", true) == 2) {
            i2 = 2;
        }
        String str3 = Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str3, "API_URL_PREFIX_SI", str3);
        if (LJI != null) {
            obj = LJI.create(NearbyPoiCategoryApi.class);
        }
        o.LJI(obj);
        ((NearbyPoiCategoryApi) obj).getPoiCategoryList(i, str, str2, i2).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS58S0200000_9(roamingLocationInfo, this, 7), new AfS61S0100000_9(this, 13));
    }
}
