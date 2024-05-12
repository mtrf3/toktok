package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uoy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78348Uoy implements InterfaceC78382UpW {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC78395Upj LIZIZ;
    public final /* synthetic */ AbstractC78343Uot LIZJ;

    public C78348Uoy(AbstractC78343Uot abstractC78343Uot, boolean z, InterfaceC78395Upj interfaceC78395Upj) {
        this.LIZJ = abstractC78343Uot;
        this.LIZ = z;
        this.LIZIZ = interfaceC78395Upj;
    }

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        C78368UpI c78368UpI;
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            ArrayList arrayList = new ArrayList();
            if (absResult.getCode() != 0) {
                c78368UpI = new C78368UpI(301, absResult.getCode(), absResult.getMessage());
            } else {
                c78368UpI = new C78368UpI(0, 0, "query purchases in queryPreregisterRewards success.");
                if (list != null) {
                    C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("query history purchase finished, item count: ");
                    LIZ.append(list.size());
                    X1D.LIZIZ(LIZ);
                    LJ.getClass();
                    for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                        String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                        String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                        if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                            this.LIZJ.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                            arrayList.add(absIapChannelOrderData.getProductId());
                        }
                    }
                    C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("query preregisterRewards finished, productIds: ");
                    LIZ2.append(arrayList);
                    X1D.LIZIZ(LIZ2);
                    LJ2.getClass();
                    if (arrayList.size() > 0) {
                        PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(arrayList, false, new C78367UpH(this));
                        return;
                    }
                }
            }
            InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
            boolean z = this.LIZ;
            C78392Upg c78392Upg = (C78392Upg) LIZJ;
            c78392Upg.LJIIIZ(c78368UpI, this.LIZIZ, new ArrayList(), z);
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILJJIL(c78368UpI, this.LIZ, new ArrayList());
        }
    }
}
