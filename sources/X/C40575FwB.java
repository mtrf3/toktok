package X;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: X.FwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40575FwB extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C40579FwF LJLJI;
    public final /* synthetic */ C40571Fw7 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40575FwB(C40571Fw7 c40571Fw7, C40579FwF c40579FwF, int i, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJJI = c40571Fw7;
        this.LJLILLLLZI = i;
        this.LJLJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        try {
            C40571Fw7 c40571Fw7 = this.LJLJJI;
            InterfaceC40576FwC interfaceC40576FwC = c40571Fw7.LIZIZ.LJIIJ;
            String str = c40571Fw7.LIZ;
            int i = this.LJLILLLLZI;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore_version_code", 10900);
            interfaceC40576FwC.p(str, i, bundle, new BinderC40587FwN(this.LJLJJI, this.LJLJI));
        } catch (RemoteException e) {
            C40571Fw7.LIZJ.getClass();
            this.LJLJI.LIZIZ(new RuntimeException(e));
        }
    }
}
