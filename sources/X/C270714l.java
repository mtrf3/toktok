package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import o3.h0;

/* renamed from: X.14l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C270714l {
    public static final InterpolatorC270514j LJJ = new Interpolator() { // from class: X.14j
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
        }
    };
    public int LIZ;
    public int LIZIZ;
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
    public float LJIILIIL;
    public int LJIILJJIL;
    public final int LJIILL;
    public int LJIILLIIL;
    public final OverScroller LJIIZILJ;
    public final AbstractC270614k LJIJ;
    public View LJIJI;
    public boolean LJIJJ;
    public final ViewGroup LJIJJLI;
    public int LIZJ = -1;
    public final IDRunnableS85S0100000 LJIL = new IDRunnableS85S0100000(this, 129);

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

    public final boolean LJ() {
        int length = this.LIZLLL.length;
        for (int i = 0; i < length; i++) {
            if ((this.LJIIJ & (1 << i)) != 0) {
                float f = this.LJFF[i] - this.LIZLLL[i];
                float f2 = this.LJI[i] - this.LJ[i];
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.LIZIZ;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZ == 2) {
            boolean computeScrollOffset = this.LJIIZILJ.computeScrollOffset();
            int currX = this.LJIIZILJ.getCurrX();
            int currY = this.LJIIZILJ.getCurrY();
            int left = currX - this.LJIJI.getLeft();
            int top = currY - this.LJIJI.getTop();
            if (left != 0) {
                h0.LJIIJJI(left, this.LJIJI);
            }
            if (top != 0) {
                h0.LJIIL(top, this.LJIJI);
            }
            if (left != 0 || top != 0) {
                this.LJIJ.onViewPositionChanged(this.LJIJI, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == this.LJIIZILJ.getFinalX() && currY == this.LJIIZILJ.getFinalY()) {
                    this.LJIIZILJ.abortAnimation();
                }
            }
            this.LJIJJLI.post(this.LJIL);
        }
        if (this.LIZ != 2) {
            return false;
        }
        return true;
    }

    public final void LJIILJJIL() {
        this.LJIIJJI.computeCurrentVelocity(1000, this.LJIIL);
        float xVelocity = this.LJIIJJI.getXVelocity(this.LIZJ);
        float f = this.LJIILIIL;
        float f2 = this.LJIIL;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity > 0.0f) {
                xVelocity = f2;
            } else {
                xVelocity = -f2;
            }
        }
        float yVelocity = this.LJIIJJI.getYVelocity(this.LIZJ);
        float f4 = this.LJIILIIL;
        float f5 = this.LJIIL;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        this.LJIJJ = true;
        this.LJIJ.onViewReleased(this.LJIJI, xVelocity, f3);
        this.LJIJJ = false;
        if (this.LIZ == 1) {
            LJIJ(0);
        }
    }

    public final void LIZ() {
        LIZIZ();
        if (this.LIZ == 2) {
            int currX = this.LJIIZILJ.getCurrX();
            int currY = this.LJIIZILJ.getCurrY();
            this.LJIIZILJ.abortAnimation();
            int currX2 = this.LJIIZILJ.getCurrX();
            int currY2 = this.LJIIZILJ.getCurrY();
            this.LJIJ.onViewPositionChanged(this.LJIJI, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        LJIJ(0);
    }

    public final void LJI(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        if (r10.LIZJ == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        LJIILJJIL();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270714l.LJIILIIL(android.view.MotionEvent):void");
    }

    public final void LJIIZILJ(MotionEvent motionEvent) {
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

    public final void LJIJ(int i) {
        this.LJIJJLI.removeCallbacks(this.LJIL);
        if (this.LIZ != i) {
            this.LIZ = i;
            this.LJIJ.onViewDragStateChanged(i);
            if (this.LIZ == 0) {
                this.LJIJI = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if (r5 != r6) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270714l.LJIJJ(android.view.MotionEvent):boolean");
    }

    public static C270714l LJIIIZ(ViewGroup viewGroup, AbstractC270614k abstractC270614k) {
        return new C270714l(viewGroup.getContext(), viewGroup, abstractC270614k);
    }

    public static C270714l LJIIJ(ViewGroup viewGroup, AbstractC270614k abstractC270614k) {
        C270714l LJIIIZ = LJIIIZ(viewGroup, abstractC270614k);
        LJIIIZ.LIZIZ = (int) (1.0f * LJIIIZ.LIZIZ);
        return LJIIIZ;
    }

    public final void LIZJ(int i, View view) {
        if (view.getParent() == this.LJIJJLI) {
            this.LJIJI = view;
            this.LIZJ = i;
            this.LJIJ.onViewCaptured(view, i);
            LJIJ(1);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        LIZ.append(this.LJIJJLI);
        LIZ.append(")");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final View LJIIJJI(int i, int i2) {
        for (int childCount = this.LJIJJLI.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJJLI;
            this.LJIJ.getOrderedChildIndex(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIJI(int i, int i2) {
        if (this.LJIJJ) {
            return LJIIL(i, i2, (int) this.LJIIJJI.getXVelocity(this.LIZJ), (int) this.LJIIJJI.getYVelocity(this.LIZJ));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean LJIL(int i, View view) {
        if (view == this.LJIJI && this.LIZJ == i) {
            return true;
        }
        if (view != null && this.LJIJ.tryCaptureView(view, i)) {
            this.LIZJ = i;
            LIZJ(i, view);
            return true;
        }
        return false;
    }

    public C270714l(Context context, ViewGroup viewGroup, AbstractC270614k abstractC270614k) {
        if (viewGroup != null) {
            if (abstractC270614k != null) {
                this.LJIJJLI = viewGroup;
                this.LJIJ = abstractC270614k;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LJIILL = i;
                this.LJIILJJIL = i;
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILIIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIIZILJ = new OverScroller(context, LJJ);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final boolean LJFF(float f, float f2, View view) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.LJIJ.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIJ.getViewVerticalDragRange(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.LIZIZ;
                if (f3 <= i * i) {
                    return false;
                }
                return true;
            }
            if (Math.abs(f) <= this.LIZIZ) {
                return false;
            }
            return true;
        }
        if (!z2 || Math.abs(f2) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    public final int LJII(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.LJIJJLI.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.14k] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void LJIILL(float f, float f2, int i) {
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
            this.LJIJ.onEdgeDragStarted(r2, i);
        }
    }

    public final void LJIILLIIL(float f, float f2, int i) {
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
        if (i4 < this.LJIJJLI.getLeft() + this.LJIILJJIL) {
            i2 = 1;
        }
        if (i5 < this.LJIJJLI.getTop() + this.LJIILJJIL) {
            i2 |= 4;
        }
        if (i4 > this.LJIJJLI.getRight() - this.LJIILJJIL) {
            i2 |= 2;
        }
        if (i5 > this.LJIJJLI.getBottom() - this.LJIILJJIL) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.LJIIJ |= 1 << i;
    }

    public final boolean LJIJJLI(int i, int i2, View view) {
        this.LJIJI = view;
        this.LIZJ = -1;
        boolean LJIIL = LJIIL(i, i2, 0, 0);
        if (!LJIIL && this.LIZ == 0 && this.LJIJI != null) {
            this.LJIJI = null;
        }
        return LJIIL;
    }

    public final boolean LIZLLL(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.LJII[i] & i2) != i2 || (this.LJIILLIIL & i2) == 0 || (this.LJIIIZ[i] & i2) == i2 || (this.LJIIIIZZ[i] & i2) == i2) {
            return false;
        }
        int i3 = this.LIZIZ;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.LJIJ.onEdgeLock(i2)) {
            int[] iArr = this.LJIIIZ;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        if ((this.LJIIIIZZ[i] & i2) != 0 || abs <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = i3;
        int i6 = i4;
        int left = this.LJIJI.getLeft();
        int top = this.LJIJI.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            this.LJIIZILJ.abortAnimation();
            LJIJ(0);
            return false;
        }
        View view = this.LJIJI;
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
        float LJII = LJII(i8, i6, this.LJIJ.getViewVerticalDragRange(view)) * (f3 / f4);
        this.LJIIZILJ.startScroll(left, top, i7, i8, (int) (LJII + (LJII(i7, i5, this.LJIJ.getViewHorizontalDragRange(view)) * f5)));
        LJIJ(2);
        return true;
    }
}
