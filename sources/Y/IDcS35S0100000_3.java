package Y;

import X.AbstractC028509h;
import X.C219778jt;
import X.C220368kq;
import X.C220378kr;
import X.MGV;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailAwemeListFragment;

/* loaded from: classes4.dex */
public class IDcS35S0100000_3 extends AbstractC028509h {
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

    public IDcS35S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(IDcS35S0100000_3 iDcS35S0100000_3, int i) {
        int i2;
        C220378kr c220378kr;
        C220368kq presenter$addyours_release;
        C219778jt c219778jt;
        if (i == 0) {
            return ((AddYoursDetailAwemeListFragment) iDcS35S0100000_3.l0).Kl();
        }
        MGV mgv = ((AddYoursDetailAwemeListFragment) iDcS35S0100000_3.l0).LLILLIZIL;
        if ((mgv instanceof C220378kr) && (c220378kr = (C220378kr) mgv) != null && (presenter$addyours_release = c220378kr.getPresenter$addyours_release()) != null && (c219778jt = (C219778jt) presenter$addyours_release.LJLIL) != null) {
            i2 = c219778jt.LJLJLJ;
        } else {
            i2 = 0;
        }
        if (i >= i2 + 1) {
            return ((AddYoursDetailAwemeListFragment) iDcS35S0100000_3.l0).Kl();
        }
        return 1;
    }

    public static final int LJFF$1(IDcS35S0100000_3 iDcS35S0100000_3, int i) {
        if (i != ((GridLayoutManager) iDcS35S0100000_3.l0).LJJJJZ() - 1) {
            return 1;
        }
        return 2;
    }
}
