package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQP extends AbstractC65781Prl implements InterfaceC88472Yns<List<PQN>, C76800UCe> {
    public static final PQP LJLIL = new PQP();

    public PQP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<PQN> list) {
        List<PQN> addObserver = list;
        o.LJIIIZ(addObserver, "$this$addObserver");
        addObserver.add(new PRO());
        addObserver.add(new C64426PQg());
        addObserver.add(new PRE());
        addObserver.add(new C64420PQa());
        return C76800UCe.LIZ;
    }
}
