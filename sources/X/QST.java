package X;

import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QST {
    public static WeakHandler LIZIZ;
    public static long LIZLLL;
    public static final QSY LIZ = new QSY();
    public static volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static Handler LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new WeakHandler(C16880lQ.LLJJJJ(), LIZ);
        }
        return LIZIZ;
    }

    public static void LIZIZ(int i, long j) {
        String str;
        if (i != 201) {
            str = "init success";
        } else {
            str = "not invoke start() method/not invoke start() when 30s passed";
        }
        if (i == 0) {
            C1JX.LJIIIIZZ("Push init error:", str);
        } else {
            C1JX.LJIIIIZZ("Push init error:", str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C79004UzY.LJJJJ("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
        if (i == 0) {
            i = 0;
        }
        QSU.LIZ("1002", str, i, null);
    }
}
