package X;

import kotlin.jvm.internal.o;

/* renamed from: X.K7h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51193K7h {
    public C51222K8k LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51193K7h) && o.LJ(this.LIZ, ((C51193K7h) obj).LIZ);
    }

    public final int hashCode() {
        C51222K8k c51222K8k = this.LIZ;
        if (c51222K8k == null) {
            return 0;
        }
        return c51222K8k.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AttachCard(storeCard=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C51193K7h(C51222K8k c51222K8k) {
        this.LIZ = c51222K8k;
    }
}
