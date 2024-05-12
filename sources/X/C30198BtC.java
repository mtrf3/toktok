package X;

import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.BtC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30198BtC implements OnMessageListener {
    public final Room LJLIL;
    public DataChannel LJLILLLLZI;

    public C30198BtC(Room room) {
        this.LJLIL = room;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage != 0) {
            if ((iMessage instanceof MemberMessage) && ((BaseMessage) iMessage).isCurrentRoom(this.LJLIL.getId()) && (dataChannel = this.LJLILLLLZI) != null) {
                dataChannel.rv0(MemberMessageChannel.class, iMessage);
                return;
            }
            return;
        }
        try {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
        }
    }
}
