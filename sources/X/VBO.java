package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBO {
    public static volatile PThreadPoolExecutor LIZ;
    public static volatile PThreadPoolExecutor LIZIZ;
    public static volatile boolean LIZJ;
    public static VBR LIZLLL;
    public static VBR LJ;

    public static void LIZ(String str) {
        if (LIZJ) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("live_sdk_use_global_threadpool")) {
                if (jSONObject.optInt("live_sdk_use_global_threadpool") != 0) {
                    synchronized (VBO.class) {
                        if (!LIZJ) {
                            VBR vbr = new VBR();
                            vbr.LIZ = 5;
                            vbr.LIZIZ = 1;
                            vbr.LIZJ = 2;
                            LIZLLL = vbr;
                            VBR vbr2 = new VBR();
                            vbr2.LIZ = 4;
                            vbr2.LIZIZ = 2;
                            vbr2.LIZJ = 4;
                            LJ = vbr2;
                            LIZIZ(jSONObject.optJSONObject("high"), LIZLLL);
                            LIZIZ(jSONObject.optJSONObject("low"), LJ);
                            VBR vbr3 = LIZLLL;
                            int i = vbr3.LIZIZ;
                            int i2 = vbr3.LIZJ;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            LIZ = new PThreadPoolExecutor(i, i2, 60L, timeUnit, new LinkedBlockingQueue(), new VBP());
                            VBR vbr4 = LJ;
                            LIZIZ = new PThreadPoolExecutor(vbr4.LIZIZ, vbr4.LIZJ, 60L, timeUnit, new LinkedBlockingQueue(), new VBQ());
                            LIZJ = true;
                        }
                    }
                    return;
                }
            }
            C46496IMq.LIZJ();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            C46496IMq.LIZIZ();
        }
    }

    public static void LIZIZ(JSONObject jSONObject, VBR vbr) {
        if (jSONObject == null || vbr == null) {
            return;
        }
        if (jSONObject.has("priority")) {
            vbr.LIZ = jSONObject.optInt("priority");
        }
        if (jSONObject.has("core_size")) {
            vbr.LIZIZ = jSONObject.optInt("core_size");
        }
        if (jSONObject.has("max_size")) {
            vbr.LIZJ = jSONObject.optInt("max_size");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ThreadPoolConfig, priority:");
        LIZ2.append(vbr.LIZ);
        LIZ2.append(", core:");
        LIZ2.append(vbr.LIZIZ);
        LIZ2.append(", max:");
        LIZ2.append(vbr.LIZJ);
        X1D.LIZIZ(LIZ2);
        C46496IMq.LIZ();
    }
}
