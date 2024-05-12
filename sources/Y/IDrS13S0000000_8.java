package Y;

import X.C0A6;
import X.K6T;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDrS13S0000000_8 extends C0A6 {
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
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    public IDrS13S0000000_8(int i) {
        this.$t = i;
    }

    public static final void LJIILJJIL$0(IDrS13S0000000_8 iDrS13S0000000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        KeyboardUtils.LIZIZ(recyclerView);
    }

    public static final void LJIILJJIL$1(IDrS13S0000000_8 iDrS13S0000000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        KeyboardUtils.LIZIZ(recyclerView);
    }

    public static final void LJIILJJIL$2(IDrS13S0000000_8 iDrS13S0000000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            if (K6T.LIZ() == 1) {
                DoFrameController.LIZIZ = 0;
            }
        } else {
            if (K6T.LIZ() != 1) {
                return;
            }
            DoFrameController.LIZIZ = 3;
        }
    }
}
