package X;

import Y.IDxS129S0200000_5;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.BeJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29275BeJ {
    public final C73318Sq2 LIZ = new C73318Sq2();

    public final void LIZ(long j, Room room, String str, BG7 bg7) {
        boolean z;
        String str2;
        String str3;
        if (room == null) {
            return;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        C29364Bfk c29364Bfk = new C29364Bfk();
        c29364Bfk.LIZIZ(j);
        room.getRequestId();
        c29364Bfk.LIZLLL();
        C29364Bfk c29364Bfk2 = c29364Bfk;
        c29364Bfk2.LIZLLL();
        c29364Bfk2.LJ(0L);
        room.getLabels();
        c29364Bfk2.LIZLLL();
        ((C29374Bfu) LIZIZ).LJIIIIZZ(new C29363Bfj(c29364Bfk2)).LIZ(new IDxS129S0200000_5(this, bg7, 1));
        if (room.getOwner() != null && room.getOwner().getId() == j) {
            z = true;
        } else {
            z = false;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("growth_deepevent", String.valueOf(1));
            if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
            }
            String LJIIIZ = BJM.LJIIIZ();
            if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            String str4 = "live_anchor_c_audience";
            if (z) {
                str4 = "live_over";
            }
            if (str == null || (!str.contains("carousel_audience_c") && !str.contains("loyal_audience_c"))) {
                str = str4;
            }
            if (C15380j0.LJIILLIIL()) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            hashMap.put("room_orientation", str2);
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                int followStatus = (int) room.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus != 1 && followStatus != 3) {
                    str3 = "single";
                    hashMap.put("follow_type", str3);
                }
                str3 = "mutual";
                hashMap.put("follow_type", str3);
            }
            if ("manual_pk".equals(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType())) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    hashMap.put("match_status", "pk_phase");
                } else {
                    hashMap.put("match_status", "punish");
                }
                hashMap.putAll(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            BZI LIZ = C28787BRn.LIZ("follow");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIILIIL(new BU8(str, j));
            LIZ.LJIIIZ("live_interact");
            LIZ.LJIIL("core");
            LIZ.LJIIJJI("live_detail");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
