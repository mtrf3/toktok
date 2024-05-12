package X;

import com.google.gson.internal.b;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HOy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44008HOy {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LJ(String str) {
        try {
            return (HashMap) C75792yF.LIZIZ().LJII(str, new C44007HOx().getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public static java.util.Map LIZ(String str, String str2, boolean z) {
        return C113554cx.LJJLIIIIJ(new OSZ("room_id", str), new OSZ("anchor_id", str2), new OSZ("event_page", "shop_live_highlight"), new OSZ("enter_from_page", "shop_live"), new OSZ("is_top_module", Integer.valueOf(z ? 1 : 0)), new OSZ("is_ecom_live_highlight", 1));
    }

    public static java.util.Map LIZIZ(String str, String str2, boolean z, boolean z2) {
        return C113554cx.LJJLIIIIJ(new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("author_id", str2), new OSZ("room_id", str), new OSZ("page_name", "shop_live_highlight"), new OSZ("live_status", "before_live"), new OSZ("user_type", "author"), new OSZ("is_empty", Integer.valueOf(z ? 1 : 0)), new OSZ("is_greenhand_guider", Integer.valueOf(z2 ? 1 : 0)));
    }

    public static void LIZJ(long j, String roomId, String authorId, String fragmentId, String str, boolean z) {
        HashMap LJ;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(fragmentId, "fragmentId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, z);
        LIZ2.put("label", "ecom");
        LIZ2.put("time", Long.valueOf(j));
        LIZ2.put("fragment_id", fragmentId);
        if (str != null && (LJ = LJ(str)) != null) {
            LIZ2.putAll(LJ);
        }
        b.LJJIJIIJI("livesdk_live_highlight_cover_show", LIZ2);
    }

    public static void LIZLLL(long j, long j2, String roomId, String authorId, String str, String str2, String str3, boolean z) {
        HashMap LJ;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, z);
        LIZ2.put("label", "ecom");
        LIZ2.put("time", Long.valueOf(j));
        LIZ2.put("fragment_id", str);
        LIZ2.put("duration", Long.valueOf(j2));
        LIZ2.put("close_status", str2);
        if (str3 != null && (LJ = LJ(str3)) != null) {
            LIZ2.putAll(LJ);
        }
        b.LJJIJIIJI("livesdk_anchor_highlight_post_loading_close", LIZ2);
    }
}
