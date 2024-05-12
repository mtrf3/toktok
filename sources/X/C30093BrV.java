package X;

import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.BrV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30093BrV implements InterfaceC30153BsT, OnMessageListener {
    public DataChannel LJLIL;
    public IMessageManager LJLILLLLZI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage instanceof SocialMessage) {
            SocialMessage socialMessage = (SocialMessage) iMessage;
            if (socialMessage.action == 3 && (dataChannel = this.LJLIL) != null) {
                dataChannel.rv0(RoomShareCountChannel.class, Integer.valueOf(socialMessage.shareCount));
            }
        }
    }

    public final void LIZ(DataChannel dataChannel, IMessageManager iMessageManager, int i) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.rv0(RoomShareCountChannel.class, Integer.valueOf(i));
        this.LJLIL = dataChannel;
        if (iMessageManager == null) {
            return;
        }
        iMessageManager.addMessageListener(EnumC31509CYf.SOCIAL.getIntType(), this);
        this.LJLILLLLZI = iMessageManager;
    }
}
