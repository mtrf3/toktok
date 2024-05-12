package X;

import android.app.Application;

/* loaded from: classes12.dex */
public class QOM implements InterfaceC66881QMr {
    public final Application LIZ;

    @Override // X.InterfaceC66881QMr
    public final void LIZ() {
        QOV.LIZLLL = true;
        if (QOV.LIZJ.get()) {
            QOV.LIZ.LJ(2, this.LIZ);
        }
    }

    @Override // X.InterfaceC66881QMr
    public final void LIZIZ() {
        QOV.LIZLLL = false;
        if (QOV.LIZJ.get()) {
            QOV.LIZ.LJ(1, this.LIZ);
        }
    }

    public QOM(Application application) {
        this.LIZ = application;
    }
}
