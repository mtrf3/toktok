package X;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes8.dex */
public final class HST extends TAT {
    public final /* synthetic */ HSS LJLJJI;
    public final /* synthetic */ C188727au LJLJJL;
    public final /* synthetic */ Dialog LJLJJLL;

    @Override // X.TAT
    public final void LIZ(View view) {
        if (view != null) {
            this.LJLJJI.LJIIIIZZ(this.LJLJJL);
            if (this.LJLJJI.LJJIIJZLJL()) {
                this.LJLJJLL.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HST(HSS hss, C188727au c188727au, Dialog dialog) {
        super(700L);
        this.LJLJJI = hss;
        this.LJLJJL = c188727au;
        this.LJLJJLL = dialog;
    }
}
