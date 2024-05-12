package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80523Ea {
    public static void LIZ(String str) {
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        eventSender.LIZIZ("im_user_cache_hit", C51029K0z.LJJIIZI(new OSZ("cache_source", str)));
    }

    public static void LIZIZ(String str) {
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        eventSender.LIZIZ("im_user_cache_miss", C51029K0z.LJJIIZI(new OSZ("cache_source", str)));
    }
}
