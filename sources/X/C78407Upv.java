package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Upv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78407Upv implements InterfaceC78376UpQ, C0HW {
    public static String LJIILL;
    public static volatile C78407Upv LJIILLIIL;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final ConcurrentMap<String, InterfaceC78435UqN> LIZIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC78435UqN> LIZJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConsumeIapProductListener> LIZLLL = new ConcurrentHashMap();
    public final CopyOnWriteArraySet<Purchase> LJ = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC78437UqP> LJFF = new CopyOnWriteArraySet<>();
    public final java.util.Map<String, SkuDetails> LJI = new HashMap();
    public final List<AbsIapChannelOrderData> LJII = FII.LIZ();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final C78371UpL LJIIIZ;
    public final C78423UqB LJIIJ;
    public C1FD LJIIJJI;
    public InterfaceC78381UpV LJIIL;
    public final AtomicBoolean LJIILIIL;
    public boolean LJIILJJIL;

    static {
        C16880lQ.LJLLJ(C78407Upv.class);
        LJIILL = "CONSTRUCT_YOUR";
    }

    public static InterfaceC78376UpQ LIZLLL() {
        if (LJIILLIIL == null) {
            synchronized (C78407Upv.class) {
                if (LJIILLIIL == null) {
                    LJIILLIIL = new C78407Upv();
                }
            }
        }
        return LJIILLIIL;
    }

    public C78407Upv() {
        new ConcurrentHashMap();
        this.LJIIIZ = new C78371UpL(this);
        this.LJIIJ = new C78423UqB(this);
        this.LJIILIIL = new AtomicBoolean(false);
    }

    @Override // X.InterfaceC78376UpQ
    public final boolean isSupportGooglePay() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC78376UpQ
    public final void LIZ(InterfaceC78382UpW interfaceC78382UpW) {
        LIZIZ(new C78415Uq3(this, interfaceC78382UpW));
    }

    public final void LIZIZ(InterfaceC78437UqP interfaceC78437UqP) {
        if (this.LJIILIIL.get()) {
            this.LJFF.add(interfaceC78437UqP);
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mBillingSetUpListeners added item in executeServiceRequest because mIsServiceConnecting:");
            LIZ.append(this.LJFF.size());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            return;
        }
        if (this.LIZ.get()) {
            interfaceC78437UqP.LIZIZ();
            return;
        }
        this.LJFF.add(interfaceC78437UqP);
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mBillingSetUpListeners added item in executeServiceRequest because not mIsServiceConnected:");
        LIZ2.append(this.LJFF.size());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        try {
            if (!this.LJIILIIL.getAndSet(true)) {
                C78273Unl.LJIIIZ().LJ().getClass();
                this.LJIIJJI.LJII(this.LJIIJ);
            }
        } catch (Throwable th) {
            C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("connectWithGoogleService error: ");
            LIZ3.append(th.getMessage());
            X1D.LIZIZ(LIZ3);
            LJ3.getClass();
        }
    }

    public final void LJ(InterfaceC78390Upe interfaceC78390Upe) {
        if (this.LJIIJJI == null) {
            C04830Gx c04830Gx = new C04830Gx(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ);
            c04830Gx.LIZJ = this;
            c04830Gx.LIZ = true;
            this.LJIIJJI = c04830Gx.LIZ();
        }
        LJIILL = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZIZ;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mBillingSetUpListeners before init:");
        LIZ.append(this.LJFF.size());
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        this.LJFF.add(this.LJIIIZ);
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mBillingSetUpListeners after init:");
        LIZ2.append(this.LJFF.size());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        LIZIZ(new C78383UpX(this, interfaceC78390Upe));
    }

    @Override // X.InterfaceC78376UpQ
    public final void queryHasSubscriptionProducts(InterfaceC78395Upj interfaceC78395Upj) {
        this.LJIIJJI.LJIIL("subs", new C78393Uph(interfaceC78395Upj));
    }

    @Override // X.InterfaceC78376UpQ
    public final void setGpListener(InterfaceC78381UpV interfaceC78381UpV) {
        if (this.LJIIL == null) {
            this.LJIIL = interfaceC78381UpV;
        }
    }

    public final void LJFF(List<Purchase> list, boolean z) {
        this.LJ.addAll(list);
        StringBuilder sb = new StringBuilder();
        for (Purchase purchase : list) {
            sb.append(purchase.toString());
            this.LJII.add(new C78365UpF(purchase, z));
        }
        if (list.size() == 0) {
            sb.append("size of 0 list");
        }
        if (z) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("the result puchases of subscription query from google service is ");
            LIZ.append(sb.toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            return;
        }
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("the result puchases of inapp query from google service is ");
        LIZ2.append(sb.toString());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
    }

    @Override // X.C0HW
    public final void onPurchasesUpdated(C0HE c0he, List<Purchase> list) {
        boolean z;
        boolean z2;
        C78438UqQ c78438UqQ;
        Context context;
        C1FC LIZ;
        JSONObject jSONObject;
        String[] split;
        String[] split2;
        boolean z3;
        java.util.Map<String, SkuDetails> map = this.LJI;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Purchase purchase : list) {
                SkuDetails skuDetails = (SkuDetails) ((HashMap) map).get(C78847Ux1.LJJIIJ(purchase));
                if (skuDetails != null && skuDetails.LIZIZ().equals("subs")) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C78365UpF(purchase, z));
            }
        }
        this.LJIIL.onPurchasesUpdated(C78897Uxp.LJIJI(c0he), arrayList);
        this.LJIIIIZZ.compareAndSet(true, false);
        C78368UpI LJIJI = C78897Uxp.LJIJI(c0he);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BillingManager: onPurchasesUpdated, updated result is ");
        LIZ2.append(LJIJI);
        new StringBuilder(X1D.LIZIZ(LIZ2));
        if (list != null) {
            list.size();
            list.size();
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                it.next().toString();
            }
        }
        C78332Uoi.LIZJ().LJ(LJIJI, c0he, list);
        if (c0he.LIZ == 0) {
            HashSet hashSet = new HashSet(((ConcurrentHashMap) this.LIZIZ).keySet());
            hashSet.addAll(((ConcurrentHashMap) this.LIZJ).keySet());
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                for (Purchase purchase2 : list) {
                    String str = purchase2.LIZ;
                    String str2 = purchase2.LIZIZ;
                    if (!LJIILL.contains("CONSTRUCT_YOUR")) {
                        try {
                        } catch (Exception e) {
                            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("BillingManager: got an exception trying to validate a purchase: ");
                            LIZ3.append(e.getLocalizedMessage());
                            X1D.LIZIZ(LIZ3);
                            LJ.getClass();
                        }
                        if (C78886Uxe.LJJLJ(LJIILL, str, str2)) {
                            arrayList2.add(purchase2);
                            if (purchase2.LIZJ() == 1) {
                                this.LJ.add(purchase2);
                            }
                        } else {
                            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("BillingManager: the purchase of order id : ");
                            LIZ4.append(purchase2.LIZJ.optString("orderId"));
                            LIZ4.append(" is a bad purchase , ignore it...");
                            X1D.LIZIZ(LIZ4);
                            LJ2.getClass();
                            String LJJIIJ = C78847Ux1.LJJIIJ(purchase2);
                            if (!hashSet.contains(LJJIIJ)) {
                                C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("BillingManager: pending and purchased map doesn't contains the  sku : ");
                                LIZ5.append(LJJIIJ);
                                LIZ5.append(" go query purchases process");
                                X1D.LIZIZ(LIZ5);
                                LJ3.getClass();
                                C78332Uoi.LIZJ().LIZ(purchase2);
                                LIZ(this.LJIIL);
                            } else {
                                InterfaceC78435UqN interfaceC78435UqN = (InterfaceC78435UqN) ((ConcurrentHashMap) this.LIZIZ).get(LJJIIJ);
                                InterfaceC78435UqN interfaceC78435UqN2 = (InterfaceC78435UqN) ((ConcurrentHashMap) this.LIZJ).get(LJJIIJ);
                                SkuDetails skuDetails2 = (SkuDetails) ((HashMap) this.LJI).get(LJJIIJ);
                                if (skuDetails2 != null && skuDetails2.LIZIZ().equals("subs")) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (interfaceC78435UqN2 != null) {
                                    interfaceC78435UqN2.LJFF(new C78365UpF(purchase2, z3));
                                } else if (interfaceC78435UqN != null) {
                                    interfaceC78435UqN.LJFF(new C78365UpF(purchase2, z3));
                                }
                            }
                        }
                    } else {
                        throw new RuntimeException("Please update your app's public key at: BASE_64_ENCODED_PUBLIC_KEY");
                    }
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Purchase purchase3 = (Purchase) it2.next();
                String LJJIIJ2 = C78847Ux1.LJJIIJ(purchase3);
                C39670Fha LJ4 = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("BillingManager: deal the purchase which sku is ");
                LIZ6.append(LJJIIJ2);
                X1D.LIZIZ(LIZ6);
                LJ4.getClass();
                if (!hashSet.contains(LJJIIJ2)) {
                    if (purchase3 != null && (LIZ = purchase3.LIZ()) != null) {
                        String str3 = (String) LIZ.LJLILLLLZI;
                        String str4 = (String) LIZ.LJLJI;
                        try {
                            jSONObject = new JSONObject();
                            split = C28833BTh.LIZ(str3).split("-");
                            split2 = C28833BTh.LIZ(str4).split("-");
                        } catch (Exception unused) {
                        }
                        if (split.length != 0 && split2.length != 0) {
                            jSONObject.put("trade_no", split2[0]);
                            jSONObject.put("trade_amount", split2[1]);
                            jSONObject.put("app_id", split[0]);
                            jSONObject.put("merchant_id", split[1]);
                            jSONObject.put("uid", split[2]);
                            String optString = jSONObject.optString("merchant_id");
                            String optString2 = jSONObject.optString("uid");
                            String optString3 = jSONObject.optString("trade_no");
                            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                                if (this.LJII.size() == 0) {
                                    LIZ(new C78405Upt(this, purchase3, optString, optString2, optString3));
                                } else {
                                    LJII(purchase3, optString, optString2, optString3);
                                }
                            }
                        }
                    }
                    C39670Fha LJ5 = C78273Unl.LJIIIZ().LJ();
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("BillingManager: pending and purchased map doesn't contains the  sku : ");
                    LIZ7.append(LJJIIJ2);
                    LIZ7.append(" go query purchases process");
                    X1D.LIZIZ(LIZ7);
                    LJ5.getClass();
                    C78332Uoi.LIZJ().LIZ(purchase3);
                    LIZ(this.LJIIL);
                }
                InterfaceC78435UqN interfaceC78435UqN3 = (InterfaceC78435UqN) ((ConcurrentHashMap) this.LIZIZ).get(LJJIIJ2);
                InterfaceC78435UqN interfaceC78435UqN4 = (InterfaceC78435UqN) ((ConcurrentHashMap) this.LIZJ).get(LJJIIJ2);
                SkuDetails skuDetails3 = (SkuDetails) ((HashMap) this.LJI).get(LJJIIJ2);
                if (skuDetails3 != null && skuDetails3.LIZIZ().equals("subs")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C78365UpF c78365UpF = new C78365UpF(purchase3, z2);
                if (skuDetails3 == null) {
                    context = null;
                    c78438UqQ = null;
                } else {
                    c78438UqQ = new C78438UqQ(skuDetails3);
                    context = null;
                }
                RestoreOrderService.getIns(context).onGoogleCallback(c78365UpF);
                if (interfaceC78435UqN4 != null) {
                    C39670Fha LJ6 = C78273Unl.LJIIIZ().LJ();
                    Object[] objArr = {LJJIIJ2, Integer.valueOf(interfaceC78435UqN4.hashCode())};
                    LJ6.getClass();
                    C16880lQ.LLLZ("BillingManager: dispatch '%s' to pendingListener(%s) to deal with.", objArr);
                    interfaceC78435UqN4.LIZLLL(C78897Uxp.LJIJI(c0he), c78365UpF, c78438UqQ);
                    ((ConcurrentHashMap) this.LIZJ).remove(LJJIIJ2, interfaceC78435UqN4);
                } else if (interfaceC78435UqN3 != null) {
                    C39670Fha LJ7 = C78273Unl.LJIIIZ().LJ();
                    Object[] objArr2 = {LJJIIJ2, Integer.valueOf(interfaceC78435UqN3.hashCode())};
                    LJ7.getClass();
                    C16880lQ.LLLZ("BillingManager: dispatch '%s' to purchasedListener(%s) to deal with.", objArr2);
                    interfaceC78435UqN3.LIZLLL(C78897Uxp.LJIJI(c0he), c78365UpF, c78438UqQ);
                    ((ConcurrentHashMap) this.LIZIZ).remove(LJJIIJ2, interfaceC78435UqN3);
                    C39670Fha LJ8 = C78273Unl.LJIIIZ().LJ();
                    StringBuilder LIZIZ = C25620zW.LIZIZ("BillingManager: remove billing purchases update listener for ", LJJIIJ2, " and listener hashCode is ");
                    LIZIZ.append(interfaceC78435UqN3.hashCode());
                    X1D.LIZIZ(LIZIZ);
                    LJ8.getClass();
                    if (purchase3.LIZJ() == 2) {
                        C39670Fha LJ9 = C78273Unl.LJIIIZ().LJ();
                        StringBuilder LIZIZ2 = C25620zW.LIZIZ("BillingManager: add sku of ", LJJIIJ2, " and listenter of ");
                        LIZIZ2.append(interfaceC78435UqN3.hashCode());
                        LIZIZ2.append(" to pending list");
                        X1D.LIZIZ(LIZIZ2);
                        LJ9.getClass();
                        ((ConcurrentHashMap) this.LIZJ).put(LJJIIJ2, interfaceC78435UqN3);
                    }
                } else {
                    C78273Unl.LJIIIZ().LJ().getClass();
                    C16880lQ.LLLZ("BillingManager: Serious error! sku: '%s' cannot be deal with.", new Object[]{LJJIIJ2});
                }
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Object obj : ((ConcurrentHashMap) this.LIZIZ).keySet()) {
            InterfaceC78435UqN interfaceC78435UqN5 = (InterfaceC78435UqN) ((ConcurrentHashMap) this.LIZIZ).get(obj);
            if (interfaceC78435UqN5 != null && interfaceC78435UqN5.LIZIZ() < 1 && !interfaceC78435UqN5.LJ() && interfaceC78435UqN5.LJIIIIZZ() != null && interfaceC78435UqN5.LJII() != null) {
                if (c0he.LIZ == -1 && this.LJIIIIZZ.compareAndSet(false, true)) {
                    LIZIZ(new C78433UqL(this, interfaceC78435UqN5));
                } else if ((c0he.LIZ == -3 || TextUtils.equals("An internal error occurred.", c0he.LIZIZ)) && this.LJIIIIZZ.compareAndSet(false, true)) {
                    Activity LJIIIIZZ = interfaceC78435UqN5.LJIIIIZZ();
                    C0HB LJII = interfaceC78435UqN5.LJII();
                    interfaceC78435UqN5.LJI();
                    this.LJIIJJI.LJFF(LJIIIIZZ, LJII);
                }
                concurrentHashMap.put(obj, interfaceC78435UqN5);
            }
            interfaceC78435UqN5.LIZLLL(C78897Uxp.LJIJI(c0he), null, null);
        }
        ((ConcurrentHashMap) this.LIZIZ).clear();
        ((ConcurrentHashMap) this.LIZIZ).putAll(concurrentHashMap);
        C78273Unl.LJIIIZ().LJ().getClass();
    }

    @Override // X.InterfaceC78376UpQ
    public final void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            b1.LIZLLL();
        } else {
            LIZIZ(new C78431UqJ(this, z, str, consumeIapProductListener));
        }
    }

    @Override // X.InterfaceC78376UpQ
    public final void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
        LIZIZ(new C78418Uq6(this, z, list, interfaceC78385UpZ));
    }

    public final void LJII(Purchase purchase, String str, String str2, String str3) {
        for (AbsIapChannelOrderData absIapChannelOrderData : this.LJII) {
            if (TextUtils.equals(absIapChannelOrderData.getProductId(), C78847Ux1.LJJIIJ(purchase))) {
                boolean isSubscription = absIapChannelOrderData.isSubscription();
                C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZLLL = C06540Nm.LIZLLL("deal with  caijing callback , merchantId is ", str, " userId is ", str2, " tradeNo is ");
                LIZLLL.append(str3);
                LIZLLL.append(" isSub:");
                LIZLLL.append(isSubscription);
                X1D.LIZIZ(LIZLLL);
                LJ.getClass();
                C77874UhK c77874UhK = new C77874UhK(SystemClock.uptimeMillis());
                c77874UhK.LIZIZ = str;
                c77874UhK.LJ = str2;
                c77874UhK.LJII = isSubscription;
                PayType payType = PayType.CAIJING_CALLBACK;
                OrderData orderData = new OrderData(c77874UhK, payType);
                orderData.setProductId(absIapChannelOrderData.getProductId());
                orderData.setOrderId(str3);
                orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
                orderData.setUserId(str2);
                orderData.setAbsIapChannelOrderData(absIapChannelOrderData);
                orderData.setIapPayMonitor(new C78295Uo7(orderData, payType, absIapChannelOrderData.getProductId(), str3, isSubscription));
                this.LJIIL.onCJBillingCallback(orderData);
            }
        }
    }

    public final void LJI(Activity activity, String str, boolean z, OrderData orderData, C78315UoR c78315UoR) {
        LIZIZ(new C78411Upz(this, activity, str, z, orderData, c78315UoR));
    }

    public final void LIZJ(Activity activity, C04920Hg c04920Hg, String str, OrderData orderData, InterfaceC78435UqN interfaceC78435UqN, int i, C0HE c0he) {
        this.LJIIJJI.LIZ(c04920Hg, new C78409Upx(this, i, c0he, activity, c04920Hg, str, orderData, interfaceC78435UqN));
    }
}
