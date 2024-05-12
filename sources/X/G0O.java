package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class G0O extends G0N<C76800UCe, G13> {
    @Override // X.G0N, X.InterfaceC40768FzI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        if (dependencies.LJJLL().invoke().get() == null) {
            dependencies.LJJJJI().invoke();
            return;
        }
        IComplianceService LJIIJ = a.LJIIJ();
        AdFreeTrialPageInfo bp = dependencies.bp();
        if (bp != null) {
            dependencies.j8().invoke(LJIIJ.LJJ(new G1Q(dependencies), bp));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        dependencies.LJJJJI().invoke();
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.bp() == null || !componentDependencies.L40()) {
            return false;
        }
        return a.LJIIJ().LJJI();
    }
}
