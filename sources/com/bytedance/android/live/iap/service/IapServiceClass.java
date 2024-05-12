package com.bytedance.android.live.iap.service;

import X.B83;
import X.C113554cx;
import X.C16880lQ;
import X.C1EU;
import X.C20010qT;
import X.C20030qV;
import X.C20050qX;
import X.C20060qY;
import X.C21240sS;
import X.C29374Bfu;
import X.C36351bj;
import X.C38354F3m;
import X.C77624UdI;
import X.C77874UhK;
import X.C78253UnR;
import X.C79004UzY;
import X.CN1;
import X.InterfaceC18450nx;
import X.InterfaceC18460ny;
import X.OSZ;
import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IapServiceClass implements IapService {
    public final String LJLIL = "";

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    public static IapPaymentMethod LIZ() {
        String str;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            str = iHostAppContext.getChannel();
        } else {
            str = null;
        }
        if (C38354F3m.LIZJ("amazon_int", str)) {
            return IapPaymentMethod.AMAZON;
        }
        return IapPaymentMethod.GOOGLE;
    }

    @Override // com.bytedance.android.live.iap.service.IapService
    public final void A5(SubscriptionAdPageActivity subscriptionAdPageActivity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(C1EU.LIZIZ("https://play.google.com/store/account/subscriptions", "sku", str).appendQueryParameter("package", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
        intent.setPackage("com.android.vending");
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        if (subscriptionAdPageActivity != null) {
            try {
                C16880lQ.LIZJ(subscriptionAdPageActivity, intent);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.live.iap.service.IapService
    public final void xi0(C20010qT c20010qT, InterfaceC18450nx interfaceC18450nx) {
        List list = (List) c20010qT.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        if (C79004UzY.LJJIFFI(arrayList)) {
            o.LJ(c20010qT.LIZIZ, "inapp");
            C21240sS c21240sS = new C21240sS();
            c21240sS.LIZ = 20;
            c21240sS.LIZIZ = -1;
            c21240sS.LIZJ = "query pipo product id list empty";
            if (o.LJ(c20010qT.LIZIZ, "inapp")) {
                C77624UdI.LIZIZ(20, -1, "query pipo product id list empty");
            } else {
                C77624UdI.LIZJ(20, -1, "query pipo product id list empty");
            }
            interfaceC18450nx.LIZIZ(c21240sS);
            return;
        }
        C36351bj c36351bj = new C36351bj(interfaceC18450nx, null);
        Object obj2 = c20010qT.LIZIZ;
        if (o.LJ(obj2, "inapp")) {
            C78253UnR.LJFF().queryProductDetails(LIZ(), arrayList, this.LJLIL, c36351bj);
            return;
        }
        if (o.LJ(obj2, "subs")) {
            C78253UnR.LJFF().querySubscriptionDetails(LIZ(), arrayList, this.LJLIL, c36351bj);
            return;
        }
        C21240sS c21240sS2 = new C21240sS();
        c21240sS2.LIZ = 10;
        c21240sS2.LIZIZ = -1;
        c21240sS2.LIZJ = "invalid query parameter";
        interfaceC18450nx.LIZIZ(c21240sS2);
    }

    @Override // com.bytedance.android.live.iap.service.IapService
    public final void I20(Activity activity, C20060qY c20060qY, InterfaceC18460ny interfaceC18460ny) {
        IapExternalService LJFF = C78253UnR.LJFF();
        long uptimeMillis = SystemClock.uptimeMillis();
        C20050qX c20050qX = c20060qY.LIZJ;
        C20030qV c20030qV = c20060qY.LIZLLL;
        boolean z = c20060qY.LIZIZ;
        C77874UhK c77874UhK = new C77874UhK(uptimeMillis);
        c77874UhK.LIZIZ = c20060qY.LIZ;
        c77874UhK.LJ = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        c77874UhK.LIZLLL = DeviceRegisterManager.getDeviceId();
        c77874UhK.LJIIJJI = z;
        if (c20050qX != null) {
            c77874UhK.LJIIIZ = c20050qX.LIZ;
            boolean LJ = o.LJ(c20050qX.LIZIZ, "subs");
            c77874UhK.LJII = LJ;
            if (LJ) {
                c77874UhK.LJIIL = C113554cx.LJJLIIIIJ(new OSZ("OfferIDToken", c20050qX.LIZJ), new OSZ("price_currency", c20050qX.LJ), new OSZ("price_amount_micros", String.valueOf(c20050qX.LIZLLL)));
            }
        }
        if (z && c20030qV != null) {
            c77874UhK.LJIIIIZZ = c20030qV.LIZIZ;
            c77874UhK.LJFF = c20030qV.LIZ;
        }
        LJFF.newPay(activity, c77874UhK, new C36351bj(null, interfaceC18460ny));
    }
}
