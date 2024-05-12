package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12870ex {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final java.util.Map<String, List<String>> LIZJ;
    public static final java.util.Map<String, List<String>> LIZLLL;
    public static final HashMap<String, String> LJ;

    static {
        String str = C0TY.LIZLLL;
        List<String> LJJIJ = C47261Igj.LJJIJ(str);
        LIZ = LJJIJ;
        List<String> LJJIJ2 = C47261Igj.LJJIJ("liveguestbeauty");
        LIZIZ = LJJIJ2;
        java.util.Map<String, List<String>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ("beauty_group", ORZ.LLIIIZ(LJJIJ2, LJJIJ)));
        LIZJ = LJJIIZI;
        LIZLLL = C113554cx.LJJL(new OSZ("broadcast", C47261Igj.LJJIJ(str)), new OSZ("guest_linkmic", C47261Igj.LJJIJ("liveguestbeauty")));
        LJ = new HashMap<>();
        for (String str2 : LJJIIZI.keySet()) {
            List<String> list = LIZJ.get(str2);
            if (list != null) {
                for (String it : list) {
                    HashMap<String, String> hashMap = LJ;
                    o.LJIIIIZZ(it, "it");
                    hashMap.put(it, str2);
                }
            }
        }
    }
}
