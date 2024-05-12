package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2I implements N2K {
    public final /* synthetic */ WeakReference<InterfaceC58334Muw> LIZ;

    public N2I(WeakReference<InterfaceC58334Muw> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // X.N2K
    public final void LIZ(String businessId) {
        o.LJIIIZ(businessId, "businessId");
        InterfaceC58334Muw interfaceC58334Muw = this.LIZ.get();
        if (interfaceC58334Muw != null) {
            interfaceC58334Muw.LIZ(businessId);
        }
    }

    @Override // X.N2K
    public final void LIZIZ(String businessId, java.util.Map<String, String> map) {
        o.LJIIIZ(businessId, "businessId");
        InterfaceC58334Muw interfaceC58334Muw = this.LIZ.get();
        if (interfaceC58334Muw != null) {
            interfaceC58334Muw.LIZIZ(businessId, map);
        }
    }
}
