package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6R1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6R1 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Boolean LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;
    public final int LJII;
    public final C29901Fi<C76800UCe> LJIIIIZZ;

    public C6R1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6R1)) {
            return false;
        }
        C6R1 c6r1 = (C6R1) obj;
        return this.LIZ == c6r1.LIZ && this.LIZIZ == c6r1.LIZIZ && this.LIZJ == c6r1.LIZJ && o.LJ(this.LIZLLL, c6r1.LIZLLL) && Float.compare(this.LJ, c6r1.LJ) == 0 && Float.compare(this.LJFF, c6r1.LJFF) == 0 && this.LJI == c6r1.LJI && this.LJII == c6r1.LJII && o.LJ(this.LJIIIIZZ, c6r1.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerDurationEditModel(stickerId=");
        LIZ.append(this.LIZ);
        LIZ.append(", visible=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enable=");
        LIZ.append(this.LIZJ);
        LIZ.append(", playStatus=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", startTime=");
        LIZ.append(this.LJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", audioTrackVisible=");
        LIZ.append(this.LJI);
        LIZ.append(", audioTrackDuration=");
        LIZ.append(this.LJII);
        LIZ.append(", durationChangedEndEvent=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LIZJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        Boolean bool = this.LIZLLL;
        int i7 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, (i6 + hashCode) * 31, 31), 31);
        if (!this.LJI) {
            i2 = 0;
        }
        int i8 = (((LIZIZ + i2) * 31) + this.LJII) * 31;
        C29901Fi<C76800UCe> c29901Fi = this.LJIIIIZZ;
        if (c29901Fi != null) {
            i7 = c29901Fi.hashCode();
        }
        return i8 + i7;
    }

    public /* synthetic */ C6R1(int i) {
        this(-1, false, false, null, 0.0f, 0.0f, false, 0, null);
    }

    public C6R1(int i, boolean z, boolean z2, Boolean bool, float f, float f2, boolean z3, int i2, C29901Fi<C76800UCe> c29901Fi) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = bool;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = z3;
        this.LJII = i2;
        this.LJIIIIZZ = c29901Fi;
    }

    public static C6R1 LIZ(C6R1 c6r1, int i, boolean z, boolean z2, Boolean bool, float f, float f2, boolean z3, int i2, int i3) {
        C29901Fi<C76800UCe> c29901Fi;
        int i4 = i2;
        boolean z4 = z3;
        boolean z5 = z;
        int i5 = i;
        boolean z6 = z2;
        Boolean bool2 = bool;
        float f3 = f;
        float f4 = f2;
        if ((i3 & 1) != 0) {
            i5 = c6r1.LIZ;
        }
        if ((i3 & 2) != 0) {
            z5 = c6r1.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z6 = c6r1.LIZJ;
        }
        if ((i3 & 8) != 0) {
            bool2 = c6r1.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            f3 = c6r1.LJ;
        }
        if ((i3 & 32) != 0) {
            f4 = c6r1.LJFF;
        }
        if ((i3 & 64) != 0) {
            z4 = c6r1.LJI;
        }
        if ((i3 & 128) != 0) {
            i4 = c6r1.LJII;
        }
        if ((i3 & 256) != 0) {
            c29901Fi = c6r1.LJIIIIZZ;
        } else {
            c29901Fi = null;
        }
        c6r1.getClass();
        return new C6R1(i5, z5, z6, bool2, f3, f4, z4, i4, c29901Fi);
    }
}
