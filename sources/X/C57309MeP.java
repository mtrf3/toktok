package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MeP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57309MeP extends F9E {
    public final /* synthetic */ int LJLIL = 1;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            case 1:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
        }
    }

    public C57309MeP(SYL list, C187957Zf c187957Zf) {
        o.LJIIIZ(list, "list");
        this.LJLILLLLZI = list;
        this.LJLJI = c187957Zf;
    }

    public C57309MeP(List list, EnumC199577sP policy) {
        o.LJIIIZ(policy, "policy");
        this.LJLILLLLZI = list;
        this.LJLJI = policy;
    }

    public C57309MeP(String str, String str2) {
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
