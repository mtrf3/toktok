package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aBt, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92509aBt extends AbstractC92343a9D {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        String LIZJ = C91894a1y.LIZJ();
        if (LIZJ.length() > 0) {
            XBaseModel LJIILJJIL = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC92342a9C.class));
            ((InterfaceC92342a9C) LJIILJJIL).setRiskInfo(LIZJ);
            c37356ElM.onSuccess((XBaseResultModel) LJIILJJIL, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "risk info is empty", 4);
    }
}
