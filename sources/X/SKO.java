package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKO extends SKX {
    public final List LIZ = new ArrayList();
    public final int LIZIZ;

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahe;
    }

    @Override // X.SKZ
    public final boolean LJI() {
        List list = this.LIZ;
        boolean z = true;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    SKZ skz = (SKZ) it.next();
                    if (z || skz.LJI()) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public SKO(int i) {
        this.LIZIZ = i;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        ((TextView) view.findViewById(R.id.title)).setText(view.getContext().getString(this.LIZIZ));
    }
}
