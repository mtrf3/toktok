package X;

import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class GJW implements DialogInterface.OnClickListener {
    public final /* synthetic */ GWN LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public GJW(GWN gwn, Activity activity, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = gwn;
        this.LJLILLLLZI = activity;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        GJT.LIZ.logRestoreDialogClick(false);
        this.LJLIL.LJIILL(this.LJLILLLLZI, null);
        this.LJLJI.invoke(Boolean.FALSE);
        dialogInterface.dismiss();
        C78934UyQ.LJLIL.getBridgeService();
        HE2.LIZ(this.LJLILLLLZI);
    }
}
