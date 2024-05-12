package X;

import X.AbstractC73265SpB;
import X.C73236Soi;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Soj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73237Soj<VH extends AbstractC73265SpB<?>, M extends C73236Soi<VH>> extends MK7 implements InterfaceC73258Sp4<VH, M> {
    public View LJLIL;

    public abstract Object LJLZ(int i);

    public abstract void LJZ(C73242Soo c73242Soo);

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
    }

    public final int LJLLLLLL() {
        if (this.LJLIL == null) {
            return 0;
        }
        return 1;
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        if (i < LJLLLLLL()) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        LJJJZ().LJ(recyclerView);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        C73242Soo LJJJZ = LJJJZ();
        LJJJZ.getClass();
        C73240Som c73240Som = LJJJZ.LIZLLL;
        c73240Som.getClass();
        ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = c73240Som.LIZIZ;
        viewOnAttachStateChangeListenerC73199So7.getClass();
        viewOnAttachStateChangeListenerC73199So7.LJLIL = null;
        recyclerView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
        c73240Som.LIZJ = null;
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i == Integer.MAX_VALUE) {
            View view = this.LJLIL;
            o.LJI(view);
            return new C73260Sp6(view);
        }
        return LJJJZ().LIZ(i, parent);
    }

    @Override // X.AbstractC029409q
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        if (getItemViewType(i) == Integer.MAX_VALUE) {
            return;
        }
        C73242Soo LJJJZ = LJJJZ();
        AbstractC73265SpB abstractC73265SpB = (AbstractC73265SpB) holder;
        Object LJLZ = LJLZ(i);
        int LJLLLLLL = i - LJLLLLLL();
        LJJJZ.getClass();
        if (LJLZ == null) {
            return;
        }
        abstractC73265SpB.bind(LJLZ, LJLLLLLL, payloads);
    }
}
