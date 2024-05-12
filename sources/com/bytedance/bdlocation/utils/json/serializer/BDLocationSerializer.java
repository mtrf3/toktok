package com.bytedance.bdlocation.utils.json.serializer;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public class BDLocationSerializer implements r<BDLocation> {
    @Override // com.google.gson.r
    public j serialize(BDLocation bDLocation, Type type, q qVar) {
        m mVar = new m();
        mVar.LJJIIZ("mProvider", bDLocation.getProvider());
        mVar.LJJIIJ("mAccuracy", Float.valueOf(bDLocation.getAccuracy()));
        mVar.LJJIIJ("mBearing", Float.valueOf(bDLocation.getBearing()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            mVar.LJJIIJ("mBearingAccuracyDegrees", Float.valueOf(bDLocation.getBearingAccuracyDegrees()));
        }
        mVar.LJJIIJ("mElapsedRealtimeNanos", Long.valueOf(bDLocation.getElapsedRealtimeNanos()));
        mVar.LJJIIJ("mLatitude", Double.valueOf(bDLocation.getLatitude()));
        mVar.LJJIIJ("mLongitude", Double.valueOf(bDLocation.getLongitude()));
        mVar.LJJIIZ("mProvider", bDLocation.getProvider());
        mVar.LJJIIJ("mSpeed", Float.valueOf(bDLocation.getSpeed()));
        if (i >= 26) {
            mVar.LJJIIJ("mSpeedAccuracyMetersPerSecond", Float.valueOf(bDLocation.getSpeedAccuracyMetersPerSecond()));
        }
        mVar.LJJIIJ("mTime", Long.valueOf(bDLocation.getTime()));
        if (i >= 26) {
            mVar.LJJIIJ("mVerticalAccuracyMeters", Float.valueOf(bDLocation.getVerticalAccuracyMeters()));
        }
        mVar.LJJIIZ("mAddress", bDLocation.getAddress());
        mVar.LJJIIZ("mCountry", bDLocation.getCountry());
        mVar.LJJIIZ("mAdministrativeArea", bDLocation.getAdministrativeArea());
        mVar.LJJIIZ("mSubAdministrativeArea", bDLocation.getSubAdministrativeArea());
        mVar.LJJIIZ("mCity", bDLocation.getCity());
        mVar.LJJIIZ("mDistrict", bDLocation.getDistrict());
        mVar.LJJIIZ("mCityCode", bDLocation.getCityCode());
        mVar.LJJIIZ("mStreet", bDLocation.getStreet());
        mVar.LJJIIZ("mStreetNum", bDLocation.getStreetNum());
        mVar.LJJIIZ("mFloor", bDLocation.getFloor());
        mVar.LJJIIJ("mLocationMs", Long.valueOf(bDLocation.getLocationMs()));
        mVar.LJJIIZ("mLocationSDKName", bDLocation.getLocationSDKName());
        mVar.LJJIIZ("mCoordinateSystem", bDLocation.getCoordinateSystem());
        mVar.LJJIIZ("mPoi", bDLocation.getPoi());
        mVar.LJJIIJ("mLocationType", Integer.valueOf(bDLocation.getLocationType()));
        mVar.LJJIIZ("mCountryCode", bDLocation.getCountryCode());
        mVar.LJJIIZ("mCountryLocalID", bDLocation.getCountryLocalID());
        mVar.LJJIIZ("mLocalID", bDLocation.getLocalID());
        mVar.LJJIIZ("mDistrictLocalID", bDLocation.getDistrictLocalID());
        mVar.LJJIIZ("mGeoNameID", bDLocation.getGeoNameID());
        mVar.LJJIIZ("mGeocodeSDKName", bDLocation.getGeocodeSDKName());
        mVar.LJJIIZ("mAoi", bDLocation.getAoi());
        mVar.LJJIIJ("mMockDuration", Long.valueOf(bDLocation.getMockDuration()));
        mVar.LJJIIZ("mTown", bDLocation.getTown());
        mVar.LJJIIZ("mVillage", bDLocation.getVillage());
        mVar.LJJIIJ("mCountryId", Long.valueOf(bDLocation.getCountryId()));
        mVar.LJJIIJ("mSubdivisionId", Long.valueOf(bDLocation.getSubdivisionId()));
        mVar.LJJIIJ("mCityId", Long.valueOf(bDLocation.getCityId()));
        mVar.LJJIIJ("mDistrictId", Long.valueOf(bDLocation.getDistrictId()));
        mVar.LJJIIJ("mTownId", Long.valueOf(bDLocation.getTownId()));
        mVar.LJJIIJ("mVillageId", Long.valueOf(bDLocation.getVillageId()));
        mVar.LJJIIZ("mCountryAsciName", bDLocation.getCountryAsciName());
        mVar.LJJIIZ("mSubdivisionAsciName", bDLocation.getSubdivisionAsciName());
        mVar.LJJIIZ("mCityAsciName", bDLocation.getCityAsciName());
        mVar.LJJIIZ("mDistrictAsciName", bDLocation.getDistrictAsciName());
        mVar.LJJIIZ("mTownAsciName", bDLocation.getTownAsciName());
        mVar.LJJIIZ("mVillageAsciName", bDLocation.getVillageAsciName());
        mVar.LJJIIZ("mAdCode", bDLocation.getAdCode());
        mVar.LJJIII(Boolean.valueOf(bDLocation.getIsDisputed()), "mIsDisputed");
        mVar.LJJIII(Boolean.valueOf(bDLocation.getIsCompliance()), "mIsCompliance");
        mVar.LJJIIJ("mTrustedLevel", Integer.valueOf(bDLocation.getTrustedLevel()));
        mVar.LJJIIZ("mLocationDetail", bDLocation.getLocationDetail());
        mVar.LJJIIJ("mSatellites", Integer.valueOf(bDLocation.getSatellites()));
        mVar.LJJIIZ("mBuildingId", bDLocation.getBuildingId());
        mVar.LJJIIZ("mEncryptedLat", bDLocation.getEncryptedLat());
        mVar.LJJIIZ("mEncryptedLng", bDLocation.getEncryptedLng());
        mVar.LJJIIJ("mDisableLocationShift", Integer.valueOf(bDLocation.getDisableLocationShift()));
        mVar.LJJIIJ("mLocationMode", Integer.valueOf(bDLocation.getLocationMode()));
        mVar.LJJII("mBdLBSResult", JsonUtil.safeToJsonTree(bDLocation.getBdLBSResult()));
        mVar.LJJII("mLocationResult", JsonUtil.safeToJsonTree(bDLocation.getLocationResult()));
        mVar.LJJII("mGCJ02", JsonUtil.safeToJsonTree(bDLocation.getGCJ02()));
        mVar.LJJII("mPoiEntities", JsonUtil.safeToJsonTree(bDLocation.getPoiEntities()));
        mVar.LJJII("mAoiEntities", JsonUtil.safeToJsonTree(bDLocation.getAoiEntities()));
        return mVar;
    }
}
