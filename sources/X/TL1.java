package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.IDlS64S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TL1<DATA> extends RecyclerView.ViewHolder {
    public DATA LJLIL;
    public TEA LJLILLLLZI;
    public int LJLJI;
    public final TDE LJLJJI;
    public final InterfaceC88473Ynt<DATA, Integer, TEA, C76800UCe> LJLJJL;

    public abstract void LJJZZIII(DATA data);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TL1(View itemView, TDE view, InterfaceC88473Ynt<? super DATA, ? super Integer, ? super TEA, C76800UCe> clickListener) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLJJI = view;
        this.LJLJJL = clickListener;
        this.LJLILLLLZI = TEA.NOT_DOWNLOAD;
        C16880lQ.LJIIJ(new IDlS64S0100000_12((TL1) this, 1), itemView);
    }

    public final void L(DATA data, int i, TEA state, Integer num) {
        o.LJIIIZ(state, "state");
        this.LJLIL = data;
        this.LJLILLLLZI = state;
        this.LJLJI = i;
        LJJZZIII(data);
        int i2 = TEC.LIZ[state.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                return;
            }
            if (num == null) {
                this.LJLJJI.LJIILJJIL(2, 0);
                return;
            } else {
                this.LJLJJI.LJIILJJIL(5, num.intValue());
                return;
            }
        }
        this.LJLJJI.LJIILJJIL(1, 0);
    }
}
