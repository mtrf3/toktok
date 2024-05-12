package com.bytedance.globalpayment.iap.amazon.service.provider;

import X.AbstractC78349Uoz;
import X.C39670Fha;
import X.C78273Unl;
import X.C78278Unq;
import X.C78307UoJ;
import X.C78331Uoh;
import X.C78345Uov;
import X.C78368UpI;
import X.C78377UpR;
import X.HandlerC78370UpK;
import X.InterfaceC78382UpW;
import X.InterfaceC78385UpZ;
import X.InterfaceC78388Upc;
import X.InterfaceC78390Upe;
import X.InterfaceC78399Upn;
import X.X1D;
import android.app.Activity;
import android.text.TextUtils;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class AmazonIapServiceProvider implements AmazonIapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public boolean isSupportAmazonPay() {
        C78345Uov.LIZJ().getClass();
        return C78345Uov.LJIIJ;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void getAmazonUserId(InterfaceC78399Upn interfaceC78399Upn) {
        C78345Uov.LIZJ().LIZIZ(interfaceC78399Upn);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void init(InterfaceC78390Upe interfaceC78390Upe) {
        C78345Uov LIZJ = C78345Uov.LIZJ();
        LIZJ.getClass();
        C78273Unl.LJIIIZ().LJ().getClass();
        LIZJ.LIZJ = new HandlerC78370UpK(interfaceC78390Upe);
        LIZJ.LIZIZ(new C78377UpR(LIZJ, interfaceC78390Upe));
        LIZJ.LIZJ.sendEmptyMessageDelayed(1733, 1000L);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC78382UpW interfaceC78382UpW) {
        C78345Uov LIZJ = C78345Uov.LIZJ();
        LIZJ.getClass();
        boolean z = true;
        String requestId = PurchasingService.getPurchaseUpdates(true).toString();
        if (!TextUtils.isEmpty(requestId) && interfaceC78382UpW != null) {
            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) ((HashMap) LIZJ.LJI).get(requestId);
            ArrayList arrayList = new ArrayList();
            if (purchaseUpdatesResponse != null) {
                if (purchaseUpdatesResponse.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
                    Iterator<Receipt> it = purchaseUpdatesResponse.getReceipts().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C78331Uoh(it.next(), purchaseUpdatesResponse.getUserData()));
                    }
                    IapPaymentMethod iapPaymentMethod = IapPaymentMethod.AMAZON;
                    AbsResult absResult = new AbsResult();
                    absResult.withErrorCode(0);
                    interfaceC78382UpW.onQueryFinished(iapPaymentMethod, absResult, arrayList);
                    ((HashMap) LIZJ.LJI).remove(requestId);
                    C78278Unq.LIZ().getClass();
                    C78278Unq.LIZJ(requestId, arrayList, z);
                    return;
                }
                IapPaymentMethod iapPaymentMethod2 = IapPaymentMethod.AMAZON;
                AbsResult absResult2 = new AbsResult();
                absResult2.withErrorCode(1);
                absResult2.withDetailCode(purchaseUpdatesResponse.getRequestStatus().ordinal());
                absResult2.withMessage("query un ack order from amazon failed");
                interfaceC78382UpW.onQueryFinished(iapPaymentMethod2, absResult2, null);
            } else {
                ((HashMap) LIZJ.LJFF).put(requestId, interfaceC78382UpW);
            }
            z = false;
            C78278Unq.LIZ().getClass();
            C78278Unq.LIZJ(requestId, arrayList, z);
            return;
        }
        C78278Unq LIZ = C78278Unq.LIZ();
        ArrayList arrayList2 = new ArrayList();
        LIZ.getClass();
        C78278Unq.LIZJ(requestId, arrayList2, false);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener) {
        C78345Uov.LIZJ().getClass();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("consumeProduct , channelToken is ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        PurchasingService.notifyFulfillment(str, FulfillmentResult.FULFILLED);
        C78368UpI c78368UpI = new C78368UpI();
        c78368UpI.withErrorCode(0);
        consumeIapProductListener.onConsumeFinished(c78368UpI);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public AbstractC78349Uoz getAmazonState(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        return new C78307UoJ(interfaceC78388Upc, activity);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
        C78345Uov LIZJ = C78345Uov.LIZJ();
        LIZJ.getClass();
        String requestId = PurchasingService.getProductData(new HashSet(list)).toString();
        if (!TextUtils.isEmpty(requestId) && interfaceC78385UpZ != null) {
            ProductDataResponse productDataResponse = (ProductDataResponse) ((HashMap) LIZJ.LJ).get(requestId);
            if (productDataResponse != null) {
                LIZJ.LIZ(productDataResponse.getProductData(), interfaceC78385UpZ);
                ((HashMap) LIZJ.LJ).remove(requestId);
            } else {
                ((HashMap) LIZJ.LIZLLL).put(requestId, interfaceC78385UpZ);
            }
        }
    }
}
