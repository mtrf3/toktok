package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8F4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F4 extends ReplacementSpan {
    public final Context LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final TextExtraStruct LJLJJL;
    public final boolean LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public final Paint LJLLLL;
    public final Path LJLLLLLL;
    public final Path LJLZ;
    public PathDashPathEffect LJZ;
    public float LJZI;
    public float LJZL;
    public Paint LL;
    public boolean LLD;
    public final float LLF;
    public final float LLFF;

    public C8F4(Context context, float f, int i, TextExtraStruct textExtraStruct) {
        int i2;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
        this.LJLJJI = -1;
        this.LJLJJL = textExtraStruct;
        this.LJLJJLL = false;
        this.LJLJL = -1.0f;
        this.LJLJLJ = -1.0f;
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLL = -1;
        this.LJLLLL = new Paint();
        this.LJLLLLLL = new Path();
        this.LJLZ = new Path();
        this.LLF = C32151Nz.LJIIZILJ(12);
        this.LLFF = C32151Nz.LJIIZILJ(2);
        int subtype = textExtraStruct.getSubtype();
        if (subtype != 2) {
            if (subtype != 3 && (subtype == 4 || (subtype != 5 && subtype != 7))) {
                i2 = R.raw.icon_play_circle_fill;
            } else {
                i2 = R.raw.icon_qa_fill_ltr;
            }
        } else {
            i2 = R.raw.icon_message_fill;
        }
        this.LJLLL = i2;
        BitmapFactory.decodeResource(context.getResources(), this.LJLLL);
    }

    public static String LIZIZ(String str, float f, float f2, Paint paint) {
        int measureText = (int) (paint.measureText(str) + f2);
        if (f == 0.0f || measureText <= f) {
            return str;
        }
        if (f > C32151Nz.LJIIZILJ(5)) {
            f -= C32151Nz.LJIIZILJ(5);
        }
        while (true) {
            str = s.LJJZ(str.length() - 1, str.length(), str).toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("…");
            if (((int) (paint.measureText(X1D.LIZIZ(LIZ)) + f2)) <= f && !Character.isHighSurrogate(str.charAt(str.length() - 1))) {
                return i0.LJFF(str, "…");
            }
        }
    }

    public final void LIZ(Canvas canvas, float f, int i, int i2) {
        int i3;
        if (this.LJLLL == -1) {
            return;
        }
        float f2 = i2 - i;
        float f3 = this.LLF;
        if (f2 < f3) {
            return;
        }
        float f4 = 2;
        float f5 = i + i2;
        float f6 = (f5 - f3) / f4;
        float f7 = (f5 + f3) / f4;
        int i4 = (int) (f + ((int) (this.LJLJLLL / f4)));
        C2068389v c2068389v = new C2068389v();
        int i5 = (int) this.LLF;
        c2068389v.LIZIZ = i5;
        c2068389v.LIZJ = i5;
        c2068389v.LIZ = this.LJLLL;
        c2068389v.LJFF = this.LLD;
        if (this.LJLJJLL) {
            i3 = R.attr.d4;
        } else {
            i3 = R.attr.dj;
        }
        c2068389v.LJ = Integer.valueOf(i3);
        SY9 LIZ = c2068389v.LIZ(this.LJLIL);
        LIZ.setBounds(i4, (int) f6, ((int) this.LLF) + i4, (int) f7);
        LIZ.draw(canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        String str2;
        int i3;
        boolean z;
        o.LJIIIZ(paint, "paint");
        if (i + 1 >= i2) {
            return 0;
        }
        float f = this.LJLJL;
        if (f != -1.0f) {
            paint.setTextSize(f);
        }
        if (this.LL == null) {
            Paint paint2 = new Paint(paint);
            this.LL = paint2;
            paint2.setTextSize(this.LJLJLJ);
        }
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            try {
                paint.setTypeface(LIZLLL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        float f2 = ((C7GV.LIZ + this.LJLJLLL) - this.LLF) - this.LLFF;
        if (this.LJLLI.length() == 0) {
            str = String.valueOf(charSequence);
        } else {
            str = this.LJLLI;
        }
        if (str.length() < i2 || str.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("original text: ");
            LIZ.append(this.LJLLI);
            LIZ.append("; span text: ");
            LIZ.append((Object) charSequence);
            LIZ.append("; aid: ");
            TextExtraStruct textExtraStruct = this.LJLJJL;
            if (textExtraStruct != null) {
                str2 = textExtraStruct.getAwemeId();
            } else {
                str2 = null;
            }
            C1FJ.LJFF(LIZ, str2, LIZ, 6, "RoundBackgroundSpan");
            return 0;
        }
        String substring = str.substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (Build.VERSION.SDK_INT <= 28) {
            int length = substring.length() - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= length) {
                if (!z2) {
                    i3 = i4;
                } else {
                    i3 = length;
                }
                if (substring.charAt(i3) == 65279) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i4++;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    length--;
                }
            }
            substring = C132805Jc.LIZJ(length, 1, substring, i4);
            if (substring.length() == 0) {
                return 0;
            }
        }
        if (C78685UuP.LJJJZ(substring) && substring.charAt(0) == '@') {
            String substring2 = substring.substring(1, substring.length());
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            float f3 = this.LJLILLLLZI;
            if (f3 <= f2) {
                f2 = f3;
            }
            String LIZIZ = LIZIZ(substring2, f2, this.LJLJLLL, paint);
            this.LJLLILLLL = LIZIZ;
            this.LJLL = (int) (paint.measureText(LIZIZ) + this.LJLJLLL + this.LLF + this.LLFF);
            this.LJLLILLLL = QZZ.LIZIZ(substring.charAt(0), this.LJLLILLLL);
        } else {
            String LIZIZ2 = LIZIZ(substring, this.LJLILLLLZI, this.LJLJLLL, paint);
            this.LJLLILLLL = LIZIZ2;
            this.LJLL = (int) (paint.measureText(LIZIZ2) + this.LJLJLLL);
        }
        return this.LJLL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String charSequence2;
        String LJJJJZ;
        Paint paint2 = paint;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint2, "paint");
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 <= 28 && charSequence != null && charSequence.charAt(i) == 65279) || i + 1 >= i2) {
            return;
        }
        paint2.setColor(this.LJLJJI);
        if (this.LJLL + f > this.LJLILLLLZI) {
            this.LJLJJL.setClickable(false);
            canvas.drawText("…", f, i4, paint2);
            return;
        }
        if (this.LL == null) {
            Paint paint3 = new Paint(paint2);
            this.LL = paint3;
            paint3.setTextSize(this.LJLJLJ);
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i || charSequence.charAt(i) != 8230) {
            this.LJLJJL.setClickable(true);
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
            if (LIZLLL != null) {
                try {
                    paint2.setTypeface(LIZLLL);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            float f2 = this.LJLJL;
            if (f2 != -1.0f) {
                paint2.setTextSize(f2);
            }
            float f3 = i4;
            float f4 = paint2.getFontMetrics().ascent + f3;
            float f5 = paint2.getFontMetrics().descent + f3;
            if (this.LJLLILLLL.charAt(0) == '@') {
                this.LJLLJ = this.LLF + this.LLFF;
                String str = this.LJLLILLLL;
                String substring = str.substring(1, str.length());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                this.LJLLILLLL = substring;
            }
            paint2.setColor(this.LJLJJI);
            canvas.drawText(this.LJLLILLLL, (this.LJLJLLL / 2.0f) + f + this.LJLLJ, f3, paint2);
            if (this.LJLLL != -1) {
                LIZ(canvas, f, (int) f4, (int) f5);
            } else if (!TextUtils.isEmpty(this.LJLJJL.getAwemeId())) {
                this.LJLLL = R.raw.icon_play_fill;
                LIZ(canvas, f, (int) f4, (int) f5);
            }
            Paint paint4 = this.LL;
            if (paint4 != null) {
                paint2 = paint4;
            }
            float f6 = this.LJLJLLL / 2;
            float LJIIZILJ = C32151Nz.LJIIZILJ(Double.valueOf(1.5d)) + ((this.LJLL + f) - f6);
            float LJIIZILJ2 = i5 - C32151Nz.LJIIZILJ(Double.valueOf(0.75d));
            this.LJLLLL.set(paint2);
            this.LJLLLL.setColor(this.LJLJI);
            this.LJLLLL.setStyle(Paint.Style.FILL_AND_STROKE);
            this.LJLLLL.setPathEffect(this.LJZ);
            this.LJLZ.reset();
            this.LJLZ.moveTo(f6 + f, LJIIZILJ2);
            this.LJLZ.lineTo(LJIIZILJ, LJIIZILJ2);
            canvas.drawPath(this.LJLZ, this.LJLLLL);
            return;
        }
        this.LJLJJL.setClickable(false);
        if (i6 <= 28) {
            String charSequence3 = charSequence.toString();
            if (charSequence3 != null && (charSequence2 = s.LJZI(charSequence3).toString()) != null && (LJJJJZ = ujb.o.LJJJJZ(charSequence2, "\ufeff", "", false)) != null && ujb.o.LJJJJ(LJJJJZ, "…", false)) {
                return;
            }
            canvas.drawText("…", f, i4, paint2);
            return;
        }
        canvas.drawText("…", f, i4, paint2);
    }
}
