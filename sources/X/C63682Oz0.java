package X;

import com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.ArrayList;

/* renamed from: X.Oz0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63682Oz0 {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new EnumTypeAdapterFactory());
        LIZ = eVar.LIZ();
        e eVar2 = new e();
        ((ArrayList) eVar2.LJ).add(new EnumTypeAdapterFactory());
        eVar2.LIZ = eVar2.LIZ.LJ(new C65380PlI(), true, false);
        LIZIZ = eVar2.LIZ();
    }

    public static String LIZ(java.util.Map<String, String> map) {
        if (map == null) {
            return "";
        }
        try {
            if (map.size() <= 0) {
                return "";
            }
            return LIZ.LJIILL(map);
        } catch (Exception unused) {
            return "";
        }
    }

    public static java.util.Map<String, String> LIZIZ(String str) {
        try {
            return (java.util.Map) LIZ.LJII(str, new C63098Opa().getType());
        } catch (Exception unused) {
            return null;
        }
    }
}
