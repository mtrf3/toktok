package Y;

import X.C27932Axk;
import X.C47117IeP;
import X.C76800UCe;
import X.EF7;
import X.QM5;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ACallableS3S1000000_4 implements Callable {
    public final int $t;
    public String s0;

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

    public static final Object call$0(ACallableS3S1000000_4 aCallableS3S1000000_4) {
        JSONObject jSONObject = new JSONObject();
        Uri parse = UriProtector.parse(aCallableS3S1000000_4.s0);
        Iterator LIZ = C47117IeP.LIZ(parse, "uri.queryParameterNames");
        while (LIZ.hasNext()) {
            String str = (String) LIZ.next();
            jSONObject.put(str, UriProtector.getQueryParameter(parse, str));
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        QM5.LIZJ(EF7.LIZIZ(), "key_music_ttm_attribution_af_info", C27932Axk.LIZ(jSONObject2));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS3S1000000_4 aCallableS3S1000000_4) {
        QM5.LIZJ(EF7.LIZIZ(), "key_music_ttm_attribution_af_info", C27932Axk.LIZ(aCallableS3S1000000_4.s0));
        return C76800UCe.LIZ;
    }

    public ACallableS3S1000000_4(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
