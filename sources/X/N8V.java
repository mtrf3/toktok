package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N8V extends N8R {
    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final void release() {
        NDO.LJLIL.LIZ();
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || interfaceC38263Ezz.getContext() == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "context is null!!", 4);
            return;
        }
        NDO.LJLIL.LIZ();
        XBaseModel LIZJ = ED5.LIZJ(N8U.class, null);
        N8U n8u = (N8U) LIZJ;
        n8u.setCode(1);
        n8u.setMsg("stop accelerometer success.");
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "stop accelerometer success.");
    }
}
