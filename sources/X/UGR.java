package X;

import Y.ALAdapterS10S0100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class UGR extends View {
    public Paint LJLIL;
    public boolean LJLILLLLZI;
    public ValueAnimator LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public RectF LJLJL;
    public Bitmap LJLJLJ;
    public float LJLJLLL;
    public Context LJLL;
    public int LJLLI;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZ() {
        if (Math.abs(this.LJLJLLL - 0.85f) < Float.MIN_NORMAL || this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
        this.LJLJI = ofFloat;
        if (ofFloat == null) {
            return;
        }
        ofFloat.setEvaluator(new FloatEvaluator());
        this.LJLJI.setDuration(300L);
        this.LJLJI.addUpdateListener(new AUListenerS100S0100000_13(this, 51));
        this.LJLJI.addListener(new ALAdapterS10S0100000_13(this, 15));
        this.LJLJI.setStartDelay(300L);
        this.LJLJI.start();
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        RectF rectF = this.LJLJL;
        if (rectF != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int parseColor;
        boolean z;
        if (this.LJLJL == null) {
            return;
        }
        if (this.LJLJLJ == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.LJLJL;
            Context context = this.LJLL;
            if (context != null) {
                parseColor = context.getResources().getColor(R.color.a5r);
            } else {
                parseColor = ColorProtector.parseColor("#d9161823");
            }
            if (this.LJLJJL == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(parseColor);
            Paint LIZIZ = C6D8.LIZIZ(true);
            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, LIZIZ);
            } else {
                canvas2.drawRect(rectF, LIZIZ);
                Paint paint = new Paint();
                paint.setColor(getResources().getColor(R.color.abc));
                paint.setAlpha(125);
                paint.setStrokeWidth(1.0f);
                float f = rectF.top;
                float f2 = rectF.bottom - f;
                float f3 = (f2 / 3.0f) + f;
                float LIZ = C6D8.LIZ(f2, 2.0f, 3.0f, f);
                float f4 = rectF.left;
                float f5 = rectF.right;
                float f6 = f5 - f4;
                float f7 = (f6 / 3.0f) + f4;
                float LIZ2 = C6D8.LIZ(f6, 2.0f, 3.0f, f4);
                canvas2.drawLine(f4, f3, f5, f3, paint);
                canvas2.drawLine(rectF.left, LIZ, rectF.right, LIZ, paint);
                canvas2.drawLine(f7, rectF.top, f7, rectF.bottom, paint);
                canvas2.drawLine(LIZ2, rectF.top, LIZ2, rectF.bottom, paint);
                Paint paint2 = new Paint();
                paint2.setColor(getResources().getColor(R.color.abc));
                paint2.setStrokeWidth(2.0f);
                float f8 = rectF.left;
                canvas2.drawLine(f8, rectF.bottom, f8, rectF.top, paint2);
                float f9 = rectF.right;
                canvas2.drawLine(f9, rectF.bottom, f9, rectF.top, paint2);
                float f10 = rectF.left;
                float f11 = rectF.top;
                canvas2.drawLine(f10, f11, rectF.right, f11, paint2);
                float f12 = rectF.left;
                float f13 = rectF.bottom;
                canvas2.drawLine(f12, f13, rectF.right, f13, paint2);
                Paint paint3 = new Paint();
                paint3.setColor(getResources().getColor(R.color.abc));
                paint3.setStrokeWidth(3.0f);
                float f14 = rectF.left - 2.0f;
                float f15 = rectF.top;
                canvas2.drawLine(f14, f15 + 98.0f, f14, f15 - 2.0f, paint3);
                float f16 = rectF.top - 2.0f;
                float f17 = rectF.left;
                canvas2.drawLine(f17 - 2.0f, f16, f17 + 98.0f, f16, paint3);
                float f18 = rectF.right + 2.0f;
                float f19 = rectF.top;
                canvas2.drawLine(f18, f19 + 98.0f, f18, f19 - 2.0f, paint3);
                float f20 = rectF.top - 2.0f;
                float f21 = rectF.right;
                canvas2.drawLine(f21 + 2.0f, f20, f21 - 98.0f, f20, paint3);
                float f22 = rectF.left - 2.0f;
                float f23 = rectF.bottom;
                canvas2.drawLine(f22, f23 - 98.0f, f22, f23 + 2.0f, paint3);
                float f24 = rectF.bottom + 2.0f;
                float f25 = rectF.left;
                canvas2.drawLine(f25 - 2.0f, f24, f25 + 98.0f, f24, paint3);
                float f26 = rectF.right + 2.0f;
                float f27 = rectF.bottom;
                canvas2.drawLine(f26, f27 + 2.0f, f26, f27 - 98.0f, paint3);
                float f28 = rectF.bottom + 2.0f;
                float f29 = rectF.right;
                canvas2.drawLine(f29 + 2.0f, f28, f29 - 98.0f, f28, paint3);
            }
            this.LJLJLJ = createBitmap;
        }
        canvas.drawBitmap(this.LJLJLJ, 0.0f, 0.0f, this.LJLIL);
    }

    public void setTopOffset(int i) {
        this.LJLLI = i;
    }

    public UGR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        this.LJLJJLL = 0.5625f;
        this.LJLLI = -1;
        this.LJLL = context;
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f = 0.0f;
        }
        this.LJLJJI = (int) f;
        this.LJLJLLL = 0.5f;
        setAlpha(0.5f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = (int) ((getWidth() - (this.LJLJJI * 2)) * this.LJLJJLL);
        int i5 = this.LJLLI;
        if (i5 < 0) {
            i5 = Math.max(0, (getHeight() - width) / 2);
        }
        this.LJLJL = new RectF(this.LJLJJI, i5, r0 + r7, i5 + width);
    }
}
