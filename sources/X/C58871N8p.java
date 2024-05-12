package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.N8p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58871N8p extends AbstractC58868N8m {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        C70342Rj8 c70342Rj8;
        InterfaceC58869N8n interfaceC58869N8n = (InterfaceC58869N8n) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (!o.LJ(EF7.LJIILIIL, "local_test")) {
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC58866N8k.class, null);
            ((InterfaceC58866N8k) LIZJ).setCode(1);
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "is not debug mode");
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (c70342Rj8 = (C70342Rj8) interfaceC38263Ezz.LJ(C70342Rj8.class)) == null) {
            c37356ElM.onFailure(0, "node is null", null);
            return;
        }
        String pageName = interfaceC58869N8n.getPageName();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC58870N8o interfaceC58870N8o : interfaceC58869N8n.getDebugBtn()) {
            arrayList.add(new OSZ(interfaceC58870N8o.getTitle(), interfaceC58870N8o.getSchema()));
        }
        java.util.Map<String, Object> extraData = interfaceC58869N8n.getExtraData();
        c70342Rj8.LJLIL = pageName;
        C70858RrS c70858RrS = new C70858RrS();
        C78915Uy7.LJJIL(c70858RrS, new AqS170S0100000_4(extraData, (java.util.Map<Integer, String>) 941));
        C78915Uy7.LJJIZ(c70858RrS, "lib_track_builtin_lane_param_pass", new AqS170S0100000_4(arrayList, (List<? extends Object>) 942));
        c70342Rj8.LJLILLLLZI = c70858RrS;
        XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC58866N8k.class, null);
        ((InterfaceC58866N8k) LIZJ2).setCode(1);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ2, "");
    }
}
