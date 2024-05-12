package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29823Bn9 {
    public static Long LIZ = 0L;
    public static Long LIZIZ = 0L;
    public static Long LIZJ = 0L;

    public static int LIZ() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }
}
