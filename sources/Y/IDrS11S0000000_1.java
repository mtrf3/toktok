package Y;

import X.C0A2;
import X.C0A6;
import X.C111974aP;
import X.C1C9;
import X.C3E6;
import X.C7MY;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDrS11S0000000_1 extends C0A6 {
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

    public IDrS11S0000000_1(int i) {
        this.$t = i;
    }

    public static final void LJIILJJIL$0(IDrS11S0000000_1 iDrS11S0000000_1, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C3E6.LJ();
        }
    }

    public static final void LJIILJJIL$1(IDrS11S0000000_1 iDrS11S0000000_1, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int LLILL = linearLayoutManager.LLILL();
        int LLIL = linearLayoutManager.LLIL();
        RecyclerView.ViewHolder LJJJ = recyclerView.LJJJ(0, false);
        if (!(LJJJ instanceof C111974aP) || LJJJ == null || LLILL != 0 || LLIL != 1) {
            return;
        }
        if (LJJJ.itemView.getY() > C7MY.LIZIZ(-22)) {
            final Context context = recyclerView.getContext();
            C1C9 c1c9 = new C1C9(context) { // from class: X.4aU
                @Override // X.C1C9
                public final int LJIILJJIL() {
                    return -1;
                }

                @Override // X.C1C9
                public final float LJIIJ(DisplayMetrics displayMetrics) {
                    if (displayMetrics != null) {
                        return 150.0f / displayMetrics.densityDpi;
                    }
                    throw new NullPointerException("densityDpi");
                }
            };
            c1c9.LIZ = 0;
            C0A2 layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 == null) {
                return;
            }
            layoutManager2.LLIIIILZ(c1c9);
            return;
        }
        final Context context2 = recyclerView.getContext();
        C1C9 c1c92 = new C1C9(context2) { // from class: X.4aU
            @Override // X.C1C9
            public final int LJIILJJIL() {
                return -1;
            }

            @Override // X.C1C9
            public final float LJIIJ(DisplayMetrics displayMetrics) {
                if (displayMetrics != null) {
                    return 150.0f / displayMetrics.densityDpi;
                }
                throw new NullPointerException("densityDpi");
            }
        };
        c1c92.LIZ = 1;
        C0A2 layoutManager3 = recyclerView.getLayoutManager();
        if (layoutManager3 == null) {
            return;
        }
        layoutManager3.LLIIIILZ(c1c92);
    }
}
