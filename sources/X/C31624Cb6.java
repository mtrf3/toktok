package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Cb6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31624Cb6 extends AbstractC31629CbB {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC31625Cb7 interfaceC31625Cb7 = (InterfaceC31625Cb7) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            JSONObject jSONObject = new JSONObject(interfaceC31625Cb7.getInAppRequest());
            if (jSONObject.has("client_request_body")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("client_request_body"));
                JSONObject orderDetail = jSONObject2.optJSONObject("order_details");
                C20060qY c20060qY = new C20060qY();
                String optString = jSONObject2.optString("merchant_id");
                o.LJIIIIZZ(optString, "clientRequestBody.optString(\"merchant_id\")");
                c20060qY.LIZ = optString;
                c20060qY.LIZIZ = jSONObject2.optBoolean("has_order");
                o.LJIIIIZZ(orderDetail, "orderDetail");
                String optString2 = orderDetail.optString("ProductID");
                o.LJIIIIZZ(optString2, "orderDetail.optString(\"ProductID\")");
                String optString3 = orderDetail.optString("ProductType");
                o.LJIIIIZZ(optString3, "orderDetail.optString(\"ProductType\")");
                String optString4 = orderDetail.optString("OfferIDToken");
                o.LJIIIIZZ(optString4, "orderDetail.optString(\"OfferIDToken\")");
                c20060qY.LIZJ = new C20050qX(optString2, optString3, optString4, 24);
                orderDetail.put("UserId", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                orderDetail.put("SubscriptionMode", "1");
                String optString5 = orderDetail.optString("BasePath");
                optString5.toString();
                if (ujb.o.LJJJJ(optString5, "/", false)) {
                    optString5 = s.LJJZZIII("/", optString5);
                }
                C20030qV c20030qV = new C20030qV();
                o.LJIIIIZZ(orderDetail.optString("OrderId"), "orderDetail.optString(\"OrderId\")");
                c20030qV.LIZIZ = optString5;
                String jSONObject3 = orderDetail.toString();
                o.LJIIIIZZ(jSONObject3, "orderDetail.toString()");
                c20030qV.LIZ = jSONObject3;
                c20060qY.LIZLLL = c20030qV;
                ((IapService) CN1.LIZ(IapService.class)).I20(interfaceC38263Ezz.LIZLLL(), c20060qY, new C31628CbA(this, c37356ElM));
                return;
            }
            C31626Cb8.LIZ(c37356ElM, 0, "Invalid Client request body", 4);
        }
    }
}
