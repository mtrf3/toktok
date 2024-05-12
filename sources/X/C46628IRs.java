package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: X.IRs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46628IRs extends W8S {
    public final PowerManager LJLJI;
    public final BatteryManager LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public long LJLJLJ;

    public final synchronized void LJI() {
        boolean z;
        BatteryManager batteryManager;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJLJLJ;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.LJLJLJ = elapsedRealtime;
            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, (Context) this.LJLIL, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (LJJLIIIJILLIZJL == null) {
                return;
            }
            int intExtra = LJJLIIIJILLIZJL.getIntExtra("status", -1);
            if (intExtra != 2 && (intExtra != 5 || Build.VERSION.SDK_INT < 23 || (batteryManager = this.LJLJJI) == null || !batteryManager.isCharging())) {
                z = false;
                this.LJLJJL = z;
                this.LJLJJLL = LJJLIIIJILLIZJL.getIntExtra("level", 0);
                this.LJLJL = LJJLIIIJILLIZJL.getIntExtra("temperature", 0) / 10.0f;
            }
            z = true;
            this.LJLJJL = z;
            this.LJLJJLL = LJJLIIIJILLIZJL.getIntExtra("level", 0);
            this.LJLJL = LJJLIIIJILLIZJL.getIntExtra("temperature", 0) / 10.0f;
        }
    }

    public C46628IRs(Context context, InterfaceC46627IRr interfaceC46627IRr) {
        super(context, interfaceC46627IRr);
        this.LJLJI = (PowerManager) C16880lQ.LLILL(context, "power");
        this.LJLJJI = (BatteryManager) C16880lQ.LLILL(context, "batterymanager");
    }
}
