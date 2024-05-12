package X;

import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WVI {
    public final C08630Vn<Float> LIZ;
    public final C08630Vn<Boolean> LIZIZ;
    public final C08630Vn<Boolean> LIZJ;
    public final C08630Vn<Boolean> LIZLLL;
    public final C08630Vn<ScaleGestureDetector> LJ;
    public final C08630Vn<Boolean> LJFF;
    public final C08630Vn<C76800UCe> LJI;
    public final C08630Vn<WXG> LJII;
    public final C08630Vn<Boolean> LJIIIIZZ;
    public final boolean LJIIIZ;

    public WVI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WVI)) {
            return false;
        }
        WVI wvi = (WVI) obj;
        return o.LJ(this.LIZ, wvi.LIZ) && o.LJ(this.LIZIZ, wvi.LIZIZ) && o.LJ(this.LIZJ, wvi.LIZJ) && o.LJ(this.LIZLLL, wvi.LIZLLL) && o.LJ(this.LJ, wvi.LJ) && o.LJ(this.LJFF, wvi.LJFF) && o.LJ(this.LJI, wvi.LJI) && o.LJ(this.LJII, wvi.LJII) && o.LJ(this.LJIIIIZZ, wvi.LJIIIIZZ) && this.LJIIIZ == wvi.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C08630Vn<Float> c08630Vn = this.LIZ;
        int hashCode = (c08630Vn == null ? 0 : c08630Vn.hashCode()) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LIZIZ;
        int hashCode2 = (hashCode + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (c08630Vn3 == null ? 0 : c08630Vn3.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (c08630Vn4 == null ? 0 : c08630Vn4.hashCode())) * 31;
        C08630Vn<ScaleGestureDetector> c08630Vn5 = this.LJ;
        int hashCode5 = (hashCode4 + (c08630Vn5 == null ? 0 : c08630Vn5.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn6 = this.LJFF;
        int hashCode6 = (hashCode5 + (c08630Vn6 == null ? 0 : c08630Vn6.hashCode())) * 31;
        C08630Vn<C76800UCe> c08630Vn7 = this.LJI;
        int hashCode7 = (hashCode6 + (c08630Vn7 == null ? 0 : c08630Vn7.hashCode())) * 31;
        C08630Vn<WXG> c08630Vn8 = this.LJII;
        int hashCode8 = (hashCode7 + (c08630Vn8 == null ? 0 : c08630Vn8.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn9 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (c08630Vn9 != null ? c08630Vn9.hashCode() : 0)) * 31;
        boolean z = this.LJIIIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsRecordStates(recordingProgress=");
        LIZ.append(this.LIZ);
        LIZ.append(", hideButton=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enabled=");
        LIZ.append(this.LIZJ);
        LIZ.append(", reset=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", scaleGestureDetector=");
        LIZ.append(this.LJ);
        LIZ.append(", showTooltip=");
        LIZ.append(this.LJFF);
        LIZ.append(", modifyDisplayView=");
        LIZ.append(this.LJI);
        LIZ.append(", onGestureListener=");
        LIZ.append(this.LJII);
        LIZ.append(", setRecordGestureEnabled=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", updateScaleAndPadding=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ WVI(int i) {
        this(null, null, null, null, null, null, null, null, null, false);
    }

    public WVI(C08630Vn<Float> c08630Vn, C08630Vn<Boolean> c08630Vn2, C08630Vn<Boolean> c08630Vn3, C08630Vn<Boolean> c08630Vn4, C08630Vn<ScaleGestureDetector> c08630Vn5, C08630Vn<Boolean> c08630Vn6, C08630Vn<C76800UCe> c08630Vn7, C08630Vn<WXG> c08630Vn8, C08630Vn<Boolean> c08630Vn9, boolean z) {
        this.LIZ = c08630Vn;
        this.LIZIZ = c08630Vn2;
        this.LIZJ = c08630Vn3;
        this.LIZLLL = c08630Vn4;
        this.LJ = c08630Vn5;
        this.LJFF = c08630Vn6;
        this.LJI = c08630Vn7;
        this.LJII = c08630Vn8;
        this.LJIIIIZZ = c08630Vn9;
        this.LJIIIZ = z;
    }

    public static WVI LIZ(WVI wvi, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, C08630Vn c08630Vn6, C08630Vn c08630Vn7, C08630Vn c08630Vn8, C08630Vn c08630Vn9, boolean z, int i) {
        boolean z2 = z;
        C08630Vn c08630Vn10 = c08630Vn9;
        C08630Vn c08630Vn11 = c08630Vn8;
        C08630Vn c08630Vn12 = c08630Vn7;
        C08630Vn c08630Vn13 = c08630Vn2;
        C08630Vn c08630Vn14 = c08630Vn;
        C08630Vn c08630Vn15 = c08630Vn3;
        C08630Vn c08630Vn16 = c08630Vn4;
        C08630Vn c08630Vn17 = c08630Vn5;
        C08630Vn c08630Vn18 = c08630Vn6;
        if ((i & 1) != 0) {
            c08630Vn14 = wvi.LIZ;
        }
        if ((i & 2) != 0) {
            c08630Vn13 = wvi.LIZIZ;
        }
        if ((i & 4) != 0) {
            c08630Vn15 = wvi.LIZJ;
        }
        if ((i & 8) != 0) {
            c08630Vn16 = wvi.LIZLLL;
        }
        if ((i & 16) != 0) {
            c08630Vn17 = wvi.LJ;
        }
        if ((i & 32) != 0) {
            c08630Vn18 = wvi.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn12 = wvi.LJI;
        }
        if ((i & 128) != 0) {
            c08630Vn11 = wvi.LJII;
        }
        if ((i & 256) != 0) {
            c08630Vn10 = wvi.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z2 = wvi.LJIIIZ;
        }
        wvi.getClass();
        return new WVI(c08630Vn14, c08630Vn13, c08630Vn15, c08630Vn16, c08630Vn17, c08630Vn18, c08630Vn12, c08630Vn11, c08630Vn10, z2);
    }
}
