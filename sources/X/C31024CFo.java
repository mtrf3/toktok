package X;

import Y.IDBReceiverS5S0100000_5;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.CFo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31024CFo {
    public boolean LIZJ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public float LIZLLL = -1.0f;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = 1;
    public int LJII = 1;
    public boolean LJIIIIZZ = true;
    public int LJIIIZ = -1;
    public IDBReceiverS5S0100000_5 LIZ = new IDBReceiverS5S0100000_5(this, 1);
    public IntentFilter LIZIZ = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public final boolean LIZIZ() {
        if (C15380j0.LIZLLL() == null) {
            return this.LJIIJ;
        }
        Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, C15380j0.LIZLLL(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (LJJLIIIJILLIZJL == null) {
            return this.LJIIJ;
        }
        LIZ(LJJLIIIJILLIZJL);
        return this.LJIIJ;
    }

    public final void LIZ(Intent intent) {
        boolean z;
        if (intent == null) {
            return;
        }
        try {
            boolean z2 = false;
            this.LIZLLL = intent.getIntExtra("temperature", 0) / 10.0f;
            this.LJFF = intent.getIntExtra("scale", -1);
            this.LJI = intent.getIntExtra("status", 1);
            this.LJII = intent.getIntExtra("health", 1);
            this.LJIIIIZZ = intent.getBooleanExtra("present", true);
            this.LJIIIZ = intent.getIntExtra("voltage", -1);
            if (C16880lQ.LLJJIJIIJIL(intent, "technology") != null) {
                C16880lQ.LLJJIJIIJIL(intent, "technology");
            }
            int intExtra = intent.getIntExtra("status", -1);
            this.LJ = intent.getIntExtra("level", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJ = z;
            if (this.LJIIJJI || z) {
                z2 = true;
            }
            this.LJIIJJI = z2;
        } catch (Exception e) {
            C0NB.LJI("LiveBatteryManager", e);
        }
    }
}
