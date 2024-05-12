package X;

import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateCTNViewModel;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateMonthFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGK implements SFE {
    public final /* synthetic */ AgeGateMonthFragment LIZ;
    public final /* synthetic */ List<String> LIZIZ;

    @Override // X.SFE
    public final void LIZ(String value) {
        o.LJIIIZ(value, "value");
        ((AgeGateCTNViewModel) this.LIZ.LJLIL.getValue()).LJLJJLL = this.LIZIZ.indexOf(value);
        this.LIZ._$_findCachedViewById(R.id.b1s).setClickable(false);
        OPZ.LIZIZ(1, "month");
    }

    public SGK(AgeGateMonthFragment ageGateMonthFragment, List<String> list) {
        this.LIZ = ageGateMonthFragment;
        this.LIZIZ = list;
    }
}
