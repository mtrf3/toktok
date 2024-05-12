package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class VJU extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ VJT LJLJI;
    public final /* synthetic */ java.util.Map LJLJJI;
    public final /* synthetic */ VJR LJLJJL;
    public final /* synthetic */ LinkedList LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJU(int i, int i2, VJT vjt, java.util.Map map, VJR vjr, LinkedList linkedList) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = vjt;
        this.LJLJJI = map;
        this.LJLJJL = vjr;
        this.LJLJJLL = linkedList;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder sb = new StringBuilder("Bucket ");
        sb.append(this.LJLIL);
        sb.append(" is running, last execution order is ");
        sb.append(this.LJLILLLLZI);
        sb.append(", offer ");
        sb.append(this.LJLJI.LJLILLLLZI);
        sb.append(" to pending queue. Queue review is ");
        LinkedList linkedList = this.LJLJJLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(linkedList, 10));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            VJO vjo = (VJO) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(vjo.LJLILLLLZI);
            LIZ.append('-');
            LIZ.append(vjo.LJLJI);
            LIZ.append('-');
            LIZ.append(vjo.LJLJJI);
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        sb.append(arrayList);
        return sb.toString();
    }
}
