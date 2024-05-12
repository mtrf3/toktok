package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.Pta, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogInterfaceOnClickListenerC65894Pta implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ C65889PtV LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public DialogInterfaceOnClickListenerC65894Pta(Activity activity, C65889PtV c65889PtV, String str) {
        this.LJLIL = activity;
        this.LJLILLLLZI = c65889PtV;
        this.LJLJI = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = this.LJLIL;
        c78450Uqc.LJ = new C65893PtZ(this.LJLILLLLZI, this.LJLJI);
        LJIIIIZZ.showLoginAndRegisterView(c78450Uqc.LIZ());
    }
}
