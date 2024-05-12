package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.GlO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnClickListenerC42454GlO implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C42453GlN.LIZ(this.LJLIL, this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
        dialogInterface.dismiss();
    }

    public DialogInterfaceOnClickListenerC42454GlO(Activity activity, String str, boolean z, boolean z2) {
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
    }
}
