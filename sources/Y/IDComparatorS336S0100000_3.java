package Y;

import X.AbstractC216708ew;
import X.C217128fc;
import X.C66851QLn;
import android.text.Editable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class IDComparatorS336S0100000_3 implements Comparator {
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
            default:
                return 0;
        }
    }

    public IDComparatorS336S0100000_3(Editable editable, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.l0 = editable;
                return;
            default:
                this.l0 = editable;
                return;
        }
    }

    public IDComparatorS336S0100000_3(C217128fc c217128fc, int i) {
        this.$t = i;
        this.l0 = c217128fc;
    }

    public static final int compare$0(IDComparatorS336S0100000_3 iDComparatorS336S0100000_3, Object obj, Object obj2) {
        return ((Editable) iDComparatorS336S0100000_3.l0).getSpanStart(obj) - ((Editable) iDComparatorS336S0100000_3.l0).getSpanStart(obj2);
    }

    public static final int compare$1(IDComparatorS336S0100000_3 iDComparatorS336S0100000_3, Object obj, Object obj2) {
        return ((Editable) iDComparatorS336S0100000_3.l0).getSpanStart(obj) - ((Editable) iDComparatorS336S0100000_3.l0).getSpanStart(obj2);
    }

    public static final int compare$2(IDComparatorS336S0100000_3 iDComparatorS336S0100000_3, Object obj, Object obj2) {
        Editable editable = (Editable) iDComparatorS336S0100000_3.l0;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }

    public static final int compare$3(IDComparatorS336S0100000_3 iDComparatorS336S0100000_3, Object obj, Object obj2) {
        Comparable<?> comparable;
        Comparable<?> invoke = ((C217128fc) iDComparatorS336S0100000_3.l0).LIZ.LIZJ.LIZLLL.invoke(((AbstractC216708ew) obj2).LIZ);
        Comparable<?> comparable2 = null;
        if (invoke instanceof Comparable) {
            comparable = invoke;
        } else {
            comparable = null;
        }
        Comparable<?> invoke2 = ((C217128fc) iDComparatorS336S0100000_3.l0).LIZ.LIZJ.LIZLLL.invoke(((AbstractC216708ew) obj).LIZ);
        if (invoke2 instanceof Comparable) {
            comparable2 = invoke2;
        }
        return C66851QLn.LJFF(comparable, comparable2);
    }
}
