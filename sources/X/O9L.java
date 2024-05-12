package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9L extends O9M {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        OGE oge;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            oge = (OGE) interfaceC38263Ezz.LJ(OGE.class);
        } else {
            oge = null;
        }
        PdpCardBridgeServiceImpl.LJI().LIZIZ(oge);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(O9O.class, null), "");
    }
}
