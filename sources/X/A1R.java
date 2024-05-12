package X;

import android.text.SpannableString;
import java.util.List;
import ujb.s;

/* loaded from: classes5.dex */
public final class A1R {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;

    public final SpannableString LIZ() {
        SpannableString spannableString = new SpannableString(this.LIZIZ);
        List<String> list = this.LIZJ;
        if (list != null) {
            for (String str : list) {
                int LJJLIIIJL = s.LJJLIIIJL(spannableString, str, 0, false, 6);
                if (LJJLIIIJL != -1) {
                    spannableString.setSpan(new T5U(43, true), LJJLIIIJL, str.length() + LJJLIIIJL, 0);
                }
            }
        }
        return spannableString;
    }

    public A1R(String str, String str2, List list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
