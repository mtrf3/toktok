package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Kyc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53466Kyc implements L4P {
    public final AbstractC53462KyY LIZ;
    public final L4T LIZIZ = L4T.FRAME;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarFrameConfig(nodeState=");
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

    public C53466Kyc(C53461KyX c53461KyX) {
        this.LIZ = c53461KyX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C53466Kyc) && o.LJ(this.LIZ, ((C53466Kyc) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
