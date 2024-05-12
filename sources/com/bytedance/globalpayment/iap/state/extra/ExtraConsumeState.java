package com.bytedance.globalpayment.iap.state.extra;

import X.AbstractC78349Uoz;
import X.C16880lQ;
import X.C39670Fha;
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
public final class ExtraConsumeState extends AbstractC78349Uoz {
    public final String LIZLLL;

    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.ExtraConsume;
    }

    /* loaded from: classes14.dex */
    public class ExtraConsumeFinishedListener implements ConsumeIapProductListener {
        public C78296Uo8 mConsumeProductMonitor;

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(AbsResult absResult) {
            int code = absResult.getCode();
            if (code == 0) {
                C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ExtraConsumeState: extra channel consume product success: ");
                LIZ.append(ExtraConsumeState.this.LIZ.getOrderId());
                X1D.LIZIZ(LIZ);
                LJ.getClass();
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, ExtraConsumeState.this.LIZ.getOrderId());
                ExtraConsumeState.this.LIZ.setConsumed(true);
                this.mConsumeProductMonitor.LIZIZ(true, null);
                if (ExtraConsumeState.this.LIZ.isSuccess() && !ExtraConsumeState.this.LIZ.isFinished()) {
                    ExtraConsumeState.this.LIZIZ(new C78368UpI(0, 0, "extra pay success in ExtraConsumeFinishedListener."));
                    return;
                }
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ExtraConsumeState: extra channel consume product fail, ");
            LIZ2.append(absResult.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI = new C78368UpI(207, code, LIZIZ);
            this.mConsumeProductMonitor.LIZIZ(false, c78368UpI);
            ExtraConsumeState.this.LIZIZ(c78368UpI);
        }

        public ExtraConsumeFinishedListener(C78296Uo8 c78296Uo8) {
            this.mConsumeProductMonitor = c78296Uo8;
        }
    }

    public ExtraConsumeState(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        this.LIZLLL = C16880lQ.LJLLJ(ExtraConsumeState.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        AbsIapChannelOrderData absIapChannelOrderData;
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished() || (absIapChannelOrderData = orderData.getAbsIapChannelOrderData()) == null) {
            return;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraConsumeState : extra consume purchase product. productId:");
        LIZ.append(orderData.getProductId());
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78296Uo8 c78296Uo8 = new C78296Uo8(this.LIZ, orderData.getPayType(), orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LJII);
        c78296Uo8.LIZ();
        C78342Uos.LIZLLL().LIZ();
        C78344Uou.LIZ(orderData.getIapPaymentMethod(), orderData.getIapPayRequest().LJII, absIapChannelOrderData.getChannelToken(), new ExtraConsumeFinishedListener(c78296Uo8));
    }
}
