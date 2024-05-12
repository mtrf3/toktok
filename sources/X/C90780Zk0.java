package X;

import Y.IDRunnableS1S1200000_24;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.chromecast.source.impl.ChromeCastSourceWrapper;

/* renamed from: X.Zk0, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90780Zk0 implements InterfaceC90503ZfX {
    public final /* synthetic */ IPlayerListener LIZ;
    public final /* synthetic */ ChromeCastSourceWrapper LIZIZ;

    public C90780Zk0(ChromeCastSourceWrapper chromeCastSourceWrapper, IPlayerListener iPlayerListener) {
        this.LIZIZ = chromeCastSourceWrapper;
        this.LIZ = iPlayerListener;
    }

    public final void LIZ(ServiceInfo serviceInfo, String str) {
        CastLogger castLogger = this.LIZIZ.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDramaId, serviceInfo: ");
        LIZ.append(serviceInfo);
        LIZ.append(", id: ");
        LIZ.append(str);
        castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
        if (this.LIZ != null) {
            this.LIZIZ.LIZIZ.execute(new IDRunnableS1S1200000_24(serviceInfo, str, this, 1));
        }
    }

    public final void LIZIZ(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        CastLogger castLogger = this.LIZIZ.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDramaList, serviceInfo: ");
        LIZ.append(serviceInfo);
        LIZ.append(", list: ");
        LIZ.append(dramaBeanArr);
        castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
        if (this.LIZ != null) {
            this.LIZIZ.LIZIZ.execute(new RunnableC90418ZeA(this, serviceInfo, dramaBeanArr));
        }
    }
}
