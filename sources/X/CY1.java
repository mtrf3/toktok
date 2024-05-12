package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.a1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CY1 extends C2A8 {
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public String LJZ;
    public String LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public final HashSet<String> LLF;
    public CYH LLFF;

    public final void LJJJ() {
        if (!this.LL) {
            return;
        }
        Iterator<String> it = this.LLF.iterator();
        while (it.hasNext()) {
            String next = it.next();
            TextPaint paint = getPaint();
            o.LJIIIIZZ(paint, "paint");
            float LJJJI = LJJJI(paint, next);
            if (LJJJI > this.LJLLLL) {
                this.LJLLLL = LJJJI;
            }
        }
        int i = 0;
        do {
            String valueOf = String.valueOf(i);
            TextPaint paint2 = getPaint();
            o.LJIIIIZZ(paint2, "paint");
            float LJJJI2 = LJJJI(paint2, valueOf);
            if (LJJJI2 > this.LJLLLLLL) {
                this.LJLLLLLL = LJJJI2;
            }
            i++;
        } while (i < 10);
        TextPaint paint3 = getPaint();
        o.LJIIIIZZ(paint3, "paint");
        this.LJLZ = paint3.measureText(".");
        this.LJZL = true;
    }

    public final boolean getAlreadyMeasureGivenText() {
        return this.LJZL;
    }

    public final String getCurrentNumberFormatString() {
        return this.LJZI;
    }

    public final CYH getCurrentNumberFormatStringAnalysisResult() {
        return this.LLFF;
    }

    public final String getCurrentText() {
        return this.LJZ;
    }

    public final int getTextMeasureMaxWidth() {
        return this.LLD;
    }

    public final void LJJIZ(List<String> units) {
        o.LJIIIZ(units, "units");
        for (String str : units) {
            if (this.LLF.add(str) && this.LJZL) {
                TextPaint paint = getPaint();
                o.LJIIIIZZ(paint, "paint");
                float LJJJI = LJJJI(paint, str);
                if (LJJJI > this.LJLLLL) {
                    this.LJLLLL = LJJJI;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        if (r1 != r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJIL(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "numberFormatString"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = r8.LJZI
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
            r7 = 0
            if (r0 == 0) goto Lf
        Le:
            return r7
        Lf:
            X.CYH r3 = new X.CYH
            r3.<init>()
            r2 = 0
            r6 = 0
        L16:
            int r0 = r9.length()
            r1 = 1
            if (r2 >= r0) goto L80
            char r5 = r9.charAt(r2)
            int r4 = r6 + 1
            int r0 = r9.length()
            int r0 = r0 - r1
            if (r6 != r0) goto L4c
            java.util.HashSet<java.lang.String> r1 = r8.LLF
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4c
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r3.LIZ = r1
            float r1 = r3.LIZLLL
            float r0 = r8.LJLLLL
            float r1 = r1 + r0
            r3.LIZLLL = r1
        L48:
            int r2 = r2 + 1
            r6 = r4
            goto L16
        L4c:
            r0 = 46
            if (r5 != r0) goto L5a
            r3.LIZIZ = r6
            float r1 = r3.LIZLLL
            float r0 = r8.LJLZ
            float r1 = r1 + r0
            r3.LIZLLL = r1
            goto L48
        L5a:
            r0 = 48
            if (r0 > r5) goto L6a
            r0 = 58
            if (r5 >= r0) goto L6a
            float r1 = r3.LIZLLL
            float r0 = r8.LJLLLLLL
            float r1 = r1 + r0
            r3.LIZLLL = r1
            goto L48
        L6a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "parseNumberFormat error, char is "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "NumberFormatTextView"
            X.C0NB.LIZIZ(r0, r1)
            goto L48
        L80:
            r3.LIZJ = r9
            int r1 = r9.length()
            java.lang.String r0 = r8.LJZI
            int r0 = r0.length()
            if (r1 == r0) goto L93
        L8e:
            r7 = 1
        L8f:
            r8.LLFF = r3
            goto Le
        L93:
            java.lang.String r0 = r3.LIZJ
            int r0 = r0.length()
            if (r0 != 0) goto L9c
            goto L8e
        L9c:
            int r2 = r3.LIZIZ
            r1 = -1
            if (r2 == r1) goto La7
            X.CYH r0 = r8.LLFF
            int r0 = r0.LIZIZ
            if (r0 != r1) goto Lae
        La7:
            X.CYH r0 = r8.LLFF
            int r0 = r0.LIZIZ
            if (r2 == r0) goto Lae
            goto L8e
        Lae:
            java.lang.String r0 = r3.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto Lc7
            r1 = 1
        Lb7:
            X.CYH r0 = r8.LLFF
            java.lang.String r0 = r0.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto Lc5
            r0 = 1
        Lc2:
            if (r1 == r0) goto L8f
            goto L8e
        Lc5:
            r0 = 0
            goto Lc2
        Lc7:
            r1 = 0
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CY1.LJJJIL(java.lang.String):boolean");
    }

    public final void setAlreadyMeasureGivenText(boolean z) {
        this.LJZL = z;
    }

    public final void setCurrentNumberFormatString(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJZI = str;
    }

    public final void setCurrentNumberFormatStringAnalysisResult(CYH cyh) {
        o.LJIIIZ(cyh, "<set-?>");
        this.LLFF = cyh;
    }

    public final void setCurrentText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJZ = str;
    }

    public final void setEnableMeasureOpt(boolean z) {
        this.LL = z;
    }

    public final void setTextMeasureMaxWidth(int i) {
        if (i <= 0) {
            return;
        }
        this.LLD = i;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        if (this.LJZL) {
            LJJJ();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CY1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public static float LJJJI(Paint paint, String source) {
        o.LJIIIZ(source, "source");
        return paint.measureText(source);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.LL && getLayoutParams() != null && !o.LJ(charSequence, this.LJZ) && getLayoutParams().width != -2) {
            getLayoutParams().width = -2;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        if (this.LJZL) {
            LJJJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CY1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJZ = "";
        this.LJZI = "";
        this.LL = true;
        this.LLD = Integer.MAX_VALUE;
        this.LLF = new HashSet<>();
        this.LLFF = new CYH();
    }
}
