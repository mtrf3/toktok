package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.CCd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30935CCd implements OnMessageListener {
    public InterfaceC30936CCe LJLIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC30936CCe interfaceC30936CCe = this.LJLIL;
        if (interfaceC30936CCe != null) {
            interfaceC30936CCe.LIZ((CR6) iMessage);
        }
    }
}
