package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.LiveVerticalAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFV extends AbstractC60800Ntc {
    public final /* synthetic */ LiveVerticalAssem LJLIL;

    public KFV(LiveVerticalAssem liveVerticalAssem) {
        this.LJLIL = liveVerticalAssem;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        ISearchVerticalContext iSearchVerticalContext;
        o.LJIIIZ(view, "view");
        if (C58802Sm.LIZ()) {
            this.LJLIL.LJLJJI = new KFW(view, "search-live-tab");
            LiveVerticalAssem liveVerticalAssem = this.LJLIL;
            KFW kfw = liveVerticalAssem.LJLJJI;
            if (kfw != null && (iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(liveVerticalAssem), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.aQ(kfw);
            }
        }
    }
}
