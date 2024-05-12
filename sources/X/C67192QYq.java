package X;

import android.content.SharedPreferences;

/* renamed from: X.QYq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67192QYq {
    public final String LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public final /* synthetic */ C67274Qak LIZLLL;

    public final String LIZ() {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZJ = this.LIZLLL.LJIIJ().getString(this.LIZ, null);
        }
        return this.LIZJ;
    }

    public final void LIZIZ(String str) {
        SharedPreferences.Editor edit = this.LIZLLL.LJIIJ().edit();
        edit.putString(this.LIZ, str);
        edit.apply();
        this.LIZJ = str;
    }

    public C67192QYq(C67274Qak c67274Qak, String str) {
        this.LIZLLL = c67274Qak;
        QH7.LJI(str);
        this.LIZ = str;
    }
}
