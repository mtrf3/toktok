package X;

import Y.IDRunnableS6S0101000;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Isc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47998Isc {
    public TelephonyManager LIZ;
    public C47997Isb LIZIZ;
    public final AtomicInteger LIZJ = new AtomicInteger(-1);
    public volatile int LIZLLL = -1;

    public final int LIZ() {
        return this.LIZJ.get();
    }

    public final void LIZIZ() {
        C37179EiV.LJFF.post(new IDRunnableS6S0101000(3, this, 30));
    }

    public final void LIZJ(AwemeHostApplication awemeHostApplication) {
        this.LIZLLL = -1;
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(awemeHostApplication, "connectivity");
        this.LIZ = (TelephonyManager) C16880lQ.LLILL(awemeHostApplication, "phone");
        LIZLLL(SubscriptionManager.getDefaultDataSubscriptionId());
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12).addTransportType(0);
        connectivityManager.registerNetworkCallback(builder.build(), new C47996Isa(this));
    }

    public final void LIZLLL(int i) {
        int networkType;
        this.LIZ.createForSubscriptionId(i);
        this.LIZLLL = i;
        AtomicInteger atomicInteger = this.LIZJ;
        TelephonyManager telephonyManager = this.LIZ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "-4330519614360987500");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            networkType = ((Integer) LIZJ.LIZIZ).intValue();
        } else {
            networkType = telephonyManager.getNetworkType();
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        }
        atomicInteger.set(networkType);
        C47997Isb c47997Isb = this.LIZIZ;
        if (c47997Isb != null) {
            this.LIZ.listen(c47997Isb, 0);
        } else {
            this.LIZIZ = new C47997Isb(this);
        }
        this.LIZ.listen(this.LIZIZ, 64);
    }
}
