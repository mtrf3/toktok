package Y;

import X.AbstractC028509h;
import X.BMH;
import X.C0A2;
import X.C28665BMv;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes6.dex */
public class IDcS8S0200000_5 extends AbstractC028509h {
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
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(IDcS8S0200000_5 iDcS8S0200000_5, int i) {
        if (((C28665BMv) iDcS8S0200000_5.l0).getItemViewType(i) != 1) {
            return 1;
        }
        return ((GridLayoutManager) ((C0A2) iDcS8S0200000_5.l1)).LLIIIL;
    }

    public static final int LJFF$1(IDcS8S0200000_5 iDcS8S0200000_5, int i) {
        if (((BMH) iDcS8S0200000_5.l0).getItemViewType(i) != 1) {
            return 1;
        }
        return ((GridLayoutManager) ((C0A2) iDcS8S0200000_5.l1)).LLIIIL;
    }

    public IDcS8S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
