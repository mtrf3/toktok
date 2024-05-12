package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97863sk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("filtered_request_guide", C113554cx.LJJL(new OSZ("enter_from", "notification_page"), new OSZ("action_type", str)));
    }

    public static void LIZIZ(String str, String str2) {
        C05040Hs.LIZJ(str, "source", "onEventV3").LIZIZ("delete_all_confirm", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("target", str2)));
    }

    public static void LIZ(EnumC97443s4 enumC97443s4, boolean z, boolean z2) {
        String str;
        String str2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (z) {
            if (z2) {
                str = "delete_all";
            } else {
                str = "delete_selected";
            }
        } else if (z2) {
            str = "read_all";
        } else {
            str = "read_selected";
        }
        OSZ[] oszArr = new OSZ[2];
        if (enumC97443s4 == EnumC97443s4.FILTERED) {
            str2 = "filtered_message_request";
        } else {
            str2 = "non_filtered_message_request";
        }
        oszArr[0] = new OSZ("enter_from", str2);
        oszArr[1] = new OSZ("action", str);
        onEventV3.LIZIZ("dm_multiselect_action", C113554cx.LJJL(oszArr));
    }
}
