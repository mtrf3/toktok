package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS16S0010000_12;

/* loaded from: classes13.dex */
public class TLP {
    public final int LIZ;
    public final InterfaceC88471Ynr<? super ViewGroup, ? super InterfaceC65784Pro<C76800UCe>, ? extends RecyclerView.ViewHolder> LIZIZ;
    public final InterfaceC88471Ynr<? super RecyclerView.ViewHolder, ? super TEN, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<? super TL7, C76800UCe> LIZLLL;

    public TLP(AqS16S0010000_12 aqS16S0010000_12, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        aqS16S0010000_12 = (i & 8) != 0 ? null : aqS16S0010000_12;
        this.LIZ = i2;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = aqS16S0010000_12;
    }
}
