package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.5X8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5X8 extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public final float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final float LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public final Paint LJLLI;
    public final ValueAnimator LJLLILLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLJ;
    public Path LJLLL;
    public final float LJLJJI = -0.5f;
    public final RectF LJLL = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJLJJLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJLJJL;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.save();
        float f = this.LJLJJLL;
        float f2 = 2;
        float f3 = f / f2;
        Path LIZ = C5X9.LIZ(this.LJLLL, this.LJLJJL, f, f3, f3);
        this.LJLLL = LIZ;
        canvas.drawPath(LIZ, this.LJLLI);
        canvas.drawColor(this.LJLJI);
        canvas.skew(this.LJLJJI, 0.0f);
        this.LJLLI.setColor(this.LJLILLLLZI);
        int i = this.LJLJLLL;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = this.LJLJL;
            this.LJLL.offsetTo(((i2 * f4) - (f4 / f2)) + this.LJLJLJ, 0.0f);
            canvas.drawRect(this.LJLL, this.LJLLI);
        }
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        this.LJLJLJ = f % this.LJLJL;
        invalidateSelf();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        o.LJIIIZ(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.LJLJJL = bounds.width();
        this.LJLJJLL = bounds.height();
        this.LJLJLLL = ((int) Math.ceil(this.LJLJJL / this.LJLJL)) + 2;
        this.LJLL.set(0.0f, 0.0f, this.LJLIL, this.LJLJJLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLLI.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJLLI.setColorFilter(colorFilter);
    }

    public C5X8(float f, int i, float f2, int i2) {
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        float f3 = f + f2;
        this.LJLJL = f3;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJLLI = paint;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, f3);
        valueAnimator.setDuration(500L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        this.LJLLILLLL = valueAnimator;
    }
}
