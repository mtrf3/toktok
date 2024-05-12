package X;

import defpackage.b0;

/* loaded from: classes9.dex */
public final class IPJ {
    public final EnumC46470ILq LIZ;
    public final int LIZIZ;

    public IPJ() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IPJ)) {
            return false;
        }
        IPJ ipj = (IPJ) obj;
        return this.LIZ == ipj.LIZ && this.LIZIZ == ipj.LIZIZ;
    }

    public final int hashCode() {
        EnumC46470ILq enumC46470ILq = this.LIZ;
        return ((enumC46470ILq == null ? 0 : enumC46470ILq.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenMultiGuestModeratorsManageDialogInfo(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", applyPosition=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public IPJ(EnumC46470ILq enumC46470ILq, int i) {
        this.LIZ = enumC46470ILq;
        this.LIZIZ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IPJ(X.EnumC46470ILq r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r0 = r3 & 2
            if (r0 == 0) goto Le
            r0 = -1
        La:
            r1.<init>(r2, r0)
            return
        Le:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IPJ.<init>(X.ILq, int, int):void");
    }
}
