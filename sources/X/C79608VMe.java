package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VMe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79608VMe {
    public final float LIZ;
    public final float LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C79608VMe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79608VMe) {
                C79608VMe c79608VMe = (C79608VMe) obj;
                if (Float.compare(this.LIZ, c79608VMe.LIZ) != 0 || Float.compare(this.LIZIZ, c79608VMe.LIZIZ) != 0 || !o.LJ(this.LIZJ, c79608VMe.LIZJ) || this.LIZLLL != c79608VMe.LIZLLL || this.LJ != c79608VMe.LJ || this.LJFF != c79608VMe.LJFF) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((LIZIZ + i) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckResult(effectiveAreaRatio=");
        LIZ.append(this.LIZ);
        LIZ.append(", maxBlankAreaRatio=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", blankBitmap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", blankBitmapWidth=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", blankBitmapHeight=");
        LIZ.append(this.LJ);
        LIZ.append(", validViewCount=");
        return C08380Uo.LIZ(LIZ, this.LJFF, ")", LIZ);
    }

    public /* synthetic */ C79608VMe(int i) {
        this(0.0f, 0, 0, "", 0, 0.0f);
    }

    public C79608VMe(float f, int i, int i2, String blankBitmap, int i3, float f2) {
        o.LJIIJ(blankBitmap, "blankBitmap");
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = blankBitmap;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
