package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.UtL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC78619UtL implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    public DialogInterfaceOnClickListenerC78619UtL(Context context, String str, Bundle bundle) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = bundle;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        HG3.LJFF().changeEmail((Activity) this.LJLIL, this.LJLILLLLZI, this.LJLJI, null);
    }
}
