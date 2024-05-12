package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TXo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74808TXo implements InterfaceC75414Tik<ApplyResult> {
    public final /* synthetic */ C74814TXu LJLIL;
    public final /* synthetic */ TWR LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ApplyResult applyResult) {
        BizApplyResponseData bizApplyResponseData;
        Long l;
        long j;
        User owner;
        FollowInfo followInfo;
        BizApplyResponseData bizApplyResponseData2;
        Long l2;
        long j2;
        User owner2;
        FollowInfo followInfo2;
        PerceptionMessage perceptionMessage;
        ApplyResult value = applyResult;
        o.LJIIIZ(value, "value");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null) {
            multiGuestV3GuestPresenter.setNeedLeaveChannelWhenEnterRoom(false);
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LJFF(1);
        C74814TXu c74814TXu = this.LJLIL;
        TWR twr = this.LJLILLLLZI;
        c74814TXu.getClass();
        C29556Biq.LIZ().getClass();
        Boolean bool = null;
        if (C74983Tbn.LJIIL(twr)) {
            c74814TXu.LJLLILLLL = false;
            BizApplyResponse bizApplyResponse = value.multiGuestRespExtra;
            if (bizApplyResponse != null) {
                bizApplyResponseData = bizApplyResponse.responseData;
            } else {
                bizApplyResponseData = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linkPermissionType = ");
            if (bizApplyResponseData != null) {
                l = Long.valueOf(bizApplyResponseData.linkTypePermission);
            } else {
                l = null;
            }
            C07670Rv.LJ(LIZ, l, LIZ, "HybridKit");
            if (bizApplyResponseData != null) {
                long j3 = bizApplyResponseData.linkTypePermission;
                MultiGuestDataHolder multiGuestDataHolder = c74814TXu.LJLLL;
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJIIZILJ(j3);
                }
                if (bizApplyResponseData.linkTypePermission == 2) {
                    MultiGuestDataHolder multiGuestDataHolder2 = c74814TXu.LJLLL;
                    if (multiGuestDataHolder2 != null) {
                        multiGuestDataHolder2.LIZ();
                    }
                    if (c74814TXu.LJLJLJ != 2) {
                        B7S.LIZ();
                    }
                    c74814TXu.LJLJLJ = 2;
                }
            }
            C74740TUy.LIZLLL().LJI(1);
            C74740TUy LIZLLL = C74740TUy.LIZLLL();
            int i = c74814TXu.LJLJLJ;
            LIZLLL.LJIIJJI = i;
            String LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
            Room room = c74814TXu.LJLJI;
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            } else {
                j = 0;
            }
            C75017TcL.LJIIIIZZ(i, "apply", 0L, LJ, j, c74814TXu.LJLJJLL, C59994Ngc.LIZJ(), TYJ.LIZ(c74814TXu.LJLLL));
            C74838TYs.LJ().LJJIIZ = false;
            B7S.LIZIZ(R.string.lu6);
        }
        C74814TXu c74814TXu2 = this.LJLIL;
        c74814TXu2.LJLLILLLL = false;
        BizApplyResponse bizApplyResponse2 = value.multiGuestRespExtra;
        if (bizApplyResponse2 != null) {
            bizApplyResponseData2 = bizApplyResponse2.responseData;
        } else {
            bizApplyResponseData2 = null;
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2 = c74814TXu2.LJLILLLLZI;
        if (multiGuestV3GuestPresenter2 != null) {
            if (bizApplyResponseData2 != null) {
                perceptionMessage = bizApplyResponseData2.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (multiGuestV3GuestPresenter2.onInterceptPunishedMessageNew$liveinteract_impl_release(perceptionMessage)) {
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("linkPermissionType = ");
        if (bizApplyResponseData2 != null) {
            l2 = Long.valueOf(bizApplyResponseData2.linkTypePermission);
        } else {
            l2 = null;
        }
        C07670Rv.LJ(LIZ2, l2, LIZ2, "HybridKit");
        if (bizApplyResponseData2 != null) {
            long j4 = bizApplyResponseData2.linkTypePermission;
            MultiGuestDataHolder multiGuestDataHolder3 = this.LJLIL.LJLLL;
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder3.LJIIZILJ(j4);
            }
        }
        TWR twr2 = this.LJLILLLLZI;
        if (twr2 != null) {
            bool = Boolean.valueOf(twr2.LIZLLL);
        }
        if (C29306Beo.LJJIFFI(bool)) {
            this.LJLIL.LJIJ();
        }
        C75023TcR.LIZLLL.LIZJ("key_applyRequestResponse");
        C74814TXu c74814TXu3 = this.LJLIL;
        if (c74814TXu3.LJLIL == null) {
            DataChannel dataChannel = c74814TXu3.LJLJL;
            if (dataChannel == null) {
                return;
            }
            String applyResult2 = value.toString();
            if (applyResult2 == null) {
                applyResult2 = "";
            }
            dataChannel.qv0(LinkInRoomGuestApplySucceedEvent.class, applyResult2);
            return;
        }
        if (bizApplyResponseData2 != null && bizApplyResponseData2.linkTypePermission == 2) {
            MultiGuestDataHolder multiGuestDataHolder4 = c74814TXu3.LJLLL;
            if (multiGuestDataHolder4 != null) {
                multiGuestDataHolder4.LIZ();
            }
            if (c74814TXu3.LJLJLJ != 2) {
                B7S.LIZ();
            }
            c74814TXu3.LJLJLJ = 2;
        }
        C74740TUy.LIZLLL().LJI(1);
        C74740TUy LIZLLL2 = C74740TUy.LIZLLL();
        int i2 = this.LJLIL.LJLJLJ;
        LIZLLL2.LJIIJJI = i2;
        String LJ2 = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        Room room2 = this.LJLIL.LJLJI;
        if (room2 != null && (owner2 = room2.getOwner()) != null && (followInfo2 = owner2.getFollowInfo()) != null) {
            j2 = followInfo2.getFollowStatus();
        } else {
            j2 = 0;
        }
        C75017TcL.LJIIIIZZ(i2, "apply", 0L, LJ2, j2, this.LJLIL.LJLJJLL, C59994Ngc.LIZJ(), TYJ.LIZ(this.LJLIL.LJLLL));
        C74838TYs.LJ().LJJIIZ = false;
        TY2 ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL.LJLIL);
        if (ty2 == null) {
            return;
        }
        ty2.LLLLIL();
    }

    public C74808TXo(C74814TXu c74814TXu, TWR twr) {
        this.LJLIL = c74814TXu;
        this.LJLILLLLZI = twr;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        InterfaceC74596TPk interfaceC74596TPk;
        o.LJIIIZ(error, "error");
        C74824TYe.LJJLIIIIJ(th);
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null && (interfaceC74596TPk = (InterfaceC74596TPk) multiGuestV3GuestPresenter.mView) != null) {
            interfaceC74596TPk.onCheckPermissionFailed(new TXK(th));
        }
        C74814TXu c74814TXu = this.LJLIL;
        TWR twr = this.LJLILLLLZI;
        c74814TXu.getClass();
        C29556Biq.LIZ().getClass();
        if (C74983Tbn.LJIIL(twr)) {
            c74814TXu.LJLLILLLL = false;
            BPP.LIZLLL(C8E.LIZIZ().context(), th, R.string.stz);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("throwable:");
            LIZ.append(th);
            TYQ.LIZLLL("LinkIn_Guest_Apply_Failed", X1D.LIZIZ(LIZ));
        }
        C74814TXu c74814TXu2 = this.LJLIL;
        c74814TXu2.LJLLILLLL = false;
        InterfaceC29082BbC interfaceC29082BbC = (InterfaceC29082BbC) c74814TXu2.LJLIL;
        if (interfaceC29082BbC == null) {
            return;
        }
        TY2 ty2 = (TY2) interfaceC29082BbC;
        if (ty2 != null) {
            ty2.LLLLLLLZIL(th);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("throwable:");
        LIZ2.append(th);
        TYQ.LIZLLL("LinkIn_Guest_Apply_Failed", X1D.LIZIZ(LIZ2));
    }
}
