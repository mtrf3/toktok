package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TXn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74807TXn implements InterfaceC75414Tik<ApplyResult> {
    public final /* synthetic */ C74815TXv LJLIL;
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
        Boolean bool;
        long j2;
        User owner2;
        FollowInfo followInfo2;
        Boolean bool2;
        int i;
        long j3;
        User owner3;
        User owner4;
        PerceptionMessage perceptionMessage;
        T t;
        Context context;
        C277116x c277116x;
        ApplyResult value = applyResult;
        o.LJIIIZ(value, "value");
        TQV tqv = this.LJLIL.LJLILLLLZI;
        if (tqv != null) {
            tqv.LJLLLLLL = false;
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LJFF(1);
        C74815TXv c74815TXv = this.LJLIL;
        TWR twr = this.LJLILLLLZI;
        c74815TXv.getClass();
        C29556Biq.LIZ().getClass();
        if (C74983Tbn.LJIIL(twr)) {
            c74815TXv.LJLJLLL = false;
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
                long j4 = bizApplyResponseData.linkTypePermission;
                MultiGuestDataHolder multiGuestDataHolder = c74815TXv.LJLLI;
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJIIZILJ(j4);
                }
                if (bizApplyResponseData.linkTypePermission == 2) {
                    MultiGuestDataHolder multiGuestDataHolder2 = c74815TXv.LJLLI;
                    if (multiGuestDataHolder2 != null) {
                        multiGuestDataHolder2.LIZ();
                    }
                    if (c74815TXv.LJLJLJ != 2) {
                        B7S.LIZ();
                    }
                    c74815TXv.LJLJLJ = 2;
                }
            }
            C74740TUy.LIZLLL().LJI(1);
            C74740TUy LIZLLL = C74740TUy.LIZLLL();
            int i2 = c74815TXv.LJLJLJ;
            LIZLLL.LJIIJJI = i2;
            String LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
            Room room = c74815TXv.LJLJI;
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            } else {
                j = 0;
            }
            C75017TcL.LJIIIIZZ(i2, "apply", 0L, LJ, j, c74815TXv.LJLJJLL, C59994Ngc.LIZJ(), null);
            C74838TYs.LJ().LJJIIZ = false;
            B7S.LIZIZ(R.string.lu6);
        }
        C74815TXv c74815TXv2 = this.LJLIL;
        c74815TXv2.LJLJLLL = false;
        BizApplyResponse bizApplyResponse2 = value.multiGuestRespExtra;
        if (bizApplyResponse2 != null) {
            bizApplyResponseData2 = bizApplyResponse2.responseData;
        } else {
            bizApplyResponseData2 = null;
        }
        TQV tqv2 = c74815TXv2.LJLILLLLZI;
        if (tqv2 != null) {
            if (bizApplyResponseData2 != null) {
                perceptionMessage = bizApplyResponseData2.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (MultiLivePerceptionSetting.isEnable() && perceptionMessage != null) {
                if (perceptionMessage.dialog != null && (t = tqv2.mView) != 0) {
                    InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) t;
                    if (interfaceC31336CRo != null && (context = interfaceC31336CRo.getContext()) != null) {
                        PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
                        if (perceptionDialogInfo != null) {
                            T t2 = tqv2.mView;
                            o.LJII(t2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                            C0NP.LIZLLL(perceptionDialogInfo, context, (LifecycleOwner) t2, (InterfaceC74834TYo) tqv2.LJLZ.getValue(), null, new AqS195S0100000_13(perceptionMessage, 33), 88);
                        }
                        PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
                        if (perceptionDialogInfo2 != null && (c277116x = tqv2.LJZ) != null) {
                            c277116x.LIZIZ(perceptionDialogInfo2.countDownTime);
                        }
                        DataChannelGlobal.LJLJJI.rv0(MultiGuestLiveSuspended.class);
                        return;
                    }
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("info: applyResult isnull or view null -> ");
                LIZ2.append(perceptionMessage);
                TYQ.LIZLLL("LinkIn_Guest_permission_Punished error", X1D.LIZIZ(LIZ2));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("linkPermissionType = ");
        if (bizApplyResponseData2 != null) {
            l2 = Long.valueOf(bizApplyResponseData2.linkTypePermission);
        } else {
            l2 = null;
        }
        C07670Rv.LJ(LIZ3, l2, LIZ3, "HybridKit");
        if (bizApplyResponseData2 != null) {
            long j5 = bizApplyResponseData2.linkTypePermission;
            MultiGuestDataHolder multiGuestDataHolder3 = this.LJLIL.LJLLI;
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder3.LJIIZILJ(j5);
            }
        }
        TWR twr2 = this.LJLILLLLZI;
        if (twr2 != null) {
            bool = Boolean.valueOf(twr2.LIZLLL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C74815TXv c74815TXv3 = this.LJLIL;
            c74815TXv3.getClass();
            FollowPair followPair = new FollowPair();
            Room room2 = c74815TXv3.LJLJI;
            if (room2 != null && (owner4 = room2.getOwner()) != null) {
                bool2 = Boolean.valueOf(owner4.isFollower);
            } else {
                bool2 = null;
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                i = 2;
            } else {
                i = 1;
            }
            followPair.followStatus = i;
            Room room3 = c74815TXv3.LJLJI;
            if (room3 != null && (owner3 = room3.getOwner()) != null) {
                j3 = owner3.getId();
            } else {
                j3 = 0;
            }
            followPair.LIZ = j3;
            followPair.LIZJ = followPair.followStatus;
            ((C29374Bfu) B83.LIZ().LIZIZ()).LJFF(followPair);
        }
        C75023TcR.LIZLLL.LIZJ("key_applyRequestResponse");
        C74815TXv c74815TXv4 = this.LJLIL;
        if (c74815TXv4.LJLIL == null) {
            DataChannel dataChannel = c74815TXv4.LJLJL;
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
            MultiGuestDataHolder multiGuestDataHolder4 = c74815TXv4.LJLLI;
            if (multiGuestDataHolder4 != null) {
                multiGuestDataHolder4.LIZ();
            }
            if (c74815TXv4.LJLJLJ != 2) {
                B7S.LIZ();
            }
            c74815TXv4.LJLJLJ = 2;
        }
        C74740TUy.LIZLLL().LJI(1);
        C74740TUy LIZLLL2 = C74740TUy.LIZLLL();
        int i3 = this.LJLIL.LJLJLJ;
        LIZLLL2.LJIIJJI = i3;
        String LJ2 = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        Room room4 = this.LJLIL.LJLJI;
        if (room4 != null && (owner2 = room4.getOwner()) != null && (followInfo2 = owner2.getFollowInfo()) != null) {
            j2 = followInfo2.getFollowStatus();
        } else {
            j2 = 0;
        }
        C75017TcL.LJIIIIZZ(i3, "apply", 0L, LJ2, j2, this.LJLIL.LJLJJLL, C59994Ngc.LIZJ(), null);
        C74838TYs.LJ().LJJIIZ = false;
        TY2 ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL.LJLIL);
        if (ty2 == null) {
            return;
        }
        ty2.LLLLIL();
    }

    public C74807TXn(C74815TXv c74815TXv, TWR twr) {
        this.LJLIL = c74815TXv;
        this.LJLILLLLZI = twr;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        InterfaceC74617TQf interfaceC74617TQf;
        o.LJIIIZ(error, "error");
        TQV tqv = this.LJLIL.LJLILLLLZI;
        if (tqv != null && (interfaceC74617TQf = (InterfaceC74617TQf) tqv.mView) != null) {
            interfaceC74617TQf.iA(new TXC(th));
        }
        C74815TXv c74815TXv = this.LJLIL;
        TWR twr = this.LJLILLLLZI;
        c74815TXv.getClass();
        C29556Biq.LIZ().getClass();
        if (C74983Tbn.LJIIL(twr)) {
            c74815TXv.LJLJLLL = false;
            BPP.LIZLLL(C8E.LIZIZ().context(), th, R.string.stz);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("throwable:");
            LIZ.append(th);
            TYQ.LIZLLL("LinkIn_Guest_Apply_Failed", X1D.LIZIZ(LIZ));
        }
        C74815TXv c74815TXv2 = this.LJLIL;
        c74815TXv2.LJLJLLL = false;
        InterfaceC29082BbC interfaceC29082BbC = (InterfaceC29082BbC) c74815TXv2.LJLIL;
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
