package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vt1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81147Vt1 extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public InterfaceC81152Vt6 LJLJJI;
    public ValueAnimator LJLJJL;
    public boolean LJLJJLL;
    public HandlerThread LJLJL;
    public HandlerC81148Vt2 LJLJLJ;
    public volatile boolean LJLJLLL;

    public final ObjectAnimator getHideVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
        o.LJIIIIZZ(duration, "ofFloat(this, \"alpha\", a…          .setDuration(0)");
        return duration;
    }

    public final ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        o.LJIIIIZZ(duration, "ofFloat(this, \"alpha\", a…        .setDuration(150)");
        duration.addListener(new ALAdapterS11S0100000_14(this, 11));
        return duration;
    }

    public final void LIZ() {
        if (this.LJLJL == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.LJLJL = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.LJLJL;
            o.LJI(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            o.LJIIIIZZ(looper, "mAudioApiHandlerThread!!.looper");
            this.LJLJLJ = new HandlerC81148Vt2(looper, this);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJLLL = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator != null) {
            C16880lQ.LJLJL(valueAnimator);
            ValueAnimator valueAnimator2 = this.LJLJJL;
            o.LJI(valueAnimator2);
            valueAnimator2.cancel();
            this.LJLJJL = null;
        }
        this.LJLJJI = null;
        HandlerThread handlerThread = this.LJLJL;
        if (handlerThread != null) {
            handlerThread.quit();
            this.LJLJL = null;
            this.LJLJLJ = null;
        }
        this.LJLJLLL = true;
    }

    private final void setForegroundColor(int i) {
        this.LJLILLLLZI = i;
        Paint paint = this.LJLIL;
        if (paint == null) {
            return;
        }
        paint.setColor(i);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        o.LJIIIZ(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLJJLL) {
            float width = getWidth();
            float height = getHeight() / 2;
            float width2 = getWidth() - (getWidth() * this.LJLJI);
            float height2 = getHeight() / 2;
            Paint paint = this.LJLIL;
            o.LJI(paint);
            canvas.drawLine(width, height, width2, height2, paint);
            return;
        }
        float height3 = getHeight() / 2;
        float width3 = getWidth() * this.LJLJI;
        float height4 = getHeight() / 2;
        Paint paint2 = this.LJLIL;
        o.LJI(paint2);
        canvas.drawLine(0.0f, height3, width3, height4, paint2);
    }

    public final void setOnAudioControlViewHideListener(InterfaceC81152Vt6 interfaceC81152Vt6) {
        this.LJLJJI = interfaceC81152Vt6;
    }

    public final void setProgress(float f) {
        this.LJLJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81147Vt1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = C04330Ez.LIZIZ(context, R.color.ry);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.x9, R.attr.aen});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…yleable.AudioControlView)");
        setForegroundColor(obtainStyledAttributes.getColor(1, C04330Ez.LIZIZ(context, R.color.ry)));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            paint2.setColor(this.LJLILLLLZI);
        }
        Paint paint3 = this.LJLIL;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        Paint paint4 = this.LJLIL;
        if (paint4 == null) {
            return;
        }
        paint4.setStrokeWidth(2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LJLJJLL = z;
    }
}
