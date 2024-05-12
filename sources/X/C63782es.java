package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63782es {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ2.append("_now_uid_keva");
        return Keva.getRepo(X1D.LIZIZ(LIZ2));
    }

    public static final java.util.Map<String, Object> LIZ(String str) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            return C113554cx.LJJJLIIL();
        }
        java.util.Map<String, ?> all = LIZIZ().getAll();
        o.LJIIIIZZ(all, "nowUidRepo.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('-');
            LIZ2.append(curUserId);
            if (ujb.o.LJJJLIIL(key, X1D.LIZIZ(LIZ2), false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
