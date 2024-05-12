package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9T extends AbstractC66965QPx<C69075R9b> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public C69075R9b LJII;

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // X.AbstractC66965QPx
    public final void LJ(C69075R9b c69075R9b) {
        C79146V4k.LJJJLZIJ("passport_login_device_list", null, null, c69075R9b, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C69075R9b c69075R9b = new C69075R9b(true);
        this.LJII = c69075R9b;
        c69075R9b.LJIIIZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final C69075R9b LJIIJ(boolean z, QQ4 qq4) {
        C69075R9b c69075R9b = this.LJII;
        if (c69075R9b == null) {
            c69075R9b = new C69075R9b(z);
        } else {
            c69075R9b.LIZIZ = z;
        }
        if (!z) {
            c69075R9b.LIZLLL = qq4.LIZIZ;
            c69075R9b.LJFF = qq4.LIZJ;
        }
        return c69075R9b;
    }

    public R9T(Context context, QQ1 qq1, C69048R8a c69048R8a) {
        super(context, qq1, c69048R8a);
    }
}
