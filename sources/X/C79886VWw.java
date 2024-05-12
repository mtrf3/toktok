package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.VWw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79886VWw implements IMonitor {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    public C79886VWw(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
    public final void monitorInit(String player, Exception e) {
        o.LJIIJ(player, "player");
        o.LJIIJ(e, "e");
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed when init media player, and player is ");
        LIZ.append(player);
        LIZ.append(", error msg is ");
        LIZ.append(e);
        LIZ.append(' ');
        lynxAlphaVideo.LJJI(-8, X1D.LIZIZ(LIZ), this.LIZ.LJLL);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor
    public final void monitor(boolean z, String playerType, int i, int i2, String errorInfo) {
        o.LJIIJ(playerType, "playerType");
        o.LJIIJ(errorInfo, "errorInfo");
        if (!z) {
            LynxAlphaVideo lynxAlphaVideo = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed when monitor: state = ");
            LIZ.append(z);
            LIZ.append(", playerType = ");
            LIZ.append(playerType);
            LIZ.append(", ");
            C1EU.LIZJ(LIZ, "what = ", i, ", extra = ", i2);
            lynxAlphaVideo.LJJI(-9, JBR.LJFF(LIZ, ", errorInfo = ", errorInfo, LIZ), this.LIZ.LJLL);
        }
    }
}
