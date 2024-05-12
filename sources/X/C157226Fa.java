package X;

import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157226Fa implements C6FB {
    public static final C157226Fa LIZ = new C157226Fa();
    public static final Keva LIZIZ;
    public static final Application LIZJ;

    public static boolean LJIIJJI(int i, int i2, int i3, int i4) {
        return i * i4 <= i2 * i3;
    }

    @Override // X.C6FB
    public final synchronized int LIZLLL() {
        return LIZIZ.getInt("key_navibar_height", -1);
    }

    public final int LJIIIIZZ() {
        int i;
        synchronized (this) {
            i = LIZIZ.getInt("key_adapt_plan", 0);
        }
        return i;
    }

    static {
        Keva repo = Keva.getRepo("screen_adpat_plan_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_SCREEN_ADAPT_PLAN_REPO)");
        LIZIZ = repo;
        LIZJ = C60903NvH.LJ;
    }

    @Override // X.C6FB
    public final int LIZ() {
        int i = LIZIZ.getInt("key_margin_top", -1);
        if (i < 0) {
            H78.LIZJ("NewAVScreenAdaptPresenter: getTopMargin failed");
            return 0;
        }
        return i;
    }

    @Override // X.C6FB
    public final int LJFF() {
        int i = LIZIZ.getInt("key_display_height", 0);
        if (i <= 0) {
            H78.LIZJ("NewAVScreenAdaptPresenter: getDisplayHeight failed");
            return LJIIIZ();
        }
        return i;
    }

    @Override // X.C6FB
    public final int LJI() {
        return LIZJ.getResources().getDimensionPixelSize(R.dimen.i7);
    }

    public final int LJIIJ() {
        int LJFF = C81184Vtc.LJFF(LIZJ);
        if (LJIIL()) {
            return LJFF;
        }
        return 0;
    }

    public final boolean LJIIL() {
        return C157246Fc.LIZ.contains(Integer.valueOf(LJIIIIZZ()));
    }

    public final boolean LJIILIIL() {
        return C157246Fc.LIZIZ.contains(Integer.valueOf(LJIIIIZZ()));
    }

    @Override // X.C6FB
    public final int getBottomMargin() {
        int i = LIZIZ.getInt("key_margin_bottom", -1);
        if (i < 0) {
            H78.LIZJ("NewAVScreenAdaptPresenter: getBottomMargin failed");
            return 0;
        }
        return i;
    }

    @Override // X.C6FB
    public final boolean LIZIZ() {
        return LJIIL();
    }

    public final int LJIIIZ() {
        int LJI = LJI();
        Application application = LIZJ;
        int LJFF = C81184Vtc.LJFF(application);
        int LIZIZ2 = C81184Vtc.LIZIZ(application) - LIZLLL();
        if (LJIIL()) {
            LIZIZ2 -= LJFF;
        }
        if (LJIILIIL()) {
            return LIZIZ2 - LJI;
        }
        return LIZIZ2;
    }

    @Override // X.C6FB
    public final synchronized void LIZJ(int i) {
        Application application = LIZJ;
        int LIZIZ2 = C81184Vtc.LIZIZ(application);
        int LJ = C81184Vtc.LJ(application);
        int LJFF = C81184Vtc.LJFF(application);
        int LJI = LJI();
        int i2 = 9;
        if (!LJIIJJI(LIZIZ2, LJ, 16, 9)) {
            int i3 = LIZIZ2 * 9;
            if (i3 < LJ * 19) {
                if (i > 0) {
                    int i4 = LIZIZ2 - i;
                    if (!LJIIJJI(i4, LJ, 16, 9)) {
                        if (LJIIJJI(i4 - LJI, LJ, 16, 9)) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    }
                } else if (!LJIIJJI((LIZIZ2 - LJFF) - LJI, LJ, 16, 9)) {
                    i2 = 5;
                }
            }
            if (i3 < LJ * 20) {
                if (i > 0) {
                    if (LJIIJJI(((LIZIZ2 - LJFF) - LJI) - i, LJ, 16, 9)) {
                        if (r1 * 9 <= LJ * 15.8d) {
                            i2 = 8;
                        }
                    } else {
                        i2 = 7;
                    }
                } else {
                    i2 = 6;
                }
            } else if (LIZLLL() > 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            Keva keva = LIZIZ;
            keva.storeInt("key_adapt_plan", i2);
            keva.storeInt("key_navibar_height", i);
            keva.storeInt("key_full_screen_width", LJ);
            keva.storeInt("key_full_screen_height", LIZIZ2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NewAVScreenAdaptPresenter-calculateAdaptPlan: FullScreen plan=");
            LIZ2.append(i2);
            LIZ2.append(",isStatusBarWithBlackBg=");
            LIZ2.append(LJIIL());
            LIZ2.append(",isTabBarWithBlackBg=");
            LIZ2.append(LJIILIIL());
            LIZ2.append(",screenHeight=");
            LIZ2.append(LIZIZ2);
            LIZ2.append(",screenWidth=");
            LIZ2.append(LJ);
            LIZ2.append(",statusBarHeight=");
            LIZ2.append(LJFF);
            LIZ2.append(",naviBarHeight=");
            LIZ2.append(i);
            LIZ2.append(",bottomBarHeight=");
            LIZ2.append(LJI());
            H78.LIZ(X1D.LIZIZ(LIZ2));
        }
        i2 = 0;
        Keva keva2 = LIZIZ;
        keva2.storeInt("key_adapt_plan", i2);
        keva2.storeInt("key_navibar_height", i);
        keva2.storeInt("key_full_screen_width", LJ);
        keva2.storeInt("key_full_screen_height", LIZIZ2);
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("NewAVScreenAdaptPresenter-calculateAdaptPlan: FullScreen plan=");
        LIZ22.append(i2);
        LIZ22.append(",isStatusBarWithBlackBg=");
        LIZ22.append(LJIIL());
        LIZ22.append(",isTabBarWithBlackBg=");
        LIZ22.append(LJIILIIL());
        LIZ22.append(",screenHeight=");
        LIZ22.append(LIZIZ2);
        LIZ22.append(",screenWidth=");
        LIZ22.append(LJ);
        LIZ22.append(",statusBarHeight=");
        LIZ22.append(LJFF);
        LIZ22.append(",naviBarHeight=");
        LIZ22.append(i);
        LIZ22.append(",bottomBarHeight=");
        LIZ22.append(LJI());
        H78.LIZ(X1D.LIZIZ(LIZ22));
    }

    public final void LJIILJJIL(int i) {
        Keva keva = LIZIZ;
        int i2 = keva.getInt("key_full_screen_width", -1);
        int i3 = keva.getInt("key_full_screen_height", -1);
        Application application = LIZJ;
        int LIZIZ2 = C81184Vtc.LIZIZ(application);
        int LJ = C81184Vtc.LJ(application);
        if (i != LIZLLL() || LIZIZ2 != i3 || LJ != i2) {
            StringBuilder LIZJ2 = C06460Ne.LIZJ("NewAVScreenAdaptPresenter-recalculatePlanIfNeeded: recalculate plan,naviheight:", i, " new width:", LJ, " new height:");
            LIZJ2.append(LIZIZ2);
            H78.LIZ(X1D.LIZIZ(LIZJ2));
            AnonymousClass668.LIZIZ().LIZJ(i);
        }
    }

    @Override // X.C6FB
    public final FrameLayout.LayoutParams LJ(int i, int i2) {
        int ceil;
        int i3;
        int LIZJ2;
        Application application = LIZJ;
        int LIZIZ2 = C81184Vtc.LIZIZ(application);
        int LJIIIZ = LJIIIZ();
        int LJ = C81184Vtc.LJ(application);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NewAVScreenAdaptPresenter-available w:");
        LIZ2.append(LJ);
        LIZ2.append(" h");
        LIZ2.append(LJIIIZ);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LJIIJJI(LJIIIZ, LJ, i2, i)) {
            i3 = (int) Math.ceil(((LJIIIZ * 1.0f) * i) / i2);
            ceil = LJIIIZ;
        } else {
            ceil = (int) Math.ceil(((LJ * 1.0f) * i2) / i);
            i3 = LJ;
        }
        layoutParams.height = ceil;
        layoutParams.width = i3;
        if (LJIILIIL() && !LJIIL() && LJIIIIZZ() != 9) {
            LIZJ2 = 0;
        } else if ((!LJIILIIL() && LJIIL()) || LJIIIIZZ() == 9) {
            LIZJ2 = (LJIIJ() + LJIIIZ) - ceil;
        } else {
            LIZJ2 = AnonymousClass030.LIZJ(LJIIIZ, ceil, 2, LJIIJ());
        }
        layoutParams.topMargin = LIZJ2;
        int i4 = (LJ - i3) / 2;
        layoutParams.leftMargin = i4;
        layoutParams.setMarginStart(i4);
        Keva keva = LIZIZ;
        keva.storeInt("key_display_height", ceil);
        keva.storeInt("key_display_width", i3);
        keva.storeInt("key_margin_top", layoutParams.topMargin);
        keva.storeInt("key_margin_bottom", (LIZIZ2 - layoutParams.topMargin) - ceil);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("NewAVScreenAdaptPresenter-resetSurfaceSize: surfaceView height:");
        LIZ3.append(layoutParams.height);
        LIZ3.append(", width:");
        LIZ3.append(layoutParams.width);
        LIZ3.append(",plan=");
        LIZ3.append(LJIIIIZZ());
        LIZ3.append(" videoWidth：");
        C15890jp.LIZIZ(LIZ3, i, " x ", i2, ", topMargin=");
        LIZ3.append(layoutParams.topMargin);
        LIZ3.append(",, bottomMargin=");
        LIZ3.append((LIZIZ2 - layoutParams.topMargin) - ceil);
        LIZ3.append("marginleft:");
        LIZ3.append(layoutParams.leftMargin);
        H78.LIZ(X1D.LIZIZ(LIZ3));
        return layoutParams;
    }

    @Override // X.C6FB
    public final void LJII(int i, int i2, View view) {
        if (view == null || i == 0 || i2 == 0) {
            return;
        }
        view.setLayoutParams(LJ(i, i2));
    }
}
