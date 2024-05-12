package Y;

import X.C66851QLn;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDComparatorS335S0100000_2 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            default:
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDComparatorS335S0100000_2(Object obj, HashMap<String, Integer> hashMap) {
        this.$t = hashMap;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS335S0100000_2 iDComparatorS335S0100000_2, Object obj, Object obj2) {
        return C66851QLn.LJFF((Comparable) ((InterfaceC88472Yns) iDComparatorS335S0100000_2.l0).invoke(obj), (Comparable) ((InterfaceC88472Yns) iDComparatorS335S0100000_2.l0).invoke(obj2));
    }

    public static final int compare$1(IDComparatorS335S0100000_2 iDComparatorS335S0100000_2, Object obj, Object obj2) {
        int i;
        Integer num = (Integer) ((Map) iDComparatorS335S0100000_2.l0).get(((Effect) obj2).getId());
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer num2 = (Integer) ((Map) iDComparatorS335S0100000_2.l0).get(((Effect) obj).getId());
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$2(IDComparatorS335S0100000_2 iDComparatorS335S0100000_2, Object obj, Object obj2) {
        Integer num;
        Integer valueOf;
        LanguageDetail o1 = (LanguageDetail) obj;
        LanguageDetail o2 = (LanguageDetail) obj2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        Integer num2 = (Integer) ((HashMap) iDComparatorS335S0100000_2.l0).get(o2.appLangCode);
        if (num2 != null && (num = (Integer) ((HashMap) iDComparatorS335S0100000_2.l0).get(o1.appLangCode)) != null && (valueOf = Integer.valueOf(num.intValue() - num2.intValue())) != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
