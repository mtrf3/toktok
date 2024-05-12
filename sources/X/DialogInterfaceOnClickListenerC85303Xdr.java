package X;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.AqS176S0100000_10;

/* renamed from: X.Xdr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogInterfaceOnClickListenerC85303Xdr implements DialogInterface.OnClickListener {
    public final /* synthetic */ C85258Xd8 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC54674Ld0 LJLJI;
    public final /* synthetic */ Context LJLJJI;

    public DialogInterfaceOnClickListenerC85303Xdr(C85258Xd8 c85258Xd8, long j, InterfaceC54674Ld0 interfaceC54674Ld0, ActivityC45651qj activityC45651qj) {
        this.LJLIL = c85258Xd8;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC54674Ld0;
        this.LJLJJI = activityC45651qj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        C85258Xd8 c85258Xd8 = this.LJLIL;
        String str3 = null;
        if (c85258Xd8 != null) {
            str = c85258Xd8.LIZ;
            str2 = c85258Xd8.LIZIZ;
            str3 = c85258Xd8.LIZJ;
        } else {
            str = null;
            str2 = null;
        }
        C85299Xdn.LJI(0, System.currentTimeMillis() - this.LJLILLLLZI, str, str2, str3, new AqS176S0100000_10(this.LJLJJI, 124));
        InterfaceC54674Ld0 interfaceC54674Ld0 = this.LJLJI;
        if (interfaceC54674Ld0 != null) {
            interfaceC54674Ld0.LIZIZ(1, "cancel in open settings dialog");
        }
    }
}
