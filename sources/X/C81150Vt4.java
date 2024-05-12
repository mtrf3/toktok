package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vt4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81150Vt4 extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public InterfaceC81151Vt5 LJLJJLL;
    public ValueAnimator LJLJL;
    public boolean LJLJLJ;
    public HandlerThread LJLJLLL;
    public HandlerC81149Vt3 LJLL;
    public volatile boolean LJLLI;

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new ALAdapterS11S0100000_14(this, 6));
        return duration;
    }

    public final void LIZ() {
        if (this.LJLJLLL == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.LJLJLLL = handlerThread;
            handlerThread.start();
            this.LJLL = new HandlerC81149Vt3(this.LJLJLLL.getLooper(), this);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLI = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJL;
        if (valueAnimator != null) {
            C16880lQ.LJLJL(valueAnimator);
            this.LJLJL.cancel();
            this.LJLJL = null;
        }
        this.LJLJJLL = null;
        HandlerThread handlerThread = this.LJLJLLL;
        if (handlerThread != null) {
            handlerThread.quit();
            this.LJLJLLL = null;
            this.LJLL = null;
        }
        this.LJLLI = true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJLJ) {
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            canvas.drawLine(i, i2 / 2, i - (i * this.LJLJJL), i2 / 2, this.LJLIL);
        } else {
            int i3 = this.LJLJI;
            canvas.drawLine(0.0f, i3 / 2, this.LJLILLLLZI * this.LJLJJL, i3 / 2, this.LJLIL);
        }
    }

    public void setForegroundColor(int i) {
        this.LJLJJI = i;
        Paint paint = this.LJLIL;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setOnAudioControlViewHideListener(InterfaceC81151Vt5 interfaceC81151Vt5) {
        this.LJLJJLL = interfaceC81151Vt5;
    }

    public void setProgress(float f) {
        this.LJLJJL = f;
    }

    public C81150Vt4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.x9, R.attr.aen});
        this.LJLJJI = obtainStyledAttributes.getColor(1, C04330Ez.LIZIZ(context, R.color.ry));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        this.LJLIL.setColor(this.LJLJJI);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLIL.setStrokeWidth(2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredWidth();
        this.LJLJI = getMeasuredHeight();
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LJLJLJ = z;
    }
}
