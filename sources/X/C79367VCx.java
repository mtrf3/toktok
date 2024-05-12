package X;

import com.ss.videoarch.strategy.LiveStrategyManager;

/* renamed from: X.VCx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79367VCx implements VDE {
    public final /* synthetic */ LiveStrategyManager LIZ;

    public C79367VCx(LiveStrategyManager liveStrategyManager) {
        this.LIZ = liveStrategyManager;
    }

    public final void LIZ(String str) {
        if (C79346VCc.LIZLLL().LJIILLIIL == 1) {
            this.LIZ.mHandler.post(new VD0(str));
        } else {
            PMX.LIZIZ().LIZIZ.LIZIZ(str, false);
        }
    }
}
