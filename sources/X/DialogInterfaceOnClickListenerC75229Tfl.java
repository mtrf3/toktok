package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC75229Tfl implements DialogInterface.OnClickListener {
    public final /* synthetic */ EnumC75614Tly LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC75230Tfm LJLJI;

    public DialogInterfaceOnClickListenerC75229Tfl(EnumC75614Tly enumC75614Tly, String str, InterfaceC75230Tfm interfaceC75230Tfm) {
        this.LJLIL = enumC75614Tly;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC75230Tfm;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface d, int i) {
        o.LJIIIZ(d, "d");
        C75017TcL.LJIILL(this.LJLIL, this.LJLILLLLZI, true);
        this.LJLJI.LIZIZ();
        d.dismiss();
    }
}
