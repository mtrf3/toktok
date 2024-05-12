package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC81067Vrj implements View.OnClickListener {
    public final /* synthetic */ C81066Vri LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C71831SHb LJLJI;

    public ViewOnClickListenerC81067Vrj(C81066Vri c81066Vri, String str, C71831SHb c71831SHb) {
        this.LJLIL = c81066Vri;
        this.LJLILLLLZI = str;
        this.LJLJI = c71831SHb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!o.LJ(this.LJLIL.LJLJL, this.LJLILLLLZI) && this.LJLJI.LJLIL) {
            C81066Vri c81066Vri = this.LJLIL;
            String itemName = this.LJLILLLLZI;
            o.LJIIIIZZ(itemName, "itemName");
            c81066Vri.LJLJL = itemName;
            c81066Vri.LJJLL(false);
            c81066Vri.LJLIL.setText(itemName);
            C81066Vri.LJJZ(c81066Vri.LJLILLLLZI, true);
            InterfaceC81070Vrm interfaceC81070Vrm = c81066Vri.LJLJJI;
            if (interfaceC81070Vrm != null) {
                interfaceC81070Vrm.LIZJ(itemName);
            }
        }
    }
}
