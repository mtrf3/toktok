package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WsC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83644WsC {
    public final String LIZ;
    public final C83677Wsj LIZIZ;
    public final NDG LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83644WsC)) {
            return false;
        }
        C83644WsC c83644WsC = (C83644WsC) obj;
        return o.LJ(this.LIZ, c83644WsC.LIZ) && o.LJ(this.LIZIZ, c83644WsC.LIZIZ) && o.LJ(this.LIZJ, c83644WsC.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C83677Wsj c83677Wsj = this.LIZIZ;
        int hashCode2 = (hashCode + (c83677Wsj != null ? c83677Wsj.hashCode() : 0)) * 31;
        NDG ndg = this.LIZJ;
        return hashCode2 + (ndg != null ? ndg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiEvent: type: ");
        LIZ.append(this.LIZ);
        LIZ.append(", context: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", action: ");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C83644WsC(String type, C83677Wsj c83677Wsj, NDG ndg) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = c83677Wsj;
        this.LIZJ = ndg;
    }
}
