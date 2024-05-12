package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRL {
    public final InterfaceC82236WPg LIZ;
    public final InterfaceC148845sm LIZIZ;
    public final InterfaceC82284WRc LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WRL)) {
            return false;
        }
        WRL wrl = (WRL) obj;
        return o.LJ(this.LIZ, wrl.LIZ) && o.LJ(this.LIZIZ, wrl.LIZIZ) && o.LJ(this.LIZJ, wrl.LIZJ);
    }

    public final int hashCode() {
        InterfaceC82236WPg interfaceC82236WPg = this.LIZ;
        int hashCode = (interfaceC82236WPg != null ? interfaceC82236WPg.hashCode() : 0) * 31;
        InterfaceC148845sm interfaceC148845sm = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC148845sm != null ? interfaceC148845sm.hashCode() : 0)) * 31;
        InterfaceC82284WRc interfaceC82284WRc = this.LIZJ;
        return hashCode2 + (interfaceC82284WRc != null ? interfaceC82284WRc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuildInFilterSource(repository=");
        LIZ.append(this.LIZ);
        LIZ.append(", intensityStore=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", logicStore=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public WRL(InterfaceC82236WPg repository, InterfaceC148845sm interfaceC148845sm, WRF wrf) {
        o.LJIIIZ(repository, "repository");
        this.LIZ = repository;
        this.LIZIZ = interfaceC148845sm;
        this.LIZJ = wrf;
    }
}
