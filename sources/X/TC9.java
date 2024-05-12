package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TC9 extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public TC9(String keyword, int i, String awemeId) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = keyword;
        this.LJLILLLLZI = i;
        this.LJLJI = awemeId;
    }
}
