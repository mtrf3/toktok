package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Et2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37832Et2 {
    public final ConcurrentHashMap<EnumC37844EtE, ConcurrentHashMap<String, InterfaceC37666EqM>> LIZ = new ConcurrentHashMap<>();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C37833Et3.LJLIL);

    public final ConcurrentHashMap<String, InterfaceC37666EqM> LIZIZ(EnumC37844EtE enumC37844EtE) {
        ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap = this.LIZ.get(enumC37844EtE);
        if (concurrentHashMap == null) {
            this.LIZ.put(enumC37844EtE, new ConcurrentHashMap<>());
            ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap2 = this.LIZ.get(enumC37844EtE);
            if (concurrentHashMap2 != null) {
                o.LJFF(concurrentHashMap2, "map[platformType]!!");
                return concurrentHashMap2;
            }
            o.LJIIZILJ();
            throw null;
        }
        return concurrentHashMap;
    }

    public final InterfaceC37666EqM LIZ(EnumC37844EtE platformType, String bridgeName) {
        ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap;
        InterfaceC37666EqM interfaceC37666EqM;
        o.LJIIJ(bridgeName, "bridgeName");
        o.LJIIJ(platformType, "platformType");
        ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap2 = this.LIZ.get(platformType);
        if ((concurrentHashMap2 != null && (interfaceC37666EqM = concurrentHashMap2.get(bridgeName)) != null) || ((concurrentHashMap = this.LIZ.get(EnumC37844EtE.ALL)) != null && (interfaceC37666EqM = concurrentHashMap.get(bridgeName)) != null)) {
            return interfaceC37666EqM;
        }
        Class<? extends InterfaceC37666EqM> LIZ = ((C37829Esz) this.LIZIZ.getValue()).LIZ(platformType, bridgeName, "DEFAULT");
        if (LIZ == null && (LIZ = C37831Et1.LIZ.LIZ(platformType, bridgeName, "DEFAULT")) == null) {
            return null;
        }
        InterfaceC37666EqM newInstance = LIZ.newInstance();
        ConcurrentHashMap<String, InterfaceC37666EqM> LIZIZ = LIZIZ(platformType);
        o.LJFF(newInstance, "newInstance");
        LIZIZ.put(bridgeName, newInstance);
        return newInstance;
    }
}
