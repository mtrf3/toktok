package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;

/* renamed from: X.UoV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78319UoV extends AbstractC78349Uoz {
    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.PreregisterCreateOrder;
    }

    public C78319UoV(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        C16880lQ.LJLLJ(C78319UoV.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            return;
        }
        orderData.execute();
        C77874UhK iapPayRequest = orderData.getIapPayRequest();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreregisterCreateOrderState: preregister create order. productId:");
        LIZ.append(orderData.getProductId());
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78294Uo6 c78294Uo6 = new C78294Uo6(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.LJII, orderData.getPayType(), orderData.getStartPayTimeStamp(), orderData);
        c78294Uo6.LIZ();
        C78342Uos.LIZLLL().LIZJ().LIZ(iapPayRequest, orderData, new C78318UoU(this, c78294Uo6));
    }
}
