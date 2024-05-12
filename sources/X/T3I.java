package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class T3I implements Comparable<T3I> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public XKQ LJLJJLL;
    public boolean LJLJL;

    public abstract void LIZJ();

    public final int getPriority() {
        return ((Number) this.LJLJJI.getValue()).intValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(T3I t3i) {
        T3I other = t3i;
        o.LJIIIZ(other, "other");
        if (getPriority() == other.getPriority()) {
            return o.LJIIL(this.LJLJI, other.LJLJI);
        }
        return other.getPriority() - getPriority();
    }

    public T3I(String bid, String containerId) {
        o.LJIIIZ(bid, "bid");
        o.LJIIIZ(containerId, "containerId");
        this.LJLIL = bid;
        this.LJLILLLLZI = containerId;
        this.LJLJI = System.currentTimeMillis();
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS162S0100000_12(this, 1111));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS162S0100000_12(this, 1110));
    }
}
