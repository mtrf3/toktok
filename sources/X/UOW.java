package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOW extends F9E {
    public final UOQ LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public UOW(UOQ operation, String id) {
        o.LJIIIZ(operation, "operation");
        o.LJIIIZ(id, "id");
        this.LJLIL = operation;
        this.LJLILLLLZI = id;
    }
}
