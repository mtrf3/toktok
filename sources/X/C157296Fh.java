package X;

import android.text.InputFilter;
import android.text.Spanned;
import ujb.s;

/* renamed from: X.6Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157296Fh implements InputFilter {
    public final C6AG LJLIL;

    public C157296Fh(C6AG c6ag) {
        this.LJLIL = c6ag;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if ("\n".equals(charSequence) && i == 0 && i2 == 1) {
            this.LJLIL.LIZ();
            return "";
        }
        if (charSequence == null || charSequence.length() == 0 || spanned == null || spanned.length() == 0) {
            return null;
        }
        Character ch = '\n';
        if (!ch.equals(Character.valueOf(C40689Fy1.LLIFFJFJJ(charSequence))) || !s.LJJLI(spanned.subSequence(i3, i4).toString(), C40689Fy1.LLFF(charSequence))) {
            return null;
        }
        this.LJLIL.LIZ();
        return C40689Fy1.LLFF(charSequence);
    }
}
