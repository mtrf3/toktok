package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.8ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216728ey {
    public static final String LIZ(long j, Aweme aweme) {
        if (aweme == null || (!AV1.LJIJI(aweme.getAuthorUid()) ? (((Number) C217178fh.LIZ.getValue()).intValue() & 1) != 1 : !C178406zM.LJIIJJI() ? (((Number) C217178fh.LIZ.getValue()).intValue() & 2) != 2 : (((Number) C217178fh.LIZ.getValue()).intValue() & 4) != 4)) {
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(count)");
            return LJJIIJ;
        }
        if (j < 0) {
            j = 0;
        }
        String format = new DecimalFormat(",###", new DecimalFormatSymbols(Locale.getDefault())).format(j);
        o.LJIIIIZZ(format, "decimalFormat.format(displayCount)");
        return format;
    }
}
