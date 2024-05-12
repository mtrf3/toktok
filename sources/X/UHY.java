package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHY {
    public final String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public View LJII;
    public final Boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UHY() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r8 = 1023(0x3ff, float:1.434E-42)
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHY.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UHY)) {
            return false;
        }
        UHY uhy = (UHY) obj;
        return o.LJ(this.LIZ, uhy.LIZ) && o.LJ(this.LIZIZ, uhy.LIZIZ) && this.LIZJ == uhy.LIZJ && this.LIZLLL == uhy.LIZLLL && this.LJ == uhy.LJ && this.LJFF == uhy.LJFF && this.LJI == uhy.LJI && o.LJ(this.LJII, uhy.LJII) && o.LJ(this.LJIIIIZZ, uhy.LJIIIIZZ) && this.LJIIIZ == uhy.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = (((((C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LJI;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        View view = this.LJII;
        int i6 = 0;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i7 = (i5 + hashCode) * 31;
        Boolean bool = this.LJIIIIZZ;
        if (bool != null) {
            i6 = bool.hashCode();
        }
        int i8 = (i7 + i6) * 31;
        if (!this.LJIIIZ) {
            i = 0;
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExchangeDialogParams(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cancel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", confirm=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", checkBoxText=");
        LIZ.append(this.LJ);
        LIZ.append(", showCheckBox=");
        LIZ.append(this.LJFF);
        LIZ.append(", icon=");
        LIZ.append(this.LJI);
        LIZ.append(", customMessageView=");
        LIZ.append(this.LJII);
        LIZ.append(", ignoreSuppress=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", setDialogCancelable=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UHY(java.lang.String r13, java.lang.String r14, int r15, int r16, int r17, boolean r18, boolean r19, int r20) {
        /*
            r12 = this;
            r1 = r20
            r4 = r15
            r2 = r13
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r19
            r0 = r1 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L13
            r2 = r3
        L13:
            r0 = r1 & 2
            if (r0 == 0) goto L45
        L17:
            r0 = r1 & 4
            if (r0 == 0) goto L1c
            r4 = 0
        L1c:
            r0 = r1 & 8
            if (r0 == 0) goto L21
            r5 = 0
        L21:
            r0 = r1 & 16
            if (r0 == 0) goto L26
            r6 = 0
        L26:
            r0 = r1 & 32
            if (r0 == 0) goto L2b
            r7 = 0
        L2b:
            r0 = r1 & 64
            if (r0 == 0) goto L43
            r8 = 1
        L30:
            r9 = 0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L41
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
        L37:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3c
            r11 = 0
        L3c:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L41:
            r10 = 0
            goto L37
        L43:
            r8 = 0
            goto L30
        L45:
            r3 = r14
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHY.<init>(java.lang.String, java.lang.String, int, int, int, boolean, boolean, int):void");
    }

    public UHY(String title, String message, int i, int i2, int i3, boolean z, boolean z2, View view, Boolean bool, boolean z3) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(message, "message");
        this.LIZ = title;
        this.LIZIZ = message;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = view;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = z3;
    }
}
