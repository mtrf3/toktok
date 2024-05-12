package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;

/* renamed from: X.VRi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79742VRi extends AbstractC79752VRs {
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public VQ3 LJLLL;
    public Drawable.Callback LJLLLL;

    public abstract Drawable LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract void LJI();

    public final int LIZIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        float f;
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        int i5 = this.LJLJJLL + this.LJLLI;
        switch (this.LJLIL) {
            case 1:
                return -i5;
            case 2:
                return (i2 - i5) - ((int) (i4 * 0.1f));
            case 3:
                return i3 + ((int) (i4 * 0.1f));
            case 4:
            case 5:
                return i3;
            case 6:
            default:
                return AnonymousClass030.LIZJ(i4, i5, 2, i3);
            case 7:
            case 8:
                return i2 - i5;
            case 9:
                i = -i5;
                f = this.LJLILLLLZI;
                break;
            case 10:
                i = -i5;
                f = (this.LJLILLLLZI * i4) / 100.0f;
                break;
        }
        return i - ((int) f);
    }

    public void LJIIIIZZ(Drawable.Callback callback) {
        this.LJLLLL = callback;
    }

    public static void LJII(Spanned spanned, Drawable.Callback callback) {
        for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
            abstractC79742VRi.LIZLLL();
            abstractC79742VRi.LJIIIIZZ(callback);
        }
    }

    public AbstractC79742VRi(int i, int i2, int[] iArr) {
        this.LJLJL = i;
        this.LJLJJLL = i2;
        int i3 = iArr[0];
        this.LJLJLJ = i3;
        int i4 = iArr[1];
        this.LJLJLLL = i4;
        this.LJLL = i3 + iArr[2];
        this.LJLLI = i4 + iArr[3];
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (!(charSequence instanceof SpannableStringBuilder) && charSequence.charAt(i) != "I".charAt(0)) {
            return 0;
        }
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            if (this.LJLJJL) {
                this.LJLJI = (int) LIZ(-(this.LJLJJLL + this.LJLLI), 0.0f);
            } else {
                this.LJLJI = LIZIZ(fontMetricsInt);
            }
            int i3 = fontMetricsInt.ascent;
            int i4 = this.LJLJI;
            if (i3 > i4) {
                fontMetricsInt.ascent = i4;
            }
            int i5 = fontMetricsInt.descent;
            int i6 = i4 + this.LJLJJLL + this.LJLLI;
            if (i5 < i6) {
                fontMetricsInt.descent = i6;
            }
            int i7 = fontMetricsInt.top;
            int i8 = fontMetricsInt.ascent;
            if (i7 > i8) {
                fontMetricsInt.top = i8;
            }
            int i9 = fontMetricsInt.bottom;
            int i10 = fontMetricsInt.descent;
            if (i9 < i10) {
                fontMetricsInt.bottom = i10;
            }
        }
        return this.LJLJL + this.LJLL;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        BackgroundDrawable backgroundDrawable;
        if ((!(charSequence instanceof SpannableStringBuilder) && charSequence.charAt(i) != "I".charAt(0)) || LIZJ() == null) {
            return;
        }
        Drawable LIZJ = LIZJ();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i7 = this.LJLIL;
        if (i7 != 4) {
            if (i7 != 7) {
                if (i7 != 11) {
                    if (this.LJLJJL) {
                        i6 = i4 + this.LJLJI;
                    } else if (i7 == 6) {
                        i6 = (((i5 + i3) - this.LJLJJLL) - this.LJLLI) / 2;
                    } else {
                        i6 = i4 + LIZIZ(fontMetricsInt);
                    }
                } else {
                    i6 = (((i5 + i3) - this.LJLJJLL) - this.LJLLI) / 2;
                }
            } else {
                i6 = (i5 - this.LJLJJLL) - this.LJLLI;
            }
        } else {
            i6 = i3;
        }
        if (this.LJLLILLLL != 0) {
            Rect rect = new Rect(Math.round(f), Math.round(i3 + this.LJLLJ), Math.round(LIZJ.getBounds().width() + f), Math.round(i5 + this.LJLLJ));
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.LJLLILLLL);
            canvas.drawRect(rect, paint2);
        }
        canvas.translate(f + this.LJLJLJ, i6 + this.LJLJLLL + this.LJLLJ);
        VQ3 vq3 = this.LJLLL;
        if (vq3 != null && (backgroundDrawable = vq3.LIZIZ) != null) {
            backgroundDrawable.draw(canvas);
            if (this.LJLLL.LIZIZ.LJII() != null) {
                canvas.clipPath(this.LJLLL.LIZIZ.LJII());
            }
        }
        LIZJ.draw(canvas);
        canvas.restore();
    }
}
