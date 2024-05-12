package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C140575fR extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final Matrix LJLJJI;
    public Bitmap LJLJJL;
    public float LJLJJLL;
    public ValueAnimator LJLJL;
    public final long LJLJLJ;

    private ValueAnimator.AnimatorUpdateListener getUpdateListener() {
        return new AUListenerS91S0100000_2(this, 5);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJL.isRunning()) {
            this.LJLJL.cancel();
        }
        this.LJLJJI.reset();
        this.LJLJJI.setTranslate(0.0f, -this.LJLJJLL);
        this.LJLJJI.preScale(1.0f, 1.0f);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.LJLJJL;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.LJLJJI, this.LJLIL);
        }
    }

    public C140575fR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJI = new Matrix();
        this.LJLJJLL = 0.0f;
        this.LJLJLJ = 2000L;
        this.LJLJJL = BitmapFactory.decodeResource(getResources(), R.drawable.buj);
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        Bitmap bitmap = this.LJLJJL;
        if (bitmap == null || i <= 0 || i2 <= 0) {
            return;
        }
        int width = bitmap.getWidth();
        int i5 = this.LJLILLLLZI;
        if (width != i5) {
            Bitmap bitmap2 = this.LJLJJL;
            int height = bitmap2.getHeight();
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            float min = Math.min(height / height2, i5 / width2);
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            this.LJLJJL = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix, true);
        }
        this.LJLJJLL = this.LJLJJL.getHeight();
        this.LJLJJI.reset();
        this.LJLJJI.setTranslate(0.0f, -this.LJLJJLL);
        this.LJLJJI.preScale(1.0f, 1.0f);
        ValueAnimator valueAnimator = this.LJLJL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJL.cancel();
        }
        float f = this.LJLJJLL;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-f, this.LJLJI + f);
        this.LJLJL = ofFloat;
        if (ofFloat == null) {
            return;
        }
        ofFloat.setDuration(this.LJLJLJ);
        this.LJLJL.setRepeatCount(-1);
        this.LJLJL.setRepeatMode(1);
        this.LJLJL.addUpdateListener(getUpdateListener());
        this.LJLJL.start();
    }
}
