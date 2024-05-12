package com.bytedance.bdlocation.store;

import X.C38354F3m;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDExtraLatLng;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.model.LocationResult;
import com.bytedance.bdlocation.network.model.PlaceInfo;
import com.bytedance.bdlocation.utils.json.JsonUtil;

/* loaded from: classes16.dex */
public class LocationCache {
    public static LocationCache sInstance;
    public Context mContext;
    public LocationCacheInfo mLocationCacheInfo;
    public SharedPreferences mSharedPreferences;

    public static LocationCache getInstance() {
        if (sInstance == null) {
            synchronized (LocationCache.class) {
                if (sInstance == null) {
                    sInstance = new LocationCache();
                }
            }
        }
        return sInstance;
    }

    public void clearLocalLocationCache() {
        removeKey("location_cache");
        this.mLocationCacheInfo = null;
    }

    public LocationCacheInfo getLocationCache() {
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = fromCacheInfoJson(getStringValue("location_cache"));
        }
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = new LocationCacheInfo();
        }
        return this.mLocationCacheInfo;
    }

    public long getLocationDenyTime() {
        return getLongValue("LocationDenyTime");
    }

    public String getLocationSettings() {
        return getStringValue("bd_location_settings");
    }

    public String getMockWifiMac() {
        return getStringValue("MockWifiMac");
    }

    public String getPreciseLatLng() {
        return getStringValue("PreciseLatLng");
    }

    public LocationCache() {
        if (this.mContext == null) {
            this.mContext = BDLocationConfig.getContext();
        }
        Context context = this.mContext;
        if (context != null) {
            this.mSharedPreferences = F9J.LIZIZ(context, 0, "BDLocationCache");
        }
    }

    private LocationCacheInfo fromCacheInfoJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (LocationCacheInfo) JsonUtil.sGson.LJI(str, LocationCacheInfo.class);
        } catch (Throwable th) {
            Logger.e("BDLocation", th);
            return null;
        }
    }

    private boolean getBooleanValue(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private void setLocationCache(LocationCacheInfo locationCacheInfo) {
        if (locationCacheInfo == null) {
            return;
        }
        String cacheInfoJson = toCacheInfoJson(locationCacheInfo);
        if (!TextUtils.isEmpty(cacheInfoJson)) {
            setStringValue("location_cache", cacheInfoJson);
            setLocateTime(System.currentTimeMillis());
        }
        this.mLocationCacheInfo = locationCacheInfo;
    }

    private String toCacheInfoJson(LocationCacheInfo locationCacheInfo) {
        if (locationCacheInfo != null) {
            try {
                return JsonUtil.sGson.LJIILL(locationCacheInfo);
            } catch (Throwable th) {
                Logger.e("BDLocation", th);
            }
        }
        return null;
    }

    public void executeLocationCache(BDLocation bDLocation) {
        String address;
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = getLocationCache();
        }
        LocationCacheInfo locationCacheInfo = this.mLocationCacheInfo;
        if (locationCacheInfo != null) {
            int compareLocation = compareLocation(locationCacheInfo.getLatestLocation(), bDLocation);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("executeLocationCache:compareLocation range:");
            LIZ.append(compareLocation);
            Logger.d("BDLocationCache", X1D.LIZIZ(LIZ));
            if (compareLocation != -1) {
                BDLocationConfig.notificationLocationChange(compareLocation, bDLocation);
            }
        } else {
            Logger.d("BDLocationCache", "executeLocationCache:mLocationCacheInfo==null");
            BDLocationConfig.notificationLocationChange(0, bDLocation);
        }
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = new LocationCacheInfo();
        }
        this.mLocationCacheInfo.setLatestLocation(bDLocation);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ConnectManager:setLatestLocation is executed and location is ");
        if (bDLocation == null) {
            address = "";
        } else {
            address = bDLocation.getAddress();
        }
        LIZ2.append(address);
        Logger.d(X1D.LIZIZ(LIZ2));
        setLocationCache(this.mLocationCacheInfo);
    }

    public int getIntValue(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(str, 0);
    }

    public long getLongValue(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(str, 0L);
    }

    public String getStringValue(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(str, "");
    }

    public void removeKey(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.commit();
    }

    public void setExtraLatLngCache(BDExtraLatLng bDExtraLatLng) {
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = getLocationCache();
        }
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = new LocationCacheInfo();
        }
        this.mLocationCacheInfo.setExtraLatLng(bDExtraLatLng);
        setLocationCache(this.mLocationCacheInfo);
    }

    public void setLocateTime(long j) {
        setLongValue("LocateTime", j);
    }

    public void setLocationDenyTime(long j) {
        setLongValue("LocationDenyTime", j);
    }

    public void setMockLocation(BDLocation bDLocation) {
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = getLocationCache();
        }
        if (this.mLocationCacheInfo == null) {
            this.mLocationCacheInfo = new LocationCacheInfo();
        }
        this.mLocationCacheInfo.setMockLocation(bDLocation);
        setLocationCache(this.mLocationCacheInfo);
    }

    public void setMockWifiMac(String str) {
        setStringValue("MockWifiMac", str);
    }

    public void setPreciseLatLng(String str) {
        setStringValue("PreciseLatLng", str);
    }

    private int compareLocation(BDLocation bDLocation, BDLocation bDLocation2) {
        if (bDLocation2 == null || bDLocation2.isEmpty()) {
            return -1;
        }
        if (bDLocation == null || bDLocation.isEmpty()) {
            return 0;
        }
        return locationEqual(bDLocation, bDLocation2);
    }

    private int locationEqual(BDLocation bDLocation, BDLocation bDLocation2) {
        PlaceInfo placeInfo;
        PlaceInfo placeInfo2;
        PlaceInfo placeInfo3;
        LocationResult locationResult = bDLocation.getLocationResult();
        LocationResult locationResult2 = bDLocation2.getLocationResult();
        if (locationResult == null || locationResult2 == null) {
            return -1;
        }
        PlaceInfo placeInfo4 = locationResult.country;
        if (placeInfo4 != null && (placeInfo3 = locationResult2.country) != null && placeInfo4.geoNameID != placeInfo3.geoNameID) {
            return 0;
        }
        PlaceInfo[] placeInfoArr = locationResult.subdivisions;
        PlaceInfo[] placeInfoArr2 = locationResult2.subdivisions;
        if (placeInfoArr != null && placeInfoArr2 != null && placeInfoArr.length > 0 && placeInfoArr2.length > 0) {
            PlaceInfo placeInfo5 = placeInfoArr[0];
            PlaceInfo placeInfo6 = placeInfoArr2[0];
            if (placeInfo5 != null && placeInfo6 != null && placeInfo5.geoNameID != placeInfo6.geoNameID) {
                return 1;
            }
        }
        PlaceInfo placeInfo7 = locationResult.city;
        if (placeInfo7 != null && (placeInfo2 = locationResult2.city) != null && placeInfo7.geoNameID != placeInfo2.geoNameID) {
            return 2;
        }
        PlaceInfo placeInfo8 = locationResult.district;
        if (placeInfo8 != null && (placeInfo = locationResult2.district) != null && placeInfo8.geoNameID != placeInfo.geoNameID) {
            return 3;
        }
        return locationNameEqual(bDLocation, bDLocation2);
    }

    private int locationNameEqual(BDLocation bDLocation, BDLocation bDLocation2) {
        if (!C38354F3m.LIZJ(bDLocation.getCountry(), bDLocation2.getCountry()) && !TextUtils.isEmpty(bDLocation.getCountry()) && !TextUtils.isEmpty(bDLocation2.getCountry())) {
            return 0;
        }
        if (!C38354F3m.LIZJ(bDLocation.getAdministrativeArea(), bDLocation2.getAdministrativeArea()) && !TextUtils.isEmpty(bDLocation.getAdministrativeArea()) && !TextUtils.isEmpty(bDLocation2.getAdministrativeArea())) {
            return 1;
        }
        if (!C38354F3m.LIZJ(bDLocation.getCity(), bDLocation2.getCity()) && !TextUtils.isEmpty(bDLocation.getCity()) && !TextUtils.isEmpty(bDLocation2.getCity())) {
            return 2;
        }
        if (!C38354F3m.LIZJ(bDLocation.getDistrict(), bDLocation2.getDistrict()) && !TextUtils.isEmpty(bDLocation.getDistrict()) && !TextUtils.isEmpty(bDLocation2.getDistrict())) {
            return 3;
        }
        if (!C38354F3m.LIZJ(bDLocation.getSubAdministrativeArea(), bDLocation2.getSubAdministrativeArea()) && !TextUtils.isEmpty(bDLocation.getSubAdministrativeArea()) && !TextUtils.isEmpty(bDLocation2.getSubAdministrativeArea())) {
            return 4;
        }
        return -1;
    }

    private void setBooleanValue(String str, boolean z) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void setIntValue(String str, int i) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void setLocationSettings(Context context, String str) {
        if (context == null) {
            return;
        }
        if (this.mSharedPreferences == null) {
            this.mSharedPreferences = F9J.LIZIZ(context, 0, "BDLocationCache");
        }
        setStringValue("bd_location_settings", str);
    }

    public void setLongValue(String str, long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public void setStringValue(String str, String str2) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
