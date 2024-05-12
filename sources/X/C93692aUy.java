package X;

/* renamed from: X.aUy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93692aUy {
    public static CharSequence LIZ(CharSequence charSequence, String str) {
        StringBuilder sb = new StringBuilder();
        if (charSequence.length() == 0) {
            return sb;
        }
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isDigit(charAt) && (charAt != '.' || z)) {
                break;
            }
            sb.append(charAt);
            if (charAt == '.') {
                z = true;
            }
        }
        sb.append(str);
        return sb;
    }
}
