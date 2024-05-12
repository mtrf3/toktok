package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TbC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74946TbC implements U2U {
    public final /* synthetic */ LiveShowAudienceWidget LIZ;

    @Override // X.U2U
    public final void LIZJ(long j) {
    }

    public C74946TbC(LiveShowAudienceWidget liveShowAudienceWidget) {
        this.LIZ = liveShowAudienceWidget;
    }

    @Override // X.U2U
    public final void LIZIZ(long j) {
        Room room;
        boolean z;
        boolean z2;
        AbstractC74727TUl LIZ;
        LinkListUser linkListUser;
        User user;
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        boolean z3 = true;
        if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) this.LIZ.dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() <= 0) {
            z3 = false;
        }
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(z2, z3, z);
        if (LIZIZ == EnumC31154CKo.GREY || LIZIZ == EnumC31154CKo.HIDE) {
            if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null) {
                return;
            }
            C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
            this.LIZ.dataChannel.qv0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
            return;
        }
        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (linkListUser = (LinkListUser) LIZ.LIZLLL(j)) != null && (user = linkListUser.user) != null) {
            C32004ChE c32004ChE = new C32004ChE(user);
            c32004ChE.LIZIZ = "multiguest_liveshow_panel";
            c32004ChE.LJFF = C74947TbD.LJJI();
            c32004ChE.LJI = C74934Tb0.LIZ();
            this.LIZ.dataChannel.qv0(SendGiftEvent.class, c32004ChE);
        }
    }
}
