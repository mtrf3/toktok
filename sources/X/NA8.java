package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NA8 extends NA9 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        NA7 na7 = (NA7) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC38263Ezz.LJ(InterfaceC71003Rtn.class);
        } else {
            interfaceC71003Rtn = null;
        }
        PdpCardBridgeServiceImpl.LJI().LJFF(interfaceC71003Rtn, na7.getEventName(), na7.getParams());
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NAA.class, null), "");
    }
}
