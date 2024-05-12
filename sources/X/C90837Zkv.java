package X;

import com.byted.cast.common.CastLogger;

/* renamed from: X.Zkv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90837Zkv implements InterfaceC90124ZYq {
    public final /* synthetic */ C90506Zfa LIZ;

    public C90837Zkv(C90506Zfa c90506Zfa) {
        this.LIZ = c90506Zfa;
    }

    @Override // X.InterfaceC90124ZYq
    public final void LIZ(long j, long j2) {
        InterfaceC90503ZfX interfaceC90503ZfX;
        if (this.LIZ.LJJI < 2 && (interfaceC90503ZfX = this.LIZ.LJI) != null) {
            C90780Zk0 c90780Zk0 = (C90780Zk0) interfaceC90503ZfX;
            CastLogger castLogger = c90780Zk0.LIZIZ.LJII;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPositionUpdate duration:");
            LIZ.append(j2);
            LIZ.append(", position:");
            LIZ.append(j);
            castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
            if (c90780Zk0.LIZ != null) {
                c90780Zk0.LIZIZ.LIZIZ.execute(new RunnableC90419ZeB(c90780Zk0, j2, j));
            }
        }
    }
}
