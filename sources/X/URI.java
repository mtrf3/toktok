package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URI implements USJ {
    public final boolean LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;

    public URI() {
        boolean LIZ = URL.LIZ();
        C66552jL isLogin = C66552jL.LJLIL;
        o.LJIIIZ(isLogin, "isLogin");
        this.LIZ = LIZ;
        this.LIZIZ = isLogin;
    }

    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        EnumC77147UPn enumC77147UPn = EnumC77147UPn.EMAIL;
        if (!UPL.LIZ(enumC77147UPn)) {
            arrayList.add(enumC77147UPn);
        }
        if (this.LIZIZ.invoke().booleanValue() && this.LIZ && (!arrayList.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        return URP.L(c77208URw.LJLILLLLZI, z, null, null, arrayList, false, null, null, 118);
    }
}
