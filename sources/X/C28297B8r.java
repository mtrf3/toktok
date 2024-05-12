package X;

import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.B8r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28297B8r implements OnMessageListener {
    public final DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI = "";
    public LinkLayerMessage LJLJJI;
    public boolean LJLJJL;

    public C28297B8r(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(PIPModeChangeEvent.class, this, new AqS171S0100000_5(this, 823));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof LinkLayerMessage)) {
            this.LJLJJI = (LinkLayerMessage) iMessage;
        }
    }
}
