package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Skd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72983Skd extends C0A6 {
    public int LJLILLLLZI;
    public final AqS99S0101000_12 LJLJI;
    public final C72977SkX<Boolean> LJLIL = new C72977SkX<>(Boolean.FALSE);
    public final C72977SkX<Integer> LJLJJI = new C72977SkX<>(0);

    public C72983Skd(int i) {
        this.LJLJI = new AqS99S0101000_12(this, i, 19);
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1 || this.LJLIL.LIZIZ.booleanValue()) {
                return;
            }
            this.LJLIL.LIZIZ(Boolean.TRUE);
            return;
        }
        if (!this.LJLIL.LIZIZ.booleanValue()) {
            return;
        }
        this.LJLIL.LIZIZ(Boolean.FALSE);
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        this.LJLILLLLZI = computeHorizontalScrollOffset;
        this.LJLJJI.LIZIZ(Integer.valueOf(computeHorizontalScrollOffset));
    }
}
