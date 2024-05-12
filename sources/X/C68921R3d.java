package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.R3d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68921R3d extends AbstractC66965QPx<C68922R3e> {
    public static final /* synthetic */ int LJIIJ = 0;
    public JSONObject LJII;
    public JSONObject LJIIIIZZ;
    public QTX LJIIIZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(C68922R3e c68922R3e) {
        C79146V4k.LJJJLZIJ("passport_sdk_common_request", null, null, c68922R3e, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = jSONObject2;
        this.LJIIIIZZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = jSONObject;
        this.LJIIIIZZ = jSONObject2;
        if (!TextUtils.isEmpty(jSONObject2.optString("user_id"))) {
            QTX qtx = new QTX(jSONObject);
            qtx.LIZ();
            this.LJIIIZ = qtx;
        }
    }

    @Override // X.AbstractC66965QPx
    public final C68922R3e LJIIJ(boolean z, QQ4 qq4) {
        C68922R3e c68922R3e = new C68922R3e(z);
        if (!z) {
            c68922R3e.LIZLLL = qq4.LIZIZ;
            c68922R3e.LJFF = qq4.LIZJ;
        } else {
            c68922R3e.LJIIIZ = this.LJIIIZ;
        }
        c68922R3e.LJII = this.LJII;
        c68922R3e.LJIILJJIL = this.LJIIIIZZ;
        if (z) {
            qq4.LIZ.getClass();
        }
        return c68922R3e;
    }

    public C68921R3d(Context context, QQ1 qq1, QQE<C68922R3e> qqe) {
        super(context, qq1, qqe);
    }
}
