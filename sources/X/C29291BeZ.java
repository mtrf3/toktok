package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostHasAutoMatchSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BeZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29291BeZ {
    public final Room LIZ;
    public final long LIZIZ;

    public C29291BeZ(long j, Room room) {
        this.LIZ = room;
        this.LIZIZ = j;
    }

    public final void LIZ(boolean z, long j, int i, boolean z2, long j2, boolean z3) {
        String str;
        String str2;
        Object obj;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        BU8 bu8 = new BU8("", this.LIZIZ);
        String str3 = "live_audience_c_anchor";
        if (i != 1) {
            bu8.LIZ = "live_audience_c_anchor";
        } else {
            if (z2) {
                bu8.LIZ = "live_audience_c_anchor";
            } else {
                bu8.LIZ = "live_audience_c_audience";
            }
            str3 = null;
            if (TextUtils.isEmpty(null)) {
                bu8.LIZ = "live_audience_c_audience";
                str3 = "live_audience_c_audience";
            }
        }
        HashMap hashMap = new HashMap();
        if (z2) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).WA(hashMap);
        }
        String valueOf = String.valueOf(j);
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null && (room = this.LIZ) != null && iMicRoomService.jT(room) && (officialChannelInfo = this.LIZ.officialChannelInfo) != null) {
            if (officialChannelInfo.channelUser.getId() == j) {
                if (iMicRoomService.Nl()) {
                    str3 = "carousel_audience_c_official_id";
                } else {
                    str3 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.LIZ.officialChannelInfo.channelUser.getId());
            } else if (j == this.LIZ.getOwner().getId()) {
                if (iMicRoomService.Nl()) {
                    str3 = "carousel_audience_c_anchor";
                } else {
                    str3 = "loyal_audience_c_anchor";
                }
                valueOf = String.valueOf(this.LIZ.officialChannelInfo.channelUser.getId());
            }
        }
        hashMap.put("to_user_id", valueOf);
        hashMap.put("request_page", str3);
        hashMap.put("click_user_position", "lineup_official_panel");
        if (z) {
            hashMap.put("growth_deepevent", String.valueOf(1));
            long ownerUserId = this.LIZ.getOwnerUserId();
            long j3 = B5G.LIZIZ().LJI;
            if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                if (j == this.LIZ.getOwnerUserId()) {
                    hashMap.put("anchor_type", "current");
                }
                if (z2) {
                    hashMap.put("anchor_type", "opposite");
                }
                hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
                List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
                if (QD.size() > 2) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_multi", obj);
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
        String LJIIIZ = BJM.LJIIIZ();
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (z3) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        hashMap.put("room_orientation", str);
        hashMap.put("connection_type", ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType());
        if ("manual_pk".equals(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType())) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                hashMap.put("match_status", "pk_phase");
            } else {
                hashMap.put("match_status", "punish");
            }
            hashMap.putAll(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
        }
        if (z) {
            str2 = "follow";
        } else {
            str2 = "unfollow";
        }
        BZI LIZ = C28787BRn.LIZ(str2);
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIILIIL(bu8);
        LIZ.LJIIZILJ();
        LIZ.LJIIIZ("live_interact");
        LIZ.LJIIJJI("live_detail");
        LIZ.LJJIIJZLJL();
    }
}
