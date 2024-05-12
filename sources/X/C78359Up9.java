package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.TokenInfo;

/* renamed from: X.Up9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78359Up9 extends AbstractC78349Uoz {
    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.ExtraUploadToken;
    }

    public C78359Up9(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        C16880lQ.LJLLJ(C78359Up9.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            return;
        }
        orderData.execute();
        C77874UhK iapPayRequest = orderData.getIapPayRequest();
        int LIZJ = C78274Unm.LIZJ(iapPayRequest.LJIILJJIL, orderData.getIapPaymentMethod());
        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setOrderId(orderData.getOrderId());
        tokenInfo.setProductId(orderData.getProductId());
        tokenInfo.setUserId(orderData.getUserId());
        tokenInfo.setSubscription(iapPayRequest.LJII);
        tokenInfo.setNewSubscription(orderData.isNewSubscription());
        tokenInfo.setChannelUserId(orderData.getChannelUserId());
        tokenInfo.setPaymentMethod(orderData.getIapPaymentMethod().channelName);
        tokenInfo.setOrderFromOtherSystem(orderData.isOrderFromOtherSystem());
        tokenInfo.setOrderPlatform(LIZJ);
        AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
        if (absIapChannelOrderData != null) {
            tokenInfo.setToken(absIapChannelOrderData.getSelfToken());
            tokenInfo.setChannelOrderId(absIapChannelOrderData.getChannelOrderId());
        }
        AbsIapProduct absIapProduct = orderData.getAbsIapProduct();
        if (absIapProduct != null) {
            tokenInfo.setAmountValue(String.valueOf(absIapProduct.getPriceAmountMicros() / 1000000.0d));
            tokenInfo.setCurrency(absIapProduct.getPriceCurrencyCode());
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraUploadTokenState : extra upload token. productId:");
        LIZ.append(orderData.getProductId());
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78298UoA c78298UoA = new C78298UoA(orderData, orderData.getPayType(), orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription());
        c78298UoA.LIZ();
        new C78362UpC(iapPayRequest.LIZIZ, orderData.getHost(), LIZJ, tokenInfo).LIZ(new C78325Uob(this, c78298UoA));
    }
}
