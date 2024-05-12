package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class KLU implements View.OnTouchListener, KLY {
    public final KLV LJLJLLL;
    public final C16230kN LJLL;
    public final WeakReference<VA9<V92>> LJLZ;
    public View.OnLongClickListener LJZI;
    public KLX LJZL;
    public boolean LLD;
    public final float[] LJLIL = new float[9];
    public final RectF LJLILLLLZI = new RectF();
    public final Interpolator LJLJI = new AccelerateDecelerateInterpolator();
    public float LJLJJI = 0.0f;
    public float LJLJJL = 1.0f;
    public float LJLJJLL = 1.75f;
    public float LJLJL = 3.0f;
    public long LJLJLJ = 200;
    public boolean LJLLI = false;
    public boolean LJLLILLLL = true;
    public int LJLLJ = 2;
    public final Matrix LJLLL = new Matrix();
    public int LJLLLL = -1;
    public int LJLLLLLL = -1;
    public PhotoSearchBottomPanelViewModel LJZ = null;
    public final PointF LL = new PointF();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (r4 < r3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLU.LIZJ():boolean");
    }

    public final VA9<V92> LJFF() {
        return this.LJLZ.get();
    }

    public final float LJI() {
        this.LJLLL.getValues(this.LJLIL);
        float pow = (float) Math.pow(this.LJLIL[0], 2.0d);
        this.LJLLL.getValues(this.LJLIL);
        return (float) Math.sqrt(pow + ((float) Math.pow(this.LJLIL[3], 2.0d)));
    }

    public final void LIZIZ() {
        VA9<V92> LJFF = LJFF();
        if (LJFF != null && LIZJ()) {
            LJFF.invalidate();
        }
    }

    public KLU(VA9<V92> va9) {
        this.LJLZ = new WeakReference<>(va9);
        va9.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJJZ);
        va9.setOnTouchListener(this);
        this.LJLJLLL = new KLV(va9.getContext(), this);
        this.LJLL = new C16230kN(va9.getContext(), new KLW(this));
    }

    @Override // X.KLY
    public final void LIZ(float f) {
        VA9<V92> LJFF;
        if (this.LLD && (LJFF = LJFF()) != null) {
            this.LJLJLLL.getClass();
            this.LJLLL.postTranslate(0.0f, f);
            LIZIZ();
            KLX klx = this.LJZL;
            if (klx != null) {
                PointF pointF = this.LL;
                klx.LIZ(pointF.x + 0.0f, f + pointF.y);
            }
            ViewParent parent = LJFF.getParent();
            if (parent == null) {
                return;
            }
            if (this.LJLLILLLL) {
                this.LJLJLLL.getClass();
                if (!this.LJLLI) {
                    if (this.LJLLJ != 2) {
                        return;
                    }
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final RectF LJ(Matrix matrix) {
        VA9<V92> LJFF = LJFF();
        if (LJFF != null) {
            int i = this.LJLLLLLL;
            if (i == -1 && this.LJLLLL == -1) {
                return null;
            }
            this.LJLILLLLZI.set(0.0f, 0.0f, i, this.LJLLLL);
            LJFF.getHierarchy().LJIIJ(this.LJLILLLLZI);
            matrix.mapRect(this.LJLILLLLZI);
            return this.LJLILLLLZI;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r3 != 3) goto L26;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel r0 = r8.LJZ
            int r1 = r0.LJLJI
            r2 = 0
            r6 = 3
            if (r1 == r6) goto Lb
            r0 = 4
            if (r1 != r0) goto L13
        Lb:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        L13:
            int r0 = r10.getAction()
            if (r0 != 0) goto L36
            com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel r3 = r8.LJZ
            int r1 = r3.LJLJI
            r0 = 5
            if (r1 != r0) goto L36
            X.VA9 r0 = r8.LJFF()
            android.content.Context r0 = r0.getContext()
            boolean r0 = r3.gv0(r0, r10)
            if (r0 == 0) goto L36
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        L36:
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto Lc5
            if (r0 == r1) goto Lba
            if (r0 == r6) goto Lba
        L41:
            X.KLV r0 = r8.LJLJLLL
            r0.getClass()
            X.KLV r5 = r8.LJLJLLL
            boolean r4 = r5.LIZLLL
            int r3 = r10.getAction()
            if (r3 == 0) goto La6
            if (r3 == r1) goto L9b
            r0 = 2
            if (r3 == r0) goto L6d
            if (r3 == r6) goto L9b
        L57:
            X.KLV r0 = r8.LJLJLLL
            r0.getClass()
            if (r4 != 0) goto L65
            X.KLV r0 = r8.LJLJLLL
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L65
            r2 = 1
        L65:
            r8.LJLLI = r2
            X.0kN r0 = r8.LJLL
            r0.LIZ(r10)
            return r1
        L6d:
            float r7 = r10.getY()
            float r0 = r5.LJ
            float r6 = r7 - r0
            boolean r0 = r5.LIZLLL
            if (r0 != 0) goto L86
            float r3 = java.lang.Math.abs(r6)
            float r0 = r5.LIZ
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            r0 = 1
        L84:
            r5.LIZLLL = r0
        L86:
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L57
            X.KLY r0 = r5.LIZIZ
            r0.LIZ(r6)
            r5.LJ = r7
            android.view.VelocityTracker r0 = r5.LIZJ
            if (r0 == 0) goto L57
            r0.addMovement(r10)
            goto L57
        L99:
            r0 = 0
            goto L84
        L9b:
            android.view.VelocityTracker r0 = r5.LIZJ
            if (r0 == 0) goto L57
            r0.recycle()
            r0 = 0
            r5.LIZJ = r0
            goto L57
        La6:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.LIZJ = r0
            if (r0 == 0) goto Lb1
            r0.addMovement(r10)
        Lb1:
            float r0 = r10.getY()
            r5.LJ = r0
            r5.LIZLLL = r2
            goto L57
        Lba:
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L41
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L41
        Lc5:
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L41
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLU.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static void LIZLLL(float f, float f2, float f3) {
        if (f < f2) {
            if (f2 < f3) {
                return;
            } else {
                throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
            }
        }
        throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }
}
