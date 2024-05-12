package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20790rj {
    public static final C20790rj LIZ = new C20790rj();
    public static final List<C20890rt> LIZIZ = new ArrayList();

    public final void LIZIZ() {
        int i;
        if (!LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            return;
        }
        LIZ(this);
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            C20890rt c20890rt = (C20890rt) it.next();
            if (V0Q.Default.nextInt(0, 100) < LiveWatchLayoutPreloadLogOpt.sampleRate()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", c20890rt.LIZ);
                jSONObject.put("create_type", c20890rt.LIZJ.getType());
                jSONObject.put("biz_type", c20890rt.LIZIZ.getType());
                if (c20890rt.LJIIIZ) {
                    i = 1;
                } else {
                    i = 2;
                }
                jSONObject.put("role_type", i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("create_duration", c20890rt.LIZLLL);
                jSONObject2.put("get_duration", c20890rt.LJFF);
                jSONObject2.put("remain_duration", c20890rt.LJII);
                jSONObject2.put("widget_ready_duration", c20890rt.LJI);
                jSONObject2.put("room_switch_count", c20890rt.LJIIIIZZ);
                C0K2.LJI("ttlive_watch_layout_preload", jSONObject, jSONObject2, new JSONObject());
            }
        }
        ((ArrayList) LIZIZ).clear();
    }

    public static void LIZ(C20790rj c20790rj) {
        c20790rj.getClass();
        if (!C30922CBq.LIZIZ || o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
        } else {
            throw new RuntimeException("This could only be called on main thread");
        }
    }

    public final void LIZJ(C20890rt c20890rt) {
        if (c20890rt == null || !LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            return;
        }
        LIZ(this);
        ((ArrayList) LIZIZ).add(c20890rt);
    }
}
