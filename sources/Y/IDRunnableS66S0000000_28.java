package Y;

import X.C16880lQ;
import X.C91041ZoD;
import X.C91046ZoI;
import X.C91056ZoS;
import X.X1D;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.response.LocInfoRspData;

/* loaded from: classes24.dex */
public class IDRunnableS66S0000000_28 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                BDLocationConfig.setRequestLocation(true);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public IDRunnableS66S0000000_28(int i) {
        this.$t = i;
    }

    public static final void run$1(IDRunnableS66S0000000_28 iDRunnableS66S0000000_28) {
        if (BDLocationConfig.isOverSeas()) {
            try {
                Logger.d("boot uploadLocation");
                C91046ZoI.LIZIZ();
                return;
            } catch (BDLocationException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("boot uploadLocation exception:");
                LIZ.append(e.getMessage());
                Logger.d(X1D.LIZIZ(LIZ));
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("boot upload Location:");
        LIZ2.append(BDLocationConfig.isReportLocationAtStart());
        Logger.d(X1D.LIZIZ(LIZ2));
        if ("1".equals(LocationUtil.allowUseLocation(true))) {
            LocInfoRspData parseLocInfoRsp = LocationUtil.parseLocInfoRsp(LocationUtil.uploadDeviceStatus("bdlocation_boot_upload_device_info", 0));
            if (parseLocInfoRsp != null && parseLocInfoRsp.isLocate) {
                LocationOption locationOption = new LocationOption();
                locationOption.setUploadSource("bdlocation_boot_upload_location_info");
                locationOption.setMaxCacheTime(BDLocationConfig.getUploadInterval());
                locationOption.setTriggerType(0);
                locationOption.setUpload(true);
                locationOption.setLocationTimeOutMs(30000L);
                locationOption.setLocateType(BDLocationConfig.getLocateType());
                locationOption.setBpeaCert(BDLocationConfig.getBpeaCert("coldstart_cert"));
                locationOption.setBpeaAction("getLocation");
                if (C91041ZoD.LJFF().LJIIJ(locationOption) == null) {
                    C91041ZoD.LJFF().LJIILIIL(new C91056ZoS(), locationOption);
                    return;
                }
                return;
            }
            return;
        }
        LocationUtil.uploadDeviceStatus("bdlocation_boot_upload_device_info", 0);
    }

    public static final void run$2(IDRunnableS66S0000000_28 iDRunnableS66S0000000_28) {
        boolean LIZ;
        try {
            BDLocationConfig.setRequestLocation(true);
        } finally {
            if (LIZ) {
            }
        }
    }
}
