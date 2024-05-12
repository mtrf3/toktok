package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vru, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81078Vru extends AppCompatImageView {
    public boolean LJLIL;
    public Rect LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public View.OnClickListener LJLJLJ;
    public View.OnLongClickListener LJLJLLL;
    public InterfaceC81086Vs2 LJLL;
    public final Matrix LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final PointF LJLLL;
    public final PointF LJLLLL;
    public float LJLLLLLL;
    public C81072Vro LJLZ;
    public C81082Vry LJZ;
    public final GestureDetector LJZI;

    public final void LIZIZ() {
    }

    public final RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        o.LJIIIZ(scaleType, "scaleType");
    }

    public final void LIZ() {
        C81072Vro c81072Vro = this.LJLZ;
        if (c81072Vro != null) {
            c81072Vro.cancel();
            this.LJLZ = null;
        }
        C81082Vry c81082Vry = this.LJZ;
        if (c81082Vry != null) {
            c81082Vry.cancel();
            this.LJZ = null;
        }
    }

    private final float getMinScale() {
        Rect rect;
        int i;
        if (!LJFF() || (rect = this.LJLILLLLZI) == null) {
            return 1.0f;
        }
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        float width = getWidth() / getHeight();
        float width2 = rect.width();
        Rect rect2 = this.LJLILLLLZI;
        if (rect2 != null) {
            i = rect2.height();
        } else {
            i = 1;
        }
        if (intrinsicWidth < width2 / i || intrinsicWidth < width) {
            return (rect.width() / getWidth()) * (getWidth() / (C81081Vrx.LIZIZ(LJ(null))[0] * getDrawable().getIntrinsicWidth()));
        }
        return rect.height() / (getWidth() / intrinsicWidth);
    }

    public final boolean LJFF() {
        if (getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
            return true;
        }
        return false;
    }

    public final float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (LJFF()) {
            if (getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight() < getWidth() / getHeight()) {
                height = getWidth();
                intrinsicHeight = getDrawable().getIntrinsicWidth();
            } else {
                height = getHeight();
                intrinsicHeight = getDrawable().getIntrinsicHeight();
            }
            f = height / intrinsicHeight;
        } else {
            f = 6.0f;
        }
        return Math.max(f, 6.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final int getPinchMode() {
        return this.LJLLILLLL;
    }

    public final RectF LIZJ(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (LJFF()) {
            Matrix LIZLLL = C81081Vrx.LIZLLL();
            LJ(LIZLLL).postConcat(this.LJLLI);
            rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            LIZLLL.mapRect(rectF);
            C81081Vrx.LIZJ(LIZLLL);
        }
        return rectF;
    }

    public final Matrix LJ(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJFF()) {
            RectF LJII = C81081Vrx.LJII(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            RectF LJII2 = C81081Vrx.LJII(getWidth(), getHeight());
            matrix.setRectToRect(LJII, LJII2, Matrix.ScaleToFit.CENTER);
            C81081Vrx.LJFF(LJII2);
            C81081Vrx.LJFF(LJII);
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLLILLLL == 2) {
            return true;
        }
        RectF LIZJ = LIZJ(null);
        if (LIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (LIZJ.right > getWidth()) {
                return true;
            }
        } else if (LIZJ.left < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LJLLILLLL == 2) {
            return true;
        }
        RectF LIZJ = LIZJ(null);
        if (LIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (LIZJ.bottom > getHeight()) {
                return true;
            }
        } else if (LIZJ.top < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (LJFF()) {
            Matrix LIZLLL = C81081Vrx.LIZLLL();
            Matrix LJ = LJ(LIZLLL);
            LJ.postConcat(this.LJLLI);
            setImageMatrix(LJ);
            C81081Vrx.LIZJ(LIZLLL);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int i;
        int width;
        int i2;
        int height;
        int width2;
        int height2;
        float f;
        boolean z;
        float f2;
        float f3;
        boolean z2;
        o.LJIIIZ(event, "event");
        super.onTouchEvent(event);
        int action = event.getAction() & 255;
        boolean z3 = true;
        if (action != 0) {
            float f4 = 1.0f;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6 && this.LJLLILLLL == 2 && event.getPointerCount() > 2) {
                                if ((event.getAction() >> 8) == 0) {
                                    LJII(event.getX(1), event.getY(1), event.getX(2), event.getY(2));
                                } else if ((event.getAction() >> 8) == 1) {
                                    LJII(event.getX(0), event.getY(0), event.getX(2), event.getY(2));
                                }
                            }
                        } else {
                            LIZ();
                            this.LJLLILLLL = 2;
                            LJII(event.getX(0), event.getY(0), event.getX(1), event.getY(1));
                        }
                    }
                } else {
                    C81072Vro c81072Vro = this.LJLZ;
                    if (c81072Vro == null || !c81072Vro.isRunning()) {
                        float applyDimension = TypedValue.applyDimension(3, 5, getResources().getDisplayMetrics());
                        Matrix matrix = new Matrix();
                        matrix.set(this.LJLLI);
                        float[] fArr = new float[9];
                        matrix.getValues(fArr);
                        int i3 = 0;
                        float f5 = 0.0f;
                        do {
                            f5 += fArr[i3];
                            i3++;
                        } while (i3 < 9);
                        if (Math.abs(3.0f - f5) <= 0.01f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (event.getRawY() - this.LJLJI > applyDimension && z2) {
                            this.LJLLILLLL = 3;
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        int i4 = this.LJLLILLLL;
                        if (i4 == 1) {
                            LJIIIIZZ(event.getX() - this.LJLLL.x, event.getY() - this.LJLLL.y);
                            this.LJLLL.set(event.getX(), event.getY());
                        } else if (i4 == 2 && event.getPointerCount() > 1) {
                            float LIZ = C81081Vrx.LIZ(event.getX(0), event.getY(0), event.getX(1), event.getY(1));
                            float x = event.getX(0);
                            float y = event.getY(0);
                            float x2 = event.getX(1);
                            this.LJLLL.set((x + x2) / 2.0f, (y + event.getY(1)) / 2.0f);
                            PointF pointF = this.LJLLLL;
                            float f6 = this.LJLLLLLL;
                            PointF pointF2 = this.LJLLL;
                            if (LJFF()) {
                                float f7 = f6 * LIZ;
                                Matrix LIZLLL = C81081Vrx.LIZLLL();
                                LIZLLL.postScale(f7, f7, pointF.x, pointF.y);
                                LIZLLL.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
                                this.LJLLI.set(LIZLLL);
                                C81081Vrx.LIZJ(LIZLLL);
                                LIZIZ();
                                invalidate();
                            }
                        } else if (this.LJLLILLLL == 3) {
                            this.LJLJJL = (event.getRawY() - this.LJLJI) + this.LJLJJLL;
                            this.LJLJL = (event.getRawX() - this.LJLJJI) + 0.0f;
                            float abs = 1 - Math.abs(this.LJLJJL / (getHeight() + 5));
                            float f8 = 0.2f;
                            if (abs <= 1.0f) {
                                if (abs < 0.2f) {
                                    f4 = 0.2f;
                                } else {
                                    f4 = abs;
                                }
                            }
                            InterfaceC81086Vs2 interfaceC81086Vs2 = this.LJLL;
                            if (interfaceC81086Vs2 != null) {
                                interfaceC81086Vs2.LIZ(f4);
                            }
                            if (f4 >= 0.2f) {
                                f8 = f4;
                            }
                            Matrix LIZLLL2 = C81081Vrx.LIZLLL();
                            LIZLLL2.postTranslate(this.LJLJL, this.LJLJJL);
                            RectF LJI = C81081Vrx.LJI();
                            LIZJ(LJI);
                            float f9 = 2;
                            LIZLLL2.postScale(f8, f8, (LJI.width() / f9) + LJI.left, (LJI.height() / f9) + LJI.top);
                            this.LJLLI.set(LIZLLL2);
                            C81081Vrx.LIZJ(LIZLLL2);
                            LIZIZ();
                            invalidate();
                        }
                    }
                }
                z3 = true;
            }
            int i5 = this.LJLLILLLL;
            if (i5 == 2) {
                if (LJFF()) {
                    Matrix LIZLLL3 = C81081Vrx.LIZLLL();
                    LJ(LIZLLL3).postConcat(this.LJLLI);
                    float f10 = C81081Vrx.LIZIZ(LIZLLL3)[0];
                    float f11 = C81081Vrx.LIZIZ(this.LJLLI)[0];
                    Rect rect = this.LJLILLLLZI;
                    if (rect != null) {
                        boolean z4 = this.LJLIL;
                        if (z4) {
                            i = rect.left;
                        } else {
                            i = 0;
                        }
                        float f12 = i;
                        if (z4) {
                            width = rect.right;
                        } else {
                            width = getWidth();
                        }
                        float f13 = width;
                        boolean z5 = this.LJLIL;
                        if (z5) {
                            i2 = rect.top;
                        } else {
                            i2 = 0;
                        }
                        float f14 = i2;
                        if (z5) {
                            height = rect.bottom;
                        } else {
                            height = getHeight();
                        }
                        float f15 = height;
                        if (this.LJLIL) {
                            width2 = rect.width();
                        } else {
                            width2 = getWidth();
                        }
                        float f16 = width2;
                        if (this.LJLIL) {
                            height2 = rect.height();
                        } else {
                            height2 = getHeight();
                        }
                        float f17 = height2;
                        float maxScale = getMaxScale();
                        if (f10 > maxScale) {
                            f = maxScale / f10;
                        } else {
                            f = 1.0f;
                        }
                        float minScale = getMinScale();
                        if (f11 * f < minScale) {
                            f = minScale / f11;
                        }
                        if (f == 1.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z6 = !z;
                        Matrix LJ = C81081Vrx.LJ(LIZLLL3);
                        PointF pointF3 = this.LJLLL;
                        LJ.postScale(f, f, pointF3.x, pointF3.y);
                        RectF LJII = C81081Vrx.LJII(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
                        LJ.mapRect(LJII);
                        float f18 = LJII.right;
                        float f19 = LJII.left;
                        if (f18 - f19 < f16) {
                            f2 = ((f12 + f13) / 2.0f) - ((f18 + f19) / 2.0f);
                        } else if (f19 > f12) {
                            f2 = f12 - f19;
                        } else if (f18 < f13) {
                            f2 = f13 - f18;
                        } else {
                            f2 = 0.0f;
                        }
                        float f20 = LJII.bottom;
                        float f21 = LJII.top;
                        if (f20 - f21 < f17) {
                            f3 = ((f14 + f15) / 2.0f) - ((f20 + f21) / 2.0f);
                        } else if (f21 > f14) {
                            f3 = f14 - f21;
                        } else if (f20 < f15) {
                            f3 = f15 - f20;
                        } else {
                            f3 = 0.0f;
                        }
                        if (f2 != 0.0f || f3 != 0.0f || z6) {
                            Matrix LJ2 = C81081Vrx.LJ(this.LJLLI);
                            PointF pointF4 = this.LJLLL;
                            LJ2.postScale(f, f, pointF4.x, pointF4.y);
                            LJ2.postTranslate(f2, f3);
                            LIZ();
                            C81072Vro c81072Vro2 = new C81072Vro(this, this.LJLLI, LJ2);
                            this.LJLZ = c81072Vro2;
                            c81072Vro2.start();
                            C81081Vrx.LIZJ(LJ2);
                        }
                        C81081Vrx.LJFF(LJII);
                        C81081Vrx.LIZJ(LJ);
                        C81081Vrx.LIZJ(LIZLLL3);
                    }
                }
            } else if (i5 == 3) {
                if (C81081Vrx.LIZ(event.getRawX(), event.getRawY(), this.LJLJJI, this.LJLJI) > TypedValue.applyDimension(3, 40, getResources().getDisplayMetrics())) {
                    InterfaceC81086Vs2 interfaceC81086Vs22 = this.LJLL;
                    if (interfaceC81086Vs22 != null) {
                        interfaceC81086Vs22.LIZIZ();
                    }
                } else {
                    C81080Vrw c81080Vrw = new C81080Vrw(this, this.LJLJJL);
                    c81080Vrw.setDuration(150L);
                    c81080Vrw.start();
                }
            }
            this.LJLLILLLL = 0;
            z3 = true;
        } else {
            this.LJLJI = event.getRawY();
            this.LJLJJI = event.getRawX();
            C81072Vro c81072Vro3 = this.LJLZ;
            if (c81072Vro3 == null || !c81072Vro3.isRunning()) {
                LIZ();
                this.LJLLILLLL = 1;
                this.LJLLL.set(event.getX(), event.getY());
            }
        }
        this.LJZI.onTouchEvent(event);
        return z3;
    }

    public final void setDisplayWindowRect(Rect rect) {
        this.LJLILLLLZI = rect;
        if (rect != null) {
            this.LJLIL = true;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJLJ = onClickListener;
    }

    public final void setOnDragOuterWidgetsChangeListener(InterfaceC81086Vs2 interfaceC81086Vs2) {
        this.LJLL = interfaceC81086Vs2;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LJLJLLL = onLongClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81078Vru(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLLI = new Matrix();
        this.LJLLL = new PointF();
        this.LJLLLL = new PointF();
        this.LJZI = new GestureDetector(getContext(), new C81079Vrv(this));
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(float r13, float r14) {
        /*
            r12 = this;
            boolean r0 = r12.LJFF()
            r11 = 0
            if (r0 != 0) goto L8
            return r11
        L8:
            android.graphics.Rect r4 = r12.LJLILLLLZI
            if (r4 != 0) goto Ld
            return r11
        Ld:
            android.graphics.RectF r1 = X.C81081Vrx.LJI()
            r12.LIZJ(r1)
            boolean r2 = r12.LJLIL
            if (r2 == 0) goto Lbb
            int r0 = r4.left
        L1a:
            float r9 = (float) r0
            if (r2 == 0) goto Lb5
            int r0 = r4.right
        L1f:
            float r5 = (float) r0
            boolean r2 = r12.LJLIL
            if (r2 == 0) goto Lb2
            int r0 = r4.top
        L26:
            float r3 = (float) r0
            if (r2 == 0) goto Lac
            int r0 = r4.bottom
        L2b:
            float r2 = (float) r0
            boolean r0 = r12.LJLIL
            if (r0 == 0) goto La7
            int r0 = r4.width()
        L34:
            float r10 = (float) r0
            boolean r0 = r12.LJLIL
            if (r0 == 0) goto La2
            int r0 = r4.height()
        L3d:
            float r6 = (float) r0
            float r4 = r1.right
            float r8 = r1.left
            float r0 = r4 - r8
            r7 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L88
        L49:
            r13 = 0
        L4a:
            float r5 = r1.bottom
            float r4 = r1.top
            float r0 = r5 - r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L6e
        L54:
            r14 = 0
        L55:
            X.C81081Vrx.LJFF(r1)
            android.graphics.Matrix r0 = r12.LJLLI
            r0.postTranslate(r13, r14)
            r12.LIZIZ()
            r12.invalidate()
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L6c
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto L6c
        L6b:
            return r11
        L6c:
            r11 = 1
            goto L6b
        L6e:
            float r0 = r4 + r14
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7b
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L54
            float r14 = r3 - r4
            goto L55
        L7b:
            float r0 = r5 + r14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L54
            float r14 = r2 - r5
            goto L55
        L88:
            float r0 = r8 + r13
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L95
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L49
            float r13 = r9 - r8
            goto L4a
        L95:
            float r0 = r4 + r13
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4a
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L49
            float r13 = r5 - r4
            goto L4a
        La2:
            int r0 = r12.getHeight()
            goto L3d
        La7:
            int r0 = r12.getWidth()
            goto L34
        Lac:
            int r0 = r12.getHeight()
            goto L2b
        Lb2:
            r0 = 0
            goto L26
        Lb5:
            int r0 = r12.getWidth()
            goto L1f
        Lbb:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81078Vru.LJIIIIZZ(float, float):boolean");
    }

    public final void LJI(Matrix matrix, long j, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.LJLLILLLL = 0;
        LIZ();
        if (j <= 0) {
            this.LJLLI.set(matrix);
            LIZIZ();
            invalidate();
            return;
        }
        C81072Vro c81072Vro = new C81072Vro(this, this.LJLLI, matrix, j);
        if (animatorListener != null) {
            c81072Vro.addListener(animatorListener);
        }
        if (animatorUpdateListener != null) {
            c81072Vro.addUpdateListener(animatorUpdateListener);
        }
        c81072Vro.start();
        this.LJLZ = c81072Vro;
    }

    public final void LJII(float f, float f2, float f3, float f4) {
        float[] fArr;
        this.LJLLLLLL = C81081Vrx.LIZIZ(this.LJLLI)[0] / C81081Vrx.LIZ(f, f2, f3, f4);
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LJLLI;
        if (matrix != null) {
            fArr = new float[2];
            Matrix LIZLLL = C81081Vrx.LIZLLL();
            matrix.invert(LIZLLL);
            LIZLLL.mapPoints(fArr, fArr2);
            C81081Vrx.LIZJ(LIZLLL);
        } else {
            fArr = new float[2];
        }
        this.LJLLLL.set(fArr[0], fArr[1]);
    }
}
