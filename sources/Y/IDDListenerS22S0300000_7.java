package Y;

import X.C41047G9b;
import X.InterfaceC41048G9c;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDDListenerS22S0300000_7 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onDismiss$0(IDDListenerS22S0300000_7 iDDListenerS22S0300000_7, DialogInterface dialog) {
        ((InterfaceC41048G9c) iDDListenerS22S0300000_7.l0).LIZ((Fragment) iDDListenerS22S0300000_7.l1);
        C41047G9b c41047G9b = (C41047G9b) iDDListenerS22S0300000_7.l2;
        o.LJIIIIZZ(dialog, "dialog");
        c41047G9b.LJJLIIJ(dialog);
    }

    public static final void onDismiss$1(IDDListenerS22S0300000_7 iDDListenerS22S0300000_7, DialogInterface dialog) {
        ((InterfaceC41048G9c) iDDListenerS22S0300000_7.l0).LIZ((Fragment) iDDListenerS22S0300000_7.l1);
        C41047G9b c41047G9b = (C41047G9b) iDDListenerS22S0300000_7.l2;
        o.LJIIIIZZ(dialog, "dialog");
        c41047G9b.LJJLIIJ(dialog);
    }

    public IDDListenerS22S0300000_7(InterfaceC41048G9c interfaceC41048G9c, Fragment fragment, C41047G9b c41047G9b, int i) {
        this.$t = i;
        this.l0 = interfaceC41048G9c;
        this.l1 = fragment;
        this.l2 = c41047G9b;
    }
}
