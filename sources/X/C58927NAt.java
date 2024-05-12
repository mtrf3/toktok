package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.a;
import kotlin.jvm.internal.o;

/* renamed from: X.NAt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58927NAt extends a {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        a.InterfaceC0002a interfaceC0002a = (a.InterfaceC0002a) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZIZ = interfaceC38263Ezz.LIZIZ()) == null) {
            return;
        }
        C2U8.LIZ(new N9D(this.LJLILLLLZI, LIZIZ, interfaceC0002a));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("containerID:");
        LIZ.append(LIZIZ);
        LIZ.append(", height: ");
        LIZ.append(interfaceC0002a.getSize().getHeight());
        LIZ.append(", width: ");
        LIZ.append(interfaceC0002a.getSize().getWidth());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }
}
