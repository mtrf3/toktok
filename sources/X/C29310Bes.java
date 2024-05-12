package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bes, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29310Bes<T> implements InterfaceC64592gB {
    public final /* synthetic */ C29311Bet LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ C29821Bn7 LJLJI;

    public C29310Bes(C29311Bet c29311Bet, Room room, C29821Bn7 c29821Bn7) {
        this.LJLIL = c29311Bet;
        this.LJLILLLLZI = room;
        this.LJLJI = c29821Bn7;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        User owner;
        C73943T0h.LIZ().LIZIZ(new CJ5((FollowPair) obj));
        C29311Bet c29311Bet = this.LJLIL;
        Room room = this.LJLILLLLZI;
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        long j3 = this.LJLJI.LIZ;
        c29311Bet.getClass();
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).bt(j, j3);
        C30868C9o.LIZJ(R.string.l9o);
        C29311Bet c29311Bet2 = this.LJLIL;
        Room room2 = this.LJLILLLLZI;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            j2 = owner.getId();
        }
        MESSAGE message = this.LJLJI.LJIJJLI;
        c29311Bet2.getClass();
        CommonMessageData commonMessageData = message.baseMessage;
        if (commonMessageData == null || (str = commonMessageData.logId) == null) {
            str = "";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_follow");
        Room room3 = c29311Bet2.LJLLJ;
        if (room3 != null) {
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room3.getId())), "server_heat_level");
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room3.getId())), "client_heat_level");
        }
        if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
        }
        String str2 = "1";
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ZQ()) {
            List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
            if (QD.size() > 2) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(obj4, "is_multi");
            LIZ.LJIJJ(String.valueOf(QD.size()), "current_connection_cnts");
            LIZ.LJIJJ(QD.toString(), "uid_list");
        } else {
            LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_multi");
            LIZ.LJIJJ(new Long[]{Long.valueOf(j2), Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())}.toString(), "uid_list");
            LIZ.LJIJJ("2", "current_connection_cnts");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ.LJIJJ("live_follow_capsule", "request_page");
        LIZ.LJIJJ(Long.valueOf(j2), "to_user_id");
        LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "connection_type");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj2, "is_portal_user");
        LIZ.LJIJJ(str, "notification_request_id");
        LIZ.LJIJJ("follow_guide_chat", "notification_type");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj3, "is_portal_user");
        LIZ.LJIJJ(Long.valueOf(BJM.LJIIL()), "portal_id");
        if (C74838TYs.LJ().LJJ <= 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_guest_connection");
        LIZ.LJIILLIIL(c29311Bet2.LJLLILLLL);
        LIZ.LJJIIJZLJL();
    }
}
