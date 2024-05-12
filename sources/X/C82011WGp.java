package X;

import Y.ALAdapterS11S0100000_14;
import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS0S0600001_14;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS101S0100000_14;
import Y.AUListenerS103S0200000_14;
import Y.AUListenerS93S0100000_4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.OverScroller;
import defpackage.a1;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WGp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82011WGp extends AbstractC80957Vpx implements WGR {
    public Matrix LJLLJ;
    public RectF LJLLL;
    public Rect LJLLLL;
    public boolean LJLLLLLL;
    public final OverScroller LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public Animator LJZL;
    public Animator LL;
    public AnimatorSet LLD;
    public ARunnableS0S0600001_14 LLF;
    public float LLFF;
    public float LLFFF;
    public float LLFII;
    public float LLFZ;
    public final C30901Je LLI;
    public InterfaceC82009WGn LLIFFJFJJ;
    public final C78875UxT LLII;
    public final C82016WGu LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;

    public final void LJIIJJI() {
        this.LLFF = 0.0f;
        this.LLFFF = 0.0f;
        this.LLFII = 1.0f;
        this.LLFZ = 1.0f;
        this.LJZ = false;
        this.LJZI = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final RectF getCurrentDisplayRectF() {
        RectF rectF = new RectF(this.LJLLL);
        this.LJLLJ.mapRect(rectF);
        return rectF;
    }

    public final void LJIIL() {
        OSZ<Float, Float> LJ;
        if (this.LLFII >= 1.0f) {
            Animator animator = this.LJZL;
            if (animator != null && animator.isRunning()) {
                return;
            }
            Animator animator2 = this.LL;
            if ((animator2 != null && animator2.isRunning()) || !this.LJLZ.isFinished() || (LJ = LJ(getCurrentDisplayRectF())) == null) {
                return;
            }
            Matrix matrix = new Matrix(this.LJLLJ);
            matrix.postTranslate(LJ.getFirst().floatValue(), LJ.getSecond().floatValue());
            Animator LJIIIIZZ = LJIIIIZZ(new Matrix(this.LJLLJ), matrix);
            LJIIIIZZ.start();
            this.LJZL = LJIIIIZZ;
            return;
        }
        Animator animator3 = this.LL;
        if (animator3 != null && animator3.isRunning()) {
            return;
        }
        Animator LJIIIIZZ2 = LJIIIIZZ(this.LJLLJ, new Matrix());
        LJIIIIZZ2.addListener(new ALAdapterS11S0100000_14(this, 17));
        LJIIIIZZ2.start();
        this.LL = LJIIIIZZ2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LJLZ.computeScrollOffset()) {
            int i = this.LLIIIILZ;
            int i2 = this.LLIIIJ;
            int currX = this.LJLZ.getCurrX();
            int currY = this.LJLZ.getCurrY();
            this.LLIIIILZ = currX;
            this.LLIIIJ = currY;
            LJIILIIL(currX - i, currY - i2);
        }
    }

    @Override // X.WGR
    public final void reset() {
        this.LJLLJ.reset();
        this.LJZL = null;
        this.LLD = null;
        this.LL = null;
        LJIIJJI();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.Float, java.lang.Float> LJ(android.graphics.RectF r6) {
        /*
            r5 = this;
            float r0 = r6.left
            r2 = 0
            boolean r0 = X.C82014WGs.LJ(r0, r2)
            if (r0 == 0) goto L2d
            float r0 = r6.top
            boolean r0 = X.C82014WGs.LJ(r0, r2)
            if (r0 == 0) goto L2d
            float r1 = r6.right
            int r0 = r5.getWidth()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZJ(r1, r0)
            if (r0 == 0) goto L2d
            float r1 = r6.bottom
            int r0 = r5.getHeight()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZJ(r1, r0)
            if (r0 == 0) goto L2d
            r0 = 0
            return r0
        L2d:
            float r1 = r6.width()
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto La3
            int r0 = r5.getWidth()
            int r0 = r0 / 2
            float r3 = (float) r0
            float r0 = r6.centerX()
        L45:
            float r3 = r3 - r0
        L46:
            float r1 = r6.height()
            int r0 = r5.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r5.getHeight()
            int r0 = r0 / 2
            float r2 = (float) r0
            float r0 = r6.centerY()
        L5e:
            float r2 = r2 - r0
        L5f:
            X.OSZ r4 = new X.OSZ
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r4.<init>(r1, r0)
            return r4
        L6d:
            float r0 = r6.top
            boolean r0 = X.C82014WGs.LIZIZ(r0, r2)
            if (r0 == 0) goto L86
            float r1 = r6.bottom
            int r0 = r5.getHeight()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZIZ(r1, r0)
            if (r0 == 0) goto L86
            float r0 = r6.top
            float r2 = -r0
            goto L5f
        L86:
            float r0 = r6.top
            boolean r0 = X.C82014WGs.LIZLLL(r0, r2)
            if (r0 == 0) goto L5f
            float r1 = r6.bottom
            int r0 = r5.getHeight()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZLLL(r1, r0)
            if (r0 == 0) goto L5f
            int r0 = r5.getHeight()
            float r2 = (float) r0
            float r0 = r6.bottom
            goto L5e
        La3:
            float r0 = r6.left
            boolean r0 = X.C82014WGs.LIZIZ(r0, r2)
            if (r0 == 0) goto Lbc
            float r1 = r6.right
            int r0 = r5.getWidth()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZIZ(r1, r0)
            if (r0 == 0) goto Lbc
            float r0 = r6.left
            float r3 = -r0
            goto L46
        Lbc:
            float r0 = r6.left
            boolean r0 = X.C82014WGs.LIZLLL(r0, r2)
            if (r0 == 0) goto Lda
            float r1 = r6.right
            int r0 = r5.getWidth()
            float r0 = (float) r0
            boolean r0 = X.C82014WGs.LIZLLL(r1, r0)
            if (r0 == 0) goto Lda
            int r0 = r5.getWidth()
            float r3 = (float) r0
            float r0 = r6.right
            goto L45
        Lda:
            r3 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82011WGp.LJ(android.graphics.RectF):X.OSZ");
    }

    public final Animator LJII(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LLFZ, f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 15));
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        if (r7 != false) goto L46;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82011WGp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.WGR
    public void setGestureListener(InterfaceC82009WGn scaleGestureListener) {
        o.LJIIIZ(scaleGestureListener, "scaleGestureListener");
        this.LLIFFJFJJ = scaleGestureListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82011WGp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLJ = new Matrix();
        this.LJLZ = new OverScroller(context);
        this.LLFII = 1.0f;
        this.LLFZ = 1.0f;
        this.LLI = new C30901Je();
        this.LLII = new C78875UxT();
        post(new ARunnableS40S0100000_4(this, 163));
        this.LLIIII = new C82016WGu(context, new C82012WGq(this));
    }

    public final void LJFF(float f, float f2) {
        float f3;
        Rect rect = this.LJLLLL;
        if (rect != null) {
            float width = rect.width();
            Rect rect2 = this.LJLLLL;
            if (rect2 != null) {
                float height = rect2.height();
                float f4 = width / height;
                float f5 = f / f2;
                float f6 = 0.0f;
                if (f4 > f5) {
                    float f7 = (height / width) * f;
                    float f8 = (f2 - f7) / 2;
                    f3 = f8;
                    f2 = f8 + f7;
                } else {
                    if (f4 < f5) {
                        float f9 = f4 * f2;
                        float f10 = (f - f9) / 2;
                        f6 = f10;
                        f = f10 + f9;
                    }
                    f3 = 0.0f;
                }
                this.LJLLL = new RectF(f6, f3, f, f2);
            }
        }
    }

    public final OSZ<Float, Float> LJI(float f, float f2) {
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (C82014WGs.LIZLLL(f, currentDisplayRectF.left)) {
            f = currentDisplayRectF.left;
        } else if (C82014WGs.LIZIZ(f, currentDisplayRectF.right)) {
            f = currentDisplayRectF.right;
        }
        if (C82014WGs.LIZLLL(f2, currentDisplayRectF.top)) {
            f2 = currentDisplayRectF.top;
        } else if (C82014WGs.LIZIZ(f2, currentDisplayRectF.bottom)) {
            f2 = currentDisplayRectF.bottom;
        }
        return new OSZ<>(Float.valueOf(f), Float.valueOf(f2));
    }

    public final Animator LJIIIIZZ(Matrix matrix, Matrix matrix2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.LLII, matrix, matrix2);
        ofObject.addUpdateListener(new AUListenerS103S0200000_14(this, ofObject, 1));
        return ofObject;
    }

    public final void LJIIIZ(float f, float f2) {
        boolean z;
        Animator animator = this.LJZL;
        boolean z2 = true;
        if (animator != null && animator.isRunning()) {
            return;
        }
        Animator animator2 = this.LL;
        if (animator2 != null && animator2.isRunning()) {
            return;
        }
        AnimatorSet animatorSet = this.LLD;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (currentDisplayRectF.width() < getWidth() && currentDisplayRectF.height() < getHeight()) {
            return;
        }
        float f3 = -Math.max(currentDisplayRectF.right - getWidth(), 0.0f);
        float f4 = 0;
        float max = Math.max(f4 - currentDisplayRectF.left, 0.0f);
        float f5 = -Math.max(currentDisplayRectF.bottom - getHeight(), 0.0f);
        float max2 = Math.max(f4 - currentDisplayRectF.top, 0.0f);
        if (C82014WGs.LIZ(f3, 0.0f) && C82014WGs.LIZ(max, 0.0f) && C82014WGs.LIZ(f5, 0.0f) && C82014WGs.LIZ(max2, 0.0f)) {
            return;
        }
        if ((f > 0.0f && max > 0.0f) || (f < 0.0f && f3 < 0.0f)) {
            z = true;
        } else {
            z = false;
        }
        if ((f2 <= 0.0f || max2 <= 0.0f) && (f2 >= 0.0f || f5 >= 0.0f)) {
            z2 = false;
        }
        if (!z && !z2) {
            return;
        }
        this.LLIIIILZ = 0;
        this.LLIIIJ = 0;
        this.LJLZ.fling(0, 0, (int) f, (int) f2, (int) f3, (int) max, (int) f5, (int) max2);
        C16300kU.LJIIJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(float r8, float r9) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82011WGp.LJIIJ(float, float):void");
    }

    public final void LJIILIIL(float f, float f2) {
        if (C82014WGs.LIZ(f, 0.0f) && C82014WGs.LIZ(f2, 0.0f)) {
            return;
        }
        this.LJLLJ.postTranslate(f, f2);
        invalidate();
    }

    @Override // X.WGR
    public final void setVideoSize(int i, int i2) {
        this.LJLLLL = new Rect(0, 0, i, i2);
        if (this.LJLLL == null) {
            LJFF(getWidth(), getHeight());
        }
    }

    @Override // X.AbstractC80957Vpx
    public final boolean LIZJ(Canvas canvas, View child, long j) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(child, "child");
        canvas.save();
        canvas.concat(this.LJLLJ);
        boolean LIZJ = super.LIZJ(canvas, child, j);
        canvas.restore();
        return LIZJ;
    }

    @Override // X.WGR
    public final void LIZIZ(Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq) {
        ARunnableS0S0600001_14 aRunnableS0S0600001_14;
        this.LLF = new ARunnableS0S0600001_14(this, rect, rect2, c77357UXp, wgq, 2);
        if (this.LJLLLL != null && getWidth() > 0 && getHeight() > 0 && (aRunnableS0S0600001_14 = this.LLF) != null) {
            aRunnableS0S0600001_14.run();
        }
    }

    @Override // X.AbstractC80957Vpx, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ARunnableS0S0600001_14 aRunnableS0S0600001_14;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLLLL != null && getWidth() > 0 && getHeight() > 0 && this.LJLLJ.isIdentity() && (aRunnableS0S0600001_14 = this.LLF) != null) {
            aRunnableS0S0600001_14.run();
        }
    }

    @Override // X.WGR
    public final void LIZ(Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!C16330kX.LIZIZ(this)) {
            interfaceC65784Pro.invoke();
            return;
        }
        Rect rect3 = this.LJLLLL;
        if (rect3 != null) {
            z = rect3.isEmpty();
        } else {
            z = true;
        }
        if (rect != null) {
            z2 = rect.isEmpty();
        } else {
            z2 = true;
        }
        if (rect2 != null) {
            z3 = rect2.isEmpty();
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 64));
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLD = animatorSet;
            animatorSet.addListener(new ALAdapterS11S0200000_14(this, interfaceC65784Pro, 10));
            animatorSet.playTogether(ofFloat, LJII(0.0f));
            animatorSet.setInterpolator(this.LLI);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        if (rect == null || rect2 == null) {
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        rect2.offset(-iArr[0], -iArr[1]);
        AnimatorSet LJJJI = C78866UxK.LJJJI(new Matrix(this.LJLLJ), new Matrix(C78866UxK.LJJIL(rect, getWidth(), getHeight(), this.LJLLLL, c77357UXp)), this.LJLLLL, wgq, new AqS180S0100000_14(this, 369));
        Animator LIZLLL = LIZLLL(new Rect(rect), rect2, 0.0f, true);
        LIZLLL.setDuration(wgq.LJI);
        LIZLLL.setInterpolator(wgq.LIZJ);
        Animator LJII = LJII(0.0f);
        LJII.setDuration(wgq.LJI);
        LJII.setInterpolator(wgq.LIZJ);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLD = animatorSet2;
        animatorSet2.addListener(new ALAdapterS11S0200000_14(this, interfaceC65784Pro, 11));
        animatorSet2.playTogether(LJJJI, LIZLLL, LJII);
        animatorSet2.setInterpolator(this.LLI);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }
}
