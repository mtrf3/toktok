package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R76 extends AbstractC66965QPx<R40<R7E>> {
    public final R7E LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7E> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_sendcode", "mobile", this.LIZJ.LIZ("type"), r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        R7E r7e = this.LJII;
        jSONObject2.optInt("retry_time", 30);
        r7e.getClass();
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7E> LJIIJ(boolean z, QQ4 qq4) {
        if (z) {
            R7E r7e = this.LJII;
            r7e.LIZ = 0;
            r7e.LIZJ = "";
            r7e.LIZIZ = 0;
        }
        return new R40<>(z, 1002, this.LJII);
    }

    public R76(Context context, QQ1 qq1, R7E r7e, R4N r4n) {
        super(context, qq1, r4n);
        this.LJII = r7e;
    }

    public static R76 LJIIJJI(Context context, String str, int i, String str2, int i2, int i3, String str3, String str4, java.util.Map map, R4N r4n) {
        R7E r7e = new R7E(i, i2, i3, str, str2, str3, str4, map);
        QQN qqn = new QQN();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("mobile", C38354F3m.LIZIZ(str));
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("old_mobile", C38354F3m.LIZIZ(""));
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("captcha", null);
        }
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(i)));
        hashMap.put("unbind_exist", C38354F3m.LIZIZ(String.valueOf(0)));
        hashMap.put("mix_mode", "1");
        int i4 = r7e.LJIIIZ;
        if (i4 == 1) {
            hashMap.put("check_register", "1");
        } else if (i4 == 0) {
            hashMap.put("check_register", CardStruct.IStatusCode.DEFAULT);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("ticket", str2);
        }
        hashMap.put("auto_read", String.valueOf(i3));
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("shark_ticket", str3);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("auth_token", null);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("unusable_mobile_ticket", str4);
        }
        qqn.LJ(hashMap, map);
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/send_code/v1/");
        return new R76(context, qqn.LJFF(), r7e, r4n);
    }
}
