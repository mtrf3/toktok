package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TnB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC75689TnB implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 0;

    public RunnableC75689TnB(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    public final void LIZ() {
        boolean z;
        C32208CkW c32208CkW = new C32208CkW(5);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send PK Position Event videoMarginTop = ");
        LIZ.append(this.LJLIL);
        LIZ.append(" videoHeight = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" dataChannel == null = ");
        if (RandomLinkMicManager.LJLILLLLZI == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
        c32208CkW.LIZIZ = this.LJLIL + this.LJLILLLLZI;
        c32208CkW.LIZJ = C76265TwT.LJ();
        c32208CkW.LIZLLL = this.LJLJI;
        DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
        }
        RandomLinkMicManager.LJIILLIIL(RandomLinkMicManager.LJLILLLLZI, EnumC75697TnJ.TYPE_AUTO_START_WHEN_END);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
