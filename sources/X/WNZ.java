package X;

import android.view.View;

/* loaded from: classes15.dex */
public class WNZ {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f = this.LIZ;
        int i8 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i9 = i * 31;
        float f2 = this.LIZIZ;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        float f3 = this.LIZJ;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        float f4 = this.LIZLLL;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        float f5 = this.LJ;
        if (f5 != 0.0f) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        float f6 = this.LJFF;
        if (f6 != 0.0f) {
            i6 = Float.floatToIntBits(f6);
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        float f7 = this.LJI;
        if (f7 != 0.0f) {
            i7 = Float.floatToIntBits(f7);
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        float f8 = this.LJII;
        if (f8 != 0.0f) {
            i8 = Float.floatToIntBits(f8);
        }
        return i15 + i8;
    }

    public WNZ(View view) {
        this.LIZ = view.getTranslationX();
        this.LIZIZ = view.getTranslationY();
        this.LIZJ = C16360ka.LJIIJJI(view);
        this.LIZLLL = view.getScaleX();
        this.LJ = view.getScaleY();
        this.LJFF = view.getRotationX();
        this.LJI = view.getRotationY();
        this.LJII = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WNZ)) {
            return false;
        }
        WNZ wnz = (WNZ) obj;
        if (wnz.LIZ != this.LIZ || wnz.LIZIZ != this.LIZIZ || wnz.LIZJ != this.LIZJ || wnz.LIZLLL != this.LIZLLL || wnz.LJ != this.LJ || wnz.LJFF != this.LJFF || wnz.LJI != this.LJI || wnz.LJII != this.LJII) {
            return false;
        }
        return true;
    }
}
