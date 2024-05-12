package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostHasAutoMatchSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29292Bea {
    public final Room LIZ;
    public final long LIZIZ;
    public java.util.Map<String, String> LIZJ = new HashMap();
    public java.util.Map<String, String> LIZLLL = new HashMap();

    public static String LIZ(User user) {
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService == null) {
            return "audience";
        }
        String Ng = iInteractService.Ng(user);
        Ng.getClass();
        String str = "anchor";
        if (!Ng.equals("anchor")) {
            str = "guest";
            if (!Ng.equals("guest")) {
                return "audience";
            }
        }
        return str;
    }

    public static boolean LIZIZ(List<BadgeStruct> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (((BadgeStruct) ListProtector.get(list, i)).badgeScene == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZJ(List<BadgeStruct> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (((BadgeStruct) ListProtector.get(list, i)).badgeScene == 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public C29292Bea(Room room, long j) {
        this.LIZ = room;
        this.LIZIZ = j;
    }

    public final void LIZLLL(User user, boolean z, long j, String str, boolean z2, int i, boolean z3, long j2, boolean z4, String str2, boolean z5, boolean z6, Long l) {
        String str3;
        Object obj;
        Object obj2;
        String str4;
        Object obj3;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        String str5 = str2;
        BU8 bu8 = new BU8("", this.LIZIZ);
        if (!TextUtils.isEmpty(str)) {
            bu8.LIZ = str;
        }
        if (z2) {
            if (z3) {
                bu8.LIZ = "live_anchor_c_anchor";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("live_anchor_c_");
                LIZ.append(LIZ(user));
                bu8.LIZ = X1D.LIZIZ(LIZ);
            }
            if (TextUtils.isEmpty(bu8.LIZ)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("live_anchor_c_");
                LIZ2.append(LIZ(user));
                bu8.LIZ = X1D.LIZIZ(LIZ2);
            }
        } else if (z5 || z6) {
            if (i == 0) {
                bu8.LIZ = "program_live_audience_c_official_id";
            } else {
                bu8.LIZ = "program_live_audience_c_anchor";
            }
        } else if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            if (i == 0) {
                bu8.LIZ = "program_live_audience_c_official_id";
            } else {
                bu8.LIZ = "program_live_audience_c_audience";
            }
        } else if (i != 1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("live_");
            LIZ3.append(LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
            LIZ3.append("_c_");
            LIZ3.append(LIZ(user));
            bu8.LIZ = X1D.LIZIZ(LIZ3);
        } else {
            if (z3) {
                bu8.LIZ = "live_audience_c_anchor";
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("live_");
                LIZ4.append(LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
                LIZ4.append("_c_");
                LIZ4.append(LIZ(user));
                bu8.LIZ = X1D.LIZIZ(LIZ4);
            }
            if (TextUtils.isEmpty(bu8.LIZ)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("live_");
                LIZ5.append(LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
                LIZ5.append("_c_");
                LIZ5.append(LIZ(user));
                bu8.LIZ = X1D.LIZIZ(LIZ5);
            }
        }
        HashMap hashMap = new HashMap();
        if (z3) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).WA(hashMap);
        }
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null && (room = this.LIZ) != null && iMicRoomService.jT(room) && (officialChannelInfo = this.LIZ.officialChannelInfo) != null) {
            if (officialChannelInfo.channelUser.getId() == j) {
                if (iMicRoomService.Nl()) {
                    bu8.LIZ = "carousel_audience_c_official_id";
                } else {
                    bu8.LIZ = "loyal_audience_c_official_id";
                }
            } else if (j == this.LIZ.getOwner().getId()) {
                if (iMicRoomService.Nl()) {
                    bu8.LIZ = "carousel_audience_c_anchor";
                } else {
                    bu8.LIZ = "loyal_audience_c_anchor";
                }
            }
            bu8.LIZIZ = this.LIZ.officialChannelInfo.channelUser.getId();
        }
        if (z) {
            hashMap.put("growth_deepevent", String.valueOf(1));
            long ownerUserId = this.LIZ.getOwnerUserId();
            long j3 = B5G.LIZIZ().LJI;
            if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                if (j == this.LIZ.getOwnerUserId()) {
                    hashMap.put("anchor_type", "current");
                }
                if (z3) {
                    hashMap.put("anchor_type", "opposite");
                }
                hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
                List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
                if (QD.size() > 2) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_multi", obj3);
                if (MultiCohostHasAutoMatchSetting.INSTANCE.getValue() || QD.size() <= 2) {
                    ((IInteractService) CN1.LIZ(IInteractService.class)).WA(hashMap);
                }
                if (B5G.LIZIZ().LJIIL) {
                    C64504PTg.LIZJ(ownerUserId, hashMap, "connection_inviter_id", j3, "connection_invitee_id");
                } else {
                    C64504PTg.LIZJ(ownerUserId, hashMap, "connection_invitee_id", j3, "connection_inviter_id");
                }
            }
            if (((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
                hashMap.put("pk_id", String.valueOf(B5G.LIZIZ().LJJJJJL));
                if (((IInteractService) CN1.LIZ(IInteractService.class)).GQ()) {
                    C64504PTg.LIZJ(ownerUserId, hashMap, "pk_inviter_id", j3, "pk_invitee_id");
                } else {
                    C64504PTg.LIZJ(ownerUserId, hashMap, "pk_invitee_id", j3, "pk_inviter_id");
                }
            }
        }
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        hashMap.put("follow_status", String.valueOf(j2));
        java.util.Map<String, String> map = this.LIZJ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        java.util.Map<String, String> map2 = this.LIZLLL;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                hashMap.put(entry2.getKey().toString(), entry2.getValue().toString());
            }
        }
        String LJIIIZ = BJM.LJIIIZ();
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (z4) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        hashMap.put("room_orientation", str3);
        hashMap.put("connection_type", ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType());
        if ("manual_pk".equals(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType())) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
            hashMap.putAll(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
        }
        boolean equals = "portal".equals(BJM.LJIIIIZZ());
        if (equals) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_portal_user", obj);
        if (equals) {
            hashMap.put("portal_id", String.valueOf(BJM.LJIIL()));
        }
        if (C74838TYs.LJ().LJJ > 0) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_guest_connection", obj2);
        if (TextUtils.isEmpty(str5)) {
            if (z2) {
                str5 = "live_take_detail";
            } else {
                str5 = "live_detail";
            }
        }
        if (B5G.LIZIZ().LIZJ) {
            if (!z2) {
                Long l2 = -1L;
                if (i == 1) {
                    l2 = (Long) ((HashMap) B5G.LIZIZ().LJJZZIII).get(Long.valueOf(this.LIZ.getOwnerUserId()));
                } else if (i == 0 || i == 2) {
                    l2 = (Long) ((HashMap) B5G.LIZIZ().LJJZZIII).get(Long.valueOf(user.getId()));
                }
                if (l2 != null) {
                    hashMap.put("initial_follow_status", l2.toString());
                }
            } else {
                hashMap.put("initial_follow_status", l.toString());
            }
        }
        CohostTopic P20 = ((IInteractService) CN1.LIZ(IInteractService.class)).P20();
        if (P20 != null) {
            hashMap.put("is_topic_connection", "1");
            hashMap.put("topic_id", String.valueOf(P20.id));
        } else {
            hashMap.put("is_topic_connection", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("topic_id", CardStruct.IStatusCode.DEFAULT);
        }
        hashMap.put("click_user_position", "profile_card");
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap.putAll(BJB.LIZ());
        if (z) {
            str4 = "follow";
        } else {
            str4 = "unfollow";
        }
        BZI LIZ6 = C28787BRn.LIZ(str4);
        LIZ6.LJJIFFI(hashMap);
        LIZ6.LJIILIIL(bu8);
        LIZ6.LJIIZILJ();
        LIZ6.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ6.LJIIIZ("live_interact");
        LIZ6.LJIIJJI(str5);
        LIZ6.LJJIIJZLJL();
    }
}
