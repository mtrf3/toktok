package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.a2e, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91936a2e {
    public int LIZJ;
    public boolean LJII;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZLLL = "";
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new T5U(i, false), length, spannableStringBuilder.length(), 17);
    }
}
