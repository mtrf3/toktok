package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JWa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49288JWa implements JWV {
    public final int LIZ;
    public final C49288JWa LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49288JWa)) {
            return false;
        }
        C49288JWa c49288JWa = (C49288JWa) obj;
        return this.LIZ == c49288JWa.LIZ && o.LJ(this.LIZIZ, c49288JWa.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C49288JWa c49288JWa = this.LIZIZ;
        return i + (c49288JWa == null ? 0 : c49288JWa.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChildTask(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", nextLevelTask=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C49288JWa(int i, C49288JWa c49288JWa) {
        this.LIZ = i;
        this.LIZIZ = c49288JWa;
    }
}
