package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MJw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56616MJw extends JZQ {
    public final String LJLJI;
    public final C8GY LJLJJI;
    public final boolean LJLJJL;
    public View LJLJJLL;
    public RecyclerView.ViewHolder LJLJL;
    public InterfaceC191547fS LJLJLJ;

    @Override // X.MK7, X.C4II
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (this.LJLJJLL != null && (holder instanceof C56617MJx)) {
            int i = this.mmLoadMoreState.LIZ;
            if (i != 0) {
                if (i != 1) {
                    ((C73305Spp) holder.itemView.findViewById(R.id.fde)).setVisibility(8);
                    holder.itemView.findViewById(R.id.fdd).setVisibility(8);
                    holder.itemView.invalidate();
                    InterfaceC191547fS interfaceC191547fS = this.LJLJLJ;
                    if (interfaceC191547fS != null) {
                        interfaceC191547fS.LJIIJJI();
                        return;
                    }
                    return;
                }
                C73305Spp c73305Spp = (C73305Spp) holder.itemView.findViewById(R.id.fde);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIIZ(c73306Spq);
                c73305Spp.setStatus(c73306Spq);
                ((C73305Spp) holder.itemView.findViewById(R.id.fde)).setVisibility(8);
                holder.itemView.findViewById(R.id.fdd).setVisibility(0);
                holder.itemView.invalidate();
                return;
            }
            ((C73305Spp) holder.itemView.findViewById(R.id.fde)).LJFF();
            ((C73305Spp) holder.itemView.findViewById(R.id.fde)).setVisibility(0);
            holder.itemView.findViewById(R.id.fdd).setVisibility(8);
            holder.itemView.invalidate();
            return;
        }
        super.onBindFooterViewHolder(holder);
    }

    @Override // X.MK7, X.C4II
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = this.LJLJJLL;
        if (view == null) {
            return super.onCreateFooterViewHolder(parent);
        }
        RecyclerView.ViewHolder viewHolder = this.LJLJL;
        if (viewHolder == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(view.getContext()), R.layout.bf6, null, false);
            o.LJIIIIZZ(LLLLIILL, "from(emptyView.context).…grid_footer, null, false)");
            ViewGroup viewGroup = (ViewGroup) LLLLIILL.findViewById(R.id.fdd);
            if (viewGroup != null) {
                viewGroup.addView(view);
            }
            LLLLIILL.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewHolder = new C56617MJx(LLLLIILL);
        }
        this.LJLJL = viewHolder;
        return viewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8HS
    public final void setData(List<Aweme> list) {
        if (list == 0) {
            return;
        }
        this.mmItems = list;
        notifyDataSetChanged();
    }

    @Override // X.MK7
    public final void setLoadMoreListener(InterfaceC191547fS interfaceC191547fS) {
        super.setLoadMoreListener(interfaceC191547fS);
        this.LJLJLJ = interfaceC191547fS;
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C8GW)) {
            return;
        }
        List<T> list = this.mmItems;
        Aweme aweme = null;
        if (list != 0 && i >= 0 && i < list.size()) {
            aweme = (Aweme) ListProtector.get(list, i);
        }
        C8GW c8gw = (C8GW) holder;
        c8gw.N(aweme);
        c8gw.LJLJJI = true;
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        return C8GX.LIZ(parent, this.LJLJI, this.LJLJJI, this.LJLJJL);
    }

    public C56616MJw(String eventLabel, C8GY awemeClickListener, boolean z) {
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        this.LJLJI = eventLabel;
        this.LJLJJI = awemeClickListener;
        this.LJLJJL = z;
    }
}
