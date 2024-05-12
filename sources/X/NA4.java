package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NA4 extends NA3 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        Context context;
        NA2 na2 = (NA2) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC38263Ezz.LJ(InterfaceC71003Rtn.class);
        } else {
            interfaceC71003Rtn = null;
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            context = interfaceC38263Ezz2.getContext();
        } else {
            context = null;
        }
        PdpCardBridgeServiceImpl.LJI().LIZLLL(interfaceC71003Rtn, context, na2.getSchema(), na2.getParams());
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NA5.class, null), "");
    }
}
