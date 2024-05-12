package X;

import android.os.Bundle;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q54 implements InterfaceC66375Q3f {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ GetTokenLoginMethodHandler LIZIZ;
    public final /* synthetic */ LoginClient.Request LIZJ;

    @Override // X.InterfaceC66375Q3f
    public final void LIZIZ(JSONObject jSONObject) {
        String string;
        try {
            Bundle bundle = this.LIZ;
            if (jSONObject == null) {
                string = null;
            } else {
                string = jSONObject.getString("id");
            }
            bundle.putString("com.facebook.platform.extra.USER_ID", string);
            this.LIZIZ.LJIILJJIL(this.LIZ, this.LIZJ);
        } catch (JSONException e) {
            this.LIZIZ.LJ().LJ(C66416Q4u.LIZLLL(LoginClient.Result.Companion, this.LIZIZ.LJ().pendingRequest, "Caught exception", e.getMessage()));
            UPG.LJLLLL = false;
            C221018lt.LIZ("yjy", "loging reset!");
        }
    }

    @Override // X.InterfaceC66375Q3f
    public final void LIZJ(Q4W q4w) {
        String message;
        LoginClient LJ = this.LIZIZ.LJ();
        C66416Q4u c66416Q4u = LoginClient.Result.Companion;
        LoginClient.Request request = this.LIZIZ.LJ().pendingRequest;
        if (q4w == null) {
            message = null;
        } else {
            message = q4w.getMessage();
        }
        LJ.LJ(C66416Q4u.LIZLLL(c66416Q4u, request, "Caught exception", message));
        UPG.LJLLLL = false;
        C221018lt.LIZ("yjy", "loging reset!");
    }

    public Q54(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.LIZ = bundle;
        this.LIZIZ = getTokenLoginMethodHandler;
        this.LIZJ = request;
    }
}
