package X;

import com.google.gson.Gson;
import com.google.gson.e;

/* renamed from: X.6YK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YK {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        C16880lQ.LJLLJ(C6YK.class);
        e eVar = new e();
        eVar.LJI = true;
        LIZ = eVar.LIZ();
        e eVar2 = new e();
        eVar2.LJI = true;
        LIZIZ = eVar2.LIZ();
        e eVar3 = new e();
        eVar3.LJI = true;
        eVar3.LJIILIIL = true;
        eVar3.LIZ();
    }

    public static String LIZ(Object obj) {
        Gson gson = LIZ;
        if (obj != null && gson != null) {
            try {
                return gson.LJIILL(obj);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
