package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class TY1 implements U4B {
    public final /* synthetic */ C74814TXu LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.U4B
    public final void LIZJ(MultiGuestReserveResponse.ResponseData responseData) {
        long j;
        long j2;
        User owner;
        FollowInfo followInfo;
        AudienceReserveUserInfo audienceReserveUserInfo;
        AudienceReserveUserInfo audienceReserveUserInfo2;
        PerceptionMessage perceptionMessage;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null) {
            if (responseData != null) {
                perceptionMessage = responseData.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (multiGuestV3GuestPresenter.onInterceptPunishedMessageNew$liveinteract_impl_release(perceptionMessage)) {
                return;
            }
        }
        if (this.LJLILLLLZI) {
            this.LJLIL.LJIJ();
        }
        long j3 = 0;
        if (responseData != null && (audienceReserveUserInfo2 = responseData.reserveUserInfo) != null) {
            j = audienceReserveUserInfo2.reserveId;
        } else {
            j = 0;
        }
        C75027TcV.LIZLLL = j;
        C74814TXu c74814TXu = this.LJLIL;
        int i = c74814TXu.LJLJLJ;
        if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
            j2 = audienceReserveUserInfo.reserveId;
        } else {
            j2 = 0;
        }
        Room room = c74814TXu.LJLJI;
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j3 = followInfo.getFollowStatus();
        }
        C75017TcL.LJIIIIZZ(i, "reservation", j2, "cohost", j3, this.LJLIL.LJLJJLL, C59994Ngc.LIZJ(), null);
        InterfaceC29082BbC interfaceC29082BbC = (InterfaceC29082BbC) this.LJLIL.LJLIL;
        if (interfaceC29082BbC == null) {
            B7S.LIZIZ(R.string.klm);
            C75027TcV.LIZIZ(2);
            DataChannel dataChannel = this.LJLIL.LJLJL;
            if (dataChannel != null) {
                dataChannel.pv0(LinkInRoomGuestReserveSucceedEvent.class);
                return;
            }
            return;
        }
        TY2 ty2 = (TY2) interfaceC29082BbC;
        if (ty2 != null) {
            ty2.a();
        }
    }

    @Override // X.U4B
    public final void onFailed(Throwable th) {
        C74814TXu c74814TXu = this.LJLIL;
        InterfaceC29082BbC interfaceC29082BbC = (InterfaceC29082BbC) c74814TXu.LJLIL;
        if (interfaceC29082BbC == null) {
            DataChannel dataChannel = c74814TXu.LJLJL;
            if (dataChannel != null) {
                dataChannel.qv0(LinkInRoomGuestReserveFailedEvent.class, th);
                return;
            }
            return;
        }
        TY2 ty2 = (TY2) interfaceC29082BbC;
        if (ty2 != null) {
            ty2.sc(th);
        }
    }

    public TY1(C74814TXu c74814TXu, boolean z) {
        this.LJLIL = c74814TXu;
        this.LJLILLLLZI = z;
    }
}
