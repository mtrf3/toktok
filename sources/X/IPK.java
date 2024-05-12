package X;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IPK<V> implements Callable {
    public static final IPK<V> LJLIL = new IPK<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", "TEMAI");
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            if (LIZLLL.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
            C48658J7u.LIZIZ("video_request", jSONObject);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }
}
