package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;

/* renamed from: X.U3x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76585U3x implements U41 {
    public final /* synthetic */ C76583U3v LIZ;
    public final /* synthetic */ FanTicketRanklistResponse.RanklistUser LIZIZ;

    @Override // X.U41
    public final void LIZ() {
        try {
            if (this.LIZ.LJLJLJ != null && (!r0.isRunning())) {
                Animatable animatable = this.LIZ.LJLJLJ;
                if (animatable != null) {
                    animatable.start();
                }
                this.LIZ.L().postDelayed(new ARunnableS49S0100000_13(this.LIZ, 126), 1240L);
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.U41
    public final void LIZIZ() {
        this.LIZ.L().setVisibility(0);
    }

    @Override // X.U41
    public final FanTicketRanklistResponse.RanklistUser LIZJ() {
        return this.LIZIZ;
    }

    public C76585U3x(C76583U3v c76583U3v, FanTicketRanklistResponse.RanklistUser ranklistUser) {
        this.LIZ = c76583U3v;
        this.LIZIZ = ranklistUser;
    }
}
