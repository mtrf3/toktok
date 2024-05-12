package Y;

import X.C66851QLn;
import X.EnumC45753HxV;
import X.InterfaceC88472Yns;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.shortvideo.network.ToolsInterceptor;
import java.util.Comparator;

/* loaded from: classes12.dex */
public class IDComparatorS342S0100000_11 implements Comparator {
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
            case 3:
                return compare$3(this, t, t2);
            default:
                return 0;
        }
    }

    public final int LIZ$0(int[] iArr) {
        int i;
        int i2;
        int[] iArr2 = (int[]) this.l0;
        int i3 = iArr2[0];
        int i4 = iArr[0];
        if (i3 > i4) {
            i = (i3 - i4) * 2;
        } else {
            i = (i4 - i3) * 3;
        }
        int i5 = iArr2[1];
        int i6 = iArr[1];
        if (i5 > i6) {
            i2 = (i5 - i6) * 4;
        } else {
            i2 = i6 - i5;
        }
        return i + i2;
    }

    public IDComparatorS342S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS342S0100000_11 iDComparatorS342S0100000_11, Object obj, Object obj2) {
        return C66851QLn.LJI(obj, obj2, (InterfaceC88472Yns[]) iDComparatorS342S0100000_11.l0);
    }

    public static final int compare$1(IDComparatorS342S0100000_11 iDComparatorS342S0100000_11, Object obj, Object obj2) {
        return iDComparatorS342S0100000_11.LIZ$0((int[]) obj) - iDComparatorS342S0100000_11.LIZ$0((int[]) obj2);
    }

    public static final int compare$2(IDComparatorS342S0100000_11 iDComparatorS342S0100000_11, Object obj, Object obj2) {
        ((ToolsInterceptor) iDComparatorS342S0100000_11.l0).getClass();
        EnumC45753HxV LIZ = ToolsInterceptor.LIZ((Request) obj2);
        ((ToolsInterceptor) iDComparatorS342S0100000_11.l0).getClass();
        return C66851QLn.LJFF(LIZ, ToolsInterceptor.LIZ((Request) obj));
    }

    public static final int compare$3(IDComparatorS342S0100000_11 iDComparatorS342S0100000_11, Object obj, Object obj2) {
        ((ToolsInterceptor) iDComparatorS342S0100000_11.l0).getClass();
        EnumC45753HxV LIZ = ToolsInterceptor.LIZ((Request) obj2);
        ((ToolsInterceptor) iDComparatorS342S0100000_11.l0).getClass();
        return C66851QLn.LJFF(LIZ, ToolsInterceptor.LIZ((Request) obj));
    }
}
