package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUN extends AbstractC38127Exn<Object, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(Object params, C38131Exr context) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", ((IInteractService) CN1.LIZ(IInteractService.class)).co0());
        jSONObject.put("code", 1);
        return jSONObject;
    }
}
