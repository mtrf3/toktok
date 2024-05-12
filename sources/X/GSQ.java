package X;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GSQ implements InputFilter {
    public final /* synthetic */ GS5 LJLIL;

    public GSQ(GS5 gs5) {
        this.LJLIL = gs5;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        GS5 gs5 = this.LJLIL;
        CharSequence subSequence = charSequence.subSequence(i, i2);
        gs5.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        o.LJIIIIZZ(spans, "spans");
        for (Object obj : spans) {
            spannableStringBuilder.removeSpan(obj);
        }
        return spannableStringBuilder;
    }
}
