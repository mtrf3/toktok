package X;

import Y.ALAdapterS4S0300000_8;
import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS96S0100000_8;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class KLD extends View {
    public static final float LLIIIL = C17N.LJIILL(72.0d);
    public static final float LLIIIZ = C17N.LJIILL(1.0d);
    public static final float LLIIJI = C17N.LJIILL(30.0d);
    public static final float LLIIJLIL = C17N.LJIILL(12.0d);
    public static final float LLIIL = C17N.LJIILL(12.0d);
    public static final float LLIILII = C17N.LJIILL(8.0d);
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public boolean LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final PointF LJLLL;
    public KLI LJLLLL;
    public Animator LJLLLLLL;
    public Animator LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public RectF LLD;
    public final RectF LLF;
    public final RectF LLFF;
    public KLC LLFFF;
    public KLC LLFII;
    public List<KLC> LLFZ;
    public boolean LLI;
    public PhotoSearchBottomPanelViewModel LLIFFJFJJ;
    public boolean LLII;
    public final RectF LLIIII;
    public final RectF LLIIIILZ;
    public KJT LLIIIJ;

    public void LJIIJ(RectF rect) {
        o.LJIIIZ(rect, "rect");
    }

    public RectF getPhotoDisplayRect() {
        return null;
    }

    public final void LJIIIIZZ() {
        boolean z;
        List<KLC> list = this.LLFZ;
        if (list != null) {
            int i = 0;
            for (KLC klc : list) {
                int i2 = i + 1;
                boolean z2 = true;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                klc.LJLJJL = z;
                if (i == 0 || i == list.size() - 1) {
                    z2 = false;
                }
                klc.LJLJJI = z2;
                if (klc.LJLJJL) {
                    this.LLFFF = klc;
                }
                i = i2;
            }
        }
    }

    public void LJIIIZ() {
        RectF rectF = this.LLFF;
        rectF.left = getLeft();
        rectF.top = getTop();
        rectF.right = getRight();
        rectF.bottom = getBottom();
    }

    public final RectF getCurrentRect() {
        RectF rectF = this.LLF;
        rectF.left = KLL.LEFT.getCoordinate();
        rectF.top = KLL.TOP.getCoordinate();
        rectF.right = KLL.RIGHT.getCoordinate();
        rectF.bottom = KLL.BOTTOM.getCoordinate();
        return rectF;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Animator animator;
        Animator animator2 = this.LJLLLLLL;
        if (animator2 != null && animator2.isRunning() && (animator = this.LJLLLLLL) != null) {
            animator.cancel();
        }
        Animator animator3 = this.LJLZ;
        if (animator3 != null) {
            animator3.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final PhotoSearchBottomPanelViewModel getBottomPanelViewModel() {
        return this.LLIFFJFJJ;
    }

    public final RectF getContainerRect() {
        return this.LLFF;
    }

    public final KLC getCurrentExpandedPoint() {
        return this.LLFFF;
    }

    public final boolean getNeedInvalidCorner() {
        return this.LJLJL;
    }

    public final boolean getNeedUpdateRect() {
        return this.LL;
    }

    public final KJT getOnRectMoveListener() {
        return this.LLIIIJ;
    }

    public final List<KLC> getPointList() {
        return this.LLFZ;
    }

    public final boolean getShouldShowPoints() {
        return this.LLII;
    }

    public final RectF getTitleRoundRect() {
        return this.LLIIIILZ;
    }

    public final boolean getTouchable() {
        return this.LLI;
    }

    public final KLC getVirtualCirclePoint() {
        return this.LLFII;
    }

    public static RectF LIZLLL(KLC klc) {
        RectF rectF = new RectF();
        PointF pointF = klc.LJLJI;
        float f = pointF.x;
        float f2 = LLIIIZ / 4;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f2 + f3;
        return rectF;
    }

    public final RectF LJ(KLC klc) {
        RectF rectF = klc.LJLILLLLZI;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        float width = rectF2.width();
        float f = LLIIIL;
        if (width < f) {
            float width2 = (f - rectF2.width()) / 2;
            float f2 = rectF2.left - width2;
            rectF2.left = f2;
            float f3 = rectF2.right + width2;
            rectF2.right = f3;
            if (f2 <= 0.0f) {
                rectF2.left = 0.0f;
            }
            if (f3 >= getRight() && getRight() != 0) {
                rectF2.right = getRight();
            }
        }
        if (rectF2.height() < f) {
            float height = (f - rectF2.height()) / 2;
            float f4 = rectF2.top - height;
            rectF2.top = f4;
            float f5 = rectF2.bottom + height;
            rectF2.bottom = f5;
            if (f4 <= 0.0f) {
                rectF2.top = 0.0f;
            }
            if (f5 >= getBottom() && getBottom() != 0) {
                rectF2.bottom = getBottom();
            }
        }
        return rectF2;
    }

    public float LJI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return event.getY();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJZ) {
            canvas.drawColor(C51452KHg.LIZ);
            if (this.LJZI) {
                RectF rectF = this.LLD;
                if (rectF != null) {
                    LJFF(canvas, rectF);
                }
                LJFF(canvas, getCurrentRect());
            }
            if (this.LLII) {
                this.LJLILLLLZI.setStrokeWidth(this.LJLLI * 1.4f);
                List<KLC> list = this.LLFZ;
                if (list != null) {
                    int i = 0;
                    for (KLC klc : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            KLC klc2 = klc;
                            if (klc2.LJLJJI) {
                                PointF pointF = klc2.LJLJI;
                                float f = pointF.x;
                                float f2 = pointF.y;
                                float f3 = this.LJLLI;
                                canvas.drawCircle(f, f2, f3, this.LJLILLLLZI);
                                canvas.drawCircle(f, f2, this.LJLL, this.LJLIL);
                                RectF rectF2 = klc2.LJLJJLL;
                                rectF2.top = f2 - f3;
                                rectF2.bottom = f2 + f3;
                                rectF2.left = f - f3;
                                rectF2.right = f + f3;
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c9, code lost:
    
        if (r6 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027b, code lost:
    
        if (r2 > r24.LJLLILLLL) goto L91;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLD.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBottomPanelViewModel(PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel) {
        this.LLIFFJFJJ = photoSearchBottomPanelViewModel;
    }

    public final void setCurrentExpandedPoint(KLC klc) {
        this.LLFFF = klc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3.LJLJJI == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        LJIIIIZZ();
        setCurrentRect(LJ(r3));
        r3.LJLJJI = false;
        invalidate();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCurrentPoint(int r7) {
        /*
            r6 = this;
            r0 = 1
            r6.LJZI = r0
            java.util.List<X.KLC> r0 = r6.LLFZ
            if (r0 == 0) goto L5d
            java.util.Iterator r5 = r0.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r5.next()
            X.KLC r3 = (X.KLC) r3
            int r4 = r3.LJLIL
            if (r4 != r7) goto L46
            if (r7 != 0) goto L46
            android.graphics.RectF r2 = r3.LJLILLLLZI
            float r0 = r2.left
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            float r0 = r2.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            float r0 = r2.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            float r0 = r2.bottom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            r6.LJIIIIZZ()
            android.graphics.RectF r0 = r6.LJ(r3)
            r6.setCurrentRect(r0)
            r6.invalidate()
            goto Lb
        L46:
            if (r4 != r7) goto Lb
            boolean r0 = r3.LJLJJI
            if (r0 == 0) goto Lb
            r6.LJIIIIZZ()
            android.graphics.RectF r0 = r6.LJ(r3)
            r6.setCurrentRect(r0)
            r0 = 0
            r3.LJLJJI = r0
            r6.invalidate()
            goto Lb
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLD.setCurrentPoint(int):void");
    }

    public final void setCurrentRect(RectF rectF) {
        KLL.LEFT.setCoordinate(rectF.left);
        KLL.TOP.setCoordinate(rectF.top);
        KLL.RIGHT.setCoordinate(rectF.right);
        KLL.BOTTOM.setCoordinate(rectF.bottom);
    }

    public final void setNeedInvalidCorner(boolean z) {
        this.LJLJL = z;
    }

    public final void setNeedUpdateRect(boolean z) {
        this.LL = z;
    }

    public final void setOnRectMoveListener(KJT kjt) {
        this.LLIIIJ = kjt;
    }

    public final void setPointList(List<KLC> list) {
        int i;
        this.LLFZ = list;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        KLC klc = new KLC(i, new RectF(-1.0f, -1.0f, -1.0f, -1.0f), false, true, 52);
        this.LLFII = klc;
        if (list != null) {
            list.add(klc);
        }
    }

    public final void setShouldShowPoints(boolean z) {
        this.LLII = z;
    }

    public final void setTouchable(boolean z) {
        this.LLI = z;
    }

    public final void setVirtualCirclePoint(KLC klc) {
        this.LLFII = klc;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KLD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJFF(Canvas canvas, RectF rectF) {
        LJIIJ(rectF);
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = LLIIL;
        Canvas canvas2 = canvas;
        canvas2.drawRoundRect(rectF, f5, f5, this.LJLJI);
        if (this.LJLJL) {
            this.LLIIII.set(f, f2, f3, (f4 - (2.0f * f5)) - this.LJLLJ);
            canvas2.drawRoundRect(this.LLIIII, f5, f5, this.LJLJJI);
        }
        RectF rectF2 = this.LLIIII;
        float f6 = this.LJLLJ;
        rectF2.set(f + f6, f2 + f6, f3 - f6, f4 - f6);
        RectF rectF3 = this.LLIIII;
        float f7 = LLIILII;
        canvas2.drawRoundRect(rectF3, f7, f7, this.LJLJJL);
        float f8 = LLIIJI;
        float f9 = f + f8;
        float f10 = f3 - f8;
        float width = rectF.width();
        float f11 = LLIIIL;
        if (width < f11) {
            float centerX = rectF.centerX();
            float f12 = LLIIJLIL;
            f9 = centerX - (f12 / 2);
            f10 = f12 + f9;
        }
        float f13 = f2 + f8;
        float f14 = f4 - f8;
        if (rectF.height() < f11) {
            float centerY = rectF.centerY();
            float f15 = LLIIJLIL;
            f13 = centerY - (f15 / 2);
            f14 = f15 + f13;
        }
        Animator animator = this.LJLLLLLL;
        if (animator != null && animator.isRunning()) {
            float f16 = 2;
            if (rectF.width() < this.LJLLI * f16 || rectF.height() < this.LJLLI * f16) {
                return;
            }
        }
        if (f10 > f9) {
            float f17 = this.LJLLJ;
            canvas2.drawRect(f9, ((f17 / 2) + f2) - 1.0f, f10, f17 + f2 + 1.0f, this.LJLJJL);
            float f18 = this.LJLLJ;
            canvas2.drawRect(f9, (f4 - f18) - 1.0f, f10, (f4 - (f18 / 2)) + 1.0f, this.LJLJJL);
        }
        if (f14 > f13) {
            float f19 = this.LJLLJ;
            canvas2.drawRect(((f19 / 2) + f) - 1.0f, f13, f19 + f + 1.0f, f14, this.LJLJJL);
            float f20 = this.LJLLJ;
            canvas2.drawRect((f3 - f20) - 1.0f, f13, (f3 - (f20 / 2)) + 1.0f, f14, this.LJLJJL);
        }
        if (f10 > f9) {
            canvas2.drawRect(f9, f2 - 1.0f, f10, (this.LJLLJ / 2) + f2 + 1.0f, this.LJLJJLL);
            canvas2 = canvas2;
            canvas2.drawRect(f9, (f4 - (this.LJLLJ / 2)) - 1.0f, f10, f4 + 1.0f, this.LJLJJLL);
        }
        if (f14 > f13) {
            canvas2.drawRect(f - 1.0f, f13, (this.LJLLJ / 2) + f + 1.0f, f14, this.LJLJJLL);
            canvas2.drawRect((f3 - (this.LJLLJ / 2)) - 1.0f, f13, f3 + 1.0f, f14, this.LJLJJLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.KLC, T, java.lang.Object] */
    public final void LJII(KLC klc, boolean z) {
        setCurrentRect(klc.LJLILLLLZI);
        C68322mC c68322mC = new C68322mC();
        ?? r0 = this.LLFFF;
        c68322mC.element = r0;
        if (o.LJ(klc, r0)) {
            c68322mC.element = null;
        }
        RectF LIZLLL = LIZLLL(klc);
        this.LLFFF = klc;
        RectF LJ = LJ(klc);
        if (c68322mC.element != 0) {
            KJT kjt = this.LLIIIJ;
            if (kjt != null && !z) {
                kjt.LIZIZ(LJ, klc);
            }
            RectF LIZLLL2 = LIZLLL((KLC) c68322mC.element);
            LIZJ(this, LIZLLL, LJ, new AUListenerS96S0100000_8(this, 11), new KLE(this, klc, LJ((KLC) c68322mC.element), LIZLLL2), new AqS155S0200000_8(c68322mC, (C68322mC<KLC>) this, (KLD) 41), 32);
            return;
        }
        LIZJ(this, getCurrentRect(), LJ, new AUListenerS96S0100000_8(this, 13), new AUListenerS96S0100000_8(this, 12), null, 48);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setAlpha(51);
        this.LJLILLLLZI = paint2;
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LJLJI = LIZIZ;
        Paint LIZIZ2 = C6D8.LIZIZ(true);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        LIZIZ2.setAlpha(36);
        LIZIZ2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LJLJJI = LIZIZ2;
        Paint LIZIZ3 = C6D8.LIZIZ(true);
        LIZIZ3.setStyle(Paint.Style.FILL);
        LIZIZ3.setColor(-1);
        LIZIZ3.setAlpha(36);
        LIZIZ3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LJLJJL = LIZIZ3;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LJLJJLL = paint3;
        this.LJLJLJ = C17N.LJIILL(20.0d);
        this.LJLJLLL = C17N.LJIILL(3.0d);
        this.LJLL = C17N.LJIILL(8.0d);
        this.LJLLI = C17N.LJIILL(12.0d);
        this.LJLLILLLL = C17N.LJIILL(5.0d);
        this.LJLLJ = C17N.LJIILL(5.0d);
        this.LJLLL = new PointF();
        this.LJZI = true;
        this.LLF = new RectF();
        this.LLFF = new RectF();
        this.LLI = true;
        Paint paint4 = new Paint();
        paint4.setFilterBitmap(true);
        setLayerType(1, paint4);
        this.LLII = true;
        this.LLIIII = new RectF();
        this.LLIIIILZ = new RectF();
    }

    public final void LIZIZ(RectF rectF, RectF rectF2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Boolean bool) {
        this.LJZ = true;
        RectF rectF3 = new RectF();
        Animator animator = this.LJLLLLLL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJLZ;
        if (animator2 != null) {
            animator2.cancel();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new KLF(rectF3), rectF, rectF2);
        ofObject.setInterpolator(new SJL());
        ofObject.addUpdateListener(animatorUpdateListener);
        ofObject.setDuration(300L);
        ofObject.addListener(new ALAdapterS4S0300000_8(this, interfaceC65784Pro, bool, 3));
        this.LJLLLLLL = ofObject;
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new KLG(rectF3), rectF, rectF2);
        ofObject2.setInterpolator(new SJL());
        ofObject2.addUpdateListener(animatorUpdateListener2);
        ofObject2.setDuration(300L);
        ofObject2.addListener(new ALAdapterS6S0100000_8(this, 10));
        this.LJLZ = ofObject2;
        o.LJ(bool, Boolean.TRUE);
        Animator animator3 = this.LJLLLLLL;
        if (animator3 != null) {
            animator3.start();
        }
        Animator animator4 = this.LJLZ;
        if (animator4 != null) {
            animator4.start();
        }
    }

    public static /* synthetic */ void LIZJ(KLD kld, RectF rectF, RectF rectF2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener2, AqS155S0200000_8 aqS155S0200000_8, int i) {
        AqS155S0200000_8 aqS155S0200000_82 = aqS155S0200000_8;
        Boolean bool = null;
        if ((i & 16) != 0) {
            aqS155S0200000_82 = null;
        }
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        }
        kld.LIZIZ(rectF, rectF2, animatorUpdateListener, animatorUpdateListener2, aqS155S0200000_82, bool);
    }
}
