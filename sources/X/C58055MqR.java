package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MqR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58055MqR {
    public final EnumC57741MlN LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final EnumC58061MqX LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final MCQ LJIIIIZZ;

    public C58055MqR() {
        this(null, false, false, false, false, false, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58055MqR)) {
            return false;
        }
        C58055MqR c58055MqR = (C58055MqR) obj;
        return this.LIZ == c58055MqR.LIZ && this.LIZIZ == c58055MqR.LIZIZ && this.LIZJ == c58055MqR.LIZJ && this.LIZLLL == c58055MqR.LIZLLL && this.LJ == c58055MqR.LJ && this.LJFF == c58055MqR.LJFF && this.LJI == c58055MqR.LJI && this.LJII == c58055MqR.LJII && o.LJ(this.LJIIIIZZ, c58055MqR.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LIZLLL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJ;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int hashCode2 = (this.LJFF.hashCode() + ((i6 + i7) * 31)) * 31;
        boolean z5 = this.LJI;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (((hashCode2 + i8) * 31) + (this.LJII ? 1 : 0)) * 31;
        MCQ mcq = this.LJIIIIZZ;
        return i9 + (mcq == null ? 0 : mcq.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationLabelConfig(extStyle=");
        LIZ.append(this.LIZ);
        LIZ.append(", tailAvatar=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatarNextLine=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nameBold=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", nameClickable=");
        LIZ.append(this.LJ);
        LIZ.append(", ellipsisStrategy=");
        LIZ.append(this.LJFF);
        LIZ.append(", fixWidth=");
        LIZ.append(this.LJI);
        LIZ.append(", cacheable=");
        LIZ.append(this.LJII);
        LIZ.append(", avatarUnionConfig=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C58055MqR(X.EnumC57741MlN r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, X.MCQ r18, int r19) {
        /*
            r11 = this;
            r1 = r19
            r3 = r13
            r10 = r18
            r2 = r12
            r5 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            r0 = r1 & 1
            if (r0 == 0) goto L12
            X.MlN r2 = X.EnumC57741MlN.DETAIL
        L12:
            r0 = r1 & 2
            if (r0 == 0) goto L17
            r3 = 1
        L17:
            r4 = 0
            r0 = r1 & 8
            if (r0 == 0) goto L1d
            r5 = 1
        L1d:
            r0 = r1 & 16
            if (r0 == 0) goto L22
            r6 = 0
        L22:
            r0 = r1 & 32
            if (r0 == 0) goto L3d
            X.MqX r7 = X.EnumC58061MqX.LONGEST_FIRST
        L28:
            r0 = r1 & 64
            if (r0 == 0) goto L2d
            r8 = 0
        L2d:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L32
            r9 = 0
        L32:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L38
            X.MCQ r10 = X.MCR.LIZJ
        L38:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L3d:
            r7 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58055MqR.<init>(X.MlN, boolean, boolean, boolean, boolean, boolean, X.MCQ, int):void");
    }

    public C58055MqR(EnumC57741MlN extStyle, boolean z, boolean z2, boolean z3, boolean z4, EnumC58061MqX ellipsisStrategy, boolean z5, boolean z6, MCQ mcq) {
        o.LJIIIZ(extStyle, "extStyle");
        o.LJIIIZ(ellipsisStrategy, "ellipsisStrategy");
        this.LIZ = extStyle;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = ellipsisStrategy;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = mcq;
    }
}
