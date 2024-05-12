package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.VoiceChatStartFailedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatReconnectSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYX implements InterfaceC75414Tik<CreateChannelResult> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ TYW LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    @Override // X.InterfaceC75414Tik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r7 = (com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult) r7
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse r0 = r7.multiGuestRespExtra
            java.lang.String r3 = "VoiceChatControlPresenter"
            r5 = 0
            if (r0 == 0) goto Lda
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponseData r0 = r0.responseData
            if (r0 == 0) goto Ld7
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r1 = r0.multiLiveAnchorPanelSettings
        L14:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "anchor multiLiveAnchorPanelSettings "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.C74987Tbr.LIZJ(r3, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L30
        L2b:
            java.lang.String r0 = "anchor value.extraItems is null"
            X.C74987Tbr.LIZ(r3, r0)
        L30:
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse r0 = r7.multiGuestRespExtra
            if (r0 != 0) goto L3a
            java.lang.String r0 = "anchor multiLiveAnchorPanelSettings return as extra is null"
            X.C74987Tbr.LIZJ(r3, r0)
        L39:
            return
        L3a:
            if (r1 == 0) goto L90
            X.TYW r2 = r6.LJLILLLLZI
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "anchor multiLiveAnchorPanelSettings, allowViewer= "
            r4.append(r0)
            int r0 = r1.allowViewerReq
            r4.append(r0)
            java.lang.String r0 = ",onlyAllowFollower = "
            r4.append(r0)
            int r0 = r1.onlyAllowFollowerReq
            r4.append(r0)
            java.lang.String r0 = ",fix ="
            r4.append(r0)
            int r0 = r1.fixMicNumAction
            r4.append(r0)
            java.lang.String r0 = ",usrId ="
            r4.append(r0)
            java.lang.Long r0 = r1.userId
            r4.append(r0)
            java.lang.String r0 = ",layout ="
            r4.append(r0)
            int r0 = r1.layoutType
            r4.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            X.C74987Tbr.LIZ(r3, r0)
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r1 = com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings.L(r1)
            X.Tbu r0 = X.EnumC74990Tbu.ACTIVITY_PAGE_OPEN
            X.C74776TWi.LJIILLIIL(r1, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r2.multiGuestDataHolder
            if (r0 == 0) goto Ldd
            r0.LJIIJ = r1
            X.TYs r0 = X.C74838TYs.LJ()
            if (r0 != 0) goto Ld4
        L90:
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r6.LJLIL
            X.TYW r0 = r6.LJLILLLLZI
            T extends X.91o r1 = r0.mView
            java.lang.String r0 = "viewInterface"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.TYZ r1 = (X.TYZ) r1
            X.C74770TWc.LIZJ(r2, r1)
            X.TYW r0 = r6.LJLILLLLZI
            T extends X.91o r0 = r0.mView
            X.TYZ r0 = (X.TYZ) r0
            r0.kr()
            java.lang.String r0 = "createChannel success"
            X.C0NB.LIZIZ(r3, r0)
            X.TUy r2 = X.C74740TUy.LIZLLL()
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.LJI(r0)
            X.TYW r0 = r6.LJLILLLLZI
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r0.dataChannel
            if (r4 == 0) goto L39
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel> r3 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel.class
            java.lang.String r2 = X.LAV.LIZIZ()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            r4.rv0(r3, r0)
            goto L39
        Ld4:
            r0.LJJI = r1
            goto L90
        Ld7:
            r1 = r5
            goto L14
        Lda:
            r1 = r5
            goto L2b
        Ldd:
            java.lang.String r0 = "multiGuestDataHolder"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TYX.onSuccess(java.lang.Object):void");
    }

    public TYX(Room room, TYW tyw) {
        this.LJLIL = room;
        this.LJLILLLLZI = tyw;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        String str;
        Room room;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createChannel failed, errorMsg:");
        LIZ.append(error.getErrorMsg());
        LIZ.append(",errorCode:");
        LIZ.append(error.getErrorCode());
        C0NB.LJ("VoiceChatControlPresenter", X1D.LIZIZ(LIZ));
        TYW tyw = this.LJLILLLLZI;
        String valueOf = String.valueOf(error.getErrorCode());
        String errorMsg = error.getErrorMsg();
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (throwable is CustomA…                        }");
        tyw.getClass();
        if (VoiceChatReconnectSettings.INSTANCE.getValue()) {
            int i = tyw.LJLILLLLZI + 1;
            tyw.LJLILLLLZI = i;
            if (i >= 3) {
                C30868C9o.LIZJ(R.string.nem);
                tyw.dataChannel.pv0(VoiceChatStartFailedEvent.class);
                C74824TYe.LJLJLLL("create_channel_error", valueOf, errorMsg, str);
            } else {
                C30868C9o.LIZJ(R.string.nel);
                DataChannel dataChannel = tyw.dataChannel;
                if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
                    return;
                }
                tyw.LJJJJI(room);
            }
        }
    }
}
