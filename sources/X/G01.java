package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectInterestsComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectTopicInterestsComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G01 extends G0N<AmeBaseFragment, InterfaceC40779FzT> {
    public AbstractSelectInterestFragment LIZ;

    @Override // X.G0N, X.InterfaceC40768FzI
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.G0N, X.InterfaceC40768FzI
    public final InterfaceC88472Yns<InterfaceC40779FzT, C76800UCe> LJI() {
        return G03.LJLIL;
    }

    @Override // X.G0N, X.InterfaceC40768FzI
    public final long LIZ(ComponentDependencies componentDependencies) {
        if (componentDependencies.K70()) {
            return 1000L;
        }
        return 0L;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        AbstractSelectInterestFragment abstractSelectInterestFragment = this.LIZ;
        if (abstractSelectInterestFragment != null) {
            LJIIZILJ.invoke(abstractSelectInterestFragment);
        } else {
            o.LJIJI("component");
            throw null;
        }
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        AbstractSelectInterestFragment selectInterestsComponent;
        o.LJIIIZ(dependencies, "dependencies");
        if (dependencies.ur()) {
            selectInterestsComponent = new SelectTopicInterestsComponent();
        } else {
            selectInterestsComponent = new SelectInterestsComponent();
        }
        this.LIZ = selectInterestsComponent;
        return selectInterestsComponent;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (EOO.LJII() || E59.LIZ() || C35829E4j.LIZ() || E5H.LIZIZ(EnumC40761FzB.JOURNEY_INTERESTS_ID) || EOO.LJFF()) {
            return false;
        }
        FFL.LJIIIZ().getClass();
        boolean LJFF = FFL.LJFF(1, "hybrid_test_experiment_boolean", false, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hybrid_test_experiment_boolean get value:");
        LIZ.append(LJFF);
        C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ));
        if (componentDependencies.LJLJJL().LIZJ() != 1) {
            return false;
        }
        return true;
    }
}
