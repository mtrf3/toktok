package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R8s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69066R8s extends AbstractC66965QPx<C69068R8u> {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final C69069R8v LJII;
    public boolean LJIIIIZZ;
    public QTX LJIIIZ;
    public JSONObject LJIIJ;

    @Override // X.AbstractC66965QPx
    public final void LJ(C69068R8u c69068R8u) {
        String str;
        String str2;
        if (this.LJIIIIZZ) {
            str = "passport_mobile_reset_password";
            str2 = "mobile";
        } else {
            str = "passport_email_reset_password";
            str2 = "email";
        }
        C79146V4k.LJJJLZIJ(str, str2, "force_reset_pw", c69068R8u, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject data, JSONObject jSONObject) {
        o.LJIIIZ(data, "data");
        R6V.LIZJ(this.LJII, data);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJIIIZ = R6S.LIZJ(jSONObject, data);
        this.LJIIJ = data;
    }

    @Override // X.AbstractC66965QPx
    public final C69068R8u LJIIJ(boolean z, QQ4 response) {
        int i;
        o.LJIIIZ(response, "response");
        if (this.LJIIIIZZ) {
            i = 1010;
        } else {
            i = 10002;
        }
        C69069R8v c69069R8v = this.LJII;
        JSONObject jSONObject = this.LJIIJ;
        C69068R8u c69068R8u = new C69068R8u(z, i, c69069R8v, jSONObject, jSONObject.optString("captcha"), this.LJIIIZ);
        if (!z) {
            c69068R8u.LIZLLL = response.LIZIZ;
            String str = response.LIZJ;
            if (str != null && str.length() > 0) {
                c69068R8u.LJFF = response.LIZJ;
            } else {
                c69068R8u.LJFF = this.LJIIJ.optString("description");
            }
        }
        return c69068R8u;
    }

    public C69066R8s(Context context, QQ1 qq1, C69069R8v c69069R8v, C69065R8r c69065R8r) {
        super(context, qq1, c69065R8r);
        this.LJII = c69069R8v;
        this.LJIIJ = new JSONObject();
    }
}
