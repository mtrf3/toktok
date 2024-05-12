package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;

/* loaded from: classes13.dex */
public final class S0X extends LruCache<String, RelatedProductInfo> {
    public S0X() {
        super(20);
    }

    public static String LIZ(String str, String str2) {
        String LIZIZ;
        if (str2 == null || (LIZIZ = C00F.LIZIZ(str, '_', str2)) == null) {
            return String.valueOf(str);
        }
        return LIZIZ;
    }
}
