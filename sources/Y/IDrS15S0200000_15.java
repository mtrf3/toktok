package Y;

import X.C0A6;
import X.C80107VcF;
import X.C85865Xmv;
import X.YAB;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDrS15S0200000_15 extends C0A6 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS15S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJIILJJIL$0(IDrS15S0200000_15 iDrS15S0200000_15, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C85865Xmv) iDrS15S0200000_15.l0).getUiActions().LJLJJLL.invoke(Integer.valueOf(((LinearLayoutManager) iDrS15S0200000_15.l1).LLIL()), Integer.valueOf(((LinearLayoutManager) iDrS15S0200000_15.l1).LLILLIZIL()));
    }

    public static final void LJIILJJIL$1(IDrS15S0200000_15 iDrS15S0200000_15, int i, RecyclerView recyclerView) {
        View LJFF;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (LJFF = ((C80107VcF) iDrS15S0200000_15.l0).LJFF(recyclerView.getLayoutManager())) != null) {
            YAB yab = (YAB) iDrS15S0200000_15.l1;
            int LJJJJIZL = RecyclerView.LJJJJIZL(LJFF);
            if (yab.LJLJJL != LJJJJIZL) {
                yab.LJLJJL = LJJJJIZL;
                yab.LJLJJLL = LJJJJIZL;
                recyclerView.post(new ARunnableS18S0201000_15(LJJJJIZL, yab, LJFF, 2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
    
        r6 = (X.YAB) r3.l1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL$0(Y.IDrS15S0200000_15 r3, androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.Object r1 = r3.l0
            X.VcF r1 = (X.C80107VcF) r1
            X.0A2 r0 = r4.getLayoutManager()
            android.view.View r0 = r1.LJFF(r0)
            if (r0 == 0) goto L26
            java.lang.Object r6 = r3.l1
            X.YAB r6 = (X.YAB) r6
            int r5 = androidx.recyclerview.widget.RecyclerView.LJJJJIZL(r0)
            int r4 = r6.LJLJJLL
            if (r4 == r5) goto L26
            r3 = -1
            if (r4 != r3) goto L34
        L22:
            r6.LJLJJLL = r5
            if (r5 != r3) goto L27
        L26:
            return
        L27:
            androidx.recyclerview.widget.RecyclerView r2 = r6.LJLIL
            Y.ARunnableS19S0101000_15 r1 = new Y.ARunnableS19S0101000_15
            r0 = 9
            r1.<init>(r6, r5, r0)
            r2.post(r1)
            goto L26
        L34:
            androidx.recyclerview.widget.RecyclerView r2 = r6.LJLIL
            Y.ARunnableS19S0101000_15 r1 = new Y.ARunnableS19S0101000_15
            r0 = 10
            r1.<init>(r6, r4, r0)
            r2.post(r1)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS15S0200000_15.LJIILL$0(Y.IDrS15S0200000_15, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
