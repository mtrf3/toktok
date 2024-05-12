package com.bytedance.bdlocation;

import X.AnonymousClass073;
import X.C65232Piu;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.PoiInfoEntity;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.network.model.BdLBSResult;
import com.bytedance.bdlocation.network.model.LocationResult;
import com.bytedance.bdlocation.network.response.LocInfoRspData;
import java.util.List;

/* loaded from: classes17.dex */
public class BDLocation extends Location {
    public int currentLocationAccuracyMode;
    public int desensitizationType;
    public BDLocationException exception;
    public transient boolean isCache;
    public int mAccuracyLevel;
    public String mAdCode;
    public String mAddress;
    public String mAdministrativeArea;
    public String mAoi;
    public List<PoiInfoEntity> mAoiEntities;
    public BdLBSResult mBdLBSResult;
    public float mBearing;
    public String mBuildingId;
    public String mCity;
    public String mCityAsciName;
    public String mCityCode;
    public long mCityId;
    public String mCoordinateSystem;
    public String mCountry;
    public String mCountryAsciName;
    public String mCountryCode;
    public long mCountryId;
    public String mCountryLocalID;
    public int mDisableLocationShift;
    public String mDistrict;
    public String mDistrictAsciName;
    public long mDistrictId;
    public String mDistrictLocalID;
    public String mEncryptedLat;
    public String mEncryptedLng;
    public String mFloor;
    public BDPoint mGCJ02;
    public String mGeoNameID;
    public String mGeocodeSDKName;
    public boolean mIsCompliance;
    public boolean mIsDisputed;
    public int mLatLngPrecision;
    public double mLatitude;
    public LocInfoRspData mLocInfoRsp;
    public String mLocalID;
    public String mLocationDetail;
    public BDLocationException mLocationException;
    public int mLocationMode;
    public long mLocationMs;
    public LocationResult mLocationResult;
    public String mLocationSDKName;
    public int mLocationType;
    public double mLongitude;
    public long mMockDuration;
    public String mPoi;
    public List<PoiInfoEntity> mPoiEntities;
    public int mSatellites;
    public float mSpeed;
    public String mStreet;
    public String mStreetNum;
    public String mSubAdministrativeArea;
    public String mSubdivisionAsciName;
    public long mSubdivisionId;
    public transient Location mThirdPartLocation;
    public String mTown;
    public String mTownAsciName;
    public long mTownId;
    public int mTrustedLevel;
    public String mUnshiftedAndEncryptedLat;
    public String mUnshiftedAndEncryptedLng;
    public double mUnshiftedLatitude;
    public double mUnshiftedLongitude;
    public String mVillage;
    public String mVillageAsciName;
    public long mVillageId;

    public boolean hasAddress() {
        if (!TextUtils.isEmpty(this.mAddress) || !TextUtils.isEmpty(this.mCountry) || !TextUtils.isEmpty(this.mAdministrativeArea) || !TextUtils.isEmpty(this.mSubAdministrativeArea) || !TextUtils.isEmpty(this.mCity) || !TextUtils.isEmpty(this.mDistrict)) {
            return true;
        }
        return false;
    }

    public boolean hasLBSResult() {
        if (this.mBdLBSResult != null) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (Double.compare(this.mLatitude, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) == 0 && Double.compare(this.mLongitude, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) == 0 && TextUtils.isEmpty(this.mAddress) && TextUtils.isEmpty(this.mCountry) && TextUtils.isEmpty(this.mAdministrativeArea) && TextUtils.isEmpty(this.mSubAdministrativeArea) && TextUtils.isEmpty(this.mCity) && TextUtils.isEmpty(this.mDistrict)) {
            return true;
        }
        return false;
    }

