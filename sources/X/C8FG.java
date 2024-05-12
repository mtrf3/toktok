package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.8FG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FG extends ReplacementSpan implements C8FK, C8FM, C48R {
    public final int LJLJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public Paint.FontMetrics LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public boolean LJLL;
    public InterfaceC116744i6 LJLLI;
    public CharSequence LJLLILLLL;
    public final int LJLIL = 14;
    public final int LJLILLLLZI = 2;
    public final int LJLJJI = C7MY.LIZIZ(2);

    @Override // X.C48R
    public final boolean LJ() {
        return false;
    }

    @Override // X.C48R
    public final boolean LJI() {
        return true;
    }

    @Override // X.C8FK
    public final int LIZLLL() {
        return this.LJLILLLLZI * 2;
    }

    @Override // X.C8FM
    public final void LJFF(View widget) {
        o.LJIIIZ(widget, "widget");
    }

    @Override // X.C8FM
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC116744i6 interfaceC116744i6 = this.LJLLI;
        if (interfaceC116744i6 != null) {
            interfaceC116744i6.LIZIZ(this, this.LJLLILLLL, null);
        }
    }

    public C8FG(int i, int i2) {
        this.LJLJI = -1;
        this.LJLJI = O6R.LJJIIZ(C32151Nz.LJJIII(11));
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        try {
            i = Color.argb(O6R.LJJIIZ(Color.alpha(i) * 0.34f), Color.red(i), Color.green(i), Color.blue(i));
        } catch (Exception unused) {
        }
        this.LJLJLJ = i;
        try {
            i2 = Color.argb(O6R.LJJIIZ(Color.alpha(i2) * 0.34f), Color.red(i2), Color.green(i2), Color.blue(i2));
        } catch (Exception unused2) {
        }
        this.LJLJLLL = i2;
    }

    @Override // X.C8FM
    public final void LIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLL = false;
    }

    @Override // X.C8FM
    public final void LIZIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLL = true;
    }

    @Override // X.C8FM
    public final void LIZJ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLL = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        return C7MY.LIZIZ(this.LJLIL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        this.LJLLILLLL = text.subSequence(i, i2);
        TextPaint textPaint = new TextPaint(paint);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        o.LJIIIIZZ(fontMetrics, "paint.fontMetrics");
        this.LJLJL = fontMetrics;
        int i8 = this.LJLJI;
        if (i8 != -1) {
            textPaint.setTextSize(i8);
            textPaint.setLetterSpacing(0.0f);
        }
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        Paint.FontMetrics fontMetrics3 = this.LJLJL;
        if (fontMetrics3 != null) {
            Math.abs(fontMetrics3.ascent);
            Paint.FontMetrics fontMetrics4 = this.LJLJL;
            if (fontMetrics4 != null) {
                Math.abs(fontMetrics4.descent);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("src leading:");
                Paint.FontMetrics fontMetrics5 = this.LJLJL;
                if (fontMetrics5 != null) {
                    LIZ.append(fontMetrics5.leading);
                    LIZ.append(" top:");
                    Paint.FontMetrics fontMetrics6 = this.LJLJL;
                    if (fontMetrics6 != null) {
                        LIZ.append(fontMetrics6.top);
                        LIZ.append(" asecnt:");
                        Paint.FontMetrics fontMetrics7 = this.LJLJL;
                        if (fontMetrics7 != null) {
                            LIZ.append(fontMetrics7.ascent);
                            LIZ.append(" descent:");
                            Paint.FontMetrics fontMetrics8 = this.LJLJL;
                            if (fontMetrics8 != null) {
                                LIZ.append(fontMetrics8.descent);
                                LIZ.append(" bottom:");
                                Paint.FontMetrics fontMetrics9 = this.LJLJL;
                                if (fontMetrics9 != null) {
                                    LIZ.append(fontMetrics9.bottom);
                                    X1D.LIZIZ(LIZ);
                                    int measureText = (int) textPaint.measureText(text, i, i2);
                                    Math.abs(fontMetrics2.top);
                                    Math.abs(fontMetrics2.bottom);
                                    RectF rectF = new RectF();
                                    float f2 = i4;
                                    Paint.FontMetrics fontMetrics10 = this.LJLJL;
                                    if (fontMetrics10 != null) {
                                        float abs = f2 - Math.abs(fontMetrics10.top);
                                        rectF.top = abs;
                                        rectF.bottom = abs + C7MY.LIZIZ(this.LJLIL);
                                        float LIZIZ = ((int) f) + C7MY.LIZIZ(this.LJLILLLLZI);
                                        rectF.left = LIZIZ;
                                        rectF.right = LIZIZ + C7MY.LIZIZ(this.LJLIL);
                                        if (this.LJLL) {
                                            i6 = this.LJLJLLL;
                                        } else {
                                            i6 = this.LJLJJLL;
                                        }
                                        paint.setColor(i6);
                                        int i9 = this.LJLJJI;
                                        canvas.drawRoundRect(rectF, i9, i9, paint);
                                        if (this.LJLL) {
                                            i7 = this.LJLJLJ;
                                        } else {
                                            i7 = this.LJLJJL;
                                        }
                                        textPaint.setColor(i7);
                                        textPaint.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                                        float f3 = rectF.left;
                                        float f4 = (rectF.right - f3) - measureText;
                                        float f5 = 2;
                                        float f6 = (f4 / f5) + f3;
                                        float f7 = fontMetrics2.leading - fontMetrics2.top;
                                        float f8 = rectF.bottom;
                                        canvas.drawText(text, i, i2, f6, (f8 - (((f8 - rectF.top) - f7) / f5)) - C7MY.LIZIZ(2), textPaint);
                                        return;
                                    }
                                    o.LJIJI("srcFontMetrics");
                                    throw null;
                                }
                                o.LJIJI("srcFontMetrics");
                                throw null;
                            }
                            o.LJIJI("srcFontMetrics");
                            throw null;
                        }
                        o.LJIJI("srcFontMetrics");
                        throw null;
                    }
                    o.LJIJI("srcFontMetrics");
                    throw null;
                }
                o.LJIJI("srcFontMetrics");
                throw null;
            }
            o.LJIJI("srcFontMetrics");
            throw null;
        }
        o.LJIJI("srcFontMetrics");
        throw null;
    }
}
