package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQQ extends AbstractC65781Prl implements InterfaceC88472Yns<List<InterfaceC28215B5n>, C76800UCe> {
    public static final PQQ LJLIL = new PQQ();

    public PQQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<InterfaceC28215B5n> list) {
        List<InterfaceC28215B5n> addFluencyProcessor = list;
        o.LJIIIZ(addFluencyProcessor, "$this$addFluencyProcessor");
        addFluencyProcessor.add(new C64425PQf());
        addFluencyProcessor.add(new C64428PQi());
        addFluencyProcessor.add(new PQV());
        addFluencyProcessor.add(new PQY());
        return C76800UCe.LIZ;
    }
}
