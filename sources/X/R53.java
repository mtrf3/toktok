package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R53 extends AbstractC66965QPx<R54> {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final String LJII;
    public final C68969R4z LJIIIIZZ;
    public QTX LJIIIZ;
    public JSONObject LJIIJ;

    @Override // X.AbstractC66965QPx
    public final void LJ(R54 r54) {
        if (!TextUtils.isEmpty(this.LJII)) {
            if (this.LJII.equals("mobile")) {
                C79146V4k.LJJJLZIJ("passport_mobile_reset_password", "mobile", "ticket", r54, this.LJ);
            } else {
                if (!this.LJII.equals("email")) {
                    return;
                }
                C79146V4k.LJJJLZIJ("passport_email_reset_password", "email", "ticket", r54, this.LJ);
            }
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIJ = jSONObject2;
        R6V.LIZ(this.LJIIIIZZ, jSONObject);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJIIJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R54 LJIIJ(boolean z, QQ4 qq4) {
        R54 r54 = new R54(z);
        if (z) {
            r54.LJIIIZ = this.LJIIIZ;
        } else {
            r54.LIZLLL = qq4.LIZIZ;
            r54.LJFF = qq4.LIZJ;
        }
        r54.LJII = this.LJIIJ;
        return r54;
    }

    public R53(Context context, QQ1 qq1, String str, AbstractC67056QTk abstractC67056QTk) {
        super(context, qq1, abstractC67056QTk);
        this.LJII = "";
        this.LJII = str;
        this.LJIIIIZZ = new C68969R4z();
    }
}
