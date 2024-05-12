package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URG implements URK {
    public final Keva LIZ;
    public final boolean LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;

    public URG(int i) {
        Keva keva = UQ2.LIZ().LIZ;
        o.LJIIIIZZ(keva, "PermissionDialogKeva.instance.keva");
        boolean LIZ = URL.LIZ();
        C66542jK isLogin = C66542jK.LJLIL;
        o.LJIIIZ(isLogin, "isLogin");
        this.LIZ = keva;
        this.LIZIZ = LIZ;
        this.LIZJ = isLogin;
    }

    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        boolean z;
        List<EnumC77147UPn> list = c77208URw.LJLILLLLZI.LJLJJI;
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC77147UPn> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            EnumC77147UPn next = it.next();
            if (!UPL.LIZ(next)) {
                arrayList.add(next);
            } else {
                this.LIZ.storeBoolean(URH.LIZ(next), true);
            }
        }
        if (arrayList.isEmpty()) {
            this.LIZ.storeBoolean("has_go_through_process", true);
        }
        if (!this.LIZJ.invoke().booleanValue() || !this.LIZIZ || !(!arrayList.isEmpty())) {
            z = false;
        }
        return URP.L(c77208URw.LJLILLLLZI, z, null, null, arrayList, false, null, null, 118);
    }
}
