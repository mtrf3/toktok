package Y;

import X.C66851QLn;
import X.EnumC91763Zzr;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes20.dex */
public class IDComparatorS44S0000000_31 implements Comparator {
    public final int $t;

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

    public IDComparatorS44S0000000_31(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS44S0000000_31 iDComparatorS44S0000000_31, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EnumC91763Zzr) ((Map.Entry) obj).getKey()).getValue()), Integer.valueOf(((EnumC91763Zzr) ((Map.Entry) obj2).getKey()).getValue()));
    }

    public static final int compare$1(IDComparatorS44S0000000_31 iDComparatorS44S0000000_31, Object obj, Object obj2) {
        return C66851QLn.LJFF(((District) obj).getName(), ((District) obj2).getName());
    }

    public static final int compare$2(IDComparatorS44S0000000_31 iDComparatorS44S0000000_31, Object obj, Object obj2) {
        return C66851QLn.LJFF(((Elements) obj).getDisplayOrder(), ((Elements) obj2).getDisplayOrder());
    }
}
