package X;

import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.LqJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55499LqJ {
    public static String LIZ;
    public static String LIZIZ;
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public static String LIZLLL;
    public static Long LJ;
    public static boolean LJFF;

    public static void LIZJ() {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ = C132805Jc.LIZLLL(LIZ2, LIZLLL, currentTimeMillis, LIZ2);
        LIZIZ = UUID.randomUUID().toString();
        ((LinkedHashMap) LIZJ).clear();
        LJFF = true;
        AdSessionPositionHelper.LJIIL(currentTimeMillis);
    }

    public static Integer LIZ(String aId) {
        o.LJIIIZ(aId, "aId");
        java.util.Map<String, Integer> map = LIZJ;
        Integer num = (Integer) ((LinkedHashMap) map).get(aId);
        if (num != null) {
            map.put(aId, Integer.valueOf(num.intValue() + 1));
            return (Integer) ((LinkedHashMap) map).get(aId);
        }
        map.put(aId, 1);
        return (Integer) ((LinkedHashMap) map).get(aId);
    }

    public static String LIZIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        if (!o.LJ(LIZLLL, uid)) {
            LIZLLL = uid;
            LIZJ();
        }
        String str = LIZ;
        o.LJII(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }
}
