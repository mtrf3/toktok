package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC118814lR extends AbstractC38911fr {
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    public final CharSequence LJJJI(CharSequence text) {
        o.LJIIIZ(text, "text");
        if (this.LJLILLLLZI <= 0 || text.length() == 0) {
            return text;
        }
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = text.charAt(i2);
            if (charAt != this.LJLJI.charAt(0)) {
                sb.append(charAt);
                if ((sb.length() - i) % this.LJLILLLLZI == 0) {
                    sb.append(this.LJLJI);
                    i++;
                }
            }
        }
        int lastIndexOf = sb.lastIndexOf(this.LJLJI);
        if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        int i3 = this.LJLJJI;
        if (length2 <= i3) {
            return sb2;
        }
        String substring = sb2.substring(0, i3);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public AbstractC118814lR(int i, String str, int i2) {
        int i3;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        int i4 = (i2 / i) + i2;
        if (i2 % i > 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.LJLJJI = i4 - i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3C4, java.lang.Object] */
    @Override // X.AbstractC38911fr
    public final int LJIL(int i, CharSequence oldText, CharSequence newText) {
        String str;
        o.LJIIIZ(oldText, "oldText");
        o.LJIIIZ(newText, "newText");
        String str2 = (String) oldText;
        int i2 = 0;
        try {
            String charSequence = str2.subSequence(0, Math.min(i, str2.length())).toString();
            C3C5.m7constructorimpl(charSequence);
            str = charSequence;
        } catch (Throwable th) {
            ?? LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            str = LIZ;
        }
        if (!C3C5.m12isFailureimpl(str)) {
            oldText = str;
        }
        int length = ujb.o.LJJJJZ(oldText.toString(), this.LJLJI, "", false).length();
        int i3 = this.LJLILLLLZI;
        int i4 = i3 + 1;
        int i5 = (length % i3) + ((length / i3) * i4);
        if (i5 % i4 == 0) {
            i5--;
        }
        int length2 = newText.length();
        if (i5 >= 0) {
            i2 = i5;
        }
        if (i2 > length2) {
            return length2;
        }
        return i2;
    }
}
