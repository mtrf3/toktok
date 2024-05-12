package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EHH {
    public static final LruCache<String, PokerBundle> LIZ = new LruCache<>(5);

    public static String LIZ(Double d, Double d2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(d);
        LIZ2.append(',');
        LIZ2.append(d2);
        String LIZJ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZJ, "md5Hex(\"$long,$lati\")");
        return LIZJ;
    }
}
