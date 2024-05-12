package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QDP<T> implements InterfaceC68901R2j<T> {
    public static final /* synthetic */ int LIZJ = 0;
    public final T LIZ;
    public final LinkedHashSet<OSZ<QDR<?>, Long>> LIZIZ;

    static {
        new QDQ();
    }

    @Override // X.InterfaceC68901R2j
    public final T payload() {
        return this.LIZ;
    }

    @Override // X.InterfaceC68901R2j
    public final boolean LIZ(QDR<T> qdr) {
        return this.LIZIZ.add(new OSZ<>(qdr, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC68901R2j
    public final QDP LIZIZ(Object obj) {
        if (o.LJ(this.LIZ, obj)) {
            return this;
        }
        int size = this.LIZIZ.size();
        OSZ[] oszArr = new OSZ[size];
        for (int i = 0; i < size; i++) {
            oszArr[i] = ORZ.LJLJLJ(this.LIZIZ, i);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(size));
        ORY.LJJLIIIJLLLLLLLZ(linkedHashSet, oszArr);
        return new QDP(obj, linkedHashSet);
    }

    @Override // X.InterfaceC68901R2j
    public final boolean LIZJ(QDR<?> qdr) {
        LinkedHashSet<OSZ<QDR<?>, Long>> linkedHashSet = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(linkedHashSet, 10));
        Iterator<OSZ<QDR<?>, Long>> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList.contains(qdr);
    }

    public QDP(T t, LinkedHashSet<OSZ<QDR<?>, Long>> linkedHashSet) {
        this.LIZ = t;
        this.LIZIZ = linkedHashSet;
    }
}
