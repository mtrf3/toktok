package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A4 implements C0DU {
    public final int LJLIL;
    public final List<C1A4> LJLILLLLZI;
    public Float LJLJI;
    public Float LJLJJI;
    public C0QX LJLJJL;
    public C0QX LJLJJLL;

    @Override // X.C0DU
    public final boolean isValid() {
        return this.LJLILLLLZI.contains(this);
    }

    public C1A4(int i, List allScopes) {
        o.LJIIIZ(allScopes, "allScopes");
        this.LJLIL = i;
        this.LJLILLLLZI = allScopes;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
    }
}
