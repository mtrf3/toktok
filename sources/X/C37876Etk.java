package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Etk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37876Etk {
    public static InterfaceC37978EvO LJFF;
    public static final ConcurrentHashMap<String, C37874Eti> LIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public static boolean LIZLLL = true;
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final C35657Dz3 LJI = new C35657Dz3();

    public static void LIZIZ(String key, C35657Dz3 timeLine) {
        o.LJIIJ(key, "key");
        o.LJIIJ(timeLine, "timeLine");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C37874Eti> entry : LIZ.entrySet()) {
            jSONObject.put(entry.getKey(), ((LinkedHashMap) entry.getValue().LIZ).keySet());
        }
        timeLine.LIZ(key, new JSONObject().put("config_host_list", jSONObject));
    }

    public static void LIZJ(String str, JSONObject category) {
        o.LJIIJ(category, "category");
        C35657Dz3 c35657Dz3 = LJI;
        synchronized (c35657Dz3) {
            c35657Dz3.LIZ(str, category);
        }
    }

    public static void LIZ(String str, String from, JSONObject jSONObject) {
        o.LJIIJ(from, "from");
        ConcurrentHashMap<String, C37874Eti> concurrentHashMap = LIZ;
        C37874Eti c37874Eti = concurrentHashMap.get(str);
        if (c37874Eti == null) {
            concurrentHashMap.put(str, new C37874Eti(str, jSONObject));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create_config_");
            LIZ2.append(from);
            LIZIZ(X1D.LIZIZ(LIZ2), LJI);
            return;
        }
        c37874Eti.LIZIZ(jSONObject);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("update_config_");
        LIZ3.append(from);
        LIZIZ(X1D.LIZIZ(LIZ3), LJI);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("update PermissionConfigNamespace for ");
        LIZ4.append(str);
        String msg = X1D.LIZIZ(LIZ4);
        o.LJIIJ(msg, "msg");
    }
}
