package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A0x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25547A0x extends C0B4 {
    public final A13 LIZLLL;
    public int LJ;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public C25547A0x(A13 adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZLLL = adapter;
        this.LJ = -1;
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        super.LIZIZ(recyclerView, viewHolder);
        int i = this.LJ;
        if (i >= 0 && i != viewHolder.getAbsoluteAdapterPosition()) {
            A13 a13 = this.LIZLLL;
            int i2 = this.LJ;
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            A1F a1f = a13.LJLIL;
            List<ManagementPagePaidVideo> list = a13.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((ManagementPagePaidVideo) it.next()).id);
            }
            a1f.zs(i2, absoluteAdapterPosition, arrayList);
            this.LJ = -1;
        }
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof A14) || !((A14) viewHolder).LJLILLLLZI) {
            return 0;
        }
        return C0B4.LJIIIZ(3, 0);
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder2 instanceof A14) {
            if (this.LJ == -1) {
                this.LJ = viewHolder.getAbsoluteAdapterPosition();
            }
            A14 a14 = (A14) viewHolder2;
            if (a14.LJLILLLLZI) {
                this.LIZLLL.LJLLLLLL(viewHolder.getAbsoluteAdapterPosition(), a14.getAbsoluteAdapterPosition());
                return true;
            }
            return true;
        }
        return true;
    }
}
