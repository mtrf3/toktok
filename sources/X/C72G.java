package X;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;

/* renamed from: X.72G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C72G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SpannableString spannableString, int i, int i2) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return;
        }
        spannableString.setSpan(new StyleSpan(1), max, i2, 17);
    }
}
