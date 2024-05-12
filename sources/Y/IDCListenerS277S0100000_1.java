package Y;

import X.C34B;
import X.C97773sb;
import X.C97863sk;
import X.InterfaceC88472Yns;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public class IDCListenerS277S0100000_1 implements DialogInterface.OnCancelListener {
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
            default:
                return;
        }
    }

    public IDCListenerS277S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS277S0100000_1 iDCListenerS277S0100000_1, DialogInterface dialogInterface) {
        C34B.LIZIZ("showSendToSheet", "cancel");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDCListenerS277S0100000_1.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke("cancel");
        }
    }

    public static final void onCancel$1(IDCListenerS277S0100000_1 iDCListenerS277S0100000_1, DialogInterface dialogInterface) {
        C97863sk.LIZJ("click_background");
        ((C97773sb) iDCListenerS277S0100000_1.l0).LIZ(2);
        C97863sk.LIZJ("maybe_later");
    }
}
