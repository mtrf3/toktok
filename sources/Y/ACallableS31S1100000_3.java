package Y;

import X.C188727au;
import X.C76800UCe;
import X.FMX;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACallableS31S1100000_3 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS31S1100000_3 aCallableS31S1100000_3) {
        String eventName = aCallableS31S1100000_3.s0;
        JSONObject jsonObject = (JSONObject) aCallableS31S1100000_3.l1;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(jsonObject, "jsonObject");
        FMX.LJIILJJIL(eventName, jsonObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS31S1100000_3 aCallableS31S1100000_3) {
        String eventName = aCallableS31S1100000_3.s0;
        JSONObject jsonObject = (JSONObject) aCallableS31S1100000_3.l1;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(jsonObject, "jsonObject");
        FMX.LJIILJJIL(eventName, jsonObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS31S1100000_3 aCallableS31S1100000_3) {
        String eventName = aCallableS31S1100000_3.s0;
        JSONObject jsonObject = (JSONObject) aCallableS31S1100000_3.l1;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(jsonObject, "jsonObject");
        FMX.LJIILJJIL(eventName, jsonObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS31S1100000_3 aCallableS31S1100000_3) {
        String eventName = aCallableS31S1100000_3.s0;
        JSONObject jsonObject = (JSONObject) aCallableS31S1100000_3.l1;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(jsonObject, "jsonObject");
        FMX.LJIILJJIL(eventName, jsonObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS31S1100000_3 aCallableS31S1100000_3) {
        String str;
        Bundle bundle;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((NowInviteSharePackage) aCallableS31S1100000_3.l1).nowInviteShareParams.LJLIL);
        c188727au.LJIIIZ("position", ((NowInviteSharePackage) aCallableS31S1100000_3.l1).nowInviteShareParams.LJLJJI);
        c188727au.LJIIIZ("platform", aCallableS31S1100000_3.s0);
        c188727au.LJIIIZ("card_type", "black");
        NowInviteSharePackage nowInviteSharePackage = (NowInviteSharePackage) aCallableS31S1100000_3.l1;
        if (nowInviteSharePackage != null && (bundle = nowInviteSharePackage.extras) != null) {
            str = bundle.getString("share_form");
        } else {
            str = null;
        }
        c188727au.LJIIIZ("share_form", str);
        FMX.LJIIL("now_invite", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS31S1100000_3(JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = "add_video_at";
        this.l1 = jSONObject;
    }

    public ACallableS31S1100000_3(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
