package X;

import Y.ARunnableS11S0210000_12;
import Y.ARunnableS1S0311000_12;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZJ {
    public final RecyclerView LIZ;
    public final C0AK LIZIZ;
    public final SZ0 LIZJ;
    public final C73849Syb<C57939MoZ> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public volatile int LJFF;
    public List<? extends InterfaceC57784Mm4> LJI;
    public ArrayList<Integer> LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final void LIZ(C03150Al c03150Al, boolean z) {
        if (C72289SYr.LIZ) {
            if (!this.LIZ.LJJJLL()) {
                LIZIZ(c03150Al, z);
                return;
            } else {
                this.LIZ.post(new ARunnableS11S0210000_12(c03150Al, this, z, 0));
                return;
            }
        }
        LIZIZ(c03150Al, z);
    }

    public final void LIZIZ(C03150Al c03150Al, boolean z) {
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS11S0210000_12(c03150Al, this, z, 1));
            return;
        }
        c03150Al.LIZIZ(this.LIZIZ);
        if (!z) {
            return;
        }
        this.LJ.invoke();
    }

    public final void LIZJ(boolean z, List list, List list2, List list3) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C00F.LJ(list, "originHashCodes", list2, "originItems", list3, "fullItems");
        this.LJFF++;
        int i = this.LJFF;
        C57939MoZ LJJZZIII = this.LIZLLL.LJJZZIII();
        if (LJJZZIII != null && LJJZZIII.LIZLLL) {
            z2 = true;
            arrayList = new ArrayList(this.LJI);
            arrayList2 = new ArrayList(this.LJII);
        } else {
            z2 = false;
            arrayList = new ArrayList(list2);
            arrayList2 = new ArrayList(list);
        }
        ArrayList arrayList3 = new ArrayList(list3);
        C57785Mm5 c57785Mm5 = new C57785Mm5(arrayList, arrayList3, arrayList2);
        Object value = this.LJIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-backgroundExecutor>(...)");
        Executor executor = (Executor) value;
        if (z2 && executor != null) {
            executor.execute(new ARunnableS1S0311000_12(c57785Mm5, i, this, arrayList3, z, 1));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZJ.LIZ(C65352Pkq.LIZ(C88514YoY.class));
        LIZ(C03200Aq.LIZ(c57785Mm5, true), z);
        this.LIZJ.LIZIZ(C65352Pkq.LIZ(C88514YoY.class), SZC.LJLIL);
    }

    public SZJ(RecyclerView list, C0AK listUpdateCallback, SZ0 tracker, C73849Syb<C57939MoZ> c73849Syb, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(listUpdateCallback, "listUpdateCallback");
        o.LJIIIZ(tracker, "tracker");
        this.LIZ = list;
        this.LIZIZ = listUpdateCallback;
        this.LIZJ = tracker;
        this.LIZLLL = c73849Syb;
        this.LJ = interfaceC65784Pro;
        this.LJI = C61878OQg.INSTANCE;
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 26));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 25));
    }
}
