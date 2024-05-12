package X;

import android.content.SharedPreferences;

/* renamed from: X.Qap, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67279Qap {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final /* synthetic */ C67274Qak LJ;

    public final void LIZ() {
        this.LJ.LJFF();
        this.LJ.LIZ.LJIILIIL.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.LJ.LJIIJ().edit();
        edit.remove(this.LIZIZ);
        edit.remove(this.LIZJ);
        edit.putLong(this.LIZ, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ C67279Qap(C67274Qak c67274Qak, long j) {
        boolean z;
        this.LJ = c67274Qak;
        QH7.LJI("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZIZ(z);
        this.LIZ = "health_monitor:start";
        this.LIZIZ = "health_monitor:count";
        this.LIZJ = "health_monitor:value";
        this.LIZLLL = j;
    }
}
