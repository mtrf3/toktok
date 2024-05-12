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
public class GoogleIapExternalServiceImplOfMock implements GoogleIapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC78349Uoz getGoogleState(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(InterfaceC78390Upe interfaceC78390Upe) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isGoogleBillingNew() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts(InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC78382UpW interfaceC78382UpW) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(InterfaceC78381UpV interfaceC78381UpV) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return new PayloadPreferencesServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return new RestoreGoogleOrderServiceImplOfMock();
    }
}
