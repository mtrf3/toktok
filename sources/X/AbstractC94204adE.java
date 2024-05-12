package X;

import X.C94205adF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.adE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94204adE<D, VH extends C94205adF> extends AbstractC029409q<VH> {
    public List<? extends D> LJLIL = C61878OQg.INSTANCE;
    public final HashMap<D, EnumC93674aUg> LJLILLLLZI = new HashMap<>();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public final void setData(List<? extends D> itemList) {
        o.LJIIIZ(itemList, "itemList");
        this.LJLIL = itemList;
        this.LJLILLLLZI.clear();
        Iterator<? extends D> it = itemList.iterator();
        while (it.hasNext()) {
            this.LJLILLLLZI.put(it.next(), EnumC93674aUg.Normal);
        }
        notifyDataSetChanged();
    }

    public final void LJLLLLLL(D d, EnumC93674aUg itemStatus) {
        o.LJIIIZ(itemStatus, "itemStatus");
        this.LJLILLLLZI.put(d, itemStatus);
        notifyItemChanged(this.LJLIL.indexOf(d), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6, java.util.List r7) {
        /*
            r4 = this;
            X.adF r5 = (X.C94205adF) r5
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.util.HashMap<D, X.aUg> r1 = r4.LJLILLLLZI
            java.util.List<? extends D> r0 = r4.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            java.lang.Object r0 = r1.get(r0)
            X.aUg r0 = (X.EnumC93674aUg) r0
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L32
        L1e:
            r5.N()
            r5.L(r3)
        L24:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L31
            super.onBindViewHolder(r5, r6, r7)
        L31:
            return
        L32:
            int[] r1 = X.C93675aUh.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L47
            r0 = 2
            if (r1 == r0) goto L40
            goto L1e
        L40:
            r5.N()
            r5.L(r2)
            goto L24
        L47:
            r5.L(r3)
            r5.M()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC94204adE.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List):void");
    }
}
