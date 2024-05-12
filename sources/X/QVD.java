package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QVD implements QVG<QVF> {
    @Override // X.QVG
    public final boolean LIZIZ(QVF obj) {
        o.LJIIJ(obj, "obj");
        if (obj == QVF.HttpPoll) {
            return true;
        }
        return false;
    }

    @Override // X.QVG
    public final void LIZ(C67098QVa c67098QVa, List<QVZ> list) {
        C66629QCz.LIZJ("received http poll cmd, do http poll");
        ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJJJI(true);
    }
}
