package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLR {
    public static C28871Bj LIZ(List adapters) {
        o.LJIIIZ(adapters, "adapters");
        Iterator it = adapters.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            SLJ slj = (SLJ) it.next();
            slj.LJLJJL = (SLJ) ORZ.LJLLLLLL(i - 1, adapters);
            slj.LJLJJLL = (SLJ) ORZ.LJLLLLLL(i2, adapters);
            i = i2;
        }
        return new C28871Bj((List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>>) adapters);
    }
}
