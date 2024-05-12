package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPB extends AbstractC214518bP<InterfaceC42558Gn4> {
    public final /* synthetic */ LPI LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LPB(LPI lpi) {
        super(null);
        this.LIZIZ = lpi;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, InterfaceC42558Gn4 interfaceC42558Gn4, InterfaceC42558Gn4 interfaceC42558Gn42) {
        o.LJIIIZ(property, "property");
        LPI lpi = this.LIZIZ;
        if (lpi.LJLJJI && interfaceC42558Gn42 != null) {
            lpi.LJLJJI = false;
            Iterator<InterfaceC53742L7i> it = lpi.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL();
            }
        }
    }
}
