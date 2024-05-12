package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.facebook.FacebookAuth;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q7w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66496Q7w implements Q52 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Q8C LIZIZ;
    public final /* synthetic */ Bundle LIZJ;
    public final /* synthetic */ FacebookAuth LIZLLL;

    public final void LIZ(C67821QjZ c67821QjZ) {
        String str = "";
        try {
            String str2 = ((C66381Q3l) c67821QjZ.LJLIL).LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            str = new JSONObject(str2).optString("token_for_business");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        Q8M q8m = new Q8M("facebook", 1);
        q8m.LJ = this.LIZ;
        q8m.LJII = this.LIZIZ.LIZ.LIZ.expires.getTime();
        q8m.LIZLLL = this.LIZIZ.LIZ.LIZ.userId;
        q8m.LJIIJ = this.LIZJ;
        if (TextUtils.isEmpty(str)) {
            q8m.LIZ = false;
        } else {
            q8m.LIZ = true;
            q8m.LJI = str;
            q8m.LIZ();
        }
        this.LIZLLL.LJLJJLL.hv0(new AuthResult(q8m));
    }

    public C66496Q7w(FacebookAuth facebookAuth, String str, Q8C q8c, Bundle bundle) {
        this.LIZLLL = facebookAuth;
        this.LIZ = str;
        this.LIZIZ = q8c;
        this.LIZJ = bundle;
    }
}
