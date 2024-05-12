package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245609kS {
    public final String LIZ;
    public final C86919Y9j LIZIZ;
    public C245609kS LIZJ;
    public C245609kS LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C245609kS)) {
            return false;
        }
        C245609kS c245609kS = (C245609kS) obj;
        return o.LJ(this.LIZ, c245609kS.LIZ) && o.LJ(this.LIZIZ, c245609kS.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C86919Y9j c86919Y9j = this.LIZIZ;
        return hashCode + (c86919Y9j != null ? c86919Y9j.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Node(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C245609kS(String str, C86919Y9j c86919Y9j) {
        this.LIZ = str;
        this.LIZIZ = c86919Y9j;
    }
}
