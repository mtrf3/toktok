package X;

import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.lynx.tasm.LynxEnv;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cg5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31933Cg5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject LIZJ = C65232Piu.LIZJ("live_container_type", "lynx");
        JSONObject LIZLLL = Q7K.LIZLLL("duration", currentTimeMillis);
        JSONObject jSONObject = new JSONObject();
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        jSONObject.put("virtual_aid", "99999");
        jSONObject.put("platform", 3);
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "hybrid_container_init_duration", null, LIZJ, LIZLLL, null, jSONObject, 0);
    }

    public static void LIZJ(int i, java.util.Map map) {
        String str;
        LynxEnv.LJIIIZ().getClass();
        map.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIILL(i, 1, "ttlive_lynx_offline", map);
        Object obj = ((LinkedHashMap) map).get("path");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offline", String.valueOf(i));
        jSONObject.put("live_container_type", "lynx");
        JSONObject jSONObject2 = new JSONObject();
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        jSONObject2.put("virtual_aid", "99999");
        jSONObject2.put("platform", 3);
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "template_offline", str, jSONObject, null, null, jSONObject2, 0);
    }

    public static void LIZLLL(long j, java.util.Map map) {
        LynxEnv.LJIIIZ().getClass();
        map.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIIL(j, 1, O5Y.LJJLI("ttlive_lynx_page_load"), map);
    }

    public static void LJFF(long j, java.util.Map map) {
        LynxEnv.LJIIIZ().getClass();
        map.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIILJJIL(0, j, "ttlive_lynx_page_start", map);
    }

    public static void LJ(long j, int i, java.util.Map map) {
        LynxEnv.LJIIIZ().getClass();
        map.put("lynx_version", "2.10.16-rc.10");
        C0K2.LJIIL(j, i, O5Y.LJJL("ttlive_lynx_page_load"), map);
    }

    public static void LIZIZ(CXL type, String message, String path, int i) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(path, "path");
        C0K2.LJII(1, "ttlive_lynx_fallback", C113554cx.LJJL(new OSZ("type", type.getType()), new OSZ("error_message", message), new OSZ("path", path), new OSZ("url", path), new OSZ("code", Integer.valueOf(i))));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", type.getType());
        jSONObject.put("error_message", message);
        jSONObject.put("path", path);
        jSONObject.put("url", path);
        JSONObject jSONObject2 = new JSONObject();
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        jSONObject2.put("virtual_aid", "99999");
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "lynx_fallback", path, null, null, jSONObject, jSONObject2, 0);
    }
}
