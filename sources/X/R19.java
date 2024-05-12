package X;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class R19 {
    public static final long LIZ = TimeUnit.MINUTES.toMillis(10);
    public static final long LIZIZ = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(Activity activity, C67646Qgk c67646Qgk) {
        R1A r1a = new R1A();
        int incrementAndGet = R1A.LJLJJLL.incrementAndGet();
        r1a.LJLIL = incrementAndGet;
        R1A.LJLJJL.put(incrementAndGet, r1a);
        R1A.LJLJJI.postDelayed(r1a, LIZ);
        c67646Qgk.LIZIZ(r1a);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        Bundle LIZLLL = C1DG.LIZLLL("resolveCallId", r1a.LJLIL, "requestCode", 1001);
        LIZLLL.putLong("initializationElapsedRealtime", LIZIZ);
        R18 r18 = new R18();
        r18.setArguments(LIZLLL);
        int i = r1a.LJLIL;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i);
        beginTransaction.add(r18, sb.toString()).commit();
    }
}
