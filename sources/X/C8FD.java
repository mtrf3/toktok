package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.i0;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8FD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FD extends ReplacementSpan {
    public final Context LJLIL;
    public final C8FE LJLILLLLZI;
    public int LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public String LJLJLLL;

    public C8FD(Context mContext, C8FE c8fe) {
        o.LJIIIZ(mContext, "mContext");
        this.LJLIL = mContext;
        this.LJLILLLLZI = c8fe;
        this.LJLJJI = 22.0f;
        this.LJLJJL = 15.0f;
        this.LJLJJLL = 17.0f;
        this.LJLJL = 10.0f;
        this.LJLJLJ = 5.0f;
        this.LJLJLLL = "";
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
        paint.setTextSize(KL2.LIZJ(this.LJLIL, this.LJLJJL - 2));
        T5S t5s = new T5S();
        t5s.LIZ(82);
        paint.setTypeface(t5s.getTypeface());
        this.LJLJI = (int) (KL2.LIZJ(this.LJLIL, this.LJLJJI) + paint.measureText(text, i3, i2));
        this.LJLILLLLZI.LIZ();
        if (this.LJLJI >= this.LJLILLLLZI.getMaxWidth()) {
            int maxWidth = this.LJLILLLLZI.getMaxWidth();
            float LIZJ = KL2.LIZJ(this.LJLIL, this.LJLJJI + 2.0f);
            String charSequence = text.subSequence(i3, i2).toString();
            int measureText = (int) (paint.measureText(charSequence) + LIZJ);
            if (maxWidth != 0 && measureText > maxWidth) {
                while (true) {
                    str = "…";
                    if (charSequence.length() != 1) {
                        charSequence = s.LJJZ(charSequence.length() - 1, charSequence.length(), charSequence).toString();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(charSequence);
                        LIZ.append("…");
                        if (((int) (paint.measureText(X1D.LIZIZ(LIZ)) + LIZJ)) <= maxWidth && !Character.isHighSurrogate(charSequence.charAt(charSequence.length() - 1))) {
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
            this.LJLJLLL = str;
            this.LJLJI = (int) (KL2.LIZJ(this.LJLIL, this.LJLJJI) + paint.measureText(str));
        }
        return this.LJLJI;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        int i6 = i + 1;
        if (i6 >= i2) {
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
        paint.setTextSize(KL2.LIZJ(this.LJLIL, this.LJLJJL));
        paint.setColor(ColorProtector.parseColor("#0B161823"));
        paint.setPathEffect(new CornerPathEffect(KL2.LIZJ(this.LJLIL, 2.0f)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.top;
        float f3 = fontMetrics.bottom;
        float f4 = i4;
        float f5 = f4 + f2;
        canvas.drawRect(new RectF(f, f5, this.LJLJI + f, f4 + f3), paint);
        paint.setColor(color);
        float LIZJ = KL2.LIZJ(this.LJLIL, this.LJLJL);
        float f6 = 2;
        float f7 = ((f3 - f2) - LIZJ) / f6;
        float LIZJ2 = KL2.LIZJ(this.LJLIL, this.LJLJLJ);
        Path path = new Path();
        float f8 = LIZJ2 + f;
        float f9 = f5 + f7;
        path.moveTo(f8, f9);
        path.lineTo(f8, f9 + LIZJ);
        path.lineTo((0.86f * LIZJ) + f8, (LIZJ / f6) + f9);
        path.close();
        canvas.drawPath(path, paint);
        paint.setPathEffect(pathEffect);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        paint.setTypeface(t5s.getTypeface());
        paint.setTextSize(KL2.LIZJ(this.LJLIL, this.LJLJJL - f6));
        if (TextUtils.isEmpty(this.LJLJLLL)) {
            canvas.drawText(text, i6, i2, KL2.LIZJ(this.LJLIL, this.LJLJJLL) + f, f4 - KL2.LIZJ(this.LJLIL, 1.0f), paint);
        } else {
            canvas.drawText(this.LJLJLLL, KL2.LIZJ(this.LJLIL, this.LJLJJLL) + f, f4 - KL2.LIZJ(this.LJLIL, 1.0f), paint);
        }
    }
}
