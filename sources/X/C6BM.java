package X;

import android.graphics.PointF;

/* renamed from: X.6BM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BM implements C6BR {
    public final /* synthetic */ C6BL LIZ;

    public C6BM(C6BL c6bl) {
        this.LIZ = c6bl;
    }

    public final void LJ(boolean z) {
        C6BO c6bo = this.LIZ.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJFF(z);
            if (z) {
                this.LIZ.LJFF();
            }
        }
    }

    public final boolean LIZ(float f, float f2) {
        C6BL c6bl = this.LIZ;
        AnonymousClass671 anonymousClass671 = c6bl.LJLLJ;
        if (anonymousClass671 != null) {
            return anonymousClass671.LJII(c6bl.LJLL.getFourAnglePoint(), f, f2);
        }
        return true;
    }

    public final boolean LIZJ(C156426By c156426By, boolean z) {
        boolean z2;
        C156426By c156426By2;
        C6BL c6bl = this.LIZ;
        c6bl.LJLL = c156426By;
        boolean z3 = false;
        if (c156426By != null) {
            if (z && !c6bl.LLFZ) {
                c156426By.setAlpha(1.0f);
            }
            if (z) {
                c6bl.LJLZ = true;
            } else if (c6bl.LJLZ) {
                c6bl.LJFF();
                c6bl.LJLZ = false;
            }
            boolean LJIIIZ = C1E4.LJIIIZ(c6bl.LJLJJL, c156426By.getFourAnglePoint());
            PointF centerViewPoint = c6bl.LJLL.getCenterViewPoint();
            if (c6bl.LJLJJI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 & (!c6bl.LJIJJLI())) {
                int LJLILLLLZI = c6bl.LJLJJI.LJLILLLLZI((int) (centerViewPoint.x + c6bl.LJLJJLL), (int) (centerViewPoint.y + c6bl.LJLJL), z, LJIIIZ);
                C156426By c156426By3 = c6bl.LJLL;
                if (LJLILLLLZI == 1) {
                    c6bl.LLFZ = true;
                    c156426By3.setAlpha(0.3137255f);
                } else if (LJLILLLLZI == 3) {
                    c6bl.LLFZ = false;
                    z3 = c6bl.LJJIII(c156426By3);
                } else if (LJLILLLLZI == 4 || LJLILLLLZI == 2) {
                    c6bl.LLFZ = false;
                    c156426By3.setAlpha(1.0f);
                }
            }
            if (c6bl.LJLJJI != null && (c156426By2 = c6bl.LJLL) != null && !c6bl.LLFZ) {
                c156426By2.setAlpha(1.0f);
            }
            C6BO c6bo = c6bl.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LJ(z);
            }
        }
        return z3;
    }

    public final PointF LIZIZ(float f, float f2, boolean z) {
        C156426By c156426By;
        C6BL c6bl = this.LIZ;
        if (c6bl.LJLLJ != null && (c156426By = c6bl.LJLL) != null) {
            PointF[] fourAnglePoint = c156426By.getFourAnglePoint();
            for (PointF pointF : fourAnglePoint) {
                pointF.x += f;
                pointF.y += f2;
            }
            return this.LIZ.LJLLJ.LIZLLL(fourAnglePoint, f, f2);
        }
        return new PointF(0.0f, 0.0f);
    }

    public final int LIZLLL(boolean z, boolean z2, boolean z3, boolean z4) {
        C6BL c6bl = this.LIZ;
        AnonymousClass671 anonymousClass671 = c6bl.LJLLJ;
        if (anonymousClass671 != null) {
            if (z) {
                anonymousClass671.LJIIJJI();
                return -1;
            }
            C156426By c156426By = c6bl.LJLL;
            if (c156426By == null) {
                return -1;
            }
            return anonymousClass671.LJFF(c156426By.getFourAnglePoint(), z2, z3, z4, z3, z3);
        }
        return -1;
    }
}
