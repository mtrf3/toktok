package X;

import com.bytedance.router.SmartRoute;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Mda, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57258Mda {
    public static final HashMap<String, java.util.Set<String>> LIZ;

    static {
        HashMap<String, java.util.Set<String>> hashMap = new HashMap<>();
        LIZ = hashMap;
        hashMap.put("all_event", C77275UUl.LJ("account_type", "inbox_position", "notice_message_type"));
        hashMap.put("follow", C77275UUl.LJ("position"));
    }

    public static void LIZ(HashMap hashMap, JSONObject jSONObject) {
        if (!DWK.LIZ()) {
            return;
        }
        LIZLLL(jSONObject, "share_video", hashMap, C57259Mdb.LJLIL);
    }

    public static void LIZJ(JHM jhm, HashMap hashMap) {
        o.LJIIIZ(jhm, "<this>");
        if (!DWK.LIZ()) {
            return;
        }
        String eventName = jhm.LIZ;
        o.LJIIIIZZ(eventName, "eventName");
        LIZLLL(jhm, eventName, hashMap, C57260Mdc.LJLIL);
    }

    public static final void LJ(SmartRoute smartRoute, HashMap hashMap) {
        if (DWK.LIZ() && hashMap != null && (!hashMap.isEmpty())) {
            smartRoute.withParam("inbox_log_extra", hashMap);
        }
    }

    public static void LIZIZ(C188727au c188727au, String str, HashMap hashMap) {
        if (!DWK.LIZ()) {
            return;
        }
        LIZLLL(c188727au, str, hashMap, C57261Mdd.LJLIL);
    }

    public static void LIZLLL(Object obj, String str, HashMap hashMap, InterfaceC88473Ynt interfaceC88473Ynt) {
        HashMap<String, java.util.Set<String>> hashMap2;
        java.util.Set<String> set;
        if (hashMap != null && (!hashMap.isEmpty()) && (set = (hashMap2 = LIZ).get("all_event")) != null) {
            java.util.Set LJIIL = F5P.LJIIL(set, hashMap2.get(str));
            for (Map.Entry entry : hashMap.entrySet()) {
                if (LJIIL.contains(entry.getKey())) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    interfaceC88473Ynt.invoke(obj, key, value);
                }
            }
        }
    }
}
