package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS51S0110000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JuM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50654JuM {
    public static java.util.Map LIZIZ() {
        java.util.Map<String, String> map;
        C50653JuL c50653JuL = (C50653JuL) C85855Xml.LIZIZ(C50653JuL.class);
        if (c50653JuL == null || (map = c50653JuL.LJLIL) == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    public static java.util.Map LIZ(String str) {
        java.util.Map<String, String> map;
        if (str == null || !ORZ.LJLJJI(str, C50653JuL.LJLJI)) {
            return new LinkedHashMap();
        }
        C50653JuL c50653JuL = (C50653JuL) C85855Xml.LIZIZ(C50653JuL.class);
        if (c50653JuL == null || (map = c50653JuL.LJLIL) == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(java.util.Map map, boolean z) {
        C40937G4v c40937G4v;
        o.LJIIIZ(map, "map");
        C85855Xml.LIZJ(C50655JuN.LJLIL, C50653JuL.class, new AqS51S0110000_8(z, (boolean) map, (java.util.Map<String, String>) 1));
        C76732zl c76732zl = new C76732zl();
        C68322mC c68322mC = new C68322mC();
        C51029K0z.LJJIJIIJI(new AqS137S0200000_6(c76732zl, (C76732zl) c68322mC, (C68322mC<C40939G4x>) 22));
        C40939G4x c40939G4x = (C40939G4x) c68322mC.element;
        if (c40939G4x != null && (c40937G4v = c40939G4x.LJLIL) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                linkedHashMap.putAll(c40937G4v.LIZ());
            }
            linkedHashMap.putAll(map);
            c40937G4v.LIZ().clear();
            c40937G4v.LIZ().putAll(linkedHashMap);
        }
    }
}
