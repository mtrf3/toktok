package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.n;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9E extends n {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZIZ = interfaceC38263Ezz.LIZIZ()) == null) {
            return;
        }
        C2U8.LIZ(new N9D(this.LJLILLLLZI, LIZIZ, xBaseParamModel));
    }
}