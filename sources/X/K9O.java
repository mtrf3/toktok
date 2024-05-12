package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9O extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public K9O(String keyword, boolean z) {
        o.LJIIIZ(keyword, "keyword");
        this.LJLIL = keyword;
        this.LJLILLLLZI = z;
    }
}
