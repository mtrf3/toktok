package com.bytedance.globalpayment.iap.service.provider;

import X.AbstractC78343Uot;
import X.AbstractC78349Uoz;
import X.C06540Nm;
import X.C16880lQ;
import X.C39670Fha;
import X.C77874UhK;
import X.C78261UnZ;
import X.C78273Unl;
import X.C78276Uno;
import X.C78295Uo7;
import X.C78301UoD;
import X.C78303UoF;
import X.C78336Uom;
import X.C78337Uon;
import X.C78338Uoo;
import X.C78342Uos;
import X.C78344Uou;
import X.C78346Uow;
import X.C78347Uox;
import X.C78350Up0;
import X.C78354Up4;
import X.C78355Up5;
import X.C78356Up6;
import X.C78357Up7;
import X.C78359Up9;
import X.C78360UpA;
import X.C78361UpB;
import X.C78366UpG;
import X.C78368UpI;
import X.C78374UpO;
import X.C78375UpP;
import X.C78379UpT;
import X.C78391Upf;
import X.C78392Upg;
import X.C78404Ups;
import X.EnumC78373UpN;
import X.InterfaceC77749UfJ;
import X.InterfaceC78381UpV;
import X.InterfaceC78382UpW;
import X.InterfaceC78388Upc;
import X.InterfaceC78395Upj;
import X.InterfaceC78402Upq;
import X.X1D;
import Y.ARunnableS16S0201000_13;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import com.bytedance.globalpayment.iap.state.extra.ExtraConsumeState;
import com.bytedance.globalpayment.iap.state.nomal.ConsumeProductState;
import com.bytedance.globalpayment.iap.state.pre.PreregisterConsumeState;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class IapServiceProvider extends AbstractC78343Uot implements IapExternalService, InterfaceC78381UpV, InterfaceC78388Upc {
    public final String TAG = C16880lQ.LJLLJ(IapServiceProvider.class);
    public final InterfaceC78382UpW mOnResumeQueryUnAckEdOrderListener = new InterfaceC78382UpW() { // from class: X.Upa
        @Override // X.InterfaceC78382UpW
        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List list) {
            IapServiceProvider.lambda$new$0(iapPaymentMethod, absResult, list);
        }
    };
    public InterfaceC78382UpW mQueryUnAckEdOrderListener = new C78350Up0(this);

    @Override // X.AbstractC78343Uot
    public InterfaceC78388Upc getIapInternalService() {
        return this;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
        queryRewards(null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return this.mInitEd.get();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
        if (this.mInitEd.getAndSet(true)) {
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJ(IapPaymentMethod.GOOGLE, new C78368UpI(401, 4011, "init failed because repeated init"));
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJ(IapPaymentMethod.AMAZON, new C78368UpI(401, 4011, "init failed because repeated init"));
            return;
        }
        if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJI) {
            PaymentServiceManager.get().getGoogleIapExternalService().setGpListener(this);
            PaymentServiceManager.get().getGoogleIapExternalService().init(new C78357Up7(this));
        }
        if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJII) {
            PaymentServiceManager.get().getAmazonIapExternalService().init(new C78366UpG(this));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
        if (this.mInitEd.get()) {
            queryRewardsInternal(true, null);
            if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJI) {
                C78342Uos.LIZLLL().LIZ();
                C78344Uou.LIZLLL(IapPaymentMethod.GOOGLE, this.mOnResumeQueryUnAckEdOrderListener);
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(C77874UhK c77874UhK) {
        acquireReward(c77874UhK, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(InterfaceC78395Upj interfaceC78395Upj) {
        C78391Upf c78391Upf = (C78391Upf) C78379UpT.LJ().LIZLLL();
        InterfaceC78395Upj interfaceC78395Upj2 = c78391Upf.LIZ;
        if (interfaceC78395Upj == interfaceC78395Upj2) {
            return;
        }
        if (interfaceC78395Upj2 == null) {
            c78391Upf.LIZ = interfaceC78395Upj;
            return;
        }
        if (c78391Upf.LIZIZ == null) {
            Set<InterfaceC78395Upj> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            c78391Upf.LIZIZ = newSetFromMap;
            newSetFromMap.add(c78391Upf.LIZ);
        }
        c78391Upf.LIZIZ.add(interfaceC78395Upj);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
        getChannelUserData(iapPaymentMethod, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC78349Uoz getNextState(AbstractC78349Uoz abstractC78349Uoz) {
        EnumC78373UpN LIZJ = abstractC78349Uoz.LIZJ();
        InterfaceC78395Upj interfaceC78395Upj = abstractC78349Uoz.LIZJ;
        switch (C78375UpP.LIZ[LIZJ.ordinal()]) {
            case 1:
                OrderData orderData = abstractC78349Uoz.LIZ;
                C78342Uos.LIZLLL().LIZ();
                IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
                getIapInternalService();
                AbstractC78349Uoz LIZIZ = C78344Uou.LIZIZ(iapPaymentMethod, this, this.mActivity.get());
                LIZIZ.LIZJ = interfaceC78395Upj;
                return LIZIZ;
            case 2:
            case 3:
                getIapInternalService();
                C78360UpA c78360UpA = new C78360UpA(this);
                c78360UpA.LIZJ = interfaceC78395Upj;
                return c78360UpA;
            case 4:
                getIapInternalService();
                C78338Uoo c78338Uoo = new C78338Uoo(this);
                c78338Uoo.LIZJ = interfaceC78395Upj;
                return c78338Uoo;
            case 5:
                getIapInternalService();
                ConsumeProductState consumeProductState = new ConsumeProductState(this);
                consumeProductState.LIZJ = interfaceC78395Upj;
                return consumeProductState;
            case 6:
                getIapInternalService();
                C78336Uom c78336Uom = new C78336Uom(this);
                c78336Uom.LIZJ = interfaceC78395Upj;
                return c78336Uom;
            case 7:
                getIapInternalService();
                ExtraConsumeState extraConsumeState = new ExtraConsumeState(this);
                extraConsumeState.LIZJ = interfaceC78395Upj;
                return extraConsumeState;
            case 8:
                getIapInternalService();
                C78361UpB c78361UpB = new C78361UpB(this);
                c78361UpB.LIZJ = interfaceC78395Upj;
                return c78361UpB;
            case 9:
                getIapInternalService();
                C78337Uon c78337Uon = new C78337Uon(this);
                c78337Uon.LIZJ = interfaceC78395Upj;
                return c78337Uon;
            case 10:
                getIapInternalService();
                PreregisterConsumeState preregisterConsumeState = new PreregisterConsumeState(this);
                preregisterConsumeState.LIZJ = interfaceC78395Upj;
                return preregisterConsumeState;
            default:
                return null;
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().isSupportGooglePay();
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().isSupportAmazonPay();
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
        C78342Uos.LIZLLL().LIZ().getClass();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToSubscriptionManagerPage();
        }
    }

    @Override // X.InterfaceC78381UpV
    public void onCJBillingCallback(OrderData orderData) {
        orderData.setOrderFromOtherSystem(true);
        getIapInternalService();
        new C78359Up9(this).LIZ(orderData);
    }

    @Override // X.InterfaceC78388Upc
    public void onIapOrderFinished(OrderData orderData) {
        if (orderData.isFinished()) {
            this.mPayingRequests.remove(orderData);
        }
        if (orderData.isSuccess()) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mUnfinishedProductIds.remove:");
            LIZ.append(orderData.getProductId());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            this.mUnSuccessEdProductIds.remove(orderData.getProductId());
            return;
        }
        AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
        if (absIapChannelOrderData == null || absIapChannelOrderData.getOrderState() != 1 || orderData.isConsumed() || orderData.isQuerySucceed()) {
            return;
        }
        this.mUnSuccessEdProductIds.add(orderData.getProductId());
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
        C78391Upf c78391Upf = (C78391Upf) C78379UpT.LJ().LIZLLL();
        c78391Upf.getClass();
        if (C78391Upf.LJIIIIZZ()) {
            c78391Upf.LIZLLL(orderInfo);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS16S0201000_13(1, c78391Upf, orderInfo, 4));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
        queryHasSubscriptionProducts(iapPaymentMethod, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards(InterfaceC78395Upj interfaceC78395Upj) {
        if (this.mInitEd.get()) {
            queryRewardsInternal(false, interfaceC78395Upj);
        }
    }

    @Override // X.InterfaceC78388Upc
    public void removeAcquireRewards(String str) {
        ConcurrentHashMap<String, AbsIapChannelOrderData> concurrentHashMap = this.mRewards;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(InterfaceC78395Upj interfaceC78395Upj) {
        C78391Upf c78391Upf = (C78391Upf) C78379UpT.LJ().LIZLLL();
        Set<InterfaceC78395Upj> set = c78391Upf.LIZIZ;
        if (set != null) {
            set.remove(interfaceC78395Upj);
            if (c78391Upf.LIZIZ.size() == 0) {
                c78391Upf.LIZIZ = null;
            }
        }
        if (interfaceC78395Upj == c78391Upf.LIZ) {
            c78391Upf.LIZ = null;
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void setProductInterceptor(InterfaceC77749UfJ interfaceC77749UfJ) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setProductInterceptor , interceptor = ");
        LIZ.append(interfaceC77749UfJ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78379UpT.LJ().LIZ().getClass();
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setProductInterceptor , interceptor = ");
        LIZ2.append(interfaceC77749UfJ);
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.getClass();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE && !((C78301UoD) C78273Unl.LJIIIZ().LJIIIIZZ()).LIZLLL()) {
            C78342Uos.LIZLLL().LIZ();
            C78344Uou.LIZLLL(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            C78342Uos.LIZLLL().LIZ();
            C78344Uou.LIZLLL(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateHost to ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78379UpT.LJ().LIZ().getClass();
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateHost: ");
        LIZ2.append(str);
        LIZ2.append(", orderPlatform = ");
        LIZ2.append(0);
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        C78276Uno.LIZ(str, "", 0);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj) {
        if (!this.mInitEd.get()) {
            return;
        }
        if (c77874UhK == null) {
            C78368UpI c78368UpI = new C78368UpI(201, 2011, "pipoRequest is null when preregisterRewardsPay.");
            c78368UpI.LIZIZ = c77874UhK;
            c78368UpI.LIZJ = PayType.PRE;
            ((C78392Upg) C78379UpT.LJ().LIZJ()).LJI(c78368UpI, interfaceC78395Upj, null);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI, null);
            return;
        }
        PayType payType = PayType.PRE;
        OrderData orderData = new OrderData(c77874UhK, payType);
        orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
        String productId = orderData.getProductId();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoPayManger: preregisterRewards Pay:");
        LIZ.append(productId);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78295Uo7 c78295Uo7 = new C78295Uo7(orderData, payType, productId, orderData.getOrderId(), c77874UhK.LJII);
        orderData.setIapPayMonitor(c78295Uo7);
        c78295Uo7.LIZ();
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("pipo_pay_start", C78342Uos.LIZLLL().LIZIZ().LIZ(orderData));
        if (this.mRewards.containsKey(productId)) {
            orderData.setAbsIapChannelOrderData(this.mRewards.get(productId));
            acquireRewardInternal(orderData, interfaceC78395Upj);
        } else {
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new C78347Uox(this, orderData, c77874UhK, interfaceC78395Upj, productId));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData) {
        if (!this.mInitEd.get()) {
            return;
        }
        String productId = absIapChannelOrderData.getProductId();
        for (Object obj : this.mPayingRequests.toArray()) {
            if (TextUtils.equals(((OrderData) obj).getProductId(), productId)) {
                C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(productId);
                LIZ.append(" is paying, need not restore! ");
                X1D.LIZIZ(LIZ);
                LJ.getClass();
                return;
            }
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PipoPayManger: execute un upload token order:");
        LIZ2.append(absIapChannelOrderData.getChannelOrderId());
        LIZ2.append(" then will query the sku details from ");
        LIZ2.append(iapPaymentMethod.channelName);
        LIZ2.append(" service");
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(productId);
        C78342Uos.LIZLLL().LIZ();
        C78344Uou.LIZJ(iapPaymentMethod, arrayList, absIapChannelOrderData.isSubscription(), new C78355Up5(this, absIapChannelOrderData, iapPaymentMethod, arrayList, productId));
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj) {
        C78342Uos.LIZLLL().LIZ().getClass();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            C78368UpI c78368UpI = new C78368UpI(1, -1, "google not support get user data");
            ((C78392Upg) C78379UpT.LJ().LIZJ()).LJFF(c78368UpI, interfaceC78395Upj, null);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIIZ(c78368UpI, null);
        } else {
            if (iapPaymentMethod != IapPaymentMethod.AMAZON) {
                return;
            }
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(new C78374UpO(interfaceC78395Upj));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C77874UhK c77874UhK) {
        newPay(activity, c77874UhK, null);
    }

    @Override // X.InterfaceC78381UpV
    public void onPurchasesUpdated(C78368UpI c78368UpI, List<AbsIapChannelOrderData> list) {
        queryRewardsInternal(true, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj) {
        if (this.mInitEd.get()) {
            C78342Uos.LIZLLL().LIZ().getClass();
            if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
                PaymentServiceManager.get().getGoogleIapExternalService().queryHasSubscriptionProducts(interfaceC78395Upj);
                return;
            }
            C78368UpI c78368UpI = new C78368UpI(1, -1, "query has subscription not support amazon!");
            InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
            IapPaymentMethod iapPaymentMethod2 = IapPaymentMethod.AMAZON;
            ((C78392Upg) LIZJ).LJII(c78368UpI, interfaceC78395Upj, iapPaymentMethod2, null);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIL(iapPaymentMethod2, c78368UpI, null);
        }
    }

    public static /* synthetic */ void lambda$new$0(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List list) {
        if (absResult != null && absResult.getCode() == 0 && list != null) {
            for (Object obj : list.toArray()) {
                if (obj != null) {
                    AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                    if (!TextUtils.isEmpty(absIapChannelOrderData.getSelfOrderId()) && absIapChannelOrderData.getOrderState() != 2) {
                        PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        C78342Uos.LIZLLL().LIZ().getClass();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToNotExpiredSubscriptionManagerPage(str, str2);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj) {
        if (this.mInitEd.get()) {
            this.mActivity = new WeakReference<>(activity);
            if (c77874UhK == null) {
                C78368UpI c78368UpI = new C78368UpI(201, 2011, "PipoPayManger.executeNewPay:pipoRequest is null.");
                c78368UpI.LIZIZ = c77874UhK;
                c78368UpI.LIZJ = PayType.NOMAL;
                ((C78392Upg) C78379UpT.LJ().LIZJ()).LJI(c78368UpI, interfaceC78395Upj, null);
                ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI, null);
                return;
            }
            PayType payType = PayType.NOMAL;
            OrderData orderData = new OrderData(c77874UhK, payType);
            C78295Uo7 c78295Uo7 = new C78295Uo7(orderData, payType, orderData.getProductId(), orderData.getOrderId(), c77874UhK.LJII);
            orderData.setIapPayMonitor(c78295Uo7);
            c78295Uo7.LIZ();
            String orderId = orderData.getOrderId();
            if (orderId != null) {
                C78404Ups.LJLIL = orderId;
                C78404Ups.LJLILLLLZI = 0L;
                C78404Ups.LJLJI = 0L;
                C78404Ups.LJLJJI = 0L;
            }
            C78273Unl.LJIIIZ().LIZIZ().onEventV3("pipo_pay_start", C78342Uos.LIZLLL().LIZIZ().LIZ(orderData));
            IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
            if (this.mUnSuccessEdProductIds.contains(orderData.getProductId())) {
                C78342Uos.LIZLLL().LIZ();
                C78344Uou.LIZLLL(iapPaymentMethod, new C78346Uow(this, orderData, c78295Uo7, iapPaymentMethod, interfaceC78395Upj));
            } else {
                executeNewPayInternal(orderData, interfaceC78395Upj);
            }
            tryRestoreUnAckOrder(iapPaymentMethod);
        }
    }

    @Override // X.InterfaceC78382UpW
    public void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        if (absResult == null || list == null) {
            return;
        }
        if (absResult.getCode() != 0) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PipoPayManger: query history purchase failed, error: ");
            LIZ.append(absResult.getMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            return;
        }
        if (list.isEmpty()) {
            b1.LIZLLL();
            return;
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PipoPayManger: query history purchase finished, item count: ");
        LIZ2.append(list.size());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        if (((C78301UoD) C78273Unl.LJIIIZ().LJIIIIZZ()).LIZLLL()) {
            return;
        }
        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
            C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PipoPayManger: deal with the unfinished order : purchase :");
            LIZ3.append(absIapChannelOrderData);
            LIZ3.append(", isSubscription:");
            LIZ3.append(absIapChannelOrderData.isSubscription());
            LIZ3.append(", isAcknowledged:");
            LIZ3.append(absIapChannelOrderData.isAcknowledged());
            LIZ3.append(", purchase state:");
            LIZ3.append(absIapChannelOrderData.getOrderState());
            X1D.LIZIZ(LIZ3);
            LJ3.getClass();
            if (absIapChannelOrderData.isOrderStateSuccess()) {
                String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                if (!TextUtils.isEmpty(channelOrderId) || !TextUtils.isEmpty(developerPayload)) {
                    executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                }
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
        queryProductDetails(iapPaymentMethod, list, str, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
        querySubscriptionDetails(iapPaymentMethod, list, str, null);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHostAndOrderPlatform(String str, String str2, int i) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZLLL = C06540Nm.LIZLLL("updateHost: pipoHost=", str, ", mpHost=", str2, ",orderPlatform=");
        LIZLLL.append(i);
        X1D.LIZIZ(LIZLLL);
        LJ.getClass();
        C78379UpT.LJ().LIZ().getClass();
        C78276Uno.LIZ(str, str2, i);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj) {
        if (this.mInitEd.get()) {
            C78342Uos.LIZLLL().LIZ();
            C78344Uou.LIZJ(iapPaymentMethod, list, false, new C78354Up4(this, str, iapPaymentMethod, interfaceC78395Upj, list));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str, InterfaceC78395Upj interfaceC78395Upj) {
        if (this.mInitEd.get()) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, true, new C78356Up6(this, str, interfaceC78395Upj));
        }
    }
}
