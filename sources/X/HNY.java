package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNY implements InterfaceC84907XTz {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88471Ynr<TNW, String, C76800UCe> LIZLLL;
    public final /* synthetic */ boolean LJ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        this.LIZ.invoke();
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        boolean z;
        if (aVMusic == null) {
            this.LIZ.invoke();
            return;
        }
        String LIZIZ = H9H.LIZIZ(this.LIZIZ);
        HNW LJJIJ = C60903NvH.LJIIJJI().LJJIJ();
        Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
        o.LJIIIIZZ(LLLLJI, "getApplication().applicationContext");
        if (!LJJIJ.LJIJJ(aVMusic, LLLLJI)) {
            this.LIZ.invoke();
            return;
        }
        if (LIZIZ == null || LIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LIZJ.invoke(100);
            this.LIZLLL.invoke(aVMusic, LIZIZ);
        } else if (!this.LJ) {
            this.LIZJ.invoke(100);
            this.LIZLLL.invoke(aVMusic, null);
        } else {
            HNW LJJIJ2 = C60903NvH.LJIIJJI().LJJIJ();
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            LJJIJ2.LJIILL(application, aVMusic, 0, false, new HNZ(this.LIZJ, this.LIZLLL, aVMusic, this.LIZ));
        }
    }

    public HNY(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, boolean z) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = str;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC88471Ynr;
        this.LJ = z;
    }
}
