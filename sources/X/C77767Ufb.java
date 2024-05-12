package X;

import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ufb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77767Ufb extends AbstractC38123Exj<IapProductGetParam, Object> implements InterfaceC77772Ufg {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 200));

    @Override // X.InterfaceC77772Ufg
    public final void LJII() {
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIJ() {
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIIJ(IapProductGetResult iapProductGetResult) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 0);
        jSONObject2.put("data", jSONObject);
        jSONObject.put("error_code", iapProductGetResult.errorCode);
        jSONObject.put("detail_code", iapProductGetResult.detailCode);
        jSONObject.put("error_msg", iapProductGetResult.errorMsg);
        finishWithRawResult(jSONObject2);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIILIIL(IapProductGetResult iapProductGetResult) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        for (Map.Entry<String, IapProductGetResult.Item> entry : iapProductGetResult.data.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("product_id", entry.getValue().productId);
            jSONObject3.put("sku_name", entry.getValue().skuName);
            jSONObject3.put("currency", entry.getValue().currency);
            jSONObject3.put("price", entry.getValue().price);
            jSONObject3.put("price_amount_micros", entry.getValue().priceAmountMicros);
            jSONObject.put(entry.getValue().productId, jSONObject3);
        }
        finishWithRawResult(jSONObject2);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).onDestroy();
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(IapProductGetParam iapProductGetParam, C38131Exr context) {
        IapProductGetParam params = iapProductGetParam;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        ((A8I) value).PD(context.LIZ, params);
    }
}
