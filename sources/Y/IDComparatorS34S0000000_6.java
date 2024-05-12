package Y;

import X.C36307EMt;
import X.C36876Edc;
import X.C66851QLn;
import X.F4V;
import X.FW2;
import X.OSZ;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDComparatorS34S0000000_6 implements Comparator {
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
            case 8:
                return compare$8(this, t, t2);
            case 9:
                return compare$9(this, t, t2);
            case 10:
                return compare$10(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS34S0000000_6(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF((Long) ((OSZ) obj2).getSecond(), (Long) ((OSZ) obj).getSecond());
    }

    public static final int compare$1(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified();
        long lastModified2 = ((File) obj2).lastModified();
        if (lastModified < lastModified2) {
            return -1;
        }
        if (lastModified == lastModified2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$10(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C36307EMt) obj2).LJLILLLLZI), Integer.valueOf(((C36307EMt) obj).LJLILLLLZI));
    }

    public static final int compare$2(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C36307EMt) obj2).LJLILLLLZI), Integer.valueOf(((C36307EMt) obj).LJLILLLLZI));
    }

    public static final int compare$3(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C36876Edc) obj).LJLILLLLZI), Long.valueOf(((C36876Edc) obj2).LJLILLLLZI));
    }

    public static final int compare$4(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return DecodeProcessor.lambda$decodeAndVerify$0((ZoinBlockInfo) obj, (ZoinBlockInfo) obj2);
    }

    public static final int compare$5(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(((ISmartCheckService) obj).getServiceInfo().LIZIZ, ((ISmartCheckService) obj2).getServiceInfo().LIZIZ);
    }

    public static final int compare$6(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((F4V) obj2).getPriority()), Integer.valueOf(((F4V) obj).getPriority()));
    }

    public static final int compare$7(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        long j = ((FW2) obj).LIZIZ;
        long j2 = ((FW2) obj2).LIZIZ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return -1;
        }
        return 1;
    }

    public static final int compare$8(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Boolean.valueOf(o.LJ(obj, "default")), Boolean.valueOf(o.LJ(obj2, "default")));
    }

    public static final int compare$9(IDComparatorS34S0000000_6 iDComparatorS34S0000000_6, Object obj, Object obj2) {
        return C66851QLn.LJFF(Boolean.valueOf(!o.LJ(obj, "default")), Boolean.valueOf(!o.LJ(obj2, "default")));
    }
}
