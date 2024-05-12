package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* renamed from: X.Urj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78519Urj {
    public static final Gson LIZ = new Gson();

    public static String LIZIZ(Object obj) {
        o.LJIIJ(obj, "obj");
        String json = GsonProtectorUtils.toJson(LIZ, obj);
        o.LJFF(json, "GSON.toJson(obj)");
        return json;
    }

    public static Object LIZ(String json, Class cls) {
        o.LJIIJ(json, "json");
        return GsonProtectorUtils.fromJson(LIZ, json, cls);
    }
}
