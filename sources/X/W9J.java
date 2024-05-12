package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes15.dex */
public class W9J {
    public java.util.Map<C81828W9o, InterfaceC81842WAc> LIZ;
    public List<InterfaceC81843WAd> LIZIZ;

    public final void LIZ(C81828W9o c81828W9o, InterfaceC81843WAd interfaceC81843WAd, InterfaceC81842WAc interfaceC81842WAc) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        ((ArrayList) this.LIZIZ).add(interfaceC81843WAd);
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        ((HashMap) this.LIZ).put(c81828W9o, interfaceC81842WAc);
    }
}
