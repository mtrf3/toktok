package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98533tp {
    public static HashMap<String, List<C109544Rq>> LIZ;
    public static HashMap<String, Integer> LIZIZ;
    public static C0M6<String, Integer> LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static final void LIZIZ() {
        if (LIZIZ != null) {
            LIZIZ = null;
        }
        if (LIZ != null) {
            LIZ = null;
        }
        LIZLLL = false;
        LJ = false;
    }

    public static final void LIZ(String str, List<? extends C109544Rq> list) {
        if (LIZ == null) {
            LIZ = new HashMap<>();
        }
        HashMap<String, List<C109544Rq>> hashMap = LIZ;
        o.LJI(hashMap);
        hashMap.put(str, list);
    }
}
