package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YDO extends YDI {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        String LIZ = C56023Lyl.LIZ.LIZ(((YDT) xBaseParamModel).getKey());
        XBaseModel LIZJ = ED5.LIZJ(YDU.class, null);
        ((YDU) LIZJ).setData(LIZ);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
