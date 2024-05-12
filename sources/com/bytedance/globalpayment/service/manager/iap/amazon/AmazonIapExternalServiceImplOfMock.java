package com.bytedance.globalpayment.service.manager.iap.amazon;

import X.AbstractC78349Uoz;
import X.InterfaceC78382UpW;
import X.InterfaceC78385UpZ;
import X.InterfaceC78388Upc;
import X.InterfaceC78390Upe;
import X.InterfaceC78399Upn;
import android.app.Activity;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* loaded from: classes14.dex */
public class AmazonIapExternalServiceImplOfMock implements AmazonIapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public AbstractC78349Uoz getAmazonState(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void getAmazonUserId(InterfaceC78399Upn interfaceC78399Upn) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void init(InterfaceC78390Upe interfaceC78390Upe) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public boolean isSupportAmazonPay() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC78382UpW interfaceC78382UpW) {
    }
}