    @Override // android.location.Location
    public String toString() {
        String str;
        try {
            str = this.mThirdPartLocation.toString();
        } catch (Exception unused) {
            str = "error toString()";
        }
        StringBuilder sb = new StringBuilder("BDLocation{mAddress='");
        sb.append(this.mAddress);
        sb.append("', mCountry='");
        sb.append(this.mCountry);
        sb.append("', mAdministrativeArea='");
        sb.append(this.mAdministrativeArea);
        sb.append("', mSubAdministrativeArea='");
        sb.append(this.mSubAdministrativeArea);
        sb.append("', mCity='");
        sb.append(this.mCity);
        sb.append("', mDistrict='");
        sb.append(this.mDistrict);
        sb.append("', mTown='");
        sb.append(this.mTown);
        sb.append("', mVillage='");
        sb.append(this.mVillage);
        sb.append("', mCityCode='");
        sb.append(this.mCityCode);
        sb.append("', mAdCode='");
        sb.append(this.mAdCode);
        sb.append("', mLatitude=");
        sb.append(this.mLatitude);
        sb.append(", mLongitude=");
        sb.append(this.mLongitude);
        sb.append(", mEncryptedLat=");
        sb.append(this.mEncryptedLat);
        sb.append(", mEncryptedLng=");
        sb.append(this.mEncryptedLng);
        sb.append(", mUnshiftedLatitude=");
        sb.append(this.mUnshiftedLatitude);
        sb.append(", mUnshiftedLongitude=");
        sb.append(this.mUnshiftedLongitude);
        sb.append(", mUnshiftedAndEncryptedLat=");
        sb.append(this.mUnshiftedAndEncryptedLat);
        sb.append(", mUnshiftedAndEncryptedLng=");
        sb.append(this.mUnshiftedAndEncryptedLng);
        sb.append(", mDisableLocationShift=");
        sb.append(this.mDisableLocationShift);
        sb.append(", mLocationMode=");
        sb.append(this.mLocationMode);
        sb.append(", mStreet='");
        sb.append(this.mStreet);
        sb.append("', mStreetNum='");
        sb.append(this.mStreetNum);
        sb.append("', mFloor='");
        sb.append(this.mFloor);
        sb.append("', mLocationMs=");
        C65232Piu.LIZLLL(sb, this.mLocationMs, ", mThirdPartLocation=", str);
        sb.append(", mLocationSDKName='");
        sb.append(this.mLocationSDKName);
        sb.append("', mPoi='");
        sb.append(this.mPoi);
        sb.append("', mGCJ02=");
        sb.append(this.mGCJ02);
        sb.append(", mLocationType=");
        sb.append(this.mLocationType);
        sb.append(", isCache=");
        sb.append(this.isCache);
        sb.append(", mCountryCode=");
        sb.append(this.mCountryCode);
        sb.append(", mCountryLocalID='");
        sb.append(this.mCountryLocalID);
        sb.append("', mLocalID='");
        sb.append(this.mLocalID);
        sb.append("', mDistrictLocalID='");
        sb.append(this.mDistrictLocalID);
        sb.append("', mGeoNameID='");
        sb.append(this.mGeoNameID);
        sb.append("', mSubdivisionId='");
        sb.append(this.mSubdivisionId);
        sb.append("', mBdLBSResult=");
        sb.append(this.mBdLBSResult);
        sb.append(", mLocationResult=");
        sb.append(this.mLocationResult);
        sb.append(", mGeocodeSDKName='");
        sb.append(this.mGeocodeSDKName);
        sb.append("', mAoi='");
        sb.append(this.mAoi);
        sb.append("', mIsDisputed='");
        sb.append(this.mIsDisputed);
        sb.append("', mIsCompliance='");
        sb.append(this.mIsCompliance);
        sb.append("', mCoordinateSystem='");
        sb.append(this.mCoordinateSystem);
        sb.append("', mBearing='");
        sb.append(this.mBearing);
        sb.append("', mSpeed='");
        sb.append(this.mSpeed);
        sb.append("', mTrustedLevel='");
        sb.append(this.mTrustedLevel);
        sb.append("', mLocationDetail='");
        sb.append(this.mLocationDetail);
        sb.append("', mSatellites='");
        sb.append(this.mSatellites);
        sb.append("', mPoiEntities='");
        sb.append(this.mPoiEntities);
        sb.append("', mAoiEntities='");
        sb.append(this.mAoiEntities);
        sb.append("', mBuildingId='");
        return AnonymousClass073.LIZIZ(sb, this.mBuildingId, "'}");
    }

    public int getAccuracyLevel() {
        return this.mAccuracyLevel;
    }

    public String getAdCode() {
        return this.mAdCode;
    }

    public String getAddress() {
        return this.mAddress;
    }

    public String getAdministrativeArea() {
        return this.mAdministrativeArea;
    }

    public String getAoi() {
        return this.mAoi;
    }

    public List<PoiInfoEntity> getAoiEntities() {
        return this.mAoiEntities;
    }

    public BdLBSResult getBdLBSResult() {
        return this.mBdLBSResult;
    }

    @Override // android.location.Location
    public float getBearing() {
        return this.mBearing;
    }

    public String getBuildingId() {
        return this.mBuildingId;
    }

    public String getCity() {
        return this.mCity;
    }

    public String getCityAsciName() {
        return this.mCityAsciName;
    }

    public String getCityCode() {
        return this.mCityCode;
    }

    public long getCityId() {
        return this.mCityId;
    }

