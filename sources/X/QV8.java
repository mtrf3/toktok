package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QV8 implements QVG<QVX> {
    @Override // X.QVG
    public final boolean LIZIZ(QVX flag) {
        o.LJIIJ(flag, "flag");
        if (flag == QVX.ACK) {
            return true;
        }
        return false;
    }

    @Override // X.QVG
    public final void LIZ(C67098QVa c67098QVa, List<QVZ> list) {
        InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
        for (QVZ qvz : list) {
            try {
                Long l = qvz.sync_id;
                o.LJFF(l, "it.sync_id");
                long longValue = l.longValue();
                Long l2 = qvz.new_cursor;
                o.LJFF(l2, "it.new_cursor");
                interfaceC67090QUs.LJIILIIL(longValue, l2.longValue());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        ((InterfaceC67064QTs) QPG.LIZ(InterfaceC67064QTs.class)).LJJLI();
    }
}
