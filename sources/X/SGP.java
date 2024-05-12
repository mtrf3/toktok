package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateConfirmationFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateDateFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateMonthFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateRangeFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateYearFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGP extends C1BC {
    public final Fragment[] LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.length;
    }

    public SGP(FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.LJLJJLL = new Fragment[]{new AgeGateRangeFragment(), new AgeGateYearFragment(), new AgeGateMonthFragment(), new AgeGateDateFragment(), new AgeGateConfirmationFragment()};
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return this.LJLJJLL[i];
    }
}
