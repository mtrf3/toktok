package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes12.dex */
public final class Q94 implements InputFilter {
    public final int LJLIL;

    public Q94(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (CastIntegerProtector.parseInt(sb.toString()) <= this.LJLIL) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
