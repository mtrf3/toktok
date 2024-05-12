package Y;

import X.AbstractC028509h;
import X.AbstractC42170Ggo;
import X.AbstractC42840Grc;
import X.C0A2;
import X.C41428GNs;
import X.C45499HtP;
import X.C45500HtQ;
import X.C45501HtR;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;

/* loaded from: classes8.dex */
public class IDcS9S0200000_7 extends AbstractC028509h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            case 5:
                return LJFF$5(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        return ((AbstractC42170Ggo) iDcS9S0200000_7.l0).LJLLLLLL(i, (GridLayoutManager) ((C0A2) iDcS9S0200000_7.l1));
    }

    public static final int LJFF$1(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        if (((C45500HtQ) iDcS9S0200000_7.l0).LJLJI.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) iDcS9S0200000_7.l1).LLIIIL;
    }

    public static final int LJFF$2(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        if (((C45501HtR) iDcS9S0200000_7.l0).LJLJI.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) iDcS9S0200000_7.l1).LLIIIL;
    }

    public static final int LJFF$3(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        if (((C45499HtP) iDcS9S0200000_7.l1).LJLJI.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) iDcS9S0200000_7.l0).LLIIIL;
    }

    public static final int LJFF$4(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        int itemViewType = ((C41428GNs) iDcS9S0200000_7.l0).getItemViewType(i);
        if (itemViewType != 105) {
            if (itemViewType != 107) {
                if (itemViewType != 108) {
                    return 1;
                }
                return ((GridLayoutManager) ((C0A2) iDcS9S0200000_7.l1)).LLIIIL;
            }
            return ((GridLayoutManager) ((C0A2) iDcS9S0200000_7.l1)).LLIIIL;
        }
        return ((GridLayoutManager) ((C0A2) iDcS9S0200000_7.l1)).LLIIIL;
    }

    public static final int LJFF$5(IDcS9S0200000_7 iDcS9S0200000_7, int i) {
        if (((AbstractC42840Grc) iDcS9S0200000_7.l1).getItemViewType(i) == Integer.MIN_VALUE) {
            return ((GridLayoutManager) iDcS9S0200000_7.l0).LLIIIL;
        }
        ((AbstractC42840Grc) iDcS9S0200000_7.l1).getClass();
        return 1;
    }

    public IDcS9S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
