package X;

import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.network.NetworkBehavior;
import com.byted.cast.common.network.NetworkBehaviorData;
import java.util.ArrayList;

/* renamed from: X.ZkC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90792ZkC implements NetworkBehavior.NetworkBehaviorListener {
    public final /* synthetic */ C90801ZkL LIZ;

    public C90792ZkC(C90801ZkL c90801ZkL) {
        this.LIZ = c90801ZkL;
    }

    @Override // com.byted.cast.common.network.NetworkBehavior.NetworkBehaviorListener
    public final void onReady(NetworkBehaviorData networkBehaviorData) {
        if (networkBehaviorData == null) {
            this.LIZ.LIZIZ.w("ByteCastSourceImpl", "networkBehaviorData is null");
            return;
        }
        this.LIZ.stopBrowse();
        IBrowseListener iBrowseListener = this.LIZ.LJJJLZIJ;
        if (iBrowseListener != null) {
            iBrowseListener.onBrowse(2, new ArrayList());
        }
        C90801ZkL c90801ZkL = this.LIZ;
        c90801ZkL.LJJ = false;
        C90791ZkB c90791ZkB = new C90791ZkB(this);
        c90801ZkL.LIZ();
        this.LIZ.LIZLLL(networkBehaviorData.getContext(), networkBehaviorData.getConfig(), c90791ZkB, true);
    }
}
