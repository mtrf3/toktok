package com.bytedance.bdlocation.utils.json.deserializer;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.PoiInfoEntity;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.model.BdLBSResult;
import com.bytedance.bdlocation.network.model.LocationResult;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes17.dex */
public class BDLocationDeserializer implements i<BDLocation> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.i
    public BDLocation deserialize(j jVar, Type type, h hVar) {
        if ("us".equals(BDLocationConfig.getUserRegion())) {
            return null;
        }
        m LJIIZILJ = jVar.LJIIZILJ();
        BDLocation bDLocation = new BDLocation(LJIIZILJ.LJJIJL("mProvider").LJJIFFI(), LJIIZILJ.LJJIJL("mLocationSDKName").LJJIFFI());
        bDLocation.setAccuracy(LJIIZILJ.LJJIJL("mAccuracy").LJIIJ());
        bDLocation.setBearing(LJIIZILJ.LJJIJL("mBearing").LJIIJ());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            bDLocation.setBearingAccuracyDegrees(LJIIZILJ.LJJIJL("mBearingAccuracyDegrees").LJIIJ());
        }
        bDLocation.setElapsedRealtimeNanos(LJIIZILJ.LJJIJL("mElapsedRealtimeNanos").LJIJJLI());
        bDLocation.setLatitude(LJIIZILJ.LJJIJL("mLatitude").LJIIIZ());
        bDLocation.setLongitude(LJIIZILJ.LJJIJL("mLongitude").LJIIIZ());
        bDLocation.setSpeed(LJIIZILJ.LJJIJL("mSpeed").LJIIJ());
        if (i >= 26) {
            bDLocation.setSpeedAccuracyMetersPerSecond(LJIIZILJ.LJJIJL("mSpeedAccuracyMetersPerSecond").LJIIJ());
        }
        bDLocation.setTime(LJIIZILJ.LJJIJL("mTime").LJIJJLI());
        if (i >= 26) {
            bDLocation.setVerticalAccuracyMeters(LJIIZILJ.LJJIJL("mVerticalAccuracyMeters").LJIIJ());
        }
        p LJJIJL = LJIIZILJ.LJJIJL("mAddress");
        if (LJJIJL != null) {
            bDLocation.setAddress(LJJIJL.LJJIFFI());
        }
        p LJJIJL2 = LJIIZILJ.LJJIJL("mCountry");
        if (LJJIJL2 != null) {
            bDLocation.setCountry(LJJIJL2.LJJIFFI());
        }
        p LJJIJL3 = LJIIZILJ.LJJIJL("mAdministrativeArea");
        if (LJJIJL3 != null) {
            bDLocation.setAdministrativeArea(LJJIJL3.LJJIFFI());
        }
        p LJJIJL4 = LJIIZILJ.LJJIJL("mSubAdministrativeArea");
        if (LJJIJL4 != null) {
            bDLocation.setSubAdministrativeArea(LJJIJL4.LJJIFFI());
        }
        p LJJIJL5 = LJIIZILJ.LJJIJL("mCity");
        if (LJJIJL5 != null) {
            bDLocation.setCity(LJJIJL5.LJJIFFI());
        }
        p LJJIJL6 = LJIIZILJ.LJJIJL("mDistrict");
        if (LJJIJL6 != null) {
            bDLocation.setDistrict(LJJIJL6.LJJIFFI());
        }
        p LJJIJL7 = LJIIZILJ.LJJIJL("mCityCode");
        if (LJJIJL7 != null) {
            bDLocation.setCityCode(LJJIJL7.LJJIFFI());
        }
        p LJJIJL8 = LJIIZILJ.LJJIJL("mStreet");
        if (LJJIJL8 != null) {
            bDLocation.setStreet(LJJIJL8.LJJIFFI());
        }
        p LJJIJL9 = LJIIZILJ.LJJIJL("mStreetNum");
        if (LJJIJL9 != null) {
            bDLocation.setStreetNum(LJJIJL9.LJJIFFI());
        }
        p LJJIJL10 = LJIIZILJ.LJJIJL("mFloor");
        if (LJJIJL10 != null) {
            bDLocation.setFloor(LJJIJL10.LJJIFFI());
        }
        bDLocation.setLocationMs(LJIIZILJ.LJJIJL("mLocationMs").LJIJJLI());
        p LJJIJL11 = LJIIZILJ.LJJIJL("mLocationSDKName");
        if (LJJIJL11 != null) {
            bDLocation.setLocationSDKName(LJJIJL11.LJJIFFI());
        }
        p LJJIJL12 = LJIIZILJ.LJJIJL("mPoi");
        if (LJJIJL12 != null) {
            bDLocation.setPoi(LJJIJL12.LJJIFFI());
        }
        BDPoint bDPoint = new BDPoint();
        m LJJIJIL = LJIIZILJ.LJJIJIL("mGCJ02");
        if (LJJIJIL != null) {
            p LJJIJL13 = LJJIJIL.LJJIJL("provider");
            if (LJJIJL13 != null) {
                bDPoint.setProvider(LJJIJL13.LJJIFFI());
            }
            bDPoint.setLongitude(LJJIJIL.LJJIJL("longitude").LJIIIZ());
            bDPoint.setLatitude(LJJIJIL.LJJIJL("latitude").LJIIIZ());
            bDLocation.setGCJ02(bDPoint);
        }
        bDLocation.setLocationType(LJIIZILJ.LJJIJL("mLocationType").LJIILJJIL());
        p LJJIJL14 = LJIIZILJ.LJJIJL("mCountryCode");
        if (LJJIJL14 != null) {
            bDLocation.setCountryCode(LJJIJL14.LJJIFFI());
        }
        p LJJIJL15 = LJIIZILJ.LJJIJL("mCountryLocalID");
        if (LJJIJL15 != null) {
            bDLocation.setCountryLocalID(LJJIJL15.LJJIFFI());
        }
        p LJJIJL16 = LJIIZILJ.LJJIJL("mLocalID");
        if (LJJIJL16 != null) {
            bDLocation.setLocalID(LJJIJL16.LJJIFFI());
        }
        p LJJIJL17 = LJIIZILJ.LJJIJL("mDistrictLocalID");
        if (LJJIJL17 != null) {
            bDLocation.setDistrictLocalID(LJJIJL17.LJJIFFI());
        }
        p LJJIJL18 = LJIIZILJ.LJJIJL("mGeoNameID");
        if (LJJIJL18 != null) {
            bDLocation.setGeoNameID(LJJIJL18.LJJIFFI());
        }
        p LJJIJL19 = LJIIZILJ.LJJIJL("mGeocodeSDKName");
        if (LJJIJL19 != null) {
            bDLocation.setGeocodeSDKName(LJJIJL19.LJJIFFI());
        }
        p LJJIJL20 = LJIIZILJ.LJJIJL("mAoi");
        if (LJJIJL20 != null) {
            bDLocation.setAoi(LJJIJL20.LJJIFFI());
        }
        p LJJIJL21 = LJIIZILJ.LJJIJL("mMockDuration");
        if (LJJIJL21 != null) {
            bDLocation.setMockDuration(LJJIJL21.LJIJJLI());
        }
        p LJJIJL22 = LJIIZILJ.LJJIJL("mTown");
        if (LJJIJL22 != null) {
            bDLocation.setTown(LJJIJL22.LJJIFFI());
        }
        p LJJIJL23 = LJIIZILJ.LJJIJL("mVillage");
        if (LJJIJL23 != null) {
            bDLocation.setVillage(LJJIJL23.LJJIFFI());
        }
        p LJJIJL24 = LJIIZILJ.LJJIJL("mCountryId");
        if (LJJIJL24 != null) {
            bDLocation.setCountryId(LJJIJL24.LJIJJLI());
        }
        p LJJIJL25 = LJIIZILJ.LJJIJL("mSubdivisionId");
        if (LJJIJL25 != null) {
            bDLocation.setSubdivisionId(LJJIJL25.LJIJJLI());
        }
        p LJJIJL26 = LJIIZILJ.LJJIJL("mCityId");
        if (LJJIJL26 != null) {
            bDLocation.setCityId(LJJIJL26.LJIJJLI());
        }
        p LJJIJL27 = LJIIZILJ.LJJIJL("mDistrictId");
        if (LJJIJL27 != null) {
            bDLocation.setDistrictId(LJJIJL27.LJIJJLI());
        }
        p LJJIJL28 = LJIIZILJ.LJJIJL("mTownId");
        if (LJJIJL28 != null) {
            bDLocation.setTownId(LJJIJL28.LJIJJLI());
        }
        p LJJIJL29 = LJIIZILJ.LJJIJL("mVillageId");
        if (LJJIJL29 != null) {
            bDLocation.setVillageId(LJJIJL29.LJIJJLI());
        }
        p LJJIJL30 = LJIIZILJ.LJJIJL("mCountryAsciName");
        if (LJJIJL30 != null) {
            bDLocation.setCountryAsciName(LJJIJL30.LJJIFFI());
        }
        p LJJIJL31 = LJIIZILJ.LJJIJL("mSubdivisionAsciName");
        if (LJJIJL31 != null) {
            bDLocation.setSubdivisionAsciName(LJJIJL31.LJJIFFI());
        }
        p LJJIJL32 = LJIIZILJ.LJJIJL("mCityAsciName");
        if (LJJIJL32 != null) {
            bDLocation.setCityAsciName(LJJIJL32.LJJIFFI());
        }
        p LJJIJL33 = LJIIZILJ.LJJIJL("mDistrictAsciName");
        if (LJJIJL33 != null) {
            bDLocation.setDistrictAsciName(LJJIJL33.LJJIFFI());
        }
        p LJJIJL34 = LJIIZILJ.LJJIJL("mTownAsciName");
        if (LJJIJL34 != null) {
            bDLocation.setTownAsciName(LJJIJL34.LJJIFFI());
        }
        p LJJIJL35 = LJIIZILJ.LJJIJL("mVillageAsciName");
        if (LJJIJL35 != null) {
            bDLocation.setVillageAsciName(LJJIJL35.LJJIFFI());
        }
        p LJJIJL36 = LJIIZILJ.LJJIJL("mAdCode");
        if (LJJIJL36 != null) {
            bDLocation.setAdCode(LJJIJL36.LJJIFFI());
        }
        p LJJIJL37 = LJIIZILJ.LJJIJL("mIsDisputed");
        if (LJJIJL37 != null) {
            bDLocation.setIsDisputed(LJJIJL37.LJFF());
        }
        p LJJIJL38 = LJIIZILJ.LJJIJL("mIsCompliance");
        if (LJJIJL38 != null) {
            bDLocation.setIsCompliance(LJJIJL38.LJFF());
        }
        p LJJIJL39 = LJIIZILJ.LJJIJL("mTrustedLevel");
        if (LJJIJL39 != null) {
            bDLocation.setTrustedLevel(LJJIJL39.LJIILJJIL());
        }
        p LJJIJL40 = LJIIZILJ.LJJIJL("mLocationDetail");
        if (LJJIJL40 != null) {
            bDLocation.setLocationDetail(LJJIJL40.LJJIFFI());
        }
        p LJJIJL41 = LJIIZILJ.LJJIJL("mSatellites");
        if (LJJIJL41 != null) {
            bDLocation.setSatellites(LJJIJL41.LJIILJJIL());
        }
        p LJJIJL42 = LJIIZILJ.LJJIJL("mBuildingId");
        if (LJJIJL42 != null) {
            bDLocation.setBuildingId(LJJIJL42.LJJIFFI());
        }
        p LJJIJL43 = LJIIZILJ.LJJIJL("mCoordinateSystem");
        if (LJJIJL43 != null) {
            bDLocation.setCoordinateSystem(LJJIJL43.LJJIFFI());
        }
        p LJJIJL44 = LJIIZILJ.LJJIJL("mEncryptedLat");
        if (LJJIJL44 != null) {
            bDLocation.setEncryptedLat(LJJIJL44.LJJIFFI());
        }
        p LJJIJL45 = LJIIZILJ.LJJIJL("mEncryptedLng");
        if (LJJIJL45 != null) {
            bDLocation.setEncryptedLng(LJJIJL45.LJJIFFI());
        }
        p LJJIJL46 = LJIIZILJ.LJJIJL("mDisableLocationShift");
        if (LJJIJL46 != null) {
            bDLocation.setDisableLocationShift(LJJIJL46.LJIILJJIL());
        }
        p LJJIJL47 = LJIIZILJ.LJJIJL("mLocationMode");
        if (LJJIJL47 != null) {
            bDLocation.setLocationMode(LJJIJL47.LJIILJJIL());
        }
        try {
            m LJJIJIL2 = LJIIZILJ.LJJIJIL("mBdLBSResult");
            if (LJJIJIL2 != null) {
                bDLocation.setBdLBSResult((BdLBSResult) JsonUtil.sGson.LIZJ(LJJIJIL2, BdLBSResult.class));
            }
        } catch (Exception e) {
            Logger.e("BDLocationDeserializer", e);
        }
        try {
            m LJJIJIL3 = LJIIZILJ.LJJIJIL("mLocationResult");
            if (LJJIJIL3 != null) {
                bDLocation.setLocationResult((LocationResult) JsonUtil.sGson.LIZJ(LJJIJIL3, LocationResult.class));
            }
        } catch (Exception e2) {
            Logger.e("BDLocationDeserializer", e2);
        }
        try {
            m LJJIJIL4 = LJIIZILJ.LJJIJIL("mGCJ02");
            if (LJJIJIL4 != null) {
                bDLocation.setGCJ02((BDPoint) JsonUtil.sGson.LIZJ(LJJIJIL4, BDPoint.class));
            }
        } catch (Exception e3) {
            Logger.e("BDLocationDeserializer", e3);
        }
        try {
            g LJJIJIIJI = LJIIZILJ.LJJIJIIJI("mPoiEntities");
            if (LJJIJIIJI != null) {
                bDLocation.setPoiEntities((List) JsonUtil.sGson.LIZLLL(LJJIJIIJI, new TypeToken<List<PoiInfoEntity>>() { // from class: com.bytedance.bdlocation.utils.json.deserializer.BDLocationDeserializer.1
                }.getType()));
            }
        } catch (Exception e4) {
            Logger.e("BDLocationDeserializer", e4);
        }
        try {
            g LJJIJIIJI2 = LJIIZILJ.LJJIJIIJI("mAoiEntities");
            if (LJJIJIIJI2 != null) {
                bDLocation.setAoiEntities((List) JsonUtil.sGson.LIZLLL(LJJIJIIJI2, new TypeToken<List<PoiInfoEntity>>() { // from class: com.bytedance.bdlocation.utils.json.deserializer.BDLocationDeserializer.2
                }.getType()));
            }
        } catch (Exception e5) {
            Logger.e("BDLocationDeserializer", e5);
        }
        return bDLocation;
    }
}
