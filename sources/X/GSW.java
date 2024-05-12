package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.lexical.platform.span.AdSpan;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GSW implements InputFilter {
    public final GSU LJLIL;

    public GSW(GSU gsu) {
        this.LJLIL = gsu;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length;
        AdSpan[] adSpanArr = (AdSpan[]) spanned.getSpans(0, spanned.length(), AdSpan.class);
        if (TextUtils.isEmpty(this.LJLIL.getAdTag())) {
            length = spanned.length();
        } else {
            if (adSpanArr.length == 0) {
                return null;
            }
            length = this.LJLIL.getNoAdTagText().length();
        }
        int i5 = 150 - (length - (i4 - i3));
        if (i5 <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                C5S1 c5s1 = new C5S1(C1791471i.LIZ);
                c5s1.LIZJ(R.string.txr);
                c5s1.LJ();
            }
            return "";
        }
        if (i5 >= i2 - i) {
            return null;
        }
        int i6 = i5 + i;
        int i7 = i6 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i7))) {
            if (i7 == i) {
                C5S1 c5s12 = new C5S1(C1791471i.LIZ);
                c5s12.LIZJ(R.string.txr);
                c5s12.LJ();
                return "";
            }
            i6 = i7;
        }
        C5S1 c5s13 = new C5S1(C1791471i.LIZ);
        c5s13.LIZJ(R.string.txr);
        c5s13.LJ();
        return charSequence.subSequence(i, i6);
    }
}
