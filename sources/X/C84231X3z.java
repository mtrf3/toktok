package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.X3z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84231X3z implements IBinder.DeathRecipient {
    public final /* synthetic */ ARunnableS34S0200000_15 LJLIL;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ServiceConnectionC84229X3x.LJLJLJ = false;
        ServiceConnectionC84229X3x serviceConnectionC84229X3x = (ServiceConnectionC84229X3x) this.LJLIL.l1;
        serviceConnectionC84229X3x.getClass();
        if (Build.VERSION.SDK_INT < 26 && !ServiceConnectionC84229X3x.LJLJLJ) {
            if (ServiceConnectionC84229X3x.LJLJLLL > 5) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZIZ("SqlDownloadCacheAidlWra", "bindMainProcessDelayed", "Bind too many times");
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ServiceConnectionC84229X3x.LJLL < LivePlayEnforceIntervalSetting.DEFAULT) {
                    if (C65210PiY.LIZ()) {
                        C65210PiY.LIZIZ("SqlDownloadCacheAidlWra", "bindMainProcessDelayed", "Time too short since last bin");
                    }
                } else {
                    ServiceConnectionC84229X3x.LJLJLLL++;
                    ServiceConnectionC84229X3x.LJLL = currentTimeMillis;
                    serviceConnectionC84229X3x.LJLILLLLZI.postDelayed(new ARunnableS51S0100000_15(serviceConnectionC84229X3x, 133), 1000L);
                    return;
                }
            }
        }
        ServiceConnectionC84229X3x serviceConnectionC84229X3x2 = (ServiceConnectionC84229X3x) this.LJLIL.l1;
        if (serviceConnectionC84229X3x2.LJLJJI != null) {
            serviceConnectionC84229X3x2.LJLILLLLZI.postDelayed(serviceConnectionC84229X3x2.LJLJJL, 2000L);
        }
    }

    public C84231X3z(ARunnableS34S0200000_15 aRunnableS34S0200000_15) {
        this.LJLIL = aRunnableS34S0200000_15;
    }
}
