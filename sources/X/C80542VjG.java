package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: X.VjG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80542VjG implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C80539VjD LJLIL;
    public final /* synthetic */ C80540VjE LJLILLLLZI;

    public C80542VjG(C80540VjE c80540VjE, C80539VjD c80539VjD) {
        this.LJLILLLLZI = c80540VjE;
        this.LJLIL = c80539VjD;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C80541VjF adapter2 = this.LJLIL.getAdapter2();
        if (i >= adapter2.LIZIZ() && i <= adapter2.LIZLLL()) {
            InterfaceC80560VjY interfaceC80560VjY = this.LJLILLLLZI.LJLJJI;
            long longValue = this.LJLIL.getAdapter2().getItem(i).longValue();
            C80557VjV c80557VjV = (C80557VjV) interfaceC80560VjY;
            if (c80557VjV.LIZ.LJLJJI.validator.LLLILZJ(longValue)) {
                c80557VjV.LIZ.LJLJI.LLLLLZIL(longValue);
                Iterator it = c80557VjV.LIZ.LJLIL.iterator();
                while (it.hasNext()) {
                    ((AbstractC80535Vj9) it.next()).LIZIZ(c80557VjV.LIZ.LJLJI.LLLLLLZZ());
                }
                c80557VjV.LIZ.LJLJLLL.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = c80557VjV.LIZ.LJLJLJ;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
