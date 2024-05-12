package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.t1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWL {
    public static final TWL LIZ = new TWL();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(TWK.LJLIL);
    public static EnumC74778TWk LIZJ;
    public static long LIZLLL;
    public static EnumC74778TWk LJ;
    public static long LJFF;
    public static String LJI;
    public static final C62822Ol8 LJII;

    static {
        EnumC74778TWk enumC74778TWk = EnumC74778TWk.NORMAL;
        LIZJ = enumC74778TWk;
        LJ = enumC74778TWk;
        LJI = "";
        LJII = C221108m2.LIZIZ(C58586Mz0.LJLIL);
    }

    public static TVD LJ() {
        return (TVD) LIZIZ.getValue();
    }

    public static OSZ LJFF() {
        return new OSZ("floating", "unfixed");
    }

    public static final void LJIILL() {
        HashMap hashMap = new HashMap();
        hashMap.put("subscriber_cnt", CardStruct.IStatusCode.DEFAULT);
        LIZIZ(hashMap);
        LJIL("livesdk_subscription_guest_connection_panel_show", hashMap);
    }

    public static void LIZ(java.util.Map map) {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            hashMap.put("layout_setting", LJFF().getFirst());
            hashMap.put("window_setting", LJFF().getSecond());
            hashMap.put("live_mode", String.valueOf(room.liveRoomMode));
            String requestId = room.getRequestId();
            if (requestId != null) {
                hashMap.put("request_id", requestId);
            }
        }
        TVD LJ2 = LJ();
        if (LJ2 != null) {
            i = LJ2.LJIIJJI;
        } else {
            i = 0;
        }
        ((HashMap) map).put("guest_cnt", String.valueOf(i));
    }

    public static void LIZIZ(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            OSZ LJFF2 = LJFF();
            hashMap.put("layout_setting", LJFF2.getFirst());
            hashMap.put("window_setting", LJFF2.getSecond());
            hashMap.put("guest_cnt", String.valueOf(C74838TYs.LJ().LJJ));
            String str = B5G.LIZIZ().LJJIFFI;
            if (str != null && !TextUtils.isEmpty(str)) {
                hashMap.put("request_id", str);
            }
        }
    }

    public static void LIZJ(java.util.Map map) {
        int i;
        HashMap hashMap = (HashMap) map;
        hashMap.put("layout_setting", LJFF().getFirst());
        hashMap.put("window_setting", LJFF().getSecond());
        TVD LJ2 = LJ();
        if (LJ2 != null) {
            i = LJ2.LJIIJJI;
        } else {
            i = 0;
        }
        hashMap.put("guest_cnt", String.valueOf(i));
    }

    public static String LJII(String[] strArr) {
        if (ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", strArr) && ORY.LJJIJIIJIL("android.permission.CAMERA", strArr)) {
            return "all";
        }
        if (ORY.LJJIJIIJIL("android.permission.CAMERA", strArr) && !ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", strArr)) {
            return "video";
        }
        if (!ORY.LJJIJIIJIL("android.permission.CAMERA", strArr) && ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", strArr)) {
            return "audio";
        }
        return LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIJJI(int i) {
        String str;
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        int i2 = 0;
        hashMap.put("guest_permission", LJI(false, null));
        StringBuilder LIZ2 = X1D.LIZ();
        String str2 = "";
        LIZ2.append("");
        LIZ2.append(i);
        hashMap.put("applying_guest_cnt", X1D.LIZIZ(LIZ2));
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null || num.intValue() != 1) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        hashMap.put("is_applying", str);
        String str3 = C78983UzD.LJLLILLLL;
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("request_page", str2);
        TVD LJ2 = LJ();
        if (LJ2 != null) {
            i2 = LJ2.LJIIJJI;
        }
        hashMap.put("connected_guest_cnt", String.valueOf(i2));
        LJIL("livesdk_guest_application_panel_show", hashMap);
    }

    public static String LJJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 3) {
                return "video";
            }
            if (num.intValue() == 2) {
                return "audio";
            }
            num.intValue();
        }
        return "no_permission";
    }

    public final void LJIILLIIL(String str) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        hashMap.put("guest_invite_type", str);
        hashMap.put("connection_status", CardStruct.IStatusCode.DEFAULT);
        LIZLLL(this, hashMap);
        LJIL("livesdk_guest_preview_page_show", hashMap);
    }

    public static void LIZLLL(TWL twl, java.util.Map map) {
        twl.getClass();
        twl.getClass();
        LIZJ(map);
    }

    public static String LJI(boolean z, Room room) {
        long j;
        Integer num;
        if (!z) {
            TVD LJ2 = LJ();
            if (LJ2 != null) {
                num = Integer.valueOf(LJ2.LJIIZILJ);
            } else {
                num = null;
            }
            return LJJ(num);
        }
        if (room != null) {
            j = C74768TWa.LIZJ(room);
        } else {
            j = 0;
        }
        return LJJ(Integer.valueOf((int) j));
    }

    public static void LJIJI(String trigger, EnumC74778TWk enumC74778TWk) {
        o.LJIIIZ(trigger, "trigger");
        if (LIZJ == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        if (!o.LJ(trigger, "live_over") && !o.LJ(trigger, "manual_setting_switch") && !o.LJ(trigger, "connection_start")) {
            trigger = "others";
        }
        hashMap.put("trigger", trigger);
        LIZJ = null;
        hashMap.put("layout_setting", LJFF().getFirst());
        hashMap.put("window_setting", LJFF().getSecond());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - LIZLLL));
        LJIL("livesdk_multilive_mode_watch_duration", hashMap);
    }

    public static void LJIL(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(map);
        if ((o.LJ("livesdk_linkmic_multi_guest_icon_show", str) || o.LJ("livesdk_multilive_mode_watch_duration", str) || o.LJ("livesdk_multilive_mode_watch_start", str) || o.LJ("livesdk_linkmic_perf_api_finish", str) || o.LJ("livesdk_video_box_gift_icon_effect_show", str) || o.LJ("livesdk_guest_connection_icon_show", str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
            LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
            LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ2.LJJIIZI();
            return;
        }
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIL(boolean z, boolean z2, Integer num) {
        String str;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        hashMap.put("popup_action_type", str);
        if (z) {
            if (z2) {
                str2 = "confirm";
            } else {
                str2 = "cancel";
            }
        } else {
            str2 = "";
        }
        hashMap.put("popup_click_type", str2);
        if (num != null && num.intValue() != 8 && num.intValue() != 5) {
            if (num.intValue() == 6) {
                str3 = "close_icon";
            } else if (num.intValue() == 11) {
                str3 = "kick_out";
            }
            hashMap.put("leave_type", str3);
            LJIL("livesdk_guest_connection_applying_leave_popup", hashMap);
        }
        str3 = "button_back";
        hashMap.put("leave_type", str3);
        LJIL("livesdk_guest_connection_applying_leave_popup", hashMap);
    }

    public static void LJIJJ(String trigger, EnumC74778TWk enumC74778TWk, Integer num) {
        o.LJIIIZ(trigger, "trigger");
        EnumC74778TWk enumC74778TWk2 = LIZJ;
        if (enumC74778TWk == enumC74778TWk2) {
            return;
        }
        if (enumC74778TWk2 != null) {
            LJIJI(trigger, enumC74778TWk2);
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("trigger", trigger);
        if (enumC74778TWk == null) {
            LJ();
        }
        EnumC74778TWk enumC74778TWk3 = EnumC74778TWk.FLOATING;
        if (enumC74778TWk3 != null) {
            LIZJ = enumC74778TWk3;
        }
        hashMap.put("layout_setting", LJFF().getFirst());
        hashMap.put("window_setting", LJFF().getSecond());
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "guest_cnt");
        }
        LJIL("livesdk_multilive_mode_watch_start", hashMap);
        LIZLLL = System.currentTimeMillis();
    }

    public final void LJIILJJIL(String str, String[] strArr, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        if (z) {
            str2 = LJI;
        } else {
            str2 = C78983UzD.LJLLILLLL;
        }
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("check_permission_scene", str2);
        hashMap.put("popup_type", "first_popup");
        hashMap.put("guest_permission", LJI(false, null));
        hashMap.put("require_permission", LJII(strArr));
        hashMap.put("click_type", str);
        LJIL("livesdk_guest_sys_permission_click", hashMap);
    }

    public static final void LJIJ(long j, boolean z, boolean z2, String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        LIZIZ(hashMap);
        hashMap.put("request_page", str);
        hashMap.put("anchor_relationship", String.valueOf(j));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_guest", str2);
        if (z2) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        hashMap.put("room_orientation", str3);
        LJIL("livesdk_guest_connection_icon_click", hashMap);
    }

    public static void LJIJJLI(int i, int i2, String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_user_apply", str2);
        hashMap.put("apply_guest_cnt", String.valueOf(i));
        hashMap.put("connected_guest_cnt", String.valueOf(i2));
        hashMap.put("request_page", "connection_button");
        hashMap.put("live_type", str);
        LJIL("livesdk_guest_apply_panel_show", hashMap);
    }

    public final void LJIIIIZZ(long j, String str, String str2, String linkId) {
        String str3 = str2;
        o.LJIIIZ(linkId, "linkId");
        if (str3 == null) {
            str3 = "";
        } else if (o.LJ(str3, "apply")) {
            str3 = "guest_apply_anchor";
        } else if (o.LJ(str3, "invite")) {
            str3 = "anchor_invite_guest";
        }
        if (TextUtils.equals("guest", "guest")) {
            HashMap hashMap = new HashMap();
            LIZ(hashMap);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            hashMap.put("initiator", "guest");
            hashMap.put("request_page", str);
            AnonymousClass391.LJFF(hashMap, "guest_invite_type", str3, j, "guest_id");
            hashMap.put("link_id", linkId);
            LIZLLL(this, hashMap);
            LJIL("livesdk_guest_connection_click_disconnect", hashMap);
            return;
        }
        if (!TextUtils.equals("guest", "anchor")) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        LIZ(hashMap2);
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room2 != null) {
            String idStr2 = room2.getIdStr();
            o.LJIIIIZZ(idStr2, "room.idStr");
            hashMap2.put("room_id", idStr2);
            hashMap2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap2, "guest_id");
        }
        hashMap2.put("initiator", "anchor");
        hashMap2.put("request_page", str);
        AnonymousClass391.LJFF(hashMap2, "guest_invite_type", str3, j, "guest_id");
        hashMap2.put("link_id", linkId);
        LIZLLL(this, hashMap2);
        LJIL("livesdk_anchor_guest_connection_click_disconnect", hashMap2);
    }

    public final void LJIIIZ(int i, String str, String actionType, String str2) {
        o.LJIIIZ(actionType, "actionType");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        hashMap.put("guest_invite_type", str);
        hashMap.put("camera_status", "abnormal");
        if (i != 1) {
            if (i == 2) {
                hashMap.put("mic_status", "off");
            }
        } else {
            hashMap.put("mic_status", "on");
        }
        hashMap.put("switch_type", "mico");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("windows_type", str2);
        hashMap.put("action_type", actionType);
        LIZLLL(this, hashMap);
        LJIL("livesdk_guest_connection_status_switch", hashMap);
    }

    public final void LJIIJ(int i, String str, String str2, boolean z) {
        String str3;
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (str == null) {
            str = "";
        } else if (o.LJ(str, "apply")) {
            str = "guest_apply_anchor";
        } else if (o.LJ(str, "invite")) {
            str = "anchor_invite_guest";
        }
        hashMap.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hashMap.put("guest_connection_type", "voice");
                }
            } else {
                hashMap.put("guest_connection_type", "video");
            }
        } else {
            hashMap.put("guest_connection_type", "video");
        }
        if (z) {
            str3 = "mute";
        } else {
            str3 = "unmute";
        }
        hashMap.put("switch_to", str3);
        hashMap.put("setting_position", str2);
        LIZLLL(this, hashMap);
        LJIL("livesdk_guest_switch_mute_setting", hashMap);
    }

    public static void LJIILIIL(String guestInviteType, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC74991Tbv layoutName, int i2) {
        Long l;
        Long l2;
        String str4;
        Long l3;
        String str5;
        String str6;
        User owner;
        FollowInfo followInfo;
        LiveMode streamType;
        if ((i2 & 256) != 0) {
            layoutName = EnumC74991Tbv.NORMAL;
        }
        o.LJIIIZ(guestInviteType, "guestInviteType");
        o.LJIIIZ(layoutName, "layoutName");
        C74740TUy LIZLLL2 = C74740TUy.LIZLLL();
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l4 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        hashMap.put("channel_id", String.valueOf(l2));
        hashMap.put("connection_type", "audience");
        if (LIZLLL2.LJIIIZ) {
            str4 = String.valueOf(C31012CFc.LJFF(LIZLLL2.LJIIJ));
        } else {
            str4 = "1440";
        }
        hashMap.put("time", str4);
        if (room != null) {
            l3 = Long.valueOf(room.getOwnerUserId());
        } else {
            l3 = null;
        }
        hashMap.put("anchor_id", String.valueOf(l3));
        if (C74740TUy.LIZLLL().LJIIJJI == 1) {
            str5 = "video";
        } else {
            str5 = "voice";
        }
        hashMap.put("guest_connection_type", str5);
        C74740TUy.LIZLLL().getClass();
        hashMap.put("weight_decay_type", String.valueOf(0));
        if (room != null && (streamType = room.getStreamType()) != null) {
            str6 = C28509BGv.LIZ(streamType);
        } else {
            str6 = "live_studio";
        }
        hashMap.put("live_type", str6);
        hashMap.put("permission_type", TV2.LJFF());
        hashMap.put("camera_status", "off");
        hashMap.put("guest_invite_type", guestInviteType);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            l4 = Long.valueOf(followInfo.getFollowStatus());
        }
        hashMap.put("anchor_relationship", String.valueOf(l4));
        OSZ LJFF2 = LJFF();
        hashMap.put("layout_setting", LJFF2.getFirst());
        hashMap.put("window_setting", LJFF2.getSecond());
        hashMap.put("link_id", str);
        hashMap.put("anchor_invite_position", str2);
        hashMap.put("accept_invitation_platform", str3);
        hashMap.put("receive_invitation_platform", "room");
        hashMap.put("guest_cnt", String.valueOf(i));
        C77125UOr.LJI(hashMap);
        hashMap.put("enhance_level", CardStruct.IStatusCode.DEFAULT);
        C77125UOr.LJFF(hashMap);
        C77125UOr.LJ(hashMap);
        C77125UOr.LIZLLL(hashMap);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_success");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIIZ("live_function");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public final void LJIIZILJ(LiveEffect liveEffect, long j, boolean z, String closeWay, long j2, boolean z2, int i, String requestPage) {
        long j3;
        o.LJIIIZ(closeWay, "closeWay");
        o.LJIIIZ(requestPage, "requestPage");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (liveEffect != null) {
            j3 = liveEffect.effectId;
        } else {
            j3 = 0;
        }
        C64504PTg.LIZJ(j3, hashMap, "props_id", j, "enhance_level");
        hashMap.put("mic_status", String.valueOf(!z ? 1 : 0));
        hashMap.put("camera_status", String.valueOf(0));
        hashMap.put("camera_type", "off");
        AnonymousClass391.LJFF(hashMap, "close_way", closeWay, j2, "stay_duration");
        if (z2) {
            hashMap.put("enlarge_status", String.valueOf(i));
        }
        hashMap.put("request_page", requestPage);
        LIZLLL(this, hashMap);
        LJIL("livesdk_guest_connection_setting_panel_close", hashMap);
    }
}
