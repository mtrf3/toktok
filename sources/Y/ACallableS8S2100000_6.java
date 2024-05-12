package Y;

import X.C38269F0f;
import X.C38270F0g;
import X.C38281F0r;
import X.C47766Ios;
import X.E9W;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.common.util.NetworkUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS8S2100000_6 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S2100000_6 aCallableS8S2100000_6) {
        JSONObject optJSONObject;
        C38269F0f c38269F0f = (C38269F0f) aCallableS8S2100000_6.l2;
        String str = aCallableS8S2100000_6.s0;
        String str2 = aCallableS8S2100000_6.s1;
        c38269F0f.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C38281F0r c38281F0r = new C38281F0r(C47766Ios.LIZ().getJSSDKConfigUrl());
                c38281F0r.LIZLLL("client_id", str2);
                c38281F0r.LIZLLL("partner_domain", str);
                String executeGet = NetworkUtils.executeGet(-1, c38281F0r.LJ());
                if (!TextUtils.isEmpty(executeGet)) {
                    JSONObject jSONObject = new JSONObject(executeGet);
                    if (C47766Ios.LIZ().isApiSuccess(jSONObject) && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                        C38270F0g c38270F0g = new C38270F0g();
                        try {
                            C38269F0f.LIZ(c38270F0g.LIZIZ, optJSONObject.optJSONArray("call"));
                            C38269F0f.LIZ(c38270F0g.LIZJ, optJSONObject.optJSONArray("info"));
                            C38269F0f.LIZ(c38270F0g.LIZLLL, optJSONObject.optJSONArray("event"));
                            return c38270F0g;
                        } catch (Exception unused) {
                            return c38270F0g;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static final Object call$1(ACallableS8S2100000_6 aCallableS8S2100000_6) {
        Keva keva = (Keva) aCallableS8S2100000_6.l2;
        String str = aCallableS8S2100000_6.s0;
        keva.storeString(E9W.LIZIZ(str), aCallableS8S2100000_6.s1);
        return null;
    }

    public static final Object call$2(ACallableS8S2100000_6 aCallableS8S2100000_6) {
        Keva keva = (Keva) aCallableS8S2100000_6.l2;
        String str = aCallableS8S2100000_6.s0;
        String str2 = aCallableS8S2100000_6.s1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current_settings_dynamic_ui__");
        LIZ.append(str);
        keva.storeString(X1D.LIZIZ(LIZ), str2);
        return null;
    }

    public ACallableS8S2100000_6(Keva keva, String str, String str2, int i) {
        this.$t = i;
        this.l2 = keva;
        this.s0 = str;
        this.s1 = str2;
    }

    public ACallableS8S2100000_6(C38269F0f c38269F0f, String str, String str2, String str3, int i) {
        this.$t = i;
        this.l2 = c38269F0f;
        this.s0 = str2;
        this.s1 = str3;
    }
}
