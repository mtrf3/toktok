package X;

import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0P extends G0N<C76800UCe, InterfaceC40807Fzv> {
    @Override // X.G0N, X.InterfaceC40768FzI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.G0N, X.InterfaceC40768FzI
    public final InterfaceC88472Yns<InterfaceC40807Fzv, C76800UCe> LJI() {
        return G1J.LJLIL;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        ActivityC45651qj activityC45651qj = dependencies.LJJLL().invoke().get();
        if (activityC45651qj == null) {
            dependencies.LJJJJI().invoke();
            return;
        }
        ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
        if (LJJIL == null) {
            dependencies.LJJJJI().invoke();
        } else {
            LJJIL.LIZLLL(activityC45651qj, new C40808Fzw(dependencies));
        }
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.LJLJJL().LIZJ() == 3) {
            return true;
        }
        return false;
    }
}
