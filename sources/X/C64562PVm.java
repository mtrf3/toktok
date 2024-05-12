package X;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: X.PVm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64562PVm {
    public final C64563PVn LIZ;
    public final Proxy LIZIZ;
    public final InetSocketAddress LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + ((this.LIZ.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Route{");
        LIZ.append(this.LIZJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C64562PVm) {
            C64562PVm c64562PVm = (C64562PVm) obj;
            if (c64562PVm.LIZ.equals(this.LIZ) && c64562PVm.LIZIZ.equals(this.LIZIZ) && c64562PVm.LIZJ.equals(this.LIZJ)) {
                return true;
            }
        }
        return false;
    }

    public C64562PVm(C64563PVn c64563PVn, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c64563PVn != null) {
            if (inetSocketAddress != null) {
                this.LIZ = c64563PVn;
                this.LIZIZ = proxy;
                this.LIZJ = inetSocketAddress;
                return;
            }
            throw new NullPointerException("inetSocketAddress == null");
        }
        throw new NullPointerException("address == null");
    }
}
