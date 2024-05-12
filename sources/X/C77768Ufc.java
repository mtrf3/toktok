package X;

import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ufc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77768Ufc extends AbstractC38123Exj<IapProductBuyParam, Object> implements InterfaceC77771Uff {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 199));

    @Override // X.InterfaceC77771Uff
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJLJLL() {
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLJIL(IapProductBuyResult iapProductBuyResult) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 0);
        jSONObject2.put("data", jSONObject);
        jSONObject.put("error_code", iapProductBuyResult.errorCode);
        jSONObject.put("detail_code", iapProductBuyResult.detailCode);
        jSONObject.put("error_msg", iapProductBuyResult.errorMsg);
        finishWithRawResult(jSONObject2);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.InterfaceC77771Uff
    public final void LLLLLL(IapProductBuyResult iapProductBuyResult) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        IapProductBuyResult.Item item = iapProductBuyResult.data;
        String str3 = "";
        if (item == null || (str = item.productId) == null) {
            str = "";
        }
        jSONObject.put("product_id", str);
        IapProductBuyResult.Item item2 = iapProductBuyResult.data;
        if (item2 != null && (str2 = item2.orderId) != null) {
            str3 = str2;
        }
        jSONObject.put("order_id", str3);
        finishWithRawResult(jSONObject2);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(IapProductBuyParam iapProductBuyParam, C38131Exr context) {
        IapProductBuyParam params = iapProductBuyParam;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).fW(context.LIZ, params);
    }
}
