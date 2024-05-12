package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS447S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32531Pl implements InterfaceC10220ag {
    public final C1RJ<C32521Pk> LIZ;
    public final C1RJ LIZIZ;

    public C32531Pl() {
        C1RJ<C32521Pk> c1rj = new C1RJ<>();
        this.LIZ = c1rj;
        this.LIZIZ = c1rj;
    }

    @Override // X.InterfaceC10220ag
    public final void LIZ(Object obj, Object obj2, C40431iJ content) {
        IDqS416S0100000 iDqS416S0100000;
        o.LJIIIZ(content, "content");
        C1RJ<C32521Pk> c1rj = this.LIZ;
        if (obj != null) {
            iDqS416S0100000 = new IDqS416S0100000(obj, (Object) 193);
        } else {
            iDqS416S0100000 = null;
        }
        c1rj.LIZ(1, new C32521Pk(iDqS416S0100000, new IDqS416S0100000(obj2, (Object) 194), C1DJ.LJFF(new IDqS447S0100000(content, 0), -735119482, true)));
    }

    @Override // X.InterfaceC10220ag
    public final void LIZIZ(int i, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns contentType, C40431iJ itemContent) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(itemContent, "itemContent");
        this.LIZ.LIZ(i, new C32521Pk(interfaceC88472Yns, contentType, itemContent));
    }
}
