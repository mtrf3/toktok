package X;

import Y.IDAListenerS83S0100000_29;
import Y.IDUListenerS264S0100000_29;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrK, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91234ZrK extends View {
    public String LJLIL;
    public T5S LJLILLLLZI;
    public final Rect LJLJI;
    public boolean LJLJJI;
    public float LJLJJL;
    public final ValueAnimator LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public Paint LJLLI;
    public Paint LJLLILLLL;
    public int LJLLJ;
    public final Animator.AnimatorListener LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;

    public final void LIZJ() {
        this.LJLJL = false;
        this.LJLJJI = false;
        this.LJLJJLL.cancel();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("restoreMarqueeAnimation, ");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.LJLJJLL.cancel();
        super.onDetachedFromWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetachedFromWindow, ");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
    }

    public final void LIZ() {
        String charSequence = getContentDescription().toString();
        this.LJLILLLLZI.getTextBounds(charSequence, 0, charSequence.length(), this.LJLJI);
        Rect rect = this.LJLJI;
        this.LJLLLLLL = rect.left + rect.width() + getPaddingStart() + getPaddingEnd();
    }

    public final boolean getMarqueeEnable() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91234ZrK(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = "";
        this.LJLILLLLZI = new T5S();
        this.LJLJI = new Rect();
        this.LJLJJLL = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLLJ = -1;
        this.LJLLL = new IDAListenerS83S0100000_29(this, 6);
        this.LJLLLL = true;
        try {
            LIZIZ(context);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZIZ(Context context) {
        int i;
        float f;
        T5S t5s = new T5S();
        t5s.setAntiAlias(true);
        t5s.setDither(true);
        t5s.LIZ(23);
        this.LJLILLLLZI = t5s;
        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
        int i2 = 0;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJLJLLL = i;
        this.LJLILLLLZI.setColor(i);
        T5S t5s2 = this.LJLILLLLZI;
        float f2 = (0.5f / EF7.LIZIZ().getResources().getDisplayMetrics().density) + 0.5f;
        Integer LJI2 = C79045V0n.LJI(R.attr.ee, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        }
        float f3 = 0.0f;
        t5s2.setShadowLayer(f2, 0.0f, 0.0f, i2);
        Paint.FontMetrics fontMetrics = this.LJLILLLLZI.getFontMetrics();
        if (fontMetrics != null) {
            f = fontMetrics.descent;
            f3 = fontMetrics.ascent;
        } else {
            f = 0.0f;
        }
        this.LJLJLJ = -(f + f3);
        this.LJLL = (int) KL2.LIZJ(context, 28.0f);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LJLLI = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LJLLILLLL = paint2;
        setLayerType(1, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingStart;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.LJLJL) {
            if (getWidth() < this.LJLLLLLL) {
                if (this.LJLLLL) {
                    ValueAnimator valueAnimator = this.LJLJJLL;
                    valueAnimator.addUpdateListener(new IDUListenerS264S0100000_29(this, 11));
                    C16880lQ.LJLLI(valueAnimator, this.LJLLL);
                    valueAnimator.addListener(this.LJLLL);
                    valueAnimator.setDuration(this.LJLIL.length() * 400);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.setRepeatCount(this.LJLLJ);
                    valueAnimator.start();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("startAnimator, ");
                    LIZ.append(hashCode());
                    X1D.LIZIZ(LIZ);
                    this.LJLJJI = true;
                    this.LJLJL = true;
                }
            } else {
                this.LJLJJLL.cancel();
            }
        }
        if (this.LJLJJI) {
            canvas.clipRect(getPaddingStart(), 0, getWidth() - getPaddingEnd(), getHeight());
            float paddingStart2 = getPaddingStart();
            float height = (getHeight() + this.LJLJLJ) / 2.0f;
            canvas.save();
            canvas.translate((-this.LJLJJL) * (this.LJLJI.width() + 100), 0.0f);
            canvas.drawText(this.LJLIL, paddingStart2, height, this.LJLILLLLZI);
            canvas.drawText(this.LJLIL, paddingStart2 + this.LJLJI.width() + 100, height, this.LJLILLLLZI);
            canvas.restore();
            Paint paint = this.LJLLI;
            if (paint != null) {
                canvas.drawRect((getWidth() - this.LJLL) - getPaddingEnd(), 0.0f, getWidth() - getPaddingEnd(), getHeight(), paint);
            }
            Paint paint2 = this.LJLLILLLL;
            if (paint2 != null) {
                canvas.drawRect(getPaddingStart(), 0.0f, getPaddingStart() + this.LJLL, getHeight(), paint2);
                return;
            }
            return;
        }
        this.LJLJJLL.cancel();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            paddingStart = (getWidth() - this.LJLLLLLL) + getPaddingStart();
        } else {
            paddingStart = getPaddingStart();
        }
        canvas.drawText(this.LJLIL, paddingStart, (getHeight() + this.LJLJLJ) / 2.0f, this.LJLILLLLZI);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getX() <= this.LJLLLLLL) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public final void setMarqueeEnable(boolean z) {
        this.LJLLLL = z;
        invalidate();
    }

    public final void setMarqueeRepeatCount(int i) {
        this.LJLLJ = i;
    }

    public final void setText(String content) {
        o.LJIIIZ(content, "content");
        setContentDescription(content);
        this.LJLIL = content;
        LIZJ();
        LIZ();
        invalidate();
    }

    public final void setTuxFont(int i) {
        this.LJLILLLLZI.LIZ(i);
        if (getContentDescription() != null) {
            LIZJ();
            LIZ();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = Math.min(this.LJLLLLLL, size);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint = this.LJLLI;
        if (paint != null) {
            paint.setShader(new LinearGradient((getWidth() - this.LJLL) - getPaddingEnd(), 0.0f, getWidth() - getPaddingEnd(), 0.0f, new int[]{0, this.LJLJLLL}, (float[]) null, Shader.TileMode.REPEAT));
        }
        Paint paint2 = this.LJLLILLLL;
        if (paint2 == null) {
            return;
        }
        paint2.setShader(new LinearGradient(getPaddingStart(), 0.0f, this.LJLL + getPaddingStart(), 0.0f, new int[]{0, this.LJLJLLL}, (float[]) null, Shader.TileMode.REPEAT));
    }
}
