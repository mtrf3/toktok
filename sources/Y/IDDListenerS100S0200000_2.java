package Y;

import X.ActivityC45651qj;
import X.C1557569j;
import X.C156916Dv;
import X.C62819Ol5;
import X.C63C;
import X.H8F;
import X.InterfaceC65784Pro;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDDListenerS100S0200000_2 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS100S0200000_2 iDDListenerS100S0200000_2, DialogInterface dialogInterface) {
        C1557569j c1557569j = ((C63C) iDDListenerS100S0200000_2.l0).LJLLL;
        if (c1557569j != null) {
            FragmentManager supportFragmentManager = ((ActivityC45651qj) iDDListenerS100S0200000_2.l1).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            c1557569j.LLJJIJI(supportFragmentManager);
        }
    }

    public static final void onDismiss$1(IDDListenerS100S0200000_2 iDDListenerS100S0200000_2, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS100S0200000_2.l0).invoke();
        if (!C156916Dv.LJIILIIL) {
            H8F.LJJIL(C62819Ol5.LJIJ(((C156916Dv) iDDListenerS100S0200000_2.l1).LIZ), ((C156916Dv) iDDListenerS100S0200000_2.l1).LIZIZ, "other", 24);
        }
    }

    public IDDListenerS100S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
