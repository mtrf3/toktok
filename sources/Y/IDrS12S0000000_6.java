package Y;

import X.C0A6;
import X.C35532Dx2;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.JatoXL;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDrS12S0000000_6 extends C0A6 {
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

    public IDrS12S0000000_6(int i) {
        this.$t = i;
    }

    public static final void LJIILJJIL$0(IDrS12S0000000_6 iDrS12S0000000_6, int i, RecyclerView recyclerView) {
        if (i == 1) {
            C35532Dx2.LIZLLL();
        }
    }

    public static final void LJIILJJIL$1(IDrS12S0000000_6 iDrS12S0000000_6, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            JatoXL.lightJitBlockStart();
            JatoXL.logCutStart();
        } else {
            JatoXL.lightJitBlockStop();
            JatoXL.logCutStop();
        }
    }
}
