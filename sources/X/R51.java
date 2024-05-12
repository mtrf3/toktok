package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R51 extends AbstractC66965QPx<QQI> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R52 LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(QQI qqi) {
        C79146V4k.LJJJLZIJ("passport_oauth_unbind_click", this.LIZJ.LIZ("platform"), "auth_unbind", qqi, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final QQI LJIIJ(boolean z, QQ4 qq4) {
        QQI qqi = new QQI(z, 2);
        if (!z) {
            R52 r52 = this.LJII;
            qqi.LIZLLL = r52.LIZ;
            qqi.LJFF = r52.LIZIZ;
        }
        qqi.LJII = this.LJII.LJ;
        return qqi;
    }

    public R51(Context context, QQ1 qq1, QQE<QQI> qqe) {
        super(context, qq1, qqe);
        this.LJII = new R52();
    }
}
