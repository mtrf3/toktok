package X;

import com.bytedance.android.livesdkapi.host.IHostHybrid;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BeD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29269BeD extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        String optString = params.optString("schema");
        IHostHybrid iHostHybrid = (IHostHybrid) CN1.LIZ(IHostHybrid.class);
        if (iHostHybrid != null) {
            iHostHybrid.prefetchSchema(optString, context.LIZ);
        }
        return new JSONObject();
    }
}
