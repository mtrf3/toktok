package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18520o4 {
    public static final int LIZ(int i, CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
        }
        return charSequence.length();
    }
}
