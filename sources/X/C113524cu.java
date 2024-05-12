package X;

import Y.AUListenerS90S0100000_1;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.4cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113524cu extends SY9 {
    public float LJIILLIIL;
    public final ValueAnimator LJIIZILJ;

    @Override // X.SY9, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LJIIIIZZ() {
        if (Looper.myLooper() == null) {
            return;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ROTATE", 0, 360);
        o.LJIIIIZZ(ofInt, "ofInt(\"ROTATE\", 0, 360)");
        ValueAnimator valueAnimator = this.LJIIZILJ;
        valueAnimator.setValues(ofInt);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new AUListenerS90S0100000_1(this, 71));
        this.LJIIZILJ.start();
    }

    public final void LJIIIZ() {
        if (Looper.myLooper() == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIIZILJ;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
    }

    @Override // X.SY9, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        canvas.save();
        canvas.rotate(this.LJIILLIIL, (width / 2.0f) + getBounds().left, (height / 2.0f) + getBounds().top);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113524cu(Context context, int i) {
        super(context, i);
        o.LJIIIZ(context, "context");
        this.LJIIZILJ = new ValueAnimator();
    }
}
