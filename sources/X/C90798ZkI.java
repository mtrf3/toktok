package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.source.ServiceInfo;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.ZkI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90798ZkI implements IBrowseListener {
    public final /* synthetic */ IBrowseListener LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    @Override // com.byted.cast.common.api.IBrowseListener
    public final /* synthetic */ void onBrowseInvalidDevice(int i, List list) {
        ZZR.LIZ(this, i, list);
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final /* synthetic */ void onError(int i, String str) {
        ZZR.LIZIZ(this, i, str);
    }

    public C90798ZkI(C90801ZkL c90801ZkL, IBrowseListener iBrowseListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iBrowseListener;
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final void onBrowse(int i, List<ServiceInfo> list) {
        C90445Zeb c90445Zeb;
        if (!((ConcurrentSkipListSet) this.LIZIZ.LJIL).contains("LeLink") && this.LIZ != null && list != null && (c90445Zeb = this.LIZIZ.LJIJI) != null) {
            List<ServiceInfo> LJ = c90445Zeb.LJ(i, "LeLink", list);
            CastLogger castLogger = this.LIZIZ.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LeLink onBrowse code:");
            LIZ.append(i);
            LIZ.append(", serviceInfoList:");
            LIZ.append(LJ);
            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            this.LIZIZ.LIZJ.sendSourceEvent("ByteCast_Browse_Result", LJ.toString());
            this.LIZ.onBrowse(i, LJ);
            this.LIZIZ.LJFF("LeLink", LJ, true);
        }
    }
}
