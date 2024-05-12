package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.IOt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC46551IOt implements Callable<C46554IOw> {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ InterfaceC46645ISj LJLJJL;
    public final /* synthetic */ C46539IOh LJLJJLL;
    public final /* synthetic */ HashMap LJLJL;

    @Override // java.util.concurrent.Callable
    public final C46554IOw call() {
        String LIZIZ;
        C46556IOy LJIIIIZZ = C47242IgQ.LIZ().LJIIIIZZ(this.LJLIL);
        C46555IOx c46555IOx = new C46555IOx();
        if (LJIIIIZZ != null) {
            c46555IOx.LIZ.LJIIJ = Double.valueOf((LJIIIIZZ.LIZ * 1.0f) / LJIIIIZZ.LIZJ);
            c46555IOx.LIZ.LJIIJJI = Double.valueOf((LJIIIIZZ.LIZIZ * 1.0f) / LJIIIIZZ.LIZJ);
            c46555IOx.LIZ.LJIIIZ = Integer.valueOf(LJIIIIZZ.LIZJ);
        }
        c46555IOx.LIZ.LJI = this.LJLILLLLZI;
        if (IZ8.LJJJJJL()) {
            LIZIZ = C46664ITc.LJIJ.LJIIIZ(this.LJLJI);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJI);
            LIZ.append("");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        c46555IOx.LIZ.LJII = LIZIZ;
        c46555IOx.LIZ.LIZJ = this.LJLJJL.getCurrentPosition();
        c46555IOx.LIZ.LIZIZ = this.LJLJJL.LJIILL();
        c46555IOx.LIZ.LJ = C1DG.LIZ().LIZJ();
        c46555IOx.LIZ.LJIIIIZZ = this.LJLJJL.getPlayerType().toString();
        boolean isCache = C47242IgQ.LIZ().isCache(this.LJLIL);
        C46554IOw c46554IOw = c46555IOx.LIZ;
        c46554IOw.LIZ = isCache ? 1 : 0;
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJLL.LJLJJL;
        if (interfaceC46541IOj != null) {
            c46554IOw.LIZIZ(interfaceC46541IOj.LIZLLL());
        }
        c46554IOw.LIZIZ(this.LJLJL);
        return c46554IOw;
    }

    public CallableC46551IOt(SimVideoUrlModel simVideoUrlModel, String str, Long l, InterfaceC46645ISj interfaceC46645ISj, C46539IOh c46539IOh, HashMap hashMap) {
        this.LJLIL = simVideoUrlModel;
        this.LJLJI = str;
        this.LJLJJI = l;
        this.LJLJJL = interfaceC46645ISj;
        this.LJLJJLL = c46539IOh;
        this.LJLJL = hashMap;
    }
}
