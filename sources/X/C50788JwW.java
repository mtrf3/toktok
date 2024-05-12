package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JwW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50788JwW extends AbstractC60800Ntc {
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LJLIL;

    public C50788JwW(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew) {
        this.LJLIL = dynamicSingleIntermediateFragmentNew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        VNS vns;
        o.LJIIIZ(view, "view");
        if (C50845JxR.LIZ() && C34444DfU.LJLILLLLZI.LJJII() && (vns = (VNS) view.LIZJ()) != null) {
            vns.startLynxRuntime();
        }
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0 && c50789JwX.LJIIJJI > 0) {
            c50789JwX.LJJI = System.currentTimeMillis() - c50789JwX.LJIIJJI;
            if (C34444DfU.LJLILLLLZI.LJJII()) {
                c50789JwX.LJJIIJZLJL = c50789JwX.LJJI;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFinish isFromCache:");
        C50799Jwh c50799Jwh = this.LJLIL.LLFFF;
        if (c50799Jwh != null) {
            LIZ.append(c50799Jwh.LJIIL);
            LIZ.append(" thread:");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            X1D.LIZIZ(LIZ);
            C50799Jwh c50799Jwh2 = this.LJLIL.LLFFF;
            if (c50799Jwh2 != null) {
                if (c50799Jwh2.LJIIL && (view instanceof View) && (((View) view).getParent() instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
                    C2VQ.LIZIZ(new AqS155S0200000_8(view, this.LJLIL, 30), 0L);
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
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJIIJJI = System.currentTimeMillis();
        }
    }
}
