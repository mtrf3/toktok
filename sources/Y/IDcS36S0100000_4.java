package Y;

import X.AbstractC028509h;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* loaded from: classes5.dex */
public class IDcS36S0100000_4 extends AbstractC028509h {
    public final int $t;
    public Object l0;

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

    public IDcS36S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(IDcS36S0100000_4 iDcS36S0100000_4, int i) {
        if (i == 0) {
            return ((GridLayoutManager) iDcS36S0100000_4.l0).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS36S0100000_4 iDcS36S0100000_4, int i) {
        if (i >= 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) iDcS36S0100000_4.l0).LLIIIL;
    }
}
