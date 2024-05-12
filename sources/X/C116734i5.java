package X;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.o;

/* renamed from: X.4i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116734i5 {
    public static void LIZ(C116714i3 text, CharSequence cs) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(cs, "cs");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((char) 8296);
        spannableStringBuilder.append(cs);
        spannableStringBuilder.append((char) 8297);
        text.LIZ(text.length());
        text.LIZ((spannableStringBuilder.length() + r1) - 1);
        text.append((CharSequence) spannableStringBuilder);
    }
}
