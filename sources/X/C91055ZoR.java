package X;

import Y.IDRunnableS31S0200000_28;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.bdlocation.BDExtraLatLng;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.api.ILocationH3Core;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.callback.LocationUploadCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.entity.bpea.BDEncryptLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitor;
import com.bytedance.bdlocation.network.model.LocationUploadExtra;
import com.bytedance.bdlocation.network.response.LocInfoRspData;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.store.LocationCache;

/* renamed from: X.ZoR, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91055ZoR implements BDLocationCallback {
    public final BDLocationCallback LIZ;
    public final C91051ZoN LIZIZ;
    public final LocationOption LIZJ;
    public Handler LJ;
    public final ILocationH3Core LIZLLL = BDLocationExtrasService.getLocationH3Core();
    public final long LJFF = SystemClock.elapsedRealtime();

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationCallbackServer decideDownGradeLocation locateType:");
        LIZ.append(this.LIZJ.getLocateType());
        Logger.i(X1D.LIZIZ(LIZ));
        this.LIZJ.setLocateType(0);
        this.LIZJ.setDownGradeLocation(true);
        this.LIZIZ.onLocateStop("");
        C91041ZoD.LJFF().LJIILIIL(this.LIZ, new LocationOption(this.LIZJ));
    }

    public final void LJFF(BDLocationException bDLocationException) {
        if (this.LIZJ.isOnceLocation()) {
            LocationMonitor.doDesiredLocationFail(SystemClock.elapsedRealtime() - this.LJFF, bDLocationException, this.LIZJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locationmonitor location total duration is: ");
            LIZ.append(SystemClock.elapsedRealtime() - this.LJFF);
            LIZ.append("ms");
            Logger.i(X1D.LIZIZ(LIZ));
        }
    }

    public final void LJI(BDLocation bDLocation) {
        if (this.LIZJ.isOnceLocation()) {
            LocationMonitor.doDesiredLocationSuccess(SystemClock.elapsedRealtime() - this.LJFF, bDLocation, this.LIZJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locationmonitor location total duration is: ");
            LIZ.append(SystemClock.elapsedRealtime() - this.LJFF);
            LIZ.append("ms");
            Logger.i(X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        Logger.i("LocationCallbackServer onError");
        if (this.LIZJ.isOnceLocation() && this.LIZJ.getLocateType() != 0 && !this.LIZJ.isDownGradeLocation()) {
            LIZLLL();
            return;
        }
        if (this.LJ == null) {
            this.LJ = new Handler(C16880lQ.LLJJJJ());
        }
        this.LJ.post(new IDRunnableS31S0200000_28(bDLocationException, this, 4));
    }

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        if (LocationUtil.isEmpty(bDLocation)) {
            if (this.LIZJ.isOnceLocation() && this.LIZJ.getLocateType() != 0 && !this.LIZJ.isDownGradeLocation()) {
                LIZLLL();
                return;
            } else {
                onError(new BDLocationException("location callback null!", "UNKnown", "26"));
                return;
            }
        }
        synchronized (this) {
            if (!BDLocationConfig.isOverSeas() && BDLocationConfig.isUpload() && BDLocationConfig.isPollingUpload()) {
                Logger.d("register UploadScheduleController");
                C91049ZoL.LIZ().LIZJ();
            }
        }
        boolean z = true;
        if (bDLocation.isCache()) {
            LIZJ(bDLocation, true);
            return;
        }
        if (BDLocationConfig.isOverSeas()) {
            BDExtraLatLng bDExtraLatLng = new BDExtraLatLng();
            bDExtraLatLng.setOriginLocationAccuracyMode(bDLocation.getCurrentLocationAccuracyMode());
            BDLocation bDLocation2 = new BDLocation(bDLocation);
            double latitude = bDLocation2.getLatitude();
            double longitude = bDLocation2.getLongitude();
            bDExtraLatLng.setUnshiftedLatitude(latitude);
            bDExtraLatLng.setUnshiftedLongitude(longitude);
            BDEncryptLocation encryptLatLng = LocationUtil.encryptLatLng(latitude, longitude, this.LIZJ.getBpeaCert());
            if (encryptLatLng != null) {
                bDExtraLatLng.setUnshiftedAndEncryptedLat(encryptLatLng.getLatitude());
                bDExtraLatLng.setUnshiftedAndEncryptedLng(encryptLatLng.getLongitude());
            }
            LocationUtil.turnToH3LatLon(this.LIZLLL, bDLocation2);
            double latitude2 = bDLocation2.getLatitude();
            double longitude2 = bDLocation2.getLongitude();
            bDExtraLatLng.setShiftedLatitude(latitude2);
            bDExtraLatLng.setShiftedLongitude(longitude2);
            BDEncryptLocation encryptLatLng2 = LocationUtil.encryptLatLng(latitude2, longitude2, this.LIZJ.getBpeaCert());
            if (encryptLatLng2 != null) {
                bDExtraLatLng.setShiftedAndEncryptedLat(encryptLatLng2.getLatitude());
                bDExtraLatLng.setShiftedAndEncryptedLng(encryptLatLng2.getLongitude());
            }
            LocationCache.getInstance().setExtraLatLngCache(bDExtraLatLng);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("regularizationLatLon:");
            LIZ.append(this.LIZJ.isEnableH3());
            LIZ.append("--h3:");
            if (this.LIZLLL != null) {
                z = false;
            }
            LIZ.append(z);
            Logger.i(X1D.LIZIZ(LIZ));
            if (BDLocationConfig.isMockEnable()) {
                if (BDLocationConfig.isEnableH3()) {
                    bDLocation = LocationUtil.turnToH3LatLon(bDLocation);
                }
                if (BDLocationConfig.isLatLngEncrypt()) {
                    bDLocation = LocationUtil.encryptLocation(bDLocation, this.LIZJ.getBpeaCert());
                }
                LJ(bDLocation, this.LIZJ, new C91054ZoQ(this, System.currentTimeMillis(), bDLocation));
                return;
            }
            BDLocation shiftIfNeed = LocationUtil.shiftIfNeed(bDLocation, this.LIZJ.getMode());
            if (BDLocationConfig.isLatLngEncrypt()) {
                shiftIfNeed = LocationUtil.encryptLocation(shiftIfNeed, this.LIZJ.getBpeaCert());
            }
            if (this.LIZJ.isUpload() && LocationUtil.needUpload(shiftIfNeed)) {
                if (this.LIZJ.getGeocodeMode() == 0) {
                    LJ(shiftIfNeed, this.LIZJ, null);
                    LIZJ(LocationUtil.toOriginLocation(shiftIfNeed), false);
                    return;
                } else {
                    LJ(shiftIfNeed, this.LIZJ, new C91054ZoQ(this, System.currentTimeMillis(), shiftIfNeed));
                    return;
                }
            }
            LIZJ(LocationUtil.toOriginLocation(shiftIfNeed), false);
            return;
        }
        LocationUtil.convertLocation(bDLocation);
        if (this.LIZJ.isUpload() && LocationUtil.needUpload(bDLocation)) {
            LJ(bDLocation, this.LIZJ, new C91053ZoP(this, System.currentTimeMillis(), bDLocation));
        } else {
            if (bDLocation.getLocInfoRsp() != null) {
                C91040ZoC.LIZ(new LocInfoRspData(bDLocation.getLocInfoRsp()));
                bDLocation.setLocInfoRsp(null);
            }
            LIZJ(bDLocation, false);
        }
    }

    public final void LIZJ(BDLocation bDLocation, boolean z) {
        if ((!BDLocationConfig.isOverSeas() || this.LIZJ.isNeedCache()) && bDLocation != null && ((LocationUtil.isBetterLocation(bDLocation, LocationCache.getInstance().getLocationCache().getLatestLocation()) || LocationUtil.isGoodLocation(bDLocation)) && !BDLocationConfig.isRestrictedModeOn())) {
            LocationCache.getInstance().executeLocationCache(bDLocation);
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        if (BDLocationConfig.isOverSeas()) {
            if (this.LIZJ.getDecryptCert() != null) {
                bDLocation2 = LocationUtil.decryptLocation(bDLocation, this.LIZJ.getDecryptCert());
            }
            LocationUtil.addUnshiftedLatLngIfNeed(bDLocation2, this.LIZJ.isNeedUnshiftedLatLng(), this.LIZJ.getDecryptCert());
        }
        BDLocation transformLocationForLevel = LocationUtil.transformLocationForLevel(bDLocation2, this.LIZJ.getAccuracyLevel());
        if (this.LJ == null) {
            this.LJ = new Handler(C16880lQ.LLJJJJ());
        }
        this.LJ.post(new RunnableC91045ZoH(this, z, transformLocationForLevel));
    }

    public static void LJ(BDLocation bDLocation, LocationOption locationOption, LocationUploadCallback locationUploadCallback) {
        LocationUploadExtra locationUploadExtra = new LocationUploadExtra();
        if (!BDLocationConfig.isOverSeas()) {
            locationUploadExtra.setUploadInterval(locationOption.getUploadInterval());
            locationUploadExtra.setNetworkStatusList(locationOption.getNetworkStatusList());
        }
        if (BDLocationConfig.isMockEnable()) {
            locationUploadExtra.setUploadSource("mock");
        } else {
            locationUploadExtra.setUploadSource(locationOption.getUploadSource());
        }
        locationUploadExtra.setTriggerType(locationOption.getTriggerType());
        locationUploadExtra.setLatestAdminVersion(locationOption.isLatestAdminVersion());
        LocationUtil.startLocateUpload(bDLocation, locationUploadExtra, locationUploadCallback);
    }

    public C91055ZoR(BDLocationCallback bDLocationCallback, LocationOption locationOption, C91051ZoN c91051ZoN, Handler handler) {
        this.LIZ = bDLocationCallback;
        this.LIZIZ = c91051ZoN;
        this.LIZJ = locationOption;
        this.LJ = handler;
    }
}
