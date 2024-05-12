package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;

/* renamed from: X.02E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02E {
    public static C02E LIZLLL;
    public final Context LIZ;
    public final LocationManager LIZIZ;
    public final C02D LIZJ = new C02D();

    public static Location LIZ(LocationManager locationManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(ImagePreloadExperiment.PRIORITY_DEFAULT, "android/location/LocationManager", "getLastKnownLocation", locationManager, new Object[]{str}, "android.location.Location", new C65300Pk0(false, "(Ljava/lang/String;)Landroid/location/Location;", "7721984550929939485"));
        return LIZJ.LIZ ? (Location) LIZJ.LIZIZ : locationManager.getLastKnownLocation(str);
    }

    public C02E(Context context, LocationManager locationManager) {
        this.LIZ = context;
        this.LIZIZ = locationManager;
    }
}
