package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.List;

/* renamed from: X.Up0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78350Up0 implements InterfaceC78382UpW {
    public final /* synthetic */ IapServiceProvider LIZ;

    public C78350Up0(IapServiceProvider iapServiceProvider) {
        this.LIZ = iapServiceProvider;
    }

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoPayManger: query history purchase finished, paymentMethod is ");
        LIZ.append(iapPaymentMethod.channelName);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (absResult == null || list == null) {
            return;
        }
        if (absResult.getCode() != 0) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PipoPayManger: query history purchase failed, error: ");
            LIZ2.append(absResult.getMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            return;
        }
        if (list.isEmpty()) {
            C78273Unl.LJIIIZ().LJ().getClass();
            return;
        }
        C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PipoPayManger: query history purchase finished, item count: ");
        LIZ3.append(list.size());
        X1D.LIZIZ(LIZ3);
        LJ3.getClass();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE && PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().isEnableRestoreOrder()) {
            return;
        }
        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
            C39670Fha LJ4 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("PipoPayManger: deal with the unfinished order, paymentMethod: ");
            LIZ4.append(iapPaymentMethod.channelName);
            LIZ4.append(" purchase :");
            LIZ4.append(absIapChannelOrderData);
            LIZ4.append(", isSubscription:");
            LIZ4.append(absIapChannelOrderData.isSubscription());
            LIZ4.append(", isAcknowledged:");
            LIZ4.append(absIapChannelOrderData.isAcknowledged());
            LIZ4.append(", purchase state:");
            LIZ4.append(absIapChannelOrderData.getOrderState());
            X1D.LIZIZ(LIZ4);
            LJ4.getClass();
            if (absIapChannelOrderData.isOrderStateSuccess()) {
                String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                if ((iapPaymentMethod == IapPaymentMethod.GOOGLE && (!TextUtils.isEmpty(channelOrderId) || !TextUtils.isEmpty(developerPayload))) || iapPaymentMethod == IapPaymentMethod.AMAZON) {
                    this.LIZ.executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                }
            }
        }
    }
}
