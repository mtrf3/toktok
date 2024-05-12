package X;

import Y.ARunnableS18S0000000_11;
import Y.ARunnableS47S0100000_11;
import android.os.Looper;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJ5 {
    public static final ARunnableS18S0000000_11 LIZ = new ARunnableS18S0000000_11(18);
    public static int LIZIZ = 0;
    public static IConfigManager LIZJ = null;
    public static boolean LIZLLL = false;
    public static boolean LJ = true;

    public static IConfigManager LIZ() {
        if (LJ && LIZJ == null) {
            try {
                LIZJ = (IConfigManager) C171096nZ.LIZ(IConfigManager.class);
            } catch (Throwable unused) {
                LJ = false;
            }
            IConfigManager iConfigManager = LIZJ;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(new PJ6());
            }
        }
        if (LJ && LIZLLL) {
            return LIZJ;
        }
        return null;
    }

    public static void LIZIZ() {
        C78685UuP.LJJJLL();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(countDownLatch, 91);
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            try {
                new PthreadThread(aRunnableS47S0100000_11, "NpthConfigFetcher").start();
            } catch (Throwable unused) {
            }
            try {
                countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        aRunnableS47S0100000_11.run();
    }

    public static JSONArray LIZJ(String str, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, jSONObject);
            jSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
