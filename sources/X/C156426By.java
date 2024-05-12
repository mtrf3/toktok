package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS6S0101000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.6By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C156426By extends FrameLayout {
    public static final /* synthetic */ int LLIIIL = 0;
    public Context LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public C6C1 LJLJJLL;
    public View LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public C6BR LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final PointF LJLLL;
    public final PointF LJLLLL;
    public long LJLLLLLL;
    public final Runnable LJLZ;
    public boolean LJZ;
    public int LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public final float LLF;
    public float LLFF;
    public boolean LLFFF;
    public long LLFII;
    public int LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public C66N LLIIII;
    public C6DA LLIIIILZ;
    public final C82622Wbi LLIIIJ;

    public boolean LIZIZ() {
        return this instanceof C1557269g;
    }

    public boolean LIZJ() {
        return this instanceof C1557269g;
    }

    public C1558669u LJ() {
        return null;
    }

    public boolean LJII() {
        return true;
    }

    public boolean LJIIIIZZ() {
        return false;
    }

    public void LJIILIIL() {
    }

    public void LJIILL() {
    }

    public View getDrawView() {
        return null;
    }

    public float getEndTime() {
        return 0.0f;
    }

    public float getStartTime() {
        return 0.0f;
    }

    public void setPlayPosition(long j) {
    }

    public C6DA LIZLLL() {
        return new C89460Z9c(this, new C6BP(this));
    }

    public final boolean LJI() {
        if (this.LJLLI || this.LJLLILLLL || this.LJLLJ) {
            return true;
        }
        return false;
    }

    public void LJIIL() {
        if (this.LJLJJLL.LJLLJ || (this.LLI && this.LLFZ < 2)) {
            if (this.LJLL != null && this.LL) {
                new C139355dT().LIZ.storeBoolean("interact_sticker_hint_set", true);
                C6BO c6bo = ((C6BM) this.LJLL).LIZ.LJLLILLLL;
                if (c6bo != null) {
                    c6bo.LJIIIZ();
                }
            }
            LJFF(false);
            return;
        }
        LJIJ();
    }

    public final void LJIILJJIL() {
        RectF rectF;
        RectF LJIILJJIL = C1E4.LJIILJJIL(this.LJLJJLL.getFourAnglePoint());
        AnonymousClass671 anonymousClass671 = ((C6BM) this.LJLL).LIZ.LJLLJ;
        if (anonymousClass671 != null) {
            rectF = anonymousClass671.LJ(LJIILJJIL);
        } else {
            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        final float centerX = rectF.centerX() - LJIILJJIL.centerX();
        final float x = this.LJLJL.getX();
        final float centerY = rectF.centerY() - LJIILJJIL.centerY();
        final float y = this.LJLJL.getY();
        float width = rectF.width() / LJIILJJIL.width();
        final float f = this.LJLILLLLZI;
        final float f2 = width * f;
        if (centerX == 0.0f && centerY == 0.0f && f2 == f) {
            return;
        }
        final RectF rectF2 = new RectF(this.LJLJJLL.LJLIL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6C2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C156426By c156426By = C156426By.this;
                float f3 = x;
                float f4 = centerX;
                float f5 = y;
                float f6 = centerY;
                RectF rectF3 = rectF2;
                float f7 = f;
                float f8 = f2;
                c156426By.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f9 = f4 * floatValue;
                c156426By.LJLJL.setX(f3 + f9);
                float f10 = f6 * floatValue;
                c156426By.LJLJL.setY(f5 + f10);
                float f11 = rectF3.left + f9;
                C6C1 c6c1 = c156426By.LJLJJLL;
                RectF rectF4 = c6c1.LJLIL;
                c6c1.LIZ(f11 - rectF4.left, (rectF3.top + f10) - rectF4.top);
                c156426By.LJLILLLLZI = f7;
                c156426By.LJIJJ((((f8 - f7) * floatValue) + f7) / f7);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.6C3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                C156426By.this.LJLJL.setX(x + centerX);
                C156426By.this.LJLJL.setY(y + centerY);
                C156426By.this.LJLJJLL.LIZ(centerX, centerY);
                C156426By c156426By = C156426By.this;
                float f3 = f;
                c156426By.LJLILLLLZI = f3;
                c156426By.LJIJJ(f2 / f3);
            }
        });
        ofFloat.start();
    }

    public void LJIIZILJ() {
        C6DA c6da = this.LLIIIILZ;
        RectF rectOnWindow = this.LJLJJLL.getRectOnWindow();
        PointF pointF = this.LJLLLL;
        c6da.LJIIL(rectOnWindow, (int) pointF.x, (int) pointF.y, this.LJLJJLL.getRotateAngle(), false);
    }

    public void LJIJJLI() {
        Rect rect = new Rect();
        int measuredWidth = this.LJLJL.getMeasuredWidth();
        int measuredHeight = this.LJLJL.getMeasuredHeight();
        int x = (int) this.LJLJL.getX();
        int y = (int) this.LJLJL.getY();
        rect.set(x, y, measuredWidth + x, measuredHeight + y);
        this.LJLJJLL.LJLIL.set(rect);
        this.LJLJL.getLocationInWindow(r2);
        int[] iArr = {iArr[0] - x, iArr[1] - y};
        this.LJLJJLL.setmWindowPadding(iArr);
        C6C1 c6c1 = this.LJLJJLL;
        float f = this.LJLILLLLZI;
        float f2 = this.LJLJI;
        c6c1.LJLLILLLL = f;
        c6c1.LJLLI = f2;
        c6c1.invalidate();
        this.LJLJJLL.setStickerShowHelpboxCallback(new C6CB() { // from class: X.6C4
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
            
                if (r4 != false) goto L8;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            @Override // X.C6CB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(boolean r4, boolean r5) {
                /*
                    r3 = this;
                    X.6By r2 = X.C156426By.this
                    X.6BR r1 = r2.LJLL
                    if (r1 == 0) goto L20
                    if (r4 == 0) goto L23
                    boolean r0 = r2.LJII()
                    if (r0 == 0) goto L16
                    X.6BR r1 = r2.LJLL
                    r0 = 1
                    X.6BM r1 = (X.C6BM) r1
                    r1.LJ(r0)
                L16:
                    boolean r0 = r2.LJII()
                    if (r0 == 0) goto L29
                    r2.LJIIZILJ()
                L1f:
                    return
                L20:
                    if (r4 == 0) goto L29
                    goto L16
                L23:
                    X.6BM r1 = (X.C6BM) r1
                    r0 = 0
                    r1.LJ(r0)
                L29:
                    if (r5 == 0) goto L31
                    X.6DA r0 = r2.LLIIIILZ
                    r0.LJII()
                    goto L1f
                L31:
                    X.6DA r0 = r2.LLIIIILZ
                    r0.LJII()
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6C4.LIZ(boolean, boolean):void");
            }
        });
        this.LJLJLJ = (int) (this.LJLJL.getMeasuredWidth() * this.LJLILLLLZI);
        this.LJLJLLL = (int) (this.LJLJL.getMeasuredHeight() * this.LJLILLLLZI);
    }

    public PointF getCenterViewPoint() {
        Rect rect = new Rect();
        this.LJLJL.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    public int getContentViewHeight() {
        int measuredHeight = (int) (this.LJLJL.getMeasuredHeight() * this.LJLILLLLZI);
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        return this.LJLJLLL;
    }

    public PointF getContentViewPoint() {
        return new PointF(this.LJLJL.getX(), this.LJLJL.getY());
    }

    public int getContentViewWidth() {
        int measuredWidth = (int) (this.LJLJL.getMeasuredWidth() * this.LJLILLLLZI);
        if (measuredWidth != 0) {
            return measuredWidth;
        }
        return this.LJLJLJ;
    }

    public PointF[] getFourAnglePoint() {
        return this.LJLJJLL.getFourAnglePoint();
    }

    public RectF getViewPositionRect() {
        return this.LJLJJLL.getViewBoxRect();
    }

    public final void LIZ() {
        float f;
        PointF pointF;
        C156426By c156426By;
        LJIJJLI();
        this.LJLJJLL.LIZIZ();
        C6BR c6br = this.LJLL;
        float f2 = 0.0f;
        if (c6br != null) {
            C6BM c6bm = (C6BM) c6br;
            C6BL c6bl = c6bm.LIZ;
            if (c6bl.LJLLJ != null && (c156426By = c6bl.LJLL) != null) {
                PointF[] fourAnglePoint = c156426By.getFourAnglePoint();
                for (PointF pointF2 : fourAnglePoint) {
                    pointF2.x += 0.0f;
                    pointF2.y += 0.0f;
                }
                pointF = c6bm.LIZ.LJLLJ.LIZJ(fourAnglePoint);
            } else {
                pointF = new PointF(0.0f, 0.0f);
            }
            f2 = pointF.x;
            f = pointF.y;
        } else {
            f = 0.0f;
        }
        float x = this.LJLJL.getX() + f2;
        float y = this.LJLJL.getY() + f;
        C6BR c6br2 = this.LJLL;
        if (c6br2 != null && this.LLD && !((C6BM) c6br2).LIZ(f2, f)) {
            return;
        }
        this.LJLJL.setX(x);
        this.LJLJL.setY(y);
        this.LJLJJLL.LIZ(f2, f);
    }

    public final void LJIJ() {
        if (!LJII()) {
            return;
        }
        C6C1 c6c1 = this.LJLJJLL;
        if (!c6c1.LJLLJ) {
            c6c1.LJLLJ = true;
            c6c1.invalidate();
            C6CB c6cb = c6c1.LJLLLLLL;
            if (c6cb != null) {
                c6cb.LIZ(true, false);
            }
        }
        Runnable runnable = this.LJLZ;
        if (runnable != null) {
            this.LJLJJLL.removeCallbacks(runnable);
        }
        this.LJLJJLL.postDelayed(this.LJLZ, 3000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIIIILZ.LJIIIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIIIILZ.LJIIJ();
    }

    public View getContentView() {
        return this.LJLJL;
    }

    public boolean getLockMode() {
        return this.LLD;
    }

    public float getRotateAngle() {
        return this.LJLJI;
    }

    public float getScale() {
        return this.LJLILLLLZI;
    }

    public final void LJFF(boolean z) {
        C6C1 c6c1 = this.LJLJJLL;
        if (!c6c1.LJLLJ) {
            return;
        }
        c6c1.LJLLJ = false;
        c6c1.invalidate();
        C6CB c6cb = c6c1.LJLLLLLL;
        if (c6cb == null) {
            return;
        }
        c6cb.LIZ(false, z);
    }

    public boolean LJIIJ(MotionEvent motionEvent) {
        if (!LJII()) {
            return false;
        }
        this.LLII = false;
        this.LLI = false;
        this.LJZL = false;
        LJIIIZ(motionEvent.getX(), motionEvent.getY());
        C6C1 c6c1 = this.LJLJJLL;
        PointF pointF = this.LJLLL;
        boolean LJIILL = C77119UOl.LJIILL(pointF.x, pointF.y, c6c1.LJLILLLLZI, c6c1.LJLLI);
        this.LJLLI = LJIILL;
        if (LJIILL) {
            this.LJZI = 3;
        } else {
            this.LJZI = -1;
        }
        if (this.LJZI != -1) {
            this.LJZL = true;
        }
        if (!this.LJZL) {
            LJFF(false);
        }
        LJIIIZ(motionEvent.getX(), motionEvent.getY());
        this.LJLLLLLL = System.currentTimeMillis();
        return this.LJZL;
    }

    public boolean LJIIJJI(MotionEvent motionEvent) {
        boolean z;
        if (!LJII()) {
            return false;
        }
        LJIIIZ(motionEvent.getX(), motionEvent.getY());
        this.LJLLLL.set(motionEvent.getRawX(), motionEvent.getRawY());
        C6C1 c6c1 = this.LJLJJLL;
        PointF pointF = this.LJLLL;
        this.LL = C77119UOl.LJIILL(pointF.x, pointF.y, c6c1.LJLILLLLZI, c6c1.LJLLI);
        LJIIIZ(this.LJLJL.getX() + (this.LJLJL.getWidth() / 2), this.LJLJL.getY() + (this.LJLJL.getHeight() / 2));
        this.LJLLL.x += this.LJLJJI;
        if (this.LJZI != -1) {
            if ((this.LJLL == null || LJIIIIZZ() || !((C6BM) this.LJLL).LIZJ(this, true)) && (LIZIZ() || LIZJ())) {
                LJIILJJIL();
            }
            if (System.currentTimeMillis() - this.LJLLLLLL > 300 && !LJIIIIZZ() && this.LJZ) {
                LJIJ();
                this.LJZ = false;
            }
            if (System.currentTimeMillis() - this.LJLLLLLL <= 300 && !LJIIIIZZ()) {
                if (!this.LLIIII.LIZ()) {
                    LJIIL();
                } else {
                    this.LLII = true;
                }
            }
            C6BR c6br = this.LJLL;
            if (c6br != null) {
                ((C6BM) c6br).LIZLLL(true, false, LIZIZ(), LIZJ());
            }
            z = true;
        } else {
            if (this.LJLLILLLL && this.LJLL != null && !LJIIIIZZ()) {
                if (!((C6BM) this.LJLL).LIZJ(this, true) && (LIZIZ() || LIZJ())) {
                    LJIILJJIL();
                }
                ((C6BM) this.LJLL).LIZLLL(true, true, LIZIZ(), LIZJ());
            }
            z = false;
        }
        if (this.LJLLI) {
            this.LLFII = System.currentTimeMillis();
        }
        this.LLIFFJFJJ = true ^ this.LJZL;
        this.LJLLI = false;
        this.LJLLJ = false;
        this.LJLLILLLL = false;
        this.LJZL = false;
        this.LJZI = -1;
        return z;
    }

    public final void LJIJJ(float f) {
        C6BL c6bl;
        AnonymousClass671 anonymousClass671;
        C6BR c6br = this.LJLL;
        if (c6br != null && this.LLD && (anonymousClass671 = (c6bl = ((C6BM) c6br).LIZ).LJLLJ) != null) {
            anonymousClass671.LJIIIIZZ(c6bl.LJLL.getFourAnglePoint(), f);
        }
        float f2 = this.LJLILLLLZI * f;
        this.LJLILLLLZI = f2;
        float f3 = this.LLF;
        if (f2 > f3) {
            this.LJLILLLLZI = f3;
            return;
        }
        float f4 = this.LLFF;
        if (f2 < f4) {
            this.LJLILLLLZI = f4;
            return;
        }
        this.LJLJL.setScaleX(f2);
        this.LJLJL.setScaleY(this.LJLILLLLZI);
        C6C1 c6c1 = this.LJLJJLL;
        float f5 = this.LJLILLLLZI;
        float f6 = this.LJLJI;
        c6c1.LJLLILLLL = f5;
        c6c1.LJLLI = f6;
        c6c1.invalidate();
        this.LJLJLJ = (int) (this.LJLJL.getMeasuredWidth() * this.LJLILLLLZI);
        this.LJLJLLL = (int) (this.LJLJL.getMeasuredHeight() * this.LJLILLLLZI);
    }

    public void setLockMode(boolean z) {
        this.LLD = z;
    }

    public void setMotionInterceptor(C66N c66n) {
        this.LLIIII = c66n;
    }

    public void setStickerEditListener(C6BR c6br) {
        this.LJLL = c6br;
    }

    public C156426By(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = 1.0f;
        this.LJLLL = new PointF();
        this.LJLLLL = new PointF();
        this.LJLZ = new ARunnableS15S0101000_11(5, this, 8);
        this.LJZI = -1;
        this.LL = false;
        this.LLD = false;
        this.LLF = 100.0f;
        this.LLFF = 0.01f;
        this.LLFFF = false;
        this.LLFII = 0L;
        this.LLFZ = 0;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLII = false;
        this.LLIIII = AnonymousClass647.LJLIL;
        this.LLIIIILZ = LIZLLL();
    }

    public final void LJIIIZ(float f, float f2) {
        this.LJLLL.set(f, f2);
        this.LJLLL.offset(-this.LJLJJI, -this.LJLJJL);
    }

    public void LJIILLIIL(int i, int i2) {
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    public final void LJIJI(float f, Boolean bool) {
        int i;
        Float valueOf;
        C6BL c6bl;
        AnonymousClass671 anonymousClass671;
        if (this.LJLL != null) {
            if (bool.booleanValue()) {
                i = ((C6BM) this.LJLL).LIZLLL(false, true, LIZIZ(), LIZJ());
            } else {
                i = -1;
            }
            if (this.LLD && (anonymousClass671 = (c6bl = ((C6BM) this.LJLL).LIZ).LJLLJ) != null) {
                anonymousClass671.LIZIZ(c6bl.LJLL.getFourAnglePoint(), f);
            }
            if (4 == i) {
                AnonymousClass671 anonymousClass6712 = ((C6BM) this.LJLL).LIZ.LJLLJ;
                if (anonymousClass6712 != null) {
                    valueOf = Float.valueOf(anonymousClass6712.LJIIJ(f));
                } else {
                    valueOf = Float.valueOf(f);
                }
                f = valueOf.floatValue();
            }
        }
        float f2 = this.LJLJI - f;
        this.LJLJI = f2;
        this.LJLJL.setRotation(f2);
        C6C1 c6c1 = this.LJLJJLL;
        float f3 = this.LJLILLLLZI;
        float f4 = this.LJLJI;
        c6c1.LJLLILLLL = f3;
        c6c1.LJLLI = f4;
        c6c1.invalidate();
    }

    public C156426By(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = 1.0f;
        this.LJLLL = new PointF();
        this.LJLLLL = new PointF();
        this.LJLZ = new ARunnableS6S0101000_2(4, this, 0);
        this.LJZI = -1;
        this.LL = false;
        this.LLD = false;
        this.LLF = 100.0f;
        this.LLFF = 0.01f;
        this.LLFFF = false;
        this.LLFII = 0L;
        this.LLFZ = 0;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLII = false;
        this.LLIIII = AnonymousClass647.LJLIL;
        this.LLIIIILZ = LIZLLL();
    }

    public void LJIL(float f, float f2, Boolean bool) {
        if (this.LJLL != null && bool.booleanValue()) {
            int LIZLLL = ((C6BM) this.LJLL).LIZLLL(false, false, LIZIZ(), LIZJ());
            if (-1 != LIZLLL) {
                PointF LIZIZ = ((C6BM) this.LJLL).LIZIZ(f, f2, LIZIZ());
                if (3 == LIZLLL) {
                    f = LIZIZ.x;
                    f2 = LIZIZ.y;
                }
            }
        }
        float x = this.LJLJL.getX() + f;
        float y = this.LJLJL.getY() + f2;
        C6BR c6br = this.LJLL;
        if (c6br != null && this.LLD) {
            ((C6BM) c6br).LIZ(f, f2);
        }
        this.LJLJL.setX(x);
        this.LJLJL.setY(y);
        this.LJLJJLL.LIZ(f, f2);
    }

    public C156426By(Context context, AttributeSet attributeSet, int i, C82622Wbi c82622Wbi) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = 1.0f;
        this.LJLLL = new PointF();
        this.LJLLLL = new PointF();
        this.LJLZ = new ARunnableS12S0101000_8(2, this, 3);
        this.LJZI = -1;
        this.LL = false;
        this.LLD = false;
        this.LLF = 100.0f;
        this.LLFF = 0.01f;
        this.LLFFF = false;
        this.LLFII = 0L;
        this.LLFZ = 0;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLII = false;
        this.LLIIII = AnonymousClass647.LJLIL;
        this.LLIIIJ = c82622Wbi;
        this.LLIIIILZ = LIZLLL();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLFFF != z) {
            this.LLFFF = z;
            LJIJJLI();
        }
    }
}
