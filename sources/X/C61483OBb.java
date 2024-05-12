package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OBb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61483OBb {
    public final ConcurrentHashMap<String, C61485OBd> LIZ = new ConcurrentHashMap<>();
    public static final C61484OBc LIZJ = new C61484OBc();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C61487OBf.LJLIL);

    public final InterfaceC61488OBg LIZIZ(Class cls, String bid) {
        o.LJIIJ(bid, "bid");
        C61484OBc c61484OBc = LIZJ;
        ConcurrentHashMap<String, C61485OBd> concurrentHashMap = this.LIZ;
        c61484OBc.getClass();
        C61485OBd LIZ = C61484OBc.LIZ(bid, concurrentHashMap);
        InterfaceC61488OBg interfaceC61488OBg = LIZ.LIZ.get(cls.getName());
        if (interfaceC61488OBg != null) {
            return interfaceC61488OBg;
        }
        C61485OBd LIZ2 = C61484OBc.LIZ("hybridkit_default_bid", this.LIZ);
        InterfaceC61488OBg interfaceC61488OBg2 = LIZ2.LIZ.get(cls.getName());
        if (interfaceC61488OBg2 instanceof InterfaceC61488OBg) {
            return interfaceC61488OBg2;
        }
        return null;
    }

    public final void LIZ(String bid, Class cls, InterfaceC61488OBg interfaceC61488OBg) {
        o.LJIIJ(bid, "bid");
        C61484OBc c61484OBc = LIZJ;
        ConcurrentHashMap<String, C61485OBd> concurrentHashMap = this.LIZ;
        c61484OBc.getClass();
        C61485OBd LIZ = C61484OBc.LIZ(bid, concurrentHashMap);
        String name = cls.getName();
        InterfaceC61488OBg interfaceC61488OBg2 = LIZ.LIZ.get(name);
        if (interfaceC61488OBg2 != null) {
            interfaceC61488OBg2.onUnRegister();
        }
        String str = LIZ.LIZIZ;
        if (str != null) {
            interfaceC61488OBg.onRegister(str);
            LIZ.LIZ.put(name, interfaceC61488OBg);
        } else {
            o.LJIJI("bid");
            throw null;
        }
    }
}
