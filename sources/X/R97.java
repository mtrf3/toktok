package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R97 extends AbstractC66965QPx<R40<R9Y>> {
    public final R9Y LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9Y> r40) {
        C79146V4k.LJJJLZIJ("passport_account_login", null, null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJI = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R9Y> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1016, this.LJII);
    }

    public R97(Context context, QQ1 qq1, R9Y r9y, R4O r4o) {
        super(context, qq1, r4o);
        this.LJII = r9y;
    }

    public static R97 LJIIJJI(Context context, String str, String str2, String str3, String str4, R4O r4o) {
        R9Y r9y = new R9Y(0, str2, str3, str, null, str4, null);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/user/login/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("email", C38354F3m.LIZIZ(str2));
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("mobile", C38354F3m.LIZIZ(str));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("username", C38354F3m.LIZIZ(str3));
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("account", C38354F3m.LIZIZ(null));
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("token", null);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        hashMap.put("password", C38354F3m.LIZIZ(r9y.LJFF));
        hashMap.put("mix_mode", "1");
        qqn.LIZLLL(hashMap);
        return new R97(context, qqn.LJFF(), r9y, r4o);
    }
}
