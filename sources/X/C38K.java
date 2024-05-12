package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.38K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38K extends F9E {
    public final List<C38T> LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public /* synthetic */ C38K(int i) {
        this(C47261Igj.LJJIJIIJI(C38T.MAF, C38T.SORTED_MAF), 30, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38K(List<? extends C38T> types, int i, String pageToken) {
        o.LJIIIZ(types, "types");
        o.LJIIIZ(pageToken, "pageToken");
        this.LJLIL = types;
        this.LJLILLLLZI = i;
        this.LJLJI = pageToken;
    }
}
