package Y;

import X.AbstractC36700Eam;
import X.C09900aA;
import X.C141335gf;
import X.C3C5;
import X.C76800UCe;
import X.FDP;
import X.FDQ;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.m;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS23S0210000_6 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object call$0(ACallableS23S0210000_6 aCallableS23S0210000_6) {
        Object LIZ;
        FDP fdp = (FDP) aCallableS23S0210000_6.l0;
        boolean z = aCallableS23S0210000_6.z2;
        FDQ fdq = (FDQ) aCallableS23S0210000_6.l1;
        try {
            Uri uri = fdp.LIZ;
            LIZ = null;
            if (uri != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scheme", uri.getScheme());
                jSONObject.put("host", uri.getHost());
                jSONObject.put("uri", uri);
                if (TextUtils.isEmpty(uri.getPath())) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(uri.getScheme());
                    LIZ2.append("://");
                    LIZ2.append(uri.getHost());
                    jSONObject.put("schema", X1D.LIZIZ(LIZ2));
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(uri.getScheme());
                    LIZ3.append("://");
                    LIZ3.append(uri.getHost());
                    LIZ3.append('/');
                    LIZ3.append(uri.getPath());
                    jSONObject.put("schema", X1D.LIZIZ(LIZ3));
                    jSONObject.put("path", uri.getPath());
                }
                jSONObject.put("intercepted", z);
                jSONObject.put("allow", fdq.LJLJLLL);
                C09900aA.LJI("monitor_deeplink_intercept", jSONObject, null, null);
                LIZ = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }

    public static final Object call$1(ACallableS23S0210000_6 aCallableS23S0210000_6) {
        AbstractC36700Eam abstractC36700Eam = (AbstractC36700Eam) aCallableS23S0210000_6.l0;
        Object obj = aCallableS23S0210000_6.l1;
        boolean z = aCallableS23S0210000_6.z2;
        abstractC36700Eam.getClass();
        if (obj != null && (obj instanceof m)) {
            abstractC36700Eam.LIZIZ((m) obj, z);
            abstractC36700Eam.LIZ(obj);
            return null;
        }
        return null;
    }

    public ACallableS23S0210000_6(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
