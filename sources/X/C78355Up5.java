package X;

import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import java.util.List;

/* renamed from: X.Up5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78355Up5 implements InterfaceC78385UpZ<AbsIapProduct> {
    public final /* synthetic */ AbsIapChannelOrderData LIZ;
    public final /* synthetic */ IapPaymentMethod LIZIZ;
    public final /* synthetic */ List LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ IapServiceProvider LJ;

    @Override // X.InterfaceC78385UpZ
    public final void LIZ(AbsResult absResult, List<AbsIapProduct> list) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoPayManger: query the sku details(");
        LIZ.append(this.LIZ.getChannelOrderId());
        LIZ.append(")from ");
        LIZ.append(this.LIZIZ.channelName);
        LIZ.append(" service finished ,result is : ");
        LIZ.append(absResult);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (absResult.getCode() != 0) {
            IapServiceProvider iapServiceProvider = this.LJ;
            IapPaymentMethod iapPaymentMethod = this.LIZIZ;
            AbsIapChannelOrderData absIapChannelOrderData = this.LIZ;
            iapServiceProvider.restoreOrderByUploadToken(iapPaymentMethod, absIapChannelOrderData, null, absIapChannelOrderData.isSubscription());
            C78277Unp.LIZIZ(true, this.LIZJ, this.LIZIZ, absResult, list);
            return;
        }
        for (AbsIapProduct absIapProduct : list) {
            if (absIapProduct.getProductId().equals(this.LIZLLL)) {
                IapServiceProvider iapServiceProvider2 = this.LJ;
                IapPaymentMethod iapPaymentMethod2 = this.LIZIZ;
                AbsIapChannelOrderData absIapChannelOrderData2 = this.LIZ;
                iapServiceProvider2.restoreOrderByUploadToken(iapPaymentMethod2, absIapChannelOrderData2, absIapProduct, absIapChannelOrderData2.isSubscription());
            }
        }
        C78277Unp.LIZIZ(false, this.LIZJ, this.LIZIZ, absResult, list);
    }

    public C78355Up5(IapServiceProvider iapServiceProvider, AbsIapChannelOrderData absIapChannelOrderData, IapPaymentMethod iapPaymentMethod, List list, String str) {
        this.LJ = iapServiceProvider;
        this.LIZ = absIapChannelOrderData;
        this.LIZIZ = iapPaymentMethod;
        this.LIZJ = list;
        this.LIZLLL = str;
    }
}
