package X;

import android.app.Activity;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Uou, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78344Uou implements InterfaceC78401Upp {
    public C78344Uou() {
        C16880lQ.LJLLJ(C78344Uou.class);
    }

    public static final AbstractC78349Uoz LIZIZ(IapPaymentMethod iapPaymentMethod, Object... objArr) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().getGoogleState((InterfaceC78388Upc) objArr[0], (Activity) objArr[1]);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().getAmazonState((InterfaceC78388Upc) objArr[0], (Activity) objArr[1]);
        }
        return null;
    }

    public static final void LIZLLL(IapPaymentMethod iapPaymentMethod, InterfaceC78382UpW interfaceC78382UpW) {
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("queryUnAckEdOrderFromChannel for ");
        LIZ.append(iapPaymentMethod.channelName);
        LIZ.append(" channel");
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(interfaceC78382UpW);
            return;
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryUnAckEdOrderFromChannel(interfaceC78382UpW);
            return;
        }
        AbsResult absResult = new AbsResult();
        absResult.withErrorCode(1);
        absResult.withMessage("invalid payment_method");
        interfaceC78382UpW.onQueryFinished(iapPaymentMethod, absResult, null);
    }

    public static final void LIZ(IapPaymentMethod iapPaymentMethod, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().consumeProduct(z, str, consumeIapProductListener);
        } else {
            if (iapPaymentMethod != IapPaymentMethod.AMAZON) {
                return;
            }
            PaymentServiceManager.get().getAmazonIapExternalService().consumeProduct(str, consumeIapProductListener);
        }
    }

    public static final void LIZJ(IapPaymentMethod iapPaymentMethod, List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, z, interfaceC78385UpZ);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryProductDetails(list, z, interfaceC78385UpZ);
        }
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIILLIIL("iap_exp_1_optimize_restore", 0) == 1) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("paymentMethod", iapPaymentMethod.channelName);
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("isSubscription", z);
        } catch (Throwable unused2) {
        }
        JSONObject jSONObject2 = new JSONObject();
        if (list != null) {
            try {
                jSONObject2.put("productIds", list.toString());
            } catch (Throwable unused3) {
            }
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.MONITOR;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_request_product_result", jSONObject, null, jSONObject2);
    }
}
