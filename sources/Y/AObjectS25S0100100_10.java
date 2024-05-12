package Y;

import X.C58620MzY;
import X.InterfaceC88472Yns;
import X.NMB;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes11.dex */
public class AObjectS25S0100100_10 implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS25S0100100_10 aObjectS25S0100100_10, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS25S0100100_10.l0;
        long j = aObjectS25S0100100_10.j1;
        C58620MzY c58620MzY = (C58620MzY) obj;
        c58620MzY.LJIIJ(downloadInfo);
        NMB.LIZ.getClass();
        c58620MzY.LJII(NMB.LJ, Long.valueOf(j));
        return null;
    }

    public static final Object invoke$1(AObjectS25S0100100_10 aObjectS25S0100100_10, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS25S0100100_10.l0;
        long j = aObjectS25S0100100_10.j1;
        C58620MzY c58620MzY = (C58620MzY) obj;
        c58620MzY.LJIIJ(downloadInfo);
        NMB.LIZ.getClass();
        c58620MzY.LJII(NMB.LJ, Long.valueOf(j));
        return null;
    }

    public AObjectS25S0100100_10(DownloadInfo downloadInfo, long j, int i) {
        this.$t = i;
        this.l0 = downloadInfo;
        this.j1 = j;
    }
}
