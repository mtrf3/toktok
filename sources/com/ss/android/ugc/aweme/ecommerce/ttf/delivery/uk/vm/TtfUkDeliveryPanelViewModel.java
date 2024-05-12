package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.vm;

import X.C26952Ahw;
import X.C61878OQg;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class TtfUkDeliveryPanelViewModel extends DeliveryPanelViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void Hv0(List<Object> list) {
        List list2;
        List<LogisticLinkRichText> list3;
        DeliveryData deliveryData = this.LJLJLLL;
        if (deliveryData == null || (list2 = deliveryData.logistics) == null) {
            list2 = C61878OQg.INSTANCE;
            if (deliveryData == null) {
                list3 = null;
                ((ArrayList) list).add(new C26952Ahw(list2, list3));
            }
        }
        list3 = deliveryData.shippingRightsList;
        ((ArrayList) list).add(new C26952Ahw(list2, list3));
    }
}
