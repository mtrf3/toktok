package X;

import android.widget.ProgressBar;
import java.util.HashMap;

/* renamed from: X.Zgl, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90579Zgl extends AbstractC90102ZXu {
    public final /* synthetic */ DialogC90914ZmA LIZ;

    @Override // X.AbstractC90102ZXu
    public final void LJIIJ() {
        this.LIZ.LJJIIJ(false);
    }

    public C90579Zgl(DialogC90914ZmA dialogC90914ZmA) {
        this.LIZ = dialogC90914ZmA;
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIL(ZY4 zy4) {
        ProgressBar progressBar = (ProgressBar) ((HashMap) this.LIZ.LLIIZ).get(zy4);
        int i = zy4.LJIILJJIL;
        if (progressBar != null && this.LIZ.LLIIJI != zy4) {
            progressBar.setProgress(i);
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LJ(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJJIIJ(true);
    }
}
