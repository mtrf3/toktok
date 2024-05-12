package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CCy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30956CCy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC30955CCx eventPage, boolean z, String str, String activityName) {
        String str2;
        o.LJIIIZ(eventPage, "eventPage");
        o.LJIIIZ(activityName, "activityName");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_campaign_container_click");
        LIZ2.LJIJJ(eventPage.getValue(), "event_page");
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ2.LJIJJ(str2, "user_type");
        if (str != null) {
            LIZ2.LJIJJ(str, "subscribe_state");
        }
        LIZ2.LJIJJ(activityName, "activity_name");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(EnumC30955CCx eventPage, boolean z, String str, String activityName) {
        String str2;
        o.LJIIIZ(eventPage, "eventPage");
        o.LJIIIZ(activityName, "activityName");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_campaign_container_show");
        LIZ2.LJIJJ(eventPage.getValue(), "event_page");
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ2.LJIJJ(str2, "user_type");
        if (str != null) {
            LIZ2.LJIJJ(str, "subscribe_state");
        }
        LIZ2.LJIJJ(activityName, "activity_name");
        LIZ2.LJJIIJZLJL();
    }
}
