package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Epu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37638Epu extends AbstractC37553EoX {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC38263Ezz.LJ(InterfaceC71003Rtn.class);
        } else {
            interfaceC71003Rtn = null;
        }
        HashMap<String, Object> LIZJ = PdpCardBridgeServiceImpl.LJI().LIZJ(interfaceC71003Rtn);
        XBaseModel LIZJ2 = ED5.LIZJ(EX7.class, null);
        ((EX7) LIZJ2).setData(LIZJ);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ2, "");
    }
}
