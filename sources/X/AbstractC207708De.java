package X;

import android.content.Context;
import android.content.res.TypedArray;
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

/* renamed from: X.8De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC207708De extends View {
    public final SY9 LJLIL;
    public final PorterDuffXfermode LJLILLLLZI;
    public final Paint LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public int LJLL;

    public void LIZ(float f) {
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        if (this.LJLJL) {
            return super.getPaddingLeft() - ((int) (this.LJLJJI * 0.0625f));
        }
        return super.getPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        if (this.LJLJL) {
            return super.getPaddingRight() - ((int) (this.LJLJJI * 0.0625f));
        }
        return super.getPaddingRight();
    }

    private final int getStartOffset() {
        if (C26338AVi.LIZLLL(this)) {
            return (getWidth() - getPaddingRight()) - this.LJLJJI;
        }
        return getPaddingLeft();
    }

    public final boolean getHasOffset() {
        return this.LJLJL;
    }

    public final boolean getRatingEnableTouch() {
        return this.LJLJJLL;
    }

    public final int getRatingSize() {
        return this.LJLJJI;
    }

    public final int getRatingSpacing() {
        return this.LJLJJL;
    }

    public final float getRatingValue() {
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OSZ osz;
        if (canvas == null) {
            return;
        }
        int paddingTop = getPaddingTop();
        int i = this.LJLJJI + paddingTop;
        int startOffset = getStartOffset();
        this.LJLIL.LJ(this.LJLJLLL);
        int i2 = 0;
        do {
            this.LJLIL.setBounds(startOffset, paddingTop, this.LJLJJI + startOffset, i);
            this.LJLIL.draw(canvas);
            if (C26338AVi.LIZLLL(this)) {
                startOffset = (startOffset - this.LJLJJI) - this.LJLJJL;
            } else {
                startOffset = startOffset + this.LJLJJI + this.LJLJJL;
            }
            i2++;
        } while (i2 < 5);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LJLJI, 31);
        this.LJLJI.setXfermode(this.LJLILLLLZI);
        int i3 = (int) this.LJLJLJ;
        int startOffset2 = getStartOffset();
        this.LJLIL.LJ(this.LJLL);
        for (int i4 = 0; i4 < i3; i4++) {
            this.LJLIL.setBounds(startOffset2, paddingTop, this.LJLJJI + startOffset2, i);
            this.LJLIL.draw(canvas);
            if (C26338AVi.LIZLLL(this)) {
                startOffset2 = (startOffset2 - this.LJLJJI) - this.LJLJJL;
            } else {
                startOffset2 = startOffset2 + this.LJLJJI + this.LJLJJL;
            }
        }
        double d = (this.LJLJLJ - i3) + 0.05d;
        if (!this.LJLJJLL && d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d >= 0.1d) {
            double d2 = (((int) (d / 0.1d)) * 0.07d) + 0.15d;
            if (C26338AVi.LIZLLL(this)) {
                osz = new OSZ(Integer.valueOf(((int) ((1 - d2) * this.LJLJJI)) + startOffset2), Integer.valueOf(this.LJLJJI + startOffset2));
            } else {
                osz = new OSZ(Integer.valueOf(startOffset2), Integer.valueOf(((int) (this.LJLJJI * d2)) + startOffset2));
            }
            canvas.clipRect(((Number) osz.getFirst()).intValue(), paddingTop, ((Number) osz.getSecond()).intValue(), i);
            this.LJLIL.setBounds(startOffset2, paddingTop, this.LJLJJI + startOffset2, i);
            this.LJLIL.draw(canvas);
        }
        this.LJLJI.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLJJLL && isEnabled()) {
            int action = event.getAction();
            if (action != 0) {
                if (action == 2) {
                    LIZIZ(event.getX(), false);
                    return true;
                }
            } else {
                LIZIZ(event.getX(), true);
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setActiveColor(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            this.LJLL = LJI.intValue();
            invalidate();
        }
    }

    public final void setHasOffset(boolean z) {
        this.LJLJL = z;
    }

    public final void setInactiveColor(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            this.LJLJLLL = LJI.intValue();
            invalidate();
        }
    }

    public final void setRatingEnableTouch(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setRatingSize(int i) {
        if (this.LJLJJI != i) {
            this.LJLJJI = i;
            this.LJLIL.LJI(i);
            this.LJLIL.LIZLLL(this.LJLJJI);
        }
    }

    public final void setRatingSpacing(int i) {
        this.LJLJJL = i;
    }

    public final void setRatingValue(float f) {
        if (this.LJLJLJ == f) {
            return;
        }
        this.LJLJLJ = f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC207708De(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.kf);
        o.LJIIIZ(context, "context");
    }

    public final void LIZIZ(float f, boolean z) {
        int paddingLeft;
        float f2 = 5.0f;
        boolean z2 = true;
        if (C26338AVi.LIZLLL(this)) {
            if (f < getWidth() - getPaddingLeft()) {
                if (f >= getPaddingRight()) {
                    int i = this.LJLJJL;
                    paddingLeft = (int) (((((getWidth() - getPaddingLeft()) - f) + (i / 2)) / (this.LJLJJI + i)) + 1);
                    f2 = paddingLeft;
                }
            }
            f2 = 1.0f;
        } else {
            if (f > getPaddingLeft()) {
                if (f <= getWidth() - getPaddingRight()) {
                    int i2 = this.LJLJJL;
                    paddingLeft = (int) ((((f - getPaddingLeft()) + (i2 / 2)) / (this.LJLJJI + i2)) + 1);
                    f2 = paddingLeft;
                }
            }
            f2 = 1.0f;
        }
        if (f2 != this.LJLJLJ) {
            z2 = false;
        }
        if (!z2) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            new C61996OUu(context).LIZ(0);
            setRatingValue(f2);
            LIZ(f2);
            return;
        }
        if (!z) {
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        new C61996OUu(context2).LIZ(0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LJLJJI;
        int i4 = this.LJLJJL;
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (((i3 + i4) * 5) - i4), getPaddingBottom() + getPaddingTop() + this.LJLJJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC207708De(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q9, R.attr.bt0, R.attr.bt2}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…xRating, defStyleAttr, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.LJLJLLL = obtainStyledAttributes.getColor(2, 0);
        this.LJLL = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = resourceId;
        this.LJLIL = c2068389v.LIZ(context);
    }
}
