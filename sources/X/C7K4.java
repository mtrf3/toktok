package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7K4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7K4 implements InputFilter {
    public final int LJLIL;
    public String LJLILLLLZI;

    public C7K4(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.LJLIL - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
                    C5S1 c5s1 = new C5S1(C1791471i.LIZ);
                    c5s1.LIZLLL(this.LJLILLLLZI);
                    c5s1.LJ();
                } else {
                    String string = C1791471i.LIZ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL));
                    C5S1 c5s12 = new C5S1(C1791471i.LIZ);
                    c5s12.LIZLLL(string);
                    c5s12.LJ();
                }
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i6))) {
            if (i6 == i) {
                String string2 = C1791471i.LIZ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL));
                C5S1 c5s13 = new C5S1(C1791471i.LIZ);
                c5s13.LIZLLL(string2);
                c5s13.LJ();
                return "";
            }
            i5 = i6;
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            C5S1 c5s14 = new C5S1(C1791471i.LIZ);
            c5s14.LIZLLL(this.LJLILLLLZI);
            c5s14.LJ();
        } else {
            String string3 = C1791471i.LIZ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL));
            C5S1 c5s15 = new C5S1(C1791471i.LIZ);
            c5s15.LIZLLL(string3);
            c5s15.LJ();
        }
        return charSequence.subSequence(i, i5);
    }
}
