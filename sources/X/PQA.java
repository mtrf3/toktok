package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQA extends AbstractC65781Prl implements InterfaceC88472Yns<List<OSZ<? extends String, ? extends PQM>>, C76800UCe> {
    public static final PQA LJLIL = new PQA();

    public PQA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<OSZ<? extends String, ? extends PQM>> list) {
        List<OSZ<? extends String, ? extends PQM>> addFluencyTracerFactory = list;
        o.LJIIIZ(addFluencyTracerFactory, "$this$addFluencyTracerFactory");
        addFluencyTracerFactory.add(new OSZ<>("system_launch", new PQE()));
        return C76800UCe.LIZ;
    }
}
