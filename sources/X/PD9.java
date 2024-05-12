package X;

import android.content.SharedPreferences;
import android.os.Process;

/* loaded from: classes12.dex */
public final class PD9 implements InterfaceC64219PIh {
    public final /* synthetic */ C64171PGl LIZ;

    @Override // X.InterfaceC64219PIh
    public final void LIZ() {
    }

    @Override // X.InterfaceC64219PIh
    public final void LIZJ() {
    }

    @Override // X.InterfaceC64219PIh
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC64219PIh
    public final void LJ() {
    }

    @Override // X.InterfaceC64219PIh
    public final void LIZIZ() {
        SharedPreferences sharedPreferences = this.LIZ.LIZLLL;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String LJIJJ = PC5.LJIJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Process.myPid());
            LIZ.append(",");
            LIZ.append(true);
            edit.putString(LJIJJ, X1D.LIZIZ(LIZ)).apply();
        }
    }

    @Override // X.InterfaceC64219PIh
    public final void onBackground() {
        SharedPreferences sharedPreferences = this.LIZ.LIZLLL;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String LJIJJ = PC5.LJIJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Process.myPid());
            LIZ.append(",");
            LIZ.append(false);
            edit.putString(LJIJJ, X1D.LIZIZ(LIZ)).apply();
        }
    }

    public PD9(C64171PGl c64171PGl) {
        this.LIZ = c64171PGl;
    }
}
