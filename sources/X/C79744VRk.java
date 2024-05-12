package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.Bidi;

/* renamed from: X.VRk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79744VRk {
    public Layout LIZ;
    public final C79746VRm LIZIZ;
    public float LIZJ;
    public int LIZLLL = -1;

    public final float LIZJ() {
        float f = 0.0f;
        for (int i = 0; i < this.LIZ.getLineCount(); i++) {
            if (this.LIZIZ.LIZ.LIZIZ.LIZIZ(false) == Layout.Alignment.ALIGN_NORMAL) {
                f = Math.max(f, this.LIZ.getLineMax(i));
            } else {
                f = Math.max(f, this.LIZ.getLineMax(i) - this.LIZ.getParagraphLeft(i));
            }
        }
        return f;
    }

    static {
        new BoringLayout.Metrics();
    }

    public final void LIZ(C79755VRv c79755VRv) {
        Layout.Alignment LIZIZ;
        TextUtils.TruncateAt truncateAt;
        C79743VRj c79743VRj = this.LIZIZ.LIZ.LIZIZ;
        int i = c79743VRj.LIZLLL;
        boolean z = false;
        if ((i == 0 || i == 2) && c79743VRj.LJ == 0) {
            int i2 = c79743VRj.LJIJJ;
            if (i2 != 0) {
                if (i2 == 1) {
                    z = true;
                }
                LIZIZ = c79743VRj.LIZIZ(z);
            } else {
                LIZIZ = this.LIZIZ.LIZ.LIZIZ.LIZIZ(!new Bidi(c79755VRv.LIZ.toString(), -2).baseIsLeftToRight());
            }
        } else {
            LIZIZ = c79743VRj.LIZIZ(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            StaticLayout.Builder LIZLLL = LIZLLL(c79755VRv.LIZ, LIZIZ, c79755VRv.LJFF, c79755VRv.LIZJ);
            if (c79755VRv.LIZLLL == 0) {
                LIZLLL.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth((int) Math.floor(c79755VRv.LIZJ)).setMaxLines(c79755VRv.LJ);
            }
            int i4 = c79755VRv.LJ;
            if (i4 > 0) {
                LIZLLL.setMaxLines(i4);
            }
            if (c79755VRv.LIZIZ) {
                LIZLLL.setMaxLines(1);
            }
            if (this.LIZIZ.LIZ.LIZIZ.LIZLLL == 5 && i3 >= 26) {
                LIZLLL.setJustificationMode(1);
            }
            StaticLayout build = LIZLLL.build();
            this.LIZ = build;
            float lineWidth = build.getLineWidth(build.getLineCount() - 1);
            float f = c79755VRv.LIZJ;
            if (lineWidth > f && c79755VRv.LIZLLL == 0) {
                StaticLayout.Builder LIZLLL2 = LIZLLL(c79755VRv.LIZ, LIZIZ, c79755VRv.LJFF, f);
                LIZLLL2.setMaxLines(c79755VRv.LJ);
                LIZLLL2.setEllipsize(TextUtils.TruncateAt.END);
                double floor = Math.floor(c79755VRv.LIZJ) * 2.0d;
                Layout layout = this.LIZ;
                LIZLLL2.setEllipsizedWidth((int) (floor - layout.getLineWidth(layout.getLineCount() - 1)));
                this.LIZ = LIZLLL2.build();
                return;
            }
            return;
        }
        CharSequence charSequence = c79755VRv.LIZ;
        int length = charSequence.length();
        TextPaint textPaint = c79755VRv.LJFF;
        int floor2 = (int) Math.floor(c79755VRv.LIZJ);
        C79743VRj c79743VRj2 = this.LIZIZ.LIZ.LIZIZ;
        float f2 = c79743VRj2.LJIIL;
        boolean z2 = c79743VRj2.LJIJ;
        if (c79755VRv.LIZLLL == 0) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            truncateAt = null;
        }
        this.LIZ = C74076T5k.LIZ(charSequence, length, textPaint, floor2, LIZIZ, 1.0f, f2, z2, truncateAt, c79755VRv.LJ, c79743VRj2.LIZ());
    }

    public final float LIZIZ(float f) {
        if (this.LIZ.getLineLeft(0) == 0.0f) {
            return 0.0f;
        }
        if (this.LIZ.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            return (-(this.LIZ.getWidth() - f)) / 2.0f;
        }
        if (this.LIZ.getAlignment() != Layout.Alignment.ALIGN_OPPOSITE && this.LIZ.getParagraphDirection(0) != -1) {
            return 0.0f;
        }
        return -(this.LIZ.getWidth() - f);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.VNU r20) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79744VRk.LJFF(X.VNU):void");
    }

    public C79744VRk(VNU vnu, C79746VRm c79746VRm) {
        C79751VRr[] c79751VRrArr;
        this.LIZIZ = c79746VRm;
        LJFF(vnu);
        if (c79746VRm.LJI && !c79746VRm.LJII) {
            Layout layout = this.LIZ;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) != 0 && (c79746VRm.LIZ.LIZ instanceof SpannableStringBuilder)) {
                int lineCount = this.LIZ.getLineCount() - 1;
                int ellipsisStart = this.LIZ.getEllipsisStart(lineCount) + this.LIZ.getLineStart(lineCount);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c79746VRm.LIZ.LIZ);
                C79751VRr[] c79751VRrArr2 = (C79751VRr[]) spannableStringBuilder.getSpans(0, 1, C79751VRr.class);
                if (c79751VRrArr2 != null && c79751VRrArr2.length != 0 && (c79751VRrArr = (C79751VRr[]) spannableStringBuilder.getSpans(ellipsisStart, ellipsisStart + 1, C79751VRr.class)) != null && c79751VRrArr.length != 0) {
                    C79751VRr c79751VRr = c79751VRrArr[c79751VRrArr.length - 1];
                    int spanStart = spannableStringBuilder.getSpanStart(c79751VRr);
                    int spanEnd = spannableStringBuilder.getSpanEnd(c79751VRr);
                    spannableStringBuilder.removeSpan(c79751VRr);
                    if (spanStart < ellipsisStart) {
                        spannableStringBuilder.setSpan(c79751VRr, spanStart, ellipsisStart, 33);
                    }
                    spannableStringBuilder.setSpan(new C79751VRr(c79751VRrArr2[0].LJLIL), ellipsisStart, spanEnd, 34);
                    c79746VRm.LIZ.LIZ = spannableStringBuilder;
                    this.LIZ = null;
                    LJFF(vnu);
                }
            }
        }
        if (this.LIZ.getWidth() == 0 || this.LIZ.getHeight() == 0) {
            return;
        }
        Spanned spanned = (Spanned) this.LIZ.getText();
        for (C79750VRq c79750VRq : (C79750VRq[]) spanned.getSpans(0, spanned.length(), C79750VRq.class)) {
            int spanStart2 = spanned.getSpanStart(c79750VRq);
            int spanEnd2 = spanned.getSpanEnd(c79750VRq);
            if (spanStart2 == 0 && spanEnd2 == spanned.length()) {
                c79750VRq.LJLIL.set(new Rect(0, 0, (int) LIZJ(), this.LIZ.getHeight()));
            } else {
                int lineForOffset = this.LIZ.getLineForOffset(spanStart2);
                int lineForOffset2 = this.LIZ.getLineForOffset(spanEnd2);
                Rect rect = new Rect();
                for (int i = lineForOffset; i <= lineForOffset2; i++) {
                    Rect rect2 = new Rect();
                    this.LIZ.getLineBounds(i, rect2);
                    if (i == lineForOffset) {
                        rect2.left = Math.max(rect2.left, (int) this.LIZ.getPrimaryHorizontal(spanStart2));
                    }
                    if (i == lineForOffset2) {
                        rect2.right = Math.min(rect2.right, (int) this.LIZ.getPrimaryHorizontal(spanEnd2));
                    }
                    if (rect2.right != 0) {
                        rect.union(rect2);
                    }
                }
                c79750VRq.LJLIL.set(rect);
            }
        }
    }

    public final CharSequence LJ(Spanned spanned, int i, int i2) {
        C79751VRr[] c79751VRrArr;
        int min = Math.min(spanned.length(), Math.max(0, i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned.subSequence(0, min));
        if (i2 != -1) {
            if (this.LIZIZ.LIZ.LIZIZ.LIZ() == TextDirectionHeuristics.LTR) {
                spannableStringBuilder.append((CharSequence) "\u200e");
            } else if (this.LIZIZ.LIZ.LIZIZ.LIZ() == TextDirectionHeuristics.RTL) {
                spannableStringBuilder.append((CharSequence) "\u200f");
            }
        }
        spannableStringBuilder.append((CharSequence) "…");
        if (this.LIZIZ.LJI && (c79751VRrArr = (C79751VRr[]) spannableStringBuilder.getSpans(0, 1, C79751VRr.class)) != null && c79751VRrArr.length != 0) {
            spannableStringBuilder.setSpan(new C79751VRr(c79751VRrArr[0].LJLIL), min, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final StaticLayout.Builder LIZLLL(CharSequence charSequence, Layout.Alignment alignment, TextPaint textPaint, float f) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.floor(f));
        obtain.setAlignment(alignment);
        obtain.setLineSpacing(this.LIZIZ.LIZ.LIZIZ.LJIIL, 1.0f);
        obtain.setIncludePad(this.LIZIZ.LIZ.LIZIZ.LJIJ);
        obtain.setTextDirection(this.LIZIZ.LIZ.LIZIZ.LIZ());
        obtain.setBreakStrategy(this.LIZIZ.LJFF);
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        return obtain;
    }
}
