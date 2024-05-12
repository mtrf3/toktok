package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* loaded from: classes9.dex */
public abstract class JZH<T> extends AbstractC51777KTt<T> {
    public SearchResultParam LJLJI;
    public InterfaceC49765Jg1 LJLJJI;
    public final JZG LJLJJL;

    public JZH() {
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        super.onBindBasicViewHolder(viewHolder, i);
    }

    public JZH(SearchResultParam searchResultParam, InterfaceC49816Jgq interfaceC49816Jgq, JZI jzi) {
        this.LJLJJI = interfaceC49816Jgq;
        this.LJLJI = searchResultParam;
        this.LJLJJL = new JZG(jzi);
    }
}
