package X;

import kotlin.jvm.internal.o;

/* renamed from: X.60M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60M {
    public final boolean LIZ = true;
    public final boolean LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60M)) {
            return false;
        }
        C60M c60m = (C60M) obj;
        return this.LIZ == c60m.LIZ && this.LIZIZ == c60m.LIZIZ && o.LJ(this.LIZJ, c60m.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        return i + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolbarItemMessageTipStatus(isShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", isBackFromEditorPro=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dismissListener=");
        return C06540Nm.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C60M(boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZIZ = z;
        this.LIZJ = interfaceC65784Pro;
    }
}
