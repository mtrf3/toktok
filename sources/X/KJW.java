package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.b;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJW extends b {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        b.a aVar = (b.a) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZIZ = interfaceC38263Ezz.LIZIZ()) == null) {
            return;
        }
        int intValue = aVar.getStatus().intValue();
        C58977NCr.LLD.put(LIZIZ, Integer.valueOf(aVar.getStatus().intValue()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("containerID:");
        LIZ.append(LIZIZ);
        LIZ.append(", status:");
        LIZ.append(intValue);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }
}
