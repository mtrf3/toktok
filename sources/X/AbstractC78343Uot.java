package X;

import android.app.Activity;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Uot, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78343Uot {
    public final String TAG = C16880lQ.LJLLJ(AbstractC78343Uot.class);
    public AtomicBoolean mInitEd = new AtomicBoolean(false);
    public WeakReference<Activity> mActivity = new WeakReference<>(null);
    public List<OrderData> mPayingRequests = FII.LIZ();
    public ConcurrentHashMap<String, AbsIapChannelOrderData> mRewards = new ConcurrentHashMap<>();
    public java.util.Set<String> mUnSuccessEdProductIds = Q4K.LIZLLL();

    public abstract InterfaceC78388Upc getIapInternalService();

    private void extraUploadToken(OrderData orderData) {
        this.mUnSuccessEdProductIds.add(orderData.getProductId());
        if (orderData.getIapPayMonitor() != null) {
            orderData.getIapPayMonitor().LIZ();
        }
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("pipo_pay_start", C78342Uos.LIZLLL().LIZIZ().LIZ(orderData));
        new C78359Up9(getIapInternalService()).LIZ(orderData);
        this.mPayingRequests.add(orderData);
    }

    public void acquireRewardInternal(OrderData orderData, InterfaceC78395Upj interfaceC78395Upj) {
        C78319UoV c78319UoV = new C78319UoV(getIapInternalService());
        c78319UoV.LIZJ = interfaceC78395Upj;
        c78319UoV.LIZ(orderData);
        this.mPayingRequests.add(orderData);
    }

    public void executeNewPayInternal(OrderData orderData, InterfaceC78395Upj interfaceC78395Upj) {
        InterfaceC78401Upp LIZ = C78342Uos.LIZLLL().LIZ();
        IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
        C78380UpU c78380UpU = new C78380UpU(this, orderData, interfaceC78395Upj);
        LIZ.getClass();
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(c78380UpU);
        } else {
            c78380UpU.LIZ("", "");
        }
    }

    public void payInternal(OrderData orderData, InterfaceC78395Upj interfaceC78395Upj) {
        C78273Unl.LJIIIZ().LJIIIIZZ();
        if (C78301UoD.LIZJ().LIZIZ() && orderData.getIapPayRequest().LJIIJJI) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PipoPayManger: executeNewPayInternal success with productId:  ");
            LIZ.append(orderData.getProductId());
            LIZ.append(" and not trade to pipo");
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            orderData.execute();
            C78342Uos.LIZLLL().LIZ();
            AbstractC78349Uoz LIZIZ = C78344Uou.LIZIZ(orderData.getIapPaymentMethod(), getIapInternalService(), this.mActivity.get());
            LIZIZ.LIZJ = interfaceC78395Upj;
            LIZIZ.LIZ(orderData);
        } else {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PipoPayManger: executeNewPayInternal success with productId:  ");
            LIZ2.append(orderData.getProductId());
            LIZ2.append(" and  trade to pipo");
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            C78320UoW c78320UoW = new C78320UoW(getIapInternalService());
            c78320UoW.LIZJ = interfaceC78395Upj;
            c78320UoW.LIZ(orderData);
        }
        this.mPayingRequests.add(orderData);
    }

    public void queryRewardsInternal(boolean z, InterfaceC78395Upj interfaceC78395Upj) {
        if (!this.mInitEd.get()) {
            return;
        }
        if (z && !((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJFF) {
            return;
        }
        PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new C78348Uoy(this, z, interfaceC78395Upj));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void restoreOrderByUploadToken(com.bytedance.globalpayment.iap.model.IapPaymentMethod r23, com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData r24, com.bytedance.globalpayment.iap.model.AbsIapProduct r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78343Uot.restoreOrderByUploadToken(com.bytedance.globalpayment.iap.model.IapPaymentMethod, com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData, com.bytedance.globalpayment.iap.model.AbsIapProduct, boolean):void");
    }
}
