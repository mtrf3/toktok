package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N81 extends N80 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        long longValue = ((N82) xBaseParamModel).getStayTime().longValue();
        if (longValue == 0) {
            return;
        }
        C2U8.LIZ(new C61212aj(longValue));
    }
}
