package X;

import android.text.TextUtils;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class IUY {
    public static final java.util.Map<String, CronetUrlRequest> LIZ = new ConcurrentHashMap();

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) LIZ).remove(str);
        }
    }
}
