package X;

import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicCancelEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TnI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75696TnI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C75696TnI LJLIL = new C75696TnI();

    public C75696TnI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(LinkRandomLinkMicCancelEvent.class, Boolean.FALSE);
        }
        RandomLinkMicManager.LIZJ(false);
        B5G.LIZIZ().LJII("Random_Link_Waiting");
        return C76800UCe.LIZ;
    }
}
