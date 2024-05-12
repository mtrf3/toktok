package Y;

import X.C66851QLn;
import X.C74389THl;
import X.EnumC26549AbR;
import X.InterfaceC72860Sie;
import X.T0W;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Comparator;

/* loaded from: classes13.dex */
public class IDComparatorS40S0000000_12 implements Comparator {
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
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS40S0000000_12(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(((MusicModel) obj2).getDateLastModified(), ((MusicModel) obj).getDateLastModified());
    }

    public static final int compare$1(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EnumC26549AbR) obj).getTemplate()), Integer.valueOf(((EnumC26549AbR) obj2).getTemplate()));
    }

    public static final int compare$2(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(((Aweme) obj).getAid(), ((Aweme) obj2).getAid());
    }

    public static final int compare$3(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public static final int compare$4(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InterfaceC72860Sie) obj).priority().ordinal()), Integer.valueOf(((InterfaceC72860Sie) obj2).priority().ordinal()));
    }

    public static final int compare$5(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((T0W) obj).getType().getOrder()), Integer.valueOf(((T0W) obj2).getType().getOrder()));
    }

    public static final int compare$6(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C74389THl) obj).LJLJI), Integer.valueOf(((C74389THl) obj2).LJLJI));
    }

    public static final int compare$7(IDComparatorS40S0000000_12 iDComparatorS40S0000000_12, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C74389THl) obj2).LJLJI), Integer.valueOf(((C74389THl) obj).LJLJI));
    }
}
