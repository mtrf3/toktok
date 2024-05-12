package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112924bw implements InterfaceC113014c5 {
    public final EnumC112954bz LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C112924bw) && this.LIZ == ((C112924bw) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FinalImageState(safetyMaskType=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C112924bw(EnumC112954bz safetyMaskType) {
        o.LJIIIZ(safetyMaskType, "safetyMaskType");
        this.LIZ = safetyMaskType;
    }
}
