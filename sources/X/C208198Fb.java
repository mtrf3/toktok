package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.i0;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208198Fb extends ReplacementSpan {
    public final Context LJLIL;
    public final C8FE LJLILLLLZI;
    public int LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public String LJLLI;
    public Bitmap LJLLILLLL;

    public C208198Fb(Context mContext, C8FE c8fe) {
        o.LJIIIZ(mContext, "mContext");
        this.LJLIL = mContext;
        this.LJLILLLLZI = c8fe;
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1632));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1638));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1633));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1634));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1635));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1636));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1637));
        this.LJLLI = "";
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(((Number) this.LJLJL.getValue()).floatValue());
        T5S t5s = new T5S();
        t5s.LIZ(82);
        paint.setTypeface(t5s.getTypeface());
        this.LJLJI = (int) (((Number) this.LJLJJI.getValue()).floatValue() + paint.measureText(text, i3, i2));
        this.LJLLI = text.subSequence(i3, i2).toString();
        this.LJLILLLLZI.LIZ();
        if (this.LJLJI >= this.LJLILLLLZI.getMaxWidth()) {
            int maxWidth = this.LJLILLLLZI.getMaxWidth();
            float floatValue = ((Number) this.LJLJJI.getValue()).floatValue();
            String charSequence = text.subSequence(i3, i2).toString();
            int measureText = (int) (paint.measureText(charSequence) + floatValue);
            if (maxWidth != 0 && measureText > maxWidth) {
                while (true) {
                    str = "…";
                    if (charSequence.length() != 1) {
                        charSequence = s.LJJZ(charSequence.length() - 1, charSequence.length(), charSequence).toString();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(charSequence);
                        LIZ.append("…");
                        if (((int) (paint.measureText(X1D.LIZIZ(LIZ)) + floatValue)) <= maxWidth && !Character.isHighSurrogate(charSequence.charAt(charSequence.length() - 1))) {
                            str = i0.LJFF(charSequence, "…");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                str = "";
            }
            this.LJLLI = str;
            this.LJLJI = (int) (((Number) this.LJLJJI.getValue()).floatValue() + paint.measureText(str));
        }
        return this.LJLJI;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        if (i + 1 >= i2) {
            return;
        }
        if (this.LJLJI + f > this.LJLILLLLZI.getMaxWidth()) {
            canvas.drawText("…", f, i4, paint);
            return;
        }
        if (text.length() > i && text.charAt(i) == 8230) {
            canvas.drawText("…", f, i4, paint);
            return;
        }
        paint.setAntiAlias(true);
        int color = paint.getColor();
        PathEffect pathEffect = paint.getPathEffect();
        paint.setTextSize(((Number) this.LJLJJLL.getValue()).floatValue());
        paint.setColor(ColorProtector.parseColor("#0B222435"));
        float f2 = 2;
        paint.setPathEffect(new CornerPathEffect(((Number) this.LJLJJL.getValue()).floatValue() * f2));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = fontMetrics.top;
        float f4 = fontMetrics.bottom;
        float f5 = i4;
        float f6 = f5 + f3;
        canvas.drawRect(new RectF(f, f6, this.LJLJI + f, f5 + f4), paint);
        paint.setColor(color);
        float floatValue = ((f4 - f3) - ((Number) this.LJLJLLL.getValue()).floatValue()) / f2;
        Bitmap bitmap = this.LJLLILLLL;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, ((Number) this.LJLL.getValue()).floatValue() + f, f6 + floatValue, paint);
        }
        paint.setPathEffect(pathEffect);
        paint.setTextSize(((Number) this.LJLJL.getValue()).floatValue());
        T5S t5s = new T5S();
        t5s.LIZ(82);
        paint.setTypeface(t5s.getTypeface());
        canvas.drawText(this.LJLLI, ((Number) this.LJLJLJ.getValue()).floatValue() + f, f5 - ((Number) this.LJLJJL.getValue()).floatValue(), paint);
    }
}
