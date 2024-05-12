package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tj8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75438Tj8 implements U2U {
    public final /* synthetic */ LiveShowGuestWidget LIZ;

    public C75438Tj8(LiveShowGuestWidget liveShowGuestWidget) {
        this.LIZ = liveShowGuestWidget;
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

    @Override // X.U2U
    public final void LIZJ(long j) {
        AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> finishGuest;
        LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) this.LIZ.LJLILLLLZI;
        if (liveShowGuestViewModel != null) {
            FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
            finishShowingGuestParams.roomId = liveShowGuestViewModel.LJLJL;
            finishShowingGuestParams.channelId = liveShowGuestViewModel.LJJLI();
            finishShowingGuestParams.showId = BaseLiveShowViewModel.ov0();
            finishShowingGuestParams.targetUserId = j;
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (finishGuest = LIZ.finishGuest(finishShowingGuestParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(finishGuest).LJJII(new AfS65S0100000_13(liveShowGuestViewModel, 7), C75439Tj9.LJLIL);
                C73318Sq2 cb = liveShowGuestViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }
}
