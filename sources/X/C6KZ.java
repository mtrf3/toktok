package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.LinkedHashMap;

/* renamed from: X.6KZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KZ extends View {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public final ValueAnimator LJLJI;
    public final ValueAnimator LJLJJI;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJI.isRunning()) {
            this.LJLJI.end();
        }
        if (this.LJLJJI.isRunning()) {
            this.LJLJJI.end();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6KZ(Context context) {
        super(context);
        new LinkedHashMap();
        Paint paint = new Paint();
        this.LJLIL = paint;
        float LIZJ = KL2.LIZJ(context, 3.5f);
        float LIZJ2 = KL2.LIZJ(context, 13.0f);
        this.LJLILLLLZI = LIZJ2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZJ, LIZJ2);
        this.LJLJI = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(LIZJ2, LIZJ);
        this.LJLJJI = ofFloat2;
        paint.setAntiAlias(true);
        paint.setColor(ColorProtector.parseColor("#fe2c55"));
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 6));
        ofFloat.setDuration(250L);
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(this, 7));
        ofFloat2.setDuration(250L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f = this.LJLILLLLZI;
            canvas.drawRoundRect(rectF, f, f, this.LJLIL);
        }
    }
}
