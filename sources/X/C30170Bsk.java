package X;

import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bsk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30170Bsk implements OnMessageListener {
    public final /* synthetic */ C30168Bsi LJLIL;
    public final /* synthetic */ InterfaceC30237Btp LJLILLLLZI;

    public C30170Bsk(C30168Bsi c30168Bsi, InterfaceC30237Btp interfaceC30237Btp) {
        this.LJLIL = c30168Bsi;
        this.LJLILLLLZI = interfaceC30237Btp;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LiveEventMessage) {
            int i = ((LiveEventMessage) iMessage).actionType;
            if (i == 1) {
                this.LJLIL.LJI();
            } else {
                if (i != 2) {
                    return;
                }
                C29306Beo.LJJLIIIJJI(this.LJLILLLLZI.LIZ(R.id.fwo), false);
            }
        }
    }
}
