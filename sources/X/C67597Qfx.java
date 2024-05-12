package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Qfx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67597Qfx {
    public final Context LIZ;

    public final C67280Qaq LIZJ() {
        return C68033Qmz.LJIIZILJ(this.LIZ, null, null).LIZJ();
    }

    public C67597Qfx(Context context) {
        QH7.LJIIIIZZ(context);
        this.LIZ = context;
    }

    public final void LIZ(Intent intent) {
        if (intent == null) {
            LIZJ().LJFF.LIZ("onRebind called with null intent");
        } else {
            LIZJ().LJIILIIL.LIZIZ(intent.getAction(), "onRebind called. action");
        }
    }

    public final void LIZIZ(Intent intent) {
        if (intent == null) {
            LIZJ().LJFF.LIZ("onUnbind called with null intent");
        } else {
            LIZJ().LJIILIIL.LIZIZ(intent.getAction(), "onUnbind called for intent. action");
        }
    }
}
