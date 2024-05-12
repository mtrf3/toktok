package Y;

import X.C77520Ubc;
import X.C77541Ubx;
import X.InterfaceC77524Ubg;
import X.InterfaceC88472Yns;
import X.UDJ;
import X.UI8;
import android.content.DialogInterface;

/* loaded from: classes14.dex */
public class IDCListenerS287S0100000_13 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            case 3:
                onCancel$3(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS287S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS287S0100000_13 iDCListenerS287S0100000_13, DialogInterface dialogInterface) {
        ((UDJ) iDCListenerS287S0100000_13.l0).cancel();
    }

    public static final void onCancel$1(IDCListenerS287S0100000_13 iDCListenerS287S0100000_13, DialogInterface dialogInterface) {
        ((InterfaceC88472Yns) iDCListenerS287S0100000_13.l0).invoke(0);
    }

    public static final void onCancel$2(IDCListenerS287S0100000_13 iDCListenerS287S0100000_13, DialogInterface dialogInterface) {
        ((InterfaceC88472Yns) iDCListenerS287S0100000_13.l0).invoke(0);
    }

    public static final void onCancel$3(IDCListenerS287S0100000_13 iDCListenerS287S0100000_13, DialogInterface dialogInterface) {
        Runnable runnable;
        C77520Ubc c77520Ubc = (C77520Ubc) iDCListenerS287S0100000_13.l0;
        int i = c77520Ubc.LJIIIZ;
        if (i != 1) {
            if (i == 2 && (runnable = c77520Ubc.LJIIJJI) != null) {
                runnable.run();
            }
        } else {
            Runnable runnable2 = c77520Ubc.LJIIL;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        C77520Ubc c77520Ubc2 = (C77520Ubc) iDCListenerS287S0100000_13.l0;
        UI8 ui8 = c77520Ubc2.LJIILIIL;
        if (ui8 != null) {
            C77541Ubx.LJIJJ(ui8, "dismiss", "dismiss");
        }
        InterfaceC77524Ubg interfaceC77524Ubg = c77520Ubc2.LIZIZ;
        if (interfaceC77524Ubg != null) {
            interfaceC77524Ubg.LIZIZ();
        }
    }
}
