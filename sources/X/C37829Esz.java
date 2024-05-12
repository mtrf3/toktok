package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Esz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37829Esz {
    public static final /* synthetic */ int LIZLLL = 0;
    public boolean LIZ;
    public InterfaceC38263Ezz LIZIZ;
    public final ConcurrentHashMap<String, C37725ErJ> LIZJ;

    public C37829Esz() {
        new ConcurrentHashMap();
        this.LIZJ = new ConcurrentHashMap<>();
    }

    public final Class<? extends InterfaceC37666EqM> LIZ(EnumC37844EtE platformType, String name, String namespace) {
        C37725ErJ c37725ErJ;
        o.LJIIJ(platformType, "platformType");
        o.LJIIJ(name, "name");
        o.LJIIJ(namespace, "namespace");
        if (this.LIZJ.get(namespace) == null || (c37725ErJ = this.LIZJ.get(namespace)) == null) {
            return null;
        }
        return c37725ErJ.LIZ(platformType, name);
    }

    public final void LIZIZ(Class<? extends InterfaceC37666EqM> cls, EnumC37844EtE scope, String namespace) {
        o.LJIIJ(scope, "scope");
        o.LJIIJ(namespace, "namespace");
        if (cls != null) {
            if (this.LIZJ.get(namespace) == null) {
                this.LIZJ.put(namespace, new C37725ErJ(this.LIZ, this.LIZIZ));
            }
            C37725ErJ c37725ErJ = this.LIZJ.get(namespace);
            if (c37725ErJ != null) {
                c37725ErJ.LIZIZ(cls, scope);
            }
        }
    }
}
