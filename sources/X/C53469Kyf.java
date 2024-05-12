package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Kyf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53469Kyf implements L4P {
    public final AbstractC53462KyY LIZ;
    public final L4T LIZIZ = L4T.BADGE;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarBadgeConfig(nodeState=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.L4P
    public final AbstractC53462KyY LIZ() {
        return this.LIZ;
    }

    @Override // X.L4P
    public final L4T getNodeType() {
        return this.LIZIZ;
    }

    public C53469Kyf(C53461KyX c53461KyX) {
        this.LIZ = c53461KyX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C53469Kyf) && o.LJ(this.LIZ, ((C53469Kyf) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
