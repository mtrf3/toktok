package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Po4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65552Po4 {
    public static C65558PoA LIZ(Collection collection, InterfaceC65503PnH interfaceC65503PnH) {
        if (collection instanceof C65558PoA) {
            C65558PoA c65558PoA = (C65558PoA) collection;
            Collection<E> collection2 = c65558PoA.LJLIL;
            InterfaceC65503PnH interfaceC65503PnH2 = c65558PoA.LJLILLLLZI;
            interfaceC65503PnH2.getClass();
            return new C65558PoA(collection2, new C65504PnI(Arrays.asList(interfaceC65503PnH2, interfaceC65503PnH)));
        }
        return new C65558PoA(collection, interfaceC65503PnH);
    }
}
