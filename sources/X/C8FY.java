package X;

import Y.AUListenerS92S0100000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8FY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FY extends ReplacementSpan {
    public int LJLIL;
    public int LJLILLLLZI;
    public Rect LJLJI;
    public final int LJLJJI;
    public final Paint.FontMetricsInt LJLJJL;
    public final C8FZ LJLJJLL;
    public final GSU LJLJL;

    public final void LIZIZ() {
        Rect rect;
        int i;
        C8FZ c8fz = this.LJLJJLL;
        if (c8fz != null) {
            rect = c8fz.getBounds();
        } else {
            rect = null;
        }
        this.LJLJI = rect;
        int i2 = 0;
        if (rect != null) {
            i = rect.width();
        } else {
            i = 0;
        }
        this.LJLIL = i;
        Rect rect2 = this.LJLJI;
        if (rect2 != null) {
            i2 = rect2.height();
        }
        this.LJLILLLLZI = i2;
    }

    public final int LIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int i2 = this.LJLJJI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = this.LJLILLLLZI;
                } else {
                    int i3 = fontMetricsInt.descent;
                    int i4 = fontMetricsInt.ascent;
                    return AnonymousClass030.LIZJ(i3 - i4, this.LJLILLLLZI, 2, i4);
                }
            } else {
                i = this.LJLILLLLZI;
            }
            return -i;
        }
        return fontMetricsInt.descent - this.LJLILLLLZI;
    }

    public C8FY(Context ctx, GSU editText) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(editText, "editText");
        this.LJLJJL = new Paint.FontMetricsInt();
        this.LJLJL = editText;
        TypedArray obtainStyledAttributes = ctx.obtainStyledAttributes(null, new int[]{R.attr.brm, R.attr.bue}, R.attr.kk, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "mContext.obtainStyledAtt….attr.TuxSpinnerStyle, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        C8FZ c8fz = new C8FZ(ctx, resourceId);
        c8fz.LJ(color);
        c8fz.setBounds(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
        this.LJLJJLL = c8fz;
        this.LJLJJI = 2;
        LIZIZ();
        editText.setLayerType(1, editText.getPaint());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setDuration(1000L).setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(this, 24));
        c8fz.setAlpha(255);
        ofFloat.start();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        LIZIZ();
        if (fontMetricsInt == null) {
            return this.LJLIL;
        }
        int LIZ = LIZ(fontMetricsInt);
        int i3 = this.LJLILLLLZI + LIZ;
        if (LIZ < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = LIZ;
        }
        if (LIZ < fontMetricsInt.top) {
            fontMetricsInt.top = LIZ;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.LJLIL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int LIZ;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        paint.getFontMetricsInt(this.LJLJJL);
        if (this.LJLJJI == 2) {
            LIZ = ((i5 + i3) - this.LJLILLLLZI) / 2;
        } else {
            LIZ = LIZ(this.LJLJJL) + i4;
        }
        float f2 = f + 0;
        float f3 = LIZ;
        canvas.translate(f2, f3);
        C8FZ c8fz = this.LJLJJLL;
        if (c8fz != null) {
            c8fz.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
