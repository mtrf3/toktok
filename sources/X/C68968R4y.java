package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.R4y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68968R4y extends AbstractC66965QPx<QQJ> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LJII;
    public final C68969R4z LJIIIIZZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(QQJ qqj) {
        C79146V4k.LJJJLZIJ("passport_logout", null, null, qqj, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZ(this.LJIIIIZZ, jSONObject);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ.LIZLLL = jSONObject.optString("session_key");
    }

    @Override // X.AbstractC66965QPx
    public final QQJ LJIIJ(boolean z, QQ4 qq4) {
        QQJ qqj = new QQJ(z);
        if (!z) {
            C68969R4z c68969R4z = this.LJIIIIZZ;
            qqj.LIZLLL = c68969R4z.LIZ;
            qqj.LJFF = c68969R4z.LIZIZ;
        }
        qqj.LJIIIZ = this.LJII;
        return qqj;
    }

    public C68968R4y(Context context, QQ1 qq1, String str, R4E r4e) {
        super(context, qq1, r4e);
        this.LJIIIIZZ = new C68969R4z();
        this.LJII = str;
    }
}
