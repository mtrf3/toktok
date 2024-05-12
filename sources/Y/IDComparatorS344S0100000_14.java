package Y;

import X.C82942Wgs;
import X.C83154WkI;
import X.VPN;
import X.VPP;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.Comparator;

/* loaded from: classes15.dex */
public class IDComparatorS344S0100000_14 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS344S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS344S0100000_14 iDComparatorS344S0100000_14, Object obj, Object obj2) {
        int i;
        Rect rect = ((VPP) obj).LIZJ;
        Rect rect2 = ((VPP) obj2).LIZJ;
        int i2 = ((VPN) iDComparatorS344S0100000_14.l0).LIZ;
        if (i2 == 0) {
            i = rect.top - rect2.top;
        } else {
            i = (rect.top / i2) - (rect2.top / i2);
        }
        int i3 = rect.left - rect2.left;
        if (i == 0) {
            return i3;
        }
        return i;
    }

    public static final int compare$1(IDComparatorS344S0100000_14 iDComparatorS344S0100000_14, Object obj, Object obj2) {
        return ((C83154WkI) iDComparatorS344S0100000_14.l0).LIZ.indexOf(new C82942Wgs(((ComposerBeauty) obj).getEffect().getEffectId(), 1)) - ((C83154WkI) iDComparatorS344S0100000_14.l0).LIZ.indexOf(new C82942Wgs(((ComposerBeauty) obj2).getEffect().getEffectId(), 1));
    }
}
