package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class JEL implements InterfaceC48809JDp {
    public final /* synthetic */ JEK LIZ;
    public final /* synthetic */ JEG LIZIZ;

    @Override // X.InterfaceC48809JDp
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC48809JDp
    public final void LIZ() {
        Iterator it = ((ArrayList) this.LIZ.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) it.next();
            if (interfaceC79150V4o.isActive()) {
                interfaceC79150V4o.LIZIZ(null);
            }
        }
        ((ArrayList) this.LIZIZ.LJI).remove(this);
    }

    public JEL(JEK jek, JEG jeg) {
        this.LIZ = jek;
        this.LIZIZ = jeg;
    }
}
