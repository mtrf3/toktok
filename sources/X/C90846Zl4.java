package X;

import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.network.NetworkBehavior;
import com.byted.cast.common.network.NetworkBehaviorData;

/* renamed from: X.Zl4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90846Zl4 implements NetworkBehavior.NetworkBehaviorListener {
    public final /* synthetic */ C90547ZgF LIZ;

    public C90846Zl4(C90547ZgF c90547ZgF) {
        this.LIZ = c90547ZgF;
    }

    @Override // com.byted.cast.common.network.NetworkBehavior.NetworkBehaviorListener
    public final void onReady(NetworkBehaviorData networkBehaviorData) {
        if (networkBehaviorData == null) {
            Logger.w("ByteCastSinkImpl", "networkBehaviorData is null");
            return;
        }
        this.LIZ.LJJIJIIJI = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aid:");
        LIZ.append(networkBehaviorData.getAppId());
        LIZ.append(",did:");
        LIZ.append(networkBehaviorData.getDeviceId());
        Monitor.sendSinkEvent("bytecast_sink_network_changed", X1D.LIZIZ(LIZ));
        C90845Zl3 c90845Zl3 = new C90845Zl3(this);
        this.LIZ.LIZIZ();
        this.LIZ.LJII(networkBehaviorData.getContext(), networkBehaviorData.getConfig(), c90845Zl3, true);
    }
}
