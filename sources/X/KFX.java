package X;

import com.ss.android.ugc.aweme.result.common.core.ui.EcDynamicSearchLiveFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFX extends AbstractC60800Ntc {
    public final /* synthetic */ EcDynamicSearchLiveFragment LJLIL;

    public KFX(EcDynamicSearchLiveFragment ecDynamicSearchLiveFragment) {
        this.LJLIL = ecDynamicSearchLiveFragment;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        KGP kgp = this.LJLIL.LJZL;
        if (kgp != null && C58802Sm.LIZ()) {
            EcDynamicSearchLiveFragment ecDynamicSearchLiveFragment = this.LJLIL;
            KFW kfw = new KFW(view, "search-live-tab");
            ecDynamicSearchLiveFragment.LL = kfw;
            kgp.LJLJJLL = kfw;
        }
    }
}
