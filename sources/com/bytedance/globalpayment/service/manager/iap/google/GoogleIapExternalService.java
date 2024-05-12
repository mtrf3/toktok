package com.bytedance.globalpayment.service.manager.iap.google;

import X.AbstractC78349Uoz;
import X.InterfaceC78381UpV;
import X.InterfaceC78382UpW;
import X.InterfaceC78385UpZ;
import X.InterfaceC78388Upc;
import X.InterfaceC78390Upe;
import X.InterfaceC78395Upj;
import android.app.Activity;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import java.util.List;

/* loaded from: classes14.dex */
public interface GoogleIapExternalService {
    void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    AbstractC78349Uoz getGoogleState(InterfaceC78388Upc interfaceC78388Upc, Activity activity);

    PayloadPreferencesService getPayloadPreferencesService();

    RestoreGoogleOrderService getRestoreGoogleOrderService();

    void init(InterfaceC78390Upe interfaceC78390Upe);

    boolean isGoogleBillingNew();

    boolean isServiceConnected();

    boolean isSupportGooglePay();

    void jumpToNotExpiredSubscriptionManagerPage(String str, String str2);

    void jumpToSubscriptionManagerPage();

    void queryHasSubscriptionProducts(InterfaceC78395Upj interfaceC78395Upj);

    void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ);

    void queryUnAckEdOrderFromChannel(InterfaceC78382UpW interfaceC78382UpW);

    void setGpListener(InterfaceC78381UpV interfaceC78381UpV);
}
