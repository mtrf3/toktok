package X;

import android.content.DialogInterface;

/* renamed from: X.Ojj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnShowListenerC62735Ojj implements DialogInterface.OnShowListener {
    public final /* synthetic */ C62906OmU LJLIL;
    public final /* synthetic */ C62907OmV LJLILLLLZI;
    public final /* synthetic */ C62907OmV LJLJI;
    public final /* synthetic */ C62907OmV LJLJJI;

    public DialogInterfaceOnShowListenerC62735Ojj(C62906OmU c62906OmU, C62907OmV c62907OmV, C62907OmV c62907OmV2, C62907OmV c62907OmV3) {
        this.LJLIL = c62906OmU;
        this.LJLILLLLZI = c62907OmV;
        this.LJLJI = c62907OmV2;
        this.LJLJJI = c62907OmV3;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.LJLIL.LJFF(-1, this.LJLILLLLZI);
        this.LJLIL.LJFF(-2, this.LJLJI);
        this.LJLIL.LJFF(-3, this.LJLJJI);
        C62906OmU c62906OmU = this.LJLIL;
        DialogInterface.OnShowListener onShowListener = c62906OmU.LJLJJLL;
        if (onShowListener != null) {
            onShowListener.onShow(c62906OmU);
        }
    }
}
