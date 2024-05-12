package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.style.ReplacementSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import defpackage.i0;
import ujb.o;
import ujb.s;

/* renamed from: X.8F5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F5 extends ReplacementSpan {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final TextExtraStruct LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final float LJLJL;
    public final Context LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public float LJLLLLLL;
    public final int LJLZ;
    public final Bitmap LJZ;
    public final Rect LJZI;
    public final String LJZL;
    public Paint LL;
    public String LLD;
    public boolean LLF;
    public float LLFF;
    public final SY9 LLFFF;
    public final float LLFII;

    public static boolean LIZ(CharSequence charSequence) {
        String charSequence2;
        String charSequence3;
        String LJJJJZ;
        boolean z = false;
        if (charSequence != null && (charSequence2 = charSequence.toString()) != null && (charSequence3 = s.LJZI(charSequence2).toString()) != null && (LJJJJZ = o.LJJJJZ(charSequence3, "\ufeff", "", false)) != null && o.LJJJJ(LJJJJZ, "…", false)) {
            z = true;
        }
        return !z;
    }

    public final String LIZIZ(String str, float f, float f2, Paint paint) {
        int measureText = (int) (paint.measureText(str) + f2);
        if (f == 0.0f || measureText <= f) {
            return str;
        }
        if (f > KL2.LIZJ(this.LJLJLJ, 5.0f)) {
            f -= KL2.LIZJ(this.LJLJLJ, 5.0f);
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

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        String str;
        String str2;
        int i3;
        boolean z;
        kotlin.jvm.internal.o.LJIIIZ(paint, "paint");
        if (i + 1 >= i2) {
            return 0;
        }
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            try {
                paint.setTypeface(LIZLLL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        float f2 = this.LJLJLLL;
        if (f2 != -1.0f) {
            paint.setTextSize(f2);
        }
        Typeface LIZLLL2 = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL2 != null) {
            try {
                paint.setTypeface(LIZLLL2);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        if (this.LJLJI) {
            f = ((C7GV.LIZ + this.LJLLI) - this.LLFF) - this.LLFII;
        } else {
            f = this.LJLJL;
        }
        if (this.LLD.length() == 0) {
            str = String.valueOf(charSequence);
        } else {
            str = this.LLD;
        }
        if (str.length() < i2 || str.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("original text: ");
            LIZ.append(this.LLD);
            LIZ.append("; span text: ");
            LIZ.append((Object) charSequence);
            LIZ.append("; aid: ");
            TextExtraStruct textExtraStruct = this.LJLJJI;
            if (textExtraStruct != null) {
                str2 = textExtraStruct.getAwemeId();
            } else {
                str2 = null;
            }
            C1FJ.LJFF(LIZ, str2, LIZ, 6, "RoundBackgroundSpan");
            return 0;
        }
        String substring = str.substring(i, i2);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
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
        if (this.LJLJI && C78685UuP.LJJJZ(substring) && substring.charAt(0) == '@') {
            String substring2 = substring.substring(1, substring.length());
            kotlin.jvm.internal.o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            float f3 = this.LJLJL;
            if (f3 <= f) {
                f = f3;
            }
            String LIZIZ = LIZIZ(substring2, f, this.LJLLI, paint);
            this.LJLLLL = LIZIZ;
            this.LJLLJ = (int) (paint.measureText(LIZIZ) + this.LJLLI + this.LLFF + this.LLFII);
            this.LJLLLL = QZZ.LIZIZ(substring.charAt(0), this.LJLLLL);
        } else {
            String LIZIZ2 = LIZIZ(substring, this.LJLJL, this.LJLLI, paint);
            this.LJLLLL = LIZIZ2;
            this.LJLLJ = (int) (paint.measureText(LIZIZ2) + this.LJLLI);
        }
        return this.LJLLJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        if (r8 != false) goto L62;
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11, java.lang.CharSequence r12, int r13, int r14, float r15, int r16, int r17, int r18, android.graphics.Paint r19) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8F5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r14 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r3 = com.zhiliaoapp.musically.R.raw.icon_play_circle_fill;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
    
        r3 = com.zhiliaoapp.musically.R.raw.icon_play_fill;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r14 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8F5(android.content.Context r6, float r7, int r8, int r9, com.ss.android.ugc.aweme.model.TextExtraStruct r10, boolean r11, boolean r12, boolean r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8F5.<init>(android.content.Context, float, int, int, com.ss.android.ugc.aweme.model.TextExtraStruct, boolean, boolean, boolean, boolean, int):void");
    }
}
