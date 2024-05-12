package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y3L extends AbstractC65781Prl implements InterfaceC88472Yns<Y3H<Y1Y, Y3X>, C76800UCe> {
    public static final Y3L LJLIL = new Y3L();

    public Y3L() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Y3H<Y1Y, Y3X> y3h) {
        Y3H<Y1Y, Y3X> onEvent = y3h;
        o.LJIIIZ(onEvent, "$this$onEvent");
        onEvent.LIZJ = C86768Y3o.LIZIZ;
        onEvent.LIZIZ = C65352Pkq.LIZ(Y0Y.class);
        Y3G action = Y3G.LJLIL;
        o.LJIIIZ(action, "action");
        ((ArrayList) onEvent.LIZLLL).add(action);
        return C76800UCe.LIZ;
    }
}
