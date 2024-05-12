package X;

import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONObject;

/* renamed from: X.Uoh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78331Uoh extends AbsIapChannelOrderData {
    public final PurchaseResponse LIZ;
    public final Receipt LIZIZ;
    public final int LIZJ;
    public final UserData LIZLLL;
    public final String LJ;

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getDeveloperPayload() {
        return null;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getOriginalJson() {
        return null;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSignature() {
        return null;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderFromOtherSystem() {
        return false;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelToken() {
        return this.LIZIZ.getReceiptId();
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelUserId() {
        UserData userData = this.LIZLLL;
        if (userData == null) {
            return "";
        }
        return userData.getUserId();
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final int getOrderState() {
        int i = this.LIZJ;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSelfToken() {
        return this.LIZIZ.toJSON().toString();
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderStateSuccess() {
        Receipt receipt;
        if (this.LIZJ == 0 && (receipt = this.LIZIZ) != null && !receipt.isCanceled()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getHost() {
        return this.LJ;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final IapPaymentMethod getPaymentMethod() {
        return IapPaymentMethod.AMAZON;
    }

    public C78331Uoh(PurchaseResponse purchaseResponse) {
        this.LIZ = purchaseResponse;
        this.LIZJ = purchaseResponse.getRequestStatus().ordinal();
        this.LIZIZ = purchaseResponse.getReceipt();
        this.LIZLLL = purchaseResponse.getUserData();
    }

    public C78331Uoh(Receipt receipt, UserData userData) {
        this.LIZIZ = receipt;
        this.mProductId = receipt.getSku();
        this.LIZLLL = userData;
        String sku = receipt.getSku();
        C78273Unl.LJIIIZ().LJIIIIZZ();
        try {
            OrderData orderData = new OrderData(new JSONObject(C78301UoD.LIZIZ().LJJII()).optJSONObject(sku));
            this.mSelfOrderId = orderData.getOrderId();
            this.mMerchantUserId = orderData.getUserId();
            C77874UhK iapPayRequest = orderData.getIapPayRequest();
            if (iapPayRequest != null) {
                this.mMerchantId = iapPayRequest.LIZIZ;
                this.LJ = orderData.getHost();
                this.mExtraPayload = iapPayRequest.LJIIJ;
            }
        } catch (Throwable unused) {
        }
    }
}
