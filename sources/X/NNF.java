package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNF {
    public Context LIZ;
    public final List<NNJ> LIZIZ;
    public NNR LIZJ;

    public final boolean LIZ() {
        NNG nng = NNG.LIZIZ;
        nng.LIZ.LIZLLL("ad_lynx_download_AdRouterTask_execute", "begin", String.valueOf(this.LIZJ.LIZ.LIZJ));
        for (NNJ nnj : this.LIZIZ) {
            Context context = this.LIZ;
            nnj.getClass();
            o.LJIIIZ(context, "<set-?>");
            nnj.LIZ = context;
            NNR nnr = this.LIZJ;
            o.LJIIIZ(nnr, "<set-?>");
            nnj.LIZIZ = nnr;
            if (nnj.LIZ()) {
                boolean LIZIZ = nnj.LIZIZ();
                nnj.LJ(LIZIZ, this.LIZJ);
                if (LIZIZ) {
                    NNG nng2 = NNG.LIZIZ;
                    nng2.LIZ.LIZLLL("ad_lynx_download_AdRouterTask_execute", "success", String.valueOf(this.LIZJ.LIZ.LIZJ));
                    return true;
                }
            }
        }
        NNG nng3 = NNG.LIZIZ;
        nng3.LIZ.LIZLLL("ad_lynx_download_AdRouterTask_execute", "fail", String.valueOf(this.LIZJ.LIZ.LIZJ));
        return false;
    }

    public NNF(int i) {
        Context LIZIZ = EF7.LIZIZ();
        ArrayList arrayList = new ArrayList();
        NNR nnr = new NNS().LIZ;
        this.LIZ = LIZIZ;
        this.LIZIZ = arrayList;
        this.LIZJ = nnr;
    }
}
