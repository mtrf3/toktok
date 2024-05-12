package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.FzE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40764FzE extends G0N<SloganFragment, InterfaceC39169FYv> {
    public ControlSloganFragment LIZ;

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        return true;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> kH = dependencies.kH();
        ControlSloganFragment controlSloganFragment = this.LIZ;
        if (controlSloganFragment != null) {
            kH.invoke(controlSloganFragment);
        } else {
            o.LJIJI("component");
            throw null;
        }
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        boolean z;
        o.LJIIIZ(dependencies, "dependencies");
        this.LIZ = new ControlSloganFragment();
        Bundle bundle = new Bundle();
        if (dependencies.xL() > 0) {
            bundle.putInt("extra_optimize_option", dependencies.xL());
            bundle.putBoolean("extra_is_saveinstance", dependencies.uS());
        }
        if (dependencies.LJLJJL().LIZJ() == 3) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("extra_new_version", z);
        bundle.putBoolean("useNewAppUpdateSloganUI", dependencies.Uh0());
        ControlSloganFragment controlSloganFragment = this.LIZ;
        if (controlSloganFragment != null) {
            controlSloganFragment.setArguments(bundle);
            ControlSloganFragment controlSloganFragment2 = this.LIZ;
            if (controlSloganFragment2 != null) {
                return controlSloganFragment2;
            }
            o.LJIJI("component");
            throw null;
        }
        o.LJIJI("component");
        throw null;
    }
}
