package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AjK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27038AjK implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned spanned, int i3, int i4) {
        o.LJIIIZ(source, "source");
        if (TextUtils.isEmpty(s.LJZI(source.toString()).toString()) && source.length() > 0 && i3 == 0) {
            return "";
        }
        return null;
    }
}
