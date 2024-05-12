package Y;

import X.C68322mC;
import X.InterfaceC93473aRR;
import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes34.dex */
public class IDCListenerS167S0100000_42 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS167S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS167S0100000_42 iDCListenerS167S0100000_42, DialogInterface dialogInterface, int i) {
        ((InterfaceC93473aRR) iDCListenerS167S0100000_42.l0).onCancel();
    }

    public static final void onClick$1(IDCListenerS167S0100000_42 iDCListenerS167S0100000_42, DialogInterface dialogInterface, int i) {
        ((InterfaceC93473aRR) iDCListenerS167S0100000_42.l0).LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(IDCListenerS167S0100000_42 iDCListenerS167S0100000_42, DialogInterface dialogInterface, int i) {
        Dialog dialog = (Dialog) ((C68322mC) iDCListenerS167S0100000_42.l0).element;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void onClick$3(IDCListenerS167S0100000_42 iDCListenerS167S0100000_42, DialogInterface dialogInterface, int i) {
        ((InterfaceC93473aRR) iDCListenerS167S0100000_42.l0).onCancel();
    }

    public static final void onClick$4(IDCListenerS167S0100000_42 iDCListenerS167S0100000_42, DialogInterface dialogInterface, int i) {
        ((InterfaceC93473aRR) iDCListenerS167S0100000_42.l0).LIZ();
    }
}
