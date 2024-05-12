package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VwV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81363VwV extends Animation {
    public final /* synthetic */ C81361VwT LJLIL;
    public final /* synthetic */ C81359VwR LJLILLLLZI;

    public C81363VwV(C81359VwR c81359VwR, C81361VwT c81361VwT) {
        this.LJLILLLLZI = c81359VwR;
        this.LJLIL = c81361VwT;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        if (this.LJLILLLLZI.LJLL) {
            C81361VwT c81361VwT = this.LJLIL;
            C81359VwR.LIZIZ(f, c81361VwT);
            float floor = (float) (Math.floor(c81361VwT.LJIILIIL / 0.8f) + 1.0d);
            float radians = (float) Math.toRadians(c81361VwT.LJII / (c81361VwT.LJIIZILJ * 6.283185307179586d));
            float f2 = c81361VwT.LJIIJJI;
            c81361VwT.LJ = (((c81361VwT.LJIIL - radians) - f2) * f) + f2;
            c81361VwT.LIZ();
            c81361VwT.LJFF = c81361VwT.LJIIL;
            c81361VwT.LIZ();
            float f3 = c81361VwT.LJIILIIL;
            c81361VwT.LJI = C06420Na.LIZIZ(floor, f3, f, f3);
            c81361VwT.LIZ();
            return;
        }
        float radians2 = (float) Math.toRadians(r1.LJII / (this.LJLIL.LJIIZILJ * 6.283185307179586d));
        C81361VwT c81361VwT2 = this.LJLIL;
        float f4 = c81361VwT2.LJIIL;
        float f5 = c81361VwT2.LJIIJJI;
        float f6 = c81361VwT2.LJIILIIL;
        this.LJLILLLLZI.getClass();
        C81359VwR.LIZIZ(f, c81361VwT2);
        if (f <= 0.5f) {
            float interpolation = C81359VwR.LJLLILLLL.getInterpolation(f / 0.5f);
            C81361VwT c81361VwT3 = this.LJLIL;
            c81361VwT3.LJ = (interpolation * (0.8f - radians2)) + f5;
            c81361VwT3.LIZ();
        }
        if (f > 0.5f) {
            float interpolation2 = C81359VwR.LJLLILLLL.getInterpolation((f - 0.5f) / 0.5f);
            C81361VwT c81361VwT4 = this.LJLIL;
            c81361VwT4.LJFF = (interpolation2 * (0.8f - radians2)) + f4;
            c81361VwT4.LIZ();
        }
        C81361VwT c81361VwT5 = this.LJLIL;
        c81361VwT5.LJI = (0.25f * f) + f6;
        c81361VwT5.LIZ();
        C81359VwR c81359VwR = this.LJLILLLLZI;
        c81359VwR.LJLJI = C43881HKb.LIZ(c81359VwR.LJLJL, 5.0f, 1080.0f, f * 216.0f);
        c81359VwR.invalidateSelf();
    }
}
