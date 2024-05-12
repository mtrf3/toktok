package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.R7j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69031R7j extends AbstractC66965QPx<C69032R7k> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public String LJII;
    public JSONObject LJIIIIZZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(C69032R7k c69032R7k) {
        C79146V4k.LJJJLZIJ("passport_email_verify", null, null, c69032R7k, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject;
        this.LJII = jSONObject2.optString("ticket");
    }

    @Override // X.AbstractC66965QPx
    public final C69032R7k LJIIJ(boolean z, QQ4 qq4) {
        C69032R7k c69032R7k = new C69032R7k(z);
        if (z) {
            c69032R7k.LJIIIZ = this.LJII;
        } else {
            c69032R7k.LIZLLL = qq4.LIZIZ;
            c69032R7k.LJFF = qq4.LIZJ;
        }
        c69032R7k.LJII = this.LJIIIIZZ;
        return c69032R7k;
    }

    public C69031R7j(Context context, QQ1 qq1, R8I r8i) {
        super(context, qq1, r8i);
    }
}
