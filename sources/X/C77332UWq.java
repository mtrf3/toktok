package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UWq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77332UWq {
    public static void LIZ(String token) {
        o.LJIIIZ(token, "token");
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", token);
        hashMap.put("mix_mode", "1");
        hashMap.put("platform_app_id", "310");
        hashMap.put("app_id", String.valueOf(C77274UUk.LIZ));
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/user/fetch_oauth_info/", hashMap, new C77333UWr());
    }
}
