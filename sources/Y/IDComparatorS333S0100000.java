package Y;

import X.C0G2;
import X.C0G3;
import X.C162476Zf;
import X.C66851QLn;
import android.graphics.Rect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class IDComparatorS333S0100000 implements Comparator {
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

    public IDComparatorS333S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS333S0100000 iDComparatorS333S0100000, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = C0G2.LIZ[((C0G3) iDComparatorS333S0100000.l0).LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = rect.left;
                int i3 = rect2.left;
                if (i2 == i3) {
                    if (rect.top >= rect2.top) {
                        return 1;
                    }
                } else if (i2 >= i3) {
                    return 1;
                }
            } else {
                throw new C162476Zf();
            }
        } else {
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 == i5) {
                if (rect.left >= rect2.left) {
                    return 1;
                }
            } else if (i4 >= i5) {
                return 1;
            }
        }
        return -1;
    }

    public static final int compare$1(IDComparatorS333S0100000 iDComparatorS333S0100000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((List) iDComparatorS333S0100000.l0).indexOf(Long.valueOf(((SoundEffect) obj).id))), Integer.valueOf(((List) iDComparatorS333S0100000.l0).indexOf(Long.valueOf(((SoundEffect) obj2).id))));
    }
}
