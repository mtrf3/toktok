package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import kotlin.jvm.internal.o;

/* renamed from: X.Rh5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70215Rh5 extends AbstractC65781Prl implements InterfaceC88471Ynr<PdpMainState, Bundle, PdpMainState> {
    public final /* synthetic */ PdpFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70215Rh5(PdpFragment pdpFragment) {
        super(2);
        this.LJLIL = pdpFragment;
    }

    @Override // X.InterfaceC88471Ynr
    public final PdpMainState invoke(PdpMainState pdpMainState, Bundle bundle) {
        PdpMainState viewModel = pdpMainState;
        o.LJIIIZ(viewModel, "$this$viewModel");
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null && arguments.getBoolean("full_screen")) {
            return PdpMainState.copy$default(viewModel, false, null, null, false, 3, null, null, 1.0f, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -145, null);
        }
        return viewModel;
    }
}
