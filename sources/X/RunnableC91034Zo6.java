package X;

import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;

/* renamed from: X.Zo6, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public class RunnableC91034Zo6 implements Runnable {
    public long LJLIL;
    public volatile boolean LJLILLLLZI = true;
    public long LJLJI;
    public final /* synthetic */ C91049ZoL LJLJJI;

    public final void LIZ() {
        if (BDLocationConfig.isRestrictedModeOn() || BDLocationConfig.isBackground()) {
            Logger.i("BDLocation_LocationScheduler_pollupload:ControllerTask is return");
            Logger.d("BDLocation_LocationScheduler_pollupload:onCancel");
            this.LJLILLLLZI = true;
            this.LJLJJI.LIZJ.removeCallbacksAndMessages(null);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDLocation_LocationScheduler_pollupload:ControllerTask intervalMs:");
        LIZ.append(this.LJLJI);
        LIZ.append("---currentTimeMs:");
        LIZ.append(currentTimeMillis);
        LIZ.append("---lastScheduleTimeMs:");
        LIZ.append(this.LJLIL);
        Logger.d(X1D.LIZIZ(LIZ));
        if (currentTimeMillis - this.LJLIL < this.LJLJI) {
            Logger.d("BDLocation_LocationScheduler_pollupload:ControllerTask is exception");
            this.LJLJJI.LIZJ.removeCallbacksAndMessages(null);
        }
        if (!this.LJLILLLLZI) {
            synchronized (this) {
                if (System.currentTimeMillis() - C91049ZoL.LJFF < 60000) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BDLocation_UploadScheduleController_pollupload lastUploadTime:");
                    LIZ2.append(C91049ZoL.LJFF);
                    Logger.d(X1D.LIZIZ(LIZ2));
                } else {
                    C91049ZoL.LJFF = System.currentTimeMillis();
                    if (!BDLocationConfig.isUpload() || !BDLocationConfig.isPollingUpload() || BDLocationConfig.isRestrictedModeOn()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(":---isPollingUpload:");
                        LIZ3.append(BDLocationConfig.isPollingUpload());
                        Logger.d(X1D.LIZIZ(LIZ3));
                    } else {
                        try {
                            if (!BDLocationConfig.isUploadLocation()) {
                                Logger.d("BDLocation_UploadScheduleController_pollupload:uploadDeviceStatus1");
                                LocationUtil.uploadDeviceStatus("bdlocation_upload_internal_polling", 0);
                            } else if (LocationUtil.isLocationEnabled() && LocationUtil.needLocate()) {
                                Logger.d("BDLocation_UploadScheduleController_pollupload:getLocationAsync");
                                C91046ZoI.LIZ("bdlocation_upload_internal_polling", 1, 0L, BDLocationConfig.getBpeaCert("poll_cert"), true);
                            } else {
                                Logger.d("BDLocation_UploadScheduleController_pollupload:uploadDeviceStatus2 no Permission");
                                LocationUtil.uploadDeviceStatus("bdlocation_upload_internal_polling", 0);
                            }
                        } catch (Exception e) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("BDLocation_UploadScheduleController_pollupload:");
                            LIZ4.append(e.getMessage());
                            Logger.e(X1D.LIZIZ(LIZ4));
                        }
                    }
                }
            }
            this.LJLIL = currentTimeMillis;
        }
        this.LJLILLLLZI = false;
        long LIZIZ = this.LJLJJI.LIZIZ();
        this.LJLJI = LIZIZ;
        this.LJLJJI.LIZJ.postDelayed(this, LIZIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC91034Zo6(C91049ZoL c91049ZoL) {
        this.LJLJJI = c91049ZoL;
        this.LJLJI = c91049ZoL.LIZIZ();
    }
}
