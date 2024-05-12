package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3a8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86323a8 extends F9E {
    public final String LJLIL;
    public final List<Object> LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C86323a8(int i, long j, String displayKeyword, List searchResultItemList) {
        o.LJIIIZ(displayKeyword, "displayKeyword");
        o.LJIIIZ(searchResultItemList, "searchResultItemList");
        this.LJLIL = displayKeyword;
        this.LJLILLLLZI = searchResultItemList;
        this.LJLJI = j;
        this.LJLJJI = i;
    }
}
