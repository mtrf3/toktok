package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.Vtf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC81187Vtf implements View.OnTouchListener, InterfaceC81198Vtq {
    public final ScaleGestureDetectorOnScaleGestureListenerC81189Vth LJLJLJ;
    public final C16230kN LJLJLLL;
    public RunnableC81191Vtj LJLLLLLL;
    public final WeakReference<VA9<V92>> LJLZ;
    public InterfaceC71052Rua LJZ;
    public float LJZI;
    public float LJZL;
    public final float[] LJLIL = new float[9];
    public final RectF LJLILLLLZI = new RectF();
    public final Interpolator LJLJI = new AccelerateDecelerateInterpolator();
    public float LJLJJI = 1.0f;
    public float LJLJJL = 1.75f;
    public float LJLJJLL = 3.0f;
    public long LJLJL = 200;
    public boolean LJLL = false;
    public boolean LJLLI = true;
    public int LJLLILLLL = 2;
    public final Matrix LJLLJ = new Matrix();
    public int LJLLL = -1;
    public int LJLLLL = -1;
    public boolean LL = false;
    public boolean LLD = true;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r10 = this;
            android.graphics.Matrix r0 = r10.LJLLJ
            android.graphics.RectF r7 = r10.LIZLLL(r0)
            r6 = 0
            if (r7 != 0) goto La
            return r6
        La:
            float r3 = r7.height()
            float r9 = r7.width()
            X.VA9 r2 = r10.LJ()
            if (r2 == 0) goto L88
            int r1 = r2.getHeight()
            int r0 = r2.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r2.getPaddingBottom()
            int r1 = r1 - r0
        L26:
            float r4 = (float) r1
            r5 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto L77
            float r4 = r4 - r3
            float r4 = r4 / r8
            float r1 = r7.top
        L32:
            float r4 = r4 - r1
        L33:
            X.VA9 r2 = r10.LJ()
            if (r2 == 0) goto L75
            int r1 = r2.getWidth()
            int r0 = r2.getPaddingLeft()
            int r1 = r1 - r0
            int r0 = r2.getPaddingRight()
            int r1 = r1 - r0
        L47:
            float r3 = (float) r1
            r2 = 1
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L5c
            float r3 = r3 - r9
            float r3 = r3 / r8
            float r0 = r7.left
            float r5 = r3 - r0
            r0 = 2
            r10.LJLLILLLL = r0
        L56:
            android.graphics.Matrix r0 = r10.LJLLJ
            r0.postTranslate(r5, r4)
            return r2
        L5c:
            float r1 = r7.left
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L66
            float r5 = -r1
            r10.LJLLILLLL = r6
            goto L56
        L66:
            float r1 = r7.right
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L71
            float r5 = r3 - r1
            r10.LJLLILLLL = r2
            goto L56
        L71:
            r0 = -1
            r10.LJLLILLLL = r0
            goto L56
        L75:
            r1 = 0
            goto L47
        L77:
            float r1 = r7.top
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L7f
            float r4 = -r1
            goto L33
        L7f:
            float r1 = r7.bottom
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L86
            goto L32
        L86:
            r4 = 0
            goto L33
        L88:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC81187Vtf.LIZIZ():boolean");
    }

    public final VA9<V92> LJ() {
        return this.LJLZ.get();
    }

    public final float LJFF() {
        this.LJLLJ.getValues(this.LJLIL);
        float pow = (float) Math.pow(this.LJLIL[0], 2.0d);
        this.LJLLJ.getValues(this.LJLIL);
        return (float) Math.sqrt(pow + ((float) Math.pow(this.LJLIL[3], 2.0d)));
    }

    public final void LIZ() {
        VA9<V92> LJ = LJ();
        if (LJ != null && LIZIZ()) {
            LJ.invalidate();
            Matrix matrix = this.LJLLJ;
            VA9<V92> LJ2 = LJ();
            if (LJ2 != null) {
                LJ2.setImageMatrix(matrix);
            }
        }
    }

    public ViewOnTouchListenerC81187Vtf(VA9<V92> va9) {
        this.LJLZ = new WeakReference<>(va9);
        va9.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJL);
        va9.setOnTouchListener(this);
        this.LJLJLJ = new ScaleGestureDetectorOnScaleGestureListenerC81189Vth(va9.getContext(), this);
        C16230kN c16230kN = new C16230kN(va9.getContext(), new C72811Shr(this));
        this.LJLJLLL = c16230kN;
        c16230kN.LIZIZ(new GestureDetectorOnDoubleTapListenerC81193Vtl(this));
    }

    public final RectF LIZLLL(Matrix matrix) {
        VA9<V92> LJ = LJ();
        if (LJ != null) {
            int i = this.LJLLLL;
            if (i == -1 && this.LJLLL == -1) {
                return null;
            }
            this.LJLILLLLZI.set(0.0f, 0.0f, i, this.LJLLL);
            LJ.getHierarchy().LJIIJ(this.LJLILLLLZI);
            matrix.mapRect(this.LJLILLLLZI);
            return this.LJLILLLLZI;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != 3) goto L7;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r29, android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC81187Vtf.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static void LIZJ(float f, float f2, float f3) {
        if (f < f2) {
            if (f2 < f3) {
                return;
            } else {
                throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
            }
        }
        throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }

    public final void LJI(float f, float f2, float f3) {
        if (!this.LLD) {
            return;
        }
        if (LJFF() < this.LJLJJLL || f < 1.0f) {
            this.LJLLJ.postScale(f, f, f2, f3);
            LIZ();
            if (LIZIZ()) {
                Matrix matrix = this.LJLLJ;
                VA9<V92> LJ = LJ();
                if (LJ != null) {
                    LJ.setImageMatrix(matrix);
                }
            }
        }
    }

    public final void LJII(float f, float f2, float f3, boolean z) {
        VA9<V92> LJ;
        if (!this.LLD || (LJ = LJ()) == null || f < this.LJLJJI || f > this.LJLJJLL) {
            return;
        }
        if (z) {
            LJ.post(new RunnableC81192Vtk(this, LJFF(), f, f2, f3));
        } else {
            this.LJLLJ.setScale(f, f, f2, f3);
            LIZ();
        }
    }
}
