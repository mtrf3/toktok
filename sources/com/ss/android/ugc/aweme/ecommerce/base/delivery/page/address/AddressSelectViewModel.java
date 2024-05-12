package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.C26745Aeb;
import X.C26746Aec;
import X.C27096AkG;
import X.C27386Aow;
import X.C27739Aud;
import X.C36671EaJ;
import X.C61878OQg;
import X.C73969T1h;
import X.OSZ;
import X.T16;
import Y.AfS19S1100000_4;
import Y.AfS7S1110000_4;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo.RegionApi;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AddressSelectViewModel extends JediViewModel<AddressSelectState> {
    public DeliveryData LJLJJLL;
    public String LJLJL;
    public DeliveryPanelStarter.EnterParamForProductDetailPage LJLJLJ;
    public boolean LJLJLLL;

    public void Hv0(ReachableAddress reachableAddress) {
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final AddressSelectState kv0() {
        return new AddressSelectState(null, null, 3, null);
    }

    public void Jv0(List<? extends Object> dataList) {
        o.LJIIIZ(dataList, "dataList");
        setStateImmediate(new AqS170S0100000_4(dataList, (List<? extends Object>) 233));
    }

    public final void Lv0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        SearchDistrictRequest searchDistrictRequest = new SearchDistrictRequest(2, C61878OQg.INSTANCE, str);
        RegionApi.LIZ.getClass();
        disposeOnClear(C27386Aow.LIZIZ(searchDistrictRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS19S1100000_4(this, str, 0), C26746Aec.LJLIL));
    }

    public final void Mv0(ReachableAddress reachableAddress) {
        setStateImmediate(new AqS170S0100000_4(reachableAddress, 234));
        if (this.LJLJLLL) {
            if (reachableAddress != null) {
                Hv0(reachableAddress);
                return;
            }
            return;
        }
        this.LJLJLLL = true;
    }

    public static void Kv0(String str, boolean z) {
        EventCenter.LJ().LIZ("ec_zipcode_locate_address", C27739Aud.LJI(new ZipcodeLocateAddress(0, str, null, null, Boolean.valueOf(z), 12, null)));
    }

    public final void Iv0(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AddressItem("zipcode", str));
        Address address = new Address(null, arrayList, null, null, null, 16, null);
        AddressApi.LIZ.getClass();
        disposeOnClear(C36671EaJ.LIZIZ(C27096AkG.LIZ(address, 5), "logistics_address", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS7S1110000_4(this, z, str, 0), C26745Aeb.LJLIL));
    }
}
