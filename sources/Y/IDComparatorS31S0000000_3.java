package Y;

import X.AbstractC187797Yp;
import X.C191707fi;
import X.C217098fZ;
import X.C227128vk;
import X.C66851QLn;
import X.C85M;
import X.EnumC227268vy;
import X.InterfaceC217378g1;
import android.text.style.ClickableSpan;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupButton;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class IDComparatorS31S0000000_3 implements Comparator {
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
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, t, t2);
            case 12:
                return compare$12(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS31S0000000_3(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj2).getStart()), Integer.valueOf(((TextExtraStruct) obj).getStart()));
    }

    public static final int compare$1(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$10(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj2).getStart()), Integer.valueOf(((TextExtraStruct) obj).getStart()));
    }

    public static final int compare$11(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        int i;
        ClickableSpan clickableSpan = (ClickableSpan) obj2;
        int i2 = 100;
        if (clickableSpan instanceof AbstractC187797Yp) {
            i = ((AbstractC187797Yp) clickableSpan).LJLIL;
        } else {
            i = 100;
        }
        Integer valueOf = Integer.valueOf(i);
        ClickableSpan clickableSpan2 = (ClickableSpan) obj;
        if (clickableSpan2 instanceof AbstractC187797Yp) {
            i2 = ((AbstractC187797Yp) clickableSpan2).LJLIL;
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$12(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C85M) obj).LIZ.getStart()), Integer.valueOf(((C85M) obj2).LIZ.getStart()));
    }

    public static final int compare$2(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(((InterfaceC217378g1) obj2).getPriority(), ((InterfaceC217378g1) obj).getPriority());
    }

    public static final int compare$3(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((UniversalPopupButton) obj).getPosition()), Integer.valueOf(((UniversalPopupButton) obj2).getPosition()));
    }

    public static final int compare$4(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EnumC227268vy) obj).ordinal()), Integer.valueOf(((EnumC227268vy) obj2).ordinal()));
    }

    public static final int compare$5(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C227128vk) obj2).LJLIL.getFollowerStatus()), Integer.valueOf(((C227128vk) obj).LJLIL.getFollowerStatus()));
    }

    public static final int compare$6(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Float.valueOf(((C217098fZ) obj).LJII()), Float.valueOf(((C217098fZ) obj2).LJII()));
    }

    public static final int compare$7(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$8(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$9(IDComparatorS31S0000000_3 iDComparatorS31S0000000_3, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C191707fi) obj2).LJ), Integer.valueOf(((C191707fi) obj).LJ));
    }
}
