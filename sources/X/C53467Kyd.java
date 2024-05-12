package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Kyd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53467Kyd implements L4P {
    public final AbstractC53462KyY LIZ;
    public final L4T LIZIZ = L4T.OVERLAY;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarOverlayConfig(nodeState=");
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

    public C53467Kyd(AbstractC53462KyY abstractC53462KyY) {
        this.LIZ = abstractC53462KyY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C53467Kyd) && o.LJ(this.LIZ, ((C53467Kyd) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
