package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import defpackage.a1;

/* renamed from: X.6LQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LQ extends View implements InterfaceC135405Tc {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public final RectF LJLJI;
    public final ValueAnimator LJLJJI;
    public final ValueAnimator LJLJJL;

    @Override // X.InterfaceC135405Tc
    public final void LIZ(int i, int i2) {
    }

    @Override // X.InterfaceC135405Tc
    public void setRecordingTintRes(int i) {
    }

    @Override // X.InterfaceC135405Tc
    public void setStopTintColorRes(int i) {
    }

    @Override // X.InterfaceC135405Tc
    public final void LIZIZ() {
        this.LJLJJI.end();
        this.LJLJJL.start();
    }

    @Override // X.InterfaceC135405Tc
    public final void LIZJ() {
        this.LJLJJL.end();
        this.LJLJJI.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJJI.isRunning()) {
            this.LJLJJI.end();
        }
        if (this.LJLJJL.isRunning()) {
            this.LJLJJL.end();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLJI.set(0.0f, 0.0f, getWidth(), getHeight());
        if (canvas != null) {
            RectF rectF = this.LJLJI;
            float f = this.LJLILLLLZI;
            canvas.drawRoundRect(rectF, f, f, this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6LQ(Context context, float f) {
        super(context);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        float LIZJ = KL2.LIZJ(context, 2.0f);
        float f2 = f / 2;
        this.LJLILLLLZI = f2;
        this.LJLJI = new RectF();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZJ, f2);
        this.LJLJJI = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, LIZJ);
        this.LJLJJL = ofFloat2;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 2));
        ofFloat.setDuration(250L);
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(this, 3));
        ofFloat2.setDuration(250L);
    }
}
