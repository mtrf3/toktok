package Y;

import X.C0A6;
import X.C62477OfZ;
import X.NAU;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDrS49S0100000_10 extends C0A6 {
    public final int $t;
    public Object l0;

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

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 2:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS49S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS49S0100000_10 iDrS49S0100000_10, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((TabStoreFragment) iDrS49S0100000_10.l0).Sl();
        }
    }

    public static final void LJIILJJIL$1(IDrS49S0100000_10 iDrS49S0100000_10, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C62477OfZ) iDrS49S0100000_10.l0).LJIIJ();
    }

    public static final void LJIILL$0(IDrS49S0100000_10 iDrS49S0100000_10, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((NAU) iDrS49S0100000_10.l0).LJ();
    }
}
