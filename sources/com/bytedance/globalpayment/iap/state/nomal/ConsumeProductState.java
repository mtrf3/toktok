package com.bytedance.globalpayment.iap.state.nomal;

import X.AbstractC78349Uoz;
import X.C16880lQ;
import X.C39670Fha;
import X.C73994T2g;
import X.C78261UnZ;
import X.C78273Unl;
import X.C78296Uo8;
import X.C78342Uos;
import X.C78344Uou;
import X.C78368UpI;
import X.EnumC78373UpN;
import X.InterfaceC78388Upc;
import X.X1D;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;

/* loaded from: classes14.dex */
public final class ConsumeProductState extends AbstractC78349Uoz {
    public final String LIZLLL;

    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.Consume;
    }

    /* loaded from: classes14.dex */
    public class ChannelPayConsumeFinishedListener implements ConsumeIapProductListener {
        public C78296Uo8 mConsumeProductMonitor;

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(AbsResult absResult) {
            int code = absResult.getCode();
            if (code == 0) {
                this.mConsumeProductMonitor.LIZIZ(true, null);
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, ConsumeProductState.this.LIZ.getOrderId());
                ConsumeProductState.this.LIZ.setConsumed(true);
                if (ConsumeProductState.this.LIZ.isSuccess() && !ConsumeProductState.this.LIZ.isFinished()) {
                    ConsumeProductState.this.LIZIZ(new C78368UpI(0, 0, "pay success in ChannelPayConsumeFinishedListener"));
                    return;
                }
                return;
            }
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConsumeProductState: google consume product fail,");
            LIZ.append(absResult);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("google consume product fail in ChannelPayConsumeFinishedListener: ");
            LIZ2.append(absResult.getMessage());
            C78368UpI c78368UpI = new C78368UpI(207, code, X1D.LIZIZ(LIZ2));
            this.mConsumeProductMonitor.LIZIZ(false, c78368UpI);
            ConsumeProductState.this.LIZIZ(c78368UpI);
        }

        public ChannelPayConsumeFinishedListener(C78296Uo8 c78296Uo8) {
            this.mConsumeProductMonitor = c78296Uo8;
        }
    }

    public ConsumeProductState(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        this.LIZLLL = C16880lQ.LJLLILLLL(ConsumeProductState.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        AbsIapChannelOrderData absIapChannelOrderData;
        this.LIZ = orderData;
        if (!orderData.isCanceled()) {
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            if ((!C73994T2g.LJIL() && orderData.isFinished()) || (absIapChannelOrderData = orderData.getAbsIapChannelOrderData()) == null) {
                return;
            }
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConsumeProductState : consume purchase product. productId:");
            LIZ.append(orderData.getProductId());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            C78296Uo8 c78296Uo8 = new C78296Uo8(this.LIZ, orderData.getPayType(), orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LJII);
            c78296Uo8.LIZ();
            C78342Uos.LIZLLL().LIZ();
            C78344Uou.LIZ(orderData.getIapPaymentMethod(), orderData.getIapPayRequest().LJII, absIapChannelOrderData.getChannelToken(), new ChannelPayConsumeFinishedListener(c78296Uo8));
        }
    }
}
