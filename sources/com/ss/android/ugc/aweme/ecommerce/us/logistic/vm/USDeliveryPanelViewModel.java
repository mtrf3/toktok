package com.ss.android.ugc.aweme.ecommerce.us.logistic.vm;

import X.C26738AeU;
import X.C26952Ahw;
import X.C61878OQg;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USDeliveryPanelViewModel extends DeliveryPanelViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void Jv0() {
        if (this.LJLLLL == 1) {
            withState(new AqS170S0100000_4((DeliveryPanelViewModel) this, 1640));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void Pv0() {
        boolean z = true;
        if (this.LJLLLL != 1) {
            z = false;
        }
        this.LJLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void Hv0(List<Object> list) {
        List list2;
        DeliveryData deliveryData = this.LJLJLLL;
        if (deliveryData == null || (list2 = deliveryData.logistics) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        ((ArrayList) list).add(new C26952Ahw(list2, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void Iv0(List<Object> list) {
        ((ArrayList) list).add(new C26738AeU());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final DeliveryPanelStarter.PackedDeliverySelectResult Nv0(DeliveryPanelState state) {
        String str;
        Address address;
        o.LJIIIZ(state, "state");
        LogisticDTO selectedLogistic = state.getSelectedLogistic();
        ReachableAddress LIZ = state.getSelectedShipToInfo().LIZ();
        if (LIZ != null && (address = LIZ.address) != null) {
            str = address.id;
        } else {
            str = null;
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str, state.getSelectedShipToInfo().LIZIZ(), state.getShippingToAddressInfo(), state.getLogistics(), state.getPdpLogisticModule());
        if (this.LJLLLL != 1) {
            return null;
        }
        return packedDeliverySelectResult;
    }
}
