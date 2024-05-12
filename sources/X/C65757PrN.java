package X;

import defpackage.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PrN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65757PrN {
    public static final InterfaceC65637PpR<String, InterfaceC65764PrU> LIZ;

    static {
        g0.LJIIIIZZ(8, "expectedKeys");
        LIZ = new C65696PqO(new C65756PrM().LIZ(), EnumC48312Ixg.LJLIL);
    }

    public static void LIZ(Object value, String str) {
        o.LJIIIZ(value, "value");
        List<InterfaceC65764PrU> list = LIZ.get((InterfaceC65637PpR<String, InterfaceC65764PrU>) str);
        if (list != null) {
            Iterator<InterfaceC65764PrU> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }
}
