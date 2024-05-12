package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7I extends AbstractC66965QPx<R40<R7Y>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7Y LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7Y> r40) {
        C79146V4k.LJJJLZIJ("passport_email_send_code", "email", this.LIZJ.LIZ("type"), r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7Y> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1024, this.LJII);
    }

    public R7I(Context context, QQ1 qq1, R7Y r7y, R81 r81) {
        super(context, qq1, r81);
        this.LJII = r7y;
    }

    public static R7I LJIIJJI(Context context, String str, String str2, int i, java.util.Map map, R81 r81) {
        R7Y r7y = new R7Y(str, str2, i, map);
        QQN qqn = new QQN();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(r7y.LJFF)) {
            hashMap.put("email", C38354F3m.LIZIZ(r7y.LJFF));
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("captcha", null);
        }
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(r7y.LJI)));
        if (!TextUtils.isEmpty(r7y.LJIIIIZZ)) {
            hashMap.put("password", C38354F3m.LIZIZ(r7y.LJIIIIZZ));
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("next", null);
        }
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, r7y.LJII);
        qqn.LIZ = C1GE.LJII(C77412UZs.LJIJJLI("/passport/email/send_code/"), null);
        return new R7I(context, qqn.LJFF(), r7y, r81);
    }
}
