package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import kotlin.jvm.internal.AqS15S0200100_9;

/* renamed from: X.Lag, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54530Lag extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZJ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            String channel = localPackageModel.getChannel();
            if (channel == null) {
                channel = "";
            }
            interfaceC88472Yns.invoke(channel);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZJ;
        if (interfaceC88472Yns != null) {
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(str);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(str);
        }
    }

    public C54530Lag(AqS15S0200100_9 aqS15S0200100_9, AqS15S0200100_9 aqS15S0200100_92, AqS15S0200100_9 aqS15S0200100_93) {
        this.LIZ = aqS15S0200100_9;
        this.LIZIZ = aqS15S0200100_92;
        this.LIZJ = aqS15S0200100_93;
    }
}
