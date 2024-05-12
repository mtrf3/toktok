package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.O8q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnDismissListenerC61420O8q implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C61419O8p LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public DialogInterfaceOnDismissListenerC61420O8q(C61419O8p c61419O8p, long j) {
        this.LJLIL = c61419O8p;
        this.LJLILLLLZI = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        EnumC61424O8u enumC61424O8u;
        o.LJIIIIZZ(it, "it");
        if (o.LJ(ASQ.LJIIIIZZ(it), ASY.LIZ)) {
            enumC61424O8u = EnumC61424O8u.EXIT_BUTTON;
        } else {
            enumC61424O8u = EnumC61424O8u.OTHER_AREA;
        }
        C61419O8p c61419O8p = this.LJLIL;
        c61419O8p.LJLJL = false;
        AbstractC60787NtP abstractC60787NtP = c61419O8p.LJLIL;
        if (abstractC60787NtP != null) {
            abstractC60787NtP.LIZIZ(enumC61424O8u, System.currentTimeMillis() - this.LJLILLLLZI);
        }
    }
}
