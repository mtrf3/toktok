package X;

import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;

/* renamed from: X.BrU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30092BrU implements OnMessageListener {
    public InterfaceC30135BsB LJLIL;
    public IMessageManager LJLILLLLZI;

    public C30092BrU(DataChannel dataChannel) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC30135BsB interfaceC30135BsB = this.LJLIL;
        if (interfaceC30135BsB != null) {
            interfaceC30135BsB.onControlMessage((ControlMessage) iMessage);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(((ControlMessage) iMessage).action));
        C0K2.LJII(1, "ttlive_control_message_status", hashMap);
    }
}
