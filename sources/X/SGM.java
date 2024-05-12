package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateYearFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGM implements SFE {
    public final /* synthetic */ AgeGateYearFragment LIZ;

    public SGM(AgeGateYearFragment ageGateYearFragment) {
        this.LIZ = ageGateYearFragment;
    }

    @Override // X.SFE
    public final void LIZ(String value) {
        o.LJIIIZ(value, "value");
        this.LIZ.vl().LJLJJL = CastIntegerProtector.parseInt(value);
        this.LIZ._$_findCachedViewById(R.id.b1s).setClickable(false);
        OPZ.LIZIZ(1, "year");
    }
}
