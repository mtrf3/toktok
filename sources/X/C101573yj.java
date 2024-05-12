package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;

/* renamed from: X.3yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101573yj {
    public static final C101573yj LIZ = new C101573yj();

    public static void LJI(C101573yj c101573yj, C109544Rq c109544Rq, boolean z) {
        Integer M;
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c109544Rq != null) {
            int i = -1;
            if (c109544Rq.getConversationType() == AbstractC63505Ow9.LIZ) {
                C101543yg.LIZ.getClass();
                if (C101543yg.LIZIZ > -1) {
                    OSZ[] oszArr = new OSZ[6];
                    oszArr[0] = new OSZ("chat_type", "private");
                    oszArr[1] = new OSZ("to_user_id", String.valueOf(C81273Gx.LIZLLL(c109544Rq.getConversationId())));
                    oszArr[2] = new OSZ("message_id", c109544Rq.getUuid());
                    oszArr[3] = new OSZ("conversation_id", c109544Rq.getConversationId());
                    C101543yg.LIZ.getClass();
                    oszArr[4] = new OSZ("relation_tag", String.valueOf(C101543yg.LIZIZ));
                    PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
                    if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null) {
                        i = M.intValue();
                    }
                    oszArr[5] = new OSZ("sender_permission", String.valueOf(i));
                    C1HQ LJFF = C78966Uyw.LJFF(oszArr);
                    if (z) {
                        onEventV3.LIZIZ("click_dm_message_fail_icon", LJFF);
                    } else {
                        onEventV3.LIZIZ("show_dm_message_fail_icon", LJFF);
                    }
                }
            }
        }
    }

    public static void LJII(C101573yj c101573yj, C109544Rq c109544Rq, Integer num) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c109544Rq != null && c109544Rq.getConversationType() == AbstractC63505Ow9.LIZ) {
            C101543yg.LIZ.getClass();
            if (C101543yg.LIZIZ > -1 && 1 != 0) {
                C101543yg.LIZ.getClass();
                C1HQ LJFF = C78966Uyw.LJFF(new OSZ("to_user_id", String.valueOf(C81273Gx.LIZLLL(c109544Rq.getConversationId()))), new OSZ("message_id", c109544Rq.getUuid()), new OSZ("conversation_id", c109544Rq.getConversationId()), new OSZ("relation_tag", String.valueOf(C101543yg.LIZIZ)));
                if (num != null) {
                    LJFF.put("click_on", String.valueOf(num.intValue()));
                    onEventV3.LIZIZ("click_resend_panel", LJFF);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                onEventV3.LIZIZ("show_resend_panel", LJFF);
            }
        }
    }

    public static void LJIIIIZZ(C101573yj c101573yj, String str, String str2) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("show_dm_permissions_button", C78966Uyw.LJFF(new OSZ("enter_from", str), new OSZ("position", str2)));
    }

    public static void LIZJ(C101573yj c101573yj, int i, Integer num, int i2) {
        String str;
        C85323Wm onEventV3 = null;
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        c101573yj.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    str = "";
                } else {
                    str = "2";
                }
            } else {
                str = "1";
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1HQ LJFF = C78966Uyw.LJFF(new OSZ("enter_from", "notification_page"), new OSZ("preset", str));
        if (num != null) {
            LJFF.put("action", String.valueOf(num.intValue()));
            onEventV3.LIZIZ("click_chat_with_more_people_panel", LJFF);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        onEventV3.LIZIZ("show_chat_with_more_people_panel", LJFF);
    }

    public static void LIZLLL(C101573yj c101573yj, String str, String str2, int i) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("click_dm_permissions_button", C78966Uyw.LJFF(new OSZ("enter_from", str), new OSZ("position", str2), new OSZ("state", String.valueOf(i))));
    }

    public static void LJ(C101573yj c101573yj, String enterFrom, String enterMethod, EnumC101583yk enumC101583yk) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LJFF = C78966Uyw.LJFF(new OSZ("enter_from", enterFrom), new OSZ("enter_method", enterMethod));
        if (enumC101583yk != null) {
            LJFF.put("panel_version", String.valueOf(enumC101583yk.getEventTrackingConstant()));
        }
        onEventV3.LIZIZ("permissions_toast_click", LJFF);
    }

    public static void LJIIIZ(C101573yj c101573yj, String enterFrom, String enterMethod, EnumC101583yk enumC101583yk) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c101573yj.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LJFF = C78966Uyw.LJFF(new OSZ("enter_from", enterFrom), new OSZ("enter_method", enterMethod));
        if (enumC101583yk != null) {
            LJFF.put("panel_version", String.valueOf(enumC101583yk.getEventTrackingConstant()));
        }
        onEventV3.LIZIZ("permissions_toast_show", LJFF);
    }

    public static void LJIIJ(C101573yj c101573yj, int i, String enterMethod, int i2) {
        C85323Wm onEventV3;
        if ((i2 & 2) != 0) {
            enterMethod = "auto";
        }
        if ((i2 & 4) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        c101573yj.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("show_recommended_dm_permission_pop_up", C78966Uyw.LJFF(new OSZ("enter_from", "chat_page"), new OSZ("enter_method", enterMethod), new OSZ(WM7.SCENE_SERVICE, "send_message_with_no_one_permission"), new OSZ("panel_version", String.valueOf(i))));
    }

    public static void LJFF(C101573yj c101573yj, int i, int i2, String enterMethod, int i3) {
        C85323Wm onEventV3;
        if ((i3 & 4) != 0) {
            enterMethod = "auto";
        }
        if ((i3 & 8) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        c101573yj.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LJFF = C78966Uyw.LJFF(new OSZ("enter_from", "chat_page"), new OSZ("enter_method", enterMethod), new OSZ(WM7.SCENE_SERVICE, "send_message_with_no_one_permission"), new OSZ("panel_version", String.valueOf(i)));
        LJFF.put("action_type", String.valueOf(i2));
        onEventV3.LIZIZ("click_recommended_dm_permission_pop_up", LJFF);
    }

    public static void LIZ(C101573yj c101573yj, String str, EnumC101503yc toStatus, EnumC101583yk enumC101583yk, String str2, int i) {
        C85323Wm onEventV3;
        Integer num = null;
        if ((i & 4) != 0) {
            enumC101583yk = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        c101573yj.getClass();
        o.LJIIIZ(toStatus, "toStatus");
        o.LJIIIZ(onEventV3, "onEventV3");
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("enter_method", str2);
        if (enumC101583yk != null) {
            num = Integer.valueOf(enumC101583yk.getEventTrackingConstant());
        }
        oszArr[2] = new OSZ("panel_version", String.valueOf(num));
        oszArr[3] = new OSZ("to_status", toStatus.getEventTrackingString());
        onEventV3.LIZIZ("change_message_permission", C78966Uyw.LJFF(oszArr));
    }

    public static void LIZIZ(C101573yj c101573yj, int i, Integer num, Integer num2, EnumC101583yk panelVersion, int i2) {
        String str;
        String num3;
        C85323Wm onEventV3 = null;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 32) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        c101573yj.getClass();
        o.LJIIIZ(panelVersion, "panelVersion");
        o.LJIIIZ(onEventV3, "onEventV3");
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("action", String.valueOf(i));
        String str2 = "";
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        oszArr[2] = new OSZ(OHQ.LIZIZ, str);
        if (num2 != null && (num3 = num2.toString()) != null) {
            str2 = num3;
        }
        oszArr[3] = new OSZ("relative_preset", str2);
        oszArr[4] = new OSZ("panel_version", String.valueOf(panelVersion.getEventTrackingConstant()));
        onEventV3.LIZIZ("dm_permissions_panel", C78966Uyw.LJFF(oszArr));
    }
}
