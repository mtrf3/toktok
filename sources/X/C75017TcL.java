package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeGuestSubscriberSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.TcL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75017TcL {
    public static String LIZ = null;
    public static String LIZIZ = "in_liveroom";

    public static String LIZJ(int i) {
        return i == 0 ? "multi_live_apply" : "multi_live_accept";
    }

    public static int LIZIZ(long j) {
        int i;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        InterfaceC75973Trl LLIIJI2;
        List<LinkUser> LJJIIZI2;
        C8E.LJ();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        LinkUser linkUser = null;
        if (R6 != null && (LLIIJI2 = R6.LLIIJI()) != null && (LJJIIZI2 = LLIIJI2.LJJIIZI()) != null) {
            Iterator<LinkUser> it = LJJIIZI2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinkUser next = it.next();
                Long userId = next.getUserId();
                if (userId != null && userId.longValue() == j) {
                    linkUser = next;
                    break;
                }
            }
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJI = R62.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            i = LJJIIZI.size();
        } else {
            i = 1;
        }
        if (linkUser == null) {
            i++;
        }
        if (i == 0 || i == 1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("linkedCnt invalid, value ");
            LIZ2.append(i);
            C0NB.LJ("optLinkedGuestCountWithUid", X1D.LIZIZ(LIZ2));
        }
        return i - 1;
    }

    public static void LJIIJ(DataChannel dataChannel) {
        HashMap LIZJ = C03660Ck.LIZJ("connection_type", "anchor");
        BZI LIZ2 = C28787BRn.LIZ("connection_click");
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIIZ("live");
        LIZ2.LJIIL("click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIL(EnumC74778TWk enumC74778TWk) {
        String str;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        }
        boolean booleanValue = InterfaceC30442Bx8.LLJJIJIIJIL.LIZJ().booleanValue();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_status");
        if (booleanValue) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ2.LJIJJ(str, "status");
        LIZ2.LJIJJ(C74824TYe.LJIIIZ(), "live_type");
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
    }

    public static void LJIILJJIL(String str) {
        C279017q.LJ("logInvitationType type:", str, "LinkInRoomLogHelper");
        LIZIZ = str;
    }

    public static void LJIJI(int i) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_appeal_popup_window_show");
        LIZ2.LJIJJ(LIZJ(i), "request_page");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIJJLI(int i) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_add_birth_popup_window_click");
        LIZ2.LJIJJ(LIZJ(i), "request_page");
        LIZ2.LJIJJ("cancel", "click_type");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJJ(int i) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_add_birth_popup_window_show");
        LIZ2.LJIJJ(LIZJ(i), "request_page");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJJII(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_name", "ttlive_multilive_multi_live_start");
            jSONObject.put("way", str);
            C0NB.LJIIIZ("MultiLiveStart", jSONObject.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(EnumC75614Tly inviteType, java.util.Map<String, String> map) {
        boolean z;
        String rankName;
        EnumC75614Tly enumC75614Tly;
        int i = 0;
        if (inviteType == EnumC75614Tly.WEEKLY_RANK_INVITE || inviteType == EnumC75614Tly.HOURLY_RANK_INVITE || inviteType == EnumC75614Tly.WEEKLY_RISING_INVITE || inviteType == EnumC75614Tly.WEEKLY_ROOKIE_INVITE || inviteType == EnumC75614Tly.DAILY_RANK_INVITE || inviteType == (enumC75614Tly = EnumC75614Tly.DAILY_RANK_HALL_OF_FAME_INVITE) || inviteType == EnumC75614Tly.RANK_LEAGUE_PRELIMINARY_INVITE || inviteType == EnumC75614Tly.RANK_LEAGUE_SEMIFINAL_INVITE || inviteType == EnumC75614Tly.RANK_LEAGUE_FINAL_INVITE || inviteType == enumC75614Tly || inviteType == EnumC75614Tly.DAILY_ROOKIE_RANK) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("is_ranking_opposite_anchor", "1");
            o.LJIIIZ(inviteType, "inviteType");
            int i2 = C75611Tlv.LIZ[inviteType.ordinal()];
            if (i2 != 13) {
                switch (i2) {
                    case 3:
                        rankName = CM9.WEEKLY_RANK.getRankName();
                        break;
                    case 4:
                        rankName = CM9.DAILY_RANK.getRankName();
                        break;
                    case 5:
                        rankName = CM9.DAILY_RANK_HALL_OF_FAME.getRankName();
                        break;
                    case 6:
                        rankName = CM9.HOURLY_RANK.getRankName();
                        break;
                    case 7:
                        rankName = RankTypeV2.LJIIIIZZ.rankName;
                        break;
                    case 8:
                        rankName = RankTypeV2.LJIIIZ.rankName;
                        break;
                    case 9:
                        rankName = RankTypeV2.LJIIJ.rankName;
                        break;
                    case 10:
                        rankName = RankTypeV2.LJIIJJI.rankName;
                        break;
                    default:
                        rankName = "";
                        break;
                }
            } else {
                rankName = CM9.WEEKLY_ROOKIE_RANK.getRankName();
            }
            hashMap.put("rank_type", rankName);
            return;
        }
        if (!TextUtils.isEmpty(B5G.LIZIZ().LJJIIZ.rankType)) {
            ((HashMap) map).put("rank_type", B5G.LIZIZ().LJJIIZ.rankType);
        } else {
            ((HashMap) map).put("rank_type", "not_in_rank");
        }
        if (B5G.LIZIZ().LJJIIZ.topIndex > 0) {
            i = 1;
        }
        ((HashMap) map).put("is_ranking_opposite_anchor", String.valueOf(i));
    }

    public static void LIZLLL(String str, PunishEventInfo punishEventInfo) {
        HashMap hashMap = new HashMap();
        if (punishEventInfo != null) {
            hashMap.put("record_id", punishEventInfo.punishId);
            hashMap.put("violation_anchor_id", String.valueOf(punishEventInfo.violationUid));
            hashMap.put("violation_type", punishEventInfo.punishType);
            hashMap.put("violation_reason", punishEventInfo.punishReason);
            hashMap.put("action_type", str);
        }
        LJJIFFI("livesdk_accept_connect_notice", hashMap);
    }

    public static void LJ(String str, boolean z) {
        String str2;
        HashMap LIZJ = C03660Ck.LIZJ("enter_from", str);
        if (!str.equals("connecton_icon")) {
            if (z) {
                str2 = "random_notice";
            } else {
                str2 = "normal_notice";
            }
            LIZJ.put("notice_type", str2);
        }
        LIZJ.put("connection_type", "anchor");
        if (z) {
            LIZJ.put("invitee_list", "random_match");
        }
        C74824TYe.LIZJ(C74824TYe.LIZ, LIZJ);
        LJJI("guest_connection_anchor", "show", LIZJ);
    }

    public static void LJIIJJI(int i, String str) {
        String str2;
        boolean z;
        HashMap hashMap = new HashMap();
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.FOLLOW_INVITE) {
            str2 = "mutual_follow";
        } else {
            str2 = "recommend";
        }
        hashMap.put("invitee_list", str2);
        if (C76265TwT.LIZ.LJ() != EnumC76178Tv4.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        C116484hg.LIZIZ(hashMap, "selection", str, i, "is_dont_suggest");
        LJJIFFI("cancel_connection_select", hashMap);
    }

    public static void LJIJ(int i, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_appeal_popup_window_click");
        LIZ2.LJIJJ(LIZJ(i), "request_page");
        LIZ2.LJIJJ(str, "click_type");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIL(C75018TcM c75018TcM, MultiGuestDataHolder multiGuestDataHolder) {
        int i;
        EnumC74778TWk enumC74778TWk;
        EnumC74778TWk enumC74778TWk2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_guest_user_profile");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(c75018TcM.LIZ), "user_id");
        if (multiGuestDataHolder.LJIILIIL == 0) {
            i = 0;
        } else {
            i = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "is_guest_connection");
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        } else {
            enumC74778TWk = multiGuestDataHolder.LJJIIZ;
        }
        LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
        C29556Biq.LIZ().getClass();
        if (C74983Tbn.LJIILIIL()) {
            enumC74778TWk2 = C59994Ngc.LIZJ();
        } else {
            enumC74778TWk2 = multiGuestDataHolder.LJJIIZ;
        }
        LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk2).getSecond(), "window_setting");
        LIZ2.LJIJJ(Integer.valueOf(multiGuestDataHolder.LJIILIIL), "guest_cnt");
        LIZ2.LJIJJ(Integer.valueOf(c75018TcM.LIZIZ ? 1 : 0), "link_limit");
        LIZ2.LJIJJ(Integer.valueOf(c75018TcM.LIZJ ? 1 : 0), "guest_follow_anchor");
        LIZ2.LJIJJ(Integer.valueOf(c75018TcM.LIZLLL ? 1 : 0), "anchor_follow_guest");
        LIZ2.LJIJJ(c75018TcM.LJ, "action_type");
        LIZ2.LJIJJ(c75018TcM.LJFF, "icon_status");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJJIFFI(String str, java.util.Map<String, String> map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIILIIL(int i, String str, String str2) {
        String str3;
        if (C19N.LIZLLL()) {
            C29556Biq.LIZ().getClass();
            C74983Tbn.LIZJ();
        }
        HashMap hashMap = new HashMap();
        C74824TYe.LIZJ(C74824TYe.LIZ, hashMap);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_receive_anchor_apply");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ("anchor_invite_guest", "guest_connection_type");
        LIZ2.LJIJJ(str2, "live_type");
        LIZ2.LJIJJ("room", "receive_invitation_platform");
        C78895Uxn.LIZIZ(LIZ2, "others", "anchor_invite_position", i, "connected_guest_cnt");
        LIZ2.LJIJJ(str, "invitation_type");
        LIZ2.LJIJJ(C74824TYe.LJII(false, null), "guest_permission");
        if (C74789TWv.LIZIZ()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str3, "is_multi_guest_moderator");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIILL(EnumC75614Tly enumC75614Tly, String str, boolean z) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("private")) {
            hashMap.put("show_type", "private");
        }
        if (enumC75614Tly != null) {
            hashMap.put("invitee_list", C75545Tkr.LIZIZ(enumC75614Tly));
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("invitee_id", str);
        }
        if (z) {
            hashMap.put("selection", "continue");
        } else {
            hashMap.put("selection", "cancel");
        }
        hashMap.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("is_system_rematching", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("connection_type", "anchor");
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("inviter_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ(enumC75614Tly, hashMap);
        LJJIFFI("livesdk_connection_live_watched_popup_click", hashMap);
    }

    public static void LJJI(String str, String str2, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        LIZ2.LIZJ(str2);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJII(Room room, long j, String str, boolean z) {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        LinkPlayerInfo LJJIJL;
        User user;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_refused_connection_show");
        LIZ2.LJIIZILJ();
        if (room != null) {
            LIZ2.LJIJJ(Long.valueOf(room.getId()), "room_id");
            if (room.getOwner() != null) {
                LIZ2.LJIJJ(Long.valueOf(room.getOwner().getId()), "anchor_id");
            }
        }
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        if (c75559Tl5.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null && (interfaceC31805Ce1 = (InterfaceC31805Ce1) c75559Tl5.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER")) != null && (LJJIJL = C76917UGr.LJJIJL(interfaceC31805Ce1.LIZ(), j)) != null && (user = LJJIJL.mUser) != null && user.getFollowInfo() != null) {
            LIZ2.LJIJJ(Long.valueOf(LJJIJL.mUser.getFollowInfo().getFollowStatus()), "anchor_relationship");
        }
        LIZ2.LJIJJ(str, "refused_way");
        LIZ2.LJIJJ(Integer.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())), "connected_guest_cnt");
        LIZ2.LJIJJ(Long.valueOf(j), "guest_id");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_toast_show");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIJJ(int i, long j, EnumC74778TWk enumC74778TWk, boolean z) {
        int i2;
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_guest_connection_mutual_notice");
        LIZ2.LJIIZILJ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            LIZ2.LJIJJ(String.valueOf(room.getId()), "room_id");
            LIZ2.LJIJJ(String.valueOf(room.getOwnerUserId()), "anchor_id");
        }
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        LIZ2.LJIJJ(String.valueOf(j), "guest_id");
        if (C74838TYs.LJ().LJJ != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i2), "is_guest_connection");
        LIZ2.LJIJJ(String.valueOf(C74838TYs.LJ().LJJ), "guest_cnt");
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        C0JT.LIZJ(LIZ2, str, "action_type", i, "anchor_relationship");
    }

    public static void LJIILLIIL(String str, String str2, String str3, String str4, String str5) {
        String str6;
        HashMap hashMap = new HashMap();
        String str7 = B5G.LIZIZ().LJJLIIIJ;
        if (str3.equals("anchor_icon")) {
            hashMap.put("show_anchor_type", str7);
        }
        if (B5G.LIZIZ().LJJLIIIJILLIZJL) {
            hashMap.put("is_sound_effect", "1");
        } else {
            hashMap.put("is_sound_effect", CardStruct.IStatusCode.DEFAULT);
        }
        if (B5G.LIZIZ().LIZJ) {
            str6 = "during_connection";
        } else {
            str6 = "single_live";
        }
        hashMap.put("live_icon_show_time", str6);
        if (B5G.LIZIZ().LIZJ) {
            IMultiHostService LIZLLL = C8E.LIZLLL();
            int size = LIZLLL.LJIILJJIL().size();
            int size2 = LIZLLL.LJIL().size();
            hashMap.put("current_connection_cnts", String.valueOf(size));
            hashMap.put("current_position_left", String.valueOf(4 - size2));
        }
        hashMap.put("anchor_id", str);
        hashMap.put("room_id", str2);
        hashMap.put("show_type", str3);
        hashMap.put("current_live_mutual_friends_cnts", str4);
        if (!str5.isEmpty()) {
            hashMap.put("to_anchor_id", str5);
        }
        String str8 = B5G.LIZIZ().LJJLI;
        if (str8 == null) {
            str8 = "";
        }
        hashMap.put("log_id", str8);
        LJJI("livesdk_anchor_live_notification_popup_show", "show", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(int r8, java.lang.String r9, long r10, java.lang.String r12, long r13, int r15, X.EnumC74778TWk r16, java.lang.String r17) {
        /*
            r2 = r16
            boolean r0 = X.C19N.LIZLLL()
            if (r0 == 0) goto Ld
            X.TWk r2 = X.C59994Ngc.LIZJ()
        Ld:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0 = 1
            r1 = r8
            if (r1 != r0) goto Lf7
            java.lang.String r4 = "video"
        L18:
            java.lang.String r3 = "guest_connection_type"
            java.lang.String r1 = "weight_decay_type"
            r0 = -1
            X.C116484hg.LIZIZ(r6, r3, r4, r0, r1)
            java.lang.String r7 = "anchor_relationship"
            java.lang.String r8 = "click_type"
            r4 = r13
            r9 = r9
            X.C43881HKb.LIZJ(r4, r6, r7, r8, r9)
            java.lang.String r7 = "reservation_id"
            java.lang.String r8 = "click_time"
            r9 = r12
            r4 = r10
            r6 = r6
            X.C43881HKb.LIZJ(r4, r6, r7, r8, r9)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L4a
            int r0 = r0.liveRoomMode
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "live_room_mode"
            r6.put(r0, r1)
        L4a:
            com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler r5 = X.C74752TVk.LIZ()
            X.TXi r4 = X.C74800TXg.LIZIZ()
            if (r4 == 0) goto Lf3
            java.lang.String r3 = r4.LIZ()
        L58:
            java.lang.String r1 = "request_page"
            if (r5 == 0) goto Ld8
            java.lang.String r0 = r5.LIZIZ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld8
            java.lang.String r0 = r5.LIZIZ()
            r6.put(r1, r0)
        L6d:
            if (r4 == 0) goto Ld5
        L6f:
            java.lang.String r3 = r4.LIZJ()
        L73:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.TRK.LIZ()
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.LJIIIIZZ()
            java.lang.String r0 = "guest_permission"
            r6.put(r0, r1)
        L82:
            java.lang.String r1 = "0"
            java.lang.String r0 = "apply_connection_type"
            r6.put(r0, r1)
            java.lang.String r1 = "request_platform"
            java.lang.String r0 = "connected_guest_cnt"
            r4 = r15
            X.C116484hg.LIZIZ(r6, r1, r3, r4, r0)
            X.OSZ r0 = X.C74824TYe.LJI(r2)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "layout_setting"
            r6.put(r0, r1)
            X.OSZ r0 = X.C74824TYe.LJI(r2)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = "window_setting"
            r6.put(r0, r1)
            boolean r0 = X.TUZ.LIZIZ()
            if (r0 == 0) goto Lba
            r1 = r17
            if (r1 == 0) goto Lba
            java.lang.String r0 = "filter_request_setting"
            r6.put(r0, r1)
        Lba:
            X.C74824TYe.LIZIZ(r6, r2)
            X.C77123UOp.LJIILJJIL(r6)
            java.lang.String r0 = "livesdk_guest_connection_apply"
            X.BZI r1 = X.C28787BRn.LIZ(r0)
            r1.LJIIZILJ()
            java.lang.String r0 = "live_take_detail"
            r1.LJIIJJI(r0)
            r1.LJJIFFI(r6)
            r1.LJJIIJZLJL()
            return
        Ld5:
            java.lang.String r3 = "room"
            goto L73
        Ld8:
            if (r4 == 0) goto Le4
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Le4
            r6.put(r1, r3)
            goto L6f
        Le4:
            java.lang.String r0 = X.C75017TcL.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6d
            java.lang.String r0 = X.C75017TcL.LIZ
            r6.put(r1, r0)
            goto L6d
        Lf3:
            java.lang.String r3 = ""
            goto L58
        Lf7:
            java.lang.String r4 = "voice"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75017TcL.LJIIIIZZ(int, java.lang.String, long, java.lang.String, long, int, X.TWk, java.lang.String):void");
    }

    public static void LJIIZILJ(long j, EnumC74778TWk enumC74778TWk, String str, String str2, String str3, int i, String str4, int i2) {
        long j2;
        String str5 = str4;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        }
        String str6 = (String) C58582Myw.LIZ().get(Long.valueOf(j));
        Object obj = ((LinkedHashMap) C75147TeR.LJLJI).get(Long.valueOf(j));
        if (obj == null) {
            obj = "room";
        }
        ListByTypeResponse.ReservedUser LIZ2 = C74856TZk.LIZ(j);
        if (LIZ2 != null) {
            j2 = LIZ2.reserveId;
            str5 = "guest_apply_anchor";
        } else {
            j2 = 0;
        }
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_anchor_guest_connection_success_onstage", str6, "enter_from");
        C06530Nl.LIZLLL(LIZIZ2, C74856TZk.LIZIZ, "click_time", j2, "reservation_id");
        LIZIZ2.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_reservation_sender");
        LIZIZ2.LJIJJ(obj, "share_platform");
        LIZIZ2.LJIJJ(C74824TYe.LJIIIZ(), "live_type");
        LIZIZ2.LJIJJ(str5, "guest_invite_type");
        LIZIZ2.LJIJJ(C74776TWi.LJ(), "permission_type");
        C06530Nl.LIZLLL(LIZIZ2, str, "link_id", j, "guest_id");
        C78895Uxn.LIZIZ(LIZIZ2, str2, "channel_id", i, "anchor_relationship");
        LIZIZ2.LJIJJ(Integer.valueOf(C74856TZk.LIZJ), "current_accept_appointment_cnts");
        LIZIZ2.LJIJJ(String.valueOf(LIZIZ(j)), "guest_cnt");
        LIZIZ2.LJIJJ(C74824TYe.LJIIJJI(i2), "request_display_setting");
        if (C75457TjR.LJFF().get(Long.valueOf(j)) != null) {
            LIZIZ2.LJIJJ(C75457TjR.LJFF().get(Long.valueOf(j)), "gift_num");
        }
        if (C75457TjR.LJI().get(Long.valueOf(j)) != null) {
            LIZIZ2.LJIJJ(C75457TjR.LJI().get(Long.valueOf(j)), "gift_rank");
        }
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        ((java.util.Map) C58578Mys.LIZIZ.getValue()).remove(Long.valueOf(j));
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            LIZIZ2.LJIJJ(str3, "is_guest_subscriber");
        }
        if (TUZ.LIZ()) {
            Integer num = TYJ.LIZ.get(Long.valueOf(j));
            if (num != null) {
                LIZIZ2.LJIJJ(num, "is_prioritized_request");
            } else {
                LIZIZ2.LJIJJ(0, "is_prioritized_request");
            }
        }
        BZJ bzj = LIZIZ2.LIZ;
        if (bzj != null) {
            bzj.LJIIJJI();
        }
        LIZIZ2.LJJIIJZLJL();
    }

    public static void LJFF(long j, EnumC74778TWk enumC74778TWk, String str, String str2, String str3, int i, int i2, boolean z, int i3, String str4) {
        int i4;
        String str5;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        }
        String LIZJ = C75147TeR.LIZJ(j);
        if (!LIZJ.isEmpty()) {
            str4 = LIZJ;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_invite_guest_connection");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(j), "guest_id");
        LIZ2.LJIJJ("room", "share_platform");
        LIZ2.LJIJJ(str4, "enter_from");
        LIZ2.LJIJJ(C74824TYe.LJIIIZ(), "live_type");
        LIZ2.LJIJJ(str, "trigger");
        LIZ2.LJIJJ(String.valueOf(C74838TYs.LJ().LJJ), "guest_cnt");
        LIZ2.LJIJJ(str2, "tag_list");
        LIZ2.LJIJJ(str3, "show_tag_list");
        LIZ2.LJIJJ(String.valueOf(i), "tag_show_cnt");
        LIZ2.LJIJJ(C58578Mys.LIZ(j), "multi_request_id");
        LIZ2.LJIJJ(Integer.valueOf(i2), "anchor_relationship");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_inroom_guest");
        Integer num = (Integer) ((LinkedHashMap) C75147TeR.LJLJJI).get(Long.valueOf(j));
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i4), "online_status");
        LIZ2.LJIJJ(Integer.valueOf(i3), "rank");
        if (C74789TWv.LIZIZ()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str5, "is_multi_guest_moderator");
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(long j, EnumC74778TWk enumC74778TWk, long j2, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        long j3;
        String str6;
        int i4;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        }
        String LIZJ = C75147TeR.LIZJ(j);
        String str7 = (String) ((LinkedHashMap) C75147TeR.LJLJI).get(Long.valueOf(j));
        if (str7 == null) {
            str7 = "room";
        }
        ListByTypeResponse.ReservedUser LIZ2 = C74856TZk.LIZ(j);
        if (LIZ2 != null) {
            j3 = LIZ2.reserveId;
            str6 = "guest_apply_anchor";
        } else {
            j3 = 0;
            str6 = "anchor_invite_guest";
        }
        C58582Myw.LIZ().put(Long.valueOf(j), LIZJ);
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_anchor_guest_connection_success", LIZJ, "enter_from");
        LIZIZ2.LJIJJ(C74856TZk.LIZIZ, "click_time");
        C06530Nl.LIZLLL(LIZIZ2, CardStruct.IStatusCode.DEFAULT, "is_reservation_sender", j3, "reservation_id");
        KNV.LJ(C74856TZk.LIZJ, LIZIZ2, "current_accept_appointment_cnts", str7, "share_platform");
        LIZIZ2.LJIJJ(C74824TYe.LJIIIZ(), "live_type");
        LIZIZ2.LJIJJ(String.valueOf(j2), "reply_id");
        LIZIZ2.LJIJJ(str6, "guest_invite_type");
        LIZIZ2.LJIJJ(C74776TWi.LJ(), "permission_type");
        C06530Nl.LIZLLL(LIZIZ2, str, "link_id", j, "guest_id");
        LIZIZ2.LJIJJ(C58578Mys.LIZ(j), "multi_request_id");
        LIZIZ2.LJIJJ(str2, "channel_id");
        LIZIZ2.LJIJJ(Integer.valueOf(i2), "anchor_relationship");
        LIZIZ2.LJIJJ(String.valueOf(LIZIZ(j)), "guest_cnt");
        LIZIZ2.LJIJJ(str4, "tag_list");
        LIZIZ2.LJIJJ(str5, "show_tag_list");
        LIZIZ2.LJIJJ(Integer.valueOf(i), "tag_show_cnt");
        LIZIZ2.LJIJJ(C74824TYe.LJIIJJI(i3), "request_display_setting");
        Integer num = (Integer) ((LinkedHashMap) C75147TeR.LJLJJI).get(Long.valueOf(j));
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 1;
        }
        LIZIZ2.LJIJJ(Integer.valueOf(i4), "online_status");
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        ((java.util.Map) C58578Mys.LIZIZ.getValue()).remove(Long.valueOf(j));
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            LIZIZ2.LJIJJ(str3, "is_guest_subscriber");
        }
        if (TUZ.LIZ()) {
            LIZIZ2.LJIJJ(0, "is_prioritized_request");
        }
        BZJ bzj = LIZIZ2.LIZ;
        if (bzj != null) {
            bzj.LJIIJJI();
        }
        LIZIZ2.LJJIIJZLJL();
        if (!B5G.LIZIZ().LJJJJZ) {
            LJJII("Anchor invite guest");
            B5G.LIZIZ().LJJJJZ = true;
        }
        C75040Tci.LIZ(String.valueOf(j), false);
        C74896TaO.LJ().remove(Long.valueOf(j));
    }

    public static void LJI(long j, EnumC74778TWk enumC74778TWk, boolean z, String str, String str2, String str3, String str4, String str5, int i, int i2, long j2, int i3, int i4, String str6) {
        String str7 = str6;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        }
        if (str7 == null) {
            if (!z) {
                str7 = "guest_apply_anchor";
            } else {
                str7 = "animation_guest_apply_anchor";
            }
        }
        C58582Myw.LIZ().put(Long.valueOf(j), str7);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_guest_connection_success");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(C74824TYe.LJIIIZ(), "live_type");
        LIZ2.LJIJJ(str2, "channel_id");
        LIZ2.LJIJJ("guest_apply_anchor", "guest_invite_type");
        LIZ2.LJIJJ(str7, "enter_from");
        LIZ2.LJIJJ(C74776TWi.LJ(), "permission_type");
        C06530Nl.LIZLLL(LIZ2, str, "link_id", j, "guest_id");
        LIZ2.LJIJJ(C58578Mys.LIZ(j), "multi_request_id");
        LIZ2.LJIJJ(str2, "channel_id");
        LIZ2.LJIJJ(Integer.valueOf(i2), "anchor_relationship");
        LIZ2.LJIJJ(String.valueOf(LIZIZ(j)), "guest_cnt");
        LIZ2.LJIJJ(str4, "tag_list");
        LIZ2.LJIJJ(str5, "show_tag_list");
        LIZ2.LJIJJ(Integer.valueOf(i), "tag_show_cnt");
        LIZ2.LJIJJ(1, "online_status");
        DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (j2 != -1) {
            LIZ2.LJIJJ(Long.valueOf(j2), "gift_num");
        }
        if (i3 != -1) {
            LIZ2.LJIJJ(Integer.valueOf(i3), "gift_rank");
        }
        if (i4 != -1) {
            LIZ2.LJIJJ(C74824TYe.LJIIJJI(i4), "request_display_setting");
        } else {
            LIZ2.LJIJJ("by_default", "request_display_setting");
        }
        if (C74824TYe.LJIIIIZZ() == LiveMode.LIVE_VOICE) {
            LIZ2.LJIJJ(C74824TYe.LJ(), "layout_id");
        } else {
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getFirst(), "layout_setting");
            LIZ2.LJIJJ(C74824TYe.LJI(enumC74778TWk).getSecond(), "window_setting");
        }
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            LIZ2.LJIJJ(str3, "is_guest_subscriber");
        }
        if (TUZ.LIZ()) {
            ConcurrentHashMap<Long, Integer> concurrentHashMap = TYJ.LIZ;
            if (concurrentHashMap.get(Long.valueOf(j)) != null) {
                LIZ2.LJIJJ(concurrentHashMap.get(Long.valueOf(j)), "is_prioritized_request");
            }
        }
        BZJ bzj = LIZ2.LIZ;
        if (bzj != null) {
            bzj.LJIIJJI();
        }
        LIZ2.LJJIIJZLJL();
        if (!B5G.LIZIZ().LJJJJZ) {
            LJJII("Guest reply anchor");
            B5G.LIZIZ().LJJJJZ = true;
        }
        C75040Tci.LIZ(String.valueOf(j), true);
        C74896TaO.LJ().remove(Long.valueOf(j));
    }
}
