package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SqS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73344SqS extends F9E {
    public final List<Object> LJLIL;
    public final List<OSZ<Object, List<Object>>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C73344SqS(List<Object> list, List<? extends OSZ<Object, ? extends List<Object>>> table) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(table, "table");
        this.LJLIL = list;
        this.LJLILLLLZI = table;
    }
}
