package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TJt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74449TJt<CATEGORY, DATA> implements InterfaceC74450TJu<CATEGORY, DATA> {
    public InterfaceC74452TJw<CATEGORY, DATA> LIZ;
    public final List<OSZ<CATEGORY, List<DATA>>> LIZIZ = new ArrayList();
    public int LIZJ = -1;
    public final C73893SzJ LIZLLL = new C73893SzJ();
    public final C73893SzJ LJ = new C73893SzJ();
    public C73318Sq2 LJFF;
    public final C80695Vlj LJI;

    public AbstractC74449TJt(C80695Vlj c80695Vlj) {
        this.LJI = c80695Vlj;
        c80695Vlj.setVisibility(8);
        c80695Vlj.setTabMargin(0);
    }

    @Override // X.InterfaceC74450TJu
    public final void LIZ(CATEGORY category, boolean z) {
        int i;
        TCP tcp;
        View view;
        TCP tcp2;
        OSZ osz;
        List list;
        Object LJLLLL;
        InterfaceC74452TJw<CATEGORY, DATA> interfaceC74452TJw;
        if (category != null) {
            Iterator it = ((ArrayList) this.LIZIZ).iterator();
            i = 0;
            while (it.hasNext()) {
                if (o.LJ(((OSZ) it.next()).getFirst(), category)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        if (z && i >= 0 && (osz = (OSZ) ORZ.LJLLLLLL(i, this.LIZIZ)) != null && (list = (List) osz.getSecond()) != null && (LJLLLL = ORZ.LJLLLL(list)) != null && (interfaceC74452TJw = this.LIZ) != null) {
            interfaceC74452TJw.LIZJ(i, LJLLLL);
        }
        int i2 = this.LIZJ;
        View view2 = null;
        if (i2 != i && i2 >= 0) {
            this.LJI.LJIIJJI(i2);
            C164456cr LJIIJJI = this.LJI.LJIIJJI(this.LIZJ);
            if (LJIIJJI != null) {
                view = LJIIJJI.LIZLLL;
            } else {
                view = null;
            }
            int i3 = this.LIZJ;
            C74447TJr c74447TJr = (C74447TJr) this;
            if ((view instanceof TCP) && (tcp2 = (TCP) view) != null) {
                tcp2.getContentView().setBackground(null);
            }
            View childAt = c74447TJr.LJIIJJI.LJLJI.getChildAt(i3);
            if (childAt != null) {
                childAt.setBackground(null);
            }
        }
        if (i >= 0 && this.LIZJ != i) {
            C164456cr LJIIJJI2 = this.LJI.LJIIJJI(i);
            if (LJIIJJI2 != null) {
                view2 = LJIIJJI2.LIZLLL;
            }
            C74447TJr c74447TJr2 = (C74447TJr) this;
            if ((view2 instanceof TCP) && (tcp = (TCP) view2) != null) {
                tcp.getContentView().setBackground(c74447TJr2.LJIIJJI.getContext().getResources().getDrawable(R.drawable.a3i));
            }
            this.LJI.LJIJJLI(LJIIJJI2);
        }
        this.LIZJ = i;
    }
}
