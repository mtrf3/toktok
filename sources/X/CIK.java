package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CIK implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (o.LJ(String.valueOf(charSequence), "\n")) {
            return "";
        }
        return null;
    }
}
