package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import kotlin.jvm.internal.AqS33S1300000_11;
import kotlin.jvm.internal.AqS64S1100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P8B {
    public static final P8C LIZ = new P8C();

    public static final Location LIZ(LocationManager getLastKnownLocation, String provider, Cert cert) {
        LIZ.getClass();
        o.LJIIJ(getLastKnownLocation, "$this$getLastKnownLocation");
        o.LJIIJ(provider, "provider");
        OHW LIZ2 = P8C.LIZ(ImagePreloadExperiment.PRIORITY_DEFAULT, cert, "location_getLastKnownLocation");
        C78929UyL.LIZIZ(LIZ2, "android/location/LocationManager", "getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;", C51029K0z.LJJIIZI(new OSZ("provider", provider)));
        return (Location) C39207Fa7.LIZ(LIZ2, new AqS64S1100000_11(getLastKnownLocation, provider, 8));
    }

    public static final void LIZJ(LocationManager requestSingleUpdate, String provider, LocationListener listener, Looper looper, Cert cert) {
        LIZ.getClass();
        o.LJIIJ(requestSingleUpdate, "$this$requestSingleUpdate");
        o.LJIIJ(provider, "provider");
        o.LJIIJ(listener, "listener");
        OHW LIZ2 = P8C.LIZ(100002, cert, "location_requestSingleUpdate");
        C78929UyL.LIZIZ(LIZ2, "android/location/LocationManager", "requestSingleUpdate(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V", C113554cx.LJJL(new OSZ("provider", provider), new OSZ("listener", listener), new OSZ("looper", looper)));
        C39207Fa7.LIZ(LIZ2, new AqS33S1300000_11(requestSingleUpdate, provider, listener, looper, 2));
    }

    public static final void LIZIZ(LocationManager requestLocationUpdates, String provider, long j, float f, LocationListener listener, Looper looper, Cert cert) {
        LIZ.getClass();
        o.LJIIJ(requestLocationUpdates, "$this$requestLocationUpdates");
        o.LJIIJ(provider, "provider");
        o.LJIIJ(listener, "listener");
        OHW LIZ2 = P8C.LIZ(100001, cert, "location_requestLocationUpdates");
        C78929UyL.LIZIZ(LIZ2, "android/location/LocationManager", "requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V", C113554cx.LJJL(new OSZ("provider", provider), new OSZ("minTimeMs", Long.valueOf(j)), new OSZ("minDistanceM", Float.valueOf(f)), new OSZ("listener", listener), new OSZ("looper", looper)));
        C39207Fa7.LIZ(LIZ2, new P8A(requestLocationUpdates, provider, j, f, listener, looper));
    }
}
