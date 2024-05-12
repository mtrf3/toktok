package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.privatetips.PrivateAccountTipsFragment;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40834G0w extends G0N<PrivateAccountTipsFragment, G1L> {
    public PrivateAccountTipsFragment LIZ;

    @Override // X.G0N, X.InterfaceC40768FzI
    public final InterfaceC88472Yns<G1L, C76800UCe> LJI() {
        return new AqS172S0100000_6(this, 54);
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        PrivateAccountTipsFragment privateAccountTipsFragment = this.LIZ;
        o.LJI(privateAccountTipsFragment);
        LJIIZILJ.invoke(privateAccountTipsFragment);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        PrivateAccountTipsFragment privateAccountTipsFragment = new PrivateAccountTipsFragment();
        this.LIZ = privateAccountTipsFragment;
        return privateAccountTipsFragment;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        return componentDependencies.LLJJJIL();
    }
}
