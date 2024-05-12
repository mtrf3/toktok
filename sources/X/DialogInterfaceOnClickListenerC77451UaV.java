package X;

import android.content.DialogInterface;

/* renamed from: X.UaV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77451UaV implements DialogInterface.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public DialogInterfaceOnClickListenerC77451UaV(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C77448UaS.LIZ(this.LJLIL, "anchor_income", this.LJLILLLLZI, false);
    }
}
