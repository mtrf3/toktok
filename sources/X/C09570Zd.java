package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09570Zd {
    public InterfaceC16890lR LIZ = null;
    public final C09560Zc LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09570Zd)) {
            return false;
        }
        C09570Zd c09570Zd = (C09570Zd) obj;
        return o.LJ(this.LIZ, c09570Zd.LIZ) && o.LJ(this.LIZIZ, c09570Zd.LIZIZ);
    }

    public final int hashCode() {
        InterfaceC16890lR interfaceC16890lR = this.LIZ;
        return this.LIZIZ.hashCode() + ((interfaceC16890lR == null ? 0 : interfaceC16890lR.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KVStorageConfig(monitor=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultRepoConfig=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C09570Zd(C09560Zc c09560Zc) {
        this.LIZIZ = c09560Zc;
    }
}
