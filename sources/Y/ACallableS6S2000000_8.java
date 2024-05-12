package Y;

import X.C10K;
import X.C16880lQ;
import X.C65717Pqj;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS6S2000000_8 implements Callable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS6S2000000_8 aCallableS6S2000000_8) {
        return GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), new JSONObject(DetailApi.LIZIZ.queryAwemeFromInbox(aCallableS6S2000000_8.s0, aCallableS6S2000000_8.s1).execute().LIZIZ).optString("data"), Aweme.class);
    }

    public static final Object call$1(ACallableS6S2000000_8 aCallableS6S2000000_8) {
        try {
            C65717Pqj.LIZ(new File(aCallableS6S2000000_8.s0), new File(aCallableS6S2000000_8.s1));
            return null;
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            C10K.LJIIIIZZ(e);
            return null;
        }
    }

    public ACallableS6S2000000_8(String str, String str2, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.s0 = str;
                this.s1 = str2;
                return;
            default:
                this.s0 = str;
                this.s1 = str2;
                return;
        }
    }
}
