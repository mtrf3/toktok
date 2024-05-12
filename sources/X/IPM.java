package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IPM<V> implements Callable {
    public static final IPM<V> LJLIL = new IPM<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = IPN.LIZ;
            long j2 = elapsedRealtime - j;
            if (j != -1 && j2 > 80) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j2);
                jSONObject.put("enter_from", "TEMAI");
                Boolean LIZLLL = C38987FRv.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
                if (LIZLLL.booleanValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_cold_start_first_launch", i);
                C48658J7u.LIZIZ("video_block", jSONObject);
            }
            IPN.LIZ = -1L;
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return C76800UCe.LIZ;
    }
}
