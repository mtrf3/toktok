package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;

/* renamed from: X.UoW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78320UoW extends AbstractC78349Uoz {
    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.CreateOrder;
    }

    public C78320UoW(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        C16880lQ.LJLLILLLL(C78320UoW.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            orderData.isCanceled();
            orderData.isConsumed();
            orderData.getProductId();
            C78273Unl.LJIIIZ().LJ().getClass();
            return;
        }
        orderData.execute();
        C77874UhK iapPayRequest = orderData.getIapPayRequest();
        C78294Uo6 c78294Uo6 = new C78294Uo6(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.LJII, orderData.getPayType(), orderData.getStartPayTimeStamp(), this.LIZ);
        c78294Uo6.LIZ();
        C78342Uos.LIZLLL().LIZJ().LIZ(iapPayRequest, orderData, new C78317UoT(this, c78294Uo6));
    }
}
