package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.util.Arrays;

/* renamed from: X.VoK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80856VoK {
    public static final InterpolatorC61444O9o LJIJJLI = new InterpolatorC61444O9o();
    public int LIZ;
    public final int LIZIZ;
    public float[] LIZLLL;
    public float[] LJ;
    public float[] LJFF;
    public float[] LJI;
    public int[] LJII;
    public int[] LJIIIIZZ;
    public int[] LJIIIZ;
    public int LJIIJ;
    public VelocityTracker LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final int LJIILJJIL;
    public final OverScroller LJIILL;
    public final AbstractC80859VoN LJIILLIIL;
    public View LJIIZILJ;
    public boolean LJIJ;
    public final ViewGroup LJIJI;
    public int LIZJ = -1;
    public final ARunnableS50S0100000_14 LJIJJ = new ARunnableS50S0100000_14(this, 144);

    public final void LIZIZ() {
        this.LIZJ = -1;
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.LJ, 0.0f);
            Arrays.fill(this.LJFF, 0.0f);
            Arrays.fill(this.LJI, 0.0f);
            Arrays.fill(this.LJII, 0);
            Arrays.fill(this.LJIIIIZZ, 0);
            Arrays.fill(this.LJIIIZ, 0);
            this.LJIIJ = 0;
        }
        VelocityTracker velocityTracker = this.LJIIJJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJIIJJI = null;
        }
    }

    public final void LJIIJ() {
        this.LJIIJJI.computeCurrentVelocity(1000, this.LJIIL);
        float xVelocity = this.LJIIJJI.getXVelocity(this.LIZJ);
        int i = (Math.abs(xVelocity) > this.LJIILIIL ? 1 : (Math.abs(xVelocity) == this.LJIILIIL ? 0 : -1));
        float yVelocity = this.LJIIJJI.getYVelocity(this.LIZJ);
        float f = this.LJIILIIL;
        float f2 = this.LJIIL;
        float abs = Math.abs(yVelocity);
        if (abs < f) {
            yVelocity = 0.0f;
        } else if (abs > f2) {
            if (yVelocity > 0.0f) {
                yVelocity = f2;
            } else {
                yVelocity = -f2;
            }
        }
        LJII(yVelocity);
    }

    public final void LJFF(int i) {
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            int i2 = this.LJIIJ;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.LJ[i] = 0.0f;
                this.LJFF[i] = 0.0f;
                this.LJI[i] = 0.0f;
                this.LJII[i] = 0;
                this.LJIIIIZZ[i] = 0;
                this.LJIIIZ[i] = 0;
                this.LJIIJ = (~i3) & i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1.LJFF == 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3.getTop() < r4.LIZ.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(float r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80856VoK.LJII(float):void");
    }

    public final void LJIILIIL(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.LJIIJ & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.LJFF[pointerId] = x;
                this.LJI[pointerId] = y;
            }
        }
    }

    public final void LJIILJJIL(int i) {
        this.LJIJI.removeCallbacks(this.LJIJJ);
        if (this.LIZ != i) {
            this.LIZ = i;
            C80858VoM c80858VoM = (C80858VoM) this.LJIILLIIL;
            if (i == 1) {
                c80858VoM.LIZ.setStateInternal(1);
            } else {
                c80858VoM.getClass();
            }
            if (this.LIZ == 0) {
                this.LJIIZILJ = null;
            }
        }
    }

    public final void LIZJ(int i, View view) {
        if (view.getParent() == this.LJIJI) {
            this.LJIIZILJ = view;
            this.LIZJ = i;
            this.LJIILLIIL.getClass();
            LJIILJJIL(1);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        LIZ.append(this.LJIJI);
        LIZ.append(")");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final boolean LJ(float f, View view) {
        if (view == null) {
            return false;
        }
        this.LJIILLIIL.getClass();
        if (this.LJIILLIIL.LIZ() <= 0 || Math.abs(f) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    public final View LJIIIIZZ(int i, int i2) {
        for (int childCount = this.LJIJI.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJI;
            this.LJIILLIIL.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIILL(int i, View view) {
        C80858VoM c80858VoM;
        BottomSheetBehavior bottomSheetBehavior;
        int i2;
        Reference reference;
        View view2;
        if (view == this.LJIIZILJ && this.LIZJ == i) {
            return true;
        }
        if (view == null || (i2 = (bottomSheetBehavior = (c80858VoM = (C80858VoM) this.LJIILLIIL).LIZ).LJFF) == 1 || bottomSheetBehavior.LJIJ || ((i2 == 3 && bottomSheetBehavior.LJIILL == i && (view2 = bottomSheetBehavior.LJIIL.get()) != null && view2.canScrollVertically(-1)) || (reference = c80858VoM.LIZ.LJIIJJI) == null || reference.get() != view)) {
            return false;
        }
        this.LIZJ = i;
        LIZJ(i, view);
        return true;
    }

    public C80856VoK(Context context, ViewGroup viewGroup, AbstractC80859VoN abstractC80859VoN) {
        if (viewGroup != null) {
            if (abstractC80859VoN != null) {
                this.LJIJI = viewGroup;
                this.LJIILLIIL = abstractC80859VoN;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.LJIILJJIL = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILIIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIILL = new OverScroller(context, LJIJJLI);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public static boolean LIZ(int i, int i2, View view) {
        int i3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && (i3 = i2 + scrollY) >= childAt.getTop() && i3 < childAt.getBottom() && LIZ(i4 - childAt.getLeft(), i3 - childAt.getTop(), childAt)) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-1) || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final int LJI(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.LJIJI.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 300);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void LJIIJJI(float f, float f2, int i) {
        boolean LIZLLL = LIZLLL(f, f2, i, 1);
        boolean z = LIZLLL;
        if (LIZLLL(f2, f, i, 4)) {
            z = (LIZLLL ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (LIZLLL(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r2 = z2;
        if (LIZLLL(f2, f, i, 8)) {
            r2 = (z2 ? 1 : 0) | 8;
        }
        if (r2 != 0) {
            int[] iArr = this.LJIIIIZZ;
            iArr[i] = iArr[i] | r2;
            this.LJIILLIIL.getClass();
        }
    }

    public final void LJIIL(float f, float f2, int i) {
        float[] fArr = this.LIZLLL;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.LJ;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.LJFF;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.LJI;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.LJII;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.LJIIIIZZ;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.LJIIIZ;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.LIZLLL = fArr2;
            this.LJ = fArr3;
            this.LJFF = fArr4;
            this.LJI = fArr5;
            this.LJII = iArr;
            this.LJIIIIZZ = iArr2;
            this.LJIIIZ = iArr3;
        }
        float[] fArr9 = this.LIZLLL;
        this.LJFF[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.LJ;
        this.LJI[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.LJII;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.LJIJI.getLeft() + this.LJIILJJIL) {
            i2 = 1;
        }
        if (i5 < this.LJIJI.getTop() + this.LJIILJJIL) {
            i2 |= 4;
        }
        if (i4 > this.LJIJI.getRight() - this.LJIILJJIL) {
            i2 |= 2;
        }
        if (i5 > this.LJIJI.getBottom() - this.LJIILJJIL) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.LJIIJ |= 1 << i;
    }

    public final boolean LIZLLL(float f, float f2, int i, int i2) {
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.LJII[i] & i2;
        return false;
    }

    public final boolean LJIIIZ(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = i3;
        int i6 = i4;
        int left = this.LJIIZILJ.getLeft();
        int top = this.LJIIZILJ.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            this.LJIILL.abortAnimation();
            LJIILJJIL(0);
            return false;
        }
        int i9 = (int) this.LJIILIIL;
        int i10 = (int) this.LJIIL;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            if (i5 > 0) {
                i5 = i10;
            } else {
                i5 = -i10;
            }
        }
        int i11 = (int) this.LJIILIIL;
        int i12 = (int) this.LJIIL;
        int abs2 = Math.abs(i6);
        if (abs2 < i11) {
            i6 = 0;
        } else if (abs2 > i12) {
            if (i6 > 0) {
                i6 = i12;
            } else {
                i6 = -i12;
            }
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i13 = abs5 + abs6;
        int i14 = abs3 + abs4;
        if (i5 != 0) {
            f = abs5;
            f2 = i13;
        } else {
            f = abs3;
            f2 = i14;
        }
        float f5 = f / f2;
        if (i6 != 0) {
            f3 = abs6;
            f4 = i13;
        } else {
            f3 = abs4;
            f4 = i14;
        }
        float f6 = f3 / f4;
        this.LJIILLIIL.getClass();
        int LJI = LJI(i7, i5, 0);
        this.LJIILL.startScroll(left, top, i7, i8, (int) ((LJI(i8, i6, this.LJIILLIIL.LIZ()) * f6) + (LJI * f5)));
        LJIILJJIL(2);
        return true;
    }
}
