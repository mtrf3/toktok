package X;

import android.content.SharedPreferences;

/* renamed from: X.QYs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67194QYs {
    public final String LIZ;
    public final long LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public final /* synthetic */ C67274Qak LJ;

    public final long LIZ() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            this.LIZLLL = this.LJ.LJIIJ().getLong(this.LIZ, this.LIZIZ);
        }
        return this.LIZLLL;
    }

    public final void LIZIZ(long j) {
        SharedPreferences.Editor edit = this.LJ.LJIIJ().edit();
        edit.putLong(this.LIZ, j);
        edit.apply();
        this.LIZLLL = j;
    }

    public C67194QYs(C67274Qak c67274Qak, String str, long j) {
        this.LJ = c67274Qak;
        QH7.LJI(str);
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
