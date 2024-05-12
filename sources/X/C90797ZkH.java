package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.source.ServiceInfo;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.ZkH, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90797ZkH implements IBrowseListener {
    public final /* synthetic */ IBrowseListener LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    public C90797ZkH(C90801ZkL c90801ZkL, IBrowseListener iBrowseListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iBrowseListener;
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final void onBrowse(int i, List<ServiceInfo> list) {
        List<ServiceInfo> list2;
        if (((ConcurrentSkipListSet) this.LIZIZ.LJIL).contains("BDDLNA")) {
            return;
        }
        String str = null;
        if (this.LIZ != null) {
            if (list != null) {
                C90801ZkL c90801ZkL = this.LIZIZ;
                C90445Zeb c90445Zeb = c90801ZkL.LJIJI;
                if (c90445Zeb != null) {
                    list2 = c90445Zeb.LJ(i, "BDDLNA", list);
                } else {
                    c90801ZkL.LIZIZ.i("ByteCastSourceImpl", "_DLNA_SEARCH serviceInfoManager is null");
                    list2 = null;
                }
                CastLogger castLogger = this.LIZIZ.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("_DLNA_SEARCH onBrowse code:");
                LIZ.append(i);
                LIZ.append(", serviceInfoList:");
                LIZ.append(list2);
                castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                CastMonitor castMonitor = this.LIZIZ.LIZJ;
                if (list2 != null) {
                    str = list2.toString();
                }
                castMonitor.sendSourceEvent("ByteCast_Browse_Result", str);
                this.LIZ.onBrowse(i, list2);
                this.LIZIZ.LJFF("BDDLNA", list2, true);
                return;
            }
            return;
        }
        this.LIZIZ.LIZIZ.i("ByteCastSourceImpl", "_DLNA_SEARCH browse result listener is null");
        this.LIZIZ.LIZJ.getSourceMonitor().sendDlnaBrowseError(900005, "browse result listener is null", null);
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final void onBrowseInvalidDevice(int i, List<ServiceInfo> list) {
        if (((ConcurrentSkipListSet) this.LIZIZ.LJIL).contains("BDDLNA")) {
            return;
        }
        if (this.LIZ != null) {
            if (list != null) {
                CastLogger castLogger = this.LIZIZ.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("_DLNA_SEARCH onBrowseInvalidDevice onBrowse code:");
                LIZ.append(i);
                LIZ.append(", serviceInfoList:");
                LIZ.append(list);
                castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                this.LIZ.onBrowseInvalidDevice(i, list);
                this.LIZIZ.LJFF("BDDLNA", list, false);
                return;
            }
            return;
        }
        this.LIZIZ.LIZIZ.d("ByteCastSourceImpl", "_DLNA_SEARCH onBrowseInvalidDevice browse result listener is null");
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final void onError(int i, String str) {
        if (((ConcurrentSkipListSet) this.LIZIZ.LJIL).contains("BDDLNA")) {
            return;
        }
        if (this.LIZ != null) {
            CastLogger castLogger = this.LIZIZ.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_DLNA_SEARCH onError onBrowse err:");
            LIZ.append(i);
            LIZ.append(", errMsg:");
            LIZ.append(str);
            castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            this.LIZ.onError(i, str);
            return;
        }
        this.LIZIZ.LIZIZ.d("ByteCastSourceImpl", "_DLNA_SEARCH onError browse result listener is null");
    }
}
