package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASM extends AbstractC26257ASf {
    public final /* synthetic */ TuxSheet LIZ;

    public ASM(TuxSheet tuxSheet) {
        this.LIZ = tuxSheet;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        Dialog dialog;
        Window window;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        TuxSheet tuxSheet = this.LIZ;
        Object obj = tuxSheet.LJLLI;
        if (obj == null) {
            obj = tuxSheet.LJLLILLLL;
        }
        if (obj instanceof InterfaceC25830ABu) {
            ((InterfaceC25830ABu) obj).I7(tuxSheet, f);
        }
        TuxSheet tuxSheet2 = this.LIZ;
        if (tuxSheet2.LJLLJ && f <= 0.0f && (dialog = tuxSheet2.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount((1 + f) * 0.5f);
        }
        this.LIZ.Dl(bottomSheet);
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        boolean z;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        TuxSheet tuxSheet = this.LIZ;
        Object obj = tuxSheet.LJLLI;
        if (obj == null) {
            obj = tuxSheet.LJLLILLLL;
        }
        if (obj instanceof InterfaceC25830ABu) {
            ((InterfaceC25830ABu) obj).Pg(tuxSheet, i);
        }
        TuxSheet tuxSheet2 = this.LIZ;
        if (tuxSheet2.LJLLLL == 3) {
            if (i != 3) {
                z = true;
            } else {
                z = false;
            }
            tuxSheet2.Hl(z);
        }
        this.LIZ.Dl(bottomSheet);
    }
}
