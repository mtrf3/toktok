package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aBs, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92508aBs extends AbstractC92340a9A {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC92339a99.class, null);
        ((InterfaceC92339a99) LIZJ).setCode(1);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
        C2U8.LIZ(new C92214a78());
        C92006a3m.LIZ = null;
    }
}
