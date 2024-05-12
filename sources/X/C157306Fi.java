package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import ujb.s;

/* renamed from: X.6Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157306Fi implements InputFilter {
    public static final C157306Fi LJLIL = new C157306Fi();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence charSequence2;
        if (charSequence != null) {
            charSequence2 = s.LJZI(charSequence);
        } else {
            charSequence2 = null;
        }
        if (!TextUtils.isEmpty(charSequence2) && !String.valueOf(charSequence2).contentEquals("\n")) {
            return null;
        }
        return "";
    }
}
