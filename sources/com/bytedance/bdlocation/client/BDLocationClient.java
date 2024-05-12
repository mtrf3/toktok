package com.bytedance.bdlocation.client;

import X.C58096Mr6;
import X.C91041ZoD;
import X.C91049ZoL;
import X.C91050ZoM;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes24.dex */
public class BDLocationClient implements IBDLocationClient {
    public static String COMMON_UPLOAD_SOURCE = "from_client";
    public LocationOption mOption;

    @Override // com.bytedance.bdlocation.client.IBDLocationClient
    public void stopLocation() {
        synchronized (this) {
            Logger.d("BDLocationClient:stopLocation");
            ILocate iLocate = C91041ZoD.LJFF().LJFF;
            if (iLocate != null) {
                iLocate.stopLocation();
            }
        }
    }

    @Override // com.bytedance.bdlocation.client.IBDLocationClient
    public BDLocation getLocation() {
        Logger.d("BDLocationClient:getLocation synchronization");
        if (!checkInit(null)) {
            return null;
        }
        LocationOption locationOption = this.mOption;
        if (locationOption != null) {
            locationOption.setOnceLocation(true);
            this.mOption.setBpeaAction("getLocationCert");
        }
        C91041ZoD LJFF = C91041ZoD.LJFF();
        LocationOption locationOption2 = new LocationOption(this.mOption);
        LJFF.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BDLocation[] bDLocationArr = new BDLocation[1];
        BDLocationException[] bDLocationExceptionArr = new BDLocationException[1];
        LJFF.LJIILIIL(new C91050ZoM(bDLocationArr, countDownLatch, bDLocationExceptionArr), locationOption2);
        try {
            countDownLatch.await(locationOption2.getLocationTimeOutMs(), TimeUnit.MILLISECONDS);
            BDLocationException bDLocationException = bDLocationExceptionArr[0];
            if (bDLocationException == null) {
                return bDLocationArr[0];
            }
            throw bDLocationException;
        } catch (InterruptedException e) {
            throw new BDLocationException(e, "Android", CardStruct.IStatusCode.DEFAULT);
        }
    }

    private long getPollUploadInterval() {
        return C91049ZoL.LIZ().LIZIZ() + 1000;
    }

    public static IBDLocationClient createIBDLocationClientbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBDLocationClient.class, z);
        if (LIZ != null) {
            return (IBDLocationClient) LIZ;
        }
        return new BDLocationClient();
    }

    private LocationOption getOption(BDLocationClientOption bDLocationClientOption) {
        LocationOption locationOption = new LocationOption();
        locationOption.setLocateType(bDLocationClientOption.getLocateType());
        locationOption.setLocationTimeOutMs(bDLocationClientOption.getLocationTimeOut());
        locationOption.setMaxCacheTime(bDLocationClientOption.getMaxCacheTime());
        locationOption.setUploadSource(bDLocationClientOption.getUploadSource());
        locationOption.setCert(bDLocationClientOption.isCert());
        locationOption.setAccuracyLevel(bDLocationClientOption.getAccuracyLevel());
        locationOption.setInterval(bDLocationClientOption.getInterval());
        locationOption.setTriggerType(bDLocationClientOption.getTriggerType());
        locationOption.setMode(bDLocationClientOption.getLocationMode());
        locationOption.setBpeaCert(bDLocationClientOption.getBpeaCert());
        locationOption.setDecryptCert(bDLocationClientOption.getDecryptCert());
        locationOption.setLatestAdminVersion(bDLocationClientOption.isLatestAdminVersion());
        locationOption.setGeocodeMode(bDLocationClientOption.getGeocodeMode());
        locationOption.setEnableH3(bDLocationClientOption.isEnableH3());
        locationOption.setNeedUnshiftedLatLng(bDLocationClientOption.isNeedUnshiftedLatLng());
        if (TextUtils.isEmpty(locationOption.getUploadSource())) {
            locationOption.setUploadSource(COMMON_UPLOAD_SOURCE);
        }
        return locationOption;
    }

    public boolean checkInit(BDLocationCallback bDLocationCallback) {
        if (BDLocationConfig.checkInit()) {
            return true;
        }
        Logger.i("Must be called after BDLocation initialization!");
        if (bDLocationCallback != null) {
            bDLocationCallback.onError(new BDLocationException("Must be called after BDLocation initialization", "bdlocation", "80"));
            return false;
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.client.IBDLocationClient
    public void getLocation(BDLocationCallback bDLocationCallback) {
        Logger.d("BDLocationClient:getLocation asynchronous");
        if (!checkInit(bDLocationCallback)) {
            return;
        }
        LocationOption locationOption = this.mOption;
        if (locationOption != null) {
            locationOption.setOnceLocation(true);
            this.mOption.setBpeaAction("getLocation");
        }
        C91041ZoD.LJFF().LJIILIIL(bDLocationCallback, new LocationOption(this.mOption));
    }

    @Override // com.bytedance.bdlocation.client.IBDLocationClient
    public void setClientOption(BDLocationClientOption bDLocationClientOption) {
        LocationOption option = getOption(bDLocationClientOption);
        this.mOption = option;
        if (option != null && option.getMaxCacheTime() > 0) {
            this.mOption.setMaxCacheTime(getPollUploadInterval());
        }
    }

    @Override // com.bytedance.bdlocation.client.IBDLocationClient
    public void startLocation(BDLocationCallback bDLocationCallback) {
        synchronized (this) {
            Logger.d("BDLocationClient:startLocation");
            if (!checkInit(bDLocationCallback)) {
                return;
            }
            LocationOption locationOption = this.mOption;
            if (locationOption != null) {
                locationOption.setOnceLocation(false);
                this.mOption.setBpeaAction("startLocation");
            }
            C91041ZoD.LJFF().LJIILIIL(bDLocationCallback, new LocationOption(this.mOption));
        }
    }
}
