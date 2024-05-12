package X;

import android.content.DialogInterface;
import android.os.SystemClock;

/* loaded from: classes13.dex */
public final class S4X implements DialogInterface.OnDismissListener {
    public final /* synthetic */ S4U LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public S4X(long j, S4U s4u) {
        this.LJLIL = s4u;
        this.LJLILLLLZI = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C27949Ay1.LJJIIZ(true, "return", null, null, this.LJLIL.LJ, Long.valueOf(SystemClock.elapsedRealtime() - this.LJLILLLLZI), "quit_pay_reason", null, Boolean.FALSE, null, null, null, 3584);
    }
}
