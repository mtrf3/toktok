package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYB extends C0A6 {
    public final /* synthetic */ JY9 LJLIL;
    public final /* synthetic */ C68322mC<JYC> LJLILLLLZI;

    public JYB(JY9 jy9, C68322mC<JYC> c68322mC) {
        this.LJLIL = jy9;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.LIZ(recyclerView, i2, this.LJLILLLLZI.element);
    }
}
