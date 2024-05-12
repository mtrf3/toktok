package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.SkV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72975SkV extends View {
    public int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public final RectF LJLL;
    public final RectF LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public InterfaceC72976SkW LJLLL;
    public C72977SkX<Boolean> LJLLLL;
    public boolean LJLLLLLL;
    public final float LJLZ;
    public float LJZ;

    public final void LIZ() {
        float f = this.LJLJL;
        float f2 = this.LJLJJLL;
        if (f == f2) {
            return;
        }
        float f3 = (this.LJLLILLLL - f2) / (f - f2);
        if (Math.abs(this.LJZ - f3) > this.LJLZ) {
            this.LJZ = f3;
            InterfaceC72976SkW interfaceC72976SkW = this.LJLLL;
            if (interfaceC72976SkW != null) {
                interfaceC72976SkW.LIZ(f3);
            }
        }
    }

    public final float getPercentage() {
        float f = this.LJLJL;
        float f2 = this.LJLJJLL;
        if (f == f2) {
            return 0.0f;
        }
        return (this.LJLLILLLL - f2) / (f - f2);
    }

    public final C72977SkX<Boolean> getScrolling() {
        return this.LJLLLL;
    }

    public final boolean getStart() {
        return this.LJLLLLLL;
    }

    public final int getThumbColor() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingTop = (this.LJLJI - getPaddingTop()) - getPaddingBottom();
        float paddingStart = (this.LJLILLLLZI - getPaddingStart()) - getPaddingEnd();
        float LIZ = B9K.LIZ(getContext(), 2.0f);
        this.LJLL.set(getPaddingStart(), getPaddingTop(), getPaddingStart() + paddingStart, getPaddingTop() + paddingTop);
        if (canvas != null) {
            canvas.drawRoundRect(this.LJLL, LIZ, LIZ, this.LJLJLJ);
        }
        RectF rectF = this.LJLLI;
        float f = this.LJLLILLLL;
        float f2 = this.LJLJJL;
        float f3 = 2;
        float f4 = this.LJLJI;
        float f5 = this.LJLJJI;
        rectF.set(f - (f2 / f3), (f4 - f5) / f3, (f - (f2 / f3)) + f2, ((f4 - f5) / f3) + f5);
        if (canvas != null) {
            canvas.drawRoundRect(this.LJLLI, LIZ, LIZ, this.LJLJLLL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.LJLLLLLL) {
            return true;
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (valueOf.intValue() == 3 || valueOf.intValue() == 1) {
                this.LJLLLL.LIZIZ(Boolean.FALSE);
                this.LJLLJ = 0.0f;
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                if (valueOf.intValue() == 2) {
                    float x = motionEvent.getX() - this.LJLLJ;
                    if (this.LJLLLL.LIZIZ.booleanValue()) {
                        float f = this.LJLJJLL;
                        if (x <= this.LJLJL && f <= x) {
                            this.LJLLILLLL = x;
                            LIZ();
                            invalidate();
                            return true;
                        }
                    }
                    if (!this.LJLLLL.LIZIZ.booleanValue()) {
                        return true;
                    }
                    float f2 = this.LJLJJLL;
                    if (x < f2) {
                        this.LJLLILLLL = f2;
                        LIZ();
                        invalidate();
                        return true;
                    }
                    float f3 = this.LJLJL;
                    if (x <= f3) {
                        return true;
                    }
                    this.LJLLILLLL = f3;
                    LIZ();
                    invalidate();
                    return true;
                }
                if (valueOf.intValue() == 0) {
                    float LIZ = B9K.LIZ(getContext(), 3.0f);
                    RectF rectF = this.LJLLI;
                    if (new RectF(rectF.left - LIZ, rectF.top - LIZ, rectF.right + LIZ, rectF.bottom + LIZ).contains(motionEvent.getX(), motionEvent.getY())) {
                        this.LJLLJ = motionEvent.getX() - this.LJLLILLLL;
                        this.LJLLLL.LIZIZ(Boolean.TRUE);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            return false;
        }
        this.LJLLLL.LIZIZ(Boolean.FALSE);
        return false;
    }

    public final void setMotionEventMoveListener(InterfaceC72976SkW listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLL = listener;
    }

    public final void setPercentage(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (C90193gN.LIZIZ(getContext())) {
            f = 1 - f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.LJLJL;
        float f3 = this.LJLJJLL;
        this.LJLLILLLL = C06420Na.LIZIZ(f2, f3, f, f3);
        invalidate();
    }

    public final void setScrolling(C72977SkX<Boolean> c72977SkX) {
        o.LJIIIZ(c72977SkX, "<set-?>");
        this.LJLLLL = c72977SkX;
    }

    public final void setStart(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setThumbColor(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72975SkV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        Paint paint = new Paint();
        this.LJLJLJ = paint;
        Paint paint2 = new Paint();
        this.LJLJLLL = paint2;
        this.LJLL = new RectF();
        this.LJLLI = new RectF();
        this.LJLLLL = new C72977SkX<>(Boolean.FALSE);
        int LIZIZ = b.LIZIZ(R.attr.db, getContext());
        this.LJLIL = b.LIZIZ(R.attr.dj, getContext());
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint.setColor(LIZIZ);
        paint2.setColor(this.LJLIL);
        this.LJLJJI = B9K.LIZ(getContext(), 10.0f);
        this.LJLJJL = B9K.LIZ(getContext(), 24.0f);
        this.LJLZ = 0.001f;
        this.LJZ = -1.0f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredWidth();
        this.LJLJI = getMeasuredHeight();
        float f = 2;
        this.LJLJJLL = (this.LJLJJL / f) + getPaddingStart();
        this.LJLJL = (this.LJLILLLLZI - getPaddingEnd()) - (this.LJLJJL / f);
        if (this.LJLLILLLL <= 0.001f) {
            if (C90193gN.LIZ()) {
                this.LJLLILLLL = this.LJLJL;
            } else {
                this.LJLLILLLL = this.LJLJJLL;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        float f = 2;
        this.LJLJJLL = (this.LJLJJL / f) + getPaddingStart();
        this.LJLJL = (this.LJLILLLLZI - getPaddingEnd()) - (this.LJLJJL / f);
    }
}
