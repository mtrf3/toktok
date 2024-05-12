package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vby, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80090Vby extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ AbstractC80089Vbx LJLILLLLZI;

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
    }

    public C80090Vby(AbstractC80089Vbx abstractC80089Vbx) {
        this.LJLILLLLZI = abstractC80089Vbx;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        if (i == 0) {
            if (!this.LJLIL) {
                this.LJLIL = this.LJLILLLLZI.LIZJ();
                return;
            } else {
                this.LJLIL = false;
                return;
            }
        }
        if (i != 1) {
            return;
        }
        this.LJLIL = false;
    }
}
