package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E1B {
    public final List<String> LIZ;
    public final List<Integer> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public E1B() {
        this(false, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1B)) {
            return false;
        }
        E1B e1b = (E1B) obj;
        return o.LJ(this.LIZ, e1b.LIZ) && o.LJ(this.LIZIZ, e1b.LIZIZ) && this.LIZJ == e1b.LIZJ && this.LIZLLL == e1b.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<String> list = this.LIZ;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BinderMethod(dataTypes=");
        LIZ.append(this.LIZ);
        LIZ.append(", apiIds=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", normalEnabled=");
        LIZ.append(this.LIZJ);
        LIZ.append(", errorEnabled=");
        return C19U.LIZ(LIZ, this.LIZLLL, ")", LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E1B(boolean r4, boolean r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 1
            r2 = 0
            if (r0 == 0) goto L1b
            X.OQg r1 = X.C61878OQg.INSTANCE
        L7:
            r0 = r6 & 2
            if (r0 == 0) goto Ld
            X.OQg r2 = X.C61878OQg.INSTANCE
        Ld:
            r0 = r6 & 4
            if (r0 == 0) goto L12
            r4 = 0
        L12:
            r0 = r6 & 8
            if (r0 == 0) goto L17
            r5 = 0
        L17:
            r3.<init>(r1, r4, r2, r5)
            return
        L1b:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1B.<init>(boolean, boolean, int):void");
    }

    public E1B(List dataTypes, boolean z, List apiIds, boolean z2) {
        o.LJIIIZ(dataTypes, "dataTypes");
        o.LJIIIZ(apiIds, "apiIds");
        this.LIZ = dataTypes;
        this.LIZIZ = apiIds;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
