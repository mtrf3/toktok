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

/* renamed from: X.UGa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76900UGa extends View {
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
        ofFloat.setEvaluator(new FloatEvaluator());
        this.LJLJI.setDuration(300L);
        this.LJLJI.addUpdateListener(new AUListenerS100S0100000_13(this, 55));
        this.LJLJI.addListener(new ALAdapterS10S0100000_13(this, 21));
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
                if (C52238Keo.LIZ()) {
                    parseColor = AnonymousClass636.LJIIIIZZ(R.attr.dj, context);
                } else {
                    parseColor = AnonymousClass636.LJIIIIZZ(R.attr.ee, context);
                }
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
            }
            this.LJLJLJ = createBitmap;
        }
        canvas.drawBitmap(this.LJLJLJ, 0.0f, 0.0f, this.LJLIL);
    }

    public void setTopOffset(int i) {
        this.LJLLI = i;
    }

    public C76900UGa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJLL = 0.5625f;
        this.LJLLI = -1;
        this.LJLL = context;
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        this.LJLJJI = (int) KL2.LIZJ(context, 16.0f);
        this.LJLJLLL = 0.5f;
        setAlpha(0.5f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (width <= height) {
            height = width;
        }
        int i5 = height - (this.LJLJJI * 2);
        int i6 = (int) (i5 * this.LJLJJLL);
        int i7 = this.LJLLI;
        if (i7 < 0) {
            i7 = Math.max(0, (getHeight() - i6) / 2);
        }
        int i8 = this.LJLJJI;
        if ((i8 * 2) + i5 < width) {
            i8 = (width - i5) / 2;
        }
        this.LJLJL = new RectF(i8, i7, i8 + i5, i7 + i6);
    }
}
