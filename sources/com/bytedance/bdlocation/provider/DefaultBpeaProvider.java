package com.bytedance.bdlocation.provider;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.bpea.BDEncryptLocation;
import com.bytedance.bdlocation.entity.bpea.BPEACertCheckResult;

/* loaded from: classes16.dex */
public class DefaultBpeaProvider implements IBPEALocal {
    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BDDecryptLocation decryptLocation(String str, String str2, Object obj) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BDEncryptLocation encryptLocation(double d, double d2, Object obj) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public String getBpeaToken(Object obj) {
        return "DefaultBpeaProvider";
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public Location getLastKnownLocation(LocationManager locationManager, String str, Object obj) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BPEACertCheckResult checkAndTranslateCert(Object obj, String str) {
        return new BPEACertCheckResult();
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, Object obj) {
        locationListener.onLocationChanged((Location) null);
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public void requestLocationUpdates(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper, Object obj) {
        locationListener.onLocationChanged((Location) null);
    }
}
