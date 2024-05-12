package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateDateFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGO implements SFE {
    public final /* synthetic */ AgeGateDateFragment LIZ;

    public SGO(AgeGateDateFragment ageGateDateFragment) {
        this.LIZ = ageGateDateFragment;
    }

    @Override // X.SFE
    public final void LIZ(String value) {
        o.LJIIIZ(value, "value");
        this.LIZ.vl().LJLJL = CastIntegerProtector.parseInt(value);
        this.LIZ._$_findCachedViewById(R.id.b1s).setClickable(false);
        OPZ.LIZIZ(1, "day");
    }
}
