package X;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.0PA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PA {
    public final C0P9 LIZ;

    public final int LIZ() {
        return this.LIZ.LIZJ();
    }

    public C0PA(final WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ = new C0P9(windowInsetsAnimation) { // from class: X.1Ic
                public final WindowInsetsAnimation LJ;

                @Override // X.C0P9
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C0P9
                public final float LIZIZ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C0P9
                public final int LIZJ() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C0P9
                public final void LIZLLL(float f) {
                    this.LJ.setFraction(f);
                }
            };
        }
    }

    public final void LIZIZ(float f) {
        this.LIZ.LIZLLL(f);
    }

    public C0PA(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            final WindowInsetsAnimation windowInsetsAnimation = new WindowInsetsAnimation(i, interpolator, j);
            this.LIZ = new C0P9(windowInsetsAnimation) { // from class: X.1Ic
                public final WindowInsetsAnimation LJ;

                @Override // X.C0P9
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C0P9
                public final float LIZIZ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C0P9
                public final int LIZJ() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C0P9
                public final void LIZLLL(float f) {
                    this.LJ.setFraction(f);
                }
            };
        } else {
            this.LIZ = new C30611Ib(i, interpolator, j);
        }
    }
}
