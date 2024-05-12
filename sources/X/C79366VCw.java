package X;

import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;

/* renamed from: X.VCw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79366VCw implements VDA {
    public final /* synthetic */ LiveStrategyManager LIZ;

    public C79366VCw(LiveStrategyManager liveStrategyManager) {
        this.LIZ = liveStrategyManager;
    }

    @Override // X.VDA
    public final void LIZ(String str) {
        if (str != null) {
            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1) {
                DnsOptimizer.LJFF().LJIIJJI(str);
                return;
            }
            return;
        }
        this.LIZ.updateGlobalSettings();
    }
}
