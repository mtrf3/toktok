package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import ujb.o;
import ujb.s;

/* renamed from: X.6eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165276eB {
    public static String LIZ(long j) {
        String LIZIZ = Q8U.LIZIZ(new Object[]{Float.valueOf(((float) j) / 1048576.0f)}, 1, "%.1f", "format(format, *args)");
        if (o.LJJJJ(LIZIZ, CardStruct.IStatusCode.DEFAULT, false) && s.LJJJLZIJ(LIZIZ, ".", false)) {
            String substring = LIZIZ.substring(0, s.LJJLIIIJL(LIZIZ, ".", 0, false, 6));
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return LIZIZ;
    }
}
