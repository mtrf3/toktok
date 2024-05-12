package X;

import android.content.DialogInterface;

/* loaded from: classes14.dex */
public final class UZB implements DialogInterface.OnCancelListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ UZ8 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public UZB(String str, UZ8 uz8, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = uz8;
        this.LJLJI = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        String str = this.LJLIL;
        UZ1.LJFF(this.LJLJI, this.LJLILLLLZI, str, "external_exit");
    }
}
