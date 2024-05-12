package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QQM extends AbstractC66965QPx<QQK> {
    public QQK LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(QQK qqk) {
        C79146V4k.LJJJLZIJ("passport_token_beat_v2", null, null, qqk, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        QQK qqk = new QQK(false);
        this.LJII = qqk;
        qqk.LJII = jSONObject2;
        qqk.LJIIIZ = jSONObject.optString("error_name");
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        QQK qqk = new QQK(true);
        this.LJII = qqk;
        qqk.LJII = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final QQK LJIIJ(boolean z, QQ4 qq4) {
        QQK qqk = this.LJII;
        if (qqk == null) {
            qqk = new QQK(z);
        } else {
            qqk.LIZIZ = z;
        }
        if (!z) {
            qqk.LIZLLL = qq4.LIZIZ;
            qqk.LJFF = qq4.LIZJ;
        }
        return qqk;
    }

    public QQM(Context context, QQ1 qq1, AbstractC67056QTk abstractC67056QTk) {
        super(context, qq1, abstractC67056QTk);
    }

    public static QQM LJIIJJI(Context context, String str, AbstractC67056QTk abstractC67056QTk) {
        QQN qqn = new QQN();
        qqn.LIZ = str;
        return new QQM(context, qqn.LIZIZ(), abstractC67056QTk);
    }
}
