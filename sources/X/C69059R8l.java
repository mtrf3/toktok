package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R8l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69059R8l extends AbstractC66965QPx<R40<C69061R8n>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69061R8n LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69061R8n> r40) {
        C79146V4k.LJJJLZIJ("passport_account_verify", "mobile", null, r40, this.LJ);
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
        C69061R8n c69061R8n = this.LJII;
        c69061R8n.LJ = jSONObject;
        String optString = data.optString("ticket");
        o.LJIIIIZZ(optString, "data.optString(\"ticket\")");
        c69061R8n.LJI = optString;
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69061R8n> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 10031, this.LJII);
    }

    public C69059R8l(Context context, QQ1 qq1, C69061R8n c69061R8n, C69058R8k c69058R8k) {
        super(context, qq1, c69058R8k);
        this.LJII = c69061R8n;
    }
}
