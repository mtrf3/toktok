package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nmo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60378Nmo {
    public final ConcurrentHashMap<String, InterfaceC60387Nmx> LIZ;
    public final String LIZIZ;

    public C60378Nmo() {
        this.LIZ = new ConcurrentHashMap<>();
    }

    public C60378Nmo(C60342NmE c60342NmE) {
        this();
        this.LIZIZ = c60342NmE.LIZIZ;
        this.LIZ.putAll(c60342NmE.LIZ);
    }

    public final void LIZ(String clazzName, InterfaceC60387Nmx serviceInst) {
        o.LJIIJ(clazzName, "clazzName");
        o.LJIIJ(serviceInst, "serviceInst");
        InterfaceC60387Nmx interfaceC60387Nmx = this.LIZ.get(clazzName);
        if (interfaceC60387Nmx != null) {
            interfaceC60387Nmx.onUnRegister();
        }
        String str = this.LIZIZ;
        if (str != null) {
            serviceInst.onRegister(str);
            this.LIZ.put(clazzName, serviceInst);
        } else {
            o.LJIJI("bid");
            throw null;
        }
    }
}
