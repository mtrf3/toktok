package com.bytedance.globalpayment.service.manager.iap;

import X.AbstractC78349Uoz;
import X.C77874UhK;
import X.InterfaceC77749UfJ;
import X.InterfaceC78395Upj;
import android.app.Activity;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* loaded from: classes14.dex */
public class IapExternalServiceImplOfMock implements IapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(C77874UhK c77874UhK) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC78349Uoz getNextState(AbstractC78349Uoz abstractC78349Uoz) {
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C77874UhK c77874UhK) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards(InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(InterfaceC78395Upj interfaceC78395Upj) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void setProductInterceptor(InterfaceC77749UfJ interfaceC77749UfJ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHostAndOrderPlatform(String str, String str2, int i) {
    }
}
