package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes7.dex */
public final class FDI extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC88473Ynt<String, Boolean, String, C76800UCe> LIZ;

    public FDI(C38595FCt c38595FCt) {
        this.LIZ = c38595FCt;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        this.LIZ.invoke("onLocalNewestVersion", Boolean.FALSE, "local newest version");
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        String str;
        InterfaceC88473Ynt<String, Boolean, String, C76800UCe> interfaceC88473Ynt = this.LIZ;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        interfaceC88473Ynt.invoke("onCheckServerVersionFail", bool, str);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        InterfaceC88473Ynt<String, Boolean, String, C76800UCe> interfaceC88473Ynt = this.LIZ;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        interfaceC88473Ynt.invoke("onUpdateFailed", bool, str);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        this.LIZ.invoke("onUpdateSuccess", Boolean.TRUE, null);
    }
}
