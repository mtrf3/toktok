package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E19 {
    public boolean LIZ;
    public final java.util.Map<String, E1B> LIZIZ;

    public E19() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E19)) {
            return false;
        }
        E19 e19 = (E19) obj;
        return this.LIZ == e19.LIZ && o.LJ(this.LIZIZ, e19.LIZIZ);
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
        java.util.Map<String, E1B> map = this.LIZIZ;
        return i + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterfaceData(needPreAnalyse=");
        LIZ.append(this.LIZ);
        LIZ.append(", methods=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ E19(boolean r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r3 & 2
            if (r0 == 0) goto L12
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        Le:
            r1.<init>(r2, r0)
            return
        L12:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E19.<init>(boolean, int):void");
    }

    public E19(boolean z, java.util.Map<String, E1B> methods) {
        o.LJIIIZ(methods, "methods");
        this.LIZ = z;
        this.LIZIZ = methods;
    }
}
