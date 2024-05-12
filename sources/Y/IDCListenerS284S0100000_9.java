package Y;

import X.C54791Let;
import X.C54917Lgv;
import X.C55274Lmg;
import X.C56818MRq;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.DialogInterface;

/* loaded from: classes10.dex */
public class IDCListenerS284S0100000_9 implements DialogInterface.OnCancelListener {
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
            case 4:
                onCancel$4(this, dialogInterface);
                return;
            case 5:
                onCancel$5(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS284S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        Runnable runnable = ((C55274Lmg) iDCListenerS284S0100000_9.l0).LJLJLJ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onCancel$1(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        ((C54917Lgv) iDCListenerS284S0100000_9.l0).getClass();
        C54917Lgv.LJIIIIZZ("x");
    }

    public static final void onCancel$2(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        Runnable runnable = ((C55274Lmg) iDCListenerS284S0100000_9.l0).LJLJLJ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onCancel$3(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        Runnable runnable = ((C55274Lmg) iDCListenerS284S0100000_9.l0).LJLJLJ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onCancel$4(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        ((C56818MRq) iDCListenerS284S0100000_9.l0).LJLZ("cancel");
    }

    public static final void onCancel$5(IDCListenerS284S0100000_9 iDCListenerS284S0100000_9, DialogInterface dialogInterface) {
        InterfaceC88472Yns<DialogInterface, C76800UCe> interfaceC88472Yns = ((C54791Let) iDCListenerS284S0100000_9.l0).LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(dialogInterface);
        }
    }
}
