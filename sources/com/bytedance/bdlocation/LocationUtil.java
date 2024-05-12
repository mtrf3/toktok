package com.bytedance.bdlocation;

import X.AV1;
import X.C03880Dg;
import X.C16880lQ;
import X.C39399FdD;
import X.C39519Ff9;
import X.C39567Ffv;
import X.C65300Pk0;
import X.C65928Pu8;
import X.E77;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.api.ILocationH3Core;
import com.bytedance.bdlocation.callback.LocationUploadCallback;
import com.bytedance.bdlocation.callback.WifiInfoJsonCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.entity.PoiInfoEntity;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.bpea.BDEncryptLocation;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitor;
import com.bytedance.bdlocation.network.ServerApi;
import com.bytedance.bdlocation.network.model.BaseStation;
import com.bytedance.bdlocation.network.model.BdLBSResult;
import com.bytedance.bdlocation.network.model.DeviceLocation;
import com.bytedance.bdlocation.network.model.DeviceStatus;
import com.bytedance.bdlocation.network.model.GPSResult;
import com.bytedance.bdlocation.network.model.GpsInfo;
import com.bytedance.bdlocation.network.model.LocationInfo;
import com.bytedance.bdlocation.network.model.LocationResult;
import com.bytedance.bdlocation.network.model.LocationUploadExtra;
import com.bytedance.bdlocation.network.model.Place;
import com.bytedance.bdlocation.network.model.PlaceInfo;
import com.bytedance.bdlocation.network.model.RuralInfo;
import com.bytedance.bdlocation.network.response.LocInfoRspData;
import com.bytedance.bdlocation.network.response.LocationResp;
import com.bytedance.bdlocation.permission.PermissionManager;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.store.LocationCache;
import com.bytedance.bdlocation.thread.AppExecutors;
import com.bytedance.bdlocation.utils.CellUtil;
import com.bytedance.bdlocation.utils.CollectionUtil;
import com.bytedance.bdlocation.utils.MockUtil;
import com.bytedance.bdlocation.utils.NetworkUtil;
import com.bytedance.bdlocation.utils.background.BackgroundProvider;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.g;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public final class LocationUtil {
    public static String com_bytedance_bdlocation_LocationUtil_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-6743783744688945379");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, str);
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public static boolean isEmpty(Location location) {
        return location == null;
    }

    public static boolean isAboveAndroid12() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static boolean isLocationEnabled() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ((LocationManager) C16880lQ.LLILL(BDLocationConfig.getContext(), "location")).isLocationEnabled();
            } catch (Exception e) {
                Logger.e("location enable status error", e.getMessage());
                return false;
            }
        }
        try {
            if (Settings.Secure.getInt(BDLocationConfig.getContext().getContentResolver(), "location_mode") == 0) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            return false;
        }
    }

    public static boolean checkVPN() {
        if (BDLocationConfig.getContext() == null) {
            return false;
        }
        return NetworkUtil.checkVPN(BDLocationConfig.getContext());
    }

    public static String getLanguage() {
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return languageTag(locale);
    }

    public static boolean isProxy() {
        if (BDLocationConfig.getContext() == null) {
            return false;
        }
        return NetworkUtil.isWifiProxy(BDLocationConfig.getContext());
    }

    public static boolean needLocate() {
        return PermissionManager.hasLocationPermissions(BDLocationConfig.getContext());
    }

    public static boolean allowUploadLocationInfo(BDLocation bDLocation) {
        if (!BDLocationConfig.isUploadLocation()) {
            return false;
        }
        if (!BDLocationConfig.isPrivacyConfirmed()) {
            Logger.i("The collection of data is allowed after user confirmed the privacy!");
            return false;
        }
        return true;
    }

    public static String allowUseLocation(boolean z) {
        if (z && BDLocationConfig.isBackground()) {
            LocationMonitor.doBackgroundLocationError(BackgroundProvider.mIsInitProvider);
            return "36";
        }
        if (BDLocationConfig.isRestrictedModeOn()) {
            return "64";
        }
        if (!needLocate()) {
            Logger.i("has no location permission, now clear the locationcache");
            LocationCache.getInstance().clearLocalLocationCache();
            return "30";
        }
        if (!isLocationEnabled()) {
            return "2";
        }
        return "1";
    }

    public static boolean checkGeocode(BDLocation bDLocation) {
        if (bDLocation == null || TextUtils.isEmpty(bDLocation.getCountry())) {
            return false;
        }
        if (TextUtils.isEmpty(bDLocation.getAdministrativeArea()) && TextUtils.isEmpty(bDLocation.getSubAdministrativeArea()) && TextUtils.isEmpty(bDLocation.getCity())) {
            return false;
        }
        return true;
    }

    public static boolean checkMockCacheTime(BDLocation bDLocation) {
        if (bDLocation == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bDLocation.getMockDuration() != 0 && currentTimeMillis - bDLocation.getLocationMs() > bDLocation.getMockDuration()) {
            return false;
        }
        return true;
    }

    public static BDPoint convertGCJ02(BDPoint bDPoint) {
        ILocate locate = BDLocationExtrasService.getLocate(BDLocationConfig.getContext(), 1);
        if (locate != null) {
            return locate.convertGCJ02(bDPoint);
        }
        return null;
    }

    public static BDLocation convertLocation(BDLocation bDLocation) {
        if (!"gcj02".equals(bDLocation.getCoordinateSystem())) {
            BDPoint convertGCJ02 = convertGCJ02(new BDPoint(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider()));
            if (convertGCJ02 == null) {
                bDLocation.setLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                bDLocation.setLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            } else {
                double latitude = convertGCJ02.getLatitude();
                double longitude = convertGCJ02.getLongitude();
                if (isChineseChannel(latitude, longitude)) {
                    bDLocation.setCoordinateSystem("gcj02");
                    bDLocation.setLatitude(latitude);
                    bDLocation.setLongitude(longitude);
                }
            }
        }
        return bDLocation;
    }

    public static BaseStation getBaseStation(Context context) {
        BaseStation baseStation = null;
        try {
            if (!BDLocationConfig.isUploadBaseSite() || BDLocationConfig.isOverSeas()) {
                return null;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            baseStation = BDLocationExtrasService.getCollectManager().getBaseStationInfo();
            LocationMonitor.fetchStationDuration(SystemClock.elapsedRealtime() - elapsedRealtime);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locationmonitor basestation duration is: ");
            LIZ.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            LIZ.append("ms");
            Logger.i(X1D.LIZIZ(LIZ));
            return baseStation;
        } catch (Exception e) {
            Logger.e("", e);
            return baseStation;
        }
    }

    public static String getCityCodeForChina(BdLBSResult bdLBSResult) {
        LocationResult locationResult;
        PlaceInfo placeInfo;
        if (bdLBSResult != null && (locationResult = bdLBSResult.location) != null && (placeInfo = locationResult.city) != null) {
            return placeInfo.localID;
        }
        return null;
    }

    public static String getCityCodeForOverSea(BdLBSResult bdLBSResult) {
        LocationResult locationResult;
        PlaceInfo placeInfo;
        if (bdLBSResult != null && (locationResult = bdLBSResult.location) != null && (placeInfo = locationResult.city) != null) {
            return String.valueOf(placeInfo.geoNameID);
        }
        return null;
    }

    public static String getCountryCode(BdLBSResult bdLBSResult) {
        LocationResult locationResult;
        PlaceInfo placeInfo;
        if (bdLBSResult != null && (locationResult = bdLBSResult.location) != null && (placeInfo = locationResult.country) != null) {
            return placeInfo.code;
        }
        return null;
    }

    public static DeviceLocation getDeviceLocation(BDLocation bDLocation) {
        if (BDLocationConfig.isUploadLocation()) {
            DeviceLocation deviceLocation = new DeviceLocation();
            deviceLocation.baseLocation = getBaseStation(BDLocationConfig.getContext());
            if (bDLocation != null) {
                deviceLocation.sysLocation = bdLocationToLocationInfo(bDLocation, BDLocationConfig.isUploadGPS());
                return deviceLocation;
            }
            return deviceLocation;
        }
        return null;
    }

    public static DeviceStatus getDeviceStatus(Context context) {
        Locale locale;
        if (BDLocationConfig.isUploadMccAndSystemRegionInfo()) {
            DeviceStatus deviceStatus = new DeviceStatus();
            deviceStatus.deviceType = 2;
            String simOperator = CellUtil.getSimOperator(context);
            deviceStatus.mccmnc = simOperator;
            deviceStatus.carrierRegion = simOperator;
            deviceStatus.networkSimRegion = simOperator;
            deviceStatus.mccmncRegion = CellUtil.getNetworkOperator(context);
            Locale locale2 = BDLocationConfig.getLocale();
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            String LIZ = C39399FdD.LIZ(locale2);
            String language = locale2.getLanguage();
            String locale3 = locale2.toString();
            if (TextUtils.isEmpty(LIZ) || TextUtils.isEmpty(language)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    locale = Resources.getSystem().getConfiguration().getLocales().get(0);
                } else {
                    locale = Resources.getSystem().getConfiguration().locale;
                }
                if (locale != null) {
                    C39399FdD.LIZIZ.getClass();
                    LIZ = C39567Ffv.LIZIZ(locale);
                    language = locale.getLanguage();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(language);
                    LIZ2.append("_");
                    LIZ2.append(LIZ);
                    locale3 = X1D.LIZIZ(LIZ2);
                }
            }
            deviceStatus.language = language;
            deviceStatus.region = LIZ;
            deviceStatus.locale = locale3;
            deviceStatus.permission = PermissionManager.checkLocationPermissions(context);
            deviceStatus.restrictedMode = BDLocationConfig.getRestrictedMode();
            deviceStatus.isStrictRestrictedMode = BDLocationConfig.isStrictRestrictedMode();
            deviceStatus.locationMode = getLocationMode(context);
            return deviceStatus;
        }
        return null;
    }

    public static BDLocation getIPResult(int i) {
        LocationResult iPResult = ServerApi.getIPResult(i);
        if (iPResult == null) {
            return null;
        }
        return locationResultToBDLocation(null, iPResult);
    }

    public static int getLocationMode(Context context) {
        List<String> providers;
        int i;
        try {
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationUtil getLocationMode exception:");
            LIZ.append(e.getMessage());
            Logger.i(X1D.LIZIZ(LIZ));
        }
        if (!isLocationEnabled()) {
            return 1;
        }
        LocationManager locationManager = (LocationManager) C16880lQ.LLILL(context, "location");
        if (locationManager != null && (providers = locationManager.getProviders(true)) != null && !providers.isEmpty()) {
            if (locationManager.isProviderEnabled("gps")) {
                i = 2;
            } else {
                i = 0;
            }
            if (locationManager.isProviderEnabled("network")) {
                i |= 4;
            }
            if (locationManager.isProviderEnabled("passive")) {
                i |= 8;
            }
            if (PermissionManager.isApproximateLocation(context)) {
                return i | 32;
            }
            return i;
        }
        return 0;
    }

    public static boolean isEnableLocationService(Context context) {
        if (isGpsProviderEnabled(context) || isNetworkProviderEnabled(context)) {
            return true;
        }
        return false;
    }

    public static boolean isGoodLocation(BDLocation bDLocation) {
        if (bDLocation == null || Calendar.getInstance().getTimeInMillis() - bDLocation.getTime() >= 30000 || bDLocation.getAccuracy() > 500.0f || bDLocation.getLocationType() == 3) {
            return false;
        }
        return true;
    }

    public static boolean isGpsProviderEnabled(Context context) {
        LocationManager locationManager = (LocationManager) C16880lQ.LLILL(context, "location");
        if (locationManager != null) {
            try {
                return locationManager.isProviderEnabled("gps");
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isProviderEnabled error:");
                LIZ.append(e.toString());
                Logger.i(X1D.LIZIZ(LIZ));
                return false;
            }
        }
        return false;
    }

    public static boolean isNeedAddress(LocationOption locationOption) {
        if (locationOption != null && !locationOption.isUpload()) {
            return false;
        }
        return true;
    }

    public static boolean isNetworkProviderEnabled(Context context) {
        LocationManager locationManager = (LocationManager) C16880lQ.LLILL(context, "location");
        if (locationManager != null) {
            return locationManager.isProviderEnabled("network");
        }
        return false;
    }

    public static String languageTag(Locale locale) {
        if (locale == null) {
            return "";
        }
        String language = locale.getLanguage();
        C39399FdD.LIZIZ.getClass();
        String LIZIZ = C39567Ffv.LIZIZ(locale);
        if (!TextUtils.isEmpty(LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(language);
            LIZ.append("-");
            LIZ.append(LIZIZ);
            return X1D.LIZIZ(LIZ);
        }
        return language;
    }

    public static BDAddress locationToAddress2(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        BDAddress bDAddress = new BDAddress(Locale.getDefault());
        bDAddress.setSpeed(bDLocation.getSpeed());
        bDAddress.setAccuracy(bDLocation.getAccuracy());
        bDAddress.setLatitude(bDLocation.getLatitude());
        bDAddress.setLongitude(bDLocation.getLongitude());
        bDAddress.setAdminArea(bDLocation.getAdministrativeArea());
        bDAddress.setSubAdminArea(bDLocation.getSubAdministrativeArea());
        bDAddress.setCountryName(bDLocation.getCountry());
        bDAddress.setLocality(bDLocation.getCity());
        bDAddress.setSubLocality(bDLocation.getDistrict());
        bDAddress.setAddressLine(0, bDLocation.getAddress());
        return bDAddress;
    }

    public static void markFineLocation(BDLocation bDLocation) {
        if (bDLocation == null) {
            return;
        }
        bDLocation.setCurrentLocationAccuracyMode(2);
        bDLocation.setDesensitizationType(0);
    }

    public static void markH3CoarseLocation(BDLocation bDLocation) {
        markCoarseLocation(bDLocation, 2);
    }

    public static void markSystemCoarseLocation(BDLocation bDLocation) {
        markCoarseLocation(bDLocation, 1);
    }

    public static boolean needUpload(BDLocation bDLocation) {
        if (bDLocation != null && (!"ByteLocation".equals(bDLocation.getLocationSDKName()) || 1 == bDLocation.getLocationType())) {
            return true;
        }
        return false;
    }

    public static LocInfoRspData parseLocInfoRsp(LocationResp locationResp) {
        String locationResp2;
        if (locationResp == null || locationResp.resultCode != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationUtil parseLocInfoRsp error:");
            if (locationResp == null) {
                locationResp2 = "";
            } else {
                locationResp2 = locationResp.toString();
            }
            LIZ.append(locationResp2);
            Logger.i(X1D.LIZIZ(LIZ));
            return null;
        }
        try {
            return (LocInfoRspData) JsonUtil.sGson.LJI(ServerApi.unpackFingerprint(locationResp.data), LocInfoRspData.class);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseLocInfoRsp exception:");
            LIZ2.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static BDLocation toOriginLocation(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation.getProvider(), bDLocation.getLocationSDKName());
        bDLocation2.setLatitude(bDLocation.getLatitude());
        bDLocation2.setLongitude(bDLocation.getLongitude());
        bDLocation2.setEncryptedLat(bDLocation.getEncryptedLat());
        bDLocation2.setEncryptedLng(bDLocation.getEncryptedLng());
        bDLocation2.setSpeed(bDLocation.getSpeed());
        bDLocation2.setBearing(bDLocation.getBearing());
        bDLocation2.setAccuracy(bDLocation.getAccuracy());
        bDLocation2.setTime(System.currentTimeMillis());
        bDLocation2.setLocationMs(bDLocation.getLocationMs());
        bDLocation2.setDisableLocationShift(bDLocation.getDisableLocationShift());
        bDLocation2.setLocationMode(bDLocation.getLocationMode());
        bDLocation2.setCurrentLocationAccuracyMode(bDLocation.getCurrentLocationAccuracyMode());
        bDLocation2.setDesensitizationType(bDLocation.getDesensitizationType());
        return bDLocation2;
    }

    public static int transformLocateMethod(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("GPSLocation")) {
                return 1;
            }
            if (str.equals("WiFi")) {
                return 2;
            }
            if (str.equals("bss")) {
                return 3;
            }
            if (str.equals("IPLocation")) {
                return 6;
            }
            if (str.equals("MCC")) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public static BDLocation turnToH3LatLon(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        BDExtraLatLng extraLatLng = LocationCache.getInstance().getLocationCache().getExtraLatLng();
        if (extraLatLng != null) {
            bDLocation.setLatitude(extraLatLng.getShiftedLatitude());
            bDLocation.setLongitude(extraLatLng.getShiftedLongitude());
            bDLocation.setDisableLocationShift(0);
        }
        return bDLocation;
    }

    public static String INVOKESTATIC_com_bytedance_bdlocation_LocationUtil_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = com_bytedance_bdlocation_LocationUtil_android_provider_Settings$Secure_getString(contentResolver, str);
            }
            return E77.LIZ;
        }
        return com_bytedance_bdlocation_LocationUtil_android_provider_Settings$Secure_getString(contentResolver, str);
    }

    public static GpsInfo bdLocationToGpsInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        GpsInfo gpsInfo = new GpsInfo();
        gpsInfo.country = bDLocation.getCountry();
        gpsInfo.district = bDLocation.getDistrict();
        gpsInfo.province = bDLocation.getAdministrativeArea();
        gpsInfo.city = bDLocation.getCity();
        gpsInfo.address = bDLocation.getAddress();
        if (z) {
            gpsInfo.latitude = bDLocation.getLatitude();
            gpsInfo.longitude = bDLocation.getLongitude();
        }
        gpsInfo.locationTime = bDLocation.getTime() / 1000;
        gpsInfo.source = bDLocation.getLocationType();
        gpsInfo.provider = bDLocation.getLocationSDKName();
        gpsInfo.coordinateSystem = bDLocation.getCoordinateSystem();
        return gpsInfo;
    }

    public static LocationInfo bdLocationToLocationInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.country = bDLocation.getCountry();
        locationInfo.district = bDLocation.getDistrict();
        locationInfo.province = bDLocation.getAdministrativeArea();
        locationInfo.city = bDLocation.getCity();
        locationInfo.address = bDLocation.getAddress();
        locationInfo.street = bDLocation.getStreet();
        locationInfo.streetNum = bDLocation.getStreetNum();
        locationInfo.buildingId = bDLocation.getBuildingId();
        locationInfo.floor = bDLocation.getFloor();
        if (z) {
            locationInfo.latitude = bDLocation.getLatitude();
            locationInfo.longitude = bDLocation.getLongitude();
        }
        locationInfo.encryptedLat = bDLocation.getEncryptedLat();
        locationInfo.encryptedLng = bDLocation.getEncryptedLng();
        locationInfo.timestamp = bDLocation.getTime() / 1000;
        locationInfo.locateType = bDLocation.getLocationType();
        locationInfo.provider = bDLocation.getLocationSDKName();
        locationInfo.accuracy = bDLocation.getAccuracy();
        locationInfo.coordinateSystem = bDLocation.getCoordinateSystem();
        locationInfo.latlngPrecision = bDLocation.getLatLngPrecision();
        locationInfo.disableLocationShift = bDLocation.getDisableLocationShift();
        locationInfo.locationAccuracyMode = bDLocation.getCurrentLocationAccuracyMode();
        locationInfo.desensitizationType = bDLocation.getDesensitizationType();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bearing", bDLocation.getBearing());
            jSONObject.put("speed", bDLocation.getSpeed());
            jSONObject.put("trusted_level", bDLocation.getTrustedLevel());
            jSONObject.put("location_detail", bDLocation.getLocationDetail());
            jSONObject.put("satellites", bDLocation.getSatellites());
            jSONObject.put("provider", bDLocation.getProvider());
        } catch (Throwable unused) {
        }
        locationInfo.extra = jSONObject.toString();
        return locationInfo;
    }

    public static boolean checkCacheTime(long j, long j2) {
        if (j == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationCache currentTimeMillis:");
        LIZ.append(currentTimeMillis);
        LIZ.append("-locationTime:");
        LIZ.append(j);
        LIZ.append("-cacheTimeMS:");
        LIZ.append(j2);
        Logger.i(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LocationCache locationTime:");
        long j3 = currentTimeMillis - j;
        LIZ2.append(j3);
        LIZ2.append("-cacheTimeMS:");
        LIZ2.append(j2);
        Logger.i(X1D.LIZIZ(LIZ2));
        if (Math.abs(j3) >= j2 + 5000) {
            return false;
        }
        return true;
    }

    public static BDLocation composeGeocodeLocation(BDLocation bDLocation, BDLocation bDLocation2) {
        BDLocation bDLocation3 = new BDLocation(bDLocation);
        bDLocation3.setAddress(bDLocation2.getAddress());
        bDLocation3.setCity(bDLocation2.getCity());
        bDLocation3.setAdministrativeArea(bDLocation2.getAdministrativeArea());
        bDLocation3.setSubAdministrativeArea(bDLocation2.getSubAdministrativeArea());
        bDLocation3.setProvider(bDLocation2.getProvider());
        bDLocation3.setDistrict(bDLocation2.getDistrict());
        bDLocation3.setCountry(bDLocation2.getCountry());
        bDLocation3.setCityCode(bDLocation2.getCityCode());
        bDLocation3.setTown(bDLocation2.getTown());
        bDLocation3.setStreet(bDLocation2.getStreet());
        bDLocation3.setStreetNum(bDLocation2.getStreetNum());
        bDLocation3.setFloor(bDLocation2.getFloor());
        bDLocation3.setThirdPartLocation(bDLocation2.getThirdPartLocation());
        bDLocation3.setLocationSDKName(bDLocation2.getLocationSDKName());
        bDLocation3.setPoi(bDLocation2.getPoi());
        bDLocation3.setGCJ02(bDLocation2.getGCJ02());
        bDLocation3.setCountryCode(bDLocation2.getCountryCode());
        bDLocation3.setCountryLocalID(bDLocation2.getCountryLocalID());
        bDLocation3.setLocalID(bDLocation2.getLocalID());
        bDLocation3.setDistrictLocalID(bDLocation2.getDistrictLocalID());
        bDLocation3.setGeoNameID(bDLocation2.getGeoNameID());
        bDLocation3.setBdLBSResult(bDLocation2.getBdLBSResult());
        bDLocation3.setLocationResult(bDLocation2.getLocationResult());
        bDLocation3.setGeocodeSDKName(bDLocation2.getGeocodeSDKName());
        bDLocation3.setAoi(bDLocation2.getAoi());
        bDLocation3.setIsDisputed(bDLocation2.getIsDisputed());
        bDLocation3.setIsCompliance(bDLocation2.getIsCompliance());
        bDLocation3.setCountryId(bDLocation2.getCountryId());
        bDLocation3.setSubdivisionId(bDLocation2.getSubdivisionId());
        bDLocation3.setCityId(bDLocation2.getCityId());
        bDLocation3.setDistrictId(bDLocation2.getDistrictId());
        bDLocation3.setTownId(bDLocation2.getTownId());
        bDLocation3.setCountryAsciName(bDLocation2.getCountryAsciName());
        bDLocation3.setSubdivisionAsciName(bDLocation2.getSubdivisionAsciName());
        bDLocation3.setCityAsciName(bDLocation2.getCityAsciName());
        bDLocation3.setDistrictAsciName(bDLocation2.getDistrictAsciName());
        bDLocation3.setTownAsciName(bDLocation2.getTownAsciName());
        return bDLocation3;
    }

    public static BDLocation decryptLocation(BDLocation bDLocation, Object obj) {
        IBPEALocal bPEAManager;
        String bpeaToken;
        if (bDLocation == null) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bPEAManager = BDLocationExtrasService.getBPEAManager();
            bpeaToken = bPEAManager.getBpeaToken(obj);
        } catch (BDLocationException e) {
            LocationMonitor.decryptLocation(SystemClock.elapsedRealtime() - elapsedRealtime, false, e.getCode(), e.getMessage(), "", BDLocationConfig.isLatLngEncrypt(), bDLocation.getAccuracyLevel(), bDLocation.getEncryptedLat().length(), bDLocation.getEncryptedLng().length());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationUtil decrypt error: ");
            LIZ.append(e.getMessage());
            Logger.i(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
        }
        if (!TextUtils.isEmpty(bDLocation.getEncryptedLat()) && !TextUtils.isEmpty(bDLocation.getEncryptedLng()) && obj != null) {
            BDDecryptLocation decryptLocation = bPEAManager.decryptLocation(bDLocation.getEncryptedLat(), bDLocation.getEncryptedLng(), obj);
            LocationMonitor.decryptLocation(SystemClock.elapsedRealtime() - elapsedRealtime, true, CardStruct.IStatusCode.DEFAULT, "success", bpeaToken, BDLocationConfig.isLatLngEncrypt(), bDLocation.getAccuracyLevel(), bDLocation.getEncryptedLat().length(), bDLocation.getEncryptedLng().length());
            if (decryptLocation != null) {
                bDLocation2.setLatitude(decryptLocation.getLatitude());
                bDLocation2.setLongitude(decryptLocation.getLongitude());
                bDLocation2.setEncryptedLat(null);
                bDLocation2.setEncryptedLng(null);
            }
            return bDLocation2;
        }
        LocationMonitor.decryptLocation(SystemClock.elapsedRealtime() - elapsedRealtime, false, "86", "encrypted latlng is null", bpeaToken, BDLocationConfig.isLatLngEncrypt(), bDLocation.getAccuracyLevel(), 0, 0);
        return bDLocation2;
    }

    public static BDLocation encryptLocation(BDLocation bDLocation, Object obj) {
        if (bDLocation == null) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        if (bDLocation.getLatitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && bDLocation.getLongitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return bDLocation2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            BDEncryptLocation encryptLocation = BDLocationExtrasService.getBPEAManager().encryptLocation(bDLocation.getLatitude(), bDLocation.getLongitude(), obj);
            LocationMonitor.encryptLocation(SystemClock.elapsedRealtime() - elapsedRealtime, true, CardStruct.IStatusCode.DEFAULT, "success");
            if (encryptLocation != null) {
                bDLocation2.setEncryptedLat(encryptLocation.getLatitude());
                bDLocation2.setEncryptedLng(encryptLocation.getLongitude());
                bDLocation2.setLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                bDLocation2.setLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            }
            return bDLocation2;
        } catch (BDLocationException e) {
            LocationMonitor.encryptLocation(SystemClock.elapsedRealtime() - elapsedRealtime, false, e.getCode(), e.getMessage());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationUtil encrypt error: ");
            LIZ.append(e.getMessage());
            Logger.i(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return bDLocation2;
        }
    }

    public static BDLocation geocode(Context context, BDLocation bDLocation) {
        if (Geocoder.isPresent()) {
            Locale locale = BDLocationConfig.getLocale();
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return addressesToBDLocation(new Geocoder(context, locale).getFromLocation(bDLocation.getLatitude(), bDLocation.getLongitude(), 10), bDLocation, "Android");
        }
        return null;
    }

    public static BDLocation getMatchedLatLngFromExtra(BDLocation bDLocation, int i) {
        BDExtraLatLng extraLatLng;
        boolean z;
        boolean z2;
        boolean z3;
        if (bDLocation == null || (extraLatLng = LocationCache.getInstance().getLocationCache().getExtraLatLng()) == null) {
            return null;
        }
        if (i == 2 || i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (extraLatLng.getOriginLocationAccuracyMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isAboveAndroid12 = isAboveAndroid12();
        boolean isEnableCoarseOpt = BDLocationConfig.isEnableCoarseOpt();
        if (isAboveAndroid12 && isEnableCoarseOpt) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && !z2) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        bDLocation2.setCache(true);
        bDLocation2.setLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        bDLocation2.setLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        bDLocation2.setEncryptedLat(null);
        bDLocation2.setEncryptedLng(null);
        bDLocation2.setUnshiftedLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        bDLocation2.setUnshiftedLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        bDLocation2.setUnshiftedAndEncryptedLat(null);
        bDLocation2.setUnshiftedAndEncryptedLng(null);
        if (!z ? z2 || !z3 : !z2) {
            if (BDLocationConfig.isLatLngEncrypt()) {
                bDLocation2.setEncryptedLat(extraLatLng.getShiftedAndEncryptedLat());
                bDLocation2.setEncryptedLng(extraLatLng.getShiftedAndEncryptedLng());
            } else {
                bDLocation2.setLatitude(extraLatLng.getShiftedLatitude());
                bDLocation2.setLongitude(extraLatLng.getShiftedLongitude());
            }
            markH3CoarseLocation(bDLocation2);
        } else {
            if (BDLocationConfig.isLatLngEncrypt()) {
                bDLocation2.setEncryptedLat(extraLatLng.getUnshiftedAndEncryptedLat());
                bDLocation2.setEncryptedLng(extraLatLng.getUnshiftedAndEncryptedLng());
            } else {
                bDLocation2.setLatitude(extraLatLng.getUnshiftedLatitude());
                bDLocation2.setLongitude(extraLatLng.getUnshiftedLongitude());
            }
            if (z && z2) {
                markFineLocation(bDLocation2);
            } else {
                markSystemCoarseLocation(bDLocation2);
            }
        }
        return bDLocation2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isBetterLocation(android.location.Location r9, android.location.Location r10) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            r7 = 1
            if (r10 != 0) goto L8
            return r7
        L8:
            long r5 = r9.getTime()
            long r0 = r10.getTime()
            long r5 = r5 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r4 = 1
        L19:
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r3 = 1
        L21:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            r5 = 1
        L28:
            if (r4 == 0) goto L31
            return r7
        L2b:
            r5 = 0
            goto L28
        L2d:
            r3 = 0
            goto L21
        L2f:
            r4 = 0
            goto L19
        L31:
            if (r3 == 0) goto L34
            return r8
        L34:
            float r1 = r9.getAccuracy()
            float r0 = r10.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            if (r1 <= 0) goto L56
            r4 = 1
        L41:
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto L5a
            r2 = 1
        L47:
            java.lang.String r1 = r9.getProvider()
            java.lang.String r0 = r10.getProvider()
            boolean r0 = isSameProvider(r1, r0)
            if (r3 == 0) goto L5c
            return r7
        L56:
            r4 = 0
            if (r1 >= 0) goto L41
            r3 = 1
        L5a:
            r2 = 0
            goto L47
        L5c:
            if (r5 == 0) goto L66
            if (r4 != 0) goto L61
            return r7
        L61:
            if (r2 != 0) goto L66
            if (r0 == 0) goto L66
            return r7
        L66:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.LocationUtil.isBetterLocation(android.location.Location, android.location.Location):boolean");
    }

    public static boolean isChineseChannel(double d, double d2) {
        ILocate locate = BDLocationExtrasService.getLocate(BDLocationConfig.getContext(), 1);
        if (locate == null) {
            return true;
        }
        return locate.isAMapDataAvailable(d, d2);
    }

    public static boolean isSameProvider(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    public static BDLocation locationResultToBDLocation(BDLocation bDLocation, LocationResult locationResult) {
        BDLocation bDLocation2;
        if (locationResult == null) {
            return null;
        }
        if (bDLocation == null) {
            bDLocation2 = new BDLocation("bd_geocode", "unKnown");
            bDLocation2.setGeocodeSDKName("LBS");
        } else {
            bDLocation2 = new BDLocation(bDLocation);
        }
        PlaceInfo placeInfo = locationResult.country;
        if (placeInfo != null) {
            bDLocation2.setCountry(placeInfo.name);
            bDLocation2.setCountryCode(placeInfo.code);
            bDLocation2.setCountryId(placeInfo.geoNameID);
            bDLocation2.setCountryAsciName(placeInfo.asciName);
            bDLocation2.setCountryLocalID(placeInfo.localID);
        }
        Place place = locationResult.place;
        if (place != null && !CollectionUtil.isEmpty(place.addressLines)) {
            bDLocation2.setAddress((String) ListProtector.get(place.addressLines, 0));
        }
        PlaceInfo[] placeInfoArr = locationResult.subdivisions;
        if (placeInfoArr != null && placeInfoArr.length > 0) {
            bDLocation2.setAdministrativeArea(placeInfoArr[0].name);
            bDLocation2.setSubdivisionId(placeInfoArr[0].geoNameID);
            bDLocation2.setSubdivisionAsciName(placeInfoArr[0].asciName);
        }
        if (placeInfoArr != null && placeInfoArr.length > 1) {
            bDLocation2.setSubAdministrativeArea(placeInfoArr[1].name);
        }
        PlaceInfo placeInfo2 = locationResult.city;
        if (placeInfo2 != null) {
            bDLocation2.setCity(placeInfo2.name);
            bDLocation2.setLocalID(placeInfo2.localID);
            bDLocation2.setGeoNameID(String.valueOf(placeInfo2.geoNameID));
            bDLocation2.setCityId(placeInfo2.geoNameID);
            bDLocation2.setCityAsciName(placeInfo2.asciName);
        }
        PlaceInfo placeInfo3 = locationResult.district;
        if (placeInfo3 != null) {
            bDLocation2.setDistrict(placeInfo3.name);
            bDLocation2.setDistrictId(placeInfo3.geoNameID);
            bDLocation2.setDistrictAsciName(placeInfo3.asciName);
            bDLocation2.setDistrictLocalID(placeInfo3.localID);
        }
        RuralInfo ruralInfo = locationResult.town;
        if (ruralInfo != null) {
            bDLocation2.setTown(ruralInfo.name);
            bDLocation2.setTownId(ruralInfo.geoNameID);
            bDLocation2.setTownAsciName(ruralInfo.asciName);
        }
        RuralInfo ruralInfo2 = locationResult.village;
        if (ruralInfo2 != null) {
            bDLocation2.setVillage(ruralInfo2.name);
            bDLocation2.setVillageId(ruralInfo2.geoNameID);
            bDLocation2.setVillageAsciName(ruralInfo2.asciName);
        }
        GPSResult gPSResult = locationResult.gps;
        if (gPSResult != null) {
            double d = gPSResult.latitude;
            if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (!BDLocationConfig.isLatLngEncrypt() || !BDLocationConfig.isOverSeas())) {
                bDLocation2.setLatitude(gPSResult.latitude);
                bDLocation2.setLongitude(gPSResult.longitude);
                bDLocation2.setCoordinateSystem(gPSResult.coordinateSystem);
            }
        }
        List<PoiInfoEntity> list = locationResult.poiList;
        if (list != null) {
            Collections.sort(list);
            bDLocation2.setPoiEntities(locationResult.poiList);
        }
        List<PoiInfoEntity> list2 = locationResult.aoiList;
        if (list2 != null) {
            Collections.sort(list2);
            bDLocation2.setAoiEntities(locationResult.aoiList);
        }
        if (locationResult.isDisputed && placeInfo == null && placeInfoArr == null && placeInfo2 == null && placeInfo3 == null && place == null) {
            bDLocation2 = new BDLocation("", "");
        }
        bDLocation2.setIsDisputed(locationResult.isDisputed);
        bDLocation2.setIsCompliance(true);
        bDLocation2.setLocationResult(locationResult);
        if (bDLocation.getLocationSDKName().equals("ByteLocation") && !TextUtils.isEmpty(locationResult.timestamp)) {
            bDLocation2.setTime(CastLongProtector.valueOf(locationResult.timestamp).longValue() * 1000);
        }
        return bDLocation2;
    }

    public static void markCoarseLocation(BDLocation bDLocation, int i) {
        if (bDLocation == null) {
            return;
        }
        bDLocation.setCurrentLocationAccuracyMode(1);
        bDLocation.setDesensitizationType(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (r2 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.bdlocation.BDLocation shiftIfNeed(com.bytedance.bdlocation.BDLocation r5, int r6) {
        /*
            r4 = 0
            r0 = 1
            r1 = 2
            if (r6 == r1) goto L7
            if (r6 != r0) goto L36
        L7:
            r3 = 1
        L8:
            int r0 = r5.getCurrentLocationAccuracyMode()
            if (r0 != r1) goto L34
            r2 = 1
        Lf:
            boolean r1 = isAboveAndroid12()
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isEnableCoarseOpt()
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L1c
            r4 = 1
        L1c:
            if (r3 == 0) goto L24
            if (r2 == 0) goto L26
            markFineLocation(r5)
        L23:
            return r5
        L24:
            if (r2 != 0) goto L2c
        L26:
            if (r4 == 0) goto L2c
            markSystemCoarseLocation(r5)
            goto L23
        L2c:
            com.bytedance.bdlocation.BDLocation r5 = turnToH3LatLon(r5)
            markH3CoarseLocation(r5)
            goto L23
        L34:
            r2 = 0
            goto Lf
        L36:
            r3 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.LocationUtil.shiftIfNeed(com.bytedance.bdlocation.BDLocation, int):com.bytedance.bdlocation.BDLocation");
    }

    public static void startGetLocate(final LocationUploadExtra locationUploadExtra, final LocationUploadCallback locationUploadCallback) {
        if (BDLocationConfig.isUpload() && !BDLocationConfig.isRestrictedModeOn()) {
            AppExecutors.getInstance().networkIO().execute(new Runnable() { // from class: X.Zo3
                @Override // java.lang.Runnable
                public final void run() {
                    LocationUtil.getLocationInfo(null, LocationUploadExtra.this, locationUploadCallback);
                }
            });
        } else {
            locationUploadCallback.onError(new BDLocationException("upload is not allowed", "ByteLocation", "74").getMessage());
        }
    }

    public static BDLocation transformLocationForLevel(BDLocation bDLocation, int i) {
        if (bDLocation == null) {
            return null;
        }
        if (i == 4) {
            return bDLocation;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        bDLocation2.setAccuracyLevel(i);
        return bDLocation2;
    }

    public static BDLocation turnToH3LatLon(ILocationH3Core iLocationH3Core, BDLocation bDLocation) {
        if (iLocationH3Core != null && bDLocation != null) {
            try {
                long geoToH3 = iLocationH3Core.geoToH3(bDLocation.getLatitude(), bDLocation.getLongitude(), BDLocationConfig.getH3Resolution());
                Logger.i("regularizationLatLon hex");
                List<Long> kRing = iLocationH3Core.kRing(geoToH3, BDLocationConfig.getH3Distance());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("regularizationLatLon kRingsResult size:");
                LIZ.append(kRing.size());
                Logger.i(X1D.LIZIZ(LIZ));
                if (kRing.size() > 1) {
                    int nextInt = new Random().nextInt(kRing.size() - 1) + 1;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("regularizationLatLon index:");
                    LIZ2.append(nextInt);
                    Logger.i(X1D.LIZIZ(LIZ2));
                    Pair<Double, Double> h3ToGeo = iLocationH3Core.h3ToGeo(((Long) ListProtector.get(kRing, nextInt)).longValue());
                    if (h3ToGeo != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("regularizationLatLon geoCoord:");
                        LIZ3.append(h3ToGeo);
                        Logger.i(X1D.LIZIZ(LIZ3));
                        bDLocation.setLatitude(((Double) h3ToGeo.first).doubleValue());
                        bDLocation.setLongitude(((Double) h3ToGeo.second).doubleValue());
                        bDLocation.setDisableLocationShift(0);
                        return bDLocation;
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("regularizationLatLon geoCoord:");
                LIZ4.append(e.getMessage());
                Logger.i(X1D.LIZIZ(LIZ4));
            }
        }
        return bDLocation;
    }

    public static LocationResp uploadDeviceStatus(String str, int i) {
        if (BDLocationConfig.isUploadMccAndSystemRegionInfo() && !BDLocationConfig.isRestrictedModeOn()) {
            try {
                return ServerApi.uploadMccAndSystemRegionInfo(BDLocationConfig.getContext(), str, i);
            } catch (Exception unused) {
                Logger.d("upload device status error");
                return null;
            }
        }
        return null;
    }

    public static BDLocation getMatchedLatLngFromExtra(BDLocation bDLocation, boolean z) {
        boolean z2;
        if (bDLocation == null) {
            return null;
        }
        BDExtraLatLng extraLatLng = LocationCache.getInstance().getLocationCache().getExtraLatLng();
        if (bDLocation.getDisableLocationShift() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (extraLatLng == null && z != z2) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        if (extraLatLng != null) {
            if (BDLocationConfig.isLatLngEncrypt()) {
                if (z) {
                    bDLocation2.setEncryptedLat(extraLatLng.getShiftedAndEncryptedLat());
                    bDLocation2.setEncryptedLng(extraLatLng.getShiftedAndEncryptedLng());
                } else {
                    bDLocation2.setEncryptedLat(extraLatLng.getUnshiftedAndEncryptedLat());
                    bDLocation2.setEncryptedLng(extraLatLng.getUnshiftedAndEncryptedLng());
                }
            } else if (z) {
                bDLocation2.setLatitude(extraLatLng.getShiftedLatitude());
                bDLocation2.setLongitude(extraLatLng.getShiftedLongitude());
            } else {
                bDLocation2.setLatitude(extraLatLng.getUnshiftedLatitude());
                bDLocation2.setLongitude(extraLatLng.getUnshiftedLongitude());
            }
        }
        return bDLocation2;
    }

    public static void addUnshiftedLatLngIfNeed(BDLocation bDLocation, boolean z, Object obj) {
        BDExtraLatLng extraLatLng;
        if (bDLocation != null && (extraLatLng = LocationCache.getInstance().getLocationCache().getExtraLatLng()) != null && z) {
            if (!BDLocationConfig.isLatLngEncrypt() || obj != null) {
                bDLocation.setUnshiftedLatitude(extraLatLng.getUnshiftedLatitude());
                bDLocation.setUnshiftedLongitude(extraLatLng.getUnshiftedLongitude());
            } else {
                bDLocation.setUnshiftedAndEncryptedLat(extraLatLng.getUnshiftedAndEncryptedLat());
                bDLocation.setUnshiftedAndEncryptedLng(extraLatLng.getUnshiftedAndEncryptedLng());
            }
        }
    }

    public static BDLocation addressesToBDLocation(List<Address> list, BDLocation bDLocation, String str) {
        if (CollectionUtil.isEmpty(list)) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        bDLocation2.setGeocodeSDKName(str);
        Iterator<Address> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Address next = it.next();
            if (next.hasLatitude() && next.hasLongitude()) {
                bDLocation2.setCountry(next.getCountryName());
                bDLocation2.setAdministrativeArea(next.getAdminArea());
                bDLocation2.setSubAdministrativeArea(next.getSubAdminArea());
                bDLocation2.setCity(next.getLocality());
                bDLocation2.setDistrict(next.getSubLocality());
                bDLocation2.setStreet(next.getThoroughfare());
                bDLocation2.setStreetNum(next.getSubThoroughfare());
                bDLocation2.setAddress(next.getAddressLine(0));
                bDLocation2.setPoi(next.getFeatureName());
                break;
            }
        }
        return bDLocation2;
    }

    public static BDEncryptLocation encryptLatLng(double d, double d2, Object obj) {
        BDEncryptLocation bDEncryptLocation = new BDEncryptLocation(null, null);
        try {
            bDEncryptLocation = BDLocationExtrasService.getBPEAManager().encryptLocation(d, d2, obj);
            return bDEncryptLocation;
        } catch (BDLocationException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationUtil encrypt error: ");
            LIZ.append(e.getMessage());
            Logger.i(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return bDEncryptLocation;
        }
    }

    public static BdGisResult getGeocodeResult(double d, double d2, int i) {
        if (BDLocationConfig.isRestrictedModeOn()) {
            return null;
        }
        try {
            BdGisResult gisResult = ServerApi.getGisResult(d, d2, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GisResult:");
            LIZ.append(gisResult);
            Logger.d(X1D.LIZIZ(LIZ));
            return gisResult;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getGeocodeResult exception:");
            LIZ2.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ2));
            throw new BDLocationException("get_geocode_result_error", "bdlocation", "78");
        }
    }

    public static void getLocationInfo(BDLocation bDLocation, final LocationUploadExtra locationUploadExtra, final LocationUploadCallback locationUploadCallback) {
        final DeviceStatus deviceStatus = getDeviceStatus(BDLocationConfig.getContext());
        final DeviceLocation deviceLocation = getDeviceLocation(bDLocation);
        System.currentTimeMillis();
        if (BDLocationConfig.isMockEnable()) {
            if (!TextUtils.isEmpty(BDLocationConfig.getMockWifiMac())) {
                deviceLocation.wifiInfo = MockUtil.getMockWifiJson();
            }
            startLocation(deviceLocation, deviceStatus, locationUploadExtra, locationUploadCallback);
            return;
        }
        BDLocationExtrasService.getCollectManager().getWifiInfoJsonAsync(new WifiInfoJsonCallback() { // from class: com.bytedance.bdlocation.LocationUtil.1
            @Override // com.bytedance.bdlocation.callback.WifiInfoJsonCallback
            public void onFailed(BDLocationException bDLocationException) {
                LocationUtil.startLocation(DeviceLocation.this, deviceStatus, locationUploadExtra, locationUploadCallback);
            }

            @Override // com.bytedance.bdlocation.callback.WifiInfoJsonCallback
            public void onWifiInfoJson(g gVar) {
                if (gVar != null) {
                    DeviceLocation.this.wifiInfo = gVar;
                }
                LocationUtil.startLocation(DeviceLocation.this, deviceStatus, locationUploadExtra, locationUploadCallback);
            }
        });
    }

    public static /* synthetic */ void lambda$startLocateUpload$0(BDLocation bDLocation, LocationUploadExtra locationUploadExtra, LocationUploadCallback locationUploadCallback) {
        try {
            if (allowUploadLocationInfo(bDLocation)) {
                getLocationInfo(bDLocation, locationUploadExtra, locationUploadCallback);
            }
        } catch (Exception e) {
            Logger.e("startLocateUpload", e);
            if (locationUploadCallback != null) {
                locationUploadCallback.onError(e.getMessage());
            }
        }
    }

    public static void startLocateUpload(final BDLocation bDLocation, final LocationUploadExtra locationUploadExtra, final LocationUploadCallback locationUploadCallback) {
        if (BDLocationConfig.isUpload() && !BDLocationConfig.isRestrictedModeOn()) {
            AppExecutors.getInstance().networkIO().execute(new Runnable() { // from class: X.Zo4
                @Override // java.lang.Runnable
                public final void run() {
                    LocationUtil.lambda$startLocateUpload$0(BDLocation.this, locationUploadExtra, locationUploadCallback);
                }
            });
        } else {
            locationUploadCallback.onError(new BDLocationException("upload is not allowed", bDLocation.getLocationSDKName(), "74").getMessage());
        }
    }

    public static void startLocation(DeviceLocation deviceLocation, DeviceStatus deviceStatus, LocationUploadExtra locationUploadExtra, LocationUploadCallback locationUploadCallback) {
        boolean z;
        LocationResp uploadLocationInfo = ServerApi.uploadLocationInfo(deviceLocation, deviceStatus, locationUploadExtra);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationUtil startLocation locationResp:");
        if (uploadLocationInfo == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        Logger.i(X1D.LIZIZ(LIZ));
        if (locationUploadCallback != null) {
            if (uploadLocationInfo != null && uploadLocationInfo.resultCode == 0) {
                locationUploadCallback.onSuccess(uploadLocationInfo);
            } else {
                locationUploadCallback.onError("location response error");
            }
        }
    }
}
