package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86333a9 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI)};
    }

    public C86333a9(String searchKeyword, String displayKeyword, long j) {
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(displayKeyword, "displayKeyword");
        this.LJLIL = searchKeyword;
        this.LJLILLLLZI = displayKeyword;
        this.LJLJI = j;
    }
}
