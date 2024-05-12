package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.T4y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74064T4y {
    public final TextPaint LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final TextView LJ;

    public static SpannableString LIZ(SpannableString spannableString, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) spannableString.subSequence(0, i - i2));
        LIZ.append("...");
        return new SpannableString(X1D.LIZIZ(LIZ));
    }

    public static int LIZIZ(int i, TextView textView, CharSequence charSequence) {
        TextView textView2 = new TextView(textView.getContext());
        textView2.setTextSize(0, textView.getTextSize());
        textView2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        textView2.setTypeface(textView.getTypeface());
        textView2.setIncludeFontPadding(textView.getIncludeFontPadding());
        textView2.setText(charSequence);
        textView2.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView2.getMeasuredHeight();
    }

    public C74064T4y(TextView textView, TextPaint textPaint, int i, String str, int i2) {
        this.LIZJ = 4;
        this.LIZ = textPaint;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJ = textView;
    }
}
