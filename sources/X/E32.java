package X;

import com.bytedance.pitaya.cep_package.CepPackageManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E32 {
    public static final CepPackageManager LIZ = CepPackageManager.LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final JSONObject LIZJ = new JSONObject();

    public static void LIZ(String eventName, long j, JSONObject params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        if (!LIZIZ.get()) {
            return;
        }
        LIZ.getClass();
        CepPackageManager.LIZIZ(eventName, j, params);
    }
}
