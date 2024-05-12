package com.bytedance.bdlocation.service;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.BaseLocate;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitor;
import com.bytedance.bdlocation.permission.PermissionManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes24.dex */
public class SystemBaseLocationImpl extends BaseLocate {
    public IBPEALocal mBPEAManager;
    public final Handler mHandler;
    public LocationManager mManager;

    /* loaded from: classes24.dex */
    public class TimeOutRunnable implements Runnable {
        public BDLocationCallback mCallback;
        public LocationListener mListener;
        public LocationOption mOption;
        public long mTimeoutStartTime = SystemClock.elapsedRealtime();

        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_bdlocation_service_SystemBaseLocationImpl$TimeOutRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_bdlocation_service_SystemBaseLocationImpl$TimeOutRunnable__run$___twin___() {
            SystemBaseLocationImpl.this.onError(this.mListener, "timeout", CardStruct.IStatusCode.DEFAULT, this.mCallback, this.mTimeoutStartTime);
        }

        public static void com_bytedance_bdlocation_service_SystemBaseLocationImpl$TimeOutRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TimeOutRunnable timeOutRunnable) {
            boolean LIZ;
            try {
                timeOutRunnable.com_bytedance_bdlocation_service_SystemBaseLocationImpl$TimeOutRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public TimeOutRunnable(LocationListener locationListener, LocationOption locationOption, BDLocationCallback bDLocationCallback) {
            this.mListener = locationListener;
            this.mCallback = bDLocationCallback;
            this.mOption = locationOption;
        }
    }

    public boolean checkProviderDisabled(int i, boolean z, boolean z2) {
        return i == 2 ? z && z2 : i == 0 ? z2 : z;
    }

    @Override // com.bytedance.bdlocation.api.ILocate
    public BDPoint convertGCJ02(BDPoint bDPoint) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ILocate
    public String getLocateName() {
        return "Android";
    }

    @Override // com.bytedance.bdlocation.api.ILocate
    public boolean isAMapDataAvailable(double d, double d2) {
        return false;
    }

    @Override // com.bytedance.bdlocation.api.ILocate
    public void stopLocation() {
    }

    /* loaded from: classes24.dex */
    public class SystemLocationListener implements LocationListener {
        public BDLocationCallback mCallback;
        public boolean mGpsDisabled;
        public long mLocationStartTime;
        public boolean mNetworkDisabled;
        public LocationOption mOption;
        public TimeOutRunnable mTimeOutRunnable;

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a9: IGET (r4 I:com.bytedance.bdlocation.service.SystemBaseLocationImpl) = (r5 I:com.bytedance.bdlocation.service.SystemBaseLocationImpl$SystemLocationListener) (LINE:16777385) com.bytedance.bdlocation.service.SystemBaseLocationImpl.SystemLocationListener.this$0 com.bytedance.bdlocation.service.SystemBaseLocationImpl, block:B:20:0x00a4 */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.bytedance.bdlocation.service.SystemBaseLocationImpl$SystemLocationListener, android.location.LocationListener] */
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            ?? r5;
            BDLocation bDLocation;
            try {
                SystemBaseLocationImpl.this.removeListener(this);
                TimeOutRunnable timeOutRunnable = this.mTimeOutRunnable;
                if (timeOutRunnable != null) {
                    SystemBaseLocationImpl.this.mHandler.removeCallbacks(timeOutRunnable);
                }
                if (this.mOption.isLocationChanged()) {
                    Logger.d("Network Location Changed!");
                    return;
                }
                this.mOption.setLocationChanged(true);
                String provider = location.getProvider();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SystemBaseLocationImpl onLocationChanged provider: ");
                LIZ.append(provider);
                Logger.d(X1D.LIZIZ(LIZ));
                if (provider.equals("gps")) {
                    bDLocation = SystemBaseLocationImpl.this.transform(location, 1, this.mOption.getMode());
                } else if (provider.equals("network")) {
                    bDLocation = SystemBaseLocationImpl.this.transform(location, 4, this.mOption.getMode());
                } else {
                    bDLocation = null;
                }
                SystemBaseLocationImpl.this.geocodeAndCallback(bDLocation, this.mOption, this.mCallback, this.mLocationStartTime);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SystemBaseLocationImpl monitor location duration: ");
                LIZ2.append(SystemClock.elapsedRealtime() - this.mLocationStartTime);
                Logger.i(X1D.LIZIZ(LIZ2));
                LocationMonitor.doDesiredLocationDuration(SystemBaseLocationImpl.this.getLocateName(), SystemClock.elapsedRealtime() - this.mLocationStartTime, "200", "success", null);
            } catch (Exception e) {
                Logger.e("SystemBaseLocationImpl:network listener error", e);
                SystemBaseLocationImpl.this.onError(r5, e.getMessage(), "24", r5.mCallback, r5.mLocationStartTime);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SystemBaseLocationImpl:onProviderDisabled:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
            if ("gps".equals(str)) {
                this.mGpsDisabled = true;
            } else {
                this.mNetworkDisabled = true;
            }
            if (SystemBaseLocationImpl.this.checkProviderDisabled(this.mOption.getMode(), this.mGpsDisabled, this.mNetworkDisabled)) {
                TimeOutRunnable timeOutRunnable = this.mTimeOutRunnable;
                if (timeOutRunnable != null) {
                    SystemBaseLocationImpl.this.mHandler.removeCallbacks(timeOutRunnable);
                }
                SystemBaseLocationImpl.this.onError(this, "provider disabled", "62", this.mCallback, this.mLocationStartTime);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SystemBaseLocationImpl:onProviderEnabled:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
            this.mNetworkDisabled = false;
        }

        public SystemLocationListener(LocationOption locationOption, BDLocationCallback bDLocationCallback) {
            this.mOption = locationOption;
            this.mCallback = bDLocationCallback;
            TimeOutRunnable timeOutRunnable = new TimeOutRunnable(this, locationOption, bDLocationCallback);
            this.mTimeOutRunnable = timeOutRunnable;
            SystemBaseLocationImpl.this.mHandler.postDelayed(timeOutRunnable, locationOption.getLocationTimeOutMs());
            this.mLocationStartTime = SystemClock.elapsedRealtime();
        }
    }

    public SystemBaseLocationImpl(Context context) {
        super(context);
        this.mHandler = new Handler(C16880lQ.LLJJJJ());
        this.mManager = (LocationManager) C16880lQ.LLILL(context, "location");
        this.mBPEAManager = BDLocationExtrasService.getBPEAManager();
    }

    public BDLocation geocode(BDPoint bDPoint) {
        BDLocation bDLocation = new BDLocation(bDPoint.getProvider(), getLocateName());
        bDLocation.setLatitude(bDPoint.getLatitude());
        bDLocation.setLongitude(bDPoint.getLongitude());
        try {
            return LocationUtil.geocode(this.mContext, bDLocation);
        } catch (Exception e) {
            Logger.e("SystemBaseLocationImpl:geocode error", e);
            return null;
        }
    }

    public void removeListener(LocationListener locationListener) {
        if (locationListener != null) {
            try {
                this.mManager.removeUpdates(locationListener);
            } catch (Exception e) {
                Logger.e("SystemBaseLocationImpl:android stop location error", e);
                return;
            }
        }
        Logger.d("SystemBaseLocationImpl:Android stopLocation");
    }

    private void singleLocation(LocationOption locationOption, Looper looper, BDLocationCallback bDLocationCallback) {
        SystemLocationListener systemLocationListener = new SystemLocationListener(locationOption, bDLocationCallback);
        int mode = locationOption.getMode();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SystemBaseLocationImpl singleLocation mode:");
        LIZ.append(mode);
        LIZ.append("--isOverSeas:");
        LIZ.append(BDLocationConfig.isOverSeas());
        Logger.d(X1D.LIZIZ(LIZ));
        if (mode == 0) {
            if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION")) {
                this.mBPEAManager.requestSingleUpdate(this.mManager, "network", systemLocationListener, looper, locationOption.getBpeaCert());
            }
        } else if (mode == 1) {
            if (!PermissionManager.hasAnyPermission(BDLocationConfig.getFinePermission())) {
                return;
            }
            this.mBPEAManager.requestSingleUpdate(this.mManager, BDLocationConfig.getGPSProvider(), systemLocationListener, looper, locationOption.getBpeaCert());
        } else {
            if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION")) {
                this.mBPEAManager.requestSingleUpdate(this.mManager, "network", systemLocationListener, looper, locationOption.getBpeaCert());
            }
            if (!PermissionManager.hasAnyPermission(BDLocationConfig.getFinePermission())) {
                return;
            }
            this.mBPEAManager.requestSingleUpdate(this.mManager, BDLocationConfig.getGPSProvider(), systemLocationListener, looper, locationOption.getBpeaCert());
        }
    }

    @Override // com.bytedance.bdlocation.api.ILocate
    public void startLocation(BDLocationCallback bDLocationCallback, LocationOption locationOption, Looper looper) {
        Location location;
        Location lastKnownLocation;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!LocationUtil.isLocationEnabled()) {
            bDLocationCallback.onError(new BDLocationException("Location service is not turned on, please turn on the location service switch in settings.", getLocateName(), "2"));
            return;
        }
        if (BDLocationConfig.isBackground()) {
            return;
        }
        try {
            if (PermissionManager.hasAnyPermission(BDLocationConfig.getFinePermission())) {
                location = this.mBPEAManager.getLastKnownLocation(this.mManager, BDLocationConfig.getGPSProvider(), locationOption.getBpeaCert());
                lastKnownLocation = this.mBPEAManager.getLastKnownLocation(this.mManager, "network", locationOption.getBpeaCert());
            } else {
                location = null;
                if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION")) {
                    lastKnownLocation = this.mBPEAManager.getLastKnownLocation(this.mManager, "network", locationOption.getBpeaCert());
                }
                singleLocation(locationOption, looper, bDLocationCallback);
                onLocateStart(getLocateName());
                Logger.d("SystemBaseLocationImpl:Android startLocation");
            }
            if (lastKnownLocation != null && LocationUtil.checkCacheTime(lastKnownLocation.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(lastKnownLocation)) {
                geocodeAndCallback(transform(lastKnownLocation, 4, locationOption.getMode()), locationOption, bDLocationCallback, elapsedRealtime);
                return;
            }
            if (location != null && LocationUtil.checkCacheTime(location.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(location)) {
                geocodeAndCallback(transform(location, 1, locationOption.getMode()), locationOption, bDLocationCallback, elapsedRealtime);
                return;
            }
            singleLocation(locationOption, looper, bDLocationCallback);
            onLocateStart(getLocateName());
            Logger.d("SystemBaseLocationImpl:Android startLocation");
        } catch (Exception e) {
            Logger.i("start location error");
            onError(null, e.getMessage(), "24", bDLocationCallback, elapsedRealtime);
        }
    }

    public BDLocation transform(Location location, int i, int i2) {
        if (location != null) {
            BDLocation bDLocation = new BDLocation(location, getLocateName());
            bDLocation.setLocationType(i);
            bDLocation.setLocationMode(i2);
            bDLocation.setLocationMs(System.currentTimeMillis());
            return bDLocation;
        }
        return null;
    }

    public void geocodeAndCallback(BDLocation bDLocation, LocationOption locationOption, BDLocationCallback bDLocationCallback, long j) {
        BDLocation geocode;
        if (bDLocation == null) {
            onError(null, "location is null", "24", bDLocationCallback, j);
        }
        if (PermissionManager.isFindPermissionGranted(this.mContext)) {
            LocationUtil.markFineLocation(bDLocation);
        } else {
            LocationUtil.markSystemCoarseLocation(bDLocation);
        }
        if (LocationUtil.isNeedAddress(locationOption) && (geocode = geocode(new BDPoint(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider()))) != null) {
            bDLocation = LocationUtil.composeGeocodeLocation(bDLocation, geocode);
        }
        bDLocationCallback.onLocationChanged(bDLocation);
    }

    public void onError(LocationListener locationListener, String str, String str2, BDLocationCallback bDLocationCallback, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SystemBaseLocationImpl location errorCode:");
        LIZ.append(str2);
        LIZ.append("--message:");
        LIZ.append(str);
        Logger.e(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SystemBaseLocationImpl monitor location duration: ");
        LIZ2.append(SystemClock.elapsedRealtime() - j);
        Logger.i(X1D.LIZIZ(LIZ2));
        LocationMonitor.doDesiredLocationDuration(getLocateName(), SystemClock.elapsedRealtime() - j, str2, str, null);
        removeListener(locationListener);
        if (bDLocationCallback != null) {
            bDLocationCallback.onError(new BDLocationException(str, "Android", str2));
        }
    }
}
