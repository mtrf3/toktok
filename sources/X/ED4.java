package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ED4 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!o.LJ("ec", uri.getHost())) {
                return false;
            }
            if (!o.LJ("/pdp", uri.getPath())) {
                return false;
            }
            return true;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return false;
        }
    }

    public static String LIZIZ(String pdpSchema, java.util.Map map) {
        JSONObject jSONObject;
        String str;
        o.LJIIIZ(pdpSchema, "pdpSchema");
        try {
            android.net.Uri parse = UriProtector.parse(pdpSchema);
            if (LIZ(parse)) {
                try {
                    jSONObject = new JSONObject(ED3.LJ(parse, "trackParams"));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "trackParamsJson.toString()");
                android.net.Uri LIZIZ = ED3.LIZIZ(parse, "trackParams", jSONObject2);
                if (LIZIZ != null) {
                    str = LIZIZ.toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
                return pdpSchema;
            }
            return pdpSchema;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return pdpSchema;
        }
    }
}
