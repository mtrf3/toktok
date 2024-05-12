package X;

import Y.AfS54S0200000_5;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCoHostMatchCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BnI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29832BnI implements InterfaceC29848BnY {
    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        Long l;
        C75536Tki c75536Tki;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        User user;
        long j;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        if (o.LJ(((CapsuleMessage) capsuleModel.LJIJJLI).scene, "follow-guide")) {
            CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
            if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null && (user = capsuleBizParamsCohost.rivalUser) != null) {
                if (!user.isFollowing()) {
                    CQQ LJLIIL = capsuleModel.LJLIIL();
                    long j2 = LJLIIL.LJIIJJI;
                    DataChannel dataChannel = LJLIIL.LJIIIIZZ;
                    Long valueOf = Long.valueOf(user.getId());
                    LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                    InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
                    C29364Bfk c29364Bfk = new C29364Bfk();
                    if (valueOf != null) {
                        j = valueOf.longValue();
                    } else {
                        j = 0;
                    }
                    c29364Bfk.LIZIZ(j);
                    c29364Bfk.LJ(j2);
                    ((C29374Bfu) LIZIZ2).LJIIIIZZ(c29364Bfk.LIZJ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(dataChannel, LIZIZ, 56), C28340BAi.LJLIL);
                }
                String string = capsuleModel.LJLIIL().LIZ.getString(R.string.km_, C05170If.LIZ(user));
                o.LJIIIIZZ(string, "capsuleModel.publicScree…(user),\n                )");
                Context context = capsuleModel.LJLIIL().LIZ;
                o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
                C30868C9o.LJIIIZ(R.drawable.d0p, (Activity) context, string);
            }
        } else if (o.LJ(((CapsuleMessage) capsuleModel.LJIJJLI).scene, "linkmic-guide")) {
            CQQ LJLIIL2 = capsuleModel.LJLIIL();
            B5G.LIZIZ().LJJJ = new C75648TmW("anchor_host_notice");
            LinkCrossRoomDataHolder LIZIZ3 = B5G.LIZIZ();
            DataChannel dataChannel2 = LJLIIL2.LJIIIIZZ;
            if (dataChannel2 != null && (c75536Tki = (C75536Tki) dataChannel2.kv0(C75505TkD.class)) != null) {
                l = Long.valueOf(c75536Tki.LJLIL);
            } else {
                l = null;
            }
            LIZIZ3.LJJLIIIIJ = String.valueOf(l);
            B5G.LIZIZ().LJJLJ = "anchor_host_notice";
            if ((!((IInteractService) CN1.LIZ(IInteractService.class)).ta0() || C74726TUk.LIZ()) && (!((IInteractService) CN1.LIZ(IInteractService.class)).h80() || ((IInteractService) CN1.LIZ(IInteractService.class)).ZQ())) {
                B5G.LIZIZ().LJ();
                DataChannel dataChannel3 = LJLIIL2.LJIIIIZZ;
                if ((dataChannel3 == null || !((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nU(dataChannel3)) && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT() && !RandomLinkMicManager.LJIIJJI() && RandomLinkMicManager.LJLJLJ != EnumC75692TnE.LINKING && !C75650TmY.LIZJ() && !C75650TmY.LIZIZ()) {
                    DataChannel dataChannel4 = LJLIIL2.LJIIIIZZ;
                    if (dataChannel4 != null) {
                        dataChannel4.qv0(OpenCoHostEvent.class, "anchor_host_notice");
                    }
                    B5G.LIZIZ().LJJJ = new C75648TmW("anchor_host_notice");
                    List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
                    if (((IInteractService) CN1.LIZ(IInteractService.class)).ZQ() && QD != null && QD.size() >= 2) {
                        C75642TmQ.LJJJZ("connection_invite", new C75648TmW("anchor_host_notice"), 4);
                    } else {
                        C75642TmQ.LJJJZ("connection_invite", null, 6);
                    }
                    J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_host_notice"), LJLIIL2.LJIIIIZZ, "click", "event_type");
                }
            }
            C30868C9o.LIZJ(R.string.kh8);
        }
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        C75017TcL.LJ("anchor_host_notice", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r1 == true) goto L28;
     */
    @Override // X.InterfaceC29848BnY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C29846BnW r6) {
        /*
            r5 = this;
            java.lang.String r0 = "capsuleModel"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            MESSAGE extends X.CR6 r0 = r6.LJIJJLI
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            java.lang.String r1 = r0.scene
            java.lang.String r0 = "linkmic-guide"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L64
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r2 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            if (r2 == 0) goto L61
            long r0 = r2.getOwnerUserId()
        L23:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r1 = 0
            if (r2 == 0) goto L5f
            java.lang.String r3 = r2.getIdStr()
        L2e:
            MESSAGE extends X.CR6 r0 = r6.LJIJJLI
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
            if (r0 == 0) goto L40
            com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost r0 = r0.cohost
            if (r0 == 0) goto L40
            long r0 = r0.availableFriendNumber
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L40:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = "bubble_guide"
            X.C75017TcL.LJIILLIIL(r4, r3, r0, r2, r1)
        L4b:
            java.lang.String r0 = "livesdk_anchor_host_notice"
            X.BZI r3 = X.C28787BRn.LIZ(r0)
            X.CQQ r0 = r6.LJLIIL()
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LJIIIIZZ
            java.lang.String r1 = "event_type"
            java.lang.String r0 = "show"
            X.J9A.LIZJ(r3, r2, r0, r1)
            return
        L5f:
            r3 = r1
            goto L2e
        L61:
            r0 = 0
            goto L23
        L64:
            MESSAGE extends X.CR6 r0 = r6.LJIJJLI
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            java.lang.String r1 = r0.scene
            java.lang.String r0 = "follow-guide"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4b
            X.CQQ r0 = r6.LJLIIL()
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.LJIIIIZZ
            X.CQQ r0 = r6.LJLIIL()
            long r0 = r0.LIZLLL()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            MESSAGE extends X.CR6 r0 = r6.LJIJJLI
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
            if (r0 == 0) goto L99
            com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost r0 = r0.cohost
            if (r0 == 0) goto L99
            boolean r1 = r0.isFollowedByRival
            r0 = 1
            if (r1 != r0) goto L99
        L95:
            X.C29319Bf1.LIZIZ(r3, r2, r0)
            goto L4b
        L99:
            r0 = 0
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29832BnI.LJ(X.BnW):void");
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ publicScreenContext, CapsuleMessage message) {
        DataChannel dataChannel;
        Integer num;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        if (LiveCoHostMatchCapsuleGovernanceSetting.INSTANCE.coHostMatchCapsuleDefault() || (dataChannel = publicScreenContext.LJIIIIZZ) == null || (num = (Integer) dataChannel.kv0(C28414BDe.class)) == null || (num.intValue() != 1 && num.intValue() != 3)) {
            return true;
        }
        num.intValue();
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
