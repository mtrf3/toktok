package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridSparkLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NV0 extends AbstractC60800Ntc {
    public final /* synthetic */ AdHybridSparkLoader LJLIL;

    public NV0(AdHybridSparkLoader adHybridSparkLoader) {
        this.LJLIL = adHybridSparkLoader;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        AdHybridSparkLoader adHybridSparkLoader = this.LJLIL;
        if (!adHybridSparkLoader.isPreRenderLoadFailed) {
            adHybridSparkLoader.setPreloadSuccess(true);
            InterfaceC59068NGe iAdHybridPreRenderStatus = this.LJLIL.getIAdHybridPreRenderStatus();
            if (iAdHybridPreRenderStatus != null) {
                iAdHybridPreRenderStatus.LIZJ();
            }
            AdHybridSparkLoader.Companion.getClass();
            C58582Rq.LIZ("prerender onLoadSuccess", AdHybridSparkLoader.tag);
        }
        AdHybridSparkLoader.Companion.getClass();
        C58582Rq.LIZ("prerender onLoadFinish", AdHybridSparkLoader.tag);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AdHybridSparkLoader adHybridSparkLoader = this.LJLIL;
        adHybridSparkLoader.isPreRenderLoadFailed = false;
        adHybridSparkLoader.preRenderLoadFailedReason = null;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        AdHybridSparkLoader adHybridSparkLoader = this.LJLIL;
        adHybridSparkLoader.isPreRenderLoadFailed = true;
        adHybridSparkLoader.preRenderLoadFailedReason = c60704Ns4;
        adHybridSparkLoader.setPreloadSuccess(false);
        InterfaceC59068NGe iAdHybridPreRenderStatus = this.LJLIL.getIAdHybridPreRenderStatus();
        if (iAdHybridPreRenderStatus != null) {
            iAdHybridPreRenderStatus.LJ(String.valueOf(c60704Ns4.LIZ), String.valueOf(c60704Ns4.LIZIZ));
        }
        AdHybridSparkLoader.Companion.getClass();
        C58582Rq.LIZ("prerender onLoadFailed", AdHybridSparkLoader.tag);
    }
}
