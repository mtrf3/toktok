package X;

import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEW extends EFV {
    public static final EEW LIZ = new EEW();

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1205) {
            if (i != 1207) {
                if (i != 1208) {
                    return;
                }
                C36093EEn.LIZ.getClass();
                EEX eex = C36093EEn.LJIIJJI;
                if (eex == null) {
                    return;
                }
                eex.LIZ(EEV.COLD_BOOT_END_LONG);
                return;
            }
            C36093EEn.LIZ.getClass();
            EEX eex2 = C36093EEn.LJIIJJI;
            if (eex2 == null) {
                return;
            }
            eex2.LIZ(EEV.COLD_BOOT_END_SHORT);
            return;
        }
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZJ();
    }
}
