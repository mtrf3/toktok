package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZ9 extends F9E {
    public final List<Object> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public MZ9(List<Object> items, boolean z, boolean z2) {
        o.LJIIIZ(items, "items");
        this.LJLIL = items;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
