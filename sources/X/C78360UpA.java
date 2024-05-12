package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.TokenInfo;

/* renamed from: X.UpA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78360UpA extends AbstractC78349Uoz {
    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.UploadToken;
    }

    public C78360UpA(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        C16880lQ.LJLLILLLL(C78360UpA.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            return;
        }
        C77874UhK iapPayRequest = orderData.getIapPayRequest();
        int LIZJ = C78274Unm.LIZJ(iapPayRequest.LJIILJJIL, orderData.getIapPaymentMethod());
        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setOrderId(orderData.getOrderId());
        tokenInfo.setProductId(orderData.getProductId());
        tokenInfo.setUserId(orderData.getUserId());
        tokenInfo.setChannelUserId(orderData.getChannelUserId());
        tokenInfo.setPaymentMethod(orderData.getIapPaymentMethod().channelName);
        tokenInfo.setSubscription(iapPayRequest.LJII);
        tokenInfo.setNewSubscription(orderData.isNewSubscription());
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
        LIZ.append("UploadTokenState : upload token , productId:");
        LIZ.append(orderData.getProductId());
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        C78298UoA c78298UoA = new C78298UoA(orderData, orderData.getPayType(), orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription());
        c78298UoA.LIZ();
        new C78362UpC(iapPayRequest.LIZIZ, orderData.getHost(), LIZJ, tokenInfo).LIZ(new C78328Uoe(this, c78298UoA));
    }
}
