package X;

import Y.ARunnableS38S0100000_2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;

/* renamed from: X.Ws5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83637Ws5 implements InterfaceC83706WtC<C83644WsC> {
    public final List<InterfaceC83710WtG> LIZ = new ArrayList();

    public final void LIZ(C83644WsC c83644WsC) {
        String c83644WsC2 = c83644WsC.toString();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiManagement: dispatch SensitiveApiEvent: ");
        LIZ.append(c83644WsC2);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        C6QQ.LIZ.post(new ARunnableS38S0100000_2(new AqS161S0200000_14(this, c83644WsC, 49), (InterfaceC65784Pro<C76800UCe>) 144));
    }
}
