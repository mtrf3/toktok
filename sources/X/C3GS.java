package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.3GS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, int i, int i2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        LIZ3.put("duration", String.valueOf(j));
        LIZ3.put("upload_type", String.valueOf(i));
        LIZ3.put("count", String.valueOf(i2));
        LIZ2.LIZIZ("contact_bytesync_coldstart_updated", LIZ3);
    }

    public static void LIZLLL(long j, int i, int i2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        LIZ3.put("duration", String.valueOf(j));
        LIZ3.put("count", String.valueOf(i));
        LIZ3.put("status", String.valueOf(i2));
        LIZ2.LIZIZ("contact_user_list_full_request", LIZ3);
    }

    public static void LIZIZ(int i, long j, long j2, boolean z) {
        String str;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (j < j2) {
            C1HQ c1hq = new C1HQ();
            c1hq.put("type", String.valueOf(i));
            c1hq.put("time_delta_contact", String.valueOf(j));
            c1hq.put("time_delta_imuser", String.valueOf(j2));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1hq.put("is_history", str);
            onEventV3.LIZIZ("contact_bytesync_event_receive", c1hq);
        }
    }

    public static void LIZJ(int i, String str, int i2, int i3) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put(WM7.SCENE_SERVICE, "share_panel");
        c1hq.put("miss_users_count", String.valueOf(i));
        c1hq.put("miss_user_ids", str);
        c1hq.put("updated_count", String.valueOf(i2));
        c1hq.put("contact_user_total_count", String.valueOf(i3));
        onEventV3.LIZIZ("contact_userlist_completeness", c1hq);
    }
}
