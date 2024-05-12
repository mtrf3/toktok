package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowZoomEvent;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import defpackage.b1;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.LiveShowMessage;

/* loaded from: classes14.dex */
public final class U3B implements OnIMMessageListener {
    public final /* synthetic */ U3F LJLIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "live-show-message-channel";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public U3B(U3F u3f) {
        this.LJLIL = u3f;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage == null) {
            return;
        }
        if (iMessage instanceof LiveShowMessage) {
            U3F u3f = this.LJLIL;
            LiveShowMessage liveShowMessage = (LiveShowMessage) iMessage;
            u3f.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleLiveShowMessage messageId=");
            LIZ.append(liveShowMessage.getMessageId());
            LIZ.append(" messageType=");
            b1.LJ(LIZ, liveShowMessage.messageType, LIZ, "BaseLiveShowMessageChannel");
            switch (liveShowMessage.messageType) {
                case 0:
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("reportErrorMessage reason=");
                    LIZ2.append("");
                    LIZ2.append(" message=");
                    LIZ2.append(liveShowMessage);
                    C0NB.LJ("BaseLiveShowMessageChannel", X1D.LIZIZ(LIZ2));
                    return;
                case 1:
                    ShowContent showContent = liveShowMessage.showContent;
                    if (showContent == null) {
                        return;
                    }
                    u3f.LIZIZ.LJ(showContent);
                    return;
                case 2:
                    u3f.LIZIZ.LIZLLL(liveShowMessage);
                    return;
                case 3:
                    ShowContent showContent2 = liveShowMessage.showContent;
                    if (showContent2 == null) {
                        return;
                    }
                    u3f.LIZIZ.LJII(showContent2);
                    return;
                case 4:
                    ShowContent showContent3 = liveShowMessage.showContent;
                    if (showContent3 == null) {
                        return;
                    }
                    u3f.LIZIZ.LIZJ(showContent3);
                    return;
                case 5:
                    ShowContent showContent4 = liveShowMessage.showContent;
                    if (showContent4 == null) {
                        return;
                    }
                    u3f.LIZIZ.LJFF(showContent4);
                    return;
                case 6:
                    u3f.LIZIZ.LJIIIIZZ(liveShowMessage);
                    return;
                default:
                    return;
            }
        }
        if (!(iMessage instanceof LinkScreenChangeMessage) || (dataChannel = this.LJLIL.LIZ) == null) {
            return;
        }
        dataChannel.pv0(LiveShowZoomEvent.class);
    }
}
