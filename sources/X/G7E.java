package X;

import android.app.Dialog;

/* loaded from: classes8.dex */
public final class G7E implements G7F {
    public final /* synthetic */ Dialog LIZ;
    public final /* synthetic */ G7F LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.G7F
    public final void LIZ() {
        this.LIZ.dismiss();
        this.LIZIZ.LIZ();
        G7D.LIZ(this.LIZJ, "download");
    }

    @Override // X.G7F
    public final void LIZIZ() {
        this.LIZ.dismiss();
        this.LIZIZ.LIZIZ();
        G7D.LIZ(this.LIZJ, "cancel");
    }

    public G7E(Dialog dialog, C40991G6x c40991G6x, String str) {
        this.LIZ = dialog;
        this.LIZIZ = c40991G6x;
        this.LIZJ = str;
    }
}
