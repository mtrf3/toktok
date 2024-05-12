package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JHG implements InterfaceC48890JGs {
    public final /* synthetic */ Boolean LIZ;
    public final /* synthetic */ JGI LIZIZ;
    public final /* synthetic */ QZV LIZJ;

    @Override // X.InterfaceC48890JGs
    public final void LIZ(C46276IEe c46276IEe) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateProgressStatus: ");
        LIZ.append(c46276IEe.LJLIL);
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateProgressStatus: ");
        LIZ2.append(c46276IEe.LJLIL);
        X1D.LIZIZ(LIZ2);
        if (c46276IEe.LJLIL == 7 && o.LJ(this.LIZ, Boolean.TRUE)) {
            this.LIZIZ.LJIIZILJ();
            QZV qzv = this.LIZJ;
            if (qzv != null) {
                qzv.LJIIZILJ();
            }
        }
    }

    public JHG(Boolean bool, JGI jgi, QZV qzv) {
        this.LIZ = bool;
        this.LIZIZ = jgi;
        this.LIZJ = qzv;
    }
}
