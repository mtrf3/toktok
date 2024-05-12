package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.QDh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66637QDh extends AbstractDialogInterfaceOnClickListenerC66636QDg {
    public final /* synthetic */ Intent LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C66637QDh(Activity activity, int i, Intent intent) {
        this.LJLIL = intent;
        this.LJLILLLLZI = activity;
        this.LJLJI = i;
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC66636QDg
    public final void LIZ() {
        Intent intent = this.LJLIL;
        if (intent != null) {
            C16880lQ.LJFF(this.LJLILLLLZI, this.LJLJI, intent);
        }
    }
}
