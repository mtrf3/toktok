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
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class UGS extends View {
    public Paint LJLIL;
    public boolean LJLILLLLZI;
    public ValueAnimator LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public RectF LJLJL;
    public Bitmap LJLJLJ;
    public Bitmap LJLJLLL;
    public float LJLL;
    public Context LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LJLJI.cancel();
        }
        this.LJLLILLLL = false;
        if (Math.abs(this.LJLL - 0.25f) < Float.MIN_NORMAL) {
            return;
        }
        this.LJLL = 0.25f;
        setAlpha(0.25f);
        postInvalidate();
    }

    public final void LIZJ() {
        if (Math.abs(this.LJLL - 1.0f) < Float.MIN_NORMAL || this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.25f, 1.0f);
        this.LJLJI = ofFloat;
        if (ofFloat == null) {
            return;
        }
        ofFloat.setEvaluator(new FloatEvaluator());
        this.LJLJI.setDuration(300L);
        this.LJLJI.addUpdateListener(new AUListenerS100S0100000_13(this, 54));
        this.LJLJI.addListener(new ALAdapterS10S0100000_13(this, 20));
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
        Bitmap bitmap;
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (this.LJLJL == null) {
            return;
        }
        if (this.LJLLILLLL) {
            if (this.LJLJLLL == null) {
                int width = getWidth();
                int height = getHeight();
                RectF rectF = this.LJLJL;
                Context context = this.LJLLI;
                if (context != null) {
                    i2 = context.getResources().getColor(R.color.ey);
                } else {
                    i2 = -16777216;
                }
                if (this.LJLJJL == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJLJLLL = LIZ(width, height, rectF, i2, z2, true);
            }
            bitmap = this.LJLJLLL;
        } else {
            if (this.LJLJLJ == null) {
                int width2 = getWidth();
                int height2 = getHeight();
                RectF rectF2 = this.LJLJL;
                Context context2 = this.LJLLI;
                if (context2 != null) {
                    i = context2.getResources().getColor(R.color.ey);
                } else {
                    i = -16777216;
                }
                if (this.LJLJJL == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLJLJ = LIZ(width2, height2, rectF2, i, z, false);
            }
            bitmap = this.LJLJLJ;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LJLIL);
    }

    public void setTopOffset(int i) {
        this.LJLLL = i;
    }

    public UGS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        this.LJLJJLL = 0.5625f;
        this.LJLLL = -1;
        this.LJLLI = context;
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f = 0.0f;
        }
        this.LJLJJI = (int) f;
        this.LJLL = 0.25f;
        setAlpha(0.25f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = (int) ((getWidth() - (this.LJLJJI * 2)) * this.LJLJJLL);
        int i5 = this.LJLLL;
        if (i5 < 0) {
            i5 = Math.max(0, (getHeight() - width) / 2);
        }
        this.LJLJL = new RectF(this.LJLJJI, i5, r0 + r7, i5 + width);
    }

    public final Bitmap LIZ(int i, int i2, RectF rectF, int i3, boolean z, boolean z2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i3);
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (z) {
            canvas.drawOval(rectF, LIZIZ);
        } else if (z2) {
            float f = this.LJLLJ;
            canvas.drawRoundRect(rectF, f, f, LIZIZ);
        } else {
            canvas.drawRect(rectF, LIZIZ);
            Paint paint = new Paint();
            paint.setColor(getResources().getColor(R.color.abc));
            paint.setAlpha(125);
            paint.setStrokeWidth(1.0f);
            float f2 = rectF.top;
            float f3 = rectF.bottom - f2;
            float f4 = (f3 / 3.0f) + f2;
            float LIZ = C6D8.LIZ(f3, 2.0f, 3.0f, f2);
            float f5 = rectF.left;
            float f6 = rectF.right;
            float f7 = f6 - f5;
            float f8 = (f7 / 3.0f) + f5;
            float LIZ2 = C6D8.LIZ(f7, 2.0f, 3.0f, f5);
            canvas.drawLine(f5, f4, f6, f4, paint);
            canvas.drawLine(rectF.left, LIZ, rectF.right, LIZ, paint);
            canvas.drawLine(f8, rectF.top, f8, rectF.bottom, paint);
            canvas.drawLine(LIZ2, rectF.top, LIZ2, rectF.bottom, paint);
            Paint paint2 = new Paint();
            paint2.setColor(getResources().getColor(R.color.abc));
            paint2.setStrokeWidth(B9K.LIZ(this.LJLLI, 1.0f));
            float f9 = rectF.left;
            canvas.drawLine(f9, rectF.bottom, f9, rectF.top, paint2);
            float f10 = rectF.right;
            canvas.drawLine(f10, rectF.bottom, f10, rectF.top, paint2);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.drawLine(f11, f12, rectF.right, f12, paint2);
            float f13 = rectF.left;
            float f14 = rectF.bottom;
            canvas.drawLine(f13, f14, rectF.right, f14, paint2);
            Paint paint3 = new Paint();
            float LIZ3 = B9K.LIZ(this.LJLLI, 3.0f);
            paint3.setColor(getResources().getColor(R.color.abc));
            paint3.setStrokeWidth(LIZ3);
            float f15 = rectF.left - 2.0f;
            float f16 = rectF.top;
            float f17 = LIZ3 - 2.0f;
            canvas.drawLine(f15, f16 + 98.0f, f15, f16 - f17, paint3);
            float f18 = rectF.top - 2.0f;
            float f19 = rectF.left;
            canvas.drawLine(f19 - 2.0f, f18, f19 + 98.0f, f18, paint3);
            float f20 = rectF.right + 2.0f;
            float f21 = rectF.top;
            canvas.drawLine(f20, f21 + 98.0f, f20, f21 - f17, paint3);
            float f22 = rectF.top - 2.0f;
            float f23 = rectF.right;
            canvas.drawLine(f23 + 2.0f, f22, f23 - 98.0f, f22, paint3);
            float f24 = rectF.left - 2.0f;
            float f25 = rectF.bottom;
            float f26 = f17 - 1.0f;
            canvas.drawLine(f24, f25 - 98.0f, f24, f25 + f26, paint3);
            float f27 = rectF.bottom + 2.0f;
            float f28 = rectF.left;
            canvas.drawLine(f28 - 2.0f, f27, f28 + 98.0f, f27, paint3);
            float f29 = rectF.right + 2.0f;
            float f30 = rectF.bottom;
            canvas.drawLine(f29, f30 + f26, f29, f30 - 98.0f, paint3);
            float f31 = rectF.bottom + 2.0f;
            float f32 = rectF.right;
            canvas.drawLine(f32 + 2.0f, f31, f32 - 98.0f, f31, paint3);
        }
        return createBitmap;
    }
}
