package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.deeplink.DeeplinkComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0Y extends G0N<DeeplinkComponent, InterfaceC39170FYw> {
    public DeeplinkComponent LIZ;

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        DeeplinkComponent deeplinkComponent = this.LIZ;
        o.LJI(deeplinkComponent);
        LJIIZILJ.invoke(deeplinkComponent);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        DeeplinkComponent deeplinkComponent = new DeeplinkComponent();
        this.LIZ = deeplinkComponent;
        return deeplinkComponent;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if ((componentDependencies.Y() && !((RBX) HG3.LJIILL()).isLogin()) || componentDependencies.cv() == null) {
            return false;
        }
        return true;
    }
}
