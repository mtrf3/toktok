package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import java.util.List;

/* renamed from: X.Uox, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78347Uox implements InterfaceC78382UpW {
    public final /* synthetic */ OrderData LIZ;
    public final /* synthetic */ C77874UhK LIZIZ;
    public final /* synthetic */ InterfaceC78395Upj LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ IapServiceProvider LJ;

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        String str = "";
        if (absResult.getCode() != 0) {
            int code = absResult.getCode();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("query purchases success in preregisterRewardsPay, result message is: ");
            LIZ.append(absResult.getMessage());
            C78368UpI c78368UpI = new C78368UpI(203, code, X1D.LIZIZ(LIZ));
            if (this.LIZ.getIapPayRequest() != null) {
                str = this.LIZ.getIapPayRequest().LJIIJ;
            }
            c78368UpI.LIZ = str;
            c78368UpI.LIZIZ = this.LIZIZ;
            c78368UpI.LIZJ = PayType.PRE;
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PipoPayManger: query history purchase in preregisterRewards failed, error:");
            LIZ2.append(absResult.getMessage());
            X1D.LIZIZ(LIZ2);
            LJ.getClass();
            InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
            C78392Upg c78392Upg = (C78392Upg) LIZJ;
            c78392Upg.LJI(c78368UpI, this.LIZJ, this.LIZ.buildOrderInfo());
            ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI, this.LIZ.buildOrderInfo());
            return;
        }
        if (list != null) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PipoPayManger: preregisterRewards: query history purchase finished, item count: ");
            LIZ3.append(list.size());
            X1D.LIZIZ(LIZ3);
            LJ2.getClass();
            for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                    this.LJ.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                }
            }
        }
        if (this.LJ.mRewards.containsKey(this.LIZLLL)) {
            this.LIZ.setAbsIapChannelOrderData(this.LJ.mRewards.get(this.LIZLLL));
            this.LJ.acquireRewardInternal(this.LIZ, this.LIZJ);
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("doesn't has preregisterReward [");
        C78368UpI c78368UpI2 = new C78368UpI(203, 2031, JBR.LJFF(LIZ4, this.LIZLLL, "]", LIZ4));
        if (this.LIZ.getIapPayRequest() != null) {
            str = this.LIZ.getIapPayRequest().LJIIJ;
        }
        c78368UpI2.LIZ = str;
        c78368UpI2.LIZIZ = this.LIZIZ;
        c78368UpI2.LIZJ = PayType.PRE;
        C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("PipoPayManger: preregisterRewards history purchase doesn't has productId: ");
        LIZ5.append(this.LIZLLL);
        LIZ5.append("when preregisterRewardsPay.");
        X1D.LIZIZ(LIZ5);
        LJ3.getClass();
        InterfaceC78402Upq LIZJ2 = C78379UpT.LJ().LIZJ();
        C78392Upg c78392Upg2 = (C78392Upg) LIZJ2;
        c78392Upg2.LJI(c78368UpI2, this.LIZJ, this.LIZ.buildOrderInfo());
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI2, this.LIZ.buildOrderInfo());
    }

    public C78347Uox(IapServiceProvider iapServiceProvider, OrderData orderData, C77874UhK c77874UhK, InterfaceC78395Upj interfaceC78395Upj, String str) {
        this.LJ = iapServiceProvider;
        this.LIZ = orderData;
        this.LIZIZ = c77874UhK;
        this.LIZJ = interfaceC78395Upj;
        this.LIZLLL = str;
    }
}
