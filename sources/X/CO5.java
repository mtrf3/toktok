package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CO5 extends AbstractC38127Exn<JSONObject, JSONObject> {
    public int LJLIL = 1;

    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        this.LJLIL = params.optInt("setViewClosable", 1);
        return null;
    }
}
