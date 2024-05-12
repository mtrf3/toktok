package X;

import android.content.Intent;

/* renamed from: X.QaZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67263QaZ extends AbstractDialogInterfaceOnClickListenerC66636QDg {
    public final /* synthetic */ Intent LJLIL;
    public final /* synthetic */ InterfaceC67296Qb6 LJLILLLLZI;

    public C67263QaZ(Intent intent, InterfaceC67296Qb6 interfaceC67296Qb6) {
        this.LJLIL = intent;
        this.LJLILLLLZI = interfaceC67296Qb6;
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66636QDg
    public final void LIZ() {
        Intent intent = this.LJLIL;
        if (intent != null) {
            this.LJLILLLLZI.startActivityForResult(intent, 2);
        }
    }
}
