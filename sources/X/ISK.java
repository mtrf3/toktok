package X;

import Y.ARunnableS2S0010000_8;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class ISK implements Callable<ISM> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ SimVideoUrlModel LJLJJI;
    public final /* synthetic */ C46539IOh LJLJJL;
    public final /* synthetic */ HashMap LJLJJLL;

    @Override // java.util.concurrent.Callable
    public final ISM call() {
        String LIZIZ;
        int i;
        int i2 = 0;
        C46982IcE.LIZLLL.execute(new ARunnableS2S0010000_8(false, 1));
        ISN isn = new ISN();
        isn.LIZ.LIZIZ = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C46982IcE.LIZIZ().getAppID());
        LIZ.append("");
        isn.LIZ.LIZ = X1D.LIZIZ(LIZ);
        isn.LIZ.LIZJ = C46982IcE.LIZIZ().getAppVersion();
        if (IZ8.LJJJJJL()) {
            LIZIZ = C46664ITc.LJIJ.LJIIIZ(this.LJLIL);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLILLLLZI);
            LIZ2.append("");
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        isn.LIZ.LJFF = LIZIZ;
        int preloadType = IXN.LIZJ.getPreloadType();
        ISM ism = isn.LIZ;
        ism.LJ = preloadType;
        if (this.LJLJI > 0) {
            i2 = 1;
        }
        ism.LJII = i2;
        boolean isCacheCompleted = C47242IgQ.LIZ().isCacheCompleted(this.LJLJJI);
        isn.LIZ.LJIIIIZZ = isCacheCompleted ? 1 : 0;
        SimVideoUrlModel simVideoUrlModel = this.LJLJJI;
        if (simVideoUrlModel != null) {
            i = (int) simVideoUrlModel.getDuration();
        } else {
            i = -1;
        }
        isn.LIZ.LIZLLL = i;
        String networkTypeDetail = C46982IcE.LIZIZ().getNetworkTypeDetail(null);
        ISM ism2 = isn.LIZ;
        ism2.LJI = networkTypeDetail;
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL.LJLJJL;
        if (interfaceC46541IOj != null) {
            ism2.LIZ(interfaceC46541IOj.LJ());
        }
        ism2.LIZ(this.LJLJJLL);
        return ism2;
    }

    public ISK(String str, Long l, int i, SimVideoUrlModel simVideoUrlModel, C46539IOh c46539IOh, HashMap hashMap) {
        this.LJLIL = str;
        this.LJLILLLLZI = l;
        this.LJLJI = i;
        this.LJLJJI = simVideoUrlModel;
        this.LJLJJL = c46539IOh;
        this.LJLJJLL = hashMap;
    }
}
