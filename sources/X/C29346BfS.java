package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BfS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29346BfS extends AbstractC38123Exj<JSONObject, JSONObject> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject params, C38131Exr callContext) {
        InterfaceC05190Ih currentUser;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callContext, "callContext");
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (currentUser = LIZIZ.getCurrentUser()) == null || currentUser.getFollowInfo() == null) {
            finishWithFailure();
            return;
        }
        long pushStatus = currentUser.getFollowInfo().getPushStatus();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notification_status", pushStatus);
        finishWithResult(jSONObject);
    }
}
