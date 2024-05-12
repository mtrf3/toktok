package X;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class P8A extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, C76800UCe> {
    public final /* synthetic */ LocationManager LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ LocationListener LJLJJL;
    public final /* synthetic */ Looper LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P8A(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper) {
        super(1);
        this.LJLIL = locationManager;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = f;
        this.LJLJJL = locationListener;
        this.LJLJJLL = looper;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C66300Q0i c66300Q0i) {
        LocationManager locationManager = this.LJLIL;
        String str = this.LJLILLLLZI;
        long j = this.LJLJI;
        float f = this.LJLJJI;
        LocationListener locationListener = this.LJLJJL;
        Looper looper = this.LJLJJLL;
        if (!new C03880Dg(2).LIZJ(100001, "android/location/LocationManager", "requestLocationUpdates", locationManager, new Object[]{str, Long.valueOf(j), Float.valueOf(f), locationListener, looper}, "void", new C65300Pk0(false, "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V", "5180359958872162344")).LIZ) {
            locationManager.requestLocationUpdates(str, j, f, locationListener, looper);
        }
        return C76800UCe.LIZ;
    }
}
