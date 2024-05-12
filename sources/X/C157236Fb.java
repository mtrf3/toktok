package X;

import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157236Fb implements C6FB {
    public static final C157236Fb LIZ = new C157236Fb();
    public static final Keva LIZIZ;
    public static final Application LIZJ;
    public static final C62822Ol8 LIZLLL;

    @Override // X.C6FB
    public final synchronized int LIZLLL() {
        return LIZIZ.getInt("key_navibar_height", -1);
    }

    public final int LJIIIIZZ() {
        if (-1 == LIZLLL()) {
            LIZJ(((Number) LIZLLL.getValue()).intValue());
        }
        return LJFF();
    }

    public final synchronized int LJIIIZ() {
        return LIZIZ.getInt("key_adapt_plan", 0);
    }

    static {
        Keva repo = Keva.getRepo("screen_adapt_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_SCREEN_ADAPT_REPO)");
        LIZIZ = repo;
        LIZJ = C60903NvH.LJ;
        LIZLLL = C221108m2.LIZIZ(C157256Fd.LJLIL);
    }

    @Override // X.C6FB
    public final int LIZ() {
        int LJFF = C81184Vtc.LJFF(LIZJ);
        int LJIIIZ = LJIIIZ();
        if (LJIIIZ != 1 && LJIIIZ != 6 && LJIIIZ != 3 && LJIIIZ != 4) {
            return 0;
        }
        return LJFF;
    }

    @Override // X.C6FB
    public final boolean LIZIZ() {
        if (LJIIIZ() == 1 || LJIIIZ() == 3 || LJIIIZ() == 4 || LJIIIZ() == 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    @Override // X.C6FB
    public final int LJFF() {
        int LJI = LJI();
        Application application = LIZJ;
        int LJFF = C81184Vtc.LJFF(application);
        int LIZIZ2 = C81184Vtc.LIZIZ(application);
        switch (LJIIIZ()) {
            case 1:
                LIZIZ2 -= LJFF;
                return LIZIZ2 - LJI;
            case 2:
                return LIZIZ2 - LJI;
            case 3:
                return LIZIZ2 - LJFF;
            case 4:
                LIZIZ2 -= LIZLLL();
                LIZIZ2 -= LJFF;
                return LIZIZ2 - LJI;
            case 5:
                LIZIZ2 -= LIZLLL();
                return LIZIZ2 - LJI;
            case 6:
                LIZIZ2 -= LIZLLL();
                return LIZIZ2 - LJFF;
            case 7:
                if (LIZIZ2 * 9 <= C81184Vtc.LJ(application) * 16) {
                    return LIZIZ2;
                }
                LJI = LIZLLL();
                return LIZIZ2 - LJI;
            default:
                return LIZIZ2;
        }
    }

    @Override // X.C6FB
    public final int LJI() {
        if (AnonymousClass668.LIZ()) {
            return LIZJ.getResources().getDimensionPixelSize(R.dimen.i7);
        }
        return LIZJ.getResources().getDimensionPixelSize(R.dimen.i6);
    }

    @Override // X.C6FB
    public final int getBottomMargin() {
        int LJI = LJI();
        int LJIIIZ = LJIIIZ();
        if (LJIIIZ != 1 && LJIIIZ != 2) {
            if (LJIIIZ != 4 && LJIIIZ != 5) {
                if (LJIIIZ != 6 && LJIIIZ != 7) {
                    return 0;
                }
                return LIZLLL();
            }
            return LJI + LIZLLL();
        }
        return LJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r3 < r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r3 < r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        r2 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r6 <= r1) goto L34;
     */
    @Override // X.C6FB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            android.app.Application r0 = X.C157236Fb.LIZJ     // Catch: java.lang.Throwable -> L96
            int r5 = X.C81184Vtc.LIZIZ(r0)     // Catch: java.lang.Throwable -> L96
            int r4 = X.C81184Vtc.LJ(r0)     // Catch: java.lang.Throwable -> L96
            int r3 = X.C81184Vtc.LJFF(r0)     // Catch: java.lang.Throwable -> L96
            int r7 = r8.LJI()     // Catch: java.lang.Throwable -> L96
            int r0 = r4 * 16
            int r6 = r0 / 9
            if (r9 != 0) goto L36
            int r1 = r5 - r3
            int r0 = r1 - r7
            if (r6 > r0) goto L21
            r2 = 1
            goto L55
        L21:
            if (r6 > r1) goto L2b
            int r0 = r5 - r7
            if (r6 > r0) goto L2b
            if (r3 >= r7) goto L32
        L29:
            r2 = 2
            goto L55
        L2b:
            int r0 = r5 - r7
            if (r6 > r0) goto L30
            goto L29
        L30:
            if (r6 > r1) goto L34
        L32:
            r2 = 3
            goto L55
        L34:
            r2 = 0
            goto L55
        L36:
            int r2 = r5 - r9
            if (r6 < r2) goto L3c
        L3a:
            r2 = 7
            goto L55
        L3c:
            int r1 = r2 - r3
            int r0 = r1 - r7
            if (r6 > r0) goto L44
            r2 = 4
            goto L55
        L44:
            if (r6 > r1) goto L4e
            int r0 = r2 - r7
            if (r6 > r0) goto L4e
            if (r3 >= r7) goto L54
        L4c:
            r2 = 5
            goto L55
        L4e:
            int r2 = r2 - r7
            if (r6 > r2) goto L52
            goto L4c
        L52:
            if (r6 > r1) goto L3a
        L54:
            r2 = 6
        L55:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "FullScreen plan="
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            r1.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = ",screenHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            r1.append(r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = ",screenWidth="
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            r1.append(r4)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = ",statusBarHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            r1.append(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = ",naviBarHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            r1.append(r9)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L96
            X.H78.LIZ(r0)     // Catch: java.lang.Throwable -> L96
            com.bytedance.keva.Keva r1 = X.C157236Fb.LIZIZ     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "key_adapt_plan"
            r1.storeInt(r0, r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "key_navibar_height"
            r1.storeInt(r0, r9)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r8)
            return
        L96:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157236Fb.LIZJ(int):void");
    }

    @Override // X.C6FB
    public final FrameLayout.LayoutParams LJ(int i, int i2) {
        int i3;
        Application application = LIZJ;
        int LIZIZ2 = C81184Vtc.LIZIZ(application);
        int LJ = C81184Vtc.LJ(application);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LIZIZ2 * 9 > LJ * 16) {
            i3 = LIZ();
            LIZIZ2 = LJFF();
        } else {
            i3 = 0;
        }
        if (C141525gy.LIZ(i, i2)) {
            layoutParams.height = LIZIZ2;
            layoutParams.topMargin = i3;
            layoutParams.width = (LIZIZ2 * i) / i2;
            layoutParams.leftMargin = (C81184Vtc.LJ(application) - layoutParams.width) / 2;
        } else {
            layoutParams.width = LJ;
            int i4 = (LJ * i2) / i;
            layoutParams.height = i4;
            int LIZJ2 = AnonymousClass030.LIZJ(LIZIZ2, i4, 2, i3);
            layoutParams.topMargin = LIZJ2;
            if (LIZJ2 < 0) {
                LIZJ2 = 0;
            }
            layoutParams.topMargin = LIZJ2;
            layoutParams.leftMargin = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ScreenSizeCompat: surfaceView height:");
        LIZ2.append(layoutParams.height);
        LIZ2.append(", width:");
        LIZ2.append(layoutParams.width);
        LIZ2.append(",plan=");
        LIZ2.append(LJIIIZ());
        LIZ2.append(" videoWidth：");
        C15890jp.LIZIZ(LIZ2, i, " x ", i2, ", topMargin=");
        LIZ2.append(layoutParams.topMargin);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        layoutParams.setMarginStart(layoutParams.leftMargin);
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
