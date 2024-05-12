package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157326Fk extends InputFilter.LengthFilter {
    public C157326Fk(int i) {
        super(i);
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        o.LJI(spanned);
        spanned.length();
        return super.filter(charSequence, i, i2, spanned, i3, i4);
    }
}
