package Y;

import X.AbstractC03120Ai;
import X.C03150Al;
import X.C03200Aq;
import X.InterfaceC57784Mm4;
import X.SZJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS1S0311000_12 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((SZJ) this.l0).LJFF == this.i4) {
            SZJ szj = (SZJ) this.l0;
            ArrayList arrayList = (ArrayList) this.l1;
            szj.getClass();
            o.LJIIIZ(arrayList, "<set-?>");
            szj.LJI = arrayList;
            SZJ szj2 = (SZJ) this.l0;
            List<? extends InterfaceC57784Mm4> list = szj2.LJI;
            szj2.getClass();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            Iterator<? extends InterfaceC57784Mm4> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().hashCode()));
            }
            szj2.getClass();
            szj2.LJII = arrayList2;
            ((SZJ) this.l0).LIZ((C03150Al) this.l2, this.z3);
        }
    }

    public static final void run$0(ARunnableS1S0311000_12 aRunnableS1S0311000_12) {
        boolean LIZ;
        try {
            aRunnableS1S0311000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0311000_12 aRunnableS1S0311000_12) {
        boolean LIZ;
        try {
            ((Executor) ((SZJ) aRunnableS1S0311000_12.l1).LJIIIIZZ.getValue()).execute(new ARunnableS1S0311000_12((SZJ) aRunnableS1S0311000_12.l1, aRunnableS1S0311000_12.i4, (ArrayList) aRunnableS1S0311000_12.l2, C03200Aq.LIZ((AbstractC03120Ai) aRunnableS1S0311000_12.l0, true), aRunnableS1S0311000_12.z3, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0311000_12(Object obj, SZJ szj, int i, ArrayList<InterfaceC57784Mm4> arrayList, C03150Al c03150Al, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.i4 = szj;
        this.l1 = i;
        this.l2 = arrayList;
        this.z3 = c03150Al;
    }
}
