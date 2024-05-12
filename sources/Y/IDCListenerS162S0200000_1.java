package Y;

import X.ASP;
import X.ASQ;
import X.ASW;
import X.ASX;
import X.C4HQ;
import X.C4IJ;
import X.C97293rp;
import X.InterfaceC88472Yns;
import X.V1B;
import android.content.DialogInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCListenerS162S0200000_1 implements DialogInterface.OnCancelListener {
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

    public static final void onCancel$0(IDCListenerS162S0200000_1 iDCListenerS162S0200000_1, DialogInterface it) {
        Object obj;
        Object obj2;
        o.LJIIIIZZ(it, "it");
        boolean z = it instanceof ASP;
        if (z) {
            obj = ((ASP) it).LJLL;
        } else {
            obj = ASX.LIZ;
        }
        V1B.LJIIZILJ(obj.toString());
        if (z) {
            obj2 = ((ASP) it).LJLL;
        } else {
            obj2 = ASX.LIZ;
        }
        if (o.LJ(obj2, ASW.LIZ)) {
            ((InterfaceC88472Yns) iDCListenerS162S0200000_1.l0).invoke("slide_right");
            ASQ.LIZLLL((C97293rp) iDCListenerS162S0200000_1.l1, ASX.LIZ);
        } else {
            ((InterfaceC88472Yns) iDCListenerS162S0200000_1.l0).invoke("click_gray");
            ASQ.LIZLLL((C97293rp) iDCListenerS162S0200000_1.l1, ASX.LIZ);
        }
    }

    public static final void onCancel$1(IDCListenerS162S0200000_1 iDCListenerS162S0200000_1, DialogInterface dialogInterface) {
        C4HQ c4hq = (C4HQ) iDCListenerS162S0200000_1.l0;
        C4IJ c4ij = (C4IJ) iDCListenerS162S0200000_1.l1;
        c4ij.getClass();
        c4hq.LIZ(new ArrayList(c4ij.LJLJLJ));
    }

    public IDCListenerS162S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
