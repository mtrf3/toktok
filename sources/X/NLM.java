package X;

import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLM extends NM4 {
    public final /* synthetic */ ShakeEgg LJLIL;

    public NLM(ShakeEgg shakeEgg) {
        this.LJLIL = shakeEgg;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ShakeEgg shakeEgg = this.LJLIL;
        if (shakeEgg.LLF) {
            shakeEgg.LJLJJL = true;
            shakeEgg.LJIIJJI(NLL.LOAD_SUCCESS);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LJIIJ(false);
        ShakeEgg shakeEgg = this.LJLIL;
        shakeEgg.LLF = true;
        shakeEgg.LJIIJJI(NLL.LOAD_START);
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LJIIJ(false);
        ShakeEgg shakeEgg = this.LJLIL;
        shakeEgg.LLF = false;
        shakeEgg.LJIIJJI(NLL.LOAD_FAIL);
    }
}
