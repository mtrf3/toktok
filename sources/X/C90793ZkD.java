package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.source.ServiceInfo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.ZkD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90793ZkD implements IBrowseListener {
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

    public C90793ZkD(C90801ZkL c90801ZkL, IBrowseListener iBrowseListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iBrowseListener;
    }

    @Override // com.byted.cast.common.api.IBrowseListener
    public final void onBrowse(int i, List<ServiceInfo> list) {
        List<ServiceInfo> list2;
        if (!((ConcurrentSkipListSet) this.LIZIZ.LJIL).contains("ByteLink") && this.LIZ != null && list != null) {
            CastLogger castLogger = this.LIZIZ.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bytelink onBrowse:");
            LIZ.append(Arrays.toString(list.toArray()));
            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            C90801ZkL c90801ZkL = this.LIZIZ;
            C90445Zeb c90445Zeb = c90801ZkL.LJIJI;
            String str = null;
            if (c90445Zeb != null) {
                list2 = c90445Zeb.LJ(i, "ByteLink", list);
            } else {
                c90801ZkL.LIZIZ.i("ByteCastSourceImpl", "bytelinkSource serviceInfoManager is null");
                list2 = null;
            }
            CastLogger castLogger2 = this.LIZIZ.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ByteLink onBrowse code:");
            LIZ2.append(i);
            LIZ2.append(", serviceInfoList:");
            LIZ2.append(list2);
            castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
            CastMonitor castMonitor = this.LIZIZ.LIZJ;
            if (list2 != null) {
                str = list2.toString();
            }
            castMonitor.sendSourceEvent("ByteCast_Browse_Result", str);
            this.LIZ.onBrowse(i, list2);
            this.LIZIZ.LJFF("ByteLink_v2_deprecated", list2, true);
        }
    }
}
