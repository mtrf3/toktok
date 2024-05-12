package X;

import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YVM {
    public final InterfaceC30154BsU LIZ;

    public YVM(AbstractC30139BsF handler) {
        o.LJIIIZ(handler, "handler");
        this.LIZ = handler;
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 3);
        YVK yvk = new YVK(null);
        aqS181S0100000_15.invoke(yvk);
        STATE state = yvk.LIZ;
        if (state != 0) {
            new YVL(new YVJ(state, C113554cx.LJJLIIIJLLLLLLLZ(yvk.LIZIZ), ORZ.LLJI(yvk.LIZJ)));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
