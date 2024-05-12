package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86033Zf extends F9E {
    public final List<C86023Ze> LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI};
    }

    public C86033Zf(int i, String businessID, String displayKeyword, List list) {
        o.LJIIIZ(businessID, "businessID");
        o.LJIIIZ(displayKeyword, "displayKeyword");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = businessID;
        this.LJLJJI = displayKeyword;
    }
}
