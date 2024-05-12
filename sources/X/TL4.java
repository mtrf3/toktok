package X;

import androidx.lifecycle.Observer;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [DATA] */
/* loaded from: classes13.dex */
public final class TL4<T, DATA> implements Observer<List<? extends DATA>> {
    public final /* synthetic */ TL5 LJLIL;

    public TL4(TL5 tl5) {
        this.LJLIL = tl5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L9f
            X.TL5 r3 = r9.LJLIL
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r10, r0)
            r4.<init>(r0)
            java.util.Iterator r7 = r10.iterator()
        L18:
            boolean r0 = r7.hasNext()
            r8 = 0
            if (r0 == 0) goto L4a
            java.lang.Object r6 = r7.next()
            java.util.Map<DATA, ? extends X.OSZ<? extends X.TEA, java.lang.Integer>> r0 = r3.LJI
            java.lang.Object r5 = r0.get(r6)
            X.OSZ r5 = (X.OSZ) r5
            if (r5 == 0) goto L3e
        L2d:
            X.6Eu r2 = new X.6Eu
            java.lang.Object r1 = r5.getFirst()
            java.lang.Object r0 = r5.getSecond()
            r2.<init>(r6, r1, r0)
            r4.add(r2)
            goto L18
        L3e:
            X.TEA r1 = X.TEA.UNKNOWN
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.OSZ r5 = new X.OSZ
            r5.<init>(r1, r0)
            goto L2d
        L4a:
            X.HyH<X.6Eu> r0 = r3.LJ
            r7 = 0
            java.lang.String r6 = "dataAdapter"
            if (r0 == 0) goto Lef
            java.util.List r2 = r0.getData()
            int r1 = r4.size()
            r5 = r2
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            if (r1 < r0) goto Ld6
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld6
            int r0 = r5.size()
            java.util.List r0 = r4.subList(r8, r0)
            java.util.List r1 = X.ORZ.LLJJIII(r2, r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb0
        L7e:
            X.HyH<X.6Eu> r2 = r3.LJ
            if (r2 == 0) goto Le7
            int r1 = r5.size()
            int r0 = r4.size()
            java.util.List r0 = r4.subList(r1, r0)
            r2.LJLLLLLL(r0)
        L91:
            androidx.recyclerview.widget.RecyclerView r2 = r3.LIZJ
            if (r2 == 0) goto Le1
            Y.ARunnableS48S0100000_12 r1 = new Y.ARunnableS48S0100000_12
            r0 = 60
            r1.<init>(r3, r0)
            r2.post(r1)
        L9f:
            X.TL5 r0 = r9.LJLIL
            androidx.recyclerview.widget.RecyclerView r2 = r0.LJIIL()
            Y.ARunnableS48S0100000_12 r1 = new Y.ARunnableS48S0100000_12
            r0 = 59
            r1.<init>(r9, r0)
            r2.post(r1)
            return
        Lb0:
            java.util.Iterator r2 = r1.iterator()
        Lb4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r2.next()
            X.OSZ r0 = (X.OSZ) r0
            java.lang.Object r1 = r0.getFirst()
            X.6Eu r1 = (X.C157166Eu) r1
            java.lang.Object r0 = r0.getSecond()
            X.6Eu r0 = (X.C157166Eu) r0
            java.lang.Object r1 = r1.LJLIL
            java.lang.Object r0 = r0.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto Lb4
        Ld6:
            X.HyH<X.6Eu> r0 = r3.LJ
            if (r0 == 0) goto Leb
            r0.LJLZ(r4)
            r0.notifyDataSetChanged()
            goto L91
        Le1:
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r7
        Le7:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Leb:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lef:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL4.onChanged(java.lang.Object):void");
    }
}
