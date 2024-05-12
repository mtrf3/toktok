package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.84G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84G extends View {
    public final SY9 LJLIL;
    public final PorterDuffXfermode LJLILLLLZI;
    public final Paint LJLJI;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public float LJLL;

    public final int getRatingActiveColor() {
        return this.LJLJJLL;
    }

    public final int getRatingColor() {
        return this.LJLJJL;
    }

    public final boolean getRatingEnableTouch() {
        return this.LJLJLLL;
    }

    public final int getRatingSize() {
        return this.LJLJL;
    }

    public final int getRatingSpacing() {
        return this.LJLJLJ;
    }

    public final float getRatingValue() {
        return this.LJLL;
    }

    public final float LIZ(float f) {
        int paddingLeft;
        if (C26338AVi.LIZLLL(this)) {
            if (f <= getWidth() - getPaddingLeft()) {
                if (f < getPaddingRight()) {
                    return 5.0f;
                }
                paddingLeft = (int) ((((getWidth() - getPaddingLeft()) - f) / (this.LJLJL + this.LJLJLJ)) + 1);
                return paddingLeft;
            }
            return 0.0f;
        }
        if (f >= getPaddingLeft()) {
            if (f > getWidth() - getPaddingRight()) {
                return 5.0f;
            }
            paddingLeft = (int) (((f - getPaddingLeft()) / (this.LJLJL + this.LJLJLJ)) + 1);
            return paddingLeft;
        }
        return 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        if (canvas == null) {
            return;
        }
        int i5 = this.LJLJLJ / 2;
        int paddingTop = getPaddingTop() + i5;
        int i6 = this.LJLJL + paddingTop;
        int paddingLeft = getPaddingLeft();
        if (C26338AVi.LIZLLL(this)) {
            i = ((getWidth() - paddingLeft) - i5) - this.LJLJL;
        } else {
            i = paddingLeft + i5;
        }
        this.LJLIL.LJ(this.LJLJJL);
        int i7 = 0;
        do {
            this.LJLIL.setBounds(i, paddingTop, this.LJLJL + i, i6);
            this.LJLIL.draw(canvas);
            if (C26338AVi.LIZLLL(this)) {
                i -= this.LJLJL + this.LJLJLJ;
            } else {
                i = this.LJLJL + this.LJLJLJ + i;
            }
            i7++;
        } while (i7 < 5);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LJLJI, 31);
        this.LJLJI.setXfermode(this.LJLILLLLZI);
        int i8 = (int) this.LJLL;
        if (C26338AVi.LIZLLL(this)) {
            i2 = ((getWidth() - paddingLeft) - i5) - this.LJLJL;
        } else {
            i2 = paddingLeft + i5;
        }
        this.LJLIL.LJ(this.LJLJJLL);
        for (int i9 = 0; i9 < i8; i9++) {
            this.LJLIL.setBounds(i2, paddingTop, this.LJLJL + i2, i6);
            this.LJLIL.draw(canvas);
            if (C26338AVi.LIZLLL(this)) {
                i2 -= this.LJLJL + this.LJLJLJ;
            } else {
                i2 = this.LJLJL + this.LJLJLJ + i2;
            }
        }
        double d = (this.LJLL - i8) + 0.05d;
        if (!this.LJLJLLL && d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d >= 0.1d) {
            double d2 = (((int) (d / 0.1d)) * 0.07d) + 0.15d;
            if (C26338AVi.LIZLLL(this)) {
                int i10 = this.LJLJL;
                i4 = ((int) ((1 - d2) * i10)) + i2;
                i3 = i10 + i2;
            } else {
                i3 = ((int) (this.LJLJL * d2)) + i2;
                i4 = i2;
            }
            canvas.clipRect(i4, paddingTop, i3, i6);
            this.LJLIL.setBounds(i2, paddingTop, this.LJLJL + i2, i6);
            this.LJLIL.draw(canvas);
        }
        this.LJLJI.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLJLLL) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns = this.LJLJJI;
                            if (interfaceC88472Yns != null) {
                                interfaceC88472Yns.invoke(Float.valueOf(this.LJLL));
                            }
                            return true;
                        }
                    } else {
                        setRatingValue(LIZ(event.getX()));
                        return true;
                    }
                } else {
                    InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
                    if (interfaceC88472Yns2 != null) {
                        interfaceC88472Yns2.invoke(Float.valueOf(this.LJLL));
                    }
                    return true;
                }
            } else {
                setRatingValue(LIZ(event.getX()));
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setOnStarChanged$topic_release(InterfaceC88472Yns<? super Float, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    public final void setRatingActiveColor(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            invalidate();
        }
    }

    public final void setRatingColor(int i) {
        if (this.LJLJJL != i) {
            this.LJLJJL = i;
            invalidate();
        }
    }

    public final void setRatingEnableTouch(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setRatingSize(int i) {
        if (this.LJLJL != i) {
            this.LJLJL = i;
            this.LJLIL.LJI(i);
            this.LJLIL.LIZLLL(this.LJLJL);
            requestLayout();
        }
    }

    public final void setRatingSpacing(int i) {
        if (this.LJLJLJ != i) {
            this.LJLJLJ = i;
            requestLayout();
        }
    }

    public final void setRatingValue(float f) {
        if (this.LJLL == f) {
            return;
        }
        this.LJLL = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = paint;
        Integer LJI = C79045V0n.LJI(R.attr.dz, context);
        if (LJI != null) {
            setRatingColor(LJI.intValue());
        }
        Integer LJI2 = C79045V0n.LJI(R.attr.c6, context);
        if (LJI2 != null) {
            setRatingActiveColor(LJI2.intValue());
        }
        setRatingSpacing(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        setRatingEnableTouch(true);
        setRatingValue(0.0f);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_star_fill;
        c2068389v.LIZLLL = Integer.valueOf(this.LJLJJL);
        this.LJLIL = c2068389v.LIZ(context);
        setRatingSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + ((this.LJLJL + this.LJLJLJ) * 5), getPaddingBottom() + getPaddingTop() + this.LJLJL + this.LJLJLJ);
    }
}
