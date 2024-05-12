package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.aYS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93908aYS {
    public static Gson LIZ;
    public static C93908aYS LIZIZ;

    public C93908aYS() {
        LIZ = new Gson();
    }

    public static String LIZIZ(Object obj) {
        Gson gson = LIZ;
        if (gson != null) {
            String json = GsonProtectorUtils.toJson(gson, obj);
            o.LJIIIIZZ(json, "gson.toJson(src)");
            return json;
        }
        o.LJIJI("gson");
        throw null;
    }

    public static Object LIZ(String json, Type type) {
        o.LJIIIZ(json, "json");
        try {
            Gson gson = LIZ;
            if (gson != null) {
                return gson.LJII(json, type);
            }
            o.LJIJI("gson");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}
