package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.2Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59572Vl {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C56932Lh.LJLIL);

    public static HashMap LIZ() {
        return (HashMap) LIZ.getValue();
    }

    public static boolean LIZIZ(String player) {
        o.LJIIIZ(player, "player");
        if (C59582Vm.LIZ == null) {
            C59582Vm.LIZ = C03090Af.LIZIZ("player_duplicate_detector", true);
        }
        Boolean bool = C59582Vm.LIZ;
        o.LJI(bool);
        if (bool.booleanValue() && LIZ().size() > 0) {
            Collection values = LIZ().values();
            o.LJIIIIZZ(values, "data.values");
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (o.LJ(player, it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void LIZJ(Object key, String player) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(player, "player");
        if (LIZ().containsKey(String.valueOf(key.hashCode()))) {
            return;
        }
        LIZ().put(String.valueOf(key.hashCode()), player);
    }
}
