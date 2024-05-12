package Y;

import X.C66851QLn;
import X.C80786VnC;
import X.C80814Vne;
import X.C80815Vnf;
import X.C80817Vnh;
import X.C82033WHl;
import X.VHA;
import X.VHQ;
import X.WYB;
import android.animation.Keyframe;
import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes15.dex */
public class IDComparatorS42S0000000_14 implements Comparator {
    public final int $t;

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
            case 10:
                return compare$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, obj, obj2);
            case 12:
                return compare$12(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS42S0000000_14(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((VHA) obj).LIZIZ.compareTo(((VHA) obj2).LIZIZ);
    }

    public static final int compare$1(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((C80814Vne) obj).LIZIZ - ((C80814Vne) obj2).LIZIZ;
    }

    public static final int compare$10(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return Float.compare(((Keyframe) obj).getFraction(), ((Keyframe) obj2).getFraction());
    }

    public static final int compare$11(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) obj2;
        if (lynxBaseUI.getTranslationZ() > lynxBaseUI2.getTranslationZ()) {
            return 1;
        }
        if (lynxBaseUI.getTranslationZ() == lynxBaseUI2.getTranslationZ()) {
            return 0;
        }
        return -1;
    }

    public static final int compare$12(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$2(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        View view = (View) obj2;
        Integer viewZIndex = UIGroup.getViewZIndex((View) obj);
        Integer num = 0;
        if (viewZIndex == null) {
            viewZIndex = num;
        }
        Integer viewZIndex2 = UIGroup.getViewZIndex(view);
        if (viewZIndex2 != null) {
            num = viewZIndex2;
        }
        return viewZIndex.intValue() - num.intValue();
    }

    public static final int compare$3(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((C80815Vnf) obj).LIZIZ - ((C80815Vnf) obj2).LIZIZ;
    }

    public static final int compare$4(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((VHQ) obj).LIZIZ.compareTo(((VHQ) obj2).LIZIZ);
    }

    public static final int compare$5(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((C80817Vnh) obj).LIZIZ - ((C80817Vnh) obj2).LIZIZ;
    }

    public static final int compare$6(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C82033WHl) obj).LJII.LJLILLLLZI), Integer.valueOf(((C82033WHl) obj2).LJII.LJLILLLLZI));
    }

    public static final int compare$7(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C82033WHl) obj).LJII.LJLILLLLZI), Integer.valueOf(((C82033WHl) obj2).LJII.LJLILLLLZI));
    }

    public static final int compare$8(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return ((C80786VnC) obj).LIZIZ - ((C80786VnC) obj2).LIZIZ;
    }

    public static final int compare$9(IDComparatorS42S0000000_14 iDComparatorS42S0000000_14, Object obj, Object obj2) {
        return C66851QLn.LJFF(Float.valueOf(((WYB) obj).LJLJJI), Float.valueOf(((WYB) obj2).LJLJJI));
    }
}
