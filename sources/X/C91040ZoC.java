package X;

import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.entity.NetworkUploadInfo;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.response.LocInfoRspData;
import com.bytedance.bdlocation.store.LocationCache;
import java.util.List;

/* renamed from: X.ZoC, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91040ZoC {
    public static void LIZ(LocInfoRspData locInfoRspData) {
        try {
            C91049ZoL.LJFF = System.currentTimeMillis();
            long j = locInfoRspData.nextPollingUploadInterval * 1000;
            if (j == 0) {
                j = BDLocationConfig.getUploadInterval();
            }
            C91049ZoL LIZ = C91049ZoL.LIZ();
            if (LIZ.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("BDLocation_UploadScheduleController_pollupload resetPollUploadSchedule:");
                LIZ2.append(LIZ.LIZIZ());
                Logger.d(X1D.LIZIZ(LIZ2));
                LIZ.LIZLLL(j);
                LIZ.LIZLLL = j;
            }
            LIZIZ(locInfoRspData);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            Logger.e("The exception was occurred when the response data was convert to LocInfoRspData ");
        }
    }

    public static void LIZIZ(LocInfoRspData locInfoRspData) {
        RunnableC91033Zo5 runnableC91033Zo5;
        C91048ZoK LIZIZ = C91048ZoK.LIZIZ();
        LIZIZ.getClass();
        Logger.d("NetworkStatusCollectManagers clearCollectData");
        List<NetworkUploadInfo> list = LIZIZ.LIZ;
        if (list != null && list.size() > 0) {
            LIZIZ.LIZ.clear();
        }
        Logger.d("NetworkStatusCollectManagers removeCacheNetworkStatus");
        LocationCache.getInstance().removeKey("network_status_cache");
        if (locInfoRspData.isNetworkUpload == 1) {
            C91048ZoK LIZIZ2 = C91048ZoK.LIZIZ();
            long j = locInfoRspData.networkUploadInterval;
            if (j < 60) {
                LIZIZ2.getClass();
            } else {
                LIZIZ2.LIZJ = j * 1000;
            }
            C91048ZoK LIZIZ3 = C91048ZoK.LIZIZ();
            LIZIZ3.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkStatusCollectManagers NetworkCollectTask startCollect:isStartTask-");
            LIZ.append(LIZIZ3.LIZLLL);
            Logger.d(X1D.LIZIZ(LIZ));
            if (LIZIZ3.LIZLLL || (runnableC91033Zo5 = LIZIZ3.LJI) == null) {
                return;
            }
            synchronized (runnableC91033Zo5) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("NetworkStatusCollectManagers NetworkCollectTask start: isRun:");
                LIZ2.append(runnableC91033Zo5.LJLIL);
                Logger.d(X1D.LIZIZ(LIZ2));
                if (!runnableC91033Zo5.LJLIL) {
                    runnableC91033Zo5.LJLIL = true;
                    runnableC91033Zo5.run();
                }
            }
            LIZIZ3.LIZLLL = true;
            return;
        }
        C91048ZoK.LIZIZ().LJ();
    }
}
