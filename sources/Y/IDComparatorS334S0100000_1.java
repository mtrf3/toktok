package Y;

import X.C66851QLn;
import X.C787637g;
import X.ORZ;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDComparatorS334S0100000_1 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case 9:
                return compare$9(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS334S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        int i;
        ActivityStatus activityStatus = (ActivityStatus) obj;
        ActivityStatus activityStatus2 = (ActivityStatus) obj2;
        Iterator it = ((List) iDComparatorS334S0100000_1.l0).iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (it.hasNext()) {
                if (o.LJ(it.next(), activityStatus.userID)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Iterator it2 = ((List) iDComparatorS334S0100000_1.l0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (o.LJ(it2.next(), activityStatus2.userID)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 == i) {
            return (int) (CastLongProtector.parseLong(activityStatus.userID) - CastLongProtector.parseLong(activityStatus2.userID));
        }
        return i3 - i;
    }

    public static final int compare$1(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Long) ((Map) iDComparatorS334S0100000_1.l0).get(((IMUser) obj2).getUid()), (Long) ((Map) iDComparatorS334S0100000_1.l0).get(((IMUser) obj).getUid()));
    }

    public static final int compare$2(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        int i;
        Integer num = (Integer) ((Map) iDComparatorS334S0100000_1.l0).get(obj2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer num2 = (Integer) ((Map) iDComparatorS334S0100000_1.l0).get(obj);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$3(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(ORZ.LJLZ(((IMUser) obj).getUid(), (Set) iDComparatorS334S0100000_1.l0)), Integer.valueOf(ORZ.LJLZ(((IMUser) obj2).getUid(), (Set) iDComparatorS334S0100000_1.l0)));
    }

    public static final int compare$4(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map) iDComparatorS334S0100000_1.l0).get(((C787637g) obj).LIZ), (Integer) ((Map) iDComparatorS334S0100000_1.l0).get(((C787637g) obj2).LIZ));
    }

    public static final int compare$5(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return 0;
            }
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return Long.compare(((Long) ((Map) iDComparatorS334S0100000_1.l0).get(obj)).longValue(), ((Long) ((Map) iDComparatorS334S0100000_1.l0).get(obj2)).longValue());
    }

    public static final int compare$6(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((IMUser) iDComparatorS334S0100000_1.l0).getDisplayName(), ((IMUser) iDComparatorS334S0100000_1.l0).getDisplayName());
    }

    public static final int compare$7(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        Iterator it = ((List) iDComparatorS334S0100000_1.l0).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(obj, it.next())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = Integer.MAX_VALUE;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i2);
        Iterator it2 = ((List) iDComparatorS334S0100000_1.l0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (o.LJ(obj2, it2.next())) {
                if (i >= 0) {
                    i3 = i;
                }
            } else {
                i++;
            }
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i3));
    }

    public static final int compare$8(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        long longValue = ((Long) ((HashMap) iDComparatorS334S0100000_1.l0).get(obj)).longValue() - ((Long) ((HashMap) iDComparatorS334S0100000_1.l0).get(obj2)).longValue();
        if (longValue < 0) {
            return -1;
        }
        if (longValue > 0) {
            return 1;
        }
        return 0;
    }

    public static final int compare$9(IDComparatorS334S0100000_1 iDComparatorS334S0100000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Long) ((Map) iDComparatorS334S0100000_1.l0).get(obj2), (Long) ((Map) iDComparatorS334S0100000_1.l0).get(obj));
    }
}
