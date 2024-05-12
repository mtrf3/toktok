package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.C07250Qf;
import X.C212608Wa;
import X.C27386Aow;
import X.C2NU;
import X.C47261Igj;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C73969T1h;
import X.InterfaceC74236TBo;
import X.T16;
import X.TBV;
import Y.AfS56S0100000_4;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo.RegionApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictPickerViewModel extends JediViewModel<DistrictPickerState> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public String[] LJLJJLL;
    public OrderSKUDTO LJLJL;
    public final C212608Wa LJLJLJ = new C212608Wa();
    public final C212608Wa LJLJLLL = new C212608Wa();
    public ArrayList<Region> LJLL = new ArrayList<>();
    public boolean LJLLI;

    static {
        TBV tbv = new TBV(DistrictPickerViewModel.class, "numberOfRemainingLevel", "getNumberOfRemainingLevel()I", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(DistrictPickerViewModel.class, "parentId", "getParentId()I", 0, c65351Pkp)};
    }

    public final void Iv0() {
        List list;
        if (C2NU.LIZ.LIZIZ()) {
            setState(new AqS29S0001000_4(0, 22));
            String[] strArr = this.LJLJJLL;
            if (strArr == null) {
                strArr = new String[0];
            }
            OrderSKUDTO orderSKUDTO = this.LJLJL;
            if (orderSKUDTO != null) {
                list = C47261Igj.LJJIJ(orderSKUDTO);
            } else {
                list = null;
            }
            RegionRequest regionRequest = new RegionRequest(strArr, list, null, null, null, 28, null);
            RegionApi.LIZ.getClass();
            C27386Aow.LIZ(regionRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, LiveTryModeCountDownThresholdSetting.DEFAULT), new AfS56S0100000_4(this, 121));
            return;
        }
        setState(new AqS29S0001000_4(2, 22));
    }

    public final boolean Jv0() {
        if (!this.LJLLI || ((Number) this.LJLJLJ.LIZ(this, LJLLILLLL[0])).intValue() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final DistrictPickerState kv0() {
        return new DistrictPickerState(null, null, null, null, 0, 31, null);
    }

    public final ArrayList<Region> Hv0(District selectedDistrict) {
        o.LJIIIZ(selectedDistrict, "selectedDistrict");
        ArrayList<Region> arrayList = new ArrayList<>(this.LJLL);
        arrayList.add(new Region(selectedDistrict.name, selectedDistrict.geoNameId, null, null, null, null, 60, null));
        return arrayList;
    }
}
