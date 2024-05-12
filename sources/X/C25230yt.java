package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.0yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25230yt {
    public static final C25230yt LIZ = new C25230yt();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ = true;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(AnonymousClass273.LJLIL);

    public static final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (LIZJ) {
                LIZJ = false;
                ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
                concurrentHashMap.clear();
                java.util.Map<? extends String, ? extends String> LJFF = ((AbstractC48597J5l) LIZLLL.getValue()).LJFF();
                if (LJFF == null) {
                    LJFF = C113554cx.LJJJLIIL();
                }
                concurrentHashMap.putAll(LJFF);
            }
            for (Map.Entry<String, String> entry : LIZIZ.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return jSONObject;
    }
}
