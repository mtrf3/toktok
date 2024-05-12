package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119054lp extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C119054lp(String categoryId, String categoryName) {
        o.LJIIIZ(categoryId, "categoryId");
        o.LJIIIZ(categoryName, "categoryName");
        this.LJLIL = categoryId;
        this.LJLILLLLZI = categoryName;
    }
}
