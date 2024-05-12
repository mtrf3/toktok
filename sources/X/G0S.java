package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0S extends G0N<LynxExperienceFragment, InterfaceC40778FzS> {
    public LynxExperienceFragment LIZ;

    @Override // X.G0N, X.InterfaceC40768FzI
    public final long LIZ(ComponentDependencies componentDependencies) {
        C31968Cge R4 = componentDependencies.R4();
        if (o.LJ("lynx_v1", componentDependencies.a7()) && (R4 == null || R4.LIZJ == null)) {
            return 1000L;
        }
        return 0L;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        LynxExperienceFragment lynxExperienceFragment = this.LIZ;
        if (lynxExperienceFragment != null) {
            LJIIZILJ.invoke(lynxExperienceFragment);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        LynxExperienceFragment lynxExperienceFragment = new LynxExperienceFragment();
        this.LIZ = lynxExperienceFragment;
        return lynxExperienceFragment;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.o0() == null || (!o.LJ(componentDependencies.a7(), "lynx_v1") && !o.LJ(componentDependencies.a7(), "lynx_v2"))) {
            return false;
        }
        return true;
    }
}
