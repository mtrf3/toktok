package Y;

import X.BIR;
import X.C41071jL;
import android.content.DialogInterface;

/* loaded from: classes6.dex */
public class IDCListenerS163S0200000_5 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onCancel$0(IDCListenerS163S0200000_5 iDCListenerS163S0200000_5, DialogInterface dialogInterface) {
        C41071jL c41071jL = (C41071jL) iDCListenerS163S0200000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(true);
        }
        ((BIR) iDCListenerS163S0200000_5.l1).LJIIJ((C41071jL) iDCListenerS163S0200000_5.l0, true, null);
    }

    public static final void onCancel$1(IDCListenerS163S0200000_5 iDCListenerS163S0200000_5, DialogInterface dialogInterface) {
        C41071jL c41071jL = (C41071jL) iDCListenerS163S0200000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(false);
        }
        ((BIR) iDCListenerS163S0200000_5.l1).LJIIJJI((C41071jL) iDCListenerS163S0200000_5.l0, true, null);
    }

    public IDCListenerS163S0200000_5(C41071jL c41071jL, BIR bir, int i) {
        this.$t = i;
        this.l0 = c41071jL;
        this.l1 = bir;
    }
}
