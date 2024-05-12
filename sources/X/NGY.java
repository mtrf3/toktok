package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public NGY() {
        this((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NGY)) {
            return false;
        }
        NGY ngy = (NGY) obj;
        return o.LJ(this.LIZ, ngy.LIZ) && o.LJ(this.LIZIZ, ngy.LIZIZ) && o.LJ(this.LIZJ, ngy.LIZJ) && o.LJ(this.LIZLLL, ngy.LIZLLL) && o.LJ(this.LJ, ngy.LJ) && o.LJ(this.LJFF, ngy.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LJFF;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdHybridDataModel(creativeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", logExra=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", groupId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", chargeType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", systemOrigin=");
        LIZ.append(this.LJ);
        LIZ.append(", isAd=");
        return C78920UyC.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NGY(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, int r14) {
        /*
            r8 = this;
            r6 = r13
            r5 = r12
            r2 = r9
            r3 = r10
            r0 = r14 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto Lb
            r2 = r4
        Lb:
            r0 = r14 & 2
            if (r0 == 0) goto L10
            r3 = r4
        L10:
            r0 = r14 & 4
            if (r0 == 0) goto L32
        L14:
            r0 = r14 & 8
            r1 = -1
            if (r0 == 0) goto L1d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L1d:
            r0 = r14 & 16
            if (r0 == 0) goto L25
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L25:
            r0 = r14 & 32
            if (r0 == 0) goto L30
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L2b:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L30:
            r7 = 0
            goto L2b
        L32:
            r4 = r11
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NGY.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int):void");
    }

    public NGY(String str, String str2, String str3, Integer num, Integer num2, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = bool;
    }
}
