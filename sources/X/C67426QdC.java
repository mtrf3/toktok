package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.QdC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67426QdC implements InterfaceC67459Qdj<AbstractC67420Qd6> {
    public final C4G1<InterfaceC67370QcI> LIZ = C67467Qdr.LIZ;

    @Override // X.C4G1
    public final Object get() {
        InterfaceC67370QcI interfaceC67370QcI = this.LIZ.get();
        C67432QdI c67432QdI = new C67432QdI();
        EnumC67357Qc5 enumC67357Qc5 = EnumC67357Qc5.DEFAULT;
        C67428QdE c67428QdE = new C67428QdE();
        java.util.Set<EnumC67424QdA> emptySet = Collections.emptySet();
        if (emptySet != null) {
            c67428QdE.LIZJ = emptySet;
            c67428QdE.LIZ = 30000L;
            c67428QdE.LIZIZ = 86400000L;
            ((HashMap) c67432QdI.LIZIZ).put(enumC67357Qc5, c67428QdE.LIZ());
            EnumC67357Qc5 enumC67357Qc52 = EnumC67357Qc5.HIGHEST;
            C67428QdE c67428QdE2 = new C67428QdE();
            java.util.Set<EnumC67424QdA> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                c67428QdE2.LIZJ = emptySet2;
                c67428QdE2.LIZ = 1000L;
                c67428QdE2.LIZIZ = 86400000L;
                ((HashMap) c67432QdI.LIZIZ).put(enumC67357Qc52, c67428QdE2.LIZ());
                EnumC67357Qc5 enumC67357Qc53 = EnumC67357Qc5.VERY_LOW;
                C67428QdE c67428QdE3 = new C67428QdE();
                java.util.Set<EnumC67424QdA> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    c67428QdE3.LIZJ = emptySet3;
                    c67428QdE3.LIZ = 86400000L;
                    c67428QdE3.LIZIZ = 86400000L;
                    java.util.Set<EnumC67424QdA> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC67424QdA.NETWORK_UNMETERED, EnumC67424QdA.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        c67428QdE3.LIZJ = unmodifiableSet;
                        ((HashMap) c67432QdI.LIZIZ).put(enumC67357Qc53, c67428QdE3.LIZ());
                        c67432QdI.LIZ = interfaceC67370QcI;
                        if (interfaceC67370QcI != null) {
                            if (((HashMap) c67432QdI.LIZIZ).keySet().size() >= EnumC67357Qc5.values().length) {
                                java.util.Map<EnumC67357Qc5, AbstractC67431QdH> map = c67432QdI.LIZIZ;
                                c67432QdI.LIZIZ = new HashMap();
                                return new C67421Qd7(c67432QdI.LIZ, map);
                            }
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                        throw new NullPointerException("missing required property: clock");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }
}
