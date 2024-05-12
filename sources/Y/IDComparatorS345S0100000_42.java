package Y;

import X.C66851QLn;
import X.C93829aXB;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDComparatorS345S0100000_42 implements Comparator {
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

    public IDComparatorS345S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS345S0100000_42 iDComparatorS345S0100000_42, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(-((MainFragment) iDComparatorS345S0100000_42.l0).Nl(((Fragment) obj).getView())), Integer.valueOf(-((MainFragment) iDComparatorS345S0100000_42.l0).Nl(((Fragment) obj2).getView())));
    }

    public static final int compare$1(IDComparatorS345S0100000_42 iDComparatorS345S0100000_42, Object obj, Object obj2) {
        Feature feature1 = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        o.LJIIIZ(feature1, "feature1");
        o.LJIIIZ(feature2, "feature2");
        ((C93829aXB) iDComparatorS345S0100000_42.l0).getClass();
        int LJIIJ = C93829aXB.LJIIJ(feature1);
        ((C93829aXB) iDComparatorS345S0100000_42.l0).getClass();
        return C93829aXB.LJIIJ(feature2) - LJIIJ;
    }
}
