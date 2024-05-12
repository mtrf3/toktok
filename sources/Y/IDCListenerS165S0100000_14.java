package Y;

import X.C40211FqJ;
import X.C79501VIb;
import X.C82351WTr;
import X.C82552Waa;
import X.InterfaceC65784Pro;
import X.InterfaceC82969WhJ;
import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: classes15.dex */
public class IDCListenerS165S0100000_14 implements DialogInterface.OnClickListener {
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
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS165S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS165S0100000_14.l0).invoke();
    }

    public static final void onClick$1(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS165S0100000_14.l0).invoke();
    }

    public static final void onClick$2(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS165S0100000_14.l0).invoke();
    }

    public static final void onClick$3(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        C40211FqJ.LIZIZ(((C82351WTr) iDCListenerS165S0100000_14.l0).LIZIZ);
    }

    public static final void onClick$4(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        ((Activity) iDCListenerS165S0100000_14.l0).finish();
    }

    public static final void onClick$5(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        ((C82552Waa) iDCListenerS165S0100000_14.l0).LJLJJI.LJFF();
    }

    public static final void onClick$6(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        InterfaceC82969WhJ interfaceC82969WhJ = (InterfaceC82969WhJ) iDCListenerS165S0100000_14.l0;
        C79501VIb c79501VIb = new C79501VIb();
        c79501VIb.LIZ = "cancel";
        interfaceC82969WhJ.LIZ(c79501VIb, "");
    }

    public static final void onClick$7(IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, DialogInterface dialogInterface, int i) {
        InterfaceC82969WhJ interfaceC82969WhJ = (InterfaceC82969WhJ) iDCListenerS165S0100000_14.l0;
        C79501VIb c79501VIb = new C79501VIb();
        c79501VIb.LIZ = "confirm";
        interfaceC82969WhJ.LIZ(c79501VIb, "");
    }
}
