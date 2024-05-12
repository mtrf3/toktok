package X;

import android.content.DialogInterface;

/* renamed from: X.BIk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC28550BIk implements DialogInterface.OnCancelListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public DialogInterfaceOnCancelListenerC28550BIk(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        CLE.LIZ(this.LJLILLLLZI, "dismiss", this.LJLIL);
    }
}
