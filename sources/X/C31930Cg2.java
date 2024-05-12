package X;

import android.content.Intent;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cg2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31930Cg2 extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        String optString = params.optString("iap_id", "");
        if (!C38354F3m.LJ(optString)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(C1EU.LIZIZ("https://play.google.com/store/account/subscriptions", "sku", optString).appendQueryParameter("package", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
            intent.setPackage("com.android.vending");
            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
            C16880lQ.LIZJ(context.LIZ, intent);
            return null;
        }
        return null;
    }
}
