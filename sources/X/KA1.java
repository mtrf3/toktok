package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA1 extends AbstractC60800Ntc {
    public final /* synthetic */ EcDynamicSingleIntermediateFragmentNew LJLIL;

    public KA1(EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew) {
        this.LJLIL = ecDynamicSingleIntermediateFragmentNew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFinish isFromCache:");
        C50863Jxj c50863Jxj = this.LJLIL.LJZL;
        if (c50863Jxj != null) {
            LIZ.append(c50863Jxj.LJIIJJI);
            LIZ.append(" thread:");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            X1D.LIZIZ(LIZ);
            C50863Jxj c50863Jxj2 = this.LJLIL.LJZL;
            if (c50863Jxj2 != null) {
                if (c50863Jxj2.LJIIJJI && (view instanceof View) && (((View) view).getParent() instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
                    C51395KFb.LIZ(new AqS155S0200000_8(view, this.LJLIL, 24));
                    return;
                }
                return;
            }
            o.LJIJI("dynamicViewsContainer");
            throw null;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.Tl();
    }
}
