package Y;

import X.C0A6;
import X.FMX;
import X.LYU;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDrS14S0000000_9 extends C0A6 {
    public final int $t;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    public IDrS14S0000000_9(int i) {
        this.$t = i;
    }

    public static final void LJIILJJIL$0(IDrS14S0000000_9 iDrS14S0000000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            FMX.LJIIIIZZ("cell_slide", "slide", 0L);
        }
    }

    public static final void LJIILJJIL$1(IDrS14S0000000_9 iDrS14S0000000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            LYU.LJIIJ();
        }
    }
}
