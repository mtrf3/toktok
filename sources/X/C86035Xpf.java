package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xpf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86035Xpf {
    public static String LIZ(int i, EnumC80568Vjg unit) {
        Locale locale = Locale.getDefault();
        o.LJFF(locale, "Locale.getDefault()");
        o.LJIIJ(unit, "unit");
        return new BDDateFormat().LIZLLL(i, unit, locale);
    }
}
