package com.bytedance.globalpayment.iap.google.service.provider;

import X.AbstractC78349Uoz;
import X.C0ON;
import X.C16880lQ;
import X.C73994T2g;
import X.C78261UnZ;
import X.C78273Unl;
import X.C78312UoO;
import X.C78369UpJ;
import X.C78378UpS;
import X.C78407Upv;
import X.C78408Upw;
import X.InterfaceC78381UpV;
import X.InterfaceC78382UpW;
import X.InterfaceC78385UpZ;
import X.InterfaceC78388Upc;
import X.InterfaceC78390Upe;
import X.InterfaceC78395Upj;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.service.PayloadPreferencesServiceImpl;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* loaded from: classes14.dex */
public class GoogleIapExternalServiceProvider implements GoogleIapExternalService {
    public static Boolean supportNewBilling = Boolean.TRUE;

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isGoogleBillingNew() {
        if (!supportNewBilling.booleanValue()) {
            return false;
        }
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIILLIIL("iap_exp_google_billing_new", 1) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse("https://play.google.com/store/account/subscriptions"));
        intent.addFlags(268435456);
        C16880lQ.LIZJ(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return PayloadPreferencesServiceImpl.getInstance();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return RestoreOrderService.getIns(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        if (isGoogleBillingNew()) {
            return C78408Upw.LJFF().isSupportGooglePay();
        }
        return C78407Upv.LIZLLL().isSupportGooglePay();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(InterfaceC78390Upe interfaceC78390Upe) {
        C78378UpS c78378UpS = new C78378UpS(interfaceC78390Upe);
        C78369UpJ c78369UpJ = new C78369UpJ(interfaceC78390Upe, c78378UpS);
        if (isGoogleBillingNew()) {
            ((C78408Upw) C78408Upw.LJFF()).LJI(c78369UpJ);
        } else {
            ((C78407Upv) C78407Upv.LIZLLL()).LJ(c78378UpS);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts(InterfaceC78395Upj interfaceC78395Upj) {
        if (isGoogleBillingNew()) {
            C78408Upw.LJFF().queryHasSubscriptionProducts(interfaceC78395Upj);
        } else {
            C78407Upv.LIZLLL().queryHasSubscriptionProducts(interfaceC78395Upj);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC78382UpW interfaceC78382UpW) {
        if (isGoogleBillingNew()) {
            C78408Upw.LJFF().LIZ(interfaceC78382UpW);
        } else {
            C78407Upv.LIZLLL().LIZ(interfaceC78382UpW);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(InterfaceC78381UpV interfaceC78381UpV) {
        if (isGoogleBillingNew()) {
            C78408Upw.LJFF().setGpListener(interfaceC78381UpV);
        }
        C78407Upv.LIZLLL().setGpListener(interfaceC78381UpV);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC78349Uoz getGoogleState(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        return new C78312UoO(interfaceC78388Upc, activity);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(C0ON.LIZJ("https://play.google.com/store/account/subscriptions?sku=", str, "&package=", str2)));
        intent.addFlags(268435456);
        C16880lQ.LIZJ(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (isGoogleBillingNew()) {
            C78408Upw.LJFF().consumeProduct(z, str, consumeIapProductListener);
        } else {
            C78407Upv.LIZLLL().consumeProduct(z, str, consumeIapProductListener);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
        if (isGoogleBillingNew()) {
            C78408Upw.LJFF().queryProductDetails(list, z, interfaceC78385UpZ);
        } else {
            C78407Upv.LIZLLL().queryProductDetails(list, z, interfaceC78385UpZ);
        }
    }
}
