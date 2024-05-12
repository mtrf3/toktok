package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* renamed from: X.FfQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39536FfQ {
    public static final Gson LIZ = new Gson();

    public static final String LIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        String json = GsonProtectorUtils.toJson(LIZ, obj);
        o.LJIIIIZZ(json, "INSTANCE.toJson(o)");
        return json;
    }
}
