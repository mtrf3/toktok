package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.6b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C163306b0 extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public Path LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public final float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public ValueAnimator LJLLJ;
    public float LJLLL;

    public final void LIZ(Canvas canvas) {
        Path path = this.LJLJJI;
        if (path == null) {
            return;
        }
        path.reset();
        Path path2 = this.LJLJJI;
        float f = this.LJLJJL / 2.0f;
        float f2 = this.LJLJLJ;
        path2.moveTo(C65232Piu.LIZIZ(this.LJLJLLL, f2, 2.0f, f), (((this.LJLJJLL / 2.0f) + f2) - this.LJLJL) + this.LJLLL);
        Path path3 = this.LJLJJI;
        float f3 = this.LJLJJL;
        float f4 = this.LJLJLJ;
        float f5 = this.LJLJLLL;
        float LIZIZ = C65232Piu.LIZIZ(f4, f5, 2.0f, f3 / 2.0f);
        float f6 = this.LJLJJLL;
        float f7 = this.LJLLL;
        float LIZIZ2 = C65232Piu.LIZIZ(f4, f5, 2.0f, f3 / 2.0f);
        float f8 = this.LJLJL;
        path3.quadTo(LIZIZ, (f6 / 2.0f) + f4 + f7, (f5 * f8) + LIZIZ2, (((f6 / 2.0f) + f4) - f8) + f7);
        Path path4 = this.LJLJJI;
        float f9 = this.LJLJJL / 2.0f;
        float f10 = this.LJLJLJ;
        float f11 = this.LJLJLLL;
        float LIZ = C6D8.LIZ(f10, f11, 2.0f, f9);
        float f12 = this.LJLJL;
        path4.lineTo(C65232Piu.LIZIZ(f11, f12, 2.0f, LIZ), (f12 / 2.0f) + (this.LJLJJLL / 2.0f) + this.LJLLL);
        Path path5 = this.LJLJJI;
        float f13 = this.LJLJJL;
        float f14 = this.LJLJLJ;
        float f15 = this.LJLJLLL;
        float LIZ2 = C6D8.LIZ(f14, f15, 2.0f, f13 / 2.0f);
        float f16 = this.LJLJJLL;
        float f17 = this.LJLLL;
        float LIZ3 = C6D8.LIZ(f14, f15, 2.0f, f13 / 2.0f);
        float f18 = this.LJLJL;
        path5.quadTo(LIZ2, (f16 / 2.0f) + f17, C65232Piu.LIZIZ(f15, f18, 2.0f, LIZ3), ((f16 / 2.0f) - (f18 / 2.0f)) + f17);
        Path path6 = this.LJLJJI;
        float f19 = this.LJLJJL / 2.0f;
        float f20 = this.LJLJLJ;
        float f21 = this.LJLJLLL;
        float LIZIZ3 = C65232Piu.LIZIZ(f20, f21, 2.0f, f19);
        float f22 = this.LJLJL;
        path6.lineTo((f21 * f22) + LIZIZ3, ((this.LJLJJLL / 2.0f) - f20) + f22 + this.LJLLL);
        Path path7 = this.LJLJJI;
        float f23 = this.LJLJJL;
        float f24 = this.LJLJLJ;
        float f25 = this.LJLJLLL;
        float LIZIZ4 = C65232Piu.LIZIZ(f24, f25, 2.0f, f23 / 2.0f);
        float f26 = this.LJLJJLL;
        float f27 = this.LJLLL;
        path7.quadTo(LIZIZ4, ((f26 / 2.0f) - f24) + f27, C65232Piu.LIZIZ(f25, f24, 2.0f, f23 / 2.0f), ((f26 / 2.0f) - f24) + this.LJLJL + f27);
        canvas.drawPath(this.LJLJJI, this.LJLIL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLIL.setColor(this.LJLILLLLZI);
        canvas.translate(this.LJLL, 0.0f);
        LIZ(canvas);
        canvas.translate(0.0f, this.LJLJJLL);
        LIZ(canvas);
        canvas.translate(-this.LJLL, -this.LJLJJLL);
        this.LJLIL.setColor(this.LJLJI);
        this.LJLIL.setStrokeWidth(this.LJLLI);
        float f = this.LJLLL;
        float f2 = this.LJLJJLL;
        if (f > (-f2)) {
            float f3 = this.LJLLILLLL;
            if (f > (-f2) + f3) {
                canvas.drawLine(0.0f, f2 + f, this.LJLJJL, f2 + f, this.LJLIL);
            } else {
                canvas.drawLine(f3, f2 + f, this.LJLJJL - f3, f2 + f, this.LJLIL);
            }
        }
    }

    public C163306b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = 1.5f;
        this.LJLIL = new Paint();
        this.LJLILLLLZI = Color.argb(191, 255, 255, 255);
        this.LJLJI = Color.argb(30, 100, 100, 100);
        this.LJLJJI = new Path();
        this.LJLLI = (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LJLJLJ = (int) TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics());
        float f = this.LJLLI;
        this.LJLLILLLL = 3.0f * f;
        this.LJLJL = 10.0f * f;
        this.LJLL = f * 8.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLLJ = ofFloat;
        ofFloat.setDuration(1000L);
        this.LJLLJ.setInterpolator(new DecelerateInterpolator(1.5f));
        this.LJLLJ.addUpdateListener(new AUListenerS91S0100000_2(this, 31));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }
}
