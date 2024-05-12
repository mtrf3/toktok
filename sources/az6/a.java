package az6;

import X.C018905p;
import X.C1AF;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes13.dex */
public final class a {
    public static void LIZ(String str, a.c cVar, C1AF c1af, C018905p c018905p) {
        String str2;
        c1af.getContext();
        if (!o.LJ(q8.a.LJ(str), "barrierDirection") || (str2 = cVar.LIZ) == null) {
            return;
        }
        switch (str2.hashCode()) {
            case -1383228885:
                if (!str2.equals("bottom")) {
                    return;
                }
                c1af.setType(3);
                return;
            case 100571:
                if (!str2.equals("end")) {
                    return;
                }
                c1af.setType(6);
                return;
            case 115029:
                if (!str2.equals("top")) {
                    return;
                }
                c1af.setType(2);
                return;
            case 3317767:
                if (!str2.equals("left")) {
                    return;
                }
                c1af.setType(0);
                return;
            case 108511772:
                if (!str2.equals("right")) {
                    return;
                }
                c1af.setType(1);
                return;
            case 109757538:
                if (!str2.equals("start")) {
                    return;
                }
                c1af.setType(5);
                return;
            default:
                return;
        }
    }
}
