package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ugk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77838Ugk extends AbstractC77839Ugl {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC77840Ugm interfaceC77840Ugm = (InterfaceC77840Ugm) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C73943T0h.LIZ().LIZIZ(new C1EV(interfaceC77840Ugm.getBannerID().longValue(), o.LJ(interfaceC77840Ugm.getStatus(), 1)));
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77841Ugn.class, null), "");
    }
}
