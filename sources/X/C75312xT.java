package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75312xT extends F9E {
    public final java.util.Map<String, List<String>> LJLIL;
    public final List<String> LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C75312xT() {
        this(new HashMap(), new ArrayList(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C75312xT(java.util.Map<String, ? extends List<String>> filter, List<String> category, String id) {
        o.LJIIJ(filter, "filter");
        o.LJIIJ(category, "category");
        o.LJIIJ(id, "id");
        this.LJLIL = filter;
        this.LJLILLLLZI = category;
        this.LJLJI = id;
    }
}
