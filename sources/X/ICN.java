package X;

import com.ss.android.ugc.aweme.services.ISDKService;
import kotlin.jvm.internal.IDqS184S0200000_7;

/* loaded from: classes8.dex */
public final class ICN implements ISDKService.SplitCallback {
    public final /* synthetic */ ICK LIZ;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, String, C76800UCe> LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onFail() {
        InterfaceC88473Ynt<Boolean, String, String, C76800UCe> interfaceC88473Ynt = this.LIZIZ;
        Boolean bool = Boolean.FALSE;
        ICK ick = this.LIZ;
        interfaceC88473Ynt.invoke(bool, ick.LJI, ick.LJII);
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final boolean checkIsCanceled() {
        return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
    }

    public ICN(ICK ick, IDqS184S0200000_7 iDqS184S0200000_7) {
        this.LIZ = ick;
        this.LIZIZ = iDqS184S0200000_7;
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onSuccess(int i, int i2) {
        ICK ick = this.LIZ;
        C44694HgQ.LIZJ(ick.LJ, ick.LJI);
        ICK ick2 = this.LIZ;
        C44687HgJ.LIZLLL(ick2.LJFF, ick2.LJII);
        InterfaceC88473Ynt<Boolean, String, String, C76800UCe> interfaceC88473Ynt = this.LIZIZ;
        Boolean bool = Boolean.TRUE;
        ICK ick3 = this.LIZ;
        interfaceC88473Ynt.invoke(bool, ick3.LJI, ick3.LJII);
    }
}
