package X;

import android.content.SharedPreferences;

/* renamed from: X.QYk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67186QYk {
    public final String LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final /* synthetic */ C67274Qak LJ;

    public final boolean LIZIZ() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            this.LIZLLL = this.LJ.LJIIJ().getBoolean(this.LIZ, this.LIZIZ);
        }
        return this.LIZLLL;
    }

    public final void LIZ(boolean z) {
        SharedPreferences.Editor edit = this.LJ.LJIIJ().edit();
        edit.putBoolean(this.LIZ, z);
        edit.apply();
        this.LIZLLL = z;
    }

    public C67186QYk(C67274Qak c67274Qak, String str, boolean z) {
        this.LJ = c67274Qak;
        QH7.LJI(str);
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
