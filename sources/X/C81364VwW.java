package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VwW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81364VwW extends Animation {
    public final /* synthetic */ C81362VwU LJLIL;
    public final /* synthetic */ C81360VwS LJLILLLLZI;

    public C81364VwW(C81360VwS c81360VwS, C81362VwU c81362VwU) {
        this.LJLILLLLZI = c81360VwS;
        this.LJLIL = c81362VwU;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        if (this.LJLILLLLZI.LJLL) {
            C81362VwU c81362VwU = this.LJLIL;
            C81360VwS.LIZIZ(f, c81362VwU);
            float floor = (float) (Math.floor(c81362VwU.LJIILIIL / 0.8f) + 1.0d);
            float radians = (float) Math.toRadians(c81362VwU.LJII / (c81362VwU.LJIIZILJ * 6.283185307179586d));
            float f2 = c81362VwU.LJIIJJI;
            c81362VwU.LJ = (((c81362VwU.LJIIL - radians) - f2) * f) + f2;
            c81362VwU.LIZ();
            c81362VwU.LJFF = c81362VwU.LJIIL;
            c81362VwU.LIZ();
            float f3 = c81362VwU.LJIILIIL;
            c81362VwU.LJI = C06420Na.LIZIZ(floor, f3, f, f3);
            c81362VwU.LIZ();
            return;
        }
        float radians2 = (float) Math.toRadians(r1.LJII / (this.LJLIL.LJIIZILJ * 6.283185307179586d));
        C81362VwU c81362VwU2 = this.LJLIL;
        float f4 = c81362VwU2.LJIIL;
        float f5 = c81362VwU2.LJIIJJI;
        float f6 = c81362VwU2.LJIILIIL;
        this.LJLILLLLZI.getClass();
        C81360VwS.LIZIZ(f, c81362VwU2);
        if (f <= 0.5f) {
            float interpolation = C81360VwS.LJLLILLLL.getInterpolation(f / 0.5f);
            C81362VwU c81362VwU3 = this.LJLIL;
            c81362VwU3.LJ = (interpolation * (0.8f - radians2)) + f5;
            c81362VwU3.LIZ();
        }
        if (f > 0.5f) {
            float interpolation2 = C81360VwS.LJLLILLLL.getInterpolation((f - 0.5f) / 0.5f);
            C81362VwU c81362VwU4 = this.LJLIL;
            c81362VwU4.LJFF = (interpolation2 * (0.8f - radians2)) + f4;
            c81362VwU4.LIZ();
        }
        C81362VwU c81362VwU5 = this.LJLIL;
        c81362VwU5.LJI = (0.25f * f) + f6;
        c81362VwU5.LIZ();
        C81360VwS c81360VwS = this.LJLILLLLZI;
        c81360VwS.LJLJI = C43881HKb.LIZ(c81360VwS.LJLJL, 5.0f, 1080.0f, f * 216.0f);
        c81360VwS.invalidateSelf();
    }
}
