package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCQ {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final int LJI;
    public final int LJII;
    public final Boolean LJIIIIZZ;
    public final EnumC86195XsF LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MCQ() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r12 = 4095(0xfff, float:5.738E-42)
            r0 = r13
            r2 = r1
            r4 = r1
            r6 = r5
            r7 = r1
            r8 = r1
            r9 = r3
            r10 = r3
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCQ.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MCQ)) {
            return false;
        }
        MCQ mcq = (MCQ) obj;
        return this.LIZ == mcq.LIZ && this.LIZIZ == mcq.LIZIZ && o.LJ(this.LIZJ, mcq.LIZJ) && this.LIZLLL == mcq.LIZLLL && Float.compare(this.LJ, mcq.LJ) == 0 && Float.compare(this.LJFF, mcq.LJFF) == 0 && this.LJI == mcq.LJI && this.LJII == mcq.LJII && o.LJ(this.LJIIIIZZ, mcq.LJIIIIZZ) && this.LJIIIZ == mcq.LJIIIZ && this.LJIIJ == mcq.LJIIJ && this.LJIIJJI == mcq.LJIIJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LIZIZ = (((C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, (((i + hashCode) * 31) + this.LIZLLL) * 31, 31), 31) + this.LJI) * 31) + this.LJII) * 31;
        Boolean bool = this.LJIIIIZZ;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int hashCode2 = (this.LJIIIZ.hashCode() + ((LIZIZ + i2) * 31)) * 31;
        boolean z = this.LJIIJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        if (!this.LJIIJJI) {
            i3 = 0;
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarUnionConfig(avatarWidth=");
        sb.append(this.LIZ);
        sb.append(", strokeWidth=");
        sb.append(this.LIZIZ);
        sb.append(", strokeColor=");
        sb.append(this.LIZJ);
        sb.append(", maxCircleNum=");
        sb.append(this.LIZLLL);
        sb.append(", circleInterval=");
        sb.append(this.LJ);
        sb.append(", textSizeScale=");
        sb.append(this.LJFF);
        sb.append(", numberCircleBgColor=");
        sb.append(this.LJI);
        sb.append(", numberCircleTextColor=");
        sb.append(this.LJII);
        sb.append(", isRTL=");
        sb.append(this.LJIIIIZZ);
        sb.append(", tailStyle=");
        sb.append(this.LJIIIZ);
        sb.append(", enableCache=");
        sb.append(this.LJIIJ);
        sb.append(", isTailOnTop=");
        return C08880Wm.LIZJ(sb, this.LJIIJJI, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MCQ(int r15, int r16, java.lang.Integer r17, int r18, float r19, float r20, int r21, int r22, java.lang.Boolean r23, X.EnumC86195XsF r24, boolean r25, int r26) {
        /*
            r14 = this;
            r1 = r26
            r12 = r25
            r9 = r22
            r8 = r21
            r3 = r16
            r6 = r19
            r2 = r15
            r11 = r24
            r4 = r17
            r5 = r18
            r7 = r20
            r0 = r1 & 1
            if (r0 == 0) goto L1f
            r0 = 18
            int r2 = X.C7MY.LIZIZ(r0)
        L1f:
            r0 = r1 & 2
            if (r0 == 0) goto L28
            r0 = 2
            int r3 = X.C7MY.LIZIZ(r0)
        L28:
            r0 = r1 & 4
            r10 = 0
            if (r0 == 0) goto L2e
            r4 = r10
        L2e:
            r0 = r1 & 8
            if (r0 == 0) goto L33
            r5 = 3
        L33:
            r0 = r1 & 16
            if (r0 == 0) goto L3a
            r6 = 1060320051(0x3f333333, float:0.7)
        L3a:
            r0 = r1 & 32
            if (r0 == 0) goto L40
            r7 = 1065353216(0x3f800000, float:1.0)
        L40:
            r0 = r1 & 64
            if (r0 == 0) goto L47
            r8 = 2130968605(0x7f04001d, float:1.7545868E38)
        L47:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4e
            r9 = 2130968763(0x7f0400bb, float:1.7546189E38)
        L4e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L69
        L52:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L58
            X.XsF r11 = X.EnumC86195XsF.NO_TAIL
        L58:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L5d
            r12 = 0
        L5d:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L67
            r13 = 1
        L62:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L67:
            r13 = 0
            goto L62
        L69:
            r10 = r23
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCQ.<init>(int, int, java.lang.Integer, int, float, float, int, int, java.lang.Boolean, X.XsF, boolean, int):void");
    }

    public MCQ(int i, int i2, Integer num, int i3, float f, float f2, int i4, int i5, Boolean bool, EnumC86195XsF tailStyle, boolean z, boolean z2) {
        o.LJIIIZ(tailStyle, "tailStyle");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = i3;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = i4;
        this.LJII = i5;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = tailStyle;
        this.LJIIJ = z;
        this.LJIIJJI = z2;
    }
}
