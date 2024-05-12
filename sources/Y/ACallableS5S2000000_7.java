package Y;

import X.FLJ;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.vesdk.VEUtils;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS5S2000000_7 implements Callable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS5S2000000_7 aCallableS5S2000000_7) {
        boolean z;
        String str = aCallableS5S2000000_7.s0;
        o.LJI(str);
        String str2 = aCallableS5S2000000_7.s1;
        o.LJI(str2);
        if (VEUtils.getMusicDefaultAlgorithm(str, str2) == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object call$1(ACallableS5S2000000_7 aCallableS5S2000000_7) {
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        FLJ.LIZJ(aCallableS5S2000000_7.s0, aCallableS5S2000000_7.s1);
        return null;
    }

    public ACallableS5S2000000_7(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
