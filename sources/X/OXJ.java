package X;

import com.ss.android.ugc.aweme.HybridShellActivity;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXJ extends AbstractC60800Ntc {
    public final /* synthetic */ HybridShellActivity LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
    }

    public OXJ(HybridShellActivity hybridShellActivity) {
        this.LJLIL = hybridShellActivity;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(view, "view");
        C62387Oe7 c62387Oe7 = this.LJLIL.LJLIL;
        if (c62387Oe7 != null) {
            baseSharePackage = c62387Oe7.LJIIJ;
        } else {
            baseSharePackage = null;
        }
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage");
        ((HybridImageSharePackage) baseSharePackage).isHybridLoadFinish = true;
        this.LJLIL.LJLJI = true;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C62387Oe7 c62387Oe7 = this.LJLIL.LJLIL;
        if (c62387Oe7 != null) {
            baseSharePackage = c62387Oe7.LJIIJ;
        } else {
            baseSharePackage = null;
        }
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage");
        ((HybridImageSharePackage) baseSharePackage).isHybridLoadFailed = true;
    }
}
