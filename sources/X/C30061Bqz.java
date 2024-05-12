package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Bqz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30061Bqz implements OnMessageListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC29879Bo3 LJLILLLLZI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        switch (this.LJLIL) {
            case 0:
                this.LJLILLLLZI.invoke(iMessage);
                return;
            default:
                this.LJLILLLLZI.invoke(iMessage);
                return;
        }
    }

    public /* synthetic */ C30061Bqz(InterfaceC29879Bo3 interfaceC29879Bo3, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC29879Bo3;
    }
}
