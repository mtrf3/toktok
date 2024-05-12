package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125974wz {
    public final EnumC126774yH LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C125974wz() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r6 = 15
            r0 = r7
            r4 = r2
            r0.<init>(r1, r2, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125974wz.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125974wz)) {
            return false;
        }
        C125974wz c125974wz = (C125974wz) obj;
        return this.LIZ == c125974wz.LIZ && o.LJ(this.LIZIZ, c125974wz.LIZIZ) && this.LIZJ == c125974wz.LIZJ && this.LIZLLL == c125974wz.LIZLLL;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LIZLLL) + JBR.LIZJ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProEffectState(operationType=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectedEffectId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startPoint=");
        LIZ.append(this.LIZJ);
        LIZ.append(", maxDuration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C125974wz(EnumC126774yH enumC126774yH, long j, long j2, int i) {
        this((i & 1) != 0 ? EnumC126774yH.ADD : enumC126774yH, (String) null, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? -1L : j2);
    }

    public C125974wz(EnumC126774yH operationType, String str, long j, long j2) {
        o.LJIIIZ(operationType, "operationType");
        this.LIZ = operationType;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
