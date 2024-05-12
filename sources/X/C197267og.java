package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197267og extends F9E {
    public final List<Object> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C197267og() {
        this(C61878OQg.INSTANCE, 0);
    }

    public C197267og(List<? extends Object> srcList, int i) {
        o.LJIIIZ(srcList, "srcList");
        this.LJLIL = srcList;
        this.LJLILLLLZI = i;
    }
}
