package X;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: X.07d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C022907d {
    public static String[] LIZ(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params LIZIZ(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void LIZJ(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
