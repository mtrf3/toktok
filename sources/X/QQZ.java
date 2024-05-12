package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes12.dex */
public final class QQZ implements InterfaceC66998QRe {
    @Override // X.InterfaceC66998QRe
    public final void LIZ() {
    }

    @Override // X.InterfaceC66998QRe
    public final void LIZIZ(Context context, java.util.Map<String, String> map) {
    }

    @Override // X.InterfaceC67018QRy
    public final void LIZJ(Intent intent) {
    }

    @Override // X.InterfaceC67018QRy
    public final void LJ() {
    }

    @Override // X.InterfaceC67018QRy
    public final void LJFF(Context context) {
    }

    @Override // X.InterfaceC66998QRe
    public final void LIZLLL(Context context, C60016Ngy c60016Ngy) {
        String LIZ;
        if (!C36929EeT.LJFF(context) && (LIZ = FCD.LIZ(context)) != null && LIZ.endsWith(":push")) {
            C36929EeT.LIZ = Boolean.FALSE;
            try {
                QP5.LIZ().LIZJ(new ARunnableS47S0100000_11(c60016Ngy, 12));
            } catch (Throwable unused) {
            }
        }
    }
}
