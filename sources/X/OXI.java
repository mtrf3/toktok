package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXI extends AbstractC60800Ntc {
    public final /* synthetic */ OXH LJLIL;

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

    public OXI(OXH oxh) {
        this.LJLIL = oxh;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(view, "view");
        C62394OeE c62394OeE = this.LJLIL.LIZLLL;
        if (c62394OeE != null) {
            baseSharePackage = c62394OeE.LJIIZILJ;
        } else {
            baseSharePackage = null;
        }
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage");
        ((HybridImageSharePackage) baseSharePackage).isHybridLoadFinish = true;
        this.LJLIL.LJFF = true;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C62394OeE c62394OeE = this.LJLIL.LIZLLL;
        if (c62394OeE != null) {
            baseSharePackage = c62394OeE.LJIIZILJ;
        } else {
            baseSharePackage = null;
        }
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage");
        ((HybridImageSharePackage) baseSharePackage).isHybridLoadFailed = true;
    }
}
