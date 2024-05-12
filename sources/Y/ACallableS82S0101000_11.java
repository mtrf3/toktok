package Y;

import X.C09900aA;
import X.C16880lQ;
import X.C251809uS;
import X.C64920Pds;
import X.C67183QYh;
import X.T9H;
import com.ss.android.ugc.aweme.setting.api.BlackApiManager;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ACallableS82S0101000_11 implements Callable {
    public final int $t;
    public int i1;
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

    public static final Object call$0(ACallableS82S0101000_11 aCallableS82S0101000_11) {
        return BlackApiManager.LIZ(aCallableS82S0101000_11.i1);
    }

    public static final Object call$1(ACallableS82S0101000_11 aCallableS82S0101000_11) {
        switch (aCallableS82S0101000_11.i1) {
            case 0:
                C67183QYh c67183QYh = (C67183QYh) aCallableS82S0101000_11.l0;
                synchronized (c67183QYh) {
                    c67183QYh.LIZ.get().LJIIJ(System.currentTimeMillis(), c67183QYh.LIZJ.get().getUserAgent());
                }
                return null;
            case 1:
                Throwable th = (Throwable) aCallableS82S0101000_11.l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", C64920Pds.LIZIZ(th, null));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C09900aA.LJ("feed_error", jSONObject);
                return null;
            default:
                return C251809uS.LIZ((String) aCallableS82S0101000_11.l0, true, null);
        }
    }

    public ACallableS82S0101000_11(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public ACallableS82S0101000_11(T9H t9h, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = t9h;
        this.i1 = i;
    }
}
