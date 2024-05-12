package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.1C9, reason: invalid class name */
/* loaded from: classes.dex */
public class C1C9 extends C0AB {
    public PointF LJIIIZ;
    public final DisplayMetrics LJIIJ;
    public float LJIIL;
    public final LinearInterpolator LJII = new LinearInterpolator();
    public final DecelerateInterpolator LJIIIIZZ = new DecelerateInterpolator();
    public boolean LJIIJJI = false;
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;

    @Override // X.C0AB
    public final void LIZLLL() {
    }

    @Override // X.C0AB
    public void LJ() {
        this.LJIILJJIL = 0;
        this.LJIILIIL = 0;
        this.LJIIIZ = null;
    }

    public int LJIILIIL() {
        PointF pointF = this.LJIIIZ;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    public int LJIILJJIL() {
        PointF pointF = this.LJIIIZ;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    public C1C9(Context context) {
        this.LJIIJ = context.getResources().getDisplayMetrics();
    }

    public float LJIIJ(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int LJIIJJI(int i) {
        return (int) Math.ceil(LJIIL(i) / 0.3356d);
    }

    public int LJIIL(int i) {
        float abs = Math.abs(i);
        if (!this.LJIIJJI) {
            this.LJIIL = LJIIJ(this.LJIIJ);
            this.LJIIJJI = true;
        }
        return (int) Math.ceil(abs * this.LJIIL);
    }

    public int LJIIIIZZ(int i, View view) {
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return LJII(c0a2.LJJJJJ(view) - marginLayoutParams.leftMargin, c0a2.LJJJJLI(view) + marginLayoutParams.rightMargin, c0a2.getPaddingLeft(), c0a2.LJLLLL - c0a2.getPaddingRight(), i);
    }

    public int LJIIIZ(int i, View view) {
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 == null || !c0a2.LJIL()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return LJII(c0a2.LJJJJLL(view) - marginLayoutParams.topMargin, c0a2.LJJJJIZL(view) + marginLayoutParams.bottomMargin, c0a2.getPaddingTop(), c0a2.LJLLLLLL - c0a2.getPaddingBottom(), i);
    }

    @Override // X.C0AB
    public final void LIZJ(int i, int i2, C0A9 c0a9) {
        if (this.LIZIZ.LJLLJ.LJJJI() == 0) {
            LJI();
            return;
        }
        int i3 = this.LJIILIIL;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.LJIILIIL = i4;
        int i6 = this.LJIILJJIL;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.LJIILJJIL = i5;
        if (i4 == 0 && i5 == 0) {
            PointF LIZ = LIZ(this.LIZ);
            if (LIZ != null) {
                if (LIZ.x != 0.0f || LIZ.y != 0.0f) {
                    float f = LIZ.y;
                    float sqrt = (float) Math.sqrt((f * f) + (r2 * r2));
                    float f2 = LIZ.x / sqrt;
                    LIZ.x = f2;
                    float f3 = LIZ.y / sqrt;
                    LIZ.y = f3;
                    this.LJIIIZ = LIZ;
                    this.LJIILIIL = (int) (f2 * 10000.0f);
                    this.LJIILJJIL = (int) (f3 * 10000.0f);
                    c0a9.LIZIZ((int) (this.LJIILIIL * 1.2f), (int) (this.LJIILJJIL * 1.2f), (int) (LJIIL(10000) * 1.2f), this.LJII);
                    return;
                }
            }
            c0a9.LIZLLL = this.LIZ;
            LJI();
        }
    }

    @Override // X.C0AB
    public void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
        int LJIIIIZZ = LJIIIIZZ(LJIILIIL(), view);
        int LJIIIZ = LJIIIZ(LJIILJJIL(), view);
        int LJIIJJI = LJIIJJI((int) Math.sqrt((LJIIIZ * LJIIIZ) + (LJIIIIZZ * LJIIIIZZ)));
        if (LJIIJJI > 0) {
            c0a9.LIZIZ(-LJIIIIZZ, -LJIIIZ, LJIIJJI, this.LJIIIIZZ);
        }
    }

    public int LJII(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }
}
