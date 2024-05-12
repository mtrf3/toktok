package Y;

import X.C76800UCe;
import X.IOK;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.vesdk.VEMediaParser;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS11S0102000_6 implements Callable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object call$0(ACallableS11S0102000_6 aCallableS11S0102000_6) {
        VEMediaParser vEMediaParser = (VEMediaParser) aCallableS11S0102000_6.l0;
        int i = aCallableS11S0102000_6.i1;
        int i2 = aCallableS11S0102000_6.i2;
        return vEMediaParser.getVideoFrame(i, i2, i2, false);
    }

    public static final Object call$1(ACallableS11S0102000_6 aCallableS11S0102000_6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_cache", aCallableS11S0102000_6.i1);
            jSONObject.put("is_timeout", aCallableS11S0102000_6.i2);
            jSONObject.put("cache_num", (Integer) aCallableS11S0102000_6.l0);
            String string = IOK.LIZLLL().getString("feed_cache_source", "def");
            o.LJIIIIZZ(string, "keva.getString(KEY_CACHE…TYPE, CACHE_FROM_DEFAULT)");
            jSONObject.put("from_type", string);
            AppLogNewUtils.onEventV3("pull_out_cache_video", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public ACallableS11S0102000_6(int i, int i2, Object obj, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = obj;
    }
}
