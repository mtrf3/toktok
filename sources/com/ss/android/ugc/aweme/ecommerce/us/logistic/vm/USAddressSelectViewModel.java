package com.ss.android.ugc.aweme.ecommerce.us.logistic.vm;

import X.AnonymousClass391;
import X.C26735AeR;
import X.C26738AeU;
import X.C27090AkA;
import X.C27739Aud;
import X.C9CK;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class USAddressSelectViewModel extends AddressSelectViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel
    public final void Hv0(ReachableAddress reachableAddress) {
        String str;
        Address address;
        Address address2;
        String str2;
        if (reachableAddress != null && (address2 = reachableAddress.address) != null && (str2 = address2.id) != null) {
            C27090AkA.LJLILLLLZI = str2;
        }
        IEventCenter LJ = EventCenter.LJ();
        if (reachableAddress == null || (address = reachableAddress.address) == null || (str = address.addressId) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.LIZ("ec_address_select", C27739Aud.LJI(new AddressPageStarter.AddressEvent(str, 3, reachableAddress)));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel
    public final void Jv0(List<? extends Object> list) {
        ChangeLocationData changeLocationData;
        String str;
        ArrayList LJ = AnonymousClass391.LJ(list, "dataList");
        DeliveryData deliveryData = this.LJLJJLL;
        if (deliveryData != null && (changeLocationData = deliveryData.changeLocationData) != null && (str = changeLocationData.description) != null) {
            LJ.add(new C9CK(str));
        }
        LJ.add(new C26735AeR(this.LJLJL));
        if (list.size() > 1) {
            LJ.add(new C26738AeU());
            LJ.addAll(ORZ.LJLJJLL(list, 1));
        }
        setStateImmediate(new AqS170S0100000_4(LJ, (List<? extends Object>) 360));
    }
}
