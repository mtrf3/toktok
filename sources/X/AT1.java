package X;

import defpackage.b0;

/* loaded from: classes5.dex */
public final class AT1 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public AT1() {
        this(0, 0, 7, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AT1)) {
            return false;
        }
        AT1 at1 = (AT1) obj;
        return this.LIZ == at1.LIZ && this.LIZIZ == at1.LIZIZ && this.LIZJ == at1.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SheetActionInfo(icon=");
        LIZ.append(this.LIZ);
        LIZ.append(", fillIcon=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fillColor=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public AT1(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AT1(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r3 = -1
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto La
            r4 = -1
        La:
            r0 = r5 & 4
            if (r0 == 0) goto L22
        Lf:
            X.Ofo r1 = X.C62483Off.LIZJ()
            X.Ofo r0 = X.EnumC62492Ofo.VERTICAL
            if (r1 != r0) goto L1e
            r0 = 2130968738(0x7f0400a2, float:1.7546138E38)
        L1a:
            r2.<init>(r3, r4, r0)
            return
        L1e:
            r0 = 2130968739(0x7f0400a3, float:1.754614E38)
            goto L1a
        L22:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AT1.<init>(int, int, int, int):void");
    }
}
