package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.T5p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74081T5p extends MetricAffectingSpan {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.text.TextPaint r9) {
        /*
            r8 = this;
            int r0 = r8.LJLIL
            float r0 = (float) r0
            int r0 = X.C78688UuS.LJIILIIL(r0)
            float r0 = (float) r0
            r9.setTextSize(r0)
            java.lang.String r0 = r8.LJLJI
            int r0 = X.C61499OBr.LIZ(r0)
            r9.setColor(r0)
            java.lang.String r7 = r8.LJLILLLLZI
            int r5 = r8.LJLJJI
            int r6 = r7.hashCode()
            r2 = 2
            r0 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r4 = 3
            r3 = 1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r6 == r0) goto L8e
            r0 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r6 == r0) goto L7d
            r0 = 309230200(0x126e7a78, float:7.5250513E-28)
            if (r6 == r0) goto L6c
        L30:
            if (r5 < r1) goto L63
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r3)
            r9.setTypeface(r0)
        L39:
            boolean r0 = r8.LJLJJLL
            if (r0 == 0) goto L49
            int r3 = r9.baselineShift
            float r1 = r9.ascent()
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (int) r1
            int r3 = r3 - r0
            r9.baselineShift = r3
        L49:
            boolean r0 = r8.LJLJJL
            if (r0 == 0) goto L59
            int r3 = r9.baselineShift
            float r1 = r9.ascent()
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (int) r1
            int r3 = r3 + r0
            r9.baselineShift = r3
        L59:
            boolean r0 = r8.LJLJL
            if (r0 == 0) goto L62
            r0 = 16
            r9.setFlags(r0)
        L62:
            return
        L63:
            r0 = 0
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r0)
            r9.setTypeface(r0)
            goto L39
        L6c:
            java.lang.String r0 = "bold-italic"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L75
            goto L30
        L75:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r4)
            r9.setTypeface(r0)
            goto L39
        L7d:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L86
            goto L30
        L86:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r3)
            r9.setTypeface(r0)
            goto L39
        L8e:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L97
            goto L30
        L97:
            if (r5 < r1) goto La1
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r4)
            r9.setTypeface(r0)
            goto L39
        La1:
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r2)
            r9.setTypeface(r0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74081T5p.LIZ(android.text.TextPaint):void");
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        LIZ(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        LIZ(textPaint);
    }

    public C74081T5p(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.LJLIL = i;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = i2;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
    }
}
