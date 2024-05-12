package Y;

import X.C66851QLn;
import X.E7A;
import com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDComparatorS339S0100000_6 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS339S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS339S0100000_6 iDComparatorS339S0100000_6, Object obj, Object obj2) {
        int i;
        Map map = (Map) iDComparatorS339S0100000_6.l0;
        FdLeakDetector fdLeakDetector = FdLeakDetector.INSTANCE;
        Integer num = (Integer) map.get(fdLeakDetector.getTag((String) obj2));
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer num2 = (Integer) ((Map) iDComparatorS339S0100000_6.l0).get(fdLeakDetector.getTag((String) obj));
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$1(IDComparatorS339S0100000_6 iDComparatorS339S0100000_6, Object obj, Object obj2) {
        return o.LJIIJJI(((E7A) iDComparatorS339S0100000_6.l0).LIZIZ.indexOf(obj), ((E7A) iDComparatorS339S0100000_6.l0).LIZIZ.indexOf(obj2));
    }
}
