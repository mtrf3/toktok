package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import java.util.List;

/* renamed from: X.UpV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC78381UpV extends InterfaceC78382UpW {
    void onCJBillingCallback(OrderData orderData);

    void onPurchasesUpdated(C78368UpI c78368UpI, List<AbsIapChannelOrderData> list);
}
