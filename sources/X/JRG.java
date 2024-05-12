package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JRG extends C0A6 {
    public final C49177JRt LJLIL;

    public JRG(C49177JRt c49177JRt) {
        this.LJLIL = c49177JRt;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C49177JRt c49177JRt = this.LJLIL;
        if (c49177JRt != null) {
            C49177JRt.LIZ(c49177JRt, "scroll", C51029K0z.LJJIIZI(new OSZ("scrollLeft", Integer.valueOf(i))));
        }
    }
}