    public String getCoordinateSystem() {
        return this.mCoordinateSystem;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public String getCountryAsciName() {
        return this.mCountryAsciName;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public long getCountryId() {
        return this.mCountryId;
    }

    public String getCountryLocalID() {
        return this.mCountryLocalID;
    }

    public int getCurrentLocationAccuracyMode() {
        return this.currentLocationAccuracyMode;
    }

    public int getDesensitizationType() {
        return this.desensitizationType;
    }

    public int getDisableLocationShift() {
        return this.mDisableLocationShift;
    }

    public String getDistrict() {
        return this.mDistrict;
    }

    public String getDistrictAsciName() {
        return this.mDistrictAsciName;
    }

    public long getDistrictId() {
        return this.mDistrictId;
    }

    public String getDistrictLocalID() {
        return this.mDistrictLocalID;
    }

    public String getEncryptedLat() {
        return this.mEncryptedLat;
    }

    public String getEncryptedLng() {
        return this.mEncryptedLng;
    }

    public BDLocationException getException() {
        return this.exception;
    }

    public String getFloor() {
        return this.mFloor;
    }

    public BDPoint getGCJ02() {
        return this.mGCJ02;
    }

    public String getGeoNameID() {
        return this.mGeoNameID;
    }

    public String getGeocodeSDKName() {
        return this.mGeocodeSDKName;
    }

    public boolean getIsCompliance() {
        return this.mIsCompliance;
    }

    public boolean getIsDisputed() {
        return this.mIsDisputed;
    }

    public int getLatLngPrecision() {
        return this.mLatLngPrecision;
    }

    @Override // android.location.Location
    public double getLatitude() {
        return this.mLatitude;
    }

    public LocInfoRspData getLocInfoRsp() {
        return this.mLocInfoRsp;
    }

    public String getLocalID() {
        return this.mLocalID;
    }

    public String getLocationDetail() {
        return this.mLocationDetail;
    }

    public BDLocationException getLocationException() {
        return this.mLocationException;
    }

    public int getLocationMode() {
        return this.mLocationMode;
    }

    public long getLocationMs() {
        return this.mLocationMs;
    }

    public LocationResult getLocationResult() {
        return this.mLocationResult;
    }

    public String getLocationSDKName() {
        return this.mLocationSDKName;
    }

    public int getLocationType() {
        return this.mLocationType;
    }

    @Override // android.location.Location
    public double getLongitude() {
        return this.mLongitude;
    }

    public long getMockDuration() {
        return this.mMockDuration;
    }

    public String getPoi() {
        return this.mPoi;
    }

    public List<PoiInfoEntity> getPoiEntities() {
        return this.mPoiEntities;
    }

    public int getSatellites() {
        return this.mSatellites;
    }

    @Override // android.location.Location
    public float getSpeed() {
        return this.mSpeed;
    }

    public String getStreet() {
        return this.mStreet;
    }

    public String getStreetNum() {
        return this.mStreetNum;
    }

    public String getSubAdministrativeArea() {
        return this.mSubAdministrativeArea;
    }

    public String getSubdivisionAsciName() {
        return this.mSubdivisionAsciName;
    }

    public long getSubdivisionId() {
        return this.mSubdivisionId;
    }

    public Location getThirdPartLocation() {
        return this.mThirdPartLocation;
    }

    public String getTown() {
        return this.mTown;
    }

    public String getTownAsciName() {
        return this.mTownAsciName;
    }

    public long getTownId() {
        return this.mTownId;
    }

    public int getTrustedLevel() {
        return this.mTrustedLevel;
    }

    public String getUnshiftedAndEncryptedLat() {
        return this.mUnshiftedAndEncryptedLat;
    }

    public String getUnshiftedAndEncryptedLng() {
        return this.mUnshiftedAndEncryptedLng;
    }

    public double getUnshiftedLatitude() {
        return this.mUnshiftedLatitude;
    }

    public double getUnshiftedLongitude() {
        return this.mUnshiftedLongitude;
    }

    public String getVillage() {
        return this.mVillage;
    }

    public String getVillageAsciName() {
        return this.mVillageAsciName;
    }

    public long getVillageId() {
        return this.mVillageId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BDLocation(com.bytedance.bdlocation.BDLocation r3) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BDLocation.<init>(com.bytedance.bdlocation.BDLocation):void");
    }

    private void superLocation(Location location) {
        setProvider(location.getProvider());
        setTime(location.getTime());
        setElapsedRealtimeNanos(location.getElapsedRealtimeNanos());
        setLatitude(location.getLatitude());
        setLongitude(location.getLongitude());
        setSpeed(location.getSpeed());
        setBearing(location.getBearing());
        setAccuracy(location.getAccuracy());
        if (Build.VERSION.SDK_INT >= 26) {
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
            setSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
            setBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
        }
    }

    private int transProvider(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if ("gps".equalsIgnoreCase(str)) {
            return 1;
        }
        if (!"network".equalsIgnoreCase(str) && !"bd_lbs".equalsIgnoreCase(str) && !"lbs".equalsIgnoreCase(str)) {
            return 0;
        }
        return 4;
    }

    public void setAccuracyLevel(int i) {
        this.mAccuracyLevel = i;
        transformLocationForLevel(i);
    }

    public void setAdCode(String str) {
        this.mAdCode = str;
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setAdministrativeArea(String str) {
        this.mAdministrativeArea = str;
    }

    public void setAoi(String str) {
        this.mAoi = str;
    }

    public void setAoiEntities(List<PoiInfoEntity> list) {
        this.mAoiEntities = list;
    }

    public void setBdLBSResult(BdLBSResult bdLBSResult) {
        this.mBdLBSResult = bdLBSResult;
    }

    @Override // android.location.Location
    public void setBearing(float f) {
        this.mBearing = f;
    }

    public void setBuildingId(String str) {
        this.mBuildingId = str;
    }

    public void setCache(boolean z) {
        this.isCache = z;
    }

    public void setCity(String str) {
        this.mCity = str;
    }

    public void setCityAsciName(String str) {
        this.mCityAsciName = str;
    }

    public void setCityCode(String str) {
        this.mCityCode = str;
    }

    public void setCityId(long j) {
        this.mCityId = j;
    }

    public void setCoordinateSystem(String str) {
        this.mCoordinateSystem = str;
    }

    public void setCountry(String str) {
        this.mCountry = str;
    }

    public void setCountryAsciName(String str) {
        this.mCountryAsciName = str;
    }

    public void setCountryCode(String str) {
        this.mCountryCode = str;
    }

    public void setCountryId(long j) {
        this.mCountryId = j;
    }

    public void setCountryLocalID(String str) {
        this.mCountryLocalID = str;
    }

    public void setCurrentLocationAccuracyMode(int i) {
        this.currentLocationAccuracyMode = i;
    }

    public void setDesensitizationType(int i) {
        this.desensitizationType = i;
    }

    public void setDisableLocationShift(int i) {
        this.mDisableLocationShift = i;
    }

    public void setDistrict(String str) {
        this.mDistrict = str;
    }

    public void setDistrictAsciName(String str) {
        this.mDistrictAsciName = str;
    }

    public void setDistrictId(long j) {
        this.mDistrictId = j;
    }

    public void setDistrictLocalID(String str) {
        this.mDistrictLocalID = str;
    }

    public void setEncryptedLat(String str) {
        this.mEncryptedLat = str;
    }

    public void setEncryptedLng(String str) {
        this.mEncryptedLng = str;
    }

    public void setException(BDLocationException bDLocationException) {
        this.exception = bDLocationException;
    }

    public void setFloor(String str) {
        this.mFloor = str;
    }

    public void setGCJ02(BDPoint bDPoint) {
        this.mGCJ02 = bDPoint;
    }

    public void setGeoNameID(String str) {
        this.mGeoNameID = str;
    }

    public void setGeocodeSDKName(String str) {
        this.mGeocodeSDKName = str;
    }

    public void setIsCompliance(boolean z) {
        this.mIsCompliance = z;
    }

    public void setIsDisputed(boolean z) {
        this.mIsDisputed = z;
    }

    public void setLatLngPrecision(int i) {
        this.mLatLngPrecision = i;
    }

    @Override // android.location.Location
    public void setLatitude(double d) {
        super.setLatitude(d);
        this.mLatitude = d;
    }

    public void setLocInfoRsp(LocInfoRspData locInfoRspData) {
        this.mLocInfoRsp = locInfoRspData;
    }

    public void setLocalID(String str) {
        this.mLocalID = str;
    }

    public void setLocationDetail(String str) {
        this.mLocationDetail = str;
    }

    public void setLocationException(BDLocationException bDLocationException) {
        this.mLocationException = bDLocationException;
    }

    public void setLocationMode(int i) {
        this.mLocationMode = i;
    }

    public void setLocationMs(long j) {
        this.mLocationMs = j;
    }

    public void setLocationResult(LocationResult locationResult) {
        this.mLocationResult = locationResult;
    }

    public void setLocationSDKName(String str) {
        this.mLocationSDKName = str;
    }

    public void setLocationType(int i) {
        this.mLocationType = i;
    }

    @Override // android.location.Location
    public void setLongitude(double d) {
        super.setLongitude(d);
        this.mLongitude = d;
    }

    public void setMockDuration(long j) {
        this.mMockDuration = j;
    }

    public void setPoi(String str) {
        this.mPoi = str;
    }

    public void setPoiEntities(List<PoiInfoEntity> list) {
        this.mPoiEntities = list;
    }

    public void setSatellites(int i) {
        this.mSatellites = i;
    }

    @Override // android.location.Location
    public void setSpeed(float f) {
        this.mSpeed = f;
    }

    public void setStreet(String str) {
        this.mStreet = str;
    }

    public void setStreetNum(String str) {
        this.mStreetNum = str;
    }

    public void setSubAdministrativeArea(String str) {
        this.mSubAdministrativeArea = str;
    }

    public void setSubdivisionAsciName(String str) {
        this.mSubdivisionAsciName = str;
    }

    public void setSubdivisionId(long j) {
        this.mSubdivisionId = j;
    }

    public void setThirdPartLocation(Location location) {
        this.mThirdPartLocation = location;
    }

    public void setTown(String str) {
        this.mTown = str;
    }

    public void setTownAsciName(String str) {
        this.mTownAsciName = str;
    }

    public void setTownId(long j) {
        this.mTownId = j;
    }

    public void setTrustedLevel(int i) {
        this.mTrustedLevel = i;
    }

    public void setUnshiftedAndEncryptedLat(String str) {
        this.mUnshiftedAndEncryptedLat = str;
    }

    public void setUnshiftedAndEncryptedLng(String str) {
        this.mUnshiftedAndEncryptedLng = str;
    }

    public void setUnshiftedLatitude(double d) {
        this.mUnshiftedLatitude = d;
    }

    public void setUnshiftedLongitude(double d) {
        this.mUnshiftedLongitude = d;
    }

    public void setVillage(String str) {
        this.mVillage = str;
    }

    public void setVillageAsciName(String str) {
        this.mVillageAsciName = str;
    }

    public void setVillageId(long j) {
        this.mVillageId = j;
    }

    public void transformLocationForLevel(int i) {
        if (i == 4) {
            return;
        }
        setLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        setLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        setEncryptedLat("");
        setEncryptedLng("");
        setUnshiftedLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        setUnshiftedLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        setUnshiftedAndEncryptedLat("");
        setUnshiftedAndEncryptedLng("");
        setTown("");
        setTownId(0L);
        setTownAsciName("");
        setAddress("");
        if (i <= 2) {
            setDistrict("");
            setDistrictId(0L);
            setDistrictLocalID("");
            setDistrictAsciName("");
            if (i <= 1) {
                setCity("");
                setCityId(0L);
                setCityAsciName("");
                setCityCode("");
                if (i <= 0) {
                    setAdministrativeArea("");
                    setSubdivisionId(0L);
                    setSubdivisionAsciName("");
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BDLocation(android.location.Location r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L21
            java.lang.String r0 = ""
        L4:
            r2.<init>(r0)
            r0 = 0
            r2.exception = r0
            java.lang.String r0 = "wgs84"
            r2.mCoordinateSystem = r0
            r0 = 4
            r2.mAccuracyLevel = r0
            r0 = 2
            r2.mLatLngPrecision = r0
            r0 = 1
            r2.mDisableLocationShift = r0
            r0 = 0
            r2.mLocationMode = r0
            r2.currentLocationAccuracyMode = r0
            r2.desensitizationType = r0
            if (r3 != 0) goto L26
            return
        L21:
            java.lang.String r0 = r3.getProvider()
            goto L4
        L26:
            r2.superLocation(r3)
            double r0 = r3.getLatitude()
            r2.mLatitude = r0
            double r0 = r3.getLongitude()
            r2.mLongitude = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mLocationMs = r0
            r2.mThirdPartLocation = r3
            r2.mLocationSDKName = r4
            java.lang.String r0 = r3.getProvider()
            int r0 = r2.transProvider(r0)
            r2.mLocationType = r0
            float r0 = r3.getBearing()
            r2.mBearing = r0
            float r0 = r3.getSpeed()
            r2.mSpeed = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BDLocation.<init>(android.location.Location, java.lang.String):void");
    }

    public BDLocation(String str, String str2) {
        super(str);
        this.mCoordinateSystem = "wgs84";
        this.mAccuracyLevel = 4;
        this.mLatLngPrecision = 2;
        this.mDisableLocationShift = 1;
        this.mLocationSDKName = str2;
        this.mLocationType = transProvider(str);
    }
}
