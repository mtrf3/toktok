package X;

import com.ss.android.ugc.aweme.services.ISDKService;
import kotlin.jvm.internal.IDqS184S0200000_7;

/* loaded from: classes8.dex */
public final class ICM implements ISDKService.SplitCallback {
    public final /* synthetic */ ICL LIZ;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, String, C76800UCe> LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onFail() {
        InterfaceC88473Ynt<Boolean, String, String, C76800UCe> interfaceC88473Ynt = this.LIZIZ;
        Boolean bool = Boolean.FALSE;
        ICL icl = this.LIZ;
        interfaceC88473Ynt.invoke(bool, icl.LJI, icl.LJII);
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final boolean checkIsCanceled() {
        return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
    }

    public ICM(ICL icl, IDqS184S0200000_7 iDqS184S0200000_7) {
        this.LIZ = icl;
        this.LIZIZ = iDqS184S0200000_7;
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onSuccess(int i, int i2) {
        ICL icl = this.LIZ;
        C44694HgQ.LIZJ(icl.LJ, icl.LJI);
        ICL icl2 = this.LIZ;
        C44687HgJ.LIZLLL(icl2.LJFF, icl2.LJII);
        InterfaceC88473Ynt<Boolean, String, String, C76800UCe> interfaceC88473Ynt = this.LIZIZ;
        Boolean bool = Boolean.TRUE;
        ICL icl3 = this.LIZ;
        interfaceC88473Ynt.invoke(bool, icl3.LJI, icl3.LJII);
    }
}
