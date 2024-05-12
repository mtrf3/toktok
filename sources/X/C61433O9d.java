package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.O9d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61433O9d extends AbstractC61434O9e {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        OGE oge;
        InterfaceC61435O9f interfaceC61435O9f = (InterfaceC61435O9f) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            oge = (OGE) interfaceC38263Ezz.LJ(OGE.class);
        } else {
            oge = null;
        }
        String LIZ = PdpCardBridgeServiceImpl.LJI().LIZ(oge, interfaceC61435O9f.getBrickName().intValue());
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC61436O9g.class, null);
        ((InterfaceC61436O9g) LIZJ).setRawData(LIZ);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
