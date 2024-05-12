package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77769Ufd {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ = "";
    public static final ConcurrentHashMap<String, Diamond> LIZLLL = new ConcurrentHashMap<>();

    public static boolean LIZIZ() {
        if (LIZIZ != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() || LIZJ.length() <= 0 || System.currentTimeMillis() - LIZ >= 3600000) {
            return false;
        }
        return true;
    }

    public static Diamond LIZ(String iapId) {
        o.LJIIIZ(iapId, "iapId");
        if (iapId.length() == 0 || !LIZIZ()) {
            return null;
        }
        return LIZLLL.get(iapId);
    }
}
