package X;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import kotlin.jvm.internal.o;

/* renamed from: X.4SF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SF {
    public static final SpannableStringBuilder LIZ(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2) {
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float measureText = i - (textPaint.measureText("...") + 0);
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i3 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i3);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i3;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length(), spannableStringBuilder.length());
        o.LJIIIIZZ(subSequence, "spannableStringBuilder.s…ableStringBuilder.length)");
        C116724i4 c116724i4 = new C116724i4();
        CharSequence subSequence2 = spannableStringBuilder.subSequence(0, lineStart);
        o.LJIIIIZZ(subSequence2, "spannableStringBuilder.subSequence(0, endIndex)");
        c116724i4.LIZIZ(subSequence2);
        c116724i4.LJ("...");
        c116724i4.LIZIZ(" ");
        c116724i4.LJ(subSequence);
        return new SpannableStringBuilder(c116724i4.LIZ);
    }
}
