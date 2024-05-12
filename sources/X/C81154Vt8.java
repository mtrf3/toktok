package X;

import com.bytedance.fly_main_color.FlyMainColor;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Vt8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81154Vt8 {
    public final int LIZ;
    public final int[] LIZIZ;
    public final int[] LIZJ;
    public int LIZLLL;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJJI;
    public final int[] LJ = new int[16];
    public final int[] LJFF = new int[16];
    public final int[] LJI = new int[16];
    public float LJII = 4.0f;
    public float LJIIJ = 0.4f;
    public float LJIIL = 1.0f;
    public float LJIILIIL = 1.0f;

    public final int[] LIZ() {
        int[] copyOf = Arrays.copyOf(this.LJ, Math.max(0, this.LIZLLL));
        o.LJIIIIZZ(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final int[] LIZIZ() {
        int[] copyOf = Arrays.copyOf(this.LJI, Math.max(0, this.LIZLLL));
        o.LJIIIIZZ(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final Integer LIZJ() {
        if (this.LIZLLL < 1) {
            return null;
        }
        return Integer.valueOf(this.LJ[0]);
    }

    public final Integer LIZLLL() {
        if (this.LIZLLL < 2) {
            return null;
        }
        return Integer.valueOf(this.LJ[1]);
    }

    public final void LJ() {
        C61898ORa.LJIJI(this.LIZIZ, this.LJ, 0, 14);
        C61898ORa.LJIJI(this.LIZJ, this.LJFF, 0, 14);
        int i = this.LIZ;
        this.LIZLLL = i;
        if (i > 0) {
            FlyMainColor.LIZ.getClass();
            this.LIZLLL = FlyMainColor.LIZJ(this);
        }
    }

    public final void LJI(float f) {
        this.LJII = f;
        LJ();
    }

    public final void LJII(float f) {
        this.LJIIIIZZ = f;
        LJ();
    }

    public C81154Vt8(int i, int[] iArr, int[] iArr2) {
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = iArr2;
        this.LIZLLL = i;
        LJ();
    }

    public final void LJFF(float f, float f2, float f3, float f4, float f5) {
        this.LJIIIZ = f;
        this.LJIIJ = f2;
        this.LJIIJJI = f3;
        this.LJIIL = f4;
        this.LJIILIIL = f5;
        LJ();
    }
}
