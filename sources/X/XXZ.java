package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public abstract class XXZ extends C8HS {
    public final WidgetManager LJLIL;
    public final DataCenter LJLILLLLZI;
    public final ArrayList<ListItemWidget> LJLJI = new ArrayList<>();

    public abstract ListItemWidget LJLLLLLL(int i);

    @Override // X.MK7, X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public XXZ(WidgetManager widgetManager, DataCenter dataCenter) {
        this.LJLIL = widgetManager;
        this.LJLILLLLZI = dataCenter;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ListItemWidget LJLLLLLL;
        XYS xys;
        if (viewHolder instanceof XYS) {
            XYS xys2 = (XYS) viewHolder;
            ListItemWidget listItemWidget = xys2.LJLIL;
            if (listItemWidget != null && (xys = listItemWidget.LJLJLJ) != null && xys.getLayoutPosition() == i) {
                listItemWidget.LJLJLJ = null;
            }
            if (i < this.LJLJI.size()) {
                LJLLLLLL = (ListItemWidget) ListProtector.get(this.LJLJI, i);
                if (!LJLLLLLL.LJIILL(viewHolder)) {
                    LJLLLLLL = LJLLLLLL(i);
                    this.LJLIL.Dl(LJLLLLLL);
                    ListProtector.set(this.LJLJI, i, LJLLLLLL);
                }
            } else {
                LJLLLLLL = LJLLLLLL(i);
                this.LJLIL.Dl(LJLLLLLL);
                this.LJLJI.add(LJLLLLLL);
            }
            xys2.LJLIL = LJLLLLLL;
            LJLLLLLL.LJIILJJIL(xys2);
        }
    }
}
