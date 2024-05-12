package X;

import android.content.Context;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5N extends NNK {
    public final /* synthetic */ Context LIZLLL;

    public N5N(Context context) {
        this.LIZLLL = context;
    }

    @Override // X.NNJ
    public final void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
        if (z) {
            String str = params.LJ.LIZ;
            String valueOf = String.valueOf(params.LIZ.LIZJ);
            C59270NNy c59270NNy = params.LIZ;
            C58655N0h LJ = C58704N2e.LJ(str, "open_url_app", valueOf, c59270NNy.LIZLLL, String.valueOf(c59270NNy.LJ));
            LJ.LIZJ(params.LJ.LIZIZ, "refer");
            LJ.LIZIZ(params.LIZJ.LIZ, "app_url");
            LJ.LIZIZ(params.LJ.LIZIZ, "enter_from");
            LJ.LJII();
            NNG nng = NNG.LIZIZ;
            nng.LIZ.pendingDeepLinkLog(new AqS141S0200000_10(this.LIZLLL, params, 60));
            nng.LIZ.LJII(new AqS176S0100000_10(params, 237));
        }
    }
}
