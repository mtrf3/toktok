package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;

/* loaded from: classes7.dex */
public final class FD8 extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> LIZ;

    public FD8(FD7 fd7) {
        this.LIZ = fd7;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        this.LIZ.invoke(localPackageModel.getChannel(), "LocalNewestVersion", Boolean.TRUE, null);
        String channel = localPackageModel.getChannel();
        if (channel != null) {
            EcomGeckoUpdateInterceptor.LJLJJI.add(channel);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZ(UpdatePackage updatePackage, Throwable th) {
        String str;
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        String str2 = null;
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str2 = th.getMessage();
        }
        interfaceC88474Ynu.invoke(str, "ActivateFail", bool, str2);
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        String str;
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        interfaceC88474Ynu.invoke(null, "CheckServerVersionFail", bool, str);
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        String str;
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        String str2 = null;
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str2 = th.getMessage();
        }
        interfaceC88474Ynu.invoke(str, "DownloadFail", bool, str2);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        String str2 = null;
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        Boolean bool = Boolean.FALSE;
        if (th != null) {
            str2 = th.getMessage();
        }
        interfaceC88474Ynu.invoke(str, "UpdateFailed", bool, str2);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String str) {
        if (str != null) {
            EcomGeckoUpdateInterceptor.LJLJJI.add(str);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        String channel;
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        interfaceC88474Ynu.invoke(str, "UpdateSuccess", Boolean.TRUE, null);
        if (updatePackage != null && (channel = updatePackage.getChannel()) != null) {
            EcomGeckoUpdateInterceptor.LJLJJI.add(channel);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> interfaceC88474Ynu = this.LIZ;
        Boolean bool = Boolean.FALSE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("code_");
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(th.getMessage());
        interfaceC88474Ynu.invoke(null, "CheckRequestIntercept", bool, X1D.LIZIZ(LIZ));
    }
}
