package X;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.YBh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86969YBh extends C86968YBg {
    public C86969YBh(List<Locale> list) {
        super(list);
    }

    @Override // X.C86968YBg
    public final int LIZLLL(int i, String name) {
        o.LJIIIZ(name, "name");
        String substring = name.substring(i, i + 1);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int LIZJ = LIZJ(substring);
        char charAt = name.charAt(i);
        if (i != 0 && Character.isLowerCase(charAt)) {
            LIZJ += 26;
        }
        if (LIZJ == -1) {
            if (Character.isDigit(charAt)) {
                return (((this.LIZIZ + 1) + charAt) - 48) + 26;
            }
            if (C78840Uwu.LJJII(charAt)) {
                return this.LIZIZ + 1 + 36;
            }
            String substring2 = name.substring(i);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            if (C78840Uwu.LJJ(substring2)) {
                return 99;
            }
            return this.LIZIZ + 1 + 37;
        }
        return LIZJ;
    }
}
