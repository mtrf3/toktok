package X;

import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import com.ss.android.ugc.aweme.traffic.TrafficMonitorService;
import org.json.JSONObject;

/* renamed from: X.VDz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79395VDz implements VE0 {
    public final /* synthetic */ DownloadServiceImpl LIZ;

    public C79395VDz(DownloadServiceImpl downloadServiceImpl) {
        this.LIZ = downloadServiceImpl;
    }

    @Override // X.VE0
    public final void LIZ(String str, JSONObject jSONObject) {
        C79391VDv.LIZIZ().LIZ(str, jSONObject);
        DownloadServiceImpl downloadServiceImpl = this.LIZ;
        if (downloadServiceImpl.LIZIZ == null) {
            downloadServiceImpl.LIZIZ = TrafficMonitorService.LIZJ();
        }
        ITrafficMonitorApi iTrafficMonitorApi = downloadServiceImpl.LIZIZ;
        if (iTrafficMonitorApi != null) {
            iTrafficMonitorApi.LIZ(str, jSONObject);
        }
    }
}
