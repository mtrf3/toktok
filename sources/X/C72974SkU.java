package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SkU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72974SkU extends View {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public Paint LJLJJI;
    public Paint LJLJJL;
    public TextPaint LJLJJLL;
    public Paint LJLJL;
    public Drawable LJLJLJ;
    public float LJLJLLL;
    public Rect LJLL;
    public boolean LJLLI;

    private Rect getCheckRect() {
        if (this.LJLL == null) {
            float f = this.LJLJLLL;
            int LIZIZ = (int) C65232Piu.LIZIZ(f, 16.0f, 2.0f, (f * 48.0f) / 2.0f);
            float f2 = this.LJLJLLL;
            float f3 = LIZIZ;
            this.LJLL = new Rect(LIZIZ, LIZIZ, (int) ((f2 * 48.0f) - f3), (int) ((f2 * 48.0f) - f3));
        }
        return this.LJLL;
    }

    public final void LIZ() {
        if (this.LJLJJL == null) {
            Paint paint = new Paint();
            this.LJLJJL = paint;
            paint.setAntiAlias(true);
            this.LJLJJL.setStyle(Paint.Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.aio});
            int color = obtainStyledAttributes.getColor(0, C06690Ob.LIZIZ(getResources(), R.color.ad5, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.LJLJJL.setColor(color);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.LJLJL == null) {
            Paint paint = new Paint();
            this.LJLJL = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.LJLJL;
            float f2 = this.LJLJLLL;
            float f3 = (f2 * 48.0f) / 2.0f;
            paint2.setShader(new RadialGradient(f3, f3, f2 * 19.0f, new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#0D000000"), ColorProtector.parseColor("#0D000000"), ColorProtector.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f4 = this.LJLJLLL;
        canvas.drawCircle((f4 * 48.0f) / 2.0f, (f4 * 48.0f) / 2.0f, f4 * 19.0f, this.LJLJL);
        float f5 = this.LJLJLLL;
        canvas.drawCircle((f5 * 48.0f) / 2.0f, (f5 * 48.0f) / 2.0f, f5 * 11.5f, this.LJLJJI);
        if (this.LJLIL) {
            if (this.LJLJI != Integer.MIN_VALUE) {
                LIZ();
                float f6 = this.LJLJLLL;
                canvas.drawCircle((f6 * 48.0f) / 2.0f, (48.0f * f6) / 2.0f, f6 * 11.0f, this.LJLJJL);
                if (this.LJLJJLL == null) {
                    TextPaint textPaint = new TextPaint();
                    this.LJLJJLL = textPaint;
                    textPaint.setAntiAlias(true);
                    this.LJLJJLL.setColor(-1);
                    this.LJLJJLL.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.LJLJJLL.setTextSize(this.LJLJLLL * 12.0f);
                }
                canvas.drawText(String.valueOf(this.LJLJI), ((int) (canvas.getWidth() - this.LJLJJLL.measureText(r5))) / 2, ((int) ((canvas.getHeight() - this.LJLJJLL.descent()) - this.LJLJJLL.ascent())) / 2, this.LJLJJLL);
            }
        } else if (this.LJLILLLLZI) {
            LIZ();
            float f7 = this.LJLJLLL;
            canvas.drawCircle((f7 * 48.0f) / 2.0f, (48.0f * f7) / 2.0f, f7 * 11.0f, this.LJLJJL);
            this.LJLJLJ.setBounds(getCheckRect());
            this.LJLJLJ.draw(canvas);
        }
        if (this.LJLLI) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public void setChecked(boolean z) {
        if (!this.LJLIL) {
            this.LJLILLLLZI = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i) {
        if (this.LJLIL) {
            if (i == Integer.MIN_VALUE || i > 0) {
                this.LJLJI = i;
                invalidate();
                return;
            }
            throw new IllegalArgumentException("checked num can't be negative.");
        }
        throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
    }

    public void setCountable(boolean z) {
        this.LJLIL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.LJLLI != z) {
            this.LJLLI = z;
            invalidate();
        }
    }

    public C72974SkU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLI = true;
        this.LJLJLLL = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        this.LJLJJI.setStyle(Paint.Style.STROKE);
        this.LJLJJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.LJLJJI.setStrokeWidth(this.LJLJLLL * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.aip});
        int color = obtainStyledAttributes.getColor(0, C06690Ob.LIZIZ(getResources(), R.color.ad6, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.LJLJJI.setColor(color);
        this.LJLJLJ = C0OW.LIZ(context.getResources(), R.drawable.ay4, context.getTheme());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.LJLJLLL * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
