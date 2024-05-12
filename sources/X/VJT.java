package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VJT extends VJW {
    public final void LIZ() {
        int i;
        VJR vjr = this.LJLIL.get();
        if (vjr == null) {
            OC6.LJFF(VJX.LJLIL);
            return;
        }
        OC6.LIZIZ(new AqS164S0100000_14(this, 299));
        java.util.Map<Integer, Integer> map = vjr.LJLJI;
        LinkedList<VJO> linkedList = vjr.LJLIL;
        synchronized (linkedList) {
            int i2 = this.LJLILLLLZI.LJLJJI;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i2));
            int i3 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (this.LJLILLLLZI.LJLJI - i == 1 && !vjr.LJLILLLLZI.contains(Integer.valueOf(i2))) {
                OC6.LIZIZ(new VJV(i2, this, linkedHashMap, vjr));
                vjr.execute(new VJS(vjr, this.LJLILLLLZI));
            } else {
                int size = linkedList.size() - 1;
                while (i3 <= size) {
                    int i4 = ((size - i3) / 2) + i3;
                    if (linkedList.get(i4).LJLILLLLZI > this.LJLILLLLZI.LJLILLLLZI) {
                        size = i4 - 1;
                    } else if (linkedList.get(i4).LJLILLLLZI < this.LJLILLLLZI.LJLILLLLZI) {
                        i3 = i4 + 1;
                    }
                }
                linkedList.add(i3, this.LJLILLLLZI);
                OC6.LIZIZ(new VJU(i2, i, this, linkedHashMap, vjr, linkedList));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJT(VJR executor, VJO task) {
        super(executor, task);
        o.LJIIJ(executor, "executor");
        o.LJIIJ(task, "task");
    }
}
