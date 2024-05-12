package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC171276nr<VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public final C84507XEp LJLIL;
    public final List<EffectModel> LJLILLLLZI = new ArrayList();
    public final List<Integer> LJLJI = new ArrayList();

    public AbstractC171276nr(C84507XEp c84507XEp) {
        this.LJLIL = c84507XEp;
    }

    public final void LJLZ(List<? extends EffectModel> list) {
        C84507XEp c84507XEp;
        int i;
        if (list == null) {
            return;
        }
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(list);
        ((ArrayList) this.LJLJI).clear();
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            EffectModel effectModel = (EffectModel) it.next();
            if (C44687HgJ.LIZIZ(effectModel.resDir)) {
                i = 16;
            } else {
                C84507XEp c84507XEp2 = this.LJLIL;
                if ((c84507XEp2 != null && c84507XEp2.LIZJ(effectModel)) || ((c84507XEp = this.LJLIL) != null && c84507XEp.LIZLLL(effectModel))) {
                    i = 8;
                } else {
                    i = 2;
                }
            }
            ((ArrayList) this.LJLJI).add(Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    public final void LJLLLLLL(int i, int i2) {
        if (((ArrayList) this.LJLJI).size() <= i || ((Number) ListProtector.get(this.LJLJI, i)).intValue() == i2) {
            return;
        }
        ListProtector.set(this.LJLJI, i, Integer.valueOf(i2));
        notifyItemChanged(i);
    }
}
