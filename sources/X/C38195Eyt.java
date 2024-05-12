package X;

import Y.AObjectS29S0000000_6;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.Eyt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38195Eyt {
    public static final java.util.Map<Class<?>, java.util.Map<Class<?>, InterfaceC88471Ynr<Object, Class<?>, Object>>> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC88472Yns<Object, JSONObject>> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WEB", new AObjectS29S0000000_6(3));
        LIZIZ = linkedHashMap;
    }

    public static final InterfaceC88471Ynr<Object, Class<?>, Object> LIZ(Class<?> cls, Class<?> cls2) {
        java.util.Map map = (java.util.Map) ((LinkedHashMap) LIZ).get(cls);
        if (map != null) {
            return (InterfaceC88471Ynr) map.get(cls2);
        }
        return null;
    }
}
