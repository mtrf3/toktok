package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EsD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37781EsD {
    public static C37775Es7 LIZ(InterfaceC37774Es6 interfaceC37774Es6, C31926Cfy c31926Cfy, F3T bulletContextProviderFactory, List list, InterfaceC37666EqM interfaceC37666EqM, int i) {
        List processors = list;
        InterfaceC37666EqM interfaceC37666EqM2 = interfaceC37666EqM;
        if ((i & 8) != 0) {
            processors = C61878OQg.INSTANCE;
        }
        if ((i & 16) != 0) {
            interfaceC37666EqM2 = null;
        }
        o.LJIIJ(bulletContextProviderFactory, "bulletContextProviderFactory");
        o.LJIIJ(processors, "processors");
        return new C37775Es7(c31926Cfy, processors, interfaceC37666EqM2, interfaceC37774Es6, bulletContextProviderFactory, bulletContextProviderFactory);
    }
}
