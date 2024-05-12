package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YNF extends F9E {
    public List<String> LJLIL;
    public final boolean LJLILLLLZI;
    public final List<String> LJLJI;

    public YNF() {
        this(null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public YNF(Object obj) {
        C61878OQg enterFromList = C61878OQg.INSTANCE;
        o.LJIIIZ(enterFromList, "eventList");
        o.LJIIIZ(enterFromList, "enterFromList");
        this.LJLIL = enterFromList;
        this.LJLILLLLZI = false;
        this.LJLJI = enterFromList;
    }
}
