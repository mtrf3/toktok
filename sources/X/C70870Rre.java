package X;

import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.Rre, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70870Rre {
    public static final LruCache<String, InterfaceC43919HLn<C76800UCe>> LIZ = new LruCache<>(5);

    public static void LIZ(Integer num, Integer num2, String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        if (num != null && num2 != null) {
            imageUrl = C1E4.LJJIIZ(imageUrl, num.intValue(), num2.intValue(), EnumC70569Rmn.LIVE_POP_CARD);
        }
        LruCache<String, InterfaceC43919HLn<C76800UCe>> lruCache = LIZ;
        C84657XKj LIZ2 = C77275UUl.LIZ();
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C27819Avv(imageUrl, LIZ2, null), 3);
        lruCache.put(imageUrl, LIZ2);
    }
}
