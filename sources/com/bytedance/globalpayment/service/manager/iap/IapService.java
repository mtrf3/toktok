package com.bytedance.globalpayment.service.manager.iap;

import X.C77874UhK;
import X.InterfaceC77749UfJ;
import X.InterfaceC78395Upj;
import android.app.Activity;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* loaded from: classes14.dex */
public interface IapService {
    void acquireReward(C77874UhK c77874UhK);

    void acquireReward(C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj);

    void addIapObserver(InterfaceC78395Upj interfaceC78395Upj);

    void getChannelUserData(IapPaymentMethod iapPaymentMethod);

    void getChannelUserData(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj);

    boolean hasInitEd();

    boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod);

    void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2);

    void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod);

    void newPay(Activity activity, C77874UhK c77874UhK);

    void newPay(Activity activity, C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj);

    void onAppResume();

    void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod);

    void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj);

    void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str);

    void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj);

    void queryRewards();

    void queryRewards(InterfaceC78395Upj interfaceC78395Upj);

    void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str);

    void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj);

    void removeIapObserver(InterfaceC78395Upj interfaceC78395Upj);

    void setProductInterceptor(InterfaceC77749UfJ interfaceC77749UfJ);

    void updateHost(String str);

    void updateHostAndOrderPlatform(String str, String str2, int i);
}
