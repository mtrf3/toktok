package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ETk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36480ETk {
    public static final java.util.Map<String, List<String>> LIZ(String str) {
        if (str == null || str.length() == 0) {
            return C113554cx.LJJJLIIL();
        }
        Type type = new C36481ETl().getType();
        Gson GSON = C44172HVg.LIZIZ;
        o.LJIIIIZZ(GSON, "GSON");
        Object fromJson = GsonProtectorUtils.fromJson(GSON, str, type);
        o.LJIIIIZZ(fromJson, "getGson().fromJson(modelName, typeToken)");
        return (java.util.Map) fromJson;
    }

    public static final boolean LIZIZ(C10K<?> c10k) {
        if (c10k != null && !c10k.LJIILJJIL() && !c10k.LJIIL() && c10k.LJIIJJI() != null) {
            return true;
        }
        return false;
    }
}
