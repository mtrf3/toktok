package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXM extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public UXM(long j, String keyword, String giftFullName, boolean z) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(giftFullName, "giftFullName");
        this.LJLIL = keyword;
        this.LJLILLLLZI = j;
        this.LJLJI = giftFullName;
        this.LJLJJI = z;
    }
}
