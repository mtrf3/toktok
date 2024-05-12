package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R99 {
    public static R9E LIZ(Context context, String str, String pwd, int i, int i2, R98 r98) {
        o.LJIIIZ(pwd, "pwd");
        R9Y r9y = new R9Y(i, "", "", "", "", pwd, "");
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/user/login/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("")) {
            hashMap.put("email", C38354F3m.LIZIZ(""));
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("mobile", C38354F3m.LIZIZ(""));
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("username", C38354F3m.LIZIZ(""));
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("account", C38354F3m.LIZIZ(""));
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("token", "");
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        if (i > 0) {
            hashMap.put(WM7.SCENE_SERVICE, C38354F3m.LIZIZ(String.valueOf(i)));
        }
        hashMap.put("password", C38354F3m.LIZIZ(r9y.LJFF));
        hashMap.put("mix_mode", "1");
        if (str != null) {
            hashMap.put("not_login_ticket", str);
        }
        hashMap.put("account_type", String.valueOf(i2));
        qqn.LIZLLL(hashMap);
        return new R9E(context, qqn.LJFF(), r9y, r98);
    }
}
