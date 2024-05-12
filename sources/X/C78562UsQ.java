package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UsQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78562UsQ implements InputFilter {
    public final C78563UsR[] LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;

    public C78562UsQ(C78563UsR[] rules, AqS181S0100000_15 aqS181S0100000_15) {
        o.LJIIIZ(rules, "rules");
        this.LJLIL = rules;
        this.LJLILLLLZI = aqS181S0100000_15;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String str;
        CharSequence charSequence2;
        if (charSequence == null || (str = charSequence.subSequence(i, i2).toString()) == null) {
            str = "";
        }
        if (spanned != null) {
            charSequence2 = s.LJLIL(spanned, i3, i4, str);
        } else {
            charSequence2 = null;
        }
        for (C78563UsR c78563UsR : this.LJLIL) {
            if (!PatternProtector.compile(c78563UsR.LIZ).matcher(charSequence2).matches()) {
                this.LJLILLLLZI.invoke(Integer.valueOf(c78563UsR.LIZIZ));
                if (spanned == null) {
                    return null;
                }
                return spanned.subSequence(i3, i4);
            }
        }
        return null;
    }
}
