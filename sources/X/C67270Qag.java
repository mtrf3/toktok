package X;

import android.app.Dialog;

/* renamed from: X.Qag, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67270Qag extends AbstractC61220O0y {
    public final /* synthetic */ Dialog LIZ;
    public final /* synthetic */ RunnableC67268Qae LIZIZ;

    public C67270Qag(RunnableC67268Qae runnableC67268Qae, Dialog dialog) {
        this.LIZIZ = runnableC67268Qae;
        this.LIZ = dialog;
    }

    @Override // X.AbstractC61220O0y
    public final void LIZ() {
        this.LIZIZ.LJLILLLLZI.LJIIJJI();
        if (this.LIZ.isShowing()) {
            this.LIZ.dismiss();
        }
    }
}
