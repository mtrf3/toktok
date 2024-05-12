package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TjR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75457TjR {
    public static int LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;

    public static final String LJ(int i) {
        return i >= 1 ? "multi_guest" : "single_live";
    }

    static {
        new HashSet();
        LIZLLL = C221108m2.LIZIZ(C58584Myy.LJLIL);
        LJ = C221108m2.LIZIZ(C58583Myx.LJLIL);
    }

    public static HashMap LJFF() {
        return (HashMap) LIZLLL.getValue();
    }

    public static HashMap LJI() {
        return (HashMap) LJ.getValue();
    }

    public static void LIZ(java.util.Map map) {
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (l == null || l.longValue() != currentUserId) {
            return;
        }
        if (B5G.LIZIZ().LJIIL) {
            map.put("connection_inviter_id", String.valueOf(currentUserId));
            map.put("connection_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        } else {
            map.put("connection_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
            map.put("connection_invitee_id", String.valueOf(currentUserId));
        }
        if (C76265TwT.LIZ.LJIILIIL) {
            map.put("pk_inviter_id", String.valueOf(currentUserId));
            map.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        } else {
            map.put("pk_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
            map.put("pk_invitee_id", String.valueOf(currentUserId));
        }
    }

    public static void LIZJ(java.util.Map map) {
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
            if (LJIILJJIL.size() > 2) {
                HashMap hashMap = (HashMap) map;
                hashMap.put("is_multi", "1");
                hashMap.put("multi_type", "team_pk");
                hashMap.put("team_id", String.valueOf(C76265TwT.LIZ.LJJJJJ));
            } else {
                HashMap hashMap2 = (HashMap) map;
                hashMap2.put("is_multi", CardStruct.IStatusCode.DEFAULT);
                hashMap2.put("team_id", CardStruct.IStatusCode.DEFAULT);
            }
            ((HashMap) map).put("current_connection_cnts", String.valueOf(LJIILJJIL.size()));
            return;
        }
        HashMap hashMap3 = (HashMap) map;
        hashMap3.put("is_multi", CardStruct.IStatusCode.DEFAULT);
        hashMap3.put("current_connection_cnts", "2");
        hashMap3.put("team_id", CardStruct.IStatusCode.DEFAULT);
    }

    public static void LIZLLL(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            map.put("room_id", idStr);
            map.put("enter_method", BJM.LJIIIIZZ());
            map.put("enter_from_merge", BJM.LJFF());
            map.put("action_type", BJM.LIZLLL());
            EnumC74778TWk LJIIJ = C74824TYe.LJIIJ();
            map.put("layout_setting", C74824TYe.LJI(LJIIJ).getFirst());
            map.put("window_setting", C74824TYe.LJI(LJIIJ).getSecond());
            map.put("guest_cnt", String.valueOf(C74838TYs.LJ().LJJ));
            String str = room.getStreamType().logStreamingType;
            o.LJIIIIZZ(str, "room.streamType.logStreamingType");
            map.put("live_type", str);
            String str2 = C75642TmQ.LJIJJ;
            if (!TextUtils.isEmpty(str2)) {
                map.put("request_id", str2);
            }
        }
        C77123UOp.LJIILJJIL(map);
    }

    public static void LJIILJJIL(String str) {
        String str2;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap LIZ2 = C1R5.LIZ(str, "pkTaskType");
        LIZ2.put("invitee_list", C75545Tkr.LIZIZ(B5G.LIZIZ().LJIIJ));
        if (B5G.LIZIZ().LJIIL) {
            str2 = "inviter";
        } else {
            str2 = "invitee";
        }
        LIZ2.put("anchor_type", str2);
        String str3 = B5G.LIZIZ().LJJJJL;
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("request_from", str3);
        LIZ2.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        LIZ2.put("pk_task_type", str);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, LIZ2, "user_id");
        }
        LIZLLL(LIZ2);
        LIZ(LIZ2);
        LIZIZ(LIZ2, false);
        LIZJ(LIZ2);
        LJJI("livesdk_pk_task_icon_click", LIZ2);
    }

    public static void LJIILL(String str) {
        String str2;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap LIZ2 = C1R5.LIZ(str, "pkTaskType");
        LIZ2.put("invitee_list", C75545Tkr.LIZIZ(B5G.LIZIZ().LJIIJ));
        if (B5G.LIZIZ().LJIIL) {
            str2 = "inviter";
        } else {
            str2 = "invitee";
        }
        LIZ2.put("anchor_type", str2);
        String str3 = B5G.LIZIZ().LJJJJL;
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("request_from", str3);
        LIZ2.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        LIZ2.put("pk_task_type", str);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, LIZ2, "user_id");
        }
        LIZLLL(LIZ2);
        LIZ(LIZ2);
        LIZIZ(LIZ2, false);
        LIZJ(LIZ2);
        LJJI("livesdk_pk_task_icon_show", LIZ2);
    }

    public static final void LJIL(int i) {
        String str;
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        hashMap.put("action_type", "show");
        hashMap.put("invite_entrance", "golive_window");
        if (C29232Bdc.LJIIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_subscriber_only_live", str);
        C116484hg.LIZIZ(hashMap, "request_page", "button_icon", i, "red_dot_cnt");
        C74824TYe.LIZJ(C74824TYe.LIZ, hashMap);
        LJJI("livesdk_anchor_guest_connection_entrance_click", hashMap);
    }

    public static void LIZIZ(java.util.Map map, boolean z) {
        C76280Twi c76280Twi;
        String valueOf;
        Integer num;
        map.put("connection_type", "manual_pk");
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        BattleSetting battleSetting = c76280Twi.LIZLLL;
        if (battleSetting != null && battleSetting.duration > 0) {
            if (battleSetting != null) {
                num = Integer.valueOf(battleSetting.duration);
            } else {
                num = null;
            }
            valueOf = String.valueOf(num);
        } else {
            valueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
        }
        map.put("pk_time", valueOf);
        map.put("is_oncemore", String.valueOf(c76280Twi.LJ ? 1 : 0));
        map.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        map.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
    }

    public static final void LJIIIZ(String str, EnumC74778TWk enumC74778TWk) {
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
        hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        hashMap.put("end_reason", str);
        LJJI("livesdk_anchor_guest_connection_close", hashMap);
    }

    public static void LJIILIIL(EnumC76319TxL requestFrom, boolean z) {
        Object obj;
        o.LJIIIZ(requestFrom, "requestFrom");
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        LIZ(hashMap);
        hashMap.put("request_from", requestFrom.getValue());
        C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, false);
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_effective", obj);
        hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        hashMap.put("pk_inviter_id", String.valueOf(currentUserId));
        hashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            if (!room.getRoomAuthStatus().isEnableGift()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_from_gift_permission", str);
        }
        hashMap.put("click_reason", "pk_invite");
        LJJI("livesdk_pk_click", hashMap);
    }

    public static final void LJIJI(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(j));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("action_type", BJM.LIZLLL());
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("connected_guest_cnt", String.valueOf(i));
            hashMap.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            LJJI("livesdk_guest_refused_connection_show", hashMap);
        }
    }

    public static void LJJ(BattleComboInfo battleComboInfo, boolean z) {
        String str;
        String str2;
        if (battleComboInfo == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        hashMap.put("connection_type", "manual_pk");
        int i = C75616Tm0.LIZ[B5G.LIZIZ().LJIIJ.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = LiveGiftNewGifterBadgeSetting.DEFAULT;
                } else {
                    str = "random_match";
                }
            } else {
                str = "recommend";
            }
        } else {
            str = "manual_follow";
        }
        hashMap.put("invitee_list", str);
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        hashMap.put("user_type", str2);
        hashMap.put("pk_id", String.valueOf(C76265TwT.LIZ.LIZIZ()));
        hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("win_status", String.valueOf(battleComboInfo.comboCount));
        if (room != null) {
            if (battleComboInfo.userId != room.getOwnerUserId()) {
                i2 = 2;
            }
            hashMap.put("anchor_type", String.valueOf(i2));
        }
        LJJI("connection_win_click", hashMap);
    }

    public static void LJJI(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        if (o.LJ("livesdk_connection_watch_duration", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(str)) {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
            return;
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIL(long j, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        LIZ(hashMap);
        LIZIZ(hashMap, z);
        hashMap.put("anchor_type", "invitee");
        hashMap.put("inviter_id", String.valueOf(B5G.LIZIZ().LJI));
        if (z2) {
            str = "accept";
        } else {
            str = "reject";
        }
        hashMap.put("selection", str);
        int i = 0;
        C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, false);
        long currentTimeMillis = System.currentTimeMillis();
        LIZIZ = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        if (!TextUtils.isEmpty(B5G.LIZIZ().LJJIIZ.rankType)) {
            String str4 = B5G.LIZIZ().LJJIIZ.rankType;
            o.LJIIIIZZ(str4, "inst().topHostInfo.rankType");
            hashMap.put("rank_type", str4);
        }
        if (B5G.LIZIZ().LJJIIZ.topIndex > 0) {
            i = 1;
        }
        String valueOf = String.valueOf(i);
        o.LJIIIIZZ(valueOf, "LinkCrossRoomDataHolder.…ankingOppositeAnchorValue");
        hashMap.put("is_ranking_opposite_anchor", valueOf);
        C7MY.LJFF(LIZIZ, LIZJ, hashMap, "show_to_decide_dur");
        if (z) {
            if (C76265TwT.LJI()) {
                str3 = "draw";
            } else {
                str3 = "not_draw";
            }
            hashMap.put("oncemore_type", str3);
        }
        hashMap.put("pk_id", String.valueOf(j));
        hashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_quick_recommend", str2);
        C75545Tkr.LJFF(hashMap);
        if (DataChannelGlobal.LJLJJI.mv0(C29059Bap.class) == EnumC31158CKs.SHOW) {
            hashMap.put("event_page", "live_extended_comment_filed");
        }
        C75832TpU.LJI(hashMap, z);
        LJJI("livesdk_connection_invited", hashMap);
    }

    public static final void LJIIIIZZ(int i, long j, EnumC74778TWk enumC74778TWk, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        hashMap.put("result", str);
        hashMap.put("guest_id", String.valueOf(j));
        hashMap.put("guest_cnt", String.valueOf(i));
        hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
        hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        LJJI("livesdk_anchor_guest_connection_click_accept_result", hashMap);
    }

    public static final void LJIJJ(int i, String str, String str2, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        hashMap.put("action_type", "click");
        hashMap.put("invite_entrance", str);
        if (C29232Bdc.LJIIL()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_subscriber_only_live", str4);
        C116484hg.LIZIZ(hashMap, "request_page", str3, i, "red_dot_cnt");
        hashMap.put("click_time", str2);
        C74824TYe.LIZJ(C74824TYe.LIZ, hashMap);
        LJJI("livesdk_anchor_guest_connection_entrance_click", hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 2);
        }
    }

    public static final void LJIJJLI(long j, String str, String str2, boolean z) {
        String str3;
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap);
        hashMap.put("request_page", str);
        hashMap.put("anchor_relationship", String.valueOf(j));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_guest", str3);
        hashMap.put("click_time", str2);
        C74824TYe.LIZJ(C74824TYe.LIZ, hashMap);
        LJJI("livesdk_guest_connection_icon_click", hashMap);
    }

    public static final void LJIIJ(String str, long j, User user, Long l, Integer num, Integer num2, String str2) {
        String LIZIZ2;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (str2 != null) {
            hashMap.put("enter_from", str2);
        }
        if (room != null) {
            String idStr = room.getIdStr();
            String str3 = "";
            if (idStr == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("action_type", str);
            hashMap.put("anchor_relationship", String.valueOf(j));
            String str4 = room.getStreamType().logStreamingType;
            o.LJIIIIZZ(str4, "room.streamType.logStreamingType");
            hashMap.put("live_type", str4);
            if (C29137Bc5.LIZIZ(room)) {
                hashMap.put("layout_id", C74824TYe.LJ());
            }
            if (user != null && (LIZIZ2 = C278817o.LIZIZ(user)) != null) {
                str3 = LIZIZ2;
            }
            hashMap.put("guest_id", str3);
            if (l != null) {
                l.longValue();
                hashMap.put("gift_num", l.toString());
            }
            if (num != null) {
                num.intValue();
                hashMap.put("gift_rank", num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                hashMap.put("request_display_setting", C74824TYe.LJIIJJI(num2.intValue()));
            }
            C77123UOp.LJIILJJIL(hashMap);
            LJJI("livesdk_anchor_refuse_guest_connection", hashMap);
        }
    }

    public static /* synthetic */ void LJIJ(EnumC74778TWk enumC74778TWk, String str, long j, long j2, String str2, String str3, int i) {
        String str4 = str3;
        long j3 = j2;
        if ((i & 8) != 0) {
            j3 = 0;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        LJIIZILJ(enumC74778TWk, str, j, j3, str2, null, null, 0, 0, str4);
    }

    public static final void LJIILLIIL(String str, String guestInviteType, int i, EnumC74778TWk enumC74778TWk, boolean z, String str2, boolean z2, String str3) {
        String str4;
        String str5;
        o.LJIIIZ(guestInviteType, "guestInviteType");
        HashMap hashMap = new HashMap();
        hashMap.put("toast_type", str);
        hashMap.put("guest_invite_type", guestInviteType);
        hashMap.put("guest_cnt", String.valueOf(i));
        hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
        hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        if (z) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        hashMap.put("camera_status", str4);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("guest_permission", str2);
        if (z2) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_muted", str5);
        hashMap.put("link_id", str3);
        LJJI("livesdk_guest_connection_success_toast", hashMap);
    }

    public static final void LJII(long j, int i, EnumC74778TWk enumC74778TWk, int i2, long j2, Long l, Integer num, Integer num2, String str) {
        String str2;
        LiveMode streamType;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        HashMap hashMap = new HashMap();
        hashMap.put("guest_id", String.valueOf(j));
        hashMap.put("guest_cnt", String.valueOf(i));
        if (room == null || (streamType = room.getStreamType()) == null || (str2 = streamType.logStreamingType) == null) {
            str2 = "";
        }
        hashMap.put("live_type", str2);
        if (str != null) {
            hashMap.put("enter_from", str);
        }
        hashMap.put("rank", String.valueOf(i2 - LIZ));
        if (room != null && C29137Bc5.LIZIZ(room)) {
            hashMap.put("layout_id", C74824TYe.LJ());
        } else {
            hashMap.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
            hashMap.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
            if (l != null) {
                l.longValue();
                hashMap.put("gift_num", l.toString());
            }
            if (num != null) {
                num.intValue();
                hashMap.put("gift_rank", num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                hashMap.put("request_display_setting", C74824TYe.LJIIJJI(num2.intValue()));
            }
        }
        hashMap.put("anchor_relationship", String.valueOf(j2));
        C77123UOp.LJIILJJIL(hashMap);
        LJJI("livesdk_anchor_guest_connection_click_accept", hashMap);
    }

    public static final void LJIIZILJ(EnumC74778TWk enumC74778TWk, String str, long j, long j2, String str2, Integer num, Integer num2, int i, int i2, String str3) {
        String num3;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            C74824TYe.LIZIZ(hashMap, enumC74778TWk);
            hashMap.put("withdraw_action_type", str);
            StringBuilder LIZ2 = X1D.LIZ();
            String str4 = "";
            LIZ2.append("");
            LIZ2.append(j);
            AnonymousClass391.LJFF(hashMap, "duration", X1D.LIZIZ(LIZ2), j2, "reservation_id");
            hashMap.put("withdraw_type", str2);
            String str5 = C75017TcL.LIZ;
            if (str5 != null && str5.length() != 0) {
                String str6 = C75017TcL.LIZ;
                if (str6 != null) {
                    str4 = str6;
                }
                hashMap.put("request_page", str4);
            }
            if (num != null) {
                num.intValue();
                hashMap.put("applying_guest_cnt", num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                if (num2.intValue() == -1) {
                    num3 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    num3 = num2.toString();
                }
                hashMap.put("connected_guest_cnt", num3);
            }
            hashMap.put("request_display_setting", C74824TYe.LJIIJJI(i));
            hashMap.put("own_rank", String.valueOf(i2));
            if (TUZ.LIZIZ() && str3 != null) {
                hashMap.put("filter_request_status", str3);
            }
            C77123UOp.LJIILJJIL(hashMap);
            LJJI("livesdk_guest_connection_apply_withdraw", hashMap);
        }
    }
}
