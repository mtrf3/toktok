package com.bytedance.bdlocation.api;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.bpea.BDEncryptLocation;
import com.bytedance.bdlocation.entity.bpea.BPEACertCheckResult;

/* loaded from: classes16.dex */
public interface IBPEALocal extends IManager {
    BPEACertCheckResult checkAndTranslateCert(Object obj, String str);

    BDDecryptLocation decryptLocation(String str, String str2, Object obj);

    BDEncryptLocation encryptLocation(double d, double d2, Object obj);

    String getBpeaToken(Object obj);

    Location getLastKnownLocation(LocationManager locationManager, String str, Object obj);

    void requestLocationUpdates(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper, Object obj);

    void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, Object obj);
}
