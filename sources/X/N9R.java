package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9R extends N9P {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        String LIZ = PII.LIZ();
        XBaseModel LIZJ = ED5.LIZJ(N9Q.class, null);
        ((N9Q) LIZJ).setNetworkTraceparent(LIZ);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
