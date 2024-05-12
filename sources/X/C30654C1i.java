package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRemoveBroadcastForegroundSetting;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;

/* renamed from: X.C1i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30654C1i implements InterfaceC78493UrJ {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        C0NB.LJIIIZ("LiveBroadcastFragment", "onEnterBackground");
        this.LJLIL.LJLJL = true;
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable()) {
            CKO cko = this.LJLIL.LLIIIL;
            if (cko != null) {
                cko.LIZJ(C78857UxB.LJJIIJ(1476788484, "bpea-385"));
            }
            C11000bw c11000bw = this.LJLIL.LLIIL;
            if (c11000bw != null) {
                c11000bw.LIZ(2);
            }
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C0NB.LJIIIZ("LiveBroadcastFragment", "onEnterForeground");
        this.LJLIL.LJLJL = false;
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable() && ((BroadcastTunnelVM) this.LJLIL.LJLLJ.getValue()).LJLIL.getValue() == A9Z.STREAM_ON && C29306Beo.LJIILLIIL((Boolean) this.LJLIL.LJIIL().kv0(PauseLiveChannel.class))) {
            CKO cko = this.LJLIL.LLIIIL;
            if (cko != null) {
                cko.LJIIJJI(C78857UxB.LJJIIJ(1476788233, "bpea-364"));
            }
            C11000bw c11000bw = this.LJLIL.LLIIL;
            if (c11000bw != null) {
                c11000bw.LIZIZ(2);
            }
        }
    }

    public C30654C1i(LiveBroadcastFragment liveBroadcastFragment) {
        this.LJLIL = liveBroadcastFragment;
    }
}
