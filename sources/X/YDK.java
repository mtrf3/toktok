package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YDK extends YDL {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        YDP ydp = (YDP) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (C51751KSt.LIZ.LIZLLL(ydp.getKey(), ydp.getData())) {
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(YDV.class, null), "");
        } else {
            C31626Cb8.LIZ(c37356ElM, 0, "ec_mall_save_cache fail", 4);
        }
    }
}
