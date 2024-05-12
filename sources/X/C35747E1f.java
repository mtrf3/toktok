package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.E1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35747E1f {
    public static final java.util.Map<ECommerceMessage, OSZ<Long, Long>> LIZ = new HashMap();

    public static void LIZ(ECommerceMessage message, Long l, Long l2) {
        long j;
        o.LJIIIZ(message, "message");
        java.util.Map<ECommerceMessage, OSZ<Long, Long>> map = LIZ;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        if (l2 != null) {
            j2 = l2.longValue();
        }
        ((HashMap) map).put(message, new OSZ(valueOf, Long.valueOf(j2)));
    }
}
