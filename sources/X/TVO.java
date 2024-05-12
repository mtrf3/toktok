package X;

import Y.AObjectS42S0201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TVO implements F6T {
    public final /* synthetic */ TVS LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZJ;

    @Override // X.F6T
    public final void onFailed() {
        this.LIZJ.invoke(-1);
    }

    @Override // X.F6T
    public final void onSuccess() {
        TVS tvs = this.LIZ;
        tvs.LIZ = Integer.MAX_VALUE;
        tvs.LIZIZ(0, "link_control_widget", System.currentTimeMillis() - this.LIZIZ, "", "", true);
        this.LIZJ.invoke(0);
    }

    public TVO(TVS tvs, long j, AObjectS42S0201000_13 aObjectS42S0201000_13) {
        this.LIZ = tvs;
        this.LIZIZ = j;
        this.LIZJ = aObjectS42S0201000_13;
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        this.LIZ.LIZ = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPluginInstallError: reason = ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        TYP.LIZ("game_link_aab", msg, false);
        this.LIZ.LIZIZ(1, "link_control_widget", System.currentTimeMillis() - this.LIZIZ, String.valueOf(i), "", true);
    }
}
