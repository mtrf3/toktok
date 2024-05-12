package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o3.h0;

/* renamed from: X.Vmn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80761Vmn {
    public static final InterpolatorC80763Vmp LJIJJLI = new InterpolatorC80763Vmp();
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
    public final AbstractC80765Vmr LJIILLIIL;
    public View LJIIZILJ;
    public boolean LJIJ;
    public final ViewGroup LJIJI;
    public int LIZJ = -1;
    public final ARunnableS50S0100000_14 LJIJJ = new ARunnableS50S0100000_14(this, 16);

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

    public final void LJIIJJI() {
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
        LJII(xVelocity, f3);
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

    public final void LJIILJJIL(MotionEvent motionEvent) {
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

    public final void LJIILL(int i) {
        this.LJIJI.removeCallbacks(this.LJIJJ);
        if (this.LIZ != i) {
            this.LIZ = i;
            C80764Vmq c80764Vmq = (C80764Vmq) this.LJIILLIIL;
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = c80764Vmq.LIZ;
                if (bottomSheetBehavior.LJIIZILJ) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            } else {
                c80764Vmq.getClass();
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
            LJIILL(1);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        LIZ.append(this.LJIJI);
        LIZ.append(")");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final boolean LJ(float f, View view) {
        int i;
        if (view == null) {
            return false;
        }
        this.LJIILLIIL.getClass();
        BottomSheetBehavior bottomSheetBehavior = ((C80764Vmq) this.LJIILLIIL).LIZ;
        if (bottomSheetBehavior.LJIILL) {
            i = bottomSheetBehavior.LJJIJIIJIL;
        } else {
            i = bottomSheetBehavior.LJIILJJIL;
        }
        if (i <= 0 || Math.abs(f) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if ((r8 - r7.LJIIIIZZ) < r7.LJJIFFI) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if ((r8 - r7.LJIILJJIL) >= r7.LJJI) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80761Vmn.LJII(float, float):void");
    }

    public final View LJIIIZ(int i, int i2) {
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

    public final boolean LJIILLIIL(int i, View view) {
        C80764Vmq c80764Vmq;
        BottomSheetBehavior bottomSheetBehavior;
        int i2;
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        if (view == this.LJIIZILJ && this.LIZJ == i) {
            return true;
        }
        if (view == null || (i2 = (bottomSheetBehavior = (c80764Vmq = (C80764Vmq) this.LJIILLIIL).LIZ).LJJIIJ) == 1 || bottomSheetBehavior.LJJJIL || ((i2 == 3 && bottomSheetBehavior.LJJIZ == i && (weakReference = bottomSheetBehavior.LJJIJL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = c80764Vmq.LIZ.LJJIJIL) == null || reference.get() != view)) {
            return false;
        }
        this.LIZJ = i;
        LIZJ(i, view);
        return true;
    }

    public C80761Vmn(Context context, ViewGroup viewGroup, AbstractC80765Vmr abstractC80765Vmr) {
        if (viewGroup != null) {
            if (abstractC80765Vmr != null) {
                this.LJIJI = viewGroup;
                this.LJIILLIIL = abstractC80765Vmr;
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
        return Math.min(abs, 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void LJIIL(float f, float f2, int i) {
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

    public final void LJIILIIL(float f, float f2, int i) {
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

    public static boolean LIZ(int i, int i2, int i3, View view) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LIZ(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt)) {
                    return true;
                }
            }
        }
        if ((i != 0 && view.canScrollHorizontally(-i)) || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(float f, float f2, int i, int i2) {
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.LJII[i] & i2;
        return false;
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4) {
        int i5;
        int left = this.LJIIZILJ.getLeft();
        int top = this.LJIIZILJ.getTop();
        if (i3 != 0) {
            AbstractC80765Vmr abstractC80765Vmr = this.LJIILLIIL;
            View view = this.LJIIZILJ;
            abstractC80765Vmr.getClass();
            h0.LJIIJJI(view.getLeft() - left, this.LJIIZILJ);
        }
        if (i4 != 0) {
            C80764Vmq c80764Vmq = (C80764Vmq) this.LJIILLIIL;
            int expandedOffset = c80764Vmq.LIZ.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = c80764Vmq.LIZ;
            if (bottomSheetBehavior.LJIILL) {
                i5 = bottomSheetBehavior.LJJIJIIJIL;
            } else {
                i5 = bottomSheetBehavior.LJIILJJIL;
            }
            i2 = C78609UtB.LJJIIZ(i2, expandedOffset, i5);
            h0.LJIIL(i2 - top, this.LJIIZILJ);
        }
        if (i3 != 0 || i4 != 0) {
            ((C80764Vmq) this.LJIILLIIL).LIZ.dispatchOnSlide(i2);
        }
    }

    public final boolean LJIIJ(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5;
        int i6 = i3;
        int i7 = i4;
        int left = this.LJIIZILJ.getLeft();
        int top = this.LJIIZILJ.getTop();
        int i8 = i - left;
        int i9 = i2 - top;
        if (i8 == 0 && i9 == 0) {
            this.LJIILL.abortAnimation();
            LJIILL(0);
            return false;
        }
        int i10 = (int) this.LJIILIIL;
        int i11 = (int) this.LJIIL;
        int abs = Math.abs(i6);
        if (abs < i10) {
            i6 = 0;
        } else if (abs > i11) {
            if (i6 > 0) {
                i6 = i11;
            } else {
                i6 = -i11;
            }
        }
        int i12 = (int) this.LJIILIIL;
        int i13 = (int) this.LJIIL;
        int abs2 = Math.abs(i7);
        if (abs2 < i12) {
            i7 = 0;
        } else if (abs2 > i13) {
            if (i7 > 0) {
                i7 = i13;
            } else {
                i7 = -i13;
            }
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i7);
        int i14 = abs5 + abs6;
        int i15 = abs3 + abs4;
        if (i6 != 0) {
            f = abs5;
            f2 = i14;
        } else {
            f = abs3;
            f2 = i15;
        }
        float f5 = f / f2;
        if (i7 != 0) {
            f3 = abs6;
            f4 = i14;
        } else {
            f3 = abs4;
            f4 = i15;
        }
        float f6 = f3 / f4;
        this.LJIILLIIL.getClass();
        int LJI = LJI(i8, i6, 0);
        BottomSheetBehavior bottomSheetBehavior = ((C80764Vmq) this.LJIILLIIL).LIZ;
        if (bottomSheetBehavior.LJIILL) {
            i5 = bottomSheetBehavior.LJJIJIIJIL;
        } else {
            i5 = bottomSheetBehavior.LJIILJJIL;
        }
        this.LJIILL.startScroll(left, top, i8, i9, (int) ((LJI(i9, i7, i5) * f6) + (LJI * f5)));
        LJIILL(2);
        return true;
    }
}
