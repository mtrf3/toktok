package X;

import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRemoveBroadcastForegroundSetting;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;

/* renamed from: X.C1j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30655C1j implements InterfaceC78493UrJ {
    public final /* synthetic */ TryModeBroadcastFragment LJLIL;

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        C0NB.LJIIIZ("LiveBroadcastFragment", "onEnterBackground");
        this.LJLIL.getClass();
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable()) {
            CKO cko = this.LJLIL.LL;
            if (cko != null) {
                cko.LIZJ(C78857UxB.LJJIIJ(1476788484, "bpea-385"));
            }
            this.LJLIL.getClass();
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C0NB.LJIIIZ("LiveBroadcastFragment", "onEnterForeground");
        this.LJLIL.getClass();
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable() && ((BroadcastTunnelVM) this.LJLIL.LJLL.getValue()).LJLIL.getValue() == A9Z.STREAM_ON && C29306Beo.LJIILLIIL((Boolean) this.LJLIL.LJIIL().kv0(PauseLiveChannel.class))) {
            CKO cko = this.LJLIL.LL;
            if (cko != null) {
                cko.LJIIJJI(C78857UxB.LJJIIJ(1476788233, "bpea-364"));
            }
            this.LJLIL.getClass();
        }
    }

    public C30655C1j(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LJLIL = tryModeBroadcastFragment;
    }
}
