package X;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.Pdn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64915Pdn implements InterfaceC64900PdY, InterfaceC65108Pgu {
    public static final C64915Pdn LIZ = new C64915Pdn();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C64916Pdo.LJLIL);

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        TimerTask timerTask = (TimerTask) C64904Pdc.LIZ(this, c37826Esw);
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        J96 j96 = new J96(c64907Pdf);
        ((Timer) LIZIZ.getValue()).schedule(j96, 3000L);
        C64904Pdc.LIZJ(this, c37826Esw, j96);
    }
}
