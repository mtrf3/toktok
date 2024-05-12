package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59812Wj {
    public boolean LIZ = false;
    public java.util.Map<Long, String> LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59812Wj)) {
            return false;
        }
        C59812Wj c59812Wj = (C59812Wj) obj;
        return this.LIZ == c59812Wj.LIZ && o.LJ(this.LIZIZ, c59812Wj.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        java.util.Map<Long, String> map = this.LIZIZ;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscribeGiftState(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        return C15890jp.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
