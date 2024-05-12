package X;

import Y.IDRunnableS31S0200000_28;
import Y.IDRunnableS3S0300000_28;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.entity.bpea.BPEACertCheckResult;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitor;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.store.LocationCache;
import com.bytedance.bdlocation.store.LocationCacheInfo;
import com.bytedance.bdlocation.thread.AppExecutors;
import com.bytedance.bdlocation.thread.ThreadLooperManager;
import org.json.JSONObject;

/* renamed from: X.ZoD, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91041ZoD {
    public static volatile C91041ZoD LJIIIZ;
    public final LocationCache LIZ;
    public final C91044ZoG LIZIZ;
    public final Handler LIZJ;
    public final Handler LIZLLL;
    public final Looper LJ;
    public ILocate LJFF;
    public final IBPEALocal LJI;
    public boolean LJII = true;
    public final C91051ZoN LJIIIIZZ = new C91051ZoN();

    public static C91041ZoD LJFF() {
        if (LJIIIZ == null) {
            synchronized (C91041ZoD.class) {
                if (LJIIIZ == null) {
                    BDLocationConfig.getContext();
                    LJIIIZ = new C91041ZoD();
                }
            }
        }
        return LJIIIZ;
    }

    public C91041ZoD() {
        Looper locationWorker = ThreadLooperManager.getLocationWorker();
        this.LJ = locationWorker;
        this.LIZJ = new Handler(locationWorker);
        this.LIZLLL = new Handler(C16880lQ.LLJJJJ());
        this.LIZ = LocationCache.getInstance();
        if (C91044ZoG.LIZIZ == null) {
            synchronized (C91041ZoD.class) {
                if (C91044ZoG.LIZIZ == null) {
                    C91044ZoG.LIZIZ = new C91044ZoG();
                }
            }
        }
        this.LIZIZ = C91044ZoG.LIZIZ;
        this.LJI = BDLocationExtrasService.getBPEAManager();
        C91043ZoF.LIZ();
    }

    public static boolean LIZ(BDLocationCallback bDLocationCallback) {
        if (BDLocationConfig.checkInit()) {
            String allowUseLocation = LocationUtil.allowUseLocation(true);
            if ("1".equals(allowUseLocation)) {
                return true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkAbleLocation is not allowed,error code is:");
            LIZ.append(allowUseLocation);
            Logger.i(X1D.LIZIZ(LIZ));
            LJIIJJI(bDLocationCallback, new BDLocationException("Positioning is not allowed", "bdlocation", allowUseLocation));
            return false;
        }
        Logger.i("Must be called after BDLocation initialization!");
        LJIIJJI(bDLocationCallback, new BDLocationException("Must be called after BDLocation initialization", "bdlocation", "80"));
        Logger.i("Must be called after BDLocation initialization!");
        return false;
    }

    public static void LIZLLL(boolean z) {
        if (BDLocationConfig.shouldRequestLocation() || z) {
        } else {
            throw new BDLocationException("Positioning non-compliance", "bdlocation", "54");
        }
    }

    public static BDLocation LJIIIZ(int i) {
        LocationCache locationCache = LJFF().LIZ;
        if (locationCache == null) {
            return null;
        }
        return LocationUtil.transformLocationForLevel(locationCache.getLocationCache().getLatestLocation(), i);
    }

    public final boolean LIZIZ(Object obj) {
        if (obj != null && this.LJI != null) {
            return true;
        }
        return false;
    }

    public final BDLocation LJIIJ(LocationOption locationOption) {
        if (!locationOption.isOnceLocation()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationCache MaxCacheTime： ");
            LIZ.append(locationOption.getMaxCacheTime());
            Logger.i(X1D.LIZIZ(LIZ));
            return null;
        }
        LocationCacheInfo locationCache = this.LIZ.getLocationCache();
        if (locationCache == null) {
            Logger.i("LocationCache cacheInfo is null");
            return null;
        }
        BDLocation latestLocation = locationCache.getLatestLocation();
        if (BDLocationConfig.isOverSeas()) {
            latestLocation = LocationUtil.getMatchedLatLngFromExtra(latestLocation, locationOption.getMode());
        }
        if (latestLocation == null || LocationUtil.isEmpty(latestLocation)) {
            Logger.i("LocationCache cache is null");
            return null;
        }
        if (locationOption.getGeocodeMode() != 0 && !latestLocation.hasAddress()) {
            Logger.i("LocationCache NO_GEOCODE");
            return null;
        }
        if (!LocationUtil.checkCacheTime(latestLocation.getLocationMs(), locationOption.getMaxCacheTime())) {
            Logger.i("LocationCache checkCacheTime is false");
            return null;
        }
        latestLocation.setCache(true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LocationCache: cache is ");
        LIZ2.append(latestLocation.getAddress());
        Logger.i(X1D.LIZIZ(LIZ2));
        return latestLocation;
    }

    public static void LJIIJJI(BDLocationCallback bDLocationCallback, BDLocationException bDLocationException) {
        AppExecutors.getInstance().mainThread().execute(new IDRunnableS31S0200000_28(bDLocationCallback, bDLocationException, 1));
    }

    public static LocationOption LJIIL(JSONObject jSONObject, LocationOption locationOption) {
        if (jSONObject != null) {
            if (locationOption == null) {
                locationOption = new LocationOption();
            }
            locationOption.setUpload(jSONObject.optBoolean("single_is_upload", true));
            long optInt = jSONObject.optInt("cache_time", 300000);
            if (!BDLocationConfig.isOverSeas() && optInt > 0) {
                optInt = C91049ZoL.LIZ().LIZIZ() + 1000;
            }
            locationOption.setMaxCacheTime(optInt);
            if (BDLocationConfig.isOverSeas()) {
                locationOption.setMode(jSONObject.optInt("location_mode", 0));
            } else {
                locationOption.setMode(jSONObject.optInt("location_mode", 2));
            }
            locationOption.setLocationTimeOutMs(jSONObject.optLong("time_out", 30000L));
            locationOption.setTriggerType(jSONObject.optInt("trigger_type", 1));
            locationOption.setInterval(jSONObject.optInt("location_interval", 1000));
            locationOption.setGeocodeMode(jSONObject.optInt("geocode_mode", 1));
            locationOption.setAccuracyLevel(jSONObject.optInt("accuracy_level", 4));
            locationOption.setLocateType(jSONObject.optInt("locate_type", 3));
            locationOption.setEnableH3(jSONObject.optBoolean("enable_h3", true));
            locationOption.setNeedUnshiftedLatLng(jSONObject.optBoolean("need_unshifted_latlng", false));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Location BPEA Params: ");
            LIZ.append(jSONObject.toString());
            Logger.i(X1D.LIZIZ(LIZ));
        }
        return locationOption;
    }

    public final LocationOption LIZJ(BDLocationCallback bDLocationCallback, LocationOption locationOption) {
        try {
            if (LIZIZ(locationOption.getBpeaCert())) {
                BPEACertCheckResult checkAndTranslateCert = this.LJI.checkAndTranslateCert(locationOption.getBpeaCert(), locationOption.getBpeaAction());
                if (checkAndTranslateCert != null) {
                    locationOption = LJIIL(checkAndTranslateCert.getParams(), locationOption);
                }
                locationOption.setUploadSource(this.LJI.getBpeaToken(locationOption.getBpeaCert()));
            } else {
                LIZLLL(locationOption.isCert());
            }
            return locationOption;
        } catch (BDLocationException e) {
            C16880lQ.LLLLIIL(e);
            if (bDLocationCallback != null) {
                bDLocationCallback.onError(e);
                return null;
            }
            return null;
        }
    }

    public final synchronized BDLocation LJII(Object obj, Object obj2) {
        BDLocation bDLocation;
        boolean z;
        int i;
        JSONObject params;
        boolean z2 = true;
        String allowUseLocation = LocationUtil.allowUseLocation(true);
        if ("1".equals(allowUseLocation)) {
            int i2 = 0;
            int i3 = -1;
            if (LIZIZ(obj)) {
                BPEACertCheckResult checkAndTranslateCert = BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(obj, "getLastKnowLocation");
                String bpeaToken = BDLocationExtrasService.getBPEAManager().getBpeaToken(obj);
                if (checkAndTranslateCert != null && (params = checkAndTranslateCert.getParams()) != null) {
                    i3 = params.optInt("accuracyLevel", 0);
                    i = params.optInt("location_mode", 0);
                    params.optBoolean("enable_h3", true);
                    z = params.optBoolean("need_unshifted_latlng", false);
                } else {
                    z = false;
                    i = 0;
                }
                bDLocation = LJIIIZ(i3);
                if (bDLocation != null) {
                    z2 = false;
                }
                LocationMonitor.getLastLocation(z2, i3, bpeaToken);
                i2 = i;
            } else {
                bDLocation = null;
                z = false;
            }
            if (BDLocationConfig.isOverSeas() && bDLocation != null) {
                BDLocation matchedLatLngFromExtra = LocationUtil.getMatchedLatLngFromExtra(bDLocation, i2);
                if (matchedLatLngFromExtra == null) {
                    return null;
                }
                LocationUtil.addUnshiftedLatLngIfNeed(matchedLatLngFromExtra, z, obj2);
                if (obj2 != null) {
                    matchedLatLngFromExtra = LocationUtil.decryptLocation(matchedLatLngFromExtra, obj2);
                }
                bDLocation = LocationUtil.transformLocationForLevel(matchedLatLngFromExtra, i3);
            }
            return bDLocation;
        }
        throw new BDLocationException("Positioning is not allowed", "bdlocation", allowUseLocation);
    }

    public final synchronized BDLocation LJIIIIZZ(Object obj, boolean z) {
        BDLocation bDLocation;
        boolean z2;
        int i;
        JSONObject params;
        String allowUseLocation = LocationUtil.allowUseLocation(z);
        if ("1".equals(allowUseLocation)) {
            int i2 = 0;
            boolean z3 = false;
            int i3 = -1;
            if (LIZIZ(obj)) {
                BPEACertCheckResult checkAndTranslateCert = BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(obj, "getLastKnowLocation");
                String bpeaToken = BDLocationExtrasService.getBPEAManager().getBpeaToken(obj);
                if (checkAndTranslateCert != null && (params = checkAndTranslateCert.getParams()) != null) {
                    i3 = params.optInt("accuracyLevel", 0);
                    i = params.optInt("location_mode", 0);
                    params.optBoolean("enable_h3", true);
                    z2 = params.optBoolean("need_unshifted_latlng", false);
                } else {
                    z2 = false;
                    i = 0;
                }
                bDLocation = LJIIIZ(i3);
                if (bDLocation == null) {
                    z3 = true;
                }
                LocationMonitor.getLastLocation(z3, i3, bpeaToken);
                i2 = i;
            } else {
                bDLocation = null;
                z2 = false;
            }
            if (BDLocationConfig.isOverSeas() && bDLocation != null) {
                BDLocation matchedLatLngFromExtra = LocationUtil.getMatchedLatLngFromExtra(bDLocation, i2);
                if (matchedLatLngFromExtra == null) {
                    return null;
                }
                LocationUtil.addUnshiftedLatLngIfNeed(matchedLatLngFromExtra, z2, null);
                bDLocation = LocationUtil.transformLocationForLevel(matchedLatLngFromExtra, i3);
            }
            return bDLocation;
        }
        throw new BDLocationException("Positioning is not allowed", "bdlocation", allowUseLocation);
    }

    public final void LJIILIIL(BDLocationCallback bDLocationCallback, LocationOption locationOption) {
        if (this.LJII) {
            LocationMonitor.doFirstLocationDuration(SystemClock.elapsedRealtime() - BDLocationConfig.getInitStartTime());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locationmonitor first location duration is: ");
            LIZ.append(SystemClock.elapsedRealtime() - BDLocationConfig.getInitStartTime());
            LIZ.append("ms");
            Logger.i(X1D.LIZIZ(LIZ));
            this.LJII = false;
        }
        this.LIZJ.post(new IDRunnableS3S0300000_28(this, locationOption, bDLocationCallback, 1));
    }

    public static BDLocation LJI(int i, boolean z, boolean z2) {
        LIZLLL(z);
        String allowUseLocation = LocationUtil.allowUseLocation(z2);
        if ("1".equals(allowUseLocation)) {
            return LJIIIZ(i);
        }
        throw new BDLocationException("Positioning is not allowed", "bdlocation", allowUseLocation);
    }

    public final synchronized BdGisResult LJ(double d, double d2, int i, Object obj) {
        if (LIZIZ(obj)) {
            BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(obj, "geocode");
        }
        new LocationOption().setTriggerType(i);
        return LocationUtil.getGeocodeResult(d, d2, i);
    }
}
